package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractParameterChangeProcedure;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GoreFactory;
import it.unitn.disi.zanshin.model.gore.Parameter;

import java.util.List;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimpleParameterChangeProcedure extends AbstractParameterChangeProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.ParameterChangeProcedure#changeParameters(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.AwReq, java.util.List, java.util.List) */
	@Override
	public Configuration changeParameters(GoalModel model, AwReq awreq, List<Parameter> parameters, List<String> values) {
		// Creates a new configuration.
		Configuration cfg = GoreFactory.eINSTANCE.createConfiguration();
		
		// Puts incremented copies of the selected parameters in the configuration.
		for (int i = 0; i < parameters.size(); i++) {
			Parameter param = parameters.get(i);
			String value = values.get(i);
			
			// Retrieves the relation to guide the increment of the parameter.
			DifferentialRelation relation = model.filterRelations(awreq, param, param.getValue());
			Parameter copy = param.createCopy();
			copy.increment(relation, value);
			copy.setConfiguration(cfg);
		}
		
		return cfg;
	}
}
