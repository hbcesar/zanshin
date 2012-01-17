package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IMonitoringService {
	/**
	 * TODO: document this method.
	 * @param req
	 * @param method
	 */
	void monitorMethodCall(DefinableRequirement req, MonitorableMethod method);
}
