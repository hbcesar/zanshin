package it.unitn.disi.zanshin.simulation.cases.scalable;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController;
import it.unitn.disi.zanshin.simulation.model.scalable.ScalableGoalModel;

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
	private ScalableGoalModel modelCopy;

	/** Setter for modelCopy. */
	protected void setModelCopy(ScalableGoalModel modelCopy) {
		this.modelCopy = modelCopy;
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		// Always continue the simulation when receiving this command.
		Activator.continueSimulation();
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#createNewModel(org.eclipse.emf.ecore.EPackage) */
	@Override
	public GoalModel createNewModel() {
		// Returns the copy of the model that has been injected by the scalability simulation.
		return modelCopy;
	}
}
