package it.unitn.disi.zanshin.simulation.cases.acad;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.internal.services.EmptyController;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AcadController extends EmptyController {
	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		EClass reqClass = req.eClass();
		
		// Perform different application-specific actions depending on the requirement.
		switch (reqClass.getClassifierID()) {
		case AcadPackage.GREG_CALL:
			// Runs the next part of the AR15 Failure Simulation.
			Activator.continueSimulation();
			break;
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#createNewModel(org.eclipse.emf.ecore.EPackage) */
	@Override
	public GoalModel createNewModel(EPackage ePackage) throws Exception {
		// FIXME: is there a better solution than calling a static method?
		return SimulationUtils.readDefaultGoalModel();
	}
}
