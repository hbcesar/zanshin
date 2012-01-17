package it.unitn.disi.zanshin.monitoring;

import it.unitn.disi.zanshin.monitoring.internal.services.MonitoringService;
import it.unitn.disi.zanshin.services.IMonitoringService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
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
		MonitoringUtils.initialize(logTracker.getService());
		MonitoringUtils.log.info("Zanshin Monitoring Component starting..."); //$NON-NLS-1$
		
		// Registers the monitoring service.
		IMonitoringService monitoringService = new MonitoringService();
		context.registerService(IMonitoringService.class, monitoringService, null);
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		MonitoringUtils.log.info("Zanshin Monitoring Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}
}
