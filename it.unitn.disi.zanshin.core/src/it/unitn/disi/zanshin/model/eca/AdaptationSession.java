/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents <em>Events</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationSession()
 * @model
 * @generated
 */
public interface AdaptationSession extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.eca.Event}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.Event#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationSession_Events()
	 * @see it.unitn.disi.zanshin.model.eca.Event#getSession
	 * @model opposite="session" containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getAdaptationSession_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.model.eca.Event event = it.unitn.disi.zanshin.model.eca.EcaFactory.eINSTANCE.createEvent();\nevent.setTime(new java.util.Date(System.currentTimeMillis()));\nevent.setAwReq(awreq);\ngetEvents().add(event);'"
	 * @generated
	 */
	void addEvent(EcaAwReq awreq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='setActive(false);'"
	 * @generated
	 */
	void terminate();

} // AdaptationSession
