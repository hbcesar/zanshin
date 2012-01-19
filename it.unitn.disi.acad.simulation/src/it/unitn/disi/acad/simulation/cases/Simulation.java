package it.unitn.disi.acad.simulation.cases;

/**
 * Interface for simulations of adaptivity scenarios.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Simulation {
	/**
	 * Runs the simulation.
	 * 
	 * @throws Exception
	 *           If anything goes wrong during the simulation.
	 */
	void run() throws Exception;
}
