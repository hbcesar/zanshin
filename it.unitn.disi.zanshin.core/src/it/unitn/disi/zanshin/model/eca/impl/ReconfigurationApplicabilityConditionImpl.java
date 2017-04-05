/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationApplicabilityConditionImpl#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationApplicabilityConditionImpl extends ApplicabilityConditionImpl implements ReconfigurationApplicabilityCondition {
	/**
	 * The cached value of the '{@link #getWrappedCondition() <em>Wrapped Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedCondition()
	 * @generated
	 * @ordered
	 */
	protected ApplicabilityCondition wrappedCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicabilityCondition getWrappedCondition() {
		return wrappedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWrappedCondition(ApplicabilityCondition newWrappedCondition, NotificationChain msgs) {
		ApplicabilityCondition oldWrappedCondition = wrappedCondition;
		wrappedCondition = newWrappedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION, oldWrappedCondition, newWrappedCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedCondition(ApplicabilityCondition newWrappedCondition) {
		if (newWrappedCondition != wrappedCondition) {
			NotificationChain msgs = null;
			if (wrappedCondition != null)
				msgs = ((InternalEObject)wrappedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION, null, msgs);
			if (newWrappedCondition != null)
				msgs = ((InternalEObject)newWrappedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION, null, msgs);
			msgs = basicSetWrappedCondition(newWrappedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION, newWrappedCondition, newWrappedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluate(final AdaptationSession session) {
		// If the wrapped resolution condition wasn't specified, it defaults to a SimpleApplicabilityCondition.
		if (wrappedCondition == null)
			wrappedCondition = it.unitn.disi.zanshin.model.eca.EcaFactory.eINSTANCE.createSimpleApplicabilityCondition();
		
		// Retrieves the reconfiguration strategy.
		it.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = getStrategy();
		String strategyName = strategy.eClass().getName();
		if (!(strategy instanceof it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy)) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("The Reconfiguration Applicability Condition was used with a {0}, but it can only be used with a Reconfiguration Strategy.", strategyName); //$NON-NLS-1$
			return false;
		}
		
		// Attribute algorithmId is mandatory.
		it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy reconfigStrategy = (it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) strategy;
		String algorithmId = reconfigStrategy.getAlgorithmId();
		if (algorithmId == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Strategy {0} is missing mandatory attribute \"algorithmId\" and cannot have its applicability evaluated.", strategyName); //$NON-NLS-1$
			return false;
		}
		
		// Obtains a reference to the reconfiguration service and checks if it exists (if it has been registered).
		it.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);
		if (reconfigService == null) {
			it.unitn.disi.zanshin.core.CoreUtils.log.warn("Attempting to evaluate the applicability of {0}, but an algorithm with id \"{1}\" is not registered!", strategyName, algorithmId); //$NON-NLS-1$
			return false;
		}
		
		// If all is well so far, delegate the applicability evaluation to the reconfiguration service.
		return reconfigService.checkApplicability(reconfigStrategy.getProcedureIds(), reconfigStrategy.getAwReq(), session, wrappedCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				return basicSetWrappedCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				return getWrappedCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				setWrappedCondition((ApplicabilityCondition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				setWrappedCondition((ApplicabilityCondition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				return wrappedCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationApplicabilityConditionImpl
