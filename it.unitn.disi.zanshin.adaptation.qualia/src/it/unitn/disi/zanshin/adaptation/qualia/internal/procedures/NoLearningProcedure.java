package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractLearningProcedure;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class NoLearningProcedure extends AbstractLearningProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.LearningProcedure#learn(it.unitn.disi.zanshin.model.eca.AdaptationSession) */
	@Override
	public void learn(AdaptationSession session) {
		// The no-learning procedure, as the name says, does nothing.
		return;
	}
}
