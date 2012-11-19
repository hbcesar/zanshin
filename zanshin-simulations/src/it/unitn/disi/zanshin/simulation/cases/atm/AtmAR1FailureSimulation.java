package it.unitn.disi.zanshin.simulation.cases.atm;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;


public class AtmAR1FailureSimulation extends AbstractAtmSimulation {
	/** The logger. */
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
			
			public void run() throws Exception {
				// Creates a user session, as if someone were using the ATM Simulation;
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$

				// Simulates a failure in task "Set up connection to bank".
				log.info("The ATM tries to connect to the banking network but it fails!!!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_SET_UP_CONNECT);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_SET_UP_CONNECT);
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
				// Simulates another failure in task "Set up connection to bank".
				log.info("The ATM tries again to connect to the banking network but it fails!!!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_SET_UP_CONNECT);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_SET_UP_CONNECT);
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
				// Simulates another failure in task "Set up connection to bank".
				log.info("The ATM tries 'one more time' to connect to the banking network but it fails!!!"); //$NON-NLS-1$
				zanshin.logRequirementStart(targetSystemId, sessionId, T_SET_UP_CONNECT);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_SET_UP_CONNECT);
			}
		});
		
		// Adds the fourth part of the simulation to the list.
		
		parts.add(new SimulationPart() {
			@Override
			public boolean shouldWait() {
				return false;
			}
			
			@Override
			public void run() throws Exception {
				// Simulates another failure in task "Set up connection to bank".
				log.info("The system aborts! Today the ATM will not be available..."); //$NON-NLS-1$
			}
	});
  }		
		
}