package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.model.gore.impl.AwReqImpl;
import it.unitn.disi.zanshin.monitoring.Activator;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptivityService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * TODO: document this type.
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
		ServiceReference<IAdaptivityService> adaptivityReference = context.getServiceReference(IAdaptivityService.class);
		adaptivityService = context.getService(adaptivityReference);
	}
	
	/** @see it.unitn.disi.zanshin.services.IMonitoringService#monitorMethodCall(it.unitn.disi.zanshin.model.gore.DefinableRequirement, it.unitn.disi.zanshin.model.gore.MonitorableMethod) */
	@Override
	public void monitorMethodCall(DefinableRequirement req, MonitorableMethod method) {
		MonitoringUtils.log.info("Monitoring method call: {0} / {1}", new Object[] {method, req.getClass().getSimpleName()}); //$NON-NLS-1$
		
		// FIXME: really implement this service using AwReqs, Drools, etc.
		// This is a temporary implementation that triggers AwReq failures by hand for the A-CAD.
		String reqName = req.getClass().getSimpleName();
		AwReq awreq = null;
		if ("G_RegCallImpl".equals(reqName) && (method == MonitorableMethod.FAIL)) { //$NON-NLS-1$
			try {
				GoalModel model = req.findGoalModel();
				awreq = (AwReq) repositoryService.retrieveRequirement(model.getId(), "it.unitn.disi.acad.model.acad.AR15"); //$NON-NLS-1$
			}
			catch (Exception e) {
				MonitoringUtils.log.error("Can't instantiate AR15: {0}", e, e.getMessage()); //$NON-NLS-1$
			}
		}
		
		if (awreq != null) {
			adaptivityService.adaptToFailure(awreq);
		}
	}
}

class AR15 extends AwReqImpl {}
