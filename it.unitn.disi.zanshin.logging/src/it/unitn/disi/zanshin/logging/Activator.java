package it.unitn.disi.zanshin.logging;

import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.Properties;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	/** The bundle's id. */
	public static final String BUNDLE_ID = "it.unitn.disi.zanshin.logging"; //$NON-NLS-1$

	/** Path to the file that contains the logging properties. */
	private static final String PROPERTIES_PATH = "/META-INF/logging.properties"; //$NON-NLS-1$

	/** Prefix for the configuration of the logger. */
	private static final String PROPERTIES_LOGGING_PREFIX = "logging."; //$NON-NLS-1$

	/** Suffix for the configuration of the logger's date format pattern. */
	private static final String PROPERTIES_LOGGING_DATE_PATTERN = "datePattern"; //$NON-NLS-1$

	/** Suffix for the configuration of the logger's message format pattern. */
	private static final String PROPERTIES_LOGGING_MESSAGE_PATTERN = "messagePattern"; //$NON-NLS-1$

	/** Suffix for the configuration of the logger's level. */
	private static final String PROPERTIES_LOGGING_LEVEL = "level"; //$NON-NLS-1$

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

		// If the logging properties have been set, configure the logger.
		Properties props = readLoggingProperties();
		if (props != null) {
			String datePattern = props.getProperty(PROPERTIES_LOGGING_PREFIX + PROPERTIES_LOGGING_DATE_PATTERN);
			String messagePattern = props.getProperty(PROPERTIES_LOGGING_PREFIX + PROPERTIES_LOGGING_MESSAGE_PATTERN);
			String levelName = props.getProperty(PROPERTIES_LOGGING_PREFIX + PROPERTIES_LOGGING_LEVEL);
			if (datePattern != null)
				logger.changeDatePattern(datePattern);
			if (messagePattern != null)
				logger.changeMessagePattern(messagePattern);
			if (levelName != null)
				logger.changeLevel(levelName);
		}

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

	/**
	 * Reads the logging properties file in order to configure the logger.
	 * 
	 * @return A Properties object with the contents of the properties file.
	 */
	private Properties readLoggingProperties() {
		try {
			// Loads the properties file from the bundle.
			Bundle bundle = context.getBundle();
			URL propsUrl = bundle.getEntry(PROPERTIES_PATH);
			InputStream in = propsUrl.openStream();

			// Creates a properties object with its contents.
			Properties props = new Properties();
			props.load(in);
			in.close();

			return props;
		}

		// In case the properties file cannot be read, prints a warning and returns null.
		catch (Exception e) {
			String message = logger.formatLogMessage(new Date(System.currentTimeMillis()), BUNDLE_ID, LogService.LOG_WARNING, "Logging properties not found or cannot be read, using default values."); //$NON-NLS-1$
			logger.printLogMessage(message);
		}

		return null;
	}
}
