package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractValueCalculationProcedure;
import it.unitn.disi.zanshin.model.gore.AwReq;
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
}
