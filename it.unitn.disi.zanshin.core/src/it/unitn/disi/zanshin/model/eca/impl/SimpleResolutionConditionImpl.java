/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Simple Resolution Condition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class SimpleResolutionConditionImpl extends ResolutionConditionImpl implements SimpleResolutionCondition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SimpleResolutionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.SIMPLE_RESOLUTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// Retrieves the last AwReq that was evaluated. If not directly related, get from the event list.
		it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();
		org.eclipse.emf.common.util.EList<it.unitn.disi.zanshin.model.eca.Event> events = session.getEvents();
		if ((awreq == null) && (events.size() > 0))
			awreq = events.get(events.size() - 1).getAwReq();

		// If the current evaluation is Success, the problem is solved.
		if ((awreq != null) && (awreq.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED))
			return true;

		// Otherwise, if the last applied strategy was "abort", the problem is also solved.
		else if (events.size() > 0) {
			it.unitn.disi.zanshin.model.eca.Event lastEvent = events.get(events.size() - 1);
			it.unitn.disi.zanshin.model.eca.EcaAwReq lastAwReq = (lastEvent == null) ? null : lastEvent.getAwReq();
			it.unitn.disi.zanshin.model.eca.AdaptationStrategy lastStrategy = (lastAwReq == null) ? null : lastAwReq.getSelectedStrategy();
			if ((lastStrategy != null) && (it.unitn.disi.zanshin.model.eca.EcaPackage.eINSTANCE.getAbortStrategy().isInstance(lastStrategy)))
				return true;
		}

		// If none of the above, the problem is not yet solved.
		return false;
	}

} // SimpleResolutionConditionImpl
