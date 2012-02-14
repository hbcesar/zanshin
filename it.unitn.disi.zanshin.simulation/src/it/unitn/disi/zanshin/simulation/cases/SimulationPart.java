package it.unitn.disi.zanshin.simulation.cases;

/**
 * Interface for simulation parts, which is used by the abstract simulation implementation.
 * 
 * Simulation parts should implement two methods: one that contains the simulation actions (<code>run()</code>) and one
 * that indicates if the simulation should wait to be awaken after this part ends or if it can proceed directly to the
 * next part of the simulation (<code>shouldWait()</code>).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface SimulationPart {
	/**
	 * Method that implements the simulation actions, i.e., part of the simulation itself.
	 * 
	 * @throws Exception
	 *           If anything wrong happens during the simulation. Simulations are free to do virtually anything, so any
	 *           kind of exception can be thrown.
	 */
	void run() throws Exception;

	/**
	 * Indicates if the simulation should wait to be awaken after this part ends or if it can proceed directly to the next
	 * part. Should be implemented by the concrete class that represents the simulation part, as this decision is highly
	 * dependent on the type of simulation.
	 * 
	 * @return <code>true</code> if the simulation should wait to be awaken after this part ends, <code>false</code>
	 *         otherwise.
	 */
	boolean shouldWait();
}
