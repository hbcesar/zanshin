/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.RefinementType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Oriented Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalOrientedRequirementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GoalOrientedRequirementImpl extends GOREElementImpl implements GoalOrientedRequirement {
	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAssumption> assumptions;

	/**
	 * The default value of the '{@link #getRefinementType() <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementType()
	 * @generated
	 * @ordered
	 */
	protected static final RefinementType REFINEMENT_TYPE_EDEFAULT = RefinementType.AND;

	/**
	 * The cached value of the '{@link #getRefinementType() <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementType()
	 * @generated
	 * @ordered
	 */
	protected RefinementType refinementType = REFINEMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalOrientedRequirement> refinements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalOrientedRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GOAL_ORIENTED_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainAssumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectWithInverseResolvingEList<DomainAssumption>(DomainAssumption.class, this, GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS, GorePackage.DOMAIN_ASSUMPTION__PARENT);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType getRefinementType() {
		return refinementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinementType(RefinementType newRefinementType) {
		RefinementType oldRefinementType = refinementType;
		refinementType = newRefinementType == null ? REFINEMENT_TYPE_EDEFAULT : newRefinementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE, oldRefinementType, refinementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalOrientedRequirement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentWithInverseEList<GoalOrientedRequirement>(GoalOrientedRequirement.class, this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOrientedRequirement getParent() {
		if (eContainerFeatureID() != GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT) return null;
		return (GoalOrientedRequirement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(GoalOrientedRequirement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(GoalOrientedRequirement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GoalOrientedRequirement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssumptions()).basicAdd(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinements()).basicAdd(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((GoalOrientedRequirement)otherEnd, msgs);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				return basicSetParent(null, msgs);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GoalOrientedRequirement.class, msgs);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return getAssumptions();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				return getRefinementType();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return getRefinements();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends DomainAssumption>)newValue);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				setRefinementType((RefinementType)newValue);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends GoalOrientedRequirement>)newValue);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				setParent((GoalOrientedRequirement)newValue);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				setRefinementType(REFINEMENT_TYPE_EDEFAULT);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				getRefinements().clear();
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				setParent((GoalOrientedRequirement)null);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				return refinementType != REFINEMENT_TYPE_EDEFAULT;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				return getParent() != null;
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
		result.append(" (refinementType: ");
		result.append(refinementType);
		result.append(')');
		return result.toString();
	}

} //GoalOrientedRequirementImpl
