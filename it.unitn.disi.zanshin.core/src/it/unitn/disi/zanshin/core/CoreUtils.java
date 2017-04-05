package it.unitn.disi.zanshin.core;

import it.unitn.disi.zanshin.model.gore.GOREElementState;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.util.EmptyLogger;
import it.unitn.disi.zanshin.util.ILogger;
import it.unitn.disi.zanshin.util.PlatformLogger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.LogService;

/**
 * Internal utilities for the Core Component.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class CoreUtils {
	/** The logger. */
	public static ILogger log = new EmptyLogger();

	/** This class is not meant to have objects. */
	private CoreUtils() {}

	/**
	 * Initialization method that should be called by the bundle's activator.
	 * 
	 * @param logService
	 *          The platform log service to be used for logging.
	 */
	static void initialize(LogService logService) {
		log = new PlatformLogger(logService);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param src
	 * @return
	 */
	public static GOREElement createCopy(GOREElement src) {
		// Uses the Ecore copier to create a copy of the given requirement.
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		GOREElement dst = (GOREElement) copier.copy(src);
		copier.copyReferences();

		// Resets the copy and returns.
		if (dst instanceof PerformativeRequirement) {
			PerformativeRequirement pr = (PerformativeRequirement) dst;
			pr.setStartTime(null);
			pr.setTime(null);
			pr.setState(GOREElementState.UNDEFINED);
		}
		return dst;
	}
}
