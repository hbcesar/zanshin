package it.unitn.disi.zanshin.adaptation.qualia.model;

import java.util.List;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface ParameterChangeProcedure extends Procedure {
	/**
	 * TODO: document this method.
	 * @param model
	 * @param awreq
	 * @param parameters
	 * @param values
	 * @return
	 */
	Configuration changeParameters(GoalModel model, AwReq awreq, List<Parameter> parameters, List<String> values);
}
