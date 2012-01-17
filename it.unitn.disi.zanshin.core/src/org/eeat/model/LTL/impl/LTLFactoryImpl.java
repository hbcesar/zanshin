/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eeat.model.LTL.Event;
import org.eeat.model.LTL.LTLFactory;
import org.eeat.model.LTL.LTLPackage;
import org.eeat.model.LTL.OclAny;
import org.eeat.model.LTL.OclMessage;
import org.eeat.model.LTL.PropertyEvent;
import org.eeat.model.LTL.Timeout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LTLFactoryImpl extends EFactoryImpl implements LTLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LTLFactory init() {
		try {
			LTLFactory theLTLFactory = (LTLFactory)EPackage.Registry.INSTANCE.getEFactory("http://zanshin.disi.unitn.it/1.0/ltl");  //$NON-NLS-1$
			if (theLTLFactory != null) {
				return theLTLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LTLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LTLPackage.OCL_ANY: return createOclAny();
			case LTLPackage.OCL_MESSAGE: return createOclMessage();
			case LTLPackage.TIMEOUT: return createTimeout();
			case LTLPackage.PROPERTY_EVENT: return createPropertyEvent();
			case LTLPackage.EVENT: return createEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclAny createOclAny() {
		OclAnyImpl oclAny = new OclAnyImpl();
		return oclAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclMessage createOclMessage() {
		OclMessageImpl oclMessage = new OclMessageImpl();
		return oclMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeout createTimeout() {
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEvent createPropertyEvent() {
		PropertyEventImpl propertyEvent = new PropertyEventImpl();
		return propertyEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLPackage getLTLPackage() {
		return (LTLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LTLPackage getPackage() {
		return LTLPackage.eINSTANCE;
	}

} //LTLFactoryImpl
