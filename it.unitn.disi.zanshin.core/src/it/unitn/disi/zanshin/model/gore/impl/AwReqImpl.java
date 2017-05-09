/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.GorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getIncrementCoefficient <em>Increment Coefficient</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwReqImpl extends GOREElementImpl implements AwReq {
	/**
	 * The default value of the '{@link #getIncrementCoefficient() <em>Increment Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double INCREMENT_COEFFICIENT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getIncrementCoefficient() <em>Increment Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double incrementCoefficient = INCREMENT_COEFFICIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.AW_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncrementCoefficient() {
		return incrementCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementCoefficient(double newIncrementCoefficient) {
		double oldIncrementCoefficient = incrementCoefficient;
		incrementCoefficient = newIncrementCoefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__INCREMENT_COEFFICIENT, oldIncrementCoefficient, incrementCoefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getTarget() {
		if (eContainerFeatureID() != GorePackage.AW_REQ__TARGET) return null;
		return (GOREElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(GOREElement newTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTarget, GorePackage.AW_REQ__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GOREElement newTarget) {
		if (newTarget != eInternalContainer() || (eContainerFeatureID() != GorePackage.AW_REQ__TARGET && newTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GorePackage.GORE_ELEMENT__AWREQS, GOREElement.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.AW_REQ__TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget((GOREElement)otherEnd, msgs);
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
			case GorePackage.AW_REQ__TARGET:
				return basicSetTarget(null, msgs);
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
			case GorePackage.AW_REQ__TARGET:
				return eInternalContainer().eInverseRemove(this, GorePackage.GORE_ELEMENT__AWREQS, GOREElement.class, msgs);
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
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				return getIncrementCoefficient();
			case GorePackage.AW_REQ__TARGET:
				return getTarget();
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
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				setIncrementCoefficient((Double)newValue);
				return;
			case GorePackage.AW_REQ__TARGET:
				setTarget((GOREElement)newValue);
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
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				setIncrementCoefficient(INCREMENT_COEFFICIENT_EDEFAULT);
				return;
			case GorePackage.AW_REQ__TARGET:
				setTarget((GOREElement)null);
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
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				return incrementCoefficient != INCREMENT_COEFFICIENT_EDEFAULT;
			case GorePackage.AW_REQ__TARGET:
				return getTarget() != null;
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
		result.append(" (incrementCoefficient: ");
		result.append(incrementCoefficient);
		result.append(')');
		return result.toString();
	}

} //AwReqImpl
