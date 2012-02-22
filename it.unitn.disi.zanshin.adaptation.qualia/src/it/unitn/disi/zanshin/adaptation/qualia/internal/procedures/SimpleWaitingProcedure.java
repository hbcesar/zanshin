package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractWaitingProcedure;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GoalModel;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimpleWaitingProcedure extends AbstractWaitingProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.WaitingProcedure#hasWaitedEnough(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public boolean hasWaitedEnough(GoalModel model, AwReq awreq) {
		// By default, wait until the next AwReq check, so it's always enough.
		return true;
	}
}
