package it.unitn.disi.zanshin.simulation.internal.services;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * TODO: document this type. Add warning messages saying the empty controller is being used.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class EmptyController implements Controller {
	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#abort(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(AwReq awreq) {}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#applyConfig(it.unitn.disi.zanshin.model.gore.Configuration,
	 *      it.unitn.disi.zanshin.model.gore.AggregationLevel)
	 */
	@Override
	public void applyConfig(Configuration config, AggregationLevel level) {}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.Object)
	 */
	@Override
	public void changeParameter(Requirement req, Parameter param, Object value) {}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(org.eclipse.emf.ecore.EClass,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.Object)
	 */
	@Override
	public void changeParameter(EClass reqClass, Parameter param, Object value) {}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#copyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public void copyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void disable(EClass reqClass) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void enable(EClass reqClass) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#newInstance(org.eclipse.emf.ecore.EClass) */
	@Override
	public Requirement newInstance(EClass reqClass) throws InstantiationException {
		throw new UnsupportedOperationException();
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#resume(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void resume(Requirement req) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#sendWarning(it.unitn.disi.zanshin.model.gore.Actor,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public void sendWarning(Actor actor, AwReq awreq) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void suspend(Requirement req) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitForFix(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(AwReq awreq) {}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#createNewAwReqInstance(org.eclipse.emf.ecore.EClass) */
	@Override
	public AwReq createNewAwReqInstance(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.Controller#createNewModel(org.eclipse.emf.ecore.EPackage) */
	@Override
	public GoalModel createNewModel(EPackage ePackage) throws Exception {
		throw new UnsupportedOperationException();
	}
}
