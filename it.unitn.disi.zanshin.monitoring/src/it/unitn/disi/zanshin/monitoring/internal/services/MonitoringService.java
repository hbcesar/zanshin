package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.Activator;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptivityService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Implementation of the monitoring service that uses the Awareness Requirements monitoring infrastructure in order to
 * notify the Adaptivity Service of AwReq state changes.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class MonitoringService implements IMonitoringService {
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** The adaptivity service. */
	private IAdaptivityService adaptivityService;

	/** Constructor. */
	public MonitoringService() {
		// Initializes the repository service using the registered service in the platform.
		BundleContext context = Activator.getContext();
		ServiceReference<IRepositoryService> repositoryReference = context.getServiceReference(IRepositoryService.class);
		repositoryService = context.getService(repositoryReference);

		// Initializes the adaptivity service using the registered service in the platform.
		lookupAdaptivityService();
	}

	/**
	 * Looks up the adaptivity service in the platform.
	 */
	private void lookupAdaptivityService() {
		BundleContext context = Activator.getContext();
		ServiceReference<IAdaptivityService> adaptivityReference = context.getServiceReference(IAdaptivityService.class);
		if (adaptivityReference != null)
			adaptivityService = context.getService(adaptivityReference);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IMonitoringService#monitorMethodCall(it.unitn.disi.zanshin.model.gore.DefinableRequirement,
	 *      it.unitn.disi.zanshin.model.gore.MonitorableMethod)
	 */
	@Override
	public void monitorMethodCall(DefinableRequirement req, MonitorableMethod method) {
		MonitoringUtils.log.info("Monitoring method call: {0} / {1}", new Object[] { method, req.getClass().getSimpleName() }); //$NON-NLS-1$

		// Keeps looking up for the adaptivity service, in case it is registered later.
		// FIXME: possible improvements:
		// - Is there a way to listen to services being registered in the platform? It would be better than this constant checking... 
		if (adaptivityService == null)
			lookupAdaptivityService();

		// Proceed only if the adaptivity service has been initialized.
		if (adaptivityService != null) {
			// FIXME: really implement this service using AwReqs, Drools, etc.
			// This is a temporary implementation that triggers AwReq failures by hand for the A-CAD.
			AwReq awreq = null;
			switch (req.eClass().getName()) {
			case "G_RegCall": //$NON-NLS-1$
				try {
					GoalModel model = req.findGoalModel();
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
				catch (Exception e) {
					MonitoringUtils.log.error("Can't instantiate AR15: {0}", e, e.getMessage()); //$NON-NLS-1$
				}
			}

			if (awreq != null) {
				adaptivityService.processStateChange(awreq);
			}
		}
	}
}
