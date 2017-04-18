package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.lang.Thread.State;

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
		// Creates the monitoring thread and starts it.
		monitorThread = new MonitorThread();
		monitorThread.start();
	}

	/** Setter for adaptationService. */
	public void setAdaptationService(IAdaptationService adaptationService) {
		monitorThread.setAdaptationService(adaptationService);
		MonitoringUtils.log.info("Adaptation Service injected in the monitoring thread."); //$NON-NLS-1$
	}

	/** Un-setter for adaptationService (required by OSGi Declarative Services). */
	public void unsetAdaptationService(IAdaptationService adaptationService) {
		monitorThread.setAdaptationService(null);
		MonitoringUtils.log.info("Adaptation Service disposed from the monitoring thread."); //$NON-NLS-1$
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		monitorThread.setRepositoryService(repositoryService);
		MonitoringUtils.log.info("Repository Service injected in the monitoring thread."); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		monitorThread.setRepositoryService(null);
		MonitoringUtils.log.info("Repository Service disposed from the monitoring thread."); //$NON-NLS-1$
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IMonitoringService#monitorMethodCall(it.unitn.disi.zanshin.model.gore.DefinableRequirement,
	 *      it.unitn.disi.zanshin.model.gore.MonitorableMethod)
	 */
	@Override
	public void monitorMethodCall(GOREElement req, MonitorableMethod method) {
		// Adds this method call to the queue.
		try {
			monitorThread.addToQueue(req, method);
		}
		catch (InterruptedException e) {
			MonitoringUtils.log.error("Main thread was interrupted while adding a {1} method call on {0} to the monitoring queue", e, req.eClass().getName(), method); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#stop() */
	@Override
	public void stop() {
		// If the monitoring thread hasn't yet terminated, interrupt it.
		if ((monitorThread != null) && (!monitorThread.getState().equals(State.TERMINATED)))
			monitorThread.interrupt();
	}
}
