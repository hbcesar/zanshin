/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Softgoal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityConstraintImpl extends GOREElementImpl implements QualityConstraint {
	/**
	 * The cached value of the '{@link #getSoftgoal() <em>Softgoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftgoal()
	 * @generated
	 * @ordered
	 */
	protected Softgoal softgoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.QUALITY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal getSoftgoal() {
		if (softgoal != null && softgoal.eIsProxy()) {
			InternalEObject oldSoftgoal = (InternalEObject)softgoal;
			softgoal = (Softgoal)eResolveProxy(oldSoftgoal);
			if (softgoal != oldSoftgoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, oldSoftgoal, softgoal));
			}
		}
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal basicGetSoftgoal() {
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftgoal(Softgoal newSoftgoal, NotificationChain msgs) {
		Softgoal oldSoftgoal = softgoal;
		softgoal = newSoftgoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, oldSoftgoal, newSoftgoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftgoal(Softgoal newSoftgoal) {
		if (newSoftgoal != softgoal) {
			NotificationChain msgs = null;
			if (softgoal != null)
				msgs = ((InternalEObject)softgoal).eInverseRemove(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
			if (newSoftgoal != null)
				msgs = ((InternalEObject)newSoftgoal).eInverseAdd(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
			msgs = basicSetSoftgoal(newSoftgoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, newSoftgoal, newSoftgoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void replaceWith(final GoalOrientedRequirement newRequirement) {
		// Performs the replacement as a normal requirement first.
		super.replaceWith(newRequirement);
		
		// Then, replace the relationship quality constraints have with softgoals.
		it.unitn.disi.zanshin.model.gore.Softgoal softgoal = getSoftgoal();
		setSoftgoal(null);
		((QualityConstraint) newRequirement).setSoftgoal(softgoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				if (softgoal != null)
					msgs = ((InternalEObject)softgoal).eInverseRemove(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
				return basicSetSoftgoal((Softgoal)otherEnd, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				return basicSetSoftgoal(null, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				if (resolve) return getSoftgoal();
				return basicGetSoftgoal();
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				setSoftgoal((Softgoal)newValue);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				setSoftgoal((Softgoal)null);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				return softgoal != null;
		}
		return super.eIsSet(featureID);
	}

} //QualityConstraintImpl
