package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractValueCalculationProcedure extends AbstractProcedure implements ValueCalculationProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.Procedure#replaceDefaultProcedure(it.unitn.disi.zanshin.adaptation.qualia.model.AdaptationAlgorithm) */
	@Override
	public void replaceDefaultProcedure(AdaptationAlgorithm adaptationAlgorithm) {
		adaptationAlgorithm.setValueCalculationProcedure(this);
	}

	/**
	 * TODO: document this method.
	 * @param model
	 * @param param
	 * @param awreq
	 * @param incrementValue
	 * @return
	 */
	protected String checkBounds(GoalModel model, Parameter param, AwReq awreq, String incrementValue) {
		// Retrieves the relation between this parameter and the indicator.
		String value = param.getValue();
		DifferentialRelation relation = model.filterRelations(awreq, param, value);

		// Uses a fake parameter, incrementing it to check if it would be off-bounds.
		Parameter fakeParam = param.createCopy();
		fakeParam.increment(relation, incrementValue);

		// If the parameter is outside bounds, set the increment value to be the difference between the value and boundary.
		if (!fakeParam.withinBoundsOf(relation))
			switch (relation.getOperator()) {
			case FEWER_THAN:
				return param.subtractedFrom(relation.getLowerBound());
			case GREATER_THAN:
				fakeParam.setValue(relation.getUpperBound());
				return fakeParam.subtractedFrom(param.getValue());
			}

		// Otherwise, return the provided increment value (no problem with it).
		return incrementValue;
	}
}
