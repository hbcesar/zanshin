package it.unitn.disi.zanshin.controller;

import it.unitn.disi.zanshin.remote.IZanshinServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Bundle activator for the Controller module of Zanshin. The controller module offers implementations of the target
 * controller service, which is triggered by the adaptation strategies and is responsible for communicating with the
 * external target system.
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

	/** Setter for zanshinServer. */
	public void setZanshinServer(IZanshinServer zanshinServer) throws Exception {
		ControllerUtils.log.info("Zanshin Server injected in this bundle"); //$NON-NLS-1$
		
		// Binds the injected Zanshin RMI server to the registry at the appropriate port.
		Registry registry = LocateRegistry.createRegistry(IZanshinServer.RMI_PORT);
		registry.rebind(IZanshinServer.RMI_NAME, zanshinServer);
		ControllerUtils.log.info("Zanshin Controller Component has started its server."); //$NON-NLS-1$
	}

	/** Un-setter for zanshinServer (required by OSGi Declarative Services). */
	public void unsetZanshinServer(IZanshinServer zanshinServer) throws Exception {
		ControllerUtils.log.info("Zanshin Server disposed from this bundle"); //$NON-NLS-1$
		
		// Unbinds the Zanshin server from the RMI registry. 
		Registry registry = LocateRegistry.createRegistry(IZanshinServer.RMI_PORT);
		registry.unbind(IZanshinServer.RMI_NAME);
		ControllerUtils.log.info("Zanshin Controller Component has stopped its server."); //$NON-NLS-1$
	}
	
	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		ControllerUtils.initialize(logTracker.getService());
		ControllerUtils.log.info("Zanshin Controller Component starting..."); //$NON-NLS-1$
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		ControllerUtils.log.info("Zanshin Controller Component stopping..."); //$NON-NLS-1$
		Activator.context = null;
	}

}
