package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;
import it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;
import it.unitn.disi.zanshin.simulation.model.acad.T_DetectLoc;
import it.unitn.disi.zanshin.simulation.model.acad.T_InputInfo;

/**
 * Simulation of the failure of AR15 during an execution of the A-CAD.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AcadAR15FailureSimulation extends AbstractSimulation {
	/** The A-CAD goal model. */
	private AcadGoalModel model;

	/** The repository service. */
	private IRepositoryService repositoryService;

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = null;
	}

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Loads the goal model.
		model = SimulationUtils.readDefaultAcadGoalModel();

		// Obtains the repository service and registers the goal model there.
		repositoryService = Activator.getRepositoryService();
		repositoryService.storeGoalModel(model);

		// Adds the first part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Simulates a failure in task "Input Emergency Information".
				SimulationUtils.log.info("Staff member tries to Input Emergency Information but it fails!"); //$NON-NLS-1$
				T_InputInfo tII = (T_InputInfo) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_InputInfo());
				tII.start();
				tII.fail();
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});

		// Adds the second part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				SimulationUtils.log.info("In the 2nd try, Input Emergency Information suceeeds, but Detect Caller Location fails!"); //$NON-NLS-1$
				T_InputInfo tII = (T_InputInfo) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_InputInfo());
				tII.start();
				tII.success();

				T_DetectLoc tDL = (T_DetectLoc) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_DetectLoc());
				tDL.start();
				tDL.fail();
			}

			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
