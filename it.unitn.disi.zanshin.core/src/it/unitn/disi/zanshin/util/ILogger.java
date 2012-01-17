package it.unitn.disi.zanshin.util;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface ILogger {
	/**
	 * Logs a debug message.
	 * 
	 * @param message
	 *          Message to log.
	 */
	public abstract void debug(String message, Object ... params);

	/**
	 * Logs an informational message.
	 * 
	 * @param message
	 *          Message to log.
	 */
	public abstract void info(String message, Object ... params);

	/**
	 * Logs a warning message.
	 * 
	 * @param message
	 *          Message to log.
	 */
	public abstract void warn(String message, Object ... params);

	/**
	 * Logs an error message.
	 * 
	 * @param message
	 *          Message to log.
	 */
	public abstract void error(String message, Object ... params);

	/**
	 * Logs a debug message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 */
	public abstract void debug(String message, Throwable error, Object ... params);

	/**
	 * Logs an informational message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 */
	public abstract void info(String message, Throwable error, Object ... params);

	/**
	 * Logs a warning message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 */
	public abstract void warn(String message, Throwable error, Object ... params);

	/**
	 * Logs an error message with an associated error.
	 * 
	 * @param message
	 *          Message to log.
	 * @param error
	 *          Associated error.
	 */
	public abstract void error(String message, Throwable error, Object ... params);

}
