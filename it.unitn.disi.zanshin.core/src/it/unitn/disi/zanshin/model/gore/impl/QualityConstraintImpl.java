/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Quality Constraint</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.QualityConstraintImpl#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class QualityConstraintImpl extends DefinableRequirementImpl implements QualityConstraint {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected QualityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.QUALITY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Softgoal getSoftgoal() {
		if (eContainerFeatureID() != GorePackage.QUALITY_CONSTRAINT__SOFTGOAL)
			return null;
		return (Softgoal) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSoftgoal(Softgoal newSoftgoal, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSoftgoal, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSoftgoal(Softgoal newSoftgoal) {
		if (newSoftgoal != eInternalContainer() || (eContainerFeatureID() != GorePackage.QUALITY_CONSTRAINT__SOFTGOAL && newSoftgoal != null)) {
			if (EcoreUtil.isAncestor(this, newSoftgoal))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSoftgoal != null)
				msgs = ((InternalEObject) newSoftgoal).eInverseAdd(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
			msgs = basicSetSoftgoal(newSoftgoal, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, newSoftgoal, newSoftgoal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void replaceWith(Requirement newRequirement) {
		// Performs the replacement as a normal requirement first.
		super.replaceWith(newRequirement);

		// Then, replace the relationship quality constraints have with softgoals.
		it.unitn.disi.zanshin.model.gore.Softgoal softgoal = getSoftgoal();
		setSoftgoal(null);
		((QualityConstraint) newRequirement).setSoftgoal(softgoal);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSoftgoal((Softgoal) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
			return eInternalContainer().eInverseRemove(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
			return getSoftgoal();
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
		case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
			setSoftgoal((Softgoal) newValue);
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
		case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
			setSoftgoal((Softgoal) null);
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
		case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
			return getSoftgoal() != null;
		}
		return super.eIsSet(featureID);
	}

} // QualityConstraintImpl
