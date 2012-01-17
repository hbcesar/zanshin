/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.tests;

import it.unitn.disi.zanshin.model.gore.GoreFactory;
import it.unitn.disi.zanshin.model.gore.Requirement;

import junit.textui.TestRunner;

import org.eeat.model.LTL.tests.OclAnyTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#findGoalModel() <em>Find Goal Model</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RequirementTest extends OclAnyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementTest.class);
	}

	/**
	 * Constructs a new Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Requirement getFixture() {
		return (Requirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GoreFactory.eINSTANCE.createRequirement());
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
	 * Tests the '{@link it.unitn.disi.zanshin.model.gore.Requirement#findGoalModel() <em>Find Goal Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#findGoalModel()
	 * @generated
	 */
	public void testFindGoalModel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RequirementTest
