package it.unitn.disi.acad.simulation.cases;

/**
 * Interface for simulations of adaptation scenarios.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Simulation {
	/** Prefix for the configuration of the simulation cases. */
	public static final String PROPERTIES_CASES_PREFIX = "cases."; //$NON-NLS-1$
	
	/** Suffix for the configuration of the simulation cases package. */
	public static final String PROPERTIES_CASES_PACKAGE = "package"; //$NON-NLS-1$
	
	/** Suffix for the configuration of a simulation's name. */
	public static final String PROPERTIES_CASES_NAME = ".name"; //$NON-NLS-1$
	
	/** Suffix for the configuration of a simulation's class. */
	public static final String PROPERTIES_CASES_CLASS = ".class"; //$NON-NLS-1$
	
	/**
	 * Initializes the simulation.
	 * 
	 * @throws Exception
	 *           If anything goes wrong during the initialization.
	 */
	void init() throws Exception;

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
}
