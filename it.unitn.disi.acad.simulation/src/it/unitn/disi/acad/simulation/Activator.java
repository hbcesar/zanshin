package it.unitn.disi.acad.simulation;

import it.unitn.disi.acad.simulation.cases.SimulationManager;
import it.unitn.disi.acad.simulation.internal.services.AcadTargetSystemControllerService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import java.lang.Thread.State;
import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	/** The bundle's context. */
	private static BundleContext context;
	
	/** The simulation (main) thread. */
	private static Thread simulationThread;
	
	/** The simulation manager. */
	private static SimulationManager simulationManager;

	/** Getter for context. */
	public static BundleContext getContext() {
		return context;
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;
		simulationThread = Thread.currentThread();
		
		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		SimulationUtils.initialize(logTracker.getService());
		SimulationUtils.log.info("A-CAD Simulation Component starting..."); //$NON-NLS-1$

		// Registers the target system controller service (the controller at the application side).
		ITargetSystemControllerService controllerService = new AcadTargetSystemControllerService();
		context.registerService(ITargetSystemControllerService.class, controllerService, null);
		
		// Reads the simulation properties, creates the simulation manager and starts the simulations.
		Properties props = SimulationUtils.readSimulationProperties();
		simulationManager = new SimulationManager(props);
		simulationManager.runSimulations();
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		SimulationUtils.log.info("A-CAD Simulation Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}

	/**
	 * TODO: document this method.
	 */
	public static void continueSimulation() {
		// If the simulation thread has terminated, log an error.
		if ((simulationThread == null) || (simulationThread.getState() == State.TERMINATED)) {
			SimulationUtils.log.error("The simulation thread has already terminated and, thus, the simulation cannot continue."); //$NON-NLS-1$
			return;
		}
		
		// Waits for the simulation thread to be waiting for further orders.
		while (simulationThread.getState() != State.WAITING) {
			SimulationUtils.log.debug("The simulation thread is busy. Waiting..."); //$NON-NLS-1$
			try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e) {
				SimulationUtils.log.error("Thread interrupted while waiting for the simulation thread.", e); //$NON-NLS-1$
				return;
			}
		}
		
		// The simulation thread is waiting. Notify it to continue.
		synchronized (simulationManager) {
			simulationManager.notify();
		}
	}
}
