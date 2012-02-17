/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Reconfiguration Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl#getWrappedCondition <em>
 * Wrapped Condition</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReconfigurationResolutionConditionImpl extends ResolutionConditionImpl implements ReconfigurationResolutionCondition {
	/**
	 * The cached value of the '{@link #getWrappedCondition() <em>Wrapped Condition</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWrappedCondition()
	 * @generated
	 * @ordered
	 */
	protected ResolutionCondition wrappedCondition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReconfigurationResolutionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_RESOLUTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolutionCondition getWrappedCondition() {
		return wrappedCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetWrappedCondition(ResolutionCondition newWrappedCondition, NotificationChain msgs) {
		ResolutionCondition oldWrappedCondition = wrappedCondition;
		wrappedCondition = newWrappedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, oldWrappedCondition, newWrappedCondition);
			if (msgs == null)
				msgs = notification;
			else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWrappedCondition(ResolutionCondition newWrappedCondition) {
		if (newWrappedCondition != wrappedCondition) {
			NotificationChain msgs = null;
			if (wrappedCondition != null)
				msgs = ((InternalEObject) wrappedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, null, msgs);
			if (newWrappedCondition != null)
				msgs = ((InternalEObject) newWrappedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, null, msgs);
			msgs = basicSetWrappedCondition(newWrappedCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, newWrappedCondition, newWrappedCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// If the wrapped resolution condition wasn't specified, it defaults to a SimpleResolutionCondition.
		if (wrappedCondition == null)
			wrappedCondition = it.unitn.disi.zanshin.model.eca.EcaFactory.eINSTANCE.createSimpleResolutionCondition();

		// Checks if this reconfiguration algorithm has been used before and retrieve the algorithm id.
		String algorithmId = null;
		for (it.unitn.disi.zanshin.model.eca.Event event : session.getEvents()) {
			it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = (event == null) ? null : event.getAwReq();
			it.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = (awreq == null) ? null : awreq.getSelectedStrategy();
			if (strategy instanceof it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy)
				algorithmId = ((it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) strategy).getAlgorithmId();
		}

		// If it hasn't been used, just use the wrapped condition to evaluate resolution.
		if (algorithmId == null)
			return wrappedCondition.evaluate(session);

		// Otherwise, retrieve the reconfiguration service and delegate the evaluation to it.
		it.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);
		if (reconfigService == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to evaluate resolution with Reconfiguration Resolution Condition, but an algorithm with id \"{0}\" is not registered! Falling back to the wrapped condition.", algorithmId); //$NON-NLS-1$
			return wrappedCondition.evaluate(session);
		}
		return reconfigService.checkResolution(session, wrappedCondition);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
			return basicSetWrappedCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
			return getWrappedCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
			setWrappedCondition((ResolutionCondition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
			setWrappedCondition((ResolutionCondition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
			return wrappedCondition != null;
		}
		return super.eIsSet(featureID);
	}

} // ReconfigurationResolutionConditionImpl
