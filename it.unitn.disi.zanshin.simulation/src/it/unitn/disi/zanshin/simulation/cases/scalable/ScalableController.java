package it.unitn.disi.zanshin.simulation.cases.scalable;

import org.eclipse.emf.ecore.EPackage;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.internal.services.EmptyController;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableController extends EmptyController {
	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		// Always continue the simulation when receiving this command.
		Activator.continueSimulation();
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#createNewModel(org.eclipse.emf.ecore.EPackage) */
	@Override
	public GoalModel createNewModel(EPackage ePackage) throws Exception {
		// FIXME: is there a better solution than accessing a static public attribute?
		return ScalableModelSimulation.modelCopy;
	}
}
