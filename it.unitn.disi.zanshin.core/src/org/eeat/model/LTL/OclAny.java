/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeat.model.LTL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Any</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eeat.model.LTL.LTLPackage#getOclAny()
 * @model
 * @generated
 */
public interface OclAny extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.after() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean after(Boolean exp1, Boolean exp2, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.after() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean after(Boolean exp1, Boolean exp2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.between() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean between(Boolean exp1, Boolean exp2, Boolean exp3);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.always() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean always(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.always() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean always(Boolean expression, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.before() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean before(Boolean exp1, Boolean exp2, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.before() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean before(Boolean exp1, Boolean exp2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionUnique="false" expressionRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.eventually() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean eventually(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionRequired="true" expressionOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.never() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean never(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.never() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean never(Boolean expression, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stimulusRequired="true" stimulusOrdered="false" responseRequired="true" responseOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.responds() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean responds(Boolean stimulus, Boolean response);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stimulusRequired="true" stimulusOrdered="false" responseRequired="true" responseOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.responds() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean responds(Boolean stimulus, Boolean response, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.unless() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean unless(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.until() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean until(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionUnique="false" expressionMany="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.sequence() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean sequence(EList<Boolean> expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionUnique="false" expressionMany="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.sequence() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean sequence(EList<Boolean> expression, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.timeout() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Timeout timeout(String spec);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedMessages() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	EList<OclMessage> receivedMessages(String methodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedMessage() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	OclMessage receivedMessage(String methodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedMessage() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	OclMessage receivedMessage(String className, String methodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.newPEval() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean newPEval(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.after() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean after(Boolean exp1, Boolean exp2, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.before() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean before(Boolean exp1, Boolean exp2, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.eventually() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean eventually(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.always() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean always(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.never() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean never(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stimulusRequired="true" stimulusOrdered="false" responseRequired="true" responseOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.responds() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean responds(Boolean stimulus, Boolean response, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.unless() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean unless(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.until() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Boolean until(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedProperties() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	EList<PropertyEvent> receivedProperties(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedProperty() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	PropertyEvent receivedProperty(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedEvent() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	Event receivedEvent(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedEvents() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	EList<Event> receivedEvents(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method has not been implemented.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method OclAny.receivedMessages() has not been implemented.\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	EList<OclMessage> receivedMessages(String className, String methodName);

} // OclAny
