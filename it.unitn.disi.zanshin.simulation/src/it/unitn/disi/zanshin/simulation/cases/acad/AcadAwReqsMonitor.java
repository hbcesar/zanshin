package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AcadAwReqsMonitor implements IMonitoringService {
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** The adaptation service. */
	private IAdaptationService adaptationService;
	
	/** The Target System Controller Service implementation. */
	private ITargetSystemControllerService controllerService;
	
	/** Constructor. */
	public AcadAwReqsMonitor() {
		BundleContext context = Activator.getContext();
		ServiceReference<IAdaptationService> adaptationReference = context.getServiceReference(IAdaptationService.class);
		adaptationService = context.getService(adaptationReference);
		ServiceReference<IRepositoryService> repositoryReference = context.getServiceReference(IRepositoryService.class);
		repositoryService = context.getService(repositoryReference);
		ServiceReference<ITargetSystemControllerService> controllerReference = context.getServiceReference(ITargetSystemControllerService.class);
		controllerService = context.getService(controllerReference);
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

			// FIXME: temporary implementation.
			// This temporary implementation asks the Target System Controller Service for a new copy of the AwReq. However,
			// there should be a better solution for this. Give it more thought and write the definitive version (or wait
			// for the integration of EEAT/Drools to see how things will change?)
			if (controllerService != null) {
				AwReq newAwReq = controllerService.createNewAwReqInstance(awreq.eClass());
				repositoryService.replaceRequirement(awreq.getGoalModel().getId(), awreq, newAwReq);
			}
		}
	}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#stop() */
	@Override
	public void stop() {}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#setSimulatedMonitor(it.unitn.disi.zanshin.services.IMonitoringService) */
	@Override
	public void setSimulatedMonitor(IMonitoringService simulatedMonitor) {}
}
