package it.unitn.disi.zanshin.simulation;

import java.text.MessageFormat;
import java.util.logging.Level;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Logger {
	/** The actual logger. */
	private java.util.logging.Logger logger;
	
	/** Constructor. */
	public Logger(Class<?> clazz) {
		// Loads the proper logger for this class.
		logger = java.util.logging.Logger.getLogger(clazz.getCanonicalName());
	}
	
	/**
	 * Logs a debug message.
	 * 
	 * @param message
	 *          Message to log.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void debug(String message, Object ... params) {
		log(Level.FINEST, message, null, params);
	}

	/**
	 * Logs an informational message.
	 * 
	 * @param message
	 *          Message to log.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void info(String message, Object ... params) {
		log(Level.INFO, message, null, params);
	}

	/**
	 * Logs a warning message.
	 * 
	 * @param message
	 *          Message to log.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void warn(String message, Object ... params) {
		log(Level.WARNING, message, null, params);
	}

	/**
	 * Logs an error message.
	 * 
	 * @param message
	 *          Message to log.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void error(String message, Object ... params) {
		log(Level.SEVERE, message, null, params);
	}

	/**
	 * Logs a debug message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void debug(String message, Throwable error, Object ... params) {
		log(Level.FINEST, message, error, params);
	}

	/**
	 * Logs an informational message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void info(String message, Throwable error, Object ... params) {
		log(Level.INFO, message, error, params);
	}

	/**
	 * Logs a warning message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void warn(String message, Throwable error, Object ... params) {
		log(Level.WARNING, message, error, params);
	}

	/**
	 * Logs an error message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 * @param params
	 *          Message parameters, to be inserted in {0}, {1}, etc. placeholders.
	 */
	public void error(String message, Throwable error, Object ... params) {
		log(Level.SEVERE, message, error, params);
	}
	
	/**
	 * Internal method that processes logging messages from all levels.
	 * 
	 * @param level
	 *          The logging level.
	 * @param message
	 *          The message to log.
	 * @param error
	 *          The associated error.
	 * @param params
	 *          The message's parameters.
	 */
	private void log(Level level, String message, Throwable error, Object ... params) {
		// Formats the message with the given parameters.
		String formattedMessage = MessageFormat.format(message, params);

		// Logs the message using the platform, checking if an error was provided or not.
		if (error == null)
			logger.log(level, formattedMessage);
		else logger.log(level, formattedMessage, error);
	}
}
