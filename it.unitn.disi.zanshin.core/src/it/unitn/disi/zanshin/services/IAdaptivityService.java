package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.AwReq;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IAdaptivityService {
	/**
	 * TODO: document this method.
	 * @param awreq
	 */
	void adaptToFailure(AwReq awreq);
}
