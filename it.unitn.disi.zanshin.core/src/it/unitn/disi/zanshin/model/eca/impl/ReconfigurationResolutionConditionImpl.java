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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl#getAlgorithmId <em>Algorithm Id</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ReconfigurationResolutionConditionImpl#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationResolutionConditionImpl extends ResolutionConditionImpl implements ReconfigurationResolutionCondition {
	/**
	 * The default value of the '{@link #getAlgorithmId() <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmId() <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmId()
	 * @generated
	 * @ordered
	 */
	protected String algorithmId = ALGORITHM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWrappedCondition() <em>Wrapped Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedCondition()
	 * @generated
	 * @ordered
	 */
	protected ResolutionCondition wrappedCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationResolutionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_RESOLUTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmId() {
		return algorithmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmId(String newAlgorithmId) {
		String oldAlgorithmId = algorithmId;
		algorithmId = newAlgorithmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__ALGORITHM_ID, oldAlgorithmId, algorithmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionCondition getWrappedCondition() {
		return wrappedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWrappedCondition(ResolutionCondition newWrappedCondition, NotificationChain msgs) {
		ResolutionCondition oldWrappedCondition = wrappedCondition;
		wrappedCondition = newWrappedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, oldWrappedCondition, newWrappedCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedCondition(ResolutionCondition newWrappedCondition) {
		if (newWrappedCondition != wrappedCondition) {
			NotificationChain msgs = null;
			if (wrappedCondition != null)
				msgs = ((InternalEObject)wrappedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, null, msgs);
			if (newWrappedCondition != null)
				msgs = ((InternalEObject)newWrappedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, null, msgs);
			msgs = basicSetWrappedCondition(newWrappedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION, newWrappedCondition, newWrappedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluate(AdaptationSession session) {
		// If the current evaluation is Success, the problem is solved. 
		it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();
		if ((awreq != null) && (awreq.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED)) return true;
		
		// Otherwise, if the last applied strategy was "abort", the problem is also solved.
		else if (session.getEvents().size() > 0) {
			it.unitn.disi.zanshin.model.eca.Event lastEvent = session.getEvents().get(session.getEvents().size() - 1);
			it.unitn.disi.zanshin.model.eca.EcaAwReq lastAwReq = (lastEvent == null) ? null : lastEvent.getAwReq();
			it.unitn.disi.zanshin.model.eca.AdaptationStrategy lastStrategy = (lastAwReq == null) ? null : lastAwReq.getSelectedStrategy();
			if ((lastStrategy != null) && (it.unitn.disi.zanshin.model.eca.AbortStrategy.class.isAssignableFrom(lastStrategy.getClass())))
				return true;
		}
		
		// If none of the above, the problem is not yet solved.
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__ALGORITHM_ID:
				return getAlgorithmId();
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
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
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__ALGORITHM_ID:
				setAlgorithmId((String)newValue);
				return;
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
				setWrappedCondition((ResolutionCondition)newValue);
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
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__ALGORITHM_ID:
				setAlgorithmId(ALGORITHM_ID_EDEFAULT);
				return;
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
				setWrappedCondition((ResolutionCondition)null);
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
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__ALGORITHM_ID:
				return ALGORITHM_ID_EDEFAULT == null ? algorithmId != null : !ALGORITHM_ID_EDEFAULT.equals(algorithmId);
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION__WRAPPED_CONDITION:
				return wrappedCondition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (algorithmId: ");
		result.append(algorithmId);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationResolutionConditionImpl
