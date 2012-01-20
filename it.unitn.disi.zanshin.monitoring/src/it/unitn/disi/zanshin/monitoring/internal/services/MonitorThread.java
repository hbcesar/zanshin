package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.Activator;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptivityService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class MonitorThread extends Thread {
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** The adaptivity service. */
	private IAdaptivityService adaptivityService;

	/** A queue of life-cycle method calls to process. */
	private BlockingQueue<LifecycleMethodCall> queue = new ArrayBlockingQueue<>(100);

	/** Constructor. */
	public MonitorThread(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param req
	 * @param method
	 * @throws InterruptedException
	 */
	public void addToQueue(DefinableRequirement req, MonitorableMethod method) throws InterruptedException {
		queue.put(new LifecycleMethodCall(req, method));
	}

	/** @see java.lang.Thread#run() */
	@Override
	public void run() {
		MonitoringUtils.log.info("Monitoring thread started..."); //$NON-NLS-1$

		// Runs until interrupted.
		while (true) {
			// Takes the next method call in the queue and processes it.
			try {
				LifecycleMethodCall call = queue.take();
				processMethodCall(call.getRequirement(), call.getMethod());
			}
			catch (InterruptedException e) {
				MonitoringUtils.log.info("Monitoring thread was interrupted."); //$NON-NLS-1$
				break;
			}
		}

		MonitoringUtils.log.info("Monitoring thread has finished."); //$NON-NLS-1$
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param req
	 * @param method
	 */
	public void processMethodCall(DefinableRequirement req, MonitorableMethod method) {
		MonitoringUtils.log.info("Processing method call: {0} / {1}", new Object[] { method, req.getClass().getSimpleName() }); //$NON-NLS-1$

		// Keeps looking up for the adaptivity service, in case it is registered later.
		// FIXME: possible improvements:
		// - Is there a way to listen to services being registered in the platform? It would be better than this constant
		// checking...
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
					MonitoringUtils.log.error("Cannot instantiate AR15: {0}", e, e.getMessage()); //$NON-NLS-1$
				}
			}

			if (awreq != null) {
				adaptivityService.processStateChange(awreq);

				// FIXME: temporary implementation.
				// This temporary implementation asks the Target System Controller Service for a new copy of the AwReq. However,
				// there should be a better solution for this. Give it more thought and write the definitive version (or wait
				// for the integration of EEAT/Drools to see how things will change?)
				BundleContext context = Activator.getContext();
				ServiceReference<ITargetSystemControllerService> reference = context.getServiceReference(ITargetSystemControllerService.class);
				if (reference != null) {
					ITargetSystemControllerService service = context.getService(reference);
					AwReq newAwReq = service.createNewAwReqInstance(awreq.eClass());
					repositoryService.replaceRequirement(awreq.getGoalModel().getId(), awreq, newAwReq);
				}
			}
		}
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
}
