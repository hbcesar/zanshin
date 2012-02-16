package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;
import it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;
import it.unitn.disi.zanshin.simulation.model.acad.Q_Dispatch;

/**
 * Simulation of the failure of AR15 during an execution of the A-CAD.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AcadAR11FailureSimulation extends AbstractSimulation {
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
				// Simulates a failure in quality constraint "Dispatching occurs in 3 min".
				SimulationUtils.log.info("Current incident took more than 3 minutes do dispatch!"); //$NON-NLS-1$
				Q_Dispatch qD = (Q_Dispatch) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getQ_Dispatch());
				qD.start();
				qD.fail();
			}

			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
