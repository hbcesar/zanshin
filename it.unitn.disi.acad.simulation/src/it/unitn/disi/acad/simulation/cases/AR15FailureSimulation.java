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
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AR15FailureSimulation implements Simulation {
	/** @see it.unitn.disi.acad.simulation.cases.Simulation#run() */
	@Override
	public void run() throws Exception {
		// Loads the goal model.
		AcadGoalModel model = SimulationUtils.readDefaultGoalModel();
		
		// Obtains the repository service and registers the goal model there.
		ServiceReference<IRepositoryService> serviceReference = Activator.getContext().getServiceReference(IRepositoryService.class);
		IRepositoryService repositoryService = Activator.getContext().getService(serviceReference);
		repositoryService.storeGoalModel(model);
		
		// Finds the instances of the tasks that refine the goal "Register call".
		T_InputInfo tII = (T_InputInfo)repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_InputInfo());
		T_DetectLoc tDL = (T_DetectLoc)repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_DetectLoc());
		tII.start();
		tDL.start();
		
		// Simulate a failure in one of these tasks so the Zanshin can use an adaptation strategy.
		tII.fail();
		
		// Simulate another failure so the adaptation session can continue trying to solve the problem.
		tII.fail();
		
		// Simulate that the problem has been fixed and the tasks succeeded. 
		tII.success();
		tII.end();
		tDL.success();
		tDL.end();
	}
}
