package it.unitn.disi.zanshin.adaptation.qualia;

import it.unitn.disi.zanshin.adaptation.qualia.model.Procedure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	/** TODO: document this field. */
	private static final String PROCEDURES_PACKAGE = "it.unitn.disi.zanshin.adaptation.qualia.internal.procedures"; //$NON-NLS-1$

	/** The bundle's context. */
	private static BundleContext context;

	/** The procedures map, which maps procedure IDs to procedures themselves. */
	private static Map<String, Procedure> proceduresMap = new HashMap<>();

	/** Getter for context. */
	static BundleContext getContext() {
		return context;
	}

	/** @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		// Initializes the bundle's logger.
		ServiceTracker<LogService, LogService> logTracker = new ServiceTracker<LogService, LogService>(context, LogService.class, null);
		logTracker.open();
		QualiaUtils.initialize(logTracker.getService());
		QualiaUtils.log.info("Zanshin Adaptation Sub-component \"Qualia\" starting..."); //$NON-NLS-1$

		// Creates an instance of every procedure in the procedure's package and place them in the procedures map.
		initProcedures();
	}

	/** @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) throws Exception {
		QualiaUtils.log.info("Zanshin Adaptation Sub-component \"Qualia\" stopping..."); //$NON-NLS-1$
		Activator.context = null;
		proceduresMap = new HashMap<>();
	}

	/**
	 * TODO: document this method.
	 */
	@SuppressWarnings("rawtypes")
	private static void initProcedures() {
		// Loads all classes from the procedures package.
		Bundle bundle = context.getBundle();
		BundleWiring wiring = bundle.adapt(BundleWiring.class);
		Collection<String> resources = wiring.listResources(PROCEDURES_PACKAGE.replace('.', '/'), "*.class", 0); //$NON-NLS-1$

		// Creates an instance of each class and place the instance in the procedures map.
		for (String resource : resources) {
			try {
				// Converts the resource path into a qualified class name.
				resource = resource.replace('/', '.').substring(0, resource.length() - 6);
				Class clazz = bundle.loadClass(resource);
				String name = clazz.getSimpleName();

				Procedure instance = (Procedure) clazz.newInstance();
				proceduresMap.put(instance.getId(), instance);
				QualiaUtils.log.debug("Successfully created an instance of procedure {0}.", name); //$NON-NLS-1$
			}
			catch (InstantiationException | IllegalAccessException | ClassCastException | ClassNotFoundException e) {
				QualiaUtils.log.warn("Could not instantiate a procedure from resource: {0}", e, resource); //$NON-NLS-1$
			}
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param procedureId
	 * @return
	 */
	public static Procedure retrieveProcedure(String procedureId) {
		return proceduresMap.get(procedureId);
	}
}
