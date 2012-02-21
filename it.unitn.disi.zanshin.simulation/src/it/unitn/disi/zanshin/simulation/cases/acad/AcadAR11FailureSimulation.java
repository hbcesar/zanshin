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
		// Obtains the repository service.
		repositoryService = Activator.getRepositoryService();

		// Adds the first part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Loads and registers the goal model.
				model = SimulationUtils.retrieveAcadGoalModel();
				repositoryService.storeGoalModel(model);
				
				// Simulates a failure in quality constraint "Dispatching occurs in 3 min".
				SimulationUtils.log.info("Current incident took more than 3 minutes do dispatch!"); //$NON-NLS-1$
				Q_Dispatch qD = (Q_Dispatch) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getQ_Dispatch());
				qD.start();
				qD.fail();
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		
		// Adds the second part.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Unloads the previous goal model and loads the new one.
				if (model != null)
					repositoryService.disposeGoalModel(model.getId());
				model = SimulationUtils.retrieveAcadGoalModel();
				repositoryService.storeGoalModel(model);
				
				// Simulates another failure, because the first increment in the parameter was not enough.
				SimulationUtils.log.info("First adaptation attempt was not enough, dispatch is still taking more than 3 minutes!"); //$NON-NLS-1$
				Q_Dispatch qD = (Q_Dispatch) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getQ_Dispatch());
				qD.start();
				qD.fail();
			}

			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		
		// Adds the third part.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Unloads the previous goal model and loads the new one.
				if (model != null)
					repositoryService.disposeGoalModel(model.getId());
				model = SimulationUtils.retrieveAcadGoalModel();
				repositoryService.storeGoalModel(model);
				
				// The second change was enough, the quality constraint is now satisfied.
				SimulationUtils.log.info("OK, dispatching now took less than 3 minutes!"); //$NON-NLS-1$
				Q_Dispatch qD = (Q_Dispatch) repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getQ_Dispatch());
				qD.start();
				qD.success();
			}

			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
