package it.unitn.disi.zanshin.simulation.cases.scalable;

import org.eclipse.emf.ecore.EClass;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController;

/**
 * Simulated controller for the scalable simulations. This class is plugged in the Simulations Traget System Controller
 * Service when one of the scalable simulations is running and responds to specific instructions from Zanshin the way a
 * real system would respond. The simulated controller responds only to the simulations that have been developed, not
 * being able to cope with any other adaptation.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableSimulatedController extends EmptySimulatedController {

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#abort(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void abort(AwReq awreq) {}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#applyConfig(it.unitn.disi.zanshin.model.gore.GoalModel,
	 *      it.unitn.disi.zanshin.model.gore.Configuration, it.unitn.disi.zanshin.model.gore.AggregationLevel)
	 */
	@Override
	public void applyConfig(GoalModel model, Configuration newConfig, AggregationLevel level) {
		// Locate the parameter in the actual model and print its new value.
		for (Parameter newParam : newConfig.getParameters()) {
			Parameter paramToChange = null;
			for (Parameter param : model.getConfiguration().getParameters()) {
				if (param.eClass().equals(newParam.eClass()))
					paramToChange = param;
			}
			if (paramToChange == null)
				SimulationUtils.log.warn("Parameter {0} not found in the goal model!", newParam.eClass().getName()); //$NON-NLS-1$
			else {
				paramToChange.setValue(newParam.getValue());
				SimulationUtils.log.info("Parameter {0} should be set to {1}", newParam.eClass().getName(), newParam.getValue()); //$NON-NLS-1$
			}
		}

		// Continue the simulation.
		Activator.continueSimulation();
	}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#changeParameter(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String)
	 */
	@Override
	public void changeParameter(Requirement req, Parameter param, String value) {}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#changeParameter(org.eclipse.emf.ecore.EClass,
	 *      it.unitn.disi.zanshin.model.gore.Parameter, java.lang.String)
	 */
	@Override
	public void changeParameter(EClass reqClass, Parameter param, String value) {}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#copyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public void copyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#disable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void disable(EClass reqClass) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#enable(org.eclipse.emf.ecore.EClass) */
	@Override
	public void enable(EClass reqClass) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		// Always continue the simulation when receiving this command.
		Activator.continueSimulation();
	}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#resume(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Requirement)
	 */
	@Override
	public void resume(Requirement req, Requirement parent) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#sendWarning(it.unitn.disi.zanshin.model.gore.Actor,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public void sendWarning(Actor actor, AwReq awreq) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void suspend(Requirement req) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#waitForFix(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void waitForFix(AwReq awreq) {}
}
