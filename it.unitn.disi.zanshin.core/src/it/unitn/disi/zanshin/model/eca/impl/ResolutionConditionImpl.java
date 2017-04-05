/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.ResolutionConditionImpl#getAwReq <em>Aw Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResolutionConditionImpl extends EObjectImpl implements ResolutionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RESOLUTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaAwReq getAwReq() {
		if (eContainerFeatureID() != EcaPackage.RESOLUTION_CONDITION__AW_REQ) return null;
		return (EcaAwReq)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwReq(EcaAwReq newAwReq, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAwReq, EcaPackage.RESOLUTION_CONDITION__AW_REQ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwReq(EcaAwReq newAwReq) {
		if (newAwReq != eInternalContainer() || (eContainerFeatureID() != EcaPackage.RESOLUTION_CONDITION__AW_REQ && newAwReq != null)) {
			if (EcoreUtil.isAncestor(this, newAwReq))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAwReq != null)
				msgs = ((InternalEObject)newAwReq).eInverseAdd(this, EcaPackage.ECA_AW_REQ__CONDITION, EcaAwReq.class, msgs);
			msgs = basicSetAwReq(newAwReq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RESOLUTION_CONDITION__AW_REQ, newAwReq, newAwReq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluate(final AdaptationSession session) {
		// This method is not supposed to be called.
		it.unitn.disi.zanshin.core.CoreUtils.log.error("Method ResolutionConditionImpl.evaluate() has been called, but this method is not meant to be called!"); //$NON-NLS-1$
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAwReq((EcaAwReq)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				return basicSetAwReq(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				return eInternalContainer().eInverseRemove(this, EcaPackage.ECA_AW_REQ__CONDITION, EcaAwReq.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				return getAwReq();
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
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				setAwReq((EcaAwReq)newValue);
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
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				setAwReq((EcaAwReq)null);
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
			case EcaPackage.RESOLUTION_CONDITION__AW_REQ:
				return getAwReq() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResolutionConditionImpl
