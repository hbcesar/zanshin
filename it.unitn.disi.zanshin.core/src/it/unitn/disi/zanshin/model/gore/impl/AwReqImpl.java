/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getOtherTargets <em>Other Targets</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwReqImpl extends DefinableRequirementImpl implements AwReq {
	/**
	 * The cached value of the '{@link #getOtherTargets() <em>Other Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinableRequirement> otherTargets;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DefinableRequirement target;

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
	public EList<DefinableRequirement> getOtherTargets() {
		if (otherTargets == null) {
			otherTargets = new EObjectResolvingEList<DefinableRequirement>(DefinableRequirement.class, this, GorePackage.AW_REQ__OTHER_TARGETS);
		}
		return otherTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinableRequirement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (DefinableRequirement)eResolveProxy(oldTarget);
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
	public DefinableRequirement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DefinableRequirement newTarget) {
		DefinableRequirement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel getGoalModel() {
		if (eContainerFeatureID() != GorePackage.AW_REQ__GOAL_MODEL) return null;
		return (GoalModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalModel(GoalModel newGoalModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGoalModel, GorePackage.AW_REQ__GOAL_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalModel(GoalModel newGoalModel) {
		if (newGoalModel != eInternalContainer() || (eContainerFeatureID() != GorePackage.AW_REQ__GOAL_MODEL && newGoalModel != null)) {
			if (EcoreUtil.isAncestor(this, newGoalModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGoalModel != null)
				msgs = ((InternalEObject)newGoalModel).eInverseAdd(this, GorePackage.GOAL_MODEL__AW_REQS, GoalModel.class, msgs);
			msgs = basicSetGoalModel(newGoalModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__GOAL_MODEL, newGoalModel, newGoalModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.AW_REQ__GOAL_MODEL:
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
			case GorePackage.AW_REQ__GOAL_MODEL:
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
			case GorePackage.AW_REQ__GOAL_MODEL:
				return eInternalContainer().eInverseRemove(this, GorePackage.GOAL_MODEL__AW_REQS, GoalModel.class, msgs);
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
			case GorePackage.AW_REQ__OTHER_TARGETS:
				return getOtherTargets();
			case GorePackage.AW_REQ__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GorePackage.AW_REQ__GOAL_MODEL:
				return getGoalModel();
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
			case GorePackage.AW_REQ__OTHER_TARGETS:
				getOtherTargets().clear();
				getOtherTargets().addAll((Collection<? extends DefinableRequirement>)newValue);
				return;
			case GorePackage.AW_REQ__TARGET:
				setTarget((DefinableRequirement)newValue);
				return;
			case GorePackage.AW_REQ__GOAL_MODEL:
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
			case GorePackage.AW_REQ__OTHER_TARGETS:
				getOtherTargets().clear();
				return;
			case GorePackage.AW_REQ__TARGET:
				setTarget((DefinableRequirement)null);
				return;
			case GorePackage.AW_REQ__GOAL_MODEL:
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
			case GorePackage.AW_REQ__OTHER_TARGETS:
				return otherTargets != null && !otherTargets.isEmpty();
			case GorePackage.AW_REQ__TARGET:
				return target != null;
			case GorePackage.AW_REQ__GOAL_MODEL:
				return getGoalModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //AwReqImpl
