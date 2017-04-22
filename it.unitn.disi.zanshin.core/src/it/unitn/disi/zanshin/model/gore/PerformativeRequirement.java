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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Only process the cancellation if the requirement has not yet been canceled.\r\nif (getState() != it.unitn.disi.zanshin.model.gore.GOREElementState.CANCELED) {\r\n\tit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement canceled: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\r\n\tsetState(it.unitn.disi.zanshin.model.gore.GOREElementState.CANCELED);\r\n\t\t\t\r\n\t// If the monitoring service is active, warn it that this requirement has been canceled.\r\n\tit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\r\n\tif (monitoringService != null)\r\n\t\tmonitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.CANCEL);\r\n\t\r\n\t// If the requirement is canceled, then it has also ended.\r\n\tend();\r\n\t\r\n\t// Propagate the cancellation to the parent, depending if its definable/performative, and/or-refined.\r\n\t//TODO: verificar propagacao pra outros tipos de requisito\r\n\tit.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();\r\n\tif ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement)) {\r\n\t\tit.unitn.disi.zanshin.model.gore.GoalOrientedRequirement req = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;\r\n\t\tif (req.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR) parent.checkState();\r\n\t\telse if (parent instanceof PerformativeRequirement) ((PerformativeRequirement) parent).cancel();\r\n\t\telse parent.fail();\r\n\t}\r\n\t\r\n\t// Also propagate the cancellation to the children if and-refined and the children are performative.\r\n\tif (getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND)\r\n\t\tfor (it.unitn.disi.zanshin.model.gore.GOREElement child : getChildren())\r\n\t\t\tif (child instanceof PerformativeRequirement) ((PerformativeRequirement) child).cancel();\r\n}'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();\r\nEList<GOREElement> awreqs_da = (EList<GOREElement>) super.getChildren();\r\nEList<it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement> goals_tasks = getRefinements();\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\nfor(GOREElement child : awreqs_da){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\nfor(GOREElement child : goals_tasks){\r\n\tchildren.add(child);\r\n}\r\n\t\t\t\t\t\t\t\t\r\nreturn children;'"
	 * @generated
	 */
	EList<GOREElement> getChildren();

} // PerformativeRequirement
