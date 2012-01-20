/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.RefinementType;
import it.unitn.disi.zanshin.model.gore.Requirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eeat.model.LTL.impl.OclAnyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.RequirementImpl#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.RequirementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.RequirementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends OclAnyImpl implements Requirement {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.REQUIREMENT__REFINEMENT_TYPE, oldRefinementType, refinementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Requirement>(Requirement.class, this, GorePackage.REQUIREMENT__CHILDREN, GorePackage.REQUIREMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getParent() {
		if (eContainerFeatureID() != GorePackage.REQUIREMENT__PARENT) return null;
		return (Requirement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Requirement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GorePackage.REQUIREMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Requirement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != GorePackage.REQUIREMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GorePackage.REQUIREMENT__CHILDREN, Requirement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.REQUIREMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel findGoalModel() {
		GoalModel model = null;
		
		// First look if the object has a direct relation to the goal model instance.
		if (it.unitn.disi.zanshin.model.gore.Goal.class.isAssignableFrom(getClass()))
			model = ((it.unitn.disi.zanshin.model.gore.Goal) this).getGoalModel();
		else if (it.unitn.disi.zanshin.model.gore.Softgoal.class.isAssignableFrom(getClass()))
			model = ((it.unitn.disi.zanshin.model.gore.Softgoal) this).getGoalModel();
		else if (it.unitn.disi.zanshin.model.gore.AwReq.class.isAssignableFrom(getClass()))
			model = ((it.unitn.disi.zanshin.model.gore.AwReq) this).getGoalModel();
		else if (it.unitn.disi.zanshin.model.gore.QualityConstraint.class.isAssignableFrom(getClass())) {
			it.unitn.disi.zanshin.model.gore.Softgoal softgoal = ((it.unitn.disi.zanshin.model.gore.QualityConstraint) this).getSoftgoal();
			if (softgoal != null) model = softgoal.getGoalModel();
		}
		
		// If the goal model is not directly related, it should still be null. Then, checks the parent (if there is one).
		if ((model == null) && (getParent() != null))
			model = getParent().findGoalModel();
		
		// Returns the found model, or null if no model has been found.
		return model;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getChildrenStateCount() {
		// Counts the number of children in each state and the number of defineable children.
		int[] stateCount = new int[it.unitn.disi.zanshin.model.gore.DefinableRequirementState.VALUES.size()];
		int defChildrenCount = 0;
		for (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren()) {
			if (child instanceof DefinableRequirement) {
				defChildrenCount++;
				stateCount[((DefinableRequirement) child).getState().getValue()]++;
			}
		}
		
		// Converts to EList so we can return, adding the total number of definable children to the last position.
		EList<Integer> stateCountList = new org.eclipse.emf.common.util.BasicEList<>();
		for (int count : stateCount)
			stateCountList.add(count);
		stateCountList.add(defChildrenCount);
		return stateCountList;
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
			case GorePackage.REQUIREMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case GorePackage.REQUIREMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Requirement)otherEnd, msgs);
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
			case GorePackage.REQUIREMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case GorePackage.REQUIREMENT__PARENT:
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
			case GorePackage.REQUIREMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, GorePackage.REQUIREMENT__CHILDREN, Requirement.class, msgs);
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
			case GorePackage.REQUIREMENT__REFINEMENT_TYPE:
				return getRefinementType();
			case GorePackage.REQUIREMENT__CHILDREN:
				return getChildren();
			case GorePackage.REQUIREMENT__PARENT:
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
			case GorePackage.REQUIREMENT__REFINEMENT_TYPE:
				setRefinementType((RefinementType)newValue);
				return;
			case GorePackage.REQUIREMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Requirement>)newValue);
				return;
			case GorePackage.REQUIREMENT__PARENT:
				setParent((Requirement)newValue);
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
			case GorePackage.REQUIREMENT__REFINEMENT_TYPE:
				setRefinementType(REFINEMENT_TYPE_EDEFAULT);
				return;
			case GorePackage.REQUIREMENT__CHILDREN:
				getChildren().clear();
				return;
			case GorePackage.REQUIREMENT__PARENT:
				setParent((Requirement)null);
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
			case GorePackage.REQUIREMENT__REFINEMENT_TYPE:
				return refinementType != REFINEMENT_TYPE_EDEFAULT;
			case GorePackage.REQUIREMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case GorePackage.REQUIREMENT__PARENT:
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
		result.append(" (refinementType: "); //$NON-NLS-1$
		result.append(refinementType);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
