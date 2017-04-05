/**
 */
package it.unitn.disi.zanshin.model.eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationApplicabilityCondition()
 * @model
 * @generated
 */
public interface ReconfigurationApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Wrapped Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Condition</em>' containment reference.
	 * @see #setWrappedCondition(ApplicabilityCondition)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationApplicabilityCondition_WrappedCondition()
	 * @model containment="true"
	 * @generated
	 */
	ApplicabilityCondition getWrappedCondition();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Condition</em>' containment reference.
	 * @see #getWrappedCondition()
	 * @generated
	 */
	void setWrappedCondition(ApplicabilityCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// If the wrapped resolution condition wasn\'t specified, it defaults to a SimpleApplicabilityCondition.\nif (wrappedCondition == null)\n\twrappedCondition = it.unitn.disi.zanshin.model.eca.EcaFactory.eINSTANCE.createSimpleApplicabilityCondition();\n\n// Retrieves the reconfiguration strategy.\nit.unitn.disi.zanshin.model.eca.AdaptationStrategy strategy = getStrategy();\nString strategyName = strategy.eClass().getName();\nif (!(strategy instanceof it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy)) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"The Reconfiguration Applicability Condition was used with a {0}, but it can only be used with a Reconfiguration Strategy.\", strategyName); //$NON-NLS-1$\n\treturn false;\n}\n\n// Attribute algorithmId is mandatory.\nit.unitn.disi.zanshin.model.eca.ReconfigurationStrategy reconfigStrategy = (it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy) strategy;\nString algorithmId = reconfigStrategy.getAlgorithmId();\nif (algorithmId == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"algorithmId\\\" and cannot have its applicability evaluated.\", strategyName); //$NON-NLS-1$\n\treturn false;\n}\n\n// Obtains a reference to the reconfiguration service and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);\nif (reconfigService == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to evaluate the applicability of {0}, but an algorithm with id \\\"{1}\\\" is not registered!\", strategyName, algorithmId); //$NON-NLS-1$\n\treturn false;\n}\n\n// If all is well so far, delegate the applicability evaluation to the reconfiguration service.\nreturn reconfigService.checkApplicability(reconfigStrategy.getProcedureIds(), reconfigStrategy.getAwReq(), session, wrappedCondition);'"
	 * @generated
	 */
	boolean evaluate(AdaptationSession session);

} // ReconfigurationApplicabilityCondition
