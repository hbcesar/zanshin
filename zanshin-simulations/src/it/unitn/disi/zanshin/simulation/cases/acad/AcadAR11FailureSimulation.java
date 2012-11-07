package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

/**
 * Simulation of the failure of AR15 during an execution of the A-CAD.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AcadAR11FailureSimulation extends AbstractAcadSimulation {
	/** The logger. */
	private static final Logger log = new Logger(AcadAR11FailureSimulation.class);

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Registers the A-CAD as target system in Zanshin.
		registerTargetSystem();

		// Adds the first part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the A-CAD.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure in quality constraint "Dispatching occurs in 3 min".
				log.info("Current incident took more than 3 minutes do dispatch!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, Q_DISPATCH);
				zanshin.logRequirementFailure(targetSystemId, sessionId, Q_DISPATCH);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		
		// Adds the second part.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Creates yet another user session, as if someone else were using the A-CAD.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates another failure, because the first increment in the parameter was not enough.
				log.info("First adaptation attempt was not enough, dispatch is still took more than 3 minutes in another incident!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, Q_DISPATCH);
				zanshin.logRequirementFailure(targetSystemId, sessionId, Q_DISPATCH);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		
		// Adds the third part.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Creates yet another user session, as if someone else were using the A-CAD.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// The second change was enough, the quality constraint is now satisfied.
				log.info("OK, for a third incident dispatching now took less than 3 minutes!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, Q_DISPATCH);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, Q_DISPATCH);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}

			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
