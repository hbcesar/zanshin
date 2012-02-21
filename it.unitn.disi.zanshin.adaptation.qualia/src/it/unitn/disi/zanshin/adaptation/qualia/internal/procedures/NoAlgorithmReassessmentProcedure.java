package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractAlgorithmReassessmentProcedure;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.GoalModel;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class NoAlgorithmReassessmentProcedure extends AbstractAlgorithmReassessmentProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.AlgorithmReassessmentProcedure#reassess(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.eca.AdaptationSession) */
	@Override
	public void reassess(GoalModel model, AdaptationSession session) {
		// The no-reassessment procedure, as the name says, does nothing.
		return;
	}
}
