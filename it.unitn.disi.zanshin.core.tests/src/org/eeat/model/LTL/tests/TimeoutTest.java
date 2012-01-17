/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL.tests;

import junit.textui.TestRunner;

import org.eeat.model.LTL.LTLFactory;
import org.eeat.model.LTL.Timeout;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timeout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeoutTest extends OclAnyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeoutTest.class);
	}

	/**
	 * Constructs a new Timeout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timeout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Timeout getFixture() {
		return (Timeout)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LTLFactory.eINSTANCE.createTimeout());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TimeoutTest
