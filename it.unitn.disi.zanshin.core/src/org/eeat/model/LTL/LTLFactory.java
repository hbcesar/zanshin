/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eeat.model.LTL.LTLPackage
 * @generated
 */
public interface LTLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LTLFactory eINSTANCE = org.eeat.model.LTL.impl.LTLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ocl Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocl Any</em>'.
	 * @generated
	 */
	OclAny createOclAny();

	/**
	 * Returns a new object of class '<em>Ocl Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocl Message</em>'.
	 * @generated
	 */
	OclMessage createOclMessage();

	/**
	 * Returns a new object of class '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout</em>'.
	 * @generated
	 */
	Timeout createTimeout();

	/**
	 * Returns a new object of class '<em>Property Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Event</em>'.
	 * @generated
	 */
	PropertyEvent createPropertyEvent();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LTLPackage getLTLPackage();

} //LTLFactory
