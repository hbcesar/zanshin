package it.unitn.disi.zanshin.adaptation.qualia.internal.services;

import it.unitn.disi.zanshin.adaptation.qualia.model.AdaptationAlgorithm;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.services.IReconfigurationService;

import java.util.List;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class QualiaReconfigurationService implements IReconfigurationService {
	/** This service's ID. */
	private static final String ID = "qualia"; //$NON-NLS-1$
	
	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#getId() */
	@Override
	public String getId() {
		return ID;
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#checkApplicability(java.util.List, it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ApplicabilityCondition) */
	@Override
	public boolean checkApplicability(List<String> procedureIds, AwReq awreq, AdaptationSession session, ApplicabilityCondition wrappedCondition) {
		// Creates the adaptation algorithm given the procedures.
		AdaptationAlgorithm algorithm = new AdaptationAlgorithm(procedureIds);
		
		// FIXME: implement this
		return wrappedCondition.evaluate(session);
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#findConfiguration(java.util.List, it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public Configuration findConfiguration(List<String> procedureIds, AwReq awreq) {
		// Creates the adaptation algorithm given the procedures.
		AdaptationAlgorithm algorithm = new AdaptationAlgorithm(procedureIds);
		
		// FIXME: implement this
		for (String id : procedureIds) System.out.println("############# " + id);
		return null;
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#checkResolution(java.util.List, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ResolutionCondition) */
	@Override
	public boolean checkResolution(List<String> procedureIds, AdaptationSession session, ResolutionCondition wrappedCondition) {
		// Creates the adaptation algorithm given the procedures.
		AdaptationAlgorithm algorithm = new AdaptationAlgorithm(procedureIds);
		
		// FIXME: implement this
		return wrappedCondition.evaluate(session);
	}
}
