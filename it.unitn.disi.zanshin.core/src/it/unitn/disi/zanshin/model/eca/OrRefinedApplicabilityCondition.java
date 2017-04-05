/**
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.OrRefinedApplicabilityCondition#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getOrRefinedApplicabilityCondition()
 * @model
 * @generated
 */
public interface OrRefinedApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getOrRefinedApplicabilityCondition_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicabilityCondition> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// The problem is solved if any child evaluates to true.\nfor (it.unitn.disi.zanshin.model.eca.ApplicabilityCondition condition : getChildren())\n\tif (condition.evaluate(session)) return true;\n\n// If none of them were true, then the problem is not solved.\nreturn false;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // OrRefinedApplicabilityCondition
