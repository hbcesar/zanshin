/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eeat.model.LTL.LTLPackage#getPropertyEvent()
 * @model
 * @generated
 */
public interface PropertyEvent extends Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.name() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	String name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.satisfied() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean satisfied();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.openDate() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Date openDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.closeDate() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Date closeDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.openEvent() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Event openEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.closeEvent() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Event closeEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.scopeEvent() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Event scopeEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.support() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	EList<PropertyEvent> support();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method PropertyEvent.property() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	String property();

} // PropertyEvent
