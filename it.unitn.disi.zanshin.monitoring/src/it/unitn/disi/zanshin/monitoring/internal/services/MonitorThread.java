package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IMonitoringService;

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
	/** A queue of life-cycle method calls to process. */
	private BlockingQueue<LifecycleMethodCall> queue = new ArrayBlockingQueue<>(100);

	/** Temporary solution. A "simulated" monitor is injected by the simulation. */
	private IMonitoringService simulatedMonitor;

	/** Setter for simulatedMonitor. */
	protected void setSimulatedMonitor(IMonitoringService simulatedMonitor) {
		this.simulatedMonitor = simulatedMonitor;
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

		// This is a temporary implementation. See https://github.com/vitorsouza/Zanshin/issues/1
		if (simulatedMonitor == null) {
			MonitoringUtils.log.warn("The simulated monitor has not been injected by the current simulation. Monitoring will not work. Please check your configuration."); //$NON-NLS-1$
			return;
		}
		simulatedMonitor.monitorMethodCall(req, method);
	}
}
