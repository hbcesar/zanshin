/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.tests;

import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.GoreFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain Assumption</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainAssumptionTest extends DefinableRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainAssumptionTest.class);
	}

	/**
	 * Constructs a new Domain Assumption test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssumptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain Assumption test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DomainAssumption getFixture() {
		return (DomainAssumption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GoreFactory.eINSTANCE.createDomainAssumption());
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

} //DomainAssumptionTest
