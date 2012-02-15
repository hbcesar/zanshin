/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Applicability Condition</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getApplicabilityCondition()
 * @model abstract="true"
 * @generated
 */
public interface ApplicabilityCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Strategy</em>' container reference.
	 * @see #setStrategy(AdaptationStrategy)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getApplicabilityCondition_Strategy()
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	AdaptationStrategy getStrategy();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}
	 * ' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Strategy</em>' container reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(AdaptationStrategy value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// This method is not supposed to be called.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method ApplicabilityConditionImpl.evaluate() has been called, but this method is not meant to be called!\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // ApplicabilityCondition
