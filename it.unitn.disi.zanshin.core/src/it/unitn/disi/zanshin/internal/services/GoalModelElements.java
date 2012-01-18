package it.unitn.disi.zanshin.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class GoalModelElements {
	/** Goal model that owns the elements contained in this. */
	private GoalModel model;

	/** The AwReq elements of the goal model. */
	private Collection<AwReq> awReqs = new ArrayList<>();

	/** The DomainAssumption elements of the goal model. */
	private Collection<DomainAssumption> domainAssumptions = new ArrayList<>();

	/** The Goal elements of the goal model. */
	private Collection<Goal> goals = new ArrayList<Goal>();

	/** The QualityConstraint elements of the goal model. */
	private Collection<QualityConstraint> qualityConstraints = new ArrayList<>();

	/** The Softgoal elements of the goal model. */
	private Collection<Softgoal> softgoals = new ArrayList<>();

	/** The Task elements of the goal model. */
	private Collection<Task> tasks = new ArrayList<>();

	/** The AwReq elements map, mapping the elements EMF class to its implementation. */
	private Map<EClass, AwReq> awReqsMap = new HashMap<>();

	/** The DomainAssumption elements map, mapping the elements EMF class to its implementation. */
	private Map<EClass, DomainAssumption> domainAssumptionsMap = new HashMap<>();

	/** The Goal elements map, mapping the elements EMF class to its implementation. */
	private Map<EClass, Goal> goalsMap = new HashMap<>();

	/** The QualityConstraint map, mapping the elements EMF class to its implementation. */
	private Map<EClass, QualityConstraint> qualityConstraintsMap = new HashMap<>();

	/** The Softgoal map, mapping the elements EMF class to its implementation. */
	private Map<EClass, Softgoal> softgoalsMap = new HashMap<>();

	/** The Task map, mapping the elements EMF class to its implementation. */
	private Map<EClass, Task> tasksMap = new HashMap<>();

	/** The EMF class map, mapping the eClass' name to its eClass object. */
	private Map<String, EClass> eClassMap = new HashMap<>();

	/** Constructor. */
	protected GoalModelElements(GoalModel model) {
		this.model = model;
		buildCollections();
	}

	/**
	 * Builds the collections of elements of the model.
	 */
	private void buildCollections() {
		// Uses a stack to perform a breadth-first search in the goal tree to check all elements.
		Goal rootGoal = model.getRootGoal();
		Stack<Requirement> stack = new Stack<Requirement>();
		stack.push(rootGoal);

		// Goes through the the goal tree.
		while (!stack.isEmpty()) {
			Requirement req = stack.pop();

			// Checks the element's type and stores it in the appropriate collections.
			EList<EClass> superTypes = req.eClass().getEAllSuperTypes();
			int superTypeId = superTypes.get(superTypes.size() - 1).getClassifierID();
			switch (superTypeId) {
			case GorePackage.AW_REQ:
				store((AwReq) req, awReqs, awReqsMap);
				break;
			case GorePackage.DOMAIN_ASSUMPTION:
				store((DomainAssumption) req, domainAssumptions, domainAssumptionsMap);
				break;
			case GorePackage.GOAL:
				store((Goal) req, goals, goalsMap);
				break;
			case GorePackage.QUALITY_CONSTRAINT:
				store((QualityConstraint) req, qualityConstraints, qualityConstraintsMap);
				break;
			case GorePackage.SOFTGOAL:
				store((Softgoal) req, softgoals, softgoalsMap);
				break;
			case GorePackage.TASK:
				store((Task) req, tasks, tasksMap);
				break;
			}

			// Adds this requirements children to the stack to continue the search.
			for (Requirement child : req.getChildren())
				stack.push(child);
		}

		// Goes through the softgoal list.
		for (Softgoal sg : model.getSoftgoals()) {
			store(sg, softgoals, softgoalsMap);

			// Goes through the softgoal's quality constraint list.
			for (QualityConstraint qc : sg.getConstraints()) 
				store(qc, qualityConstraints, qualityConstraintsMap);
		}

		// Lastly, goes through the AwReqs list.
		for (AwReq awreq : model.getAwReqs())
			store(awreq, awReqs, awReqsMap);
	}

	/**
	 * Generic method to store a requirement in its appropriate requirement collection and map. This method assumes both
	 * collections have already been instantiated and, therefore, is only a shortcut to make the buildCollections() method
	 * less verbose.
	 * 
	 * @param eClass
	 *          The EMF class of the requirement that serves as key for the requirements map.
	 * @param req
	 *          The requirement instance.
	 * @param reqs
	 *          The requirement collection.
	 * @param reqsMap
	 *          The requirements map.
	 */
	private <R extends Requirement> void store(R req, Collection<R> reqs, Map<EClass, R> reqsMap) {
		EClass eClass = req.eClass();
		reqs.add(req);
		reqsMap.put(eClass, req);
		eClassMap.put(eClass.getName(), eClass);
	}

	/**
	 * Retrieves a requirement instance from the model's elements, given its EMF class.
	 * 
	 * @param eClass
	 *          The EMF class of the requirement.
	 * @return The requirement instance, if found, or <code>null</code> otherwise.
	 */
	public Requirement retrieveRequirementInstance(EClass eClass) {
		// Creates a list with the IDs of all EMF classes implemented by this requirement class, including its own.
		EList<EClass> superTypes = eClass.getEAllSuperTypes();
		Set<Integer> superTypeIds = new HashSet<>();
		for (EClass superType : superTypes) superTypeIds.add(superType.getClassifierID());
		superTypeIds.add(eClass.getClassifierID());
		
		// Searches the appropriate requirement map, depending on the EMF class.
		if (superTypeIds.contains(GorePackage.AW_REQ))
			return awReqsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.DOMAIN_ASSUMPTION))
			return domainAssumptionsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.GOAL))
			return goalsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.QUALITY_CONSTRAINT))
			return qualityConstraintsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.SOFTGOAL))
			return softgoalsMap.get(eClass);
		if (superTypeIds.contains(GorePackage.TASK))
			return tasksMap.get(eClass);

		// If not found (or unrecognized type), returns null.
		return null;
	}

	/**
	 * Retrieves a requirement instance from the model's elements, given its EMF class's name.
	 * 
	 * @param eClassName
	 *          The name of the EMF class of the requirement.
	 * @return The requirement instance, if found, or <code>null</code> otherwise.
	 */
	public Requirement retrieveRequirementInstance(String eClassName) {
		// Searches for the interface that represents this requirement by its name.
		EClass eClass = eClassMap.get(eClassName);

		// If not null, search for the instance using the requirement's interface.
		return (eClass == null) ? null : (Requirement) retrieveRequirementInstance(eClass);
	}
}
