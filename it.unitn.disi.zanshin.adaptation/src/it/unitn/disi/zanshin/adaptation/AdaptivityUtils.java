package it.unitn.disi.zanshin.adaptation;

import it.unitn.disi.zanshin.util.EmptyLogger;
import it.unitn.disi.zanshin.util.ILogger;
import it.unitn.disi.zanshin.util.PlatformLogger;

import org.osgi.service.log.LogService;

/**
 * Internal utilities for the Monitoring Component.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AdaptivityUtils {
	/** The logger. */
	public static ILogger log = new EmptyLogger();

	/** This class is not meant to have objects. */
	private AdaptivityUtils() {}

	/**
	 * Initialization method that should be called by the bundle's activator.
	 * 
	 * @param logService
	 *          The platform log service to be used for logging.
	 */
	static void initialize(LogService logService) {
		log = new PlatformLogger(logService);
	}

}
