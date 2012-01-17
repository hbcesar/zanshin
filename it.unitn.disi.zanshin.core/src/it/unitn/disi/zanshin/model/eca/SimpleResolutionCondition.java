/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getSimpleResolutionCondition()
 * @model
 * @generated
 */
public interface SimpleResolutionCondition extends ResolutionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\nreturn ((awreq != null) && (awreq.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED));'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // SimpleResolutionCondition
