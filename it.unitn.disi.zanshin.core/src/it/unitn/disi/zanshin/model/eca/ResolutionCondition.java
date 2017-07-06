/**
 */
package it.unitn.disi.zanshin.model.eca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq <em>Aw Req</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getResolutionCondition()
 * @model abstract="true"
 * @generated
 */
public interface ResolutionCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Aw Req</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aw Req</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aw Req</em>' container reference.
	 * @see #setAwReq(EcaAwReq)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getResolutionCondition_AwReq()
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	EcaAwReq getAwReq();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getAwReq <em>Aw Req</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aw Req</em>' container reference.
	 * @see #getAwReq()
	 * @generated
	 */
	void setAwReq(EcaAwReq value);

	/**
	 * Returns the value of the '<em><b>Internal ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal ID</em>' attribute.
	 * @see #setInternalID(Integer)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getResolutionCondition_InternalID()
	 * @model default="0" id="true"
	 * @generated
	 */
	Integer getInternalID();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ResolutionCondition#getInternalID <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal ID</em>' attribute.
	 * @see #getInternalID()
	 * @generated
	 */
	void setInternalID(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This method is not supposed to be called.\nit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Method ResolutionConditionImpl.evaluate() has been called, but this method is not meant to be called!\"); //$NON-NLS-1$\nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // ResolutionCondition
