package it.unitn.disi.acad.simulation.cases;

import it.unitn.disi.acad.simulation.SimulationUtils;


/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableSessionsSimulation extends AbstractSimulation {
	/** Different values for the number of sessions that will be tried. */
	private static final int[] NUMBER_OF_SESSIONS = new int[] {1, 10, 100, 1000};

	/** @see it.unitn.disi.acad.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Creates a simulation part for each number of sessions.
		for (final int numSessions : NUMBER_OF_SESSIONS) {
			parts.add(new SimulationPart() {
				@Override
				public void run() throws Exception {
					simulateSessions(numSessions);
				}

				@Override
				public boolean shouldWait() {
					return false;
				}
			});
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param numSessions
	 */
	private final void simulateSessions(int numSessions) {
		SimulationUtils.log.info("Starting scalable sessions simulation for {0} sessions", numSessions); //$NON-NLS-1$
		long startTimestamp = System.currentTimeMillis();
		
		// This is not so easy! How does the activity framework know which thread to notify when the simulation should be
		// continued? When all threads finish, we can go on to the next part.

		long endTimestamp = System.currentTimeMillis();
		long timeInSeconds = (endTimestamp - startTimestamp) / 1000;
		SimulationUtils.log.info("Scalable sessions simulation for {0} sessions took: {1} seconds", numSessions, timeInSeconds); //$NON-NLS-1$
	}
}
