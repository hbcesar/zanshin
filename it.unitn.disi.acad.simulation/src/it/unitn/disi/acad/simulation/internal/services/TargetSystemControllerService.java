package it.unitn.disi.acad.simulation.internal.services;

import it.unitn.disi.acad.model.acad.AcadFactory;
import it.unitn.disi.acad.simulation.SimulationUtils;
import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import org.eclipse.emf.ecore.EClass;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class TargetSystemControllerService implements ITargetSystemControllerService {
	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#abort(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(AwReq awreq) {
		SimulationUtils.log.info("Instruction received: abort(i" + awreq.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
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
		SimulationUtils.log.info("Instruction received: change-param(i" + req.eClass().getName() + ", " + param.eClass().getName() + ", " + value + "), instance level"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(java.lang.Class,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.Object)
	 */
	@Override
	public void changeParameter(EClass reqClass, Parameter param, Object value) {
		SimulationUtils.log.info("Instruction received: change-param(" + reqClass.getName() + ", " + param.eClass().getName() + ", " + value + "), class level"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#copyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public void copyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {
		SimulationUtils.log.info("Instruction received: copy-data(i" + srcReq.eClass().getName() + ", i" + dstReq.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(java.lang.Class) */
	@Override
	public void disable(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: disable(" + reqClass.getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(java.lang.Class) */
	@Override
	public void enable(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: enable(" + reqClass.getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		SimulationUtils.log.info("Instruction received: initiate(i" + req.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#newInstance(org.eclipse.emf.ecore.EClass) */
	@Override
	public Requirement newInstance(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: new-instance(" + reqClass.getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$

		// Asks the system's EMF package to create the requirement instance.
		return (Requirement) AcadFactory.eINSTANCE.create(reqClass);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#resume(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void resume(Requirement req) {
		SimulationUtils.log.info("Instruction received: resume(i" + req.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {
		SimulationUtils.log.info("Instruction received: rollback(i" + req.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#sendWarning(it.unitn.disi.zanshin.model.gore.Actor,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public void sendWarning(Actor actor, AwReq awreq) {
		SimulationUtils.log.info("Instruction received: send-warning(" + actor.eClass().getName() + ", i" + awreq.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void suspend(Requirement req) {
		SimulationUtils.log.info("Instruction received: suspend(i" + req.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {
		SimulationUtils.log.info("Instruction received: terminate(i" + req.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {
		SimulationUtils.log.info("Instruction received: wait(" + timeInMillis + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitForFix(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(AwReq awreq) {
		SimulationUtils.log.info("Instruction received: wait-for-fix(i" + awreq.eClass().getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
