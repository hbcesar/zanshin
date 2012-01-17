/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.tests;

import it.unitn.disi.zanshin.model.gore.tests.GoreTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.eeat.model.LTL.tests.LTLTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Zanshin</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZanshinAllTests extends TestSuite {

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
		TestSuite suite = new ZanshinAllTests("Zanshin Tests"); //$NON-NLS-1$
		suite.addTest(EcaTests.suite());
		suite.addTest(GoreTests.suite());
		suite.addTest(LTLTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZanshinAllTests(String name) {
		super(name);
	}

} //ZanshinAllTests
