package it.unitn.disi.zanshin.logging;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ZanshinLogger implements LogListener, ServiceListener {
	/** List that keeps track of all log reader services registered in the platform. */
	private List<LogReaderService> readers = new ArrayList<LogReaderService>();

	/** Date/time formatter for log entries. */
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //$NON-NLS-1$

	/** Log level label array. */
	private String[] logLevelLabels = new String[] { "UNKNOWN", "ERROR", "WARNING", "INFO", "DEBUG" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

	/** @see org.osgi.framework.ServiceListener#serviceChanged(org.osgi.framework.ServiceEvent) */
	@Override
	public void serviceChanged(ServiceEvent event) {
		// Keeps track of all log reader services registered in the platform.
		BundleContext bundleContext = event.getServiceReference().getBundle().getBundleContext();
		LogReaderService reader = (LogReaderService) bundleContext.getService(event.getServiceReference());
		if (reader != null) {
			// If a service is being registered, adds the Zanshin log listener to it.
			if (event.getType() == ServiceEvent.REGISTERED)
				addTo(reader);

			// If a service is being unregistered, removes the Zanshin log listener from it.
			else if (event.getType() == ServiceEvent.UNREGISTERING)
				removeFrom(reader);
		}
	}

	/**
	 * Adds this Zanshin log listener to the specified log reader service.
	 * 
	 * @param reader
	 *          The log reader service to which the listener should be added.
	 */
	public void addTo(LogReaderService reader) {
		readers.add(reader);
		reader.addLogListener(this);
	}

	/**
	 * Removes this Zanshin log listener from the specified log reader service.
	 * 
	 * @param reader
	 *          The log reader service from which the listener should be removed.
	 */
	public void removeFrom(LogReaderService reader) {
		reader.removeLogListener(this);
		readers.remove(reader);
	}

	/**
	 * Removes this Zanshin log listener from all the reader services to which it has been added.
	 */
	public void removeFromAll() {
		for (LogReaderService reader : readers)
			removeFrom(reader);
	}

	/** @see org.osgi.service.log.LogListener#logged(org.osgi.service.log.LogEntry) */
	@Override
	public void logged(LogEntry entry) {
		// FIXME: add logging configuration (bundles to show, message pattern, logging level).
		String bundleName = entry.getBundle().getSymbolicName();
		String message = entry.getMessage(); 
		int level = entry.getLevel();

		// Only shows messages from Zanshin bundles and with log level INFO or higher.
		if ((message != null) && (level <= LogService.LOG_INFO) && bundleName.startsWith("it.unitn.disi")) { //$NON-NLS-1$
			// Formats and prints the message.
			String formattedBundleName = (bundleName.substring(14) + "                     ").substring(0, 18); //$NON-NLS-1$
			StringBuilder builder = new StringBuilder();
			builder.append(dateFormat.format(entry.getTime()));
			builder.append(" [").append(formattedBundleName).append("] "); //$NON-NLS-1$ //$NON-NLS-2$
			builder.append(logLevelLabels[level]).append(": "); //$NON-NLS-1$
			builder.append(message);
			System.out.println(builder);
		}
	}
}
