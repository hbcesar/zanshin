package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

/**
 * Simulation of the failure of AR15 during an execution of the A-CAD.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AcadAR15FailureSimulation extends AbstractAcadSimulation {
	/** The logger. */
	private static final Logger log = new Logger(AcadAR15FailureSimulation.class);
	
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

				// Simulates a failure in task "Input Emergency Information".
				log.info("Staff member tries to Input Emergency Information but it fails!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_INPUT_INFO);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_INPUT_INFO);
				
				log.info("Waiting for a response from Zanshin..."); //$NON-NLS-1$
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});

		// Adds the second part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				log.info("In the 2nd try, Input Emergency Information suceeeds, but Detect Caller Location fails!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_INPUT_INFO);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, T_INPUT_INFO);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_DETECT_LOC);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_DETECT_LOC);
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		
		// Adds the third part, wrapping things up.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Ends the user session.
				log.info("OK. Ending user session..."); //$NON-NLS-1$
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
			
			@Override
			public boolean shouldWait() {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
}
