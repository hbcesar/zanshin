package it.unitn.disi.zanshin.core;

import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Bundle activator for the Core module of Zanshin. The core module defines all service interfaces and the base EMF
 * models extended by the target systems. Plus, it registers an implementation for the repository service, which stores
 * requirement model instances from the target systems that are currently executing.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Activator implements BundleActivator {
	/** The bundle's context. */
	private static BundleContext context;

	/** The target system controller service, if any is registered. */
	private static ITargetSystemControllerService controllerService;

	/** The repository service. */
	private static IRepositoryService repositoryService;

	/** Getter for context. */
	public static BundleContext getContext() {
		return context;
	}

	/** Getter for controllerService. */
	public static ITargetSystemControllerService getControllerService() {
		return controllerService;
	}

	/** Setter for controllerService. */
	public static void setControllerService(ITargetSystemControllerService controllerService) {
		Activator.controllerService = controllerService;
		CoreUtils.log.info("Target System Controller Service injected in the activator"); //$NON-NLS-1$
	}

	/** Un-setter for controllerService (required by OSGi Declarative Services). */
	public static void unsetControllerService(ITargetSystemControllerService controllerService) {
		Activator.controllerService = null;
		CoreUtils.log.info("Target System Controller Service disposed from the activator"); //$NON-NLS-1$
	}

	/** Getter for repositoryService. */
	public static IRepositoryService getRepositoryService() {
		return repositoryService;
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		Activator.repositoryService = repositoryService;
		CoreUtils.log.info("Repository Service injected in the activator"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		Activator.repositoryService = null;
		CoreUtils.log.info("Repository Service disposed from the activator"); //$NON-NLS-1$
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		CoreUtils.initialize(logTracker.getService());
		CoreUtils.log.info("Zanshin Core Component starting..."); //$NON-NLS-1$
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		CoreUtils.log.info("Zanshin Core Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}
}
