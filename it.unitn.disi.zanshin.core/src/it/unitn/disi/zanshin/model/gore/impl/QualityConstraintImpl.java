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

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl#getTargetSoftGoal <em>Target Soft Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityConstraintImpl extends GOREElementImpl implements QualityConstraint {
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
	public Softgoal getTargetSoftGoal() {
		if (eContainerFeatureID() != GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL) return null;
		return (Softgoal)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetSoftGoal(Softgoal newTargetSoftGoal, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargetSoftGoal, GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSoftGoal(Softgoal newTargetSoftGoal) {
		if (newTargetSoftGoal != eInternalContainer() || (eContainerFeatureID() != GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL && newTargetSoftGoal != null)) {
			if (EcoreUtil.isAncestor(this, newTargetSoftGoal))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetSoftGoal != null)
				msgs = ((InternalEObject)newTargetSoftGoal).eInverseAdd(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
			msgs = basicSetTargetSoftGoal(newTargetSoftGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL, newTargetSoftGoal, newTargetSoftGoal));
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
		it.unitn.disi.zanshin.model.gore.Softgoal softgoal = (it.unitn.disi.zanshin.model.gore.Softgoal) getParent();
		setParent(null);
		((QualityConstraint) newRequirement).setParent(softgoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargetSoftGoal((Softgoal)otherEnd, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				return basicSetTargetSoftGoal(null, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				return eInternalContainer().eInverseRemove(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				return getTargetSoftGoal();
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
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				setTargetSoftGoal((Softgoal)newValue);
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
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				setTargetSoftGoal((Softgoal)null);
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
			case GorePackage.QUALITY_CONSTRAINT__TARGET_SOFT_GOAL:
				return getTargetSoftGoal() != null;
		}
		return super.eIsSet(featureID);
	}

} //QualityConstraintImpl
