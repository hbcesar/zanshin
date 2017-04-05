/**
 */
package it.unitn.disi.zanshin.model.gore.util;

import it.unitn.disi.zanshin.model.gore.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.zanshin.model.gore.GorePackage
 * @generated
 */
public class GoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoreSwitch() {
		if (modelPackage == null) {
			modelPackage = GorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GorePackage.GORE_ELEMENT: {
				GOREElement goreElement = (GOREElement)theEObject;
				T result = caseGOREElement(goreElement);
				if (result == null) result = caseOclAny(goreElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.GOAL_ORIENTED_REQUIREMENT: {
				GoalOrientedRequirement goalOrientedRequirement = (GoalOrientedRequirement)theEObject;
				T result = caseGoalOrientedRequirement(goalOrientedRequirement);
				if (result == null) result = caseGOREElement(goalOrientedRequirement);
				if (result == null) result = caseOclAny(goalOrientedRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.PERFORMATIVE_REQUIREMENT: {
				PerformativeRequirement performativeRequirement = (PerformativeRequirement)theEObject;
				T result = casePerformativeRequirement(performativeRequirement);
				if (result == null) result = caseGoalOrientedRequirement(performativeRequirement);
				if (result == null) result = caseGOREElement(performativeRequirement);
				if (result == null) result = caseOclAny(performativeRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.HARD_GOAL: {
				HardGoal hardGoal = (HardGoal)theEObject;
				T result = caseHardGoal(hardGoal);
				if (result == null) result = casePerformativeRequirement(hardGoal);
				if (result == null) result = caseGoalOrientedRequirement(hardGoal);
				if (result == null) result = caseGOREElement(hardGoal);
				if (result == null) result = caseOclAny(hardGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.SOFTGOAL: {
				Softgoal softgoal = (Softgoal)theEObject;
				T result = caseSoftgoal(softgoal);
				if (result == null) result = caseGoalOrientedRequirement(softgoal);
				if (result == null) result = caseGOREElement(softgoal);
				if (result == null) result = caseOclAny(softgoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.QUALITY_CONSTRAINT: {
				QualityConstraint qualityConstraint = (QualityConstraint)theEObject;
				T result = caseQualityConstraint(qualityConstraint);
				if (result == null) result = caseGOREElement(qualityConstraint);
				if (result == null) result = caseOclAny(qualityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.AW_REQ: {
				AwReq awReq = (AwReq)theEObject;
				T result = caseAwReq(awReq);
				if (result == null) result = caseGOREElement(awReq);
				if (result == null) result = caseOclAny(awReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.DOMAIN_ASSUMPTION: {
				DomainAssumption domainAssumption = (DomainAssumption)theEObject;
				T result = caseDomainAssumption(domainAssumption);
				if (result == null) result = caseGOREElement(domainAssumption);
				if (result == null) result = caseOclAny(domainAssumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = casePerformativeRequirement(task);
				if (result == null) result = caseGoalOrientedRequirement(task);
				if (result == null) result = caseGOREElement(task);
				if (result == null) result = caseOclAny(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.DIFFERENTIAL_RELATION: {
				DifferentialRelation differentialRelation = (DifferentialRelation)theEObject;
				T result = caseDifferentialRelation(differentialRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.GOAL_MODEL: {
				GoalModel goalModel = (GoalModel)theEObject;
				T result = caseGoalModel(goalModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GorePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GORE Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GORE Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGOREElement(GOREElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Oriented Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Oriented Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalOrientedRequirement(GoalOrientedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performative Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performative Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformativeRequirement(PerformativeRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardGoal(HardGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftgoal(Softgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityConstraint(QualityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwReq(AwReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAssumption(DomainAssumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Differential Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Differential Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentialRelation(DifferentialRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalModel(GoalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclAny(OclAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GoreSwitch
