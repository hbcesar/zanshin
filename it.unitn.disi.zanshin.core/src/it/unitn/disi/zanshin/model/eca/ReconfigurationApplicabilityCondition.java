/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationApplicabilityCondition()
 * @model
 * @generated
 */
public interface ReconfigurationApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Wrapped Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Condition</em>' containment reference.
	 * @see #setWrappedCondition(ApplicabilityCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationApplicabilityCondition_WrappedCondition()
	 * @model containment="true"
	 * @generated
	 */
	ApplicabilityCondition getWrappedCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Condition</em>' containment reference.
	 * @see #getWrappedCondition()
	 * @generated
	 */
	void setWrappedCondition(ApplicabilityCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // ReconfigurationApplicabilityCondition
