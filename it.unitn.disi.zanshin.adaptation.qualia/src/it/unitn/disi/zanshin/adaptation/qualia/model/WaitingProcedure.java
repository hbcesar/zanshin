package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GoalModel;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface WaitingProcedure extends Procedure {
	/**
	 * TODO: document this method.
	 * @param model
	 * @param awreq
	 * @return
	 */
	boolean hasWaitedEnough(GoalModel model, AwReq awreq);
}
