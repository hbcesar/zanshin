package it.unitn.disi.acad.simulation;

import it.unitn.disi.acad.simulation.cases.SimulationManager;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.lang.Thread.State;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Bundle activator for the Simulation module of Zanshin. The simulation module provides simulations of target systems
 * using the Zanshin framework for different kinds of adaptation, in order to evaluate the framework using experimental
 * and descriptive evaluation methods of Design Science. Whenever possible, different scalability simulations should
 * also be provided.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Activator implements BundleActivator {
	/** The bundle's context. */
	private static BundleContext context;

	/** The repository service. */
	private static IRepositoryService repositoryService;

	/** The simulation (main) thread. */
	private static Thread simulationThread;

	/** The simulation manager. */
	private static SimulationManager simulationManager;

	/** Getter for context. */
	public static BundleContext getContext() {
		return context;
	}

	/** Getter for repositoryService. */
	public static IRepositoryService getRepositoryService() {
		return repositoryService;
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		Activator.repositoryService = repositoryService;
		SimulationUtils.log.info("Repository Service injected in the activator"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		Activator.repositoryService = null;
		SimulationUtils.log.info("Repository Service disposed from the activator"); //$NON-NLS-1$
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
		
		// TODO: delete when done
		// Registers the target system controller service (the controller at the application side).
//		ITargetSystemControllerService controllerService = new AcadTargetSystemControllerService();
//		context.registerService(ITargetSystemControllerService.class, controllerService, null);

		// Reads the simulation properties, creates the simulation manager and starts the simulations.
		// TODO: reenable when done.
//		Properties props = SimulationUtils.readSimulationProperties();
//		simulationManager = new SimulationManager(props);
//		simulationManager.runSimulations();
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		SimulationUtils.log.info("A-CAD Simulation Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}

	/**
	 * Continues the simulation, moving on to the next step once the simulation thread is ready and waiting.
	 */
	public static void continueSimulation() {
		// If this is the simulation thread, there has obviously been a mistake. Log an error and return to avoid a loop.
		if (Thread.currentThread().equals(simulationThread)) {
			SimulationUtils.log.error("The simulation thread cannot order itself to continue, because it causes an infinite loop! Check your code..."); //$NON-NLS-1$
			return;
		}

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
