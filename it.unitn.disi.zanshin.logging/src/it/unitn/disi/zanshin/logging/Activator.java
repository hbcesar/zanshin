package it.unitn.disi.zanshin.logging;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	/** The bundle's context. */
	private static BundleContext context;

	/** The Zanshin Logger. */
	private ZanshinLogger logger = new ZanshinLogger();

	/** Getter for context. */
	static BundleContext getContext() {
		return context;
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		// Obtains the list of all registered log reader services when this bundle is activated.
		ServiceTracker<LogReaderService, LogReaderService> logReaderTracker = new ServiceTracker<LogReaderService, LogReaderService>(context, LogReaderService.class.getName(), null);
		logReaderTracker.open();
		Object[] readers = logReaderTracker.getServices();

		// Adds the Zanshin Logger to all registered log readers.
		if (readers != null)
			for (Object reader : readers)
				logger.addTo((LogReaderService) reader);
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		
		// Removes the Zanshin Logger from all readers.
		logger.removeFromAll();
	}

}
