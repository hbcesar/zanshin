/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage
 * @generated
 */
public interface EcaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcaFactory eINSTANCE = it.unitn.disi.zanshin.model.eca.impl.EcaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aw Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aw Req</em>'.
	 * @generated
	 */
	EcaAwReq createEcaAwReq();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Adaptation Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Session</em>'.
	 * @generated
	 */
	AdaptationSession createAdaptationSession();

	/**
	 * Returns a new object of class '<em>Simple Resolution Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Resolution Condition</em>'.
	 * @generated
	 */
	SimpleResolutionCondition createSimpleResolutionCondition();

	/**
	 * Returns a new object of class '<em>Simple Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Applicability Condition</em>'.
	 * @generated
	 */
	SimpleApplicabilityCondition createSimpleApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Retry Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry Strategy</em>'.
	 * @generated
	 */
	RetryStrategy createRetryStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcaPackage getEcaPackage();

} //EcaFactory
