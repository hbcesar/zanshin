package it.unitn.disi.acad.simulation.cases;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractSimulation implements Simulation {
	/** TODO: document this field. */
	protected String name; 
	
	/** TODO: document this field. */
	protected List<SimulationPart> parts = new ArrayList<>();
	
	/** TODO: document this field. */
	protected int index = 0;
	
	/** TODO: document this field. */
	protected SimulationPart currentPart;
	
	/** @see it.unitn.disi.acad.simulation.cases.Simulation#init(java.lang.String) */
	@Override
	public final void init(String name) throws Exception {
		this.name = name;
		doInit();
	}
	
	/**
	 * TODO: document this method.
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
