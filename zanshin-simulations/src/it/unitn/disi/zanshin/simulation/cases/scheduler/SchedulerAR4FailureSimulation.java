package it.unitn.disi.zanshin.simulation.cases.scheduler;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SchedulerAR4FailureSimulation extends AbstractSchedulerSimulation {
	/** The logger. */
	private static final Logger log = new Logger(SchedulerAR4FailureSimulation.class);

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	protected void doInit() throws Exception {
		// Registers the Meeting Scheduler as target system in Zanshin.
		registerTargetSystem();
				
		// Adds the first part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return true;
			}
			
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the A-CAD.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure of goal "Find a suitable room".
				log.info("No rooms available and both partner and hotels fail!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_HOTEL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_HOTEL);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
		
		// Adds the second part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return true;
			}
			
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the A-CAD.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure of goal "Find a suitable room".
				log.info("No rooms available and both partner and hotels fail!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_HOTEL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_HOTEL);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
		
		// Adds the third and final part of the simulation to the list (being the last one, it should not wait).
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return false;
			}
			
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the A-CAD.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates the success of "Find a suitable room".
				log.info("This time, calling a partner institution succeeds!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, T_CALL_PARTNER);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
	}
}
