package it.unitn.disi.zanshin.core;

import it.unitn.disi.zanshin.internal.services.RepositoryService;
import it.unitn.disi.zanshin.services.IRepositoryService;

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
		CoreUtils.initialize(logTracker.getService());
		CoreUtils.log.info("Zanshin Core Component starting..."); //$NON-NLS-1$
		
		// Registers the repository service.
		IRepositoryService repositoryService = new RepositoryService();
		context.registerService(IRepositoryService.class, repositoryService, null);
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		CoreUtils.log.info("Zanshin Core Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}
}
