package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.Activator;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Implementation of the monitoring service that uses the Awareness Requirements monitoring infrastructure in order to
 * notify the Adaptation Service of AwReq state changes.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class MonitoringService implements IMonitoringService {
	/** The monitoring thread. */
	private MonitorThread monitorThread;

	/** Constructor. */
	public MonitoringService() {
		// Initializes the repository service using the registered service in the platform.
		BundleContext context = Activator.getContext();
		ServiceReference<IRepositoryService> repositoryReference = context.getServiceReference(IRepositoryService.class);
		IRepositoryService repositoryService = context.getService(repositoryReference);
		
		// Creates the monitoring thread and starts it.
		monitorThread = new MonitorThread(repositoryService);
		monitorThread.start();
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IMonitoringService#monitorMethodCall(it.unitn.disi.zanshin.model.gore.DefinableRequirement,
	 *      it.unitn.disi.zanshin.model.gore.MonitorableMethod)
	 */
	@Override
	public void monitorMethodCall(DefinableRequirement req, MonitorableMethod method) {
		// Adds this method call to the queue.
		try {
			monitorThread.addToQueue(req, method);
		}
		catch (InterruptedException e) {
			MonitoringUtils.log.error("Main thread was interrupted while adding a {1} method call on {0} to the monitoring queue", e, req.eClass().getName(), method); //$NON-NLS-1$
		}
	}
}
