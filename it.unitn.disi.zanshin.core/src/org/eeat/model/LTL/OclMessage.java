/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Message</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eeat.model.LTL.LTLPackage#getOclMessage()
 * @model
 * @generated
 */
public interface OclMessage extends Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclMessage.argument() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	OclAny argument(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclMessage.argument() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	OclAny argument(int expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclMessage.arguments() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	EList<OclAny> arguments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclMessage.className() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	String className();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclMessage.methodName() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	String methodName();

} // OclMessage
