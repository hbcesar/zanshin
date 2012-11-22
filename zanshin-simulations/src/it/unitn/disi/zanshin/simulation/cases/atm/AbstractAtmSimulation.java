package it.unitn.disi.zanshin.simulation.cases.atm;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;

import java.io.IOException;

public abstract class AbstractAtmSimulation extends AbstractSimulation {
	private static final Logger log = new Logger(AbstractAtmSimulation.class);

	protected static final String BASE_PATH = AbstractAtmSimulation.class.getPackage().getName().replace('.', '/') + '/';

	protected static final String META_MODEL_FILE_PATH = BASE_PATH + "atm.ecore"; //$NON-NLS-1$

	protected static final String MODEL_FILE_PATH = BASE_PATH + "model.atm"; //$NON-NLS-1$
	
	protected static final String T_SET_UP_CONNECT = "TSetUpConnect"; //$NON-NLS-1$
	
	protected static final String G_DETECT_CASH_AMOUNT = "GDetectCashAm"; //$NON-NLS-1$
	
	protected static final String T_PRINT_RECEIPT = "TPrintReceipt"; //$NON-NLS-1$
	
	protected static final String T_USE_CASH_SENS = "TUseCashSens"; //$NON-NLS-1$
	
	protected static final String T_USE_OPER_ENTRY = "TUseOperEntry"; //$NON-NLS-1$

	protected static Object lock = new Object();

	protected String targetSystemId;

	protected Long sessionId;

	protected void registerTargetSystem() throws IOException {
		// Registers the ATM simulation as target system in Zanshin, if not already registered.
		log.info("Registering the Atm Simulation as a target system in Zanshin!!!"); //$NON-NLS-1$
		targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new AtmSimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);
		log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */
	@Override
	public Object getLock() {
		return lock;
	}
}