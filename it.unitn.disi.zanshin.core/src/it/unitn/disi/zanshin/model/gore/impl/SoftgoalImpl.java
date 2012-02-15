/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;

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

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Softgoal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl#getConstraints <em>Constraints</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.SoftgoalImpl#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SoftgoalImpl extends RequirementImpl implements Softgoal {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityConstraint> constraints;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SoftgoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.SOFTGOAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<QualityConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<QualityConstraint>(QualityConstraint.class, this, GorePackage.SOFTGOAL__CONSTRAINTS, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GoalModel getGoalModel() {
		if (eContainerFeatureID() != GorePackage.SOFTGOAL__GOAL_MODEL)
			return null;
		return (GoalModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetGoalModel(GoalModel newGoalModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGoalModel, GorePackage.SOFTGOAL__GOAL_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGoalModel(GoalModel newGoalModel) {
		if (newGoalModel != eInternalContainer() || (eContainerFeatureID() != GorePackage.SOFTGOAL__GOAL_MODEL && newGoalModel != null)) {
			if (EcoreUtil.isAncestor(this, newGoalModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGoalModel != null)
				msgs = ((InternalEObject) newGoalModel).eInverseAdd(this, GorePackage.GOAL_MODEL__SOFTGOALS, GoalModel.class, msgs);
			msgs = basicSetGoalModel(newGoalModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.SOFTGOAL__GOAL_MODEL, newGoalModel, newGoalModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void replaceWith(Requirement newRequirement) {
		// Performs the replacement as a normal requirement first.
		super.replaceWith(newRequirement);

		// Then, replace the relationship softgoals have with the goal model.
		it.unitn.disi.zanshin.model.gore.GoalModel model = getGoalModel();
		setGoalModel(null);
		((Softgoal) newRequirement).setGoalModel(model);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorePackage.SOFTGOAL__CONSTRAINTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGoalModel((GoalModel) otherEnd, msgs);
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
		case GorePackage.SOFTGOAL__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			return basicSetGoalModel(null, msgs);
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
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			return eInternalContainer().eInverseRemove(this, GorePackage.GOAL_MODEL__SOFTGOALS, GoalModel.class, msgs);
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
		case GorePackage.SOFTGOAL__CONSTRAINTS:
			return getConstraints();
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			return getGoalModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GorePackage.SOFTGOAL__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends QualityConstraint>) newValue);
			return;
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			setGoalModel((GoalModel) newValue);
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
		case GorePackage.SOFTGOAL__CONSTRAINTS:
			getConstraints().clear();
			return;
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			setGoalModel((GoalModel) null);
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
		case GorePackage.SOFTGOAL__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case GorePackage.SOFTGOAL__GOAL_MODEL:
			return getGoalModel() != null;
		}
		return super.eIsSet(featureID);
	}

} // SoftgoalImpl
