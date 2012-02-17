/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Reconfiguration Strategy</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getLevel <em>Level</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getProcedureIds <em>Procedure Ids</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationStrategy()
 * @model
 * @generated
 */
public interface ReconfigurationStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Algorithm Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Id</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Algorithm Id</em>' attribute.
	 * @see #setAlgorithmId(String)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationStrategy_AlgorithmId()
	 * @model
	 * @generated
	 */
	String getAlgorithmId();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getAlgorithmId
	 * <em>Algorithm Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Algorithm Id</em>' attribute.
	 * @see #getAlgorithmId()
	 * @generated
	 */
	void setAlgorithmId(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute. The default value is <code>"class"</code>. The literals
	 * are from the enumeration {@link it.unitn.disi.zanshin.model.gore.AggregationLevel}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #setLevel(AggregationLevel)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationStrategy_Level()
	 * @model default="class"
	 * @generated
	 */
	AggregationLevel getLevel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy#getLevel <em>Level</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AggregationLevel value);

	/**
	 * Returns the value of the '<em><b>Procedure Ids</b></em>' attribute list. The list contents are of type
	 * {@link java.lang.String}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Ids</em>' attribute list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Procedure Ids</em>' attribute list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getReconfigurationStrategy_ProcedureIds()
	 * @model
	 * @generated
	 */
	EList<String> getProcedureIds();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Attribute algorithmId is mandatory.\nif (algorithmId == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"algorithmId\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Obtains a reference to the reconfiguration service and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.IReconfigurationService reconfigService = it.unitn.disi.zanshin.core.Activator.retrieveReconfigurationService(algorithmId);\nif (reconfigService == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but an algorithm with id \\\"{1}\\\" is not registered!\", strategyName, algorithmId); //$NON-NLS-1$\n\treturn;\n}\n\n// Attribute level defaults to CLASS.\nif (level == null)\n\tlevel = it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS;\n\n// Executes the reconfiguration strategy.\nstrategyName += \"(\" + algorithmId + \"; \" + level + \")\"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\nit.unitn.disi.zanshin.model.gore.Configuration newConfig = reconfigService.findConfiguration(getAwReq());\ncontroller.applyConfig(newConfig, level);'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // ReconfigurationStrategy
