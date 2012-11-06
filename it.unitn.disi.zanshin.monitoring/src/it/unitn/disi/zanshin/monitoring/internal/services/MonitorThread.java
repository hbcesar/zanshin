package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Thread that processes requirement life-cycle method calls.
 * 
 * This thread is used by the monitoring service to separate the adaptation framework and the target system in different
 * threads when simulations bundles are used. Calls are placed in synchronized blocking queue and are processed in a
 * FIFO fashion. When there's an AwReq failure, the thread submits it to the adaptation service.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class MonitorThread extends Thread {
	/** The adaptation service. */
	private IAdaptationService adaptationService;

	/** The repository service. */
	private IRepositoryService repositoryService;

	/** A queue of life-cycle method calls to process. */
	private BlockingQueue<LifecycleMethodCall> queue = new ArrayBlockingQueue<LifecycleMethodCall>(100);

	/** Setter for adaptationService. */
	public void setAdaptationService(IAdaptationService adaptationService) {
		this.adaptationService = adaptationService;
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
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
		MonitoringUtils.log.info("Processing method call: {0} / {1}", new Object[] { method, req.eClass().getName() }); //$NON-NLS-1$

		// Temporary implementation. See https://github.com/sefms-disi-unitn/Zanshin/issues/2

		// Treats all AwReqs as NeverFail AwReqs, i.e., whenever there's a success or failure of a requirement, searches the
		// repository service for an AwReq that refers to it and sends its state change to the adaptation service.
		if ((method == MonitorableMethod.SUCCESS) || (method == MonitorableMethod.FAIL)) {
			GoalModel model = req.findGoalModel();
			Set<AwReq> awreqs = repositoryService.retrieveSourceAwReqs(model.getId(), req.eClass());

			if (awreqs != null) {
				MonitoringUtils.log.info("Requirement {0} has {1} AwReqs referring to it. Assuming all AwReqs are NeverFail and reporting AwReq state change: {2}", req.eClass().getName(), awreqs.size(), method); //$NON-NLS-1$

				DefinableRequirementState state;
				switch (method) {
				case SUCCESS:
					state = DefinableRequirementState.SUCCEEDED;
					break;

				case FAIL:
					state = DefinableRequirementState.FAILED;
					break;

				default:
					state = DefinableRequirementState.UNDEFINED;
				}

				for (AwReq awreq : awreqs) {
					awreq.setState(state);
					adaptationService.processStateChange(awreq);

					// The code below was copied from the old simulated AwReq monitor services. Don't remember why this is
					// necessary...
					// Creates a copy of the failed AwReq, puts it in Undecided state and replaces the old one in the model.
					AwReq newAwReq = (AwReq) EcoreUtil.copy(awreq);
					newAwReq.setState(DefinableRequirementState.UNDEFINED);
					repositoryService.replaceRequirement(model.getId(), awreq, newAwReq);
				}
			}
		}
	}
}
