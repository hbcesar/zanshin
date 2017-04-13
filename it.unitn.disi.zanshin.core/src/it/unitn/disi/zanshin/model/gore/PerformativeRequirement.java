/**
 */
package it.unitn.disi.zanshin.model.gore;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performative Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getPerformativeRequirement()
 * @model
 * @generated
 */
public interface PerformativeRequirement extends GoalOrientedRequirement {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getPerformativeRequirement_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getPerformativeRequirement_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Only process the cancellation if the requirement has not yet been canceled.\nif (getState() != it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement canceled: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\n\tsetState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.CANCELED);\n\t\t\t\n\t// If the monitoring service is active, warn it that this requirement has been canceled.\n\tit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\n\tif (monitoringService != null)\n\t\tmonitoringService.monitorMethodCall(this, MonitorableMethod.CANCEL);\n\t\n\t// If the requirement is canceled, then it has also ended.\n\tend();\n\t\n\t// Propagate the cancellation to the parent, depending if its definable/performative, and/or-refined.\n\tit.unitn.disi.zanshin.model.gore.Requirement parent = getParent();\n\tif ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.DefinableRequirement)) {\n\t\tif (parent.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR) ((it.unitn.disi.zanshin.model.gore.DefinableRequirement)parent).checkState();\n\t\telse if (parent instanceof PerformativeRequirement) ((PerformativeRequirement) parent).cancel();\n\t\telse ((it.unitn.disi.zanshin.model.gore.DefinableRequirement)parent).fail();\n\t}\n\t\n\t// Also propagate the cancellation to the children if and-refined and the children are performative.\n\tif (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND)\n\t\tfor (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren())\n\t\t\tif (child instanceof PerformativeRequirement) ((PerformativeRequirement) child).cancel();\n}'"
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//Counts the number of children\r\norg.eclipse.emf.common.util.EList<Integer> stateCount = getChildrenStateCount();\r\nint childrenCount = getChildren().size();\r\n\r\n// For AND-refined requirements, checks if all children have SUCCEEDED.\r\nif (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) {\r\n\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.SUCCEEDED_VALUE) == childrenCount) success();\r\n}\r\n\r\n// For OR-refined requirements, checks if all children have FAILED or have been CANCELED.\r\nelse {\r\n\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) == childrenCount) fail();\r\n\telse if (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.CANCELED_VALUE) == childrenCount) cancel();\r\n}'"
	 * @generated
	 */
	void checkState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<GOREElement> getChildren();

} // PerformativeRequirement
