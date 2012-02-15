/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eeat.model.LTL.Event;
import org.eeat.model.LTL.LTLPackage;
import org.eeat.model.LTL.OclAny;
import org.eeat.model.LTL.OclMessage;
import org.eeat.model.LTL.PropertyEvent;
import org.eeat.model.LTL.Timeout;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.eeat.model.LTL.LTLPackage
 * @generated
 */
public class LTLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static LTLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LTLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LTLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This implementation
	 * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
	 * end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) { return true; }
		if (object instanceof EObject) { return ((EObject) object).eClass().getEPackage() == modelPackage; }
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LTLSwitch<Adapter> modelSwitch = new LTLSwitch<Adapter>() {
		@Override
		public Adapter caseOclAny(OclAny object) {
			return createOclAnyAdapter();
		}

		@Override
		public Adapter caseOclMessage(OclMessage object) {
			return createOclMessageAdapter();
		}

		@Override
		public Adapter caseTimeout(Timeout object) {
			return createTimeoutAdapter();
		}

		@Override
		public Adapter casePropertyEvent(PropertyEvent object) {
			return createPropertyEventAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *          the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.OclAny <em>Ocl Any</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.OclAny
	 * @generated
	 */
	public Adapter createOclAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.OclMessage <em>Ocl Message</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.OclMessage
	 * @generated
	 */
	public Adapter createOclMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.Timeout <em>Timeout</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.PropertyEvent <em>Property Event</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.PropertyEvent
	 * @generated
	 */
	public Adapter createPropertyEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.Event <em>Event</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // LTLAdapterFactory
