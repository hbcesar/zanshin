package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.QualiaUtils;
import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractValueCalculationProcedure;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimpleValueCalculationProcedure extends AbstractValueCalculationProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.ValueCalculationProcedure#calculateValues(it.unitn.disi.zanshin.model.gore.GoalModel, it.unitn.disi.zanshin.model.gore.AwReq, java.util.List) */
	@Override
	public List<String> calculateValues(GoalModel model, AwReq awreq, List<Parameter> parameters) {
		List<String> values = new ArrayList<>();
		
		// Obtains the coefficient of increment K from the failed AwReq.
		double dK = awreq.getIncrementCoefficient();
		BigDecimal k = new BigDecimal(dK).setScale(DEFAULT_REAL_NUMBER_SCALE, BigDecimal.ROUND_HALF_UP);
		
		// Processes each of the chosen parameters.
		for (Parameter param : parameters) {
			// Creates a fake parameter and obtains the increment value V = K * U.
			Parameter fakeParam = param.createCopy();
			fakeParam.setValue(fakeParam.getUnit());
			String v = fakeParam.multipliedBy(k.toPlainString());
			
			// Checks the boundaries, changing V accordingly if it's going to go over the boundary.
			v = checkBounds(model, param, awreq, v);
			values.add(v);
		}
		
		return values;
	}

	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.AbstractProcedure#checkApplicability(it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession) */
	@Override
	public boolean checkApplicability(AwReq awreq, AdaptationSession session) {
		// Retrieves the AwReq's goal model. If there is none, then this procedure is not applicable.
		GoalModel model = awreq.findGoalModel();
		if (model == null) {
			QualiaUtils.log.warn("Simple Value Calculation procedure is not applicable: the AwReq is null"); //$NON-NLS-1$
			return false;
		}
		
		// If the AwReq has no relations associated to it, then this procedure is not applicable.
		List<DifferentialRelation> relations = model.filterRelations(awreq);
		if (relations.size() == 0) {
			QualiaUtils.log.warn("Simple Value Calculation procedure is not applicable: {0} has no relations referring to it", awreq.eClass().getName()); //$NON-NLS-1$
			return false;
		}
		
		// Check that all parameters have their unit of increment set. 
		for (DifferentialRelation relation : relations) {
			String unit = relation.getParameter().getUnit(); 
			if ((unit == null) || (unit.trim().length() == 0)) {
				QualiaUtils.log.warn("Simple Value Calculation procedure is not applicable: parameter {0}, associated with AwReq {1}, has no increment unit defined", relation.getParameter().eClass().getName(), awreq.eClass().getName()); //$NON-NLS-1$
				return false;
			}
		}
		
		// If no problem was found, the procedure is applicable.
		return true;
	}
}
