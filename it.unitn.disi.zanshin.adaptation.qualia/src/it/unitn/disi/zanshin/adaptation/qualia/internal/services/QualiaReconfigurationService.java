package it.unitn.disi.zanshin.adaptation.qualia.internal.services;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.services.IReconfigurationService;

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

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#checkApplicability(it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ApplicabilityCondition) */
	@Override
	public boolean checkApplicability(AwReq awreq, AdaptationSession session, ApplicabilityCondition wrappedCondition) {
		// TODO Auto-generated method stub
		return wrappedCondition.evaluate(session);
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#findConfiguration(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public Configuration findConfiguration(AwReq awreq) {
		// TODO Auto-generated method stub
		return null;
	}

	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#checkResolution(it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ResolutionCondition) */
	@Override
	public boolean checkResolution(AdaptationSession session, ResolutionCondition wrappedCondition) {
		return wrappedCondition.evaluate(session);
	}
}
