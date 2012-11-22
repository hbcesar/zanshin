package it.unitn.disi.zanshin.simulation.cases.atm;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

public class AtmAR2FailureSimulation extends AbstractAtmSimulation {
	
	private static final Logger log = new Logger(AtmAR2FailureSimulation.class);
	
	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	protected void doInit() throws Exception {
		// Registers the ATM Simulation as target system in Zanshin.
		registerTargetSystem();
		
		// Adds the first part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return true;
			}
			
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the ATM simulation.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure of goal "Detect Cash Amount".
				log.info("The cash amount is not detected -- either cash sensor and operator entry failed !"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, G_DETECT_CASH_AMOUNT);
				zanshin.logRequirementFailure(targetSystemId, sessionId, G_DETECT_CASH_AMOUNT);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_USE_CASH_SENS);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_USE_CASH_SENS);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_USE_OPER_ENTRY);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_USE_OPER_ENTRY);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
		});
		
				
		// Adds the second and final part of the simulation to the list (the last one).
				parts.add(new SimulationPart() {
					@Override
					public boolean shouldWait() {
						return false;
					}
					
					@Override
					public void run() throws Exception {
						// Creates a user session, as if someone were using the Atm Simulation.
						sessionId = zanshin.createUserSession(targetSystemId);
						log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

						// Simulates the success of the task "Use Operator Entry".
						log.info("Success!!!This time there are enough operators to check cash manually..."); //$NON-NLS-1$
						zanshin.logRequirementStart(targetSystemId, sessionId, T_USE_OPER_ENTRY);
						zanshin.logRequirementSuccess(targetSystemId, sessionId, T_USE_OPER_ENTRY);
						
						// Ends the user session.
						zanshin.disposeUserSession(targetSystemId, sessionId);
					}
				});
	}
}