package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GoalModel;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IndicatorEvaluationProcedure extends Procedure {
	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param awreq
	 * @param session
	 * @param wrappedCondition
	 * @return
	 */
	boolean evaluateIndicator(GoalModel model, AwReq awreq, AdaptationSession session, ResolutionCondition wrappedCondition);
}
