package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;

/**
 * Class that represents a requirement life-cycle method being called.
 * 
 * This class is used by the monitoring thread, which uses a queue to store such calls when the monitoring service
 * receives them and processes them in a FIFO fashion. The monitoring thread's queue contains objects of this class.
 * 
 * Life-cycle method calls are simple data structures that store the requirement in which the method was called and the
 * type of method that was called (e.g. start(), end(), success(), etc.).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class LifecycleMethodCall {
	/** The requirement in which the method was called. */
	private GOREElement requirement;

	/** The type of method that was called. */
	private MonitorableMethod method;

	/** Constructor. */
	public LifecycleMethodCall(GOREElement requirement, MonitorableMethod method) {
		this.requirement = requirement;
		this.method = method;
	}

	/** Getter for requirement. */
	public GOREElement getRequirement() {
		return requirement;
	}

	/** Getter for method. */
	public MonitorableMethod getMethod() {
		return method;
	}
}
