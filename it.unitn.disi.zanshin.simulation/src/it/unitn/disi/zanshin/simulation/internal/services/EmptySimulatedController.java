package it.unitn.disi.zanshin.simulation.internal.services;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.SimulationUtils;

import org.eclipse.emf.ecore.EClass;

/**
 * An empty simulated controller that serves as default, so there's a fallback if no controller is specified in the
 * configuration. When it receives adaptation instructions that are not expected to return something, this controller
 * only prints a warning message. In the case of methods that return something, it prints an error message and throws a
 * UnsupportedOperationException. This class can also serve as superclass for simulated controller that are specific to
 * a given simulation in order to avoid having to override all the controller's methods.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class EmptySimulatedController implements SimulatedController {
	/** Warning message to be logged if the implementations of this class are used. */
	private static final String WARNING_MESSAGE = "The empty simulated controller's implementation, which does nothing, is being used. Did you forget to overwrite a method or configure a different simulated controller?"; //$NON-NLS-1$

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#abort(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(AwReq awreq) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#applyConfig(it.unitn.disi.zanshin.model.gore.GoalModel,
	 *      it.unitn.disi.zanshin.model.gore.Configuration, it.unitn.disi.zanshin.model.gore.AggregationLevel)
	 */
	@Override
	public void applyConfig(GoalModel model, Configuration newConfig, AggregationLevel level) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String)
	 */
	@Override
	public void changeParameter(Requirement req, Parameter param, String value) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#changeParameter(org.eclipse.emf.ecore.EClass,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String)
	 */
	@Override
	public void changeParameter(EClass reqClass, Parameter param, String value) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#copyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public void copyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void disable(EClass reqClass) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#enable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void enable(EClass reqClass) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#newInstance(org.eclipse.emf.ecore.EClass) */
	@Override
	public Requirement newInstance(EClass reqClass) throws InstantiationException {
		SimulationUtils.log.error(WARNING_MESSAGE);
		throw new UnsupportedOperationException();
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#resume(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Requirement)
	 */
	@Override
	public void resume(Requirement req, Requirement parent) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#sendWarning(it.unitn.disi.zanshin.model.gore.Actor,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public void sendWarning(Actor actor, AwReq awreq) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void suspend(Requirement req) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#waitForFix(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(AwReq awreq) {
		SimulationUtils.log.warn(WARNING_MESSAGE);
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.SimulatedController#createNewModel() */
	@Override
	public GoalModel createNewModel() throws Exception {
		SimulationUtils.log.error(WARNING_MESSAGE);
		throw new UnsupportedOperationException();
	}
}
