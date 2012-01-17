/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eeat.model.LTL.LTLFactory;
import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ocl Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>After</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean) <em>After</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#between(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean) <em>Between</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#always(java.lang.Boolean) <em>Always</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#always(java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Always</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Before</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean) <em>Before</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#eventually(java.lang.Boolean) <em>Eventually</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#never(java.lang.Boolean) <em>Never</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#never(java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Never</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean) <em>Responds</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Responds</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#unless(java.lang.Boolean) <em>Unless</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#until(java.lang.Boolean) <em>Until</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#sequence(org.eclipse.emf.common.util.EList) <em>Sequence</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#sequence(org.eclipse.emf.common.util.EList, org.eeat.model.LTL.Timeout) <em>Sequence</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#timeout(java.lang.String) <em>Timeout</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedMessages(java.lang.String) <em>Received Messages</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedMessage(java.lang.String) <em>Received Message</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedMessage(java.lang.String, java.lang.String) <em>Received Message</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#newPEval(java.lang.Boolean) <em>New PEval</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean, java.lang.String) <em>After</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean, java.lang.String) <em>Before</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#eventually(java.lang.Boolean, java.lang.String) <em>Eventually</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#always(java.lang.Boolean, java.lang.String) <em>Always</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#never(java.lang.Boolean, java.lang.String) <em>Never</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean, java.lang.String) <em>Responds</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#unless(java.lang.Boolean, java.lang.String) <em>Unless</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#until(java.lang.Boolean, java.lang.String) <em>Until</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedProperties(java.lang.String) <em>Received Properties</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedProperty(java.lang.String) <em>Received Property</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedEvent(java.lang.String) <em>Received Event</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedEvents(java.lang.String) <em>Received Events</em>}</li>
 *   <li>{@link org.eeat.model.LTL.OclAny#receivedMessages(java.lang.String, java.lang.String) <em>Received Messages</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OclAnyTest extends TestCase {

	/**
	 * The fixture for this Ocl Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclAny fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OclAnyTest.class);
	}

	/**
	 * Constructs a new Ocl Any test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclAnyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ocl Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OclAny fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ocl Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclAny getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LTLFactory.eINSTANCE.createOclAny());
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
	 * Tests the '{@link org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout)
	 * @generated
	 */
	public void testAfter__Boolean_Boolean_Timeout() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean) <em>After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	public void testAfter__Boolean_Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#between(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean) <em>Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#between(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	public void testBetween__Boolean_Boolean_Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#always(java.lang.Boolean) <em>Always</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#always(java.lang.Boolean)
	 * @generated
	 */
	public void testAlways__Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#always(java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Always</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#always(java.lang.Boolean, org.eeat.model.LTL.Timeout)
	 * @generated
	 */
	public void testAlways__Boolean_Timeout() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout)
	 * @generated
	 */
	public void testBefore__Boolean_Boolean_Timeout() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean) <em>Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	public void testBefore__Boolean_Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#eventually(java.lang.Boolean) <em>Eventually</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#eventually(java.lang.Boolean)
	 * @generated
	 */
	public void testEventually__Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#never(java.lang.Boolean) <em>Never</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#never(java.lang.Boolean)
	 * @generated
	 */
	public void testNever__Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#never(java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Never</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#never(java.lang.Boolean, org.eeat.model.LTL.Timeout)
	 * @generated
	 */
	public void testNever__Boolean_Timeout() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean) <em>Responds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	public void testResponds__Boolean_Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout) <em>Responds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean, org.eeat.model.LTL.Timeout)
	 * @generated
	 */
	public void testResponds__Boolean_Boolean_Timeout() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#unless(java.lang.Boolean) <em>Unless</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#unless(java.lang.Boolean)
	 * @generated
	 */
	public void testUnless__Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#until(java.lang.Boolean) <em>Until</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#until(java.lang.Boolean)
	 * @generated
	 */
	public void testUntil__Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#sequence(org.eclipse.emf.common.util.EList) <em>Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#sequence(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testSequence__EList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#sequence(org.eclipse.emf.common.util.EList, org.eeat.model.LTL.Timeout) <em>Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#sequence(org.eclipse.emf.common.util.EList, org.eeat.model.LTL.Timeout)
	 * @generated
	 */
	public void testSequence__EList_Timeout() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#timeout(java.lang.String) <em>Timeout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#timeout(java.lang.String)
	 * @generated
	 */
	public void testTimeout__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedMessages(java.lang.String) <em>Received Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedMessages(java.lang.String)
	 * @generated
	 */
	public void testReceivedMessages__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedMessage(java.lang.String) <em>Received Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedMessage(java.lang.String)
	 * @generated
	 */
	public void testReceivedMessage__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedMessage(java.lang.String, java.lang.String) <em>Received Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedMessage(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testReceivedMessage__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#newPEval(java.lang.Boolean) <em>New PEval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#newPEval(java.lang.Boolean)
	 * @generated
	 */
	public void testNewPEval__Boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean, java.lang.String) <em>After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#after(java.lang.Boolean, java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testAfter__Boolean_Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean, java.lang.String) <em>Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#before(java.lang.Boolean, java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testBefore__Boolean_Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#eventually(java.lang.Boolean, java.lang.String) <em>Eventually</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#eventually(java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testEventually__Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#always(java.lang.Boolean, java.lang.String) <em>Always</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#always(java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testAlways__Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#never(java.lang.Boolean, java.lang.String) <em>Never</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#never(java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testNever__Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean, java.lang.String) <em>Responds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#responds(java.lang.Boolean, java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testResponds__Boolean_Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#unless(java.lang.Boolean, java.lang.String) <em>Unless</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#unless(java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testUnless__Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#until(java.lang.Boolean, java.lang.String) <em>Until</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#until(java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	public void testUntil__Boolean_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedProperties(java.lang.String) <em>Received Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedProperties(java.lang.String)
	 * @generated
	 */
	public void testReceivedProperties__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedProperty(java.lang.String) <em>Received Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedProperty(java.lang.String)
	 * @generated
	 */
	public void testReceivedProperty__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedEvent(java.lang.String) <em>Received Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedEvent(java.lang.String)
	 * @generated
	 */
	public void testReceivedEvent__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedEvents(java.lang.String) <em>Received Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedEvents(java.lang.String)
	 * @generated
	 */
	public void testReceivedEvents__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eeat.model.LTL.OclAny#receivedMessages(java.lang.String, java.lang.String) <em>Received Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeat.model.LTL.OclAny#receivedMessages(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testReceivedMessages__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //OclAnyTest
