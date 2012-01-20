package it.unitn.disi.acad.simulation.internal.services;

import it.unitn.disi.acad.model.acad.AcadPackage;
import it.unitn.disi.acad.simulation.Activator;
import it.unitn.disi.acad.simulation.SimulationUtils;
import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService;

import org.eclipse.emf.ecore.EClass;

/**
 * Implementation of the Target System Controller Service for the A-CAD simulations present in this bundle.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AcadTargetSystemControllerService extends AbstractTargetSystemControllerService {
	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#abort(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(AwReq awreq) {
		SimulationUtils.log.info("Instruction received: abort(i{0})", awreq.eClass().getName()); //$NON-NLS-1$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#applyConfig(it.unitn.disi.zanshin.model.gore.Configuration,
	 *      it.unitn.disi.zanshin.model.gore.AggregationLevel)
	 */
	@Override
	public void applyConfig(Configuration config, AggregationLevel level) {
		SimulationUtils.log.info("Instruction received: apply-config()"); //$NON-NLS-1$
		
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.Object)
	 */
	@Override
	public void changeParameter(Requirement req, Parameter param, Object value) {
		SimulationUtils.log.info("Instruction received: change-param(i{0}, {1}, {2})", req.eClass().getName(), param.eClass().getName(), value); //$NON-NLS-1$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(java.lang.Class,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.Object)
	 */
	@Override
	public void changeParameter(EClass reqClass, Parameter param, Object value) {
		SimulationUtils.log.info("Instruction received: change-param({0}, {1}, {2})", reqClass.getName(), param.eClass().getName(), value); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#doCopyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement, it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void doCopyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {
		SimulationUtils.log.info("Instruction received: copy-data(i{0}, i{1})", srcReq.eClass().getName(), dstReq.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(java.lang.Class) */
	@Override
	public void disable(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: disable({0})", reqClass.getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#doDisable(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	protected void doDisable(Requirement req) {
		SimulationUtils.log.info("Instruction received: disable(i{0})", req.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(java.lang.Class) */
	@Override
	public void enable(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: enable({0})", reqClass.getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void enable(Requirement req) {
		SimulationUtils.log.info("Instruction received: enable(i{0})", req.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		EClass reqClass = req.eClass();
		SimulationUtils.log.info("Instruction received: initiate(i{0})", reqClass.getName()); //$NON-NLS-1$
		
		// Perform different application-specific actions depending on the requirement to initiate.
		switch (reqClass.getClassifierID()) {
		case AcadPackage.GREG_CALL:
			// Runs the next part of the AR15 Failure Simulation.
			Activator.continueSimulation();
			break;
		}
	}

	/** @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#createNewModel() */
	@Override
	public GoalModel createNewModel() throws Exception {
		return SimulationUtils.readDefaultGoalModel();
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#resume(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void resume(Requirement req) {
		SimulationUtils.log.info("Instruction received: resume(i{0})", req.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {
		SimulationUtils.log.info("Instruction received: rollback(i{0})", req.eClass().getName()); //$NON-NLS-1$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#sendWarning(it.unitn.disi.zanshin.model.gore.Actor,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public void sendWarning(Actor actor, AwReq awreq) {
		SimulationUtils.log.info("Instruction received: send-warning({0}, i{1})", actor.eClass().getName(), awreq.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void suspend(Requirement req) {
		SimulationUtils.log.info("Instruction received: suspend(i{0})", req.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {
		SimulationUtils.log.info("Instruction received: terminate(i{0})", req.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {
		SimulationUtils.log.info("Instruction received: wait({0})",timeInMillis); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitForFix(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(AwReq awreq) {
		SimulationUtils.log.info("Instruction received: wait-for-fix(i{0})", awreq.eClass().getName()); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#createNewAwReqInstance(org.eclipse.emf.ecore.EClass) */
	@Override
	public AwReq createNewAwReqInstance(EClass eClass) {
		// This is temporary. See the FIXME in class MonitorThread.
		try {
			GoalModel newModel = createNewModel();
			repositoryService.storeGoalModel(newModel);
			Requirement newReq = repositoryService.retrieveRequirement(newModel.getId(), eClass);
			AwReq newAwReq = (AwReq) newReq;
			newAwReq.setGoalModel(null);
			repositoryService.disposeGoalModel(newModel.getId());
			return newAwReq;
		}
		catch (Exception e) {
			return null;
		}
	}
}
