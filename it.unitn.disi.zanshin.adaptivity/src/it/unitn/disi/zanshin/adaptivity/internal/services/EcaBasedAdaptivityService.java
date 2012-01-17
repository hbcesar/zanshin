package it.unitn.disi.zanshin.adaptivity.internal.services;

import it.unitn.disi.zanshin.adaptivity.AdaptivityUtils;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.services.IAdaptivityService;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class EcaBasedAdaptivityService implements IAdaptivityService {
	/** Repository for active adaptation sessions. */
	private Map<EcaAwReq, AdaptationSession> activeSessions = new HashMap<EcaAwReq, AdaptationSession>();
	
	/** ECA-based model EMF factory used to create new adaptation sessions. */
	private EcaFactory ecaFactory = EcaFactory.eINSTANCE;
	
	/** @see it.unitn.disi.zanshin.services.IAdaptivityService#adaptToFailure(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void adaptToFailure(AwReq awreq) {
		AdaptivityUtils.log.info("Adapting to failure: {0} -> {1}", new Object[] {awreq.getClass().getSimpleName(), awreq.getTarget().getClass().getSimpleName()}); //$NON-NLS-1$

		// This process is available only for ECA-based AwReqs.
		if (awreq instanceof EcaAwReq) {
			EcaAwReq ecaAwReq = (EcaAwReq) awreq;
			
			// Checks if there's already an adaptation session for this AwReq. Creates one if there isn't.
			AdaptationSession session = activeSessions.get(ecaAwReq);
			if (session == null) {
				session = ecaFactory.createAdaptationSession();
				activeSessions.put(ecaAwReq, session);
			}
			
			// Adds the current AwReq's evaluation to the session.
			session.addEvent(ecaAwReq);
			
			System.out.println("############ ECA AwReq OK!"); //$NON-NLS-1$
			
			// Checks if the problem this adaptation session is dealing with has been solved. If so, stop.
			// FIXME: continue here...
			// - Check for nulls? What to do if it is null?
			// - Terminate the session if the problem is solved! Change the algorithm in the paper?
			// - Add some logging...
//			if (ecaAwReq.getCondition().evaluate(session)) {
//				
//			}
		}
	}
}
