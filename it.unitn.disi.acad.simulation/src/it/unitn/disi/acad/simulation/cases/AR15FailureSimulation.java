package it.unitn.disi.acad.simulation.cases;

import it.unitn.disi.acad.model.acad.AcadGoalModel;
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
		
		// Finds the instance of the task "Input emergency information" and simulate a failure.
		T_InputInfo tII = repositoryService.retrieveRequirement(model.getId(), T_InputInfo.class);
		tII.start();
		tII.fail();
		tII.end();
	}
}
