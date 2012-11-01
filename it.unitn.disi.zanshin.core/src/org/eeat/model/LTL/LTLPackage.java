/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eeat.model.LTL.LTLFactory
 * @model kind="package"
 * @generated
 */
public interface LTLPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "LTL"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://disi.unitn.it/zanshin/1.0/ltl"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eeat.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	LTLPackage eINSTANCE = org.eeat.model.LTL.impl.LTLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eeat.model.LTL.impl.OclAnyImpl <em>Ocl Any</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eeat.model.LTL.impl.OclAnyImpl
	 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getOclAny()
	 * @generated
	 */
	int OCL_ANY = 0;

	/**
	 * The number of structural features of the '<em>Ocl Any</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eeat.model.LTL.impl.EventImpl <em>Event</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eeat.model.LTL.impl.EventImpl
	 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eeat.model.LTL.impl.OclMessageImpl <em>Ocl Message</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eeat.model.LTL.impl.OclMessageImpl
	 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getOclMessage()
	 * @generated
	 */
	int OCL_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Ocl Message</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eeat.model.LTL.impl.TimeoutImpl <em>Timeout</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eeat.model.LTL.impl.TimeoutImpl
	 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getTimeout()
	 * @generated
	 */
	int TIMEOUT = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__EXPRESSION = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timeout</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eeat.model.LTL.impl.PropertyEventImpl <em>Property Event</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eeat.model.LTL.impl.PropertyEventImpl
	 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getPropertyEvent()
	 * @generated
	 */
	int PROPERTY_EVENT = 3;

	/**
	 * The number of structural features of the '<em>Property Event</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eeat.model.LTL.OclAny <em>Ocl Any</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ocl Any</em>'.
	 * @see org.eeat.model.LTL.OclAny
	 * @generated
	 */
	EClass getOclAny();

	/**
	 * Returns the meta object for class '{@link org.eeat.model.LTL.OclMessage <em>Ocl Message</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ocl Message</em>'.
	 * @see org.eeat.model.LTL.OclMessage
	 * @generated
	 */
	EClass getOclMessage();

	/**
	 * Returns the meta object for class '{@link org.eeat.model.LTL.Timeout <em>Timeout</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Timeout</em>'.
	 * @see org.eeat.model.LTL.Timeout
	 * @generated
	 */
	EClass getTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eeat.model.LTL.Timeout#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eeat.model.LTL.Timeout#getExpression()
	 * @see #getTimeout()
	 * @generated
	 */
	EAttribute getTimeout_Expression();

	/**
	 * Returns the meta object for class '{@link org.eeat.model.LTL.PropertyEvent <em>Property Event</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Event</em>'.
	 * @see org.eeat.model.LTL.PropertyEvent
	 * @generated
	 */
	EClass getPropertyEvent();

	/**
	 * Returns the meta object for class '{@link org.eeat.model.LTL.Event <em>Event</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eeat.model.LTL.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LTLFactory getLTLFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eeat.model.LTL.impl.OclAnyImpl <em>Ocl Any</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eeat.model.LTL.impl.OclAnyImpl
		 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getOclAny()
		 * @generated
		 */
		EClass OCL_ANY = eINSTANCE.getOclAny();

		/**
		 * The meta object literal for the '{@link org.eeat.model.LTL.impl.OclMessageImpl <em>Ocl Message</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eeat.model.LTL.impl.OclMessageImpl
		 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getOclMessage()
		 * @generated
		 */
		EClass OCL_MESSAGE = eINSTANCE.getOclMessage();

		/**
		 * The meta object literal for the '{@link org.eeat.model.LTL.impl.TimeoutImpl <em>Timeout</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eeat.model.LTL.impl.TimeoutImpl
		 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getTimeout()
		 * @generated
		 */
		EClass TIMEOUT = eINSTANCE.getTimeout();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TIMEOUT__EXPRESSION = eINSTANCE.getTimeout_Expression();

		/**
		 * The meta object literal for the '{@link org.eeat.model.LTL.impl.PropertyEventImpl <em>Property Event</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eeat.model.LTL.impl.PropertyEventImpl
		 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getPropertyEvent()
		 * @generated
		 */
		EClass PROPERTY_EVENT = eINSTANCE.getPropertyEvent();

		/**
		 * The meta object literal for the '{@link org.eeat.model.LTL.impl.EventImpl <em>Event</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eeat.model.LTL.impl.EventImpl
		 * @see org.eeat.model.LTL.impl.LTLPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

	}

} // LTLPackage
