/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.tests;

import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.eca.EcaFactory;

import it.unitn.disi.zanshin.model.gore.tests.AwReqTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcaAwReqTest extends AwReqTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EcaAwReqTest.class);
	}

	/**
	 * Constructs a new Aw Req test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaAwReqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aw Req test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EcaAwReq getFixture() {
		return (EcaAwReq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcaFactory.eINSTANCE.createEcaAwReq());
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

} //EcaAwReqTest
