package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

/**
 * Simulation of the failure of AR15 during an execution of the A-CAD.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AcadAR15FailureSimulation extends AbstractSimulation {
	/** The logger. */
	private static final Logger log = new Logger(AcadAR15FailureSimulation.class);
	
	/** TODO: document this field. */
	private static final String BASE_PATH = AcadAR15FailureSimulation.class.getPackage().getName().replace('.', '/') + '/';
	
	/** TODO: document this field. */
	private static final String META_MODEL_FILE_PATH = BASE_PATH + "acad.ecore"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String MODEL_FILE_PATH = BASE_PATH + "model.acad"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	private static final String T_INPUT_INFO = "T_InputInfo"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	private static final String T_DETECT_LOC = "T_DetectLoc"; //$NON-NLS-1$

	/** The target system ID assigned by Zanshin. */
	private String targetSystemId;
	
	/** TODO: document this field. */
	private Long sessionId;

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Registers the A-CAD as target system in Zanshin, if not already registered.
		log.info("Registering the ACAD as a target system in Zanshin..."); //$NON-NLS-1$
		targetSystemId = SimulationUtils.registerTargetSystem(zanshin, META_MODEL_FILE_PATH, MODEL_FILE_PATH);
		log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
		
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
				return false;
			}
		});
	}
}
