/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL.impl;

import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.eca.impl.EcaPackageImpl;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.impl.GorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eeat.model.LTL.Event;
import org.eeat.model.LTL.LTLFactory;
import org.eeat.model.LTL.LTLPackage;
import org.eeat.model.LTL.OclAny;
import org.eeat.model.LTL.OclMessage;
import org.eeat.model.LTL.PropertyEvent;
import org.eeat.model.LTL.Timeout;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class LTLPackageImpl extends EPackageImpl implements LTLPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclAnyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMessageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEventEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eeat.model.LTL.LTLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LTLPackageImpl() {
		super(eNS_URI, LTLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LTLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LTLPackage init() {
		if (isInited) return (LTLPackage)EPackage.Registry.INSTANCE.getEPackage(LTLPackage.eNS_URI);

		// Obtain or create and register package
		LTLPackageImpl theLTLPackage = (LTLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LTLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LTLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcaPackageImpl theEcaPackage = (EcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI) instanceof EcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI) : EcaPackage.eINSTANCE);
		GorePackageImpl theGorePackage = (GorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI) instanceof GorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI) : GorePackage.eINSTANCE);

		// Create package meta-data objects
		theLTLPackage.createPackageContents();
		theEcaPackage.createPackageContents();
		theGorePackage.createPackageContents();

		// Initialize created meta-data
		theLTLPackage.initializePackageContents();
		theEcaPackage.initializePackageContents();
		theGorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLTLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LTLPackage.eNS_URI, theLTLPackage);
		return theLTLPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclAny() {
		return oclAnyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclMessage() {
		return oclMessageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeout() {
		return timeoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeout_Expression() {
		return (EAttribute)timeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyEvent() {
		return propertyEventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LTLFactory getLTLFactory() {
		return (LTLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oclAnyEClass = createEClass(OCL_ANY);

		oclMessageEClass = createEClass(OCL_MESSAGE);

		timeoutEClass = createEClass(TIMEOUT);
		createEAttribute(timeoutEClass, TIMEOUT__EXPRESSION);

		propertyEventEClass = createEClass(PROPERTY_EVENT);

		eventEClass = createEClass(EVENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oclMessageEClass.getESuperTypes().add(this.getEvent());
		timeoutEClass.getESuperTypes().add(this.getOclAny());
		propertyEventEClass.getESuperTypes().add(this.getEvent());
		eventEClass.getESuperTypes().add(this.getOclAny());
		eventEClass.getESuperTypes().add(ecorePackage.getEObject());

		// Initialize classes and features; add operations and parameters
		initEClass(oclAnyEClass, OclAny.class, "OclAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "after", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "after", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "between", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp3", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "always", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "always", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "always", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "before", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "before", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "before", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "exp2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "eventually", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 1, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "eventually", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "never", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "never", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "never", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "newPEval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "responds", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "stimulus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "response", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "responds", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "stimulus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "response", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "sequence", 0, 1, IS_UNIQUE, !IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "expression", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "sequence", 0, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "expression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, this.getEvent(), "receivedEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, null, "receivedEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getEvent());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(oclAnyEClass, null, "receivedMessages", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "className", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "methodName", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getOclMessage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(oclAnyEClass, null, "receivedMessages", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "methodName", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getOclMessage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(oclAnyEClass, this.getOclMessage(), "receivedMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "methodName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, this.getOclMessage(), "receivedMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "className", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "methodName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, null, "receivedProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getPropertyEvent());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(oclAnyEClass, this.getPropertyEvent(), "receivedProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "responds", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "stimulus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "response", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, this.getTimeout(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "spec", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "unless", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "unless", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "until", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclAnyEClass, ecorePackage.getEBooleanObject(), "until", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclMessageEClass, OclMessage.class, "OclMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(oclMessageEClass, this.getOclAny(), "argument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclMessageEClass, this.getOclAny(), "argument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(oclMessageEClass, null, "arguments", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getOclAny());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(oclMessageEClass, ecorePackage.getEString(), "className", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(oclMessageEClass, ecorePackage.getEString(), "methodName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeoutEClass, Timeout.class, "Timeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeout_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Timeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEventEClass, PropertyEvent.class, "PropertyEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(propertyEventEClass, ecorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEventEClass, ecorePackage.getEBooleanObject(), "satisfied", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEventEClass, ecorePackage.getEDate(), "openDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEventEClass, ecorePackage.getEDate(), "closeDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEventEClass, this.getEvent(), "openEvent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEventEClass, this.getEvent(), "closeEvent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEventEClass, this.getEvent(), "scopeEvent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEventEClass, null, "support", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getPropertyEvent());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(propertyEventEClass, ecorePackage.getEString(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eventEClass, ecorePackage.getEDate(), "date", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eventEClass, ecorePackage.getELong(), "timestamp", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eventEClass, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// LTL.op
		createLTLAnnotations();
		// LTL.scope
		createLTL_1Annotations();
		// LTL.scoped
		createLTL_2Annotations();
		// LTL.noTemplate
		createLTL_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>LTL.op</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLTLAnnotations() {
		String source = "LTL.op";	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(19), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(20), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(21), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(22), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(23), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(24), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(25), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(26), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(27), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(28), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(29), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(30), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(31), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(32), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(33), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclMessageEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclMessageEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclMessageEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>LTL.scope</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLTL_1Annotations() {
		String source = "LTL.scope";	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclAnyEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>LTL.scoped</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLTL_2Annotations() {
		String source = "LTL.scoped";	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(0)).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(1)).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(2)).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(3)).getEParameters().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(7)).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(8)).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((oclAnyEClass.getEOperations().get(9)).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>LTL.noTemplate</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLTL_3Annotations() {
		String source = "LTL.noTemplate";	
		addAnnotation
		  (oclMessageEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclMessageEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (oclMessageEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });
	}

} // LTLPackageImpl
