package it.unitn.disi.zanshin.simulation.cases.acad;

import java.io.IOException;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractAcadSimulation extends AbstractSimulation {
	/** The logger. */
	private static final Logger log = new Logger(AbstractAcadSimulation.class);

	/** TODO: document this field. */
	protected static final String BASE_PATH = AbstractAcadSimulation.class.getPackage().getName().replace('.', '/') + '/';

	/** TODO: document this field. */
	protected static final String META_MODEL_FILE_PATH = BASE_PATH + "acad.ecore"; //$NON-NLS-1$

	/** TODO: document this field. */
	protected static final String MODEL_FILE_PATH = BASE_PATH + "model.acad"; //$NON-NLS-1$

	/** TODO: document this field. */
	protected static final String T_INPUT_INFO = "T_InputInfo"; //$NON-NLS-1$

	/** TODO: document this field. */
	protected static final String T_DETECT_LOC = "T_DetectLoc"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	protected static final String Q_DISPATCH = "Q_Dispatch"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	protected static Object lock = new Object();

	/** The target system ID assigned by Zanshin. */
	protected String targetSystemId;

	/** TODO: document this field. */
	protected Long sessionId;

	/**
	 * TODO: document this method.
	 * 
	 * @throws IOException
	 */
	protected void registerTargetSystem() throws IOException {
		// Registers the A-CAD as target system in Zanshin, if not already registered.
		log.info("Registering the ACAD as a target system in Zanshin..."); //$NON-NLS-1$
		targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new AcadSimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);
		log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */
	@Override
	public Object getLock() {
		return lock;
	}
}
