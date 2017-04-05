/**
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationResolutionCondition#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationResolutionCondition()
 * @model
 * @generated
 */
public interface ReconfigurationResolutionCondition extends ResolutionCondition {
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// If the wrapped resolution condition wasn\'t specified, it defaults to a SimpleResolutionCondition.\nif (wrappedCondition == null)\n\twrappedCondition = it.unitn.disi.zanshin.model.eca.EcaFactory.eINSTANCE.createSimpleResolutionCondition();\n\n// Checks if this reconfiguration algorithm has been used before and retrieve the algorithm id.\nString algorithmId = null;\njava.util.List<String> procedureIds = null;\nfor (it.unitn.disi.zanshin.model.eca.Event event : session.getEvents()) {\n\tit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = (event == null) ? null : event.getAwReq();\n\tit.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = (awreq == null) ? null : awreq.getSelectedStrategy();\n\tif (strategy instanceof it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) {\n\t\talgorithmId = ((it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) strategy).getAlgorithmId();\n\t\tprocedureIds = ((it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) strategy).getProcedureIds();\n\t}\n}\n\n// If it hasn\'t been used, just use the wrapped condition to evaluate resolution.\nif (algorithmId == null)\n\treturn wrappedCondition.evaluate(session);\n\n// Otherwise, retrieve the reconfiguration service and delegate the evaluation to it.\nit.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);\nif (reconfigService == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to evaluate resolution with Reconfiguration Resolution Condition, but an algorithm with id \\\"{0}\\\" is not registered! Falling back to the wrapped condition.\", algorithmId); //$NON-NLS-1$\n\treturn wrappedCondition.evaluate(session);\n}\nreturn reconfigService.checkResolution(procedureIds, session, wrappedCondition);'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // ReconfigurationResolutionCondition
