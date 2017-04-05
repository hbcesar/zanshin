/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.impl.OrRefinedApplicabilityConditionImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrRefinedApplicabilityConditionImpl extends ApplicabilityConditionImpl implements OrRefinedApplicabilityCondition {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicabilityCondition> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrRefinedApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.OR_REFINED_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicabilityCondition> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ApplicabilityCondition>(ApplicabilityCondition.class, this, EcaPackage.OR_REFINED_APPLICABILITY_CONDITION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluate(final AdaptationSession session) {
		// The problem is solved if any child evaluates to true.
		for (it.unitn.disi.zanshin.model.eca.ApplicabilityCondition condition : getChildren())
			if (condition.evaluate(session)) return true;
		
		// If none of them were true, then the problem is not solved.
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION__CHILDREN:
				return getChildren();
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
			case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ApplicabilityCondition>)newValue);
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
			case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION__CHILDREN:
				getChildren().clear();
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
			case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrRefinedApplicabilityConditionImpl
