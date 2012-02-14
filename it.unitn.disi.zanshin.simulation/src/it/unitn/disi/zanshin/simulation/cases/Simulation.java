package it.unitn.disi.zanshin.simulation.cases;

import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.simulation.internal.services.Controller;

/**
 * Interface for simulations of adaptation scenarios.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Simulation {
	/** Prefix for the configuration of the simulation cases. */
	public static final String PROPERTIES_CASES_PREFIX = "cases."; //$NON-NLS-1$

	/** Suffix for the configuration of a simulation's name. */
	public static final String PROPERTIES_CASES_NAME = ".name"; //$NON-NLS-1$

	/** Suffix for the configuration of a simulation's class. */
	public static final String PROPERTIES_CASES_SIMULATION_CLASS = ".simulationClass"; //$NON-NLS-1$

	/** Suffix for the configuration of a simulation's controller class. */
	public static final String PROPERTIES_CASES_CONTROLLER_CLASS = ".controllerClass"; //$NON-NLS-1$

	/** Suffix for the configuration of a simulation's monitor class. */
	public static final String PROPERTIES_CASES_MONITOR_CLASS = ".monitorClass"; //$NON-NLS-1$

	/**
	 * Returns the name of the simulation, which is used in logging messages.
	 * 
	 * @return The name of the simulation, as specified in the .properties file.
	 */
	String getName();

	/**
	 * Returns the controller instance associated with the simulation, which is injected in the target system controller
	 * so the actions are specific to the current running simulation.
	 * 
	 * @return The instance of the controller.
	 */
	Controller getController();

	/**
	 * Returns the simulated monitor.
	 * 
	 * @return The simulated monitor for this simulation.
	 */
	IMonitoringService getSimulatedMonitor();

	/**
	 * Initializes the simulation.
	 * 
	 * @param name
	 *          The simulation's name.
	 * @param controller
	 *          The controller instance for this simulation.
	 * 
	 * @param simulatedMonitor
	 *          The simulated monitor for this simulation.
	 * 
	 * @throws Exception
	 *           If anything goes wrong during the initialization.
	 */
	void init(String name, Controller controller, IMonitoringService simulatedMonitor) throws Exception;

	/**
	 * Runs the next part of the simulation.
	 * 
	 * @throws Exception
	 *           If anything goes wrong during the simulation.
	 */
	void runNextPart() throws Exception;

	/**
	 * Indicates if this simulation has finished.
	 * 
	 * @return <code>true</code> if there's nothing else to run, <code>false</code> otherwise.
	 */
	boolean hasFinished();

	/**
	 * Indicates if the simulation should wait to be awaken by another thread or if it can continue on its own.
	 * 
	 * @return <code>true</code> if the simulation should wait, <code>false</code> otherwise.
	 */
	boolean shouldWait();
}
