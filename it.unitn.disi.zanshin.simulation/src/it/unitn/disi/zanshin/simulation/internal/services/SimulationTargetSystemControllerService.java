package it.unitn.disi.zanshin.simulation.internal.services;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.simulation.SimulationUtils;

import org.eclipse.emf.ecore.EClass;

/**
 * Implementation of the Target System SimulatedController Service for the A-CAD simulations present in this bundle.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimulationTargetSystemControllerService extends AbstractTargetSystemControllerService {
	/** The controller simulation that will actually perform the actions, depending on the simulation being executed. */
	private SimulatedController controller = new EmptySimulatedController();

	/** The Repository Service implementation. */
	private IRepositoryService repositoryService;

	/** @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#getRepositoryService() */
	@Override
	protected IRepositoryService getRepositoryService() {
		return repositoryService;
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = null;
	}

	/** Setter for controller. */
	public void setController(SimulatedController controller) {
		this.controller = controller;
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#abort(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(AwReq awreq) {
		SimulationUtils.log.info("Instruction received: abort(i{0})", awreq.eClass().getName()); //$NON-NLS-1$
		controller.abort(awreq);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#applyConfig(it.unitn.disi.zanshin.model.gore.GoalModel,
	 *      it.unitn.disi.zanshin.model.gore.Configuration, it.unitn.disi.zanshin.model.gore.AggregationLevel)
	 */
	@Override
	public void applyConfig(GoalModel model, Configuration newConfig, AggregationLevel level) {
		SimulationUtils.log.info("Instruction received: apply-config()"); //$NON-NLS-1$
		controller.applyConfig(model, newConfig, level);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String)
	 */
	@Override
	public void changeParameter(Requirement req, Parameter param, String value) {
		SimulationUtils.log.info("Instruction received: change-param(i{0}, {1}, {2})", req.eClass().getName(), param.eClass().getName(), value); //$NON-NLS-1$
		controller.changeParameter(req, param, value);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(org.eclipse.emf.ecore.EClass,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String)
	 */
	@Override
	public void changeParameter(EClass reqClass, Parameter param, String value) {
		SimulationUtils.log.info("Instruction received: change-param({0}, {1}, {2})", reqClass.getName(), param.eClass().getName(), value); //$NON-NLS-1$
		controller.changeParameter(reqClass, param, value);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#doCopyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public void doCopyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {
		SimulationUtils.log.info("Instruction received: copy-data(i{0}, i{1})", srcReq.eClass().getName(), dstReq.eClass().getName()); //$NON-NLS-1$
		controller.copyData(srcReq, dstReq);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(java.lang.Class) */
	@Override
	public void disable(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: disable({0})", reqClass.getName()); //$NON-NLS-1$
		controller.disable(reqClass);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(java.lang.Class) */
	@Override
	public void enable(EClass reqClass) {
		SimulationUtils.log.info("Instruction received: enable({0})", reqClass.getName()); //$NON-NLS-1$
		controller.enable(reqClass);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		SimulationUtils.log.info("Instruction received: initiate(i{0})", req.eClass().getName()); //$NON-NLS-1$
		controller.initiate(req);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#doResume(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Requirement)
	 */
	@Override
	public void doResume(Requirement req, Requirement parent) {
		SimulationUtils.log.info("Instruction received: resume(i{0})", req.eClass().getName()); //$NON-NLS-1$
		controller.resume(req, parent);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {
		SimulationUtils.log.info("Instruction received: rollback(i{0})", req.eClass().getName()); //$NON-NLS-1$
		controller.rollback(req);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#sendWarning(it.unitn.disi.zanshin.model.gore.Actor,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public void sendWarning(Actor actor, AwReq awreq) {
		SimulationUtils.log.info("Instruction received: send-warning({0}, i{1})", actor.eClass().getName(), awreq.eClass().getName()); //$NON-NLS-1$
		controller.sendWarning(actor, awreq);
	}

	/** @see it.unitn.disi.zanshin.services.AbstractTargetSystemControllerService#doSuspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void doSuspend(Requirement req) {
		SimulationUtils.log.info("Instruction received: suspend(i{0})", req.eClass().getName()); //$NON-NLS-1$
		controller.suspend(req);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {
		SimulationUtils.log.info("Instruction received: terminate(i{0})", req.eClass().getName()); //$NON-NLS-1$
		controller.terminate(req);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {
		SimulationUtils.log.info("Instruction received: wait({0})", timeInMillis); //$NON-NLS-1$
		controller.waitFor(timeInMillis);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitForFix(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(AwReq awreq) {
		SimulationUtils.log.info("Instruction received: wait-for-fix(i{0})", awreq.eClass().getName()); //$NON-NLS-1$
		controller.waitForFix(awreq);
	}
}
