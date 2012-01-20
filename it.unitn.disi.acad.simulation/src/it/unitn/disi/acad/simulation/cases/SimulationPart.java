package it.unitn.disi.acad.simulation.cases;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface SimulationPart {
	/**
	 * TODO: document this method.
	 * @throws Exception
	 */
	void run() throws Exception;
	
	/**
	 * TODO: document this method.
	 * @return
	 */
	boolean shouldWait();
}
