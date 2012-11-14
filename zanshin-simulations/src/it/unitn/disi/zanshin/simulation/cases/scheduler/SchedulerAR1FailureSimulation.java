package it.unitn.disi.zanshin.simulation.cases.scheduler;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SchedulerAR1FailureSimulation extends AbstractSchedulerSimulation {
	/** The logger. */
	private static final Logger log = new Logger(SchedulerAR1FailureSimulation.class);

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
				// Creates a user session, as if someone were using the Meeting Scheduler.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure in task "Characterize meeting".
				log.info("Meeting organizer tries to Characterize meeting but it fails!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CHARACT_MEET);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CHARACT_MEET);
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
				// Simulates another failure in task "Characterize meeting".
				log.info("Meeting organizer tries *again* to Characterize meeting but it fails!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CHARACT_MEET);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CHARACT_MEET);
			}
		});
		
		// Adds the third part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return true;
			}
			
			@Override
			public void run() throws Exception {
				// Simulates another failure in task "Characterize meeting".
				log.info("Meeting organizer tries *one more time* to Characterize meeting but it fails!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CHARACT_MEET);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CHARACT_MEET);
			}
		});
		
		// Adds the fourth part of the simulation to the list (being the last one, it should not wait).
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return false;
			}
			
			@Override
			public void run() throws Exception {
				// Simulates another failure in task "Characterize meeting".
				log.info("The system aborts! Today is not a good day to schedule meetings..."); //$NON-NLS-1$
			}
		});
	}
}
