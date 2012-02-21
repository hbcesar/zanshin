package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

import java.util.List;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface ValueCalculationProcedure extends Procedure {
	/**
	 * TODO: document this method.
	 * @param model
	 * @param awreq
	 * @param parameters
	 * @return
	 */
	List<String> calculateValues(GoalModel model, AwReq awreq, List<Parameter> parameters);
}
