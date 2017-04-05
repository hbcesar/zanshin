/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.GorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getIncrementCoefficient <em>Increment Coefficient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwReqImpl extends GOREElementImpl implements AwReq {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected GOREElement target;

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
	public GOREElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (GOREElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.AW_REQ__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GOREElement newTarget) {
		GOREElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__TARGET, oldTarget, target));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GorePackage.AW_REQ__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				return getIncrementCoefficient();
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
			case GorePackage.AW_REQ__TARGET:
				setTarget((GOREElement)newValue);
				return;
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				setIncrementCoefficient((Double)newValue);
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
			case GorePackage.AW_REQ__TARGET:
				setTarget((GOREElement)null);
				return;
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				setIncrementCoefficient(INCREMENT_COEFFICIENT_EDEFAULT);
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
			case GorePackage.AW_REQ__TARGET:
				return target != null;
			case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
				return incrementCoefficient != INCREMENT_COEFFICIENT_EDEFAULT;
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
