package it.unitn.disi.zanshin.adaptation;

import it.unitn.disi.zanshin.adaptation.internal.services.EcaBasedAdaptivityService;
import it.unitn.disi.zanshin.services.IAdaptationService;

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
		AdaptivityUtils.initialize(logTracker.getService());
		AdaptivityUtils.log.info("Zanshin Adaptivity Component starting..."); //$NON-NLS-1$
		
		// Registers the adaptivity service.
		IAdaptationService adaptivityService = new EcaBasedAdaptivityService();
		context.registerService(IAdaptationService.class, adaptivityService, null);
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		AdaptivityUtils.log.info("Zanshin Adaptivity Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}

}
