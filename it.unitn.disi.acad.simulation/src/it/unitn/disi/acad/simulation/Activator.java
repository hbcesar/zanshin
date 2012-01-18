package it.unitn.disi.acad.simulation;

import it.unitn.disi.acad.simulation.cases.Simulation;
import it.unitn.disi.acad.simulation.internal.services.TargetSystemControllerService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	/** Prefix for the configuration of the simulation cases. */
	private static final String PROPERTIES_CASES_PREFIX = "cases."; //$NON-NLS-1$
	
	/** Suffix for the configuration of the simulation cases package. */
	private static final String PROPERTIES_CASES_PACKAGE = "package"; //$NON-NLS-1$
	
	/** Suffix for the configuration of a simulation's name. */
	private static final String PROPERTIES_CASES_NAME = ".name"; //$NON-NLS-1$
	
	/** Suffix for the configuration of a simulation's class. */
	private static final String PROPERTIES_CASES_CLASS = ".class"; //$NON-NLS-1$
	
	/** The bundle's context. */
	private static BundleContext context;

	/** Getter for context. */
	public static BundleContext getContext() {
		return context;
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		SimulationUtils.initialize(logTracker.getService());
		SimulationUtils.log.info("A-CAD Simulation Component starting..."); //$NON-NLS-1$

		// Registers the target system controller service (the controller at the application side).
		ITargetSystemControllerService controllerService = new TargetSystemControllerService();
		context.registerService(ITargetSystemControllerService.class, controllerService, null);
		
		// Reads the simulation properties.
		Properties props = SimulationUtils.readSimulationProperties();
		
		// Reads the simulation package's name.
		String pkgName = props.getProperty(PROPERTIES_CASES_PREFIX + PROPERTIES_CASES_PACKAGE);
		
		// Loads and executes all simulations listed in the properties.
		for (int num = 1; true; num++) {
			String name = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_NAME);
			String className = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_CLASS);
			
			if ((name != null) && (className != null)) {
				// Loads the simulation class.
				SimulationUtils.log.info("Executing simulation: {0}", name); //$NON-NLS-1$
				@SuppressWarnings("unchecked")
				Class<? extends Simulation> clazz = (Class<? extends Simulation>) Class.forName(pkgName + "." + className); //$NON-NLS-1$
				
				// Creates an instance and runs it.
				Simulation simulation = clazz.newInstance();
				simulation.run();
			}
			
			// When the property associated with the specified number is not found, break out of the loop.
			else break;
		}
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		SimulationUtils.log.info("A-CAD Simulation Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}
}
