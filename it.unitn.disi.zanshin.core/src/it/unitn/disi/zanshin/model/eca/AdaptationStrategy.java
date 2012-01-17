/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy()
 * @model abstract="true"
 * @generated
 */
public interface AdaptationStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Aw Req</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aw Req</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aw Req</em>' container reference.
	 * @see #setAwReq(EcaAwReq)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy_AwReq()
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getStrategies
	 * @model opposite="strategies" transient="false"
	 * @generated
	 */
	EcaAwReq getAwReq();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getAwReq <em>Aw Req</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aw Req</em>' container reference.
	 * @see #getAwReq()
	 * @generated
	 */
	void setAwReq(EcaAwReq value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ApplicabilityCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationStrategy_Condition()
	 * @see it.unitn.disi.zanshin.model.eca.ApplicabilityCondition#getStrategy
	 * @model opposite="strategy" containment="true"
	 * @generated
	 */
	ApplicabilityCondition getCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.AdaptationStrategy#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ApplicabilityCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute(AdaptationSession session);

} // AdaptationStrategy
