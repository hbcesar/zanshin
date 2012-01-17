/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getSimpleApplicabilityCondition()
 * @model
 * @generated
 */
public interface SimpleApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // SimpleApplicabilityCondition
