/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;
import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Requirement</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#getRefinementType <em>Refinement Type</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#getChildren <em>Children</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends OclAny {
	/**
	 * Returns the value of the '<em><b>Refinement Type</b></em>' attribute. The literals are from the enumeration
	 * {@link it.unitn.disi.zanshin.model.gore.RefinementType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Type</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Refinement Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see #setRefinementType(RefinementType)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement_RefinementType()
	 * @model
	 * @generated
	 */
	RefinementType getRefinementType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Requirement#getRefinementType
	 * <em>Refinement Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Refinement Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see #getRefinementType()
	 * @generated
	 */
	void setRefinementType(RefinementType value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.gore.Requirement}. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement_Children()
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Requirement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link it.unitn.disi.zanshin.model.gore.Requirement#getChildren <em>Children</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Requirement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement_Parent()
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Requirement getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Requirement value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='GoalModel model = null;\n\n// If it\'s the root goal, return the goal model.\nif (it.unitn.disi.zanshin.model.gore.Goal.class.isAssignableFrom(getClass()))\n\tmodel = ((it.unitn.disi.zanshin.model.gore.Goal) this).getGoalModel();\n\n// Otherwise, move up the requirement tree looking for the root goal.\nelse if (getParent() != null)\n\tmodel = getParent().findGoalModel();\n\n// Returns the found model, or null if no model has been found.\nreturn model;'"
	 * @generated
	 */
	GoalModel findGoalModel();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of defineable children.\nint[] stateCount = new int[it.unitn.disi.zanshin.model.gore.DefinableRequirementState.VALUES.size()];\nint defChildrenCount = 0;\nfor (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren()) {\n\tif (child instanceof DefinableRequirement) {\n\t\tdefChildrenCount++;\n\t\tstateCount[((DefinableRequirement) child).getState().getValue()]++;\n\t}\n}\n\n// Converts to EList so we can return, adding the total number of definable children to the last position.\nEList<Integer> stateCountList = new org.eclipse.emf.common.util.BasicEList<>();\nfor (int count : stateCount)\n\tstateCountList.add(count);\nstateCountList.add(defChildrenCount);\nreturn stateCountList;'"
	 * @generated
	 */
	EList<Integer> getChildrenStateCount();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Cannot replace a requirement instance with null.\nif (newRequirement == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Cannot replace a requirement instance with null. A proper requirement instance should be provided.\"); //$NON-NLS-1$\n\tthrow new IllegalArgumentException();\n}\n\n// Can only replace requirements of the same class.\nif (! newRequirement.eClass().equals(eClass())) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.error(\"Cannot replace a requirement instance of class {0} with one of class {1}. Instances should be of the same class.\", eClass().getName(), newRequirement.eClass().getName()); //$NON-NLS-1$\n\tthrow new IllegalArgumentException();\n}\n\n// Changes the parent-child relationship (if there\'s no parent, we\'re setting null over null, so no harm). When\n// elements have many-to-one bilateral associations, only the \"one\" side is manipulated. This is on purpose, as EMF\n// generated code will handle the inverse association automatically.\nRequirement parent = getParent();\nsetParent(null);\nnewRequirement.setParent(parent);\nit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"Replacing requirement instances of class {0} ({1} -> {2})\", eClass().getName(), this, newRequirement); //$NON-NLS-1$\n\n// After a piece of the requirements tree gets replaced by new instances (with possible different states), check if\n// the ancestors should also have their state reset. For instance, if a failed instance is replaced by a non-failing\n// one in an AND-refinement, the parent should change from Failed to Started or Undefined. Navigate up the tree.\nwhile (parent != null) {\n\t// This procedure only makes sense in definable requirements.\n\tif (parent instanceof DefinableRequirement) {\n\t\tDefinableRequirement req = (DefinableRequirement) parent;\n\n\t\t// Counts the number of children in each state and the number of definable children.\n\t\tEList<Integer> stateCount = req.getChildrenStateCount();\n\t\tint defChildrenCount = stateCount.get(stateCount.size() - 1);\n\t\tboolean doReset = false;\n\n\t\t// Checks the type of the requirement.\n\t\tswitch (req.getRefinementType()) {\n\t\tcase AND:\n\t\t\t// For failed AND-refined requirements, if none of its children failed, reset its state.\n\t\t\tdoReset = (req.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED) && (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED_VALUE) == 0);\n\t\t\tbreak;\n\t\tcase OR:\n\t\t\t// For failed OR-refined requirements, if at least one of its children didn\'t fail, reset its state.\n\t\t\tdoReset = (req.getState() == it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED) && (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.FAILED_VALUE) < defChildrenCount);\n\t\t\tbreak;\n\t\t}\n\t\t\n\t\t// Checks if a reset is in order.\n\t\tif (doReset) {\n\t\t\t// If no children have yet started, set the requirement also as Undefined.\n\t\t\tif (stateCount.get(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.UNDEFINED_VALUE) == defChildrenCount)\n\t\t\t\treq.setState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.UNDEFINED);\n\n\t\t\t// Otherwise, if at least one child has started, set it also as Started.\n\t\t\telse req.setState(it.unitn.disi.zanshin.model.gore.DefinableRequirementState.STARTED);\n\n\t\t\t// Log what has just happened.\n\t\t\tit.unitn.disi.zanshin.core.CoreUtils.log.debug(\"The status of {0} has been reset to {1}\", req.eClass().getName(), req.getState()); //$NON-NLS-1$\n\t\t}\n\t}\n\n\t// Next ancestor.\n\tparent = parent.getParent();\n}'"
	 * @generated
	 */
	void replaceWith(Requirement newRequirement);

} // Requirement
