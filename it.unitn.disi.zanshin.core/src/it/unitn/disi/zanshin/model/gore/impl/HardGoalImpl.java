/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.HardGoal;
import it.unitn.disi.zanshin.model.gore.RefinementType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.HardGoalImpl#getGoalModel <em>Goal Model</em>}</li>
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
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> refinements;

	/**
	 * The cached value of the '{@link #getGoalModel() <em>Goal Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalModel()
	 * @generated
	 * @ordered
	 */
	protected GoalModel goalModel;

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
	public EList<Goal> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentEList<Goal>(Goal.class, this, GorePackage.HARD_GOAL__REFINEMENTS);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel getGoalModel() {
		if (goalModel != null && goalModel.eIsProxy()) {
			InternalEObject oldGoalModel = (InternalEObject)goalModel;
			goalModel = (GoalModel)eResolveProxy(oldGoalModel);
			if (goalModel != oldGoalModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.HARD_GOAL__GOAL_MODEL, oldGoalModel, goalModel));
			}
		}
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel basicGetGoalModel() {
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalModel(GoalModel newGoalModel) {
		GoalModel oldGoalModel = goalModel;
		goalModel = newGoalModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.HARD_GOAL__GOAL_MODEL, oldGoalModel, goalModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOREElement> getChildren() {
		EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();
		EList<GOREElement> awreqs_da = (EList<GOREElement>) super.getChildren();
		EList<it.unitn.disi.zanshin.model.gore.Task> tasks = super.getTasks();
		EList<Goal> goals = getRefinements();
										
		for(GOREElement child : awreqs_da){
			children.add(child);
		}
										
		for(GOREElement child : tasks){
			children.add(child);
		}
						
		for(Goal child : goals){
			children.add((GOREElement) child);
		}
										
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.HARD_GOAL__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
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
			case GorePackage.HARD_GOAL__REFINEMENT_TYPE:
				return getRefinementType();
			case GorePackage.HARD_GOAL__REFINEMENTS:
				return getRefinements();
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				if (resolve) return getGoalModel();
				return basicGetGoalModel();
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
			case GorePackage.HARD_GOAL__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends Goal>)newValue);
				return;
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				setGoalModel((GoalModel)newValue);
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
			case GorePackage.HARD_GOAL__REFINEMENTS:
				getRefinements().clear();
				return;
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				setGoalModel((GoalModel)null);
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
			case GorePackage.HARD_GOAL__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case GorePackage.HARD_GOAL__GOAL_MODEL:
				return goalModel != null;
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
				case GorePackage.HARD_GOAL__REFINEMENTS: return GorePackage.GOAL__REFINEMENTS;
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
				case GorePackage.GOAL__REFINEMENTS: return GorePackage.HARD_GOAL__REFINEMENTS;
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
