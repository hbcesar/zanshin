package it.unitn.disi.zanshin.adaptation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Bundle activator for the Adaptation module of Zanshin. The adaptation module offers implementations of the adaptation
 * service, which is triggered by the monitoring service in order to send adaptation instructions to the target system.
 * 
 * So far, only an ECA-based adaptation service has been developed. This service is thus registered in the platform as
 * the default service to be used. In the future, other services might be developed and a configuration of which service
 * to use might be helpful here.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
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
		AdaptationUtils.initialize(logTracker.getService());
		AdaptationUtils.log.info("Zanshin Adaptation Component starting..."); //$NON-NLS-1$
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		AdaptationUtils.log.info("Zanshin Adaptation Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}

}
