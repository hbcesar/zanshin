package it.unitn.disi.zanshin.monitoring;

import it.unitn.disi.zanshin.services.IMonitoringService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Bundle activator for the Monitoring module of Zanshin. The monitoring module provides Aspects that monitor
 * requirements instances for calls to their life-cycle methods, reporting such calls to the monitoring service. Also,
 * this module offers an implementation of the monitoring service.
 * 
 * FIXME: replace current implementation of the monitoring service with a one based on EEAT.
 * 
 * The current implementation of the monitoring service just simulates a real monitoring service, depending on what is
 * required by the simulation being ran. In the future, the EEAT-based implementation created for the AwReqs experiment
 * should be integrated in this module. When Zanshin was created, that experiment had already been conducted and so the
 * experiments that needed to be implemented focused only on Evolution Requirements and Qualitative Adaptation.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Activator implements BundleActivator {
	/** The bundle's context. */
	private static BundleContext context;
	
	/** The monitoring service registered in the platform. */
	private static IMonitoringService monitoringService;

	/** Getter for context. */
	public static BundleContext getContext() {
		return context;
	}

	/** Getter for monitoringService. */
	public static IMonitoringService getMonitoringService() {
		return monitoringService;
	}

	/** Setter for monitoringService. */
	public void setMonitoringService(IMonitoringService monitoringService) {
		Activator.monitoringService = monitoringService;
		MonitoringUtils.log.info("Monitoring Service injected in the activator"); //$NON-NLS-1$
	}

	/** Un-setter for monitoringService (required by OSGi Declarative Services). */
	public void unsetMonitoringService(IMonitoringService monitoringService) {
		Activator.monitoringService = null;
		MonitoringUtils.log.info("Monitoring Service disposed from the activator"); //$NON-NLS-1$
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		MonitoringUtils.initialize(logTracker.getService());
		MonitoringUtils.log.info("Zanshin Monitoring Component starting..."); //$NON-NLS-1$

		// Registers the monitoring service.
		// TODO: delete when done
//		IMonitoringService monitoringService = new MonitoringService();
//		context.registerService(IMonitoringService.class, monitoringService, null);
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		MonitoringUtils.log.info("Zanshin Monitoring Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}
}
