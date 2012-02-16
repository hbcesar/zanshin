package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Simulated AwReqs monitor for the A-CAD simulations. The simulated monitor is a temporary replacement for the real
 * AwReqs monitor that will eventually be integrated in Zanshin. The definitive implementation is able to handle any
 * system and there's no need for a simulated controller for each simulation.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AcadSimulatedAwReqsMonitor implements IMonitoringService {
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** The adaptation service. */
	private IAdaptationService adaptationService;

	/** Constructor. */
	public AcadSimulatedAwReqsMonitor() {
		BundleContext context = Activator.getContext();
		ServiceReference<IAdaptationService> adaptationReference = context.getServiceReference(IAdaptationService.class);
		adaptationService = context.getService(adaptationReference);
		ServiceReference<IRepositoryService> repositoryReference = context.getServiceReference(IRepositoryService.class);
		repositoryService = context.getService(repositoryReference);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IMonitoringService#monitorMethodCall(it.unitn.disi.zanshin.model.gore.DefinableRequirement,
	 *      it.unitn.disi.zanshin.model.gore.MonitorableMethod)
	 */
	@Override
	public void monitorMethodCall(DefinableRequirement req, MonitorableMethod method) {
		GoalModel model = req.findGoalModel();
		AwReq awreq = null;

		// When the goal "Register Call" fails, we should trigger the failure of AwReq AR15.
		switch (req.eClass().getName()) {
		case "G_RegCall": //$NON-NLS-1$
			try {
				if (model != null) {
					awreq = (AwReq) repositoryService.retrieveRequirement(model.getId(), "AR15"); //$NON-NLS-1$
					switch (method) {
					case FAIL:
						awreq.setState(DefinableRequirementState.FAILED);
						break;
					case SUCCESS:
						awreq.setState(DefinableRequirementState.SUCCEEDED);
						break;
					default:
						awreq = null;
					}
				}
			}
			catch (Exception e) {
				SimulationUtils.log.error("Cannot instantiate AR15: {0}", e, e.getMessage()); //$NON-NLS-1$
			}
		}

		if (awreq != null) {
			adaptationService.processStateChange(awreq);

			// Creates a copy of the failed AwReq, puts it in Undecided state and replaces the old one in the model.
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			AwReq newAwReq = (AwReq) copier.copy(awreq);
			copier.copyReferences();
			newAwReq.setState(DefinableRequirementState.UNDEFINED);
			if (awreq.getGoalModel() != null)
				repositoryService.replaceRequirement(awreq.getGoalModel().getId(), awreq, newAwReq);
			
			System.out.println("Wait");
		}
	}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#stop() */
	@Override
	public void stop() {}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#setSimulatedMonitor(it.unitn.disi.zanshin.services.IMonitoringService) */
	@Override
	public void setSimulatedMonitor(IMonitoringService simulatedMonitor) {}
}
