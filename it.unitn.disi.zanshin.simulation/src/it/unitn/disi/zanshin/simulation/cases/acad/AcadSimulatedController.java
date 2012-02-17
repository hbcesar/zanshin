package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * Simulated controller for the A-CAD simulations. This class is plugged in the Simulations Traget System Controller
 * Service when one of the A-CAD simulations is running and responds to specific instructions from Zanshin the way a
 * real system would respond. The simulated controller responds only to the simulations that have been developed, not
 * being able to cope with any other adaptation.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AcadSimulatedController extends EmptySimulatedController {
	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#initiate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void initiate(Requirement req) {
		System.out.println("############### initiate: " + req); //$NON-NLS-1$
		EClass reqClass = req.eClass();

		// Perform different application-specific actions depending on the requirement.
		switch (reqClass.getClassifierID()) {
		case AcadPackage.GREG_CALL:
			// Runs the next part of the AR15 Failure Simulation.
			Activator.continueSimulation();
			break;
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#createNewModel() */
	@Override
	public GoalModel createNewModel() throws Exception {
		// Reads the A-CAD model again from the file.
		return SimulationUtils.readDefaultAcadGoalModel();
	}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#copyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public void copyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#rollback(it.unitn.disi.zanshin.model.gore.PerformativeRequirement) */
	@Override
	public void rollback(PerformativeRequirement req) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#terminate(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void terminate(Requirement req) {
		System.out.println("############### terminate: " + req); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#waitFor(long) */
	@Override
	public void waitFor(long timeInMillis) {}

	/**
	 * @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#resume(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Requirement)
	 */
	@Override
	public void resume(Requirement req, Requirement parent) {}

	/** @see it.unitn.disi.zanshin.simulation.internal.services.EmptySimulatedController#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public void suspend(Requirement req) {}
}
