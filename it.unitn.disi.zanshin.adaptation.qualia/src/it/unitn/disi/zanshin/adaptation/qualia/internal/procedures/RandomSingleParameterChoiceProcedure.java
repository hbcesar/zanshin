package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.QualiaUtils;
import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractParameterChoiceProcedure;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class RandomSingleParameterChoiceProcedure extends AbstractParameterChoiceProcedure {
	/**
	 * @see it.unitn.disi.zanshin.adaptation.qualia.model.ParameterChoiceProcedure#chooseParameters(it.unitn.disi.zanshin.model.gore.GoalModel,
	 *      it.unitn.disi.zanshin.model.gore.AwReq)
	 */
	@Override
	public List<Parameter> chooseParameters(GoalModel model, AwReq awreq) {
		List<Parameter> params = new ArrayList<>();

		// Obtains the relations associated with the given AwReq.
		List<DifferentialRelation> relations = model.filterRelations(awreq);
		
		// Creates a set with the parameters that are associated with these relations, to filter out duplicate params.
		Set<Parameter> paramSet = new HashSet<>();
		for (DifferentialRelation relation : relations)
			// Only adds parameters that are incrementable.
			if (relation.getParameter().incrementableIn(relation))
				paramSet.add(relation.getParameter());
			
		// Selects randomly among the possible parameters.
		Parameter[] paramArray = paramSet.toArray(new Parameter[] {});
		Random random = new Random(System.currentTimeMillis());
		int idx = random.nextInt(paramSet.size());
		params.add(paramArray[idx]);

		return params;
	}

	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.AbstractProcedure#checkApplicability(it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession) */
	@Override
	public boolean checkApplicability(AwReq awreq, AdaptationSession session) {
		// Retrieves the AwReq's goal model. If there is none, then this procedure is not applicable.
		GoalModel model = awreq.findGoalModel();
		if (model == null) {
			QualiaUtils.log.warn("Random Single Parameter Choice procedure is not applicable: the AwReq is null"); //$NON-NLS-1$
			return false;
		}
		
		// If the AwReq has no relations associated to it, then this procedure is not applicable.
		List<DifferentialRelation> relations = model.filterRelations(awreq);
		if (relations.size() == 0) {
			QualiaUtils.log.warn("Random Single Parameter Choice procedure is not applicable: {0} has no relations referring to it", awreq.eClass().getName()); //$NON-NLS-1$
			return false;
		}
		
		// Finally, look for at least one bounded parameter among the existing relations. 
		for (DifferentialRelation relation : relations)
			if (relation.getParameter().incrementableIn(relation))
				return true;
		
		// If none is found, the procedure is not applicable.
		QualiaUtils.log.warn("Random Single Parameter Choice procedure is not applicable: no incrementable parameters were found for {0}", awreq.eClass().getName()); //$NON-NLS-1$
		return false;
	}
}
