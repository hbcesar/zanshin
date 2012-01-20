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
	protected List<SimulationPart> parts = new ArrayList<>();
	
	/** TODO: document this field. */
	protected int index = 0;

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
		SimulationPart part = parts.get(index++);
		part.run();
	}
}
