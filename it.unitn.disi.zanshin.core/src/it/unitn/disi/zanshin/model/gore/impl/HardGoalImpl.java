/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.HardGoal;
import it.unitn.disi.zanshin.model.gore.RefinementType;
import it.unitn.disi.zanshin.model.gore.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hard Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardGoalImpl extends PerformativeRequirementImpl implements HardGoal {
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
	protected EList<Goal> children;
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.HARD_GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.HARD_GOAL__REFINEMENT_TYPE, oldRefinementType, refinementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Goal>(Goal.class, this, GorePackage.HARD_GOAL__CHILDREN, GorePackage.GOAL__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getParent() {
		if (eContainerFeatureID() != GorePackage.HARD_GOAL__PARENT) return null;
		return (Goal)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Goal newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GorePackage.HARD_GOAL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Goal newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != GorePackage.HARD_GOAL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GorePackage.GOAL__CHILDREN, Goal.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.HARD_GOAL__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel getGoalModel() {
		if (eContainerFeatureID() != GorePackage.HARD_GOAL__GOAL_MODEL) return null;
		return (GoalModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalModel(GoalModel newGoalModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGoalModel, GorePackage.HARD_GOAL__GOAL_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalModel(GoalModel newGoalModel) {
		if (newGoalModel != eInternalContainer() || (eContainerFeatureID() != GorePackage.HARD_GOAL__GOAL_MODEL && newGoalModel != null)) {
			if (EcoreUtil.isAncestor(this, newGoalModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGoalModel != null)
				msgs = ((InternalEObject)newGoalModel).eInverseAdd(this, GorePackage.GOAL_MODEL__ROOT_GOAL, GoalModel.class, msgs);
			msgs = basicSetGoalModel(newGoalModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.HARD_GOAL__GOAL_MODEL, newGoalModel, newGoalModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, GorePackage.HARD_GOAL__TASKS);
		}
		return tasks;
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
			case GorePackage.HARD_GOAL__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case GorePackage.HARD_GOAL__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Goal)otherEnd, msgs);
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGoalModel((GoalModel)otherEnd, msgs);
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
			case GorePackage.HARD_GOAL__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case GorePackage.HARD_GOAL__PARENT:
				return basicSetParent(null, msgs);
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				return basicSetGoalModel(null, msgs);
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
			case GorePackage.HARD_GOAL__PARENT:
				return eInternalContainer().eInverseRemove(this, GorePackage.GOAL__CHILDREN, Goal.class, msgs);
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				return eInternalContainer().eInverseRemove(this, GorePackage.GOAL_MODEL__ROOT_GOAL, GoalModel.class, msgs);
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
			case GorePackage.HARD_GOAL__REFINEMENT_TYPE:
				return getRefinementType();
			case GorePackage.HARD_GOAL__CHILDREN:
				return getChildren();
			case GorePackage.HARD_GOAL__PARENT:
				return getParent();
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				return getGoalModel();
			case GorePackage.HARD_GOAL__TASKS:
				return getTasks();
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
			case GorePackage.HARD_GOAL__REFINEMENT_TYPE:
				setRefinementType((RefinementType)newValue);
				return;
			case GorePackage.HARD_GOAL__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Goal>)newValue);
				return;
			case GorePackage.HARD_GOAL__PARENT:
				setParent((Goal)newValue);
				return;
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				setGoalModel((GoalModel)newValue);
				return;
			case GorePackage.HARD_GOAL__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case GorePackage.HARD_GOAL__REFINEMENT_TYPE:
				setRefinementType(REFINEMENT_TYPE_EDEFAULT);
				return;
			case GorePackage.HARD_GOAL__CHILDREN:
				getChildren().clear();
				return;
			case GorePackage.HARD_GOAL__PARENT:
				setParent((Goal)null);
				return;
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				setGoalModel((GoalModel)null);
				return;
			case GorePackage.HARD_GOAL__TASKS:
				getTasks().clear();
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
			case GorePackage.HARD_GOAL__REFINEMENT_TYPE:
				return refinementType != REFINEMENT_TYPE_EDEFAULT;
			case GorePackage.HARD_GOAL__CHILDREN:
				return children != null && !children.isEmpty();
			case GorePackage.HARD_GOAL__PARENT:
				return getParent() != null;
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				return getGoalModel() != null;
			case GorePackage.HARD_GOAL__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Goal.class) {
			switch (derivedFeatureID) {
				case GorePackage.HARD_GOAL__REFINEMENT_TYPE: return GorePackage.GOAL__REFINEMENT_TYPE;
				case GorePackage.HARD_GOAL__CHILDREN: return GorePackage.GOAL__CHILDREN;
				case GorePackage.HARD_GOAL__PARENT: return GorePackage.GOAL__PARENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Goal.class) {
			switch (baseFeatureID) {
				case GorePackage.GOAL__REFINEMENT_TYPE: return GorePackage.HARD_GOAL__REFINEMENT_TYPE;
				case GorePackage.GOAL__CHILDREN: return GorePackage.HARD_GOAL__CHILDREN;
				case GorePackage.GOAL__PARENT: return GorePackage.HARD_GOAL__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //HardGoalImpl
