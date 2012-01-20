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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#getChildren <em>Children</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends OclAny {
	/**
	 * Returns the value of the '<em><b>Refinement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.RefinementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see #setRefinementType(RefinementType)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement_RefinementType()
	 * @model
	 * @generated
	 */
	RefinementType getRefinementType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Requirement#getRefinementType <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement Type</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.RefinementType
	 * @see #getRefinementType()
	 * @generated
	 */
	void setRefinementType(RefinementType value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.Requirement}.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement_Children()
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Requirement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.Requirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Requirement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRequirement_Parent()
	 * @see it.unitn.disi.zanshin.model.gore.Requirement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Requirement getParent();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.Requirement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Requirement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GoalModel model = null;\n\n// First look if the object has a direct relation to the goal model instance.\nif (it.unitn.disi.zanshin.model.gore.Goal.class.isAssignableFrom(getClass()))\n\tmodel = ((it.unitn.disi.zanshin.model.gore.Goal) this).getGoalModel();\nelse if (it.unitn.disi.zanshin.model.gore.Softgoal.class.isAssignableFrom(getClass()))\n\tmodel = ((it.unitn.disi.zanshin.model.gore.Softgoal) this).getGoalModel();\nelse if (it.unitn.disi.zanshin.model.gore.AwReq.class.isAssignableFrom(getClass()))\n\tmodel = ((it.unitn.disi.zanshin.model.gore.AwReq) this).getGoalModel();\nelse if (it.unitn.disi.zanshin.model.gore.QualityConstraint.class.isAssignableFrom(getClass())) {\n\tit.unitn.disi.zanshin.model.gore.Softgoal softgoal = ((it.unitn.disi.zanshin.model.gore.QualityConstraint) this).getSoftgoal();\n\tif (softgoal != null) model = softgoal.getGoalModel();\n}\n\n// If the goal model is not directly related, it should still be null. Then, checks the parent (if there is one).\nif ((model == null) && (getParent() != null))\n\tmodel = getParent().findGoalModel();\n\n// Returns the found model, or null if no model has been found.\nreturn model;\n'"
	 * @generated
	 */
	GoalModel findGoalModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// Counts the number of children in each state and the number of defineable children.\nint[] stateCount = new int[it.unitn.disi.zanshin.model.gore.DefinableRequirementState.VALUES.size()];\nint defChildrenCount = 0;\nfor (it.unitn.disi.zanshin.model.gore.Requirement child : getChildren()) {\n\tif (child instanceof DefinableRequirement) {\n\t\tdefChildrenCount++;\n\t\tstateCount[((DefinableRequirement) child).getState().getValue()]++;\n\t}\n}\n\n// Converts to EList so we can return, adding the total number of definable children to the last position.\nEList<Integer> stateCountList = new org.eclipse.emf.common.util.BasicEList<>();\nfor (int count : stateCount)\n\tstateCountList.add(count);\nstateCountList.add(defChildrenCount);\nreturn stateCountList;'"
	 * @generated
	 */
	EList<Integer> getChildrenStateCount();

} // Requirement
