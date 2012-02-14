package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import java.text.MessageFormat;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Thread that processes requirement life-cycle method calls.
 * 
 * This thread is used by the monitoring service to separate the adaptivity framework and the target system in different
 * threads when simulations bundles are used. Calls are placed in synchronized blocking queue and are processed in a
 * FIFO fashion. When there's an AwReq failure, the thread submits it to the adaptation service.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class MonitorThread extends Thread {
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** The adaptation service. */
	private IAdaptationService adaptationService;
	
	/** The Target System Controller Service implementation. */
	private ITargetSystemControllerService targetSystemControllerService;

	/** A queue of life-cycle method calls to process. */
	private BlockingQueue<LifecycleMethodCall> queue = new ArrayBlockingQueue<>(100);

	/** Constructor. */
	// TODO: delete when done
	// public MonitorThread(IRepositoryService repositoryService) {
	// this.repositoryService = repositoryService;
	// }

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	/** Setter for adaptationService. */
	public void setAdaptationService(IAdaptationService adaptationService) {
		this.adaptationService = adaptationService;
	}

	/** Setter for targetSystemControllerService. */
	public void setTargetSystemControllerService(ITargetSystemControllerService targetSystemControllerService) {
		this.targetSystemControllerService = targetSystemControllerService;
	}

	/**
	 * Adds a life-cycle method call to the queue for eventual processing. Called by the monitoring service when other
	 * bundles send method calls to it.
	 * 
	 * @param req
	 *          The requirement instance in which the method was called.
	 * @param method
	 *          The method that was called (start(), end(), success(), etc.).
	 * @throws InterruptedException
	 *           If the calling thread gets interrupted while waiting for the queue to be released by another thread.
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
	 * Processes a life-cycle method call. This method is called by the thread's main procedure (i.e., the run() method),
	 * which loops forever (i.e., until interrupted), taking the next method call from the queue and process it with this
	 * method.
	 * 
	 * @param req
	 *          The requirement instance in which the method was called.
	 * @param method
	 *          The method that was called (start(), end(), success(), etc.).
	 */
	public void processMethodCall(DefinableRequirement req, MonitorableMethod method) {
		MonitoringUtils.log.info("Processing method call: {0} / {1}", new Object[] { method, req.getClass().getSimpleName() }); //$NON-NLS-1$

		// TODO: delete when done
		// Keeps looking up for the adaptation service, in case it is registered later.
		// FIXME: possible improvements:
		// - Is there a way to listen to services being registered in the platform? It would be better than this constant
		// checking...
		// if (adaptationService == null)
		// lookupAdaptationService();

		// The monitoring component is only operational if the adaptation and repository services have been injected.
		if (adaptationService == null) {
			MonitoringUtils.log.warn("The adaptation service has not been properly injected by OSGi. Monitoring will not work. Please check your configuration."); //$NON-NLS-1$
			return;
		}
		if (repositoryService == null) {
			MonitoringUtils.log.warn("The repository service has not been properly injected by OSGi. Monitoring will not work. Please check your configuration."); //$NON-NLS-1$
			return;
		}

		// FIXME: find a better way to time the adaptation framework?
		GoalModel model = req.findGoalModel();
		if ((model != null) && (model.eClass().getName().equals("ScalableGoalModel"))) //$NON-NLS-1$
			processScalableGoalModelSimulationMethodCall(req, method);

		// FIXME: really implement this service using AwReqs, Drools, etc.
		// This is a temporary implementation that triggers AwReq failures by hand for the A-CAD.
		AwReq awreq = null;

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
				MonitoringUtils.log.error("Cannot instantiate AR15: {0}", e, e.getMessage()); //$NON-NLS-1$
			}
		}

		if (awreq != null) {
			adaptationService.processStateChange(awreq);

			// FIXME: temporary implementation.
			// This temporary implementation asks the Target System Controller Service for a new copy of the AwReq. However,
			// there should be a better solution for this. Give it more thought and write the definitive version (or wait
			// for the integration of EEAT/Drools to see how things will change?)
			if (targetSystemControllerService != null) {
				AwReq newAwReq = targetSystemControllerService.createNewAwReqInstance(awreq.eClass());
				repositoryService.replaceRequirement(awreq.getGoalModel().getId(), awreq, newAwReq);
			}
		}

	}

	long startTimestamp;

	/**
	 * Temporary method that times the adaptation framework. Since the monitoring thread represents the adaptation
	 * framework and the simulation (i.e., the target system) is run in a different thread, this method will clock the
	 * time used by the monitoring thread when processing the scalable goal model simulation. There is a FIX-ME comment in
	 * processMethodCall() to implement this in a better way, i.e., independent of the simulation, with the ability to
	 * turn on/off, etc.
	 */
	private void processScalableGoalModelSimulationMethodCall(DefinableRequirement req, MonitorableMethod method) {
		if (startTimestamp == 0)
			startTimestamp = System.currentTimeMillis();

		GoalModel model = req.findGoalModel();
		AwReq awreq = model.getAwReqs().get(0);
		DefinableRequirement target = awreq.getTarget();
		if (req.equals(target)) {
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
			if (awreq != null) {
				adaptationService.processStateChange(awreq);
			}
		}

		else if (req.eClass().getName().equals("G00000") && (method == MonitorableMethod.END)) { //$NON-NLS-1$
			long modelSize = req.getTime().getTime();
			long endTimestamp = System.currentTimeMillis();
			System.out.println(MessageFormat.format(">>> TIMING <<< Model Size: {0}; Adaptation Framework time: {1}", modelSize, (endTimestamp - startTimestamp))); //$NON-NLS-1$
		}
	}

	/**
	 * Temporary method that looks up the adaptation service in the platform. There is a FIX-ME in processMethodCall() to
	 * replace this with a listener that listens to services being registered in the platform. When this is implemented,
	 * this method can be deleted.
	 */
	// TODO: delete when done
//	private void lookupAdaptationService() {
//		BundleContext context = Activator.getContext();
//		ServiceReference<IAdaptationService> adaptationReference = context.getServiceReference(IAdaptationService.class);
//		if (adaptationReference != null)
//			adaptationService = context.getService(adaptationReference);
//	}
}
