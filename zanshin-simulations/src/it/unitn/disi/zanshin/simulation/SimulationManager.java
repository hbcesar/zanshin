package it.unitn.disi.zanshin.simulation;

import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_NAME;
import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_PREFIX;
import static it.unitn.disi.zanshin.simulation.cases.Simulation.PROPERTIES_CASES_SIMULATION_CLASS;
import it.unitn.disi.zanshin.remote.IZanshinServer;
import it.unitn.disi.zanshin.remote.ZanshinRemote;
import it.unitn.disi.zanshin.simulation.cases.Simulation;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 * Object that manages the simulations defined in the configuration file.
 * 
 * The manager reads the properties object supplied for its construction, creates the <code>Simulation</code> objects
 * with the information from this configuration and populates the list of <code>simulations</code> with these objects.
 * Then, when the <code>runSimulations()</code> method is called, the manager runs all simulations from the list, in the
 * order they appear, or one particular simulation at a time.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class SimulationManager {
	/** The logger. */
	private static final Logger log = new Logger(SimulationManager.class);

	/** Time (in milliseconds) to wait between simulations. */
	private static final int TIME_TO_WAIT = 1000;

	/** TODO: document this field. */
	private static final String REMOTE_SERVER_ADDRESS = "127.0.0.1"; //$NON-NLS-1$

	/** Map of simulations, indexed by their numbers. */
	private Map<Integer, Simulation> simulations = new TreeMap<>();

	/** TODO: document this field. */
	private static ZanshinRemote zanshin;

	/**
	 * Constructor. Receives the simulation properties with the name of the simulation classes to load and loads all
	 * configured simulations.
	 */
	public SimulationManager(Properties props) throws Exception {
		// Connects to Zanshin.
		zanshin = new ZanshinRemote(REMOTE_SERVER_ADDRESS, IZanshinServer.RMI_PORT);
		
		// Loads all simulations listed in the properties and place them in the list.
		for (int num = 1; true; num++) {
			try {
				loadSimulation(num, props);
			}

			// When the configuration key for the current number doesn't exist, stop loading.
			catch (IllegalArgumentException e) {
				break;
			}
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param simulationNumber
	 * @param props
	 * @throws Exception
	 */
	private void loadSimulation(Integer simulationNumber, Properties props) throws Exception {
		String name = props.getProperty(PROPERTIES_CASES_PREFIX + simulationNumber + PROPERTIES_CASES_NAME);
		String simulationClass = props.getProperty(PROPERTIES_CASES_PREFIX + simulationNumber + PROPERTIES_CASES_SIMULATION_CLASS);

		if ((name != null) && (simulationClass != null)) {
			log.debug("Loading simulation # {0}: {1}", simulationNumber, simulationClass); //$NON-NLS-1$

			// Loads the simulation class given its name and creates a new instance.
			@SuppressWarnings("unchecked")
			Class<? extends Simulation> simulationClazz = (Class<? extends Simulation>) Class.forName(simulationClass);
			Simulation simulation = simulationClazz.newInstance();

			// Initializes the simulation.
			log.debug("Initializing simulation # {0}: {1}", simulationNumber, simulation); //$NON-NLS-1$
			simulation.init(name, zanshin);

			// Adds the simulation instance to the map of simulations, indexed by their number.
			simulations.put(simulationNumber, simulation);
			log.info("Simulation # {0} loaded successfully: {1}", simulationNumber, name); //$NON-NLS-1$
		}

		// When the property associated with the specified number is not found, throw an exception.
		else throw new IllegalArgumentException(String.format("Simulation %d has not been properly configured. Check your simulation.properties file.", simulationNumber)); //$NON-NLS-1$
	}

	/**
	 * Runs all simulations that were loaded.
	 */
	public void runAll() {
		log.info("Running all simulations..."); //$NON-NLS-1$

		try {
			// Runs all the simulations.
			for (Simulation simulation : simulations.values())
				run(simulation);
		}
		catch (InterruptedException e) {
			log.error("The simulation thread was interrupted!", e); //$NON-NLS-1$
		}

		log.info("Finished running all simulations."); //$NON-NLS-1$
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
		if (!simulations.containsKey(simulationNumber))
			throw new IllegalArgumentException("" + simulationNumber); //$NON-NLS-1$

		// Obtains the simulation from the map and runs it.
		Simulation simulation = simulations.get(simulationNumber);
		try {
			run(simulation);
		}
		catch (InterruptedException e) {
			log.error("The simulation thread was interrupted!", e); //$NON-NLS-1$
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
		log.info("Running simulation: {0}", name); //$NON-NLS-1$

		// Runs the simulation until it has finished or until an error is found.
		while (!simulation.hasFinished()) {
			// When activated, runs the next part of the current simulation.
			try {
				log.debug("({0}) Running the next part of simulation...", name); //$NON-NLS-1$
				simulation.runNextPart();
			}
			catch (Exception e) {
				log.error("({0}) An error occurred. Skipping to the next simulation.", e, name); //$NON-NLS-1$
				break;
			}

			// Checks if the simulation should wait.
			if (simulation.shouldWait()) {
				// Yes. Wait for further orders.
				log.debug("({0}) Simulation part ran successfully. Will wait for further instructions...", name); //$NON-NLS-1$
				synchronized (this) {
					wait();
				}
			}
			else {
				// No. Just wait for a second so the threads can sync.
				log.debug("({0}) Simulation part ran successfully. Waiting for {1} second before continuing...", name, TIME_TO_WAIT / 1000); //$NON-NLS-1$
				Thread.sleep(TIME_TO_WAIT);
			}
		}

		log.info("({0}) Simulation has finished (no more parts to run).", name); //$NON-NLS-1$
	}
}
