/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca.tests;

import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Retry Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#execute(it.unitn.disi.zanshin.model.eca.AdaptationSession) <em>Execute</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RetryStrategyTest extends AdaptationStrategyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RetryStrategyTest.class);
	}

	/**
	 * Constructs a new Retry Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryStrategyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Retry Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RetryStrategy getFixture() {
		return (RetryStrategy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcaFactory.eINSTANCE.createRetryStrategy());
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

	/**
	 * Tests the '{@link it.unitn.disi.zanshin.model.eca.RetryStrategy#execute(it.unitn.disi.zanshin.model.eca.AdaptationSession) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.eca.RetryStrategy#execute(it.unitn.disi.zanshin.model.eca.AdaptationSession)
	 * @generated
	 */
	public void testExecute__AdaptationSession() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RetryStrategyTest
