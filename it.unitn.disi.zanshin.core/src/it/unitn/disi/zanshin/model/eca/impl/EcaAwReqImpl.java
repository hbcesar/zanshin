/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationStrategy;
import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;

import it.unitn.disi.zanshin.model.gore.GOREElement;

import it.unitn.disi.zanshin.model.gore.impl.AwReqImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.EcaAwReqImpl#getSelectedStrategy <em>Selected Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcaAwReqImpl extends AwReqImpl implements EcaAwReq {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ResolutionCondition condition;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationStrategy> strategies;

	/**
	 * The cached value of the '{@link #getSelectedStrategy() <em>Selected Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedStrategy()
	 * @generated
	 * @ordered
	 */
	protected AdaptationStrategy selectedStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcaAwReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.ECA_AW_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ResolutionCondition newCondition, NotificationChain msgs) {
		ResolutionCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcaPackage.ECA_AW_REQ__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ResolutionCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EcaPackage.RESOLUTION_CONDITION__AW_REQ, ResolutionCondition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EcaPackage.RESOLUTION_CONDITION__AW_REQ, ResolutionCondition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ECA_AW_REQ__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationStrategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentWithInverseEList<AdaptationStrategy>(AdaptationStrategy.class, this, EcaPackage.ECA_AW_REQ__STRATEGIES, EcaPackage.ADAPTATION_STRATEGY__AW_REQ);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationStrategy getSelectedStrategy() {
		if (selectedStrategy != null && selectedStrategy.eIsProxy()) {
			InternalEObject oldSelectedStrategy = (InternalEObject)selectedStrategy;
			selectedStrategy = (AdaptationStrategy)eResolveProxy(oldSelectedStrategy);
			if (selectedStrategy != oldSelectedStrategy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY, oldSelectedStrategy, selectedStrategy));
			}
		}
		return selectedStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationStrategy basicGetSelectedStrategy() {
		return selectedStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedStrategy(AdaptationStrategy newSelectedStrategy) {
		AdaptationStrategy oldSelectedStrategy = selectedStrategy;
		selectedStrategy = newSelectedStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY, oldSelectedStrategy, selectedStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void replaceWith(final GOREElement newRequirement) {
		// Performs the replacement as a normal AwReq first.
		super.replaceWith(newRequirement);
		
		// Then, instructs each adaptation strategy to update their own references after the change.
		for (AdaptationStrategy strategy : ((EcaAwReq) newRequirement).getStrategies())
			strategy.updateReferences();
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
			case EcaPackage.ECA_AW_REQ__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcaPackage.ECA_AW_REQ__CONDITION, null, msgs);
				return basicSetCondition((ResolutionCondition)otherEnd, msgs);
			case EcaPackage.ECA_AW_REQ__STRATEGIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStrategies()).basicAdd(otherEnd, msgs);
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
			case EcaPackage.ECA_AW_REQ__CONDITION:
				return basicSetCondition(null, msgs);
			case EcaPackage.ECA_AW_REQ__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
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
			case EcaPackage.ECA_AW_REQ__CONDITION:
				return getCondition();
			case EcaPackage.ECA_AW_REQ__STRATEGIES:
				return getStrategies();
			case EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY:
				if (resolve) return getSelectedStrategy();
				return basicGetSelectedStrategy();
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
			case EcaPackage.ECA_AW_REQ__CONDITION:
				setCondition((ResolutionCondition)newValue);
				return;
			case EcaPackage.ECA_AW_REQ__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends AdaptationStrategy>)newValue);
				return;
			case EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY:
				setSelectedStrategy((AdaptationStrategy)newValue);
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
			case EcaPackage.ECA_AW_REQ__CONDITION:
				setCondition((ResolutionCondition)null);
				return;
			case EcaPackage.ECA_AW_REQ__STRATEGIES:
				getStrategies().clear();
				return;
			case EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY:
				setSelectedStrategy((AdaptationStrategy)null);
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
			case EcaPackage.ECA_AW_REQ__CONDITION:
				return condition != null;
			case EcaPackage.ECA_AW_REQ__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY:
				return selectedStrategy != null;
		}
		return super.eIsSet(featureID);
	}

} //EcaAwReqImpl
