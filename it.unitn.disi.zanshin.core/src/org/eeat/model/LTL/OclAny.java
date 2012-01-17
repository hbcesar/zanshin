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
	 * @generated
	 */
	Boolean after(Boolean exp1, Boolean exp2, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean after(Boolean exp1, Boolean exp2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean between(Boolean exp1, Boolean exp2, Boolean exp3);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean always(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean always(Boolean expression, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Boolean before(Boolean exp1, Boolean exp2, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean before(Boolean exp1, Boolean exp2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionUnique="false" expressionRequired="true"
	 * @generated
	 */
	Boolean eventually(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionRequired="true" expressionOrdered="false"
	 * @generated
	 */
	Boolean never(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean never(Boolean expression, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stimulusRequired="true" stimulusOrdered="false" responseRequired="true" responseOrdered="false"
	 * @generated
	 */
	Boolean responds(Boolean stimulus, Boolean response);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stimulusRequired="true" stimulusOrdered="false" responseRequired="true" responseOrdered="false"
	 * @generated
	 */
	Boolean responds(Boolean stimulus, Boolean response, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean unless(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean until(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionUnique="false" expressionMany="false"
	 * @generated
	 */
	Boolean sequence(EList<Boolean> expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" expressionUnique="false" expressionMany="false"
	 * @generated
	 */
	Boolean sequence(EList<Boolean> expression, Timeout timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Timeout timeout(String spec);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<OclMessage> receivedMessages(String methodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OclMessage receivedMessage(String methodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OclMessage receivedMessage(String className, String methodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean newPEval(Boolean expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Boolean after(Boolean exp1, Boolean exp2, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Boolean before(Boolean exp1, Boolean exp2, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean eventually(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean always(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean never(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stimulusRequired="true" stimulusOrdered="false" responseRequired="true" responseOrdered="false"
	 * @generated
	 */
	Boolean responds(Boolean stimulus, Boolean response, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean unless(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean until(Boolean expression, String timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<PropertyEvent> receivedProperties(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PropertyEvent receivedProperty(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Event receivedEvent(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<Event> receivedEvents(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<OclMessage> receivedMessages(String className, String methodName);

} // OclAny
