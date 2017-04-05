/**
 */
package it.unitn.disi.zanshin.model.eca;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.Event#getSession <em>Session</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.Event#getAwReq <em>Aw Req</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.Event#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' container reference.
	 * @see #setSession(AdaptationSession)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEvent_Session()
	 * @see it.unitn.disi.zanshin.model.eca.AdaptationSession#getEvents
	 * @model opposite="events" transient="false"
	 * @generated
	 */
	AdaptationSession getSession();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.Event#getSession <em>Session</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' container reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(AdaptationSession value);

	/**
	 * Returns the value of the '<em><b>Aw Req</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aw Req</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aw Req</em>' reference.
	 * @see #setAwReq(EcaAwReq)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEvent_AwReq()
	 * @model
	 * @generated
	 */
	EcaAwReq getAwReq();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.Event#getAwReq <em>Aw Req</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aw Req</em>' reference.
	 * @see #getAwReq()
	 * @generated
	 */
	void setAwReq(EcaAwReq value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getEvent_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.Event#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

} // Event
