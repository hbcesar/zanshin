/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.Actor;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.Softgoal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Goal Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getRootGoal <em>Root Goal</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getSoftgoals <em>Softgoals</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getAwReqs <em>Aw Reqs</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getActors <em>Actors</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getParameters <em>Parameters</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.GoalModelImpl#getInternalId <em>Internal Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GoalModelImpl extends EObjectImpl implements GoalModel {
	/**
	 * The cached value of the '{@link #getRootGoal() <em>Root Goal</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRootGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal rootGoal;

	/**
	 * The cached value of the '{@link #getSoftgoals() <em>Softgoals</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSoftgoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Softgoal> softgoals;

	/**
	 * The cached value of the '{@link #getAwReqs() <em>Aw Reqs</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAwReqs()
	 * @generated
	 * @ordered
	 */
	protected EList<AwReq> awReqs;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected Long internalId = INTERNAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GoalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GOAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Goal getRootGoal() {
		return rootGoal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRootGoal(Goal newRootGoal, NotificationChain msgs) {
		Goal oldRootGoal = rootGoal;
		rootGoal = newRootGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__ROOT_GOAL, oldRootGoal, newRootGoal);
			if (msgs == null)
				msgs = notification;
			else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRootGoal(Goal newRootGoal) {
		if (newRootGoal != rootGoal) {
			NotificationChain msgs = null;
			if (rootGoal != null)
				msgs = ((InternalEObject) rootGoal).eInverseRemove(this, GorePackage.GOAL__GOAL_MODEL, Goal.class, msgs);
			if (newRootGoal != null)
				msgs = ((InternalEObject) newRootGoal).eInverseAdd(this, GorePackage.GOAL__GOAL_MODEL, Goal.class, msgs);
			msgs = basicSetRootGoal(newRootGoal, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__ROOT_GOAL, newRootGoal, newRootGoal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Softgoal> getSoftgoals() {
		if (softgoals == null) {
			softgoals = new EObjectContainmentWithInverseEList<Softgoal>(Softgoal.class, this, GorePackage.GOAL_MODEL__SOFTGOALS, GorePackage.SOFTGOAL__GOAL_MODEL);
		}
		return softgoals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<AwReq> getAwReqs() {
		if (awReqs == null) {
			awReqs = new EObjectContainmentWithInverseEList<AwReq>(AwReq.class, this, GorePackage.GOAL_MODEL__AW_REQS, GorePackage.AW_REQ__GOAL_MODEL);
		}
		return awReqs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentWithInverseEList<Actor>(Actor.class, this, GorePackage.GOAL_MODEL__ACTORS, GorePackage.ACTOR__GOAL_MODEL);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, GorePackage.GOAL_MODEL__PARAMETERS, GorePackage.PARAMETER__GOAL_MODEL);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Long getInternalId() {
		return internalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Long getId() {
		if (internalId == null)
			internalId = System.currentTimeMillis();
		return internalId;
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			if (rootGoal != null)
				msgs = ((InternalEObject) rootGoal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GorePackage.GOAL_MODEL__ROOT_GOAL, null, msgs);
			return basicSetRootGoal((Goal) otherEnd, msgs);
		case GorePackage.GOAL_MODEL__SOFTGOALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSoftgoals()).basicAdd(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__AW_REQS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAwReqs()).basicAdd(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__ACTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActors()).basicAdd(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			return basicSetRootGoal(null, msgs);
		case GorePackage.GOAL_MODEL__SOFTGOALS:
			return ((InternalEList<?>) getSoftgoals()).basicRemove(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__AW_REQS:
			return ((InternalEList<?>) getAwReqs()).basicRemove(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__ACTORS:
			return ((InternalEList<?>) getActors()).basicRemove(otherEnd, msgs);
		case GorePackage.GOAL_MODEL__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			return getRootGoal();
		case GorePackage.GOAL_MODEL__SOFTGOALS:
			return getSoftgoals();
		case GorePackage.GOAL_MODEL__AW_REQS:
			return getAwReqs();
		case GorePackage.GOAL_MODEL__ACTORS:
			return getActors();
		case GorePackage.GOAL_MODEL__PARAMETERS:
			return getParameters();
		case GorePackage.GOAL_MODEL__INTERNAL_ID:
			return getInternalId();
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			setRootGoal((Goal) newValue);
			return;
		case GorePackage.GOAL_MODEL__SOFTGOALS:
			getSoftgoals().clear();
			getSoftgoals().addAll((Collection<? extends Softgoal>) newValue);
			return;
		case GorePackage.GOAL_MODEL__AW_REQS:
			getAwReqs().clear();
			getAwReqs().addAll((Collection<? extends AwReq>) newValue);
			return;
		case GorePackage.GOAL_MODEL__ACTORS:
			getActors().clear();
			getActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case GorePackage.GOAL_MODEL__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			setRootGoal((Goal) null);
			return;
		case GorePackage.GOAL_MODEL__SOFTGOALS:
			getSoftgoals().clear();
			return;
		case GorePackage.GOAL_MODEL__AW_REQS:
			getAwReqs().clear();
			return;
		case GorePackage.GOAL_MODEL__ACTORS:
			getActors().clear();
			return;
		case GorePackage.GOAL_MODEL__PARAMETERS:
			getParameters().clear();
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
		case GorePackage.GOAL_MODEL__ROOT_GOAL:
			return rootGoal != null;
		case GorePackage.GOAL_MODEL__SOFTGOALS:
			return softgoals != null && !softgoals.isEmpty();
		case GorePackage.GOAL_MODEL__AW_REQS:
			return awReqs != null && !awReqs.isEmpty();
		case GorePackage.GOAL_MODEL__ACTORS:
			return actors != null && !actors.isEmpty();
		case GorePackage.GOAL_MODEL__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case GorePackage.GOAL_MODEL__INTERNAL_ID:
			return INTERNAL_ID_EDEFAULT == null ? internalId != null : !INTERNAL_ID_EDEFAULT.equals(internalId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (internalId: "); //$NON-NLS-1$
		result.append(internalId);
		result.append(')');
		return result.toString();
	}

} // GoalModelImpl
