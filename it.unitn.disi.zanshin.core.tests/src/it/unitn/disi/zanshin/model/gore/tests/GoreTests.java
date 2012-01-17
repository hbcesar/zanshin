/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gore</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoreTests extends TestSuite {

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
		TestSuite suite = new GoreTests("gore Tests"); //$NON-NLS-1$
		suite.addTestSuite(RequirementTest.class);
		suite.addTestSuite(DefinableRequirementTest.class);
		suite.addTestSuite(SoftgoalTest.class);
		suite.addTestSuite(PerformativeRequirementTest.class);
		suite.addTestSuite(QualityConstraintTest.class);
		suite.addTestSuite(AwReqTest.class);
		suite.addTestSuite(DomainAssumptionTest.class);
		suite.addTestSuite(GoalTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(GoalModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoreTests(String name) {
		super(name);
	}

} //GoreTests
