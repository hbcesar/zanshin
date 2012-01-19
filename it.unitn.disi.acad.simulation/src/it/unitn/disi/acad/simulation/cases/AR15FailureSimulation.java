package it.unitn.disi.acad.simulation.cases;

import it.unitn.disi.acad.model.acad.AcadGoalModel;
import it.unitn.disi.acad.model.acad.AcadPackage;
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
		
		// Simulates a failure in task "Input Emergency Information".
		T_InputInfo tII = (T_InputInfo)repositoryService.retrieveRequirement(model.getId(), AcadPackage.eINSTANCE.getT_InputInfo());
		tII.start();
		tII.fail();
		tII.end();
	}
}
