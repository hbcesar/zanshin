package it.unitn.disi.acad.simulation.cases;

import it.unitn.disi.acad.model.acad.AcadGoalModel;
import it.unitn.disi.acad.model.acad.AcadPackage;
import it.unitn.disi.acad.model.acad.T_DetectLoc;
import it.unitn.disi.acad.model.acad.T_InputInfo;
import it.unitn.disi.acad.simulation.Activator;
import it.unitn.disi.acad.simulation.SimulationUtils;
import it.unitn.disi.zanshin.services.IRepositoryService;

import org.osgi.framework.ServiceReference;

/**
 * Simulation of the failure of AR15 during an execution of the A-CAD.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AR15FailureSimulation extends AbstractSimulation {
	/** The A-CAD goal model. */
	private AcadGoalModel model;
	
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** @see it.unitn.disi.acad.simulation.cases.Simulation#init() */
	@Override
	public void init() throws Exception {
		// Loads the goal model.
		model = SimulationUtils.readDefaultGoalModel();
		
		// Obtains the repository service and registers the goal model there.
		ServiceReference<IRepositoryService> serviceReference = Activator.getContext().getServiceReference(IRepositoryService.class);
		repositoryService = Activator.getContext().getService(serviceReference);
		repositoryService.storeGoalModel(model);
		
		// Adds the first part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Simulates a failure in task "Input Emergency Information".
				SimulationUtils.log.info("Staff member tries to Input Emergency Information but it fails!"); //$NON-NLS-1$
				T_InputInfo tII = (T_InputInfo)repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_InputInfo());
				tII.start();
				tII.fail();
				tII.end();
			}
		});
		
		// Adds the second part of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				SimulationUtils.log.info("In the 2nd try, Input Emergency Information suceeeds, but Detect Caller Location fails!"); //$NON-NLS-1$
				T_InputInfo tII = (T_InputInfo)repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_InputInfo());
				tII.start();
				tII.success();
				tII.end();
				
				T_DetectLoc tDL = (T_DetectLoc)repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_DetectLoc());
				tDL.start();
				tDL.fail();
				tDL.end();
			}
		});
	}
}