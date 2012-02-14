package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

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
	
	/** The Repository Service implementation. */
	private IRepositoryService repositoryService;
	
	/** The Adaptation Service implementation. */
	private IAdaptationService adaptationService;
	
	/** The Target System Controller Service implementation. */
	private ITargetSystemControllerService controllerService;

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
		monitorThread.setRepositoryService(this.repositoryService);
		MonitoringUtils.log.info("Repository Service injected in the Monitoring Service"); //$NON-NLS-1$
	}

	/** Setter for adaptationService. */
	public void setAdaptationService(IAdaptationService adaptationService) {
		this.adaptationService = adaptationService;
		monitorThread.setAdaptationService(this.adaptationService);
		MonitoringUtils.log.info("Adaptation Service injected in the Monitoring Service"); //$NON-NLS-1$
	}
	
	/** Setter for targetSystemControllerService. */
	public void setControllerService(ITargetSystemControllerService controllerService) {
		this.controllerService = controllerService;
		monitorThread.setTargetSystemControllerService(this.controllerService);
		MonitoringUtils.log.info("Target System Controller Service injected in the Monitoring Service"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = null;
		monitorThread.setRepositoryService(null);
		MonitoringUtils.log.info("Repository Service disposed from the Monitoring Service"); //$NON-NLS-1$
	}

	/** Un-setter for adaptationService (required by OSGi Declarative Services). */
	public void unsetAdaptationService(IAdaptationService adaptationService) {
		this.adaptationService = null;
		monitorThread.setAdaptationService(null);
		MonitoringUtils.log.info("Adaptation Service disposed from the Monitoring Service"); //$NON-NLS-1$
	}
	
	/** Un-setter for targetSystemControllerService (required by OSGi Declarative Services). */
	public void unsetControllerService(ITargetSystemControllerService controllerService) {
		this.controllerService = null;
		monitorThread.setTargetSystemControllerService(null);
		MonitoringUtils.log.info("Target System Controller Service disposed from the Monitoring Service"); //$NON-NLS-1$
	}

	/** Constructor. */
	public MonitoringService() {
		// TODO: delete when done
//		// Initializes the repository service using the registered service in the platform.
//		BundleContext context = Activator.getContext();
//		ServiceReference<IRepositoryService> repositoryReference = context.getServiceReference(IRepositoryService.class);
//		IRepositoryService repositoryService = context.getService(repositoryReference);
		
		// Creates the monitoring thread and starts it.
		monitorThread = new MonitorThread(); // Old code: repositoryService);
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
