package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.GoalModel;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface AlgorithmReassessmentProcedure extends Procedure {
	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param session
	 */
	void reassess(GoalModel model, AdaptationSession session);
}
