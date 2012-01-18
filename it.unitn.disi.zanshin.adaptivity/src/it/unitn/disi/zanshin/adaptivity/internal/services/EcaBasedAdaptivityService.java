package it.unitn.disi.zanshin.adaptivity.internal.services;

import it.unitn.disi.zanshin.adaptivity.AdaptivityUtils;
import it.unitn.disi.zanshin.model.eca.AbortStrategy;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.services.IAdaptivityService;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class EcaBasedAdaptivityService implements IAdaptivityService {
	/** Repository for active adaptation sessions. */
	private Map<EClass, AdaptationSession> activeSessions = new HashMap<>();

	/** ECA-based model EMF factory used to create new adaptation sessions. */
	private EcaFactory ecaFactory = EcaFactory.eINSTANCE;

	/** @see it.unitn.disi.zanshin.services.IAdaptivityService#adaptToFailure(it.unitn.disi.zanshin.model.gore.AwReq) */
	@Override
	public void adaptToFailure(AwReq awreq) {
		// FIXME: check for nulls?
		EClass awreqClass = awreq.eClass();
		String awreqName = awreqClass.getName();
		String targetName = awreq.getTarget().eClass().getName();
		AdaptivityUtils.log.info("Processing state change: {0} (ref. {1}) -> {2}", awreqName, targetName, awreq.getState()); //$NON-NLS-1$

		// This process is available only for ECA-based AwReqs.
		if (awreq instanceof EcaAwReq) {
			EcaAwReq ecaAwReq = (EcaAwReq) awreq;

			// Checks if the AwReq is complete, i.e., has an resolution condition.
			ResolutionCondition awreqCondition = ecaAwReq.getCondition();
			if (awreqCondition == null) {
				// If the AwReq is not complete, log a warning and stop here.
				AdaptivityUtils.log.warn("AwReq {0} does not have a resolution condition, therefore the adaptivity cannot proceed. Please provide one in the goal model.", awreqName); //$NON-NLS-1$
				return;
			}

			// If there's no active sessions for this AwReq, creates one.
			AdaptationSession session = activeSessions.get(awreqClass);
			if (session == null) {
				session = ecaFactory.createAdaptationSession();
				session.addEvent(ecaAwReq);
				activeSessions.put(awreqClass, session);
				AdaptivityUtils.log.info("{0} Created new session for {1}", session.getId(), awreqName); //$NON-NLS-1$
			}
			
			// If there is, adds the current AwReq's evaluation to the session.
			else {
				AdaptivityUtils.log.info("{0} Retrieved existing session for {1}, {2,choice,0#no events|1#one event|1<{2} events} already in the timeline", session.getId(), awreqName, session.getEvents().size()); //$NON-NLS-1$
				session.addEvent(ecaAwReq);
			}

			// Checks if the problem this adaptation session is dealing with has been solved. If so, stop.
			if (verifyResolution(session, awreqCondition, awreqClass))
				return;

			// Searches for an applicable adaptation strategy for this AwReq.
			AdaptationStrategy selectedStrategy = null;
			for (AdaptationStrategy strategy : ecaAwReq.getStrategies()) {
				// If the strategy has an applicability condition and is applicable, select it.
				ApplicabilityCondition strategyCondition = strategy.getCondition();
				if (strategyCondition != null) {
					if (strategyCondition.evaluate(session)) {
						selectedStrategy = strategy;
						break;
					}
				}

				// If the strategy has no applicability condition, log a warning.
				else AdaptivityUtils.log.warn("AwReq {0} has an adaptation strategy ({1}) without an applicability condition. Please provide one in the goal model.", awreqName, strategy); //$NON-NLS-1$
			}

			// If no applicable strategy was found, selects the Abort strategy.
			if (selectedStrategy == null) {
				AbortStrategy abortStrategy = EcaFactory.eINSTANCE.createAbortStrategy();
				abortStrategy.setAwReq(ecaAwReq);
				abortStrategy.setCondition(EcaFactory.eINSTANCE.createSimpleApplicabilityCondition());
				selectedStrategy = abortStrategy;
			}

			// Applies the selected strategy and registers it in the event timeline.
			String strategyName = selectedStrategy.getClass().getInterfaces()[0].getSimpleName();
			AdaptivityUtils.log.info("{0} Selected adaptation strategy: {1}", session.getId(), strategyName); //$NON-NLS-1$
			selectedStrategy.execute(session);
			ecaAwReq.setSelectedStrategy(selectedStrategy);

			// Checks the resolution again, just to terminate the session if it has.
			verifyResolution(session, awreqCondition, awreqClass);
		}

		// If AwReq is not ECA-based, log a warning.
		else AdaptivityUtils.log.warn("AwReq {0} is not an ECA-based AwReq. Zanshin's adaptivity bundle registered the ECA-based adaptivity service.", awreqName); //$NON-NLS-1$
	}

	private boolean verifyResolution(AdaptationSession session, ResolutionCondition condition, EClass awreqClass) {
		// If the resolution condition is true, deactivate the session and remove it from the active sessions map.
		if (condition.evaluate(session)) {
			AdaptivityUtils.log.info("{0} The problem has been solved or there is nothing else to try. Adaptation session will be terminated.", session.getId()); //$NON-NLS-1$
			session.terminate();
			activeSessions.remove(awreqClass);
			return true;
		}

		// Otherwise, don't do anything.
		AdaptivityUtils.log.info("{0} The problem has not yet been solved...", session.getId()); //$NON-NLS-1$
		return false;
	}
}
