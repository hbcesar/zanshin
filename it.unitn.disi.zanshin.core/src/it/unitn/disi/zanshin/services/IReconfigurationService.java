package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IReconfigurationService {
	/**
	 * TODO: document this method.
	 * 
	 * @return
	 */
	String getId();

	/**
	 * TODO: document this method.
	 * 
	 * @param awreq
	 * @param session
	 * @param wrappedCondition
	 * @return
	 */
	boolean checkApplicability(AwReq awreq, AdaptationSession session, ApplicabilityCondition wrappedCondition);

	/**
	 * TODO: document this method.
	 * 
	 * @param awreq
	 * @return
	 */
	Configuration findConfiguration(AwReq awreq);

	/**
	 * TODO: document this method.
	 * 
	 * @param session
	 * @param wrappedCondition
	 * @return
	 */
	boolean checkResolution(AdaptationSession session, ResolutionCondition wrappedCondition);
}
