package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.internal.services.EmptyController;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;

import org.eclipse.emf.ecore.EClass;

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

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptyController#createNewModel() */
	@Override
	public GoalModel createNewModel() throws Exception {
		// Reads the A-CAD model again from the file.
		return SimulationUtils.readDefaultAcadGoalModel();
	}
}
