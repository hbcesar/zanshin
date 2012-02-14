package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;

/**
 * Interface that defines the Monitoring Service. This service is responsible for processing the target system's log,
 * identifying when there has been a change of state in an Awareness Requirement and notifying the Adaptation Service
 * about this change of state.
 * 
 * Monitoring works by processing calls to requirement life-cycle methods (such as start(), end(), success(), etc.) on
 * the requirement instances. This service is defined in a way such that it should be notified of calls to these
 * methods. Although such notification is not the responsibility of the monitoring service, it is suggested that the
 * bundle that provides an implementation to this service also handles this responsibility (e.g., using aspects to
 * intercept the method calls).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IMonitoringService {
	/**
	 * Method called by whoever is responsible for monitoring requirements' life-cycles, indicating there has been a call
	 * to one of the life-cycle methods.
	 * 
	 * @param req
	 *          The requirement on which the call has been made.
	 * @param method
	 *          The type of life-cycle method that has been called.
	 */
	void monitorMethodCall(DefinableRequirement req, MonitorableMethod method);

	/**
	 * Stops the monitoring service, giving its implementation a chance to stop any threads, close resources, etc.
	 */
	void stop();
	
	/** Temporary solution: allows for the monitoring service to receive the simulated monitor. */
	void setSimulatedMonitor(IMonitoringService simulatedMonitor);
}
