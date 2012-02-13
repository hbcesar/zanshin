package it.unitn.disi.acad.simulation.cases;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for the implementation of simulations, implementing most of the methods defined in the Simulation
 * interface.
 * 
 * This abstract implementation divides simulations in parts, which actually implement the simulation. These parts
 * should then be added to the <code>parts</code> list and will be executed in the order they are placed in the list.
 * The simulation is deemed finished if there are no more parts to run. The verification if the simulation should wait
 * to be awaken or can proceed to the next part is also delegated to the part itself.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractSimulation implements Simulation {
	/** Name of the simulation. */
	protected String name;

	/** List of parts that compose the simulation. */
	protected List<SimulationPart> parts = new ArrayList<>();

	/** Indicates which part of the simulation should be run next. */
	protected int index = 0;

	/** Stores the part of the simulation that is currently being run. */
	protected SimulationPart currentPart;

	/** @see it.unitn.disi.acad.simulation.cases.Simulation#init(java.lang.String) */
	@Override
	public final void init(String name) throws Exception {
		this.name = name;
		doInit();
	}

	/**
	 * Method called by the constructor which allows implementations of the abstract class to execute initialization
	 * procedures, such as obtain services from the platform, etc.
	 */
	protected abstract void doInit() throws Exception;

	/** Getter for name. */
	public String getName() {
		return name;
	}

	/** @see it.unitn.disi.acad.simulation.cases.Simulation#hasFinished() */
	@Override
	public boolean hasFinished() {
		// The simulation ends when there is no simulation part at the current index.
		return (index >= parts.size());
	}

	/** @see it.unitn.disi.acad.simulation.cases.Simulation#runNextPart() */
	@Override
	public void runNextPart() throws Exception {
		// Obtains the next part of the simulation and runs it.
		currentPart = parts.get(index++);
		currentPart.run();
	}

	/** @see it.unitn.disi.acad.simulation.cases.Simulation#shouldWait() */
	@Override
	public boolean shouldWait() {
		return (currentPart != null) && (currentPart.shouldWait());
	}
}
