package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractIndicatorEvaluationProcedure;
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
public class BooleanIndicatorEvaluationProcedure extends AbstractIndicatorEvaluationProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.IndicatorEvaluationProcedure#evaluateIndicator(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ApplicabilityCondition) */
	@Override
	public boolean evaluateIndicator(GoalModel model, AwReq awreq, AdaptationSession session, ResolutionCondition wrappedCondition) {
		// The boolean indicator evaluation procedure just checks the indicator using the wrapped condition.
		return wrappedCondition.evaluate(session);
	}
}
