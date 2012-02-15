package it.unitn.disi.zanshin.simulation;

import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_CONTROLLER_CLASS;
import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_MONITOR_CLASS;
import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_NAME;
import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_PREFIX;
import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_SIMULATION_CLASS;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;
import it.unitn.disi.zanshin.simulation.cases.Simulation;
import it.unitn.disi.zanshin.simulation.internal.services.SimulatedController;
import it.unitn.disi.zanshin.simulation.internal.services.SimulationTargetSystemControllerService;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 * Object that manages the simulations that should be run by the simulation bundle.
 * 
 * The manager reads the properties object supplied for its construction, creates the <code>Simulation</code> objects
 * with the information from this configuration and populates the list of <code>simulations</code> with these objects.
 * Then, when the <code>runSimulations()</code> method is called, the manager runs all simulations from the list, in the
 * order they appear.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class SimulationManager {
	/** Time (in milliseconds) to wait between simulations. */
	private static final int TIME_TO_WAIT = 1000;

	/** The target system controller service registered in the platform. */
	private ITargetSystemControllerService controllerService;

	/** The monitoring service registered in the platform. */
	private IMonitoringService monitoringService;
	
	/** Map of simulations, indexed by their numbers. */
	private Map<Integer, Simulation> simulations = new TreeMap<>();

	/** Constructor. Receives the simulation properties with the name of the simulation classes to load. */
	public SimulationManager(Properties props, ITargetSystemControllerService controllerService, IMonitoringService monitoringService) {
		this.controllerService = controllerService;
		this.monitoringService = monitoringService;
		
		// Loads all simulations listed in the properties and place them in the list.
		for (int num = 1; true; num++) {
			String name = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_NAME);
			String simulationClass = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_SIMULATION_CLASS);
			String controllerClass = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_CONTROLLER_CLASS);
			String monitorClass = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_MONITOR_CLASS);

			if ((name != null) && (simulationClass != null) && (controllerClass != null)) {
				SimulationUtils.log.debug("Loading simulation # {0}: {1}", num, simulationClass); //$NON-NLS-1$
				
				try {
					// Loads the simulation class given its name and creates a new instance.
					@SuppressWarnings("unchecked")
					Class<? extends Simulation> simulationClazz = (Class<? extends Simulation>) Class.forName(simulationClass);
					Simulation simulation = simulationClazz.newInstance();
					
					// Loads the controller class given its name and creates a new instance.
					@SuppressWarnings("unchecked")
					Class<? extends SimulatedController> controllerClazz = (Class<? extends SimulatedController>) Class.forName(controllerClass);
					SimulatedController controller = controllerClazz.newInstance();
					
					// Loads the monitor class given its name and creates a new instance.
					@SuppressWarnings("unchecked")
					Class<? extends IMonitoringService> monitorClazz = (Class<? extends IMonitoringService>) Class.forName(monitorClass);
					IMonitoringService simulatedMonitor = monitorClazz.newInstance();

					// Initializes the simulation.
					SimulationUtils.log.debug("Initializing simulation # {0}: {1}", num, simulation); //$NON-NLS-1$
					simulation.init(name, controller, simulatedMonitor);

					// Adds the simulation instance to the map of simulations, indexed by their number.
					simulations.put(num, simulation);
					SimulationUtils.log.info("Simulation # {0} loaded successfully: {1}", num, name); //$NON-NLS-1$
				}

				// In case of problems, display an error message but proceed with the other simulations.
				catch (Exception e) {
					SimulationUtils.log.error("Could not load simulation # {0}: {1}", e, num, name); //$NON-NLS-1$
				}
			}

			// When the property associated with the specified number is not found, break out of the loop.
			else break;
		}
	}

	/** Setter for controllerService. */
	protected void setControllerService(ITargetSystemControllerService controllerService) {
		this.controllerService = controllerService;
	}

	/**
	 * Runs all simulations that were loaded.
	 */
	public void runAll() {
		SimulationUtils.log.info("Running all simulations..."); //$NON-NLS-1$

		try {
			// Runs all the simulations.
			for (Simulation simulation : simulations.values())
				run(simulation);
		}
		catch (InterruptedException e) {
			SimulationUtils.log.error("The simulation thread was interrupted!", e); //$NON-NLS-1$
		}

		SimulationUtils.log.info("Finished running all simulations."); //$NON-NLS-1$
	}

	/**
	 * Runs a specific simulation, given its number.
	 * 
	 * @param simulationNumber
	 *          The number of the simulation to run.
	 * @throws IllegalArgumentException
	 *           If the number does not correspond to a simulation, according to the configuration read.
	 */
	public void run(Integer simulationNumber) throws IllegalArgumentException {
		// Checks if there is a simulation with this number.
		if (! simulations.containsKey(simulationNumber)) throw new IllegalArgumentException("" + simulationNumber); //$NON-NLS-1$
		
		// Obtains the simulation from the map and runs it.
		Simulation simulation = simulations.get(simulationNumber);
		try {
			run(simulation);
		}
		catch (InterruptedException e) {
			SimulationUtils.log.error("The simulation thread was interrupted!", e); //$NON-NLS-1$
		}
	}

	/**
	 * Runs the given simulation.
	 * 
	 * @param simulation
	 *          The simulation to run.
	 * @throws InterruptedException
	 *           Thrown if the simulation thread is interrupted.
	 */
	private void run(Simulation simulation) throws InterruptedException {
		String name = simulation.getName();
		SimulationUtils.log.info("Running simulation: {0}", name); //$NON-NLS-1$
		
		// Checks if everything is OK to run this simulation.
		if (controllerService == null) {
			SimulationUtils.log.error("({0}) Cannot execute simulation: the controller service has not been set in the simulation manager.", name); //$NON-NLS-1$
			return;
		}
		SimulatedController controller = simulation.getController();
		if (controller == null) {
			SimulationUtils.log.error("({0}) Cannot execute simulation: a controller was not set for this simulation.", name); //$NON-NLS-1$
			return;
		}
		if (! (controllerService instanceof SimulationTargetSystemControllerService)) {
			SimulationUtils.log.error("({0}) Cannot execute simulation: the target system controller service from the simulation bundle is not being used.", name); //$NON-NLS-1$
			return;
		}
		if (monitoringService == null) {
			SimulationUtils.log.error("({0}) Cannot execute simulation: the monitoring service has not been set in the simulation manager.", name); //$NON-NLS-1$
			return;
		}
		IMonitoringService simulatedMonitor = simulation.getSimulatedMonitor();
		if (simulatedMonitor == null) {
			SimulationUtils.log.error("({0}) Cannot execute simulation: a simulated monitor was not set for this simulation.", name); //$NON-NLS-1$
			return;
		}
		
		// Changes the specific controller in the target system controller with the one that belongs to this simulation.
		SimulationUtils.log.info("Changing the controller to: {0}", controller.getClass().getCanonicalName()); //$NON-NLS-1$
		SimulationTargetSystemControllerService service = (SimulationTargetSystemControllerService) controllerService;
		service.setController(controller);
		
		// Changes the simulated monitor in the monitoring service with the one that belongs to this simulation.
		SimulationUtils.log.info("Changing the simulated monitoring to: {0}", simulatedMonitor.getClass().getCanonicalName()); //$NON-NLS-1$
		monitoringService.setSimulatedMonitor(simulatedMonitor);
		
		// Runs the simulation until it has finished or until an error is found.
		while (!simulation.hasFinished()) {
			// When activated, runs the next part of the current simulation.
			try {
				SimulationUtils.log.debug("({0}) Running the next part of simulation...", name); //$NON-NLS-1$
				simulation.runNextPart();
			}
			catch (Exception e) {
				SimulationUtils.log.error("({0}) An error occurred. Skipping to the next simulation.", e, name); //$NON-NLS-1$
				break;
			}

			// Checks if the simulation should wait.
			if (simulation.shouldWait()) {
				// Yes. Wait for further orders.
				SimulationUtils.log.debug("({0}) Simulation part ran successfully. Will wait for further instructions...", name); //$NON-NLS-1$
				synchronized (this) {
					wait();
				}
			}
			else {
				// No. Just wait for a second so the threads can sync.
				SimulationUtils.log.debug("({0}) Simulation part ran successfully. Waiting for {1} second before continuing...", name, TIME_TO_WAIT / 1000); //$NON-NLS-1$
				Thread.sleep(TIME_TO_WAIT);
			}
		}

		SimulationUtils.log.info("({0}) Simulation has finished (no more parts to run).", name); //$NON-NLS-1$
	}
}
