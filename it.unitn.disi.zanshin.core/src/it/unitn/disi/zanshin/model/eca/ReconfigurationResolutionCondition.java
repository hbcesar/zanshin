/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getAlgorithmId <em>Algorithm Id</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationResolutionCondition()
 * @model
 * @generated
 */
public interface ReconfigurationResolutionCondition extends ResolutionCondition {
	/**
	 * Returns the value of the '<em><b>Algorithm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Id</em>' attribute.
	 * @see #setAlgorithmId(String)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationResolutionCondition_AlgorithmId()
	 * @model
	 * @generated
	 */
	String getAlgorithmId();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getAlgorithmId <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Id</em>' attribute.
	 * @see #getAlgorithmId()
	 * @generated
	 */
	void setAlgorithmId(String value);

	/**
	 * Returns the value of the '<em><b>Wrapped Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Condition</em>' containment reference.
	 * @see #setWrappedCondition(ResolutionCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationResolutionCondition_WrappedCondition()
	 * @model containment="true"
	 * @generated
	 */
	ResolutionCondition getWrappedCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getWrappedCondition <em>Wrapped Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Condition</em>' containment reference.
	 * @see #getWrappedCondition()
	 * @generated
	 */
	void setWrappedCondition(ResolutionCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// If the current evaluation is Success, the problem is solved. \nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\nif ((awreq != null) && (awreq.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.SUCCEEDED)) return true;\n\n// Otherwise, if the last applied strategy was \"abort\", the problem is also solved.\nelse if (session.getEvents().size() > 0) {\n\tit.unitn.disi.zanshin.model.eca.Event lastEvent = session.getEvents().get(session.getEvents().size() - 1);\n\tit.unitn.disi.zanshin.model.eca.EcaAwReq lastAwReq = (lastEvent == null) ? null : lastEvent.getAwReq();\n\tit.unitn.disi.zanshin.model.eca.AdaptationStrategy lastStrategy = (lastAwReq == null) ? null : lastAwReq.getSelectedStrategy();\n\tif ((lastStrategy != null) && (it.unitn.disi.zanshin.model.eca.AbortStrategy.class.isAssignableFrom(lastStrategy.getClass())))\n\t\treturn true;\n}\n\n// If none of the above, the problem is not yet solved.\nreturn false;'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // ReconfigurationResolutionCondition
