package it.unitn.disi.zanshin.adaptation.qualia;

import java.util.Collection;

import it.unitn.disi.zanshin.util.EmptyLogger;
import it.unitn.disi.zanshin.util.ILogger;
import it.unitn.disi.zanshin.util.PlatformLogger;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.log.LogService;

/**
 * Internal utilities for the Core Component.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class QualiaUtils {
	/** The logger. */
	public static ILogger log = new EmptyLogger();

	/** This class is not meant to have objects. */
	private QualiaUtils() {}

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
	 * @param eCollection
	 * @return
	 */
	public static String convertToString(Collection<? extends EObject> eCollection) {
		StringBuilder builder = new StringBuilder();
		builder.append('[');
		for (EObject eObj : eCollection) 
			builder.append(eObj.eClass().getName()).append(',').append(' ');
		builder.deleteCharAt(builder.length() - 1);
		builder.deleteCharAt(builder.length() - 1);
		builder.append(']');
		return builder.toString();
	}
}
