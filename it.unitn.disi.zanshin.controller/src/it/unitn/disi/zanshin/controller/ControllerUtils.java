package it.unitn.disi.zanshin.controller;

import it.unitn.disi.zanshin.util.EmptyLogger;
import it.unitn.disi.zanshin.util.ILogger;
import it.unitn.disi.zanshin.util.PlatformLogger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.osgi.framework.Bundle;
import org.osgi.service.log.LogService;

/**
 * Internal utilities for the Monitoring Component.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class ControllerUtils {
	/** Path to the file that contains the controller's properties. */
	private static final String PROPERTIES_PATH = "/META-INF/controller.properties"; //$NON-NLS-1$
	
	/** The logger. */
	public static ILogger log = new EmptyLogger();

	/** This class is not meant to have objects. */
	private ControllerUtils() {}

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
	 * Reads the controller properties from a file in the bundle.
	 * 
	 * @return The properties object representing the properties in the file.
	 * @throws IOException
	 *           If the file cannot be found, read, closed, etc.
	 */
	public static Properties readControllerProperties() throws IOException {
		// Loads the properties file from the bundle.
		Bundle bundle = Activator.getContext().getBundle();
		URL propsUrl = bundle.getEntry(PROPERTIES_PATH);
		InputStream in = propsUrl.openStream();

		// Creates a properties object with its contents.
		Properties props = new Properties();
		props.load(in);
		in.close();

		return props;
	}
}
