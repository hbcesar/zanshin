/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>eca</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EcaTests("eca Tests"); //$NON-NLS-1$
		suite.addTestSuite(EcaAwReqTest.class);
		suite.addTestSuite(AdaptationSessionTest.class);
		suite.addTestSuite(SimpleResolutionConditionTest.class);
		suite.addTestSuite(SimpleApplicabilityConditionTest.class);
		suite.addTestSuite(RetryStrategyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaTests(String name) {
		super(name);
	}

} //EcaTests
