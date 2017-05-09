/**
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.GOREElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relax Replace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getCopy <em>Copy</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getLevel <em>Level</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getNewRequirement <em>New Requirement</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxReplace()
 * @model
 * @generated
 */
public interface RelaxReplace extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(GOREElement)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxReplace_Requirement()
	 * @model
	 * @generated
	 */
	GOREElement getRequirement();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(GOREElement value);

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(Boolean)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxReplace_Copy()
	 * @model
	 * @generated
	 */
	Boolean getCopy();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.AggregationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #setLevel(AggregationLevel)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxReplace_Level()
	 * @model
	 * @generated
	 */
	AggregationLevel getLevel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AggregationLevel value);

	/**
	 * Returns the value of the '<em><b>New Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Requirement</em>' reference.
	 * @see #setNewRequirement(GOREElement)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getRelaxReplace_NewRequirement()
	 * @model
	 * @generated
	 */
	GOREElement getNewRequirement();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.RelaxReplace#getNewRequirement <em>New Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Requirement</em>' reference.
	 * @see #getNewRequirement()
	 * @generated
	 */
	void setNewRequirement(GOREElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\r\n\r\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\r\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\r\nif (controller == null) {\r\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\r\n\treturn;\r\n}\r\n\r\n// Retrieve the strategy\'s attributes.\r\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\r\n\r\n// Attribute requirement defaults to the AwReq\'s target.\r\nif (requirement == null) {\r\n\tsetRequirement(awreq.getTarget());\r\n\tif (requirement == null) {\r\n\t\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"requirement\\\" and cannot be executed. Cannot use the default value because the referred AwReq doesn\'t have a target set.\", strategyName); //$NON-NLS-1$\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n// Attribute copy defaults to TRUE.\r\nif (copy == null) copy = Boolean.TRUE;\r\n\r\n// Attribute level defaults to INSTANCE.\r\nif (level == null) level = it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE;\r\n\r\n// Attribute newRequirement is mandatory.\r\nif (newRequirement == null) {\r\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"newRequirement\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\r\n\treturn;\r\n}\r\n\r\n// Executes the Relax by Replacing strategy.\r\nit.unitn.disi.zanshin.model.gore.GoalModel goalModel = requirement.findGoalModel();\r\nstrategyName += \"(\" + requirement.eClass().getName() + \"; \" + copy + \"; \" + level + \"; \" + newRequirement.eClass().getName() + \")\"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$\r\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$\r\nif ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {\r\n\tcontroller.disable(requirement.eClass());\r\n\tcontroller.enable(newRequirement.eClass());\r\n}\r\nif ((level == it.unitn.disi.zanshin.model.gore.AggregationLevel.INSTANCE) || (level == it.unitn.disi.zanshin.model.gore.AggregationLevel.BOTH)) {\r\n\tif ((copy) && (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement) && (newRequirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement))\r\n\t\tcontroller.copyData(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) newRequirement);\r\n\tcontroller.terminate(goalModel, requirement);\r\n\tif (requirement instanceof it.unitn.disi.zanshin.model.gore.PerformativeRequirement)\r\n\t\tcontroller.rollback(goalModel, (it.unitn.disi.zanshin.model.gore.PerformativeRequirement) requirement);\r\n\tcontroller.initiate(goalModel, newRequirement);\r\n}'"
	 * @generated
	 */
	void execute(AdaptationSession session);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Retrieves the model id and continues only if this requirement is part of a model.\nit.unitn.disi.zanshin.model.gore.GoalModel model = getAwReq().findGoalModel();\nif (model != null) {\n\tLong modelId = model.getId();\n\t\n\t// Retrieves the repository service from the platform to be able to update the references.\n\tit.unitn.disi.zanshin.services.IRepositoryService repositoryService = it.unitn.disi.zanshin.core.Activator.getRepositoryService();\n\t\n\t// Updates references to requirement and newRequirement.\n\tif (requirement != null)\n\t\tsetRequirement(repositoryService.retrieveRequirement(modelId, requirement.eClass()));\n\tif (newRequirement != null)\n\t\tsetNewRequirement(repositoryService.retrieveRequirement(modelId, newRequirement.eClass()));\n}'"
	 * @generated
	 */
	void updateReferences();

} // RelaxReplace
