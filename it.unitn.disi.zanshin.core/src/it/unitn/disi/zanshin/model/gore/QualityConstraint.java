/**
 */
package it.unitn.disi.zanshin.model.gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getQualityConstraint()
 * @model
 * @generated
 */
public interface QualityConstraint extends GOREElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Performs the replacement as a normal requirement first.\r\nsuper.replaceWith(newRequirement);\r\n\t\t\r\n// Then, replace the relationship quality constraints have with softgoals.\r\nit.unitn.disi.zanshin.model.gore.Softgoal softgoal = (it.unitn.disi.zanshin.model.gore.Softgoal) getParent();\r\nsetParent(null);\r\n((QualityConstraint) newRequirement).setParent(softgoal);'"
	 * @generated
	 */
	void replaceWith(GoalOrientedRequirement newRequirement);

} // QualityConstraint
