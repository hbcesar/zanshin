/**
 */
package it.unitn.disi.zanshin.model.gore;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GORE Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GOREElement#getParent <em>Parent</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GOREElement#getTime <em>Time</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GOREElement#getState <em>State</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.GOREElement#getAwreqs <em>Awreqs</em>}</li>
 * </ul>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGOREElement()
 * @model
 * @generated
 */
public interface GOREElement extends OclAny {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(GOREElement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGOREElement_Parent()
	 * @model
	 * @generated
	 */
	GOREElement getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GOREElement value);

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
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGOREElement_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.GOREElementState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElementState
	 * @see #setState(GOREElementState)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGOREElement_State()
	 * @model default="undefined"
	 * @generated
	 */
	GOREElementState getState();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.GOREElement#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.GOREElementState
	 * @see #getState()
	 * @generated
	 */
	void setState(GOREElementState value);

	/**
	 * Returns the value of the '<em><b>Awreqs</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.AwReq}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Awreqs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awreqs</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getGOREElement_Awreqs()
	 * @model
	 * @generated
	 */
	EList<AwReq> getAwreqs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement started: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\r\nsetState(it.unitn.disi.zanshin.model.gore.GOREElementState.STARTED);\r\n\t\t\t\t\r\n// If the monitoring service is active, warn it that this requirement has been started.\r\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\r\nif (monitoringService != null)\r\n\tmonitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.START);\r\n\t\t\t\t\r\n// Propagate the start to the parent.\r\nit.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();\r\nif ((parent != null) && (((GOREElement) parent).getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.UNDEFINED))\r\n\t((GOREElement) parent).start();'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement ended: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\r\n\t\t\r\n// If the monitoring service is active, warn it that this requirement has ended.\r\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\r\nif (monitoringService != null)\r\n\tmonitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.END);'"
	 * @generated
	 */
	void end();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement succeeded: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\r\nsetState(it.unitn.disi.zanshin.model.gore.GOREElementState.SUCCEEDED);\r\n\t\t\t\t\r\n// If the monitoring service is active, warn it that this requirement has been successful.\r\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\r\nif (monitoringService != null)\r\n\tmonitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.SUCCESS);\r\n\t\t\t\t\r\n// If the requirement is successful, then it has also ended.\r\nend();\r\n\t\t\t\t\r\n// Propagate the success to the parent, depending on the type of refinement.\r\nit.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();\r\nif ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement)) {\r\n\tit.unitn.disi.zanshin.model.gore.GoalOrientedRequirement p = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;\r\n\tif (p.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.OR) ((GOREElement) parent).success();\r\n\telse ((GOREElement)parent).checkState();\r\n}'"
	 * @generated
	 */
	void success();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='it.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Requirement failed: \" + eClass().getName() + \" (\" + this + \")\"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$\r\nsetState(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED);\r\n\t\t\t\t\r\n// If the monitoring service is active, warn it that this requirement has failed.\r\nit.unitn.disi.zanshin.services.IMonitoringService monitoringService = it.unitn.disi.zanshin.core.Activator.getMonitoringService();\r\nif (monitoringService != null)\r\n\tmonitoringService.monitorMethodCall(this, it.unitn.disi.zanshin.model.gore.MonitorableMethod.FAIL);\r\n\t\t\t\t\t\r\n// If the requirement failed, then it has also ended.\r\nend();\r\n\t\t\t\t\r\n// Propagate the failure to the parent, depending on the type of refinement.\r\nit.unitn.disi.zanshin.model.gore.GOREElement parent = getParent();\r\nif ((parent != null) && (parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement)) {\r\n\tit.unitn.disi.zanshin.model.gore.GoalOrientedRequirement p = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;\r\n\tif (p.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) ((GOREElement) parent).fail();\r\n\telse ((GOREElement)parent).checkState();\r\n}'"
	 * @generated
	 */
	void fail();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of definable children.\norg.eclipse.emf.common.util.EList<Integer> stateCount = getChildrenStateCount();\nint defChildrenCount = stateCount.get(stateCount.size() - 1);\n\t\t\t\t\n// For AND-refined requirements, checks if all children have SUCCEEDED.\nif (this instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) {\n\tit.unitn.disi.zanshin.model.gore.GoalOrientedRequirement p = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) this;\n\t\t\t\n\tif(p.getRefinementType() == it.unitn.disi.zanshin.model.gore.RefinementType.AND) {\n\t\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.SUCCEEDED_VALUE) == defChildrenCount) success();\n\t}\n\t\t\t\n\t// For OR-refined requirements, checks if all children have FAILED.\n\telse {\n\t\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) == defChildrenCount) fail();\n\t}\n} '"
	 * @generated
	 */
	void checkState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Cannot replace a requirement instance with null.\nif (newRequirement == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Cannot replace a requirement instance with null. A proper requirement instance should be provided.\"); //$NON-NLS-1$\n\t\t\tthrow new IllegalArgumentException();\n}\n\t\t\t\t\n// Can only replace requirements of the same class.\nif (! newRequirement.eClass().equals(eClass())) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Cannot replace a requirement instance of class {0} with one of class {1}. Instances should be of the same class.\", eClass().getName(), newRequirement.eClass().getName());//$NON-NLS-1$\n\tthrow new IllegalArgumentException();\n}\n\t\t\t\t\n// Changes the parent-child relationship (if there\'s no parent, we\'re setting null over null, so no harm). When\n// elements have many-to-one bilateral associations, only the \"one\" side is manipulated. This is on purpose, as EMF\n// generated code will handle the inverse association automatically.\nGOREElement parent = getParent();\nsetParent(null);\nnewRequirement.setParent(parent);\nit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Replacing requirement instances of class {0} ({1} -> {2})\", eClass().getName(), this, newRequirement); //$NON-NLS-1$\n\t\t\t\t\n// After a piece of the requirements tree gets replaced by new instances (with possible different states), check if\n// the ancestors should also have their state reset. For instance, if a failed instance is replaced by a non-failing\n// one in an AND-refinement, the parent should change from Failed to Started or Undefined. Navigate up the tree.\nwhile (parent != null) {\n\t// This procedure only makes sense in Goal Oriented Requirements.\n\tif(parent instanceof it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement){\n\t\tit.unitn.disi.zanshin.model.gore.GoalOrientedRequirement req = (it.unitn.disi.zanshin.model.gore.GoalOrientedRequirement) parent;\n\t\t\n\t\t// Counts the number of children in each state and the number of definable children.\n\t\tEList<Integer> stateCount = req.getChildrenStateCount();\n\t\t//int defChildrenCount = stateCount.get(stateCount.size() - 1);\n\t\tint defChildrenCount = getChildren().size();\n\t\tboolean doReset = false;\n\t\t\n\t\t// Checks the type of the requirement.\n\t\tswitch (req.getRefinementType()) {\n\t\tcase AND:\n\t\t\t// For failed AND-refined requirements, if none of its children failed, reset its state.\n\t\t\tdoReset = (req.getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED) && (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) == 0);\n\t\t\tbreak;\n\t\tcase OR:\n\t\t\t// For failed OR-refined requirements, if at least one of its children didn\'t fail, reset its state.\n\t\t\tdoReset = (req.getState() == it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED) && (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.FAILED_VALUE) < defChildrenCount);\n\t\t\tbreak;\n\t\t}\n\t\t\t\t\n\t\t// Checks if a reset is in order.\n\t\tif (doReset) {\n\t\t\t// If no children have yet started, set the requirement also as Undefined.\n\t\t\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.GOREElementState.UNDEFINED_VALUE) == defChildrenCount)\n\t\t\t\treq.setState(it.unitn.disi.zanshin.model.gore.GOREElementState.UNDEFINED);\n\t\t\n\t\t\t// Otherwise, if at least one child has started, set it also as Started.\n\t\t\telse req.setState(it.unitn.disi.zanshin.model.gore.GOREElementState.STARTED);\n\t\t\n\t\t\t// Log what has just happened.\n\t\t\tit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"The status of {0} has been reset to {1}\", req.eClass().getName(), req.getState()); //$NON-NLS-1$\n\t\t}\n\t\t\t\n\t} \n\t\n\t// Next ancestor.\n\tparent = parent.getParent();\n}'"
	 * @generated
	 */
	void replaceWith(GOREElement newRequirement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GoalModel model = null;\r\n\t\t\t\t\r\n// If it\'s the root goal, return the goal model.\r\nif (this instanceof it.unitn.disi.zanshin.model.gore.HardGoal)\r\n\t\t\tmodel = ((it.unitn.disi.zanshin.model.gore.HardGoal) this).getGoalModel();\r\n\t\t\t\t\r\n// If the model is not found in the root goal, move up the requirement tree looking for the root goal.\r\nif ((model == null) && (getParent() != null))\r\n\t\t\tmodel = getParent().findGoalModel();\r\n\t\t\t\t\r\n// Returns the found model, or null if no model has been found.\r\nreturn model;'"
	 * @generated
	 */
	GoalModel findGoalModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<GOREElement> children = new org.eclipse.emf.common.util.BasicEList<>();\r\nEList<AwReq> awreqs = this.getAwreqs();\r\n\t\t\t\t\t\t\r\nfor(GOREElement child : awreqs){\r\n\tchildren.add(child);\r\n}\r\n\t\t\r\nreturn children;'"
	 * @generated
	 */
	EList<GOREElement> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of children.\r\nint[] stateCount = new int[it.unitn.disi.zanshin.model.gore.GOREElementState.VALUES.size()];\r\n \r\nfor (it.unitn.disi.zanshin.model.gore.GOREElement child : getChildren()) {\r\n\tstateCount[((GOREElement) child).getState().getValue()]++;\r\n}\r\n\r\n// Converts to EList so we can return\r\nEList<Integer> stateCountList = new org.eclipse.emf.common.util.BasicEList<>();\r\nfor (int count : stateCount)\r\n\tstateCountList.add(count);\r\n\r\nreturn stateCountList;'"
	 * @generated
	 */
	EList<Integer> getChildrenStateCount();

} // GOREElement
