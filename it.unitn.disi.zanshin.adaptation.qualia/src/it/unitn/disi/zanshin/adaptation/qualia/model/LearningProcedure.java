package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface LearningProcedure extends Procedure {
	/**
	 * TODO: document this method.
	 * @param session
	 */
	void learn(AdaptationSession session);
}
