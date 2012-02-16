/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eeat.model.LTL.Event;
import org.eeat.model.LTL.LTLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Event</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class EventImpl extends OclAnyImpl implements Event {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LTLPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date date() {
		// This method has not been implemented.
		it.unitn.disi.zanshin.core.CoreUtils.log.error("Method Event.date() has not been implemented."); //$NON-NLS-1$
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long timestamp() {
		// This method has not been implemented.
		it.unitn.disi.zanshin.core.CoreUtils.log.error("Method Event.timestamp() has not been implemented."); //$NON-NLS-1$
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object object() {
		// This method has not been implemented.
		it.unitn.disi.zanshin.core.CoreUtils.log.error("Method Event.object() has not been implemented."); //$NON-NLS-1$
		throw new UnsupportedOperationException();
	}

} // EventImpl
