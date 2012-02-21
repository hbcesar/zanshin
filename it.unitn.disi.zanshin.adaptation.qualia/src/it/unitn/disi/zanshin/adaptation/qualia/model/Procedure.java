package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.AwReq;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Procedure {
	/** TODO: document this field. */
	static final int DEFAULT_REAL_NUMBER_SCALE = 5;
	
	/**
	 * TODO: document this method.
	 * @return
	 */
	String getId();
	
	/**
	 * TODO: document this method.
	 * @param procedureClass
	 * @return
	 */
	<P extends Procedure> P as(Class<P> procedureClass);

	/**
	 * TODO: document this method.
	 * @param adaptationAlgorithm
	 */
	void replaceDefaultProcedure(AdaptationAlgorithm adaptationAlgorithm);
	
	/**
	 * TODO: document this method.
	 * @param awreq
	 * @param session
	 * @return
	 */
	boolean checkApplicability(AwReq awreq, AdaptationSession session);
}
