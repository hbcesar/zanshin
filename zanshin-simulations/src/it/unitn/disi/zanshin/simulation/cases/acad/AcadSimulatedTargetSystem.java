package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.SimulatedTargetSystem;

import java.util.Map;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AcadSimulatedTargetSystem extends SimulatedTargetSystem {
	/** TODO: document this field. */
	private Object lock;

	/** Constructor. */
	public AcadSimulatedTargetSystem(Object lock) {
		this.lock = lock;
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#applyConfig(java.util.Map) */
	@Override
	public void applyConfig(Map<String, String> newConfig) {
		super.applyConfig(newConfig);

		// ApplyConfig is the last command of the Reconfiguration strategy, thus we should notify the simulation to
		// continue, as this strategy is selected to deal with failures of AR11.
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#initiate(java.lang.Long, java.lang.String) */
	@Override
	public void initiate(Long sessionId, String reqName) {
		super.initiate(sessionId, reqName);

		// Initiate is the last command of the Retry strategy, thus we should notify the simulation to continue, as this
		// strategy is selected to deal with the first failure of AR15.
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#resume(java.lang.Long, java.lang.String) */
	@Override
	public void resume(Long sessionId, String reqName) {
		super.resume(sessionId, reqName);

		// Initiate is the last command of the Relax by Disabling a Child strategy, thus we should notify the simulation to
		// continue as this strategy is selected to deal with the second failure of AR15.
		synchronized (lock) {
			lock.notifyAll();
		}
	}

}
