package it.unitn.disi.zanshin.monitoring.internal.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class LifecycleMethodCall {
	/** The requirement in which the method was called. */
	private DefinableRequirement requirement;
	
	/** The type of method that was called. */
	private MonitorableMethod method;

	/** Constructor. */
	public LifecycleMethodCall(DefinableRequirement requirement, MonitorableMethod method) {
		this.requirement = requirement;
		this.method = method;
	}

	/** Getter for requirement. */
	public DefinableRequirement getRequirement() {
		return requirement;
	}

	/** Getter for method. */
	public MonitorableMethod getMethod() {
		return method;
	}

}
