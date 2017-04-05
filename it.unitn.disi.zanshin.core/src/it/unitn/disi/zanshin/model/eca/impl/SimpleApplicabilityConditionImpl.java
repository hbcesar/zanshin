/**
 */
package it.unitn.disi.zanshin.model.eca.impl;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.SimpleApplicabilityCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SimpleApplicabilityConditionImpl extends ApplicabilityConditionImpl implements SimpleApplicabilityCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.SIMPLE_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluate(final AdaptationSession session) {
		return true;
	}

} //SimpleApplicabilityConditionImpl
