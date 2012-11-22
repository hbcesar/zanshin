package it.unitn.disi.zanshin.simulation.cases.atm;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

public class AtmAR3FailureSimulation extends AbstractAtmSimulation {
	
	private static final Logger log = new Logger(AtmAR1FailureSimulation.class);
	
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
				// Creates a user session, as if someone were using the ATM Simulation;
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure in task "Print receipt".
				log.info("The ATM tries to print the receipt but it fails!!!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_PRINT_RECEIPT);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_PRINT_RECEIPT);
			}
		});
		
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return false;
			}
			
			@Override
			public void run() throws Exception {
				// Simulates another failure in task "Print receipt".
				log.info("The Receipt cannot be printed!!! We apologize for the inconvenince..."); //$NON-NLS-1$
			}
		});
	}	
}