package it.unitn.disi.zanshin.simulation.cases.scalable;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.internal.services.EmptyController;
import it.unitn.disi.zanshin.simulation.model.scalable.ScalableGoalModel;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableController extends EmptyController {
	private ScalableGoalModel modelCopy;
	
	/** Setter for modelCopy. */
	protected void setModelCopy(ScalableGoalModel modelCopy) {
		this.modelCopy = modelCopy;
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		// Always continue the simulation when receiving this command.
		Activator.continueSimulation();
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#createNewModel(org.eclipse.emf.ecore.EPackage) */
	@Override
	public GoalModel createNewModel() {
		// Returns the copy of the model that has been injected by the scalability simulation.
		return modelCopy;
	}
}
