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
import it.unitn.disi.zanshin.util.GoalModelUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
	private Collection<AwReq> awReqs = new ArrayList<AwReq>();

	/** The DomainAssumption elements of the goal model. */
	private Collection<DomainAssumption> domainAssumptions = new ArrayList<DomainAssumption>();

	/** The Goal elements of the goal model. */
	private Collection<Goal> goals = new ArrayList<Goal>();

	/** The QualityConstraint elements of the goal model. */
	private Collection<QualityConstraint> qualityConstraints = new ArrayList<QualityConstraint>();

	/** The Softgoal elements of the goal model. */
	private Collection<Softgoal> softgoals = new ArrayList<Softgoal>();

	/** The Task elements of the goal model. */
	private Collection<Task> tasks = new ArrayList<Task>();

	/** The AwReq elements map, mapping the elements declaring interface to its implementation. */
	private Map<Class<? extends AwReq>, AwReq> awReqsMap = new HashMap<Class<? extends AwReq>, AwReq>();

	/** The DomainAssumption elements map, mapping the elements declaring interface to its implementation. */
	private Map<Class<? extends DomainAssumption>, DomainAssumption> domainAssumptionsMap = new HashMap<Class<? extends DomainAssumption>, DomainAssumption>();

	/** The Goal elements map, mapping the elements declaring interface to its implementation. */
	private Map<Class<? extends Goal>, Goal> goalsMap = new HashMap<Class<? extends Goal>, Goal>();

	/** The QualityConstraint map, mapping the elements declaring interface to its implementation. */
	private Map<Class<? extends QualityConstraint>, QualityConstraint> qualityConstraintsMap = new HashMap<Class<? extends QualityConstraint>, QualityConstraint>();

	/** The Softgoal map, mapping the elements declaring interface to its implementation. */
	private Map<Class<? extends Softgoal>, Softgoal> softgoalsMap = new HashMap<Class<? extends Softgoal>, Softgoal>();

	/** The Task map, mapping the elements declaring interface to its implementation. */
	private Map<Class<? extends Task>, Task> tasksMap = new HashMap<Class<? extends Task>, Task>();

	/** The declared interfaces map, mapping the interface's name to its class object. */
	private Map<String, Class<? extends Requirement>> ifacesMap = new HashMap<String, Class<? extends Requirement>>();

	/** Constructor. */
	protected GoalModelElements(GoalModel model) {
		this.model = model;
		buildCollections();
	}

	/**
	 * Builds the collections of elements of the model.
	 */
	@SuppressWarnings("unchecked")
	private void buildCollections() {
		// Uses a stack to perform a breadth-first search in the goal tree to check all elements.
		Goal rootGoal = model.getRootGoal();
		Stack<Requirement> stack = new Stack<Requirement>();
		stack.push(rootGoal);

		// Goes through the the goal tree.
		while (!stack.isEmpty()) {
			Requirement req = stack.pop();

			// Checks the element's type and stores it in the appropriate collections.
			Class<?> iface = req.getClass().getInterfaces()[0];
			switch (GoalModelUtils.getEmfType(req)) {
			case GorePackage.AW_REQ:
				store((Class<? extends AwReq>) iface, (AwReq) req, awReqs, awReqsMap);
				break;
			case GorePackage.DOMAIN_ASSUMPTION:
				store((Class<? extends DomainAssumption>) iface, (DomainAssumption) req, domainAssumptions, domainAssumptionsMap);
				break;
			case GorePackage.GOAL:
				store((Class<? extends Goal>) iface, (Goal) req, goals, goalsMap);
				break;
			case GorePackage.QUALITY_CONSTRAINT:
				store((Class<? extends QualityConstraint>) iface, (QualityConstraint) req, qualityConstraints, qualityConstraintsMap);
				break;
			case GorePackage.SOFTGOAL:
				store((Class<? extends Softgoal>) iface, (Softgoal) req, softgoals, softgoalsMap);
				break;
			case GorePackage.TASK:
				store((Class<? extends Task>) iface, (Task) req, tasks, tasksMap);
				break;
			}

			// Adds this requirements children to the stack to continue the search.
			for (Requirement child : req.getChildren())
				stack.push(child);
		}

		// Goes through the softgoal list.
		for (Softgoal sg : model.getSoftgoals()) {
			Class<? extends Softgoal> sgInterface = (Class<? extends Softgoal>) sg.getClass().getInterfaces()[0];
			store(sgInterface, sg, softgoals, softgoalsMap);

			// Goes through the softgoal's quality constraint list.
			for (QualityConstraint qc : sg.getConstraints()) {
				Class<? extends QualityConstraint> qcInterface = (Class<? extends QualityConstraint>) qc.getClass().getInterfaces()[0];
				store(qcInterface, qc, qualityConstraints, qualityConstraintsMap);
			}
		}

		// Lastly, goes through the AwReqs list.
		for (AwReq awreq : model.getAwReqs()) {
			Class<? extends AwReq> awreqInterface = (Class<? extends AwReq>) awreq.getClass().getInterfaces()[0];
			store(awreqInterface, awreq, awReqs, awReqsMap);
		}
	}

	/**
	 * Generic method to store a requirement in its appropriate requirement collection and map. This method assumes both
	 * collections have already been instantiated and, therefore, is only a shortcut to make the buildCollections() method
	 * less verbose.
	 * 
	 * @param iface
	 *          The declared interface of the requirement that serves as key for the requirements map.
	 * @param req
	 *          The requirement instance.
	 * @param reqs
	 *          The requirement collection.
	 * @param reqsMap
	 *          The requirements map.
	 */
	@SuppressWarnings("unchecked")
	private <R> void store(Class<? extends R> iface, R req, Collection<R> reqs, Map<Class<? extends R>, R> reqsMap) {
		reqs.add(req);
		reqsMap.put(iface, req);
		ifacesMap.put(iface.getName(), (Class<? extends Requirement>) iface);
	}

	/**
	 * Retrieves a requirement instance from the model's elements, given its declared interface.
	 * 
	 * @param reqClass
	 *          The declared interface of the requirement.
	 * @return The requirement instance, if found, or <code>null</code> otherwise.
	 */
	@SuppressWarnings("unchecked")
	public <R extends Requirement> R retrieveRequirementInstance(Class<R> reqClass) {
		R req = null;

		// Checks the element's type and obtains the requirement instance from the appropriate map.
		switch (GoalModelUtils.getEmfType(reqClass)) {
		case GorePackage.AW_REQ:
			req = reqClass.cast(awReqsMap.get((Class<? extends AwReq>) reqClass));
			break;
		case GorePackage.DOMAIN_ASSUMPTION:
			req = reqClass.cast(domainAssumptionsMap.get((Class<? extends DomainAssumption>) reqClass));
			break;
		case GorePackage.GOAL:
			req = reqClass.cast(goalsMap.get(Goal.class.asSubclass(reqClass)));
			break;
		case GorePackage.QUALITY_CONSTRAINT:
			req = reqClass.cast(qualityConstraintsMap.get((Class<? extends QualityConstraint>) reqClass));
			break;
		case GorePackage.SOFTGOAL:
			req = reqClass.cast(softgoalsMap.get((Class<? extends Softgoal>) reqClass));
			break;
		case GorePackage.TASK:
			req = reqClass.cast(tasksMap.get((Class<? extends Task>) reqClass));
			break;
		}

		// Returns the requirement instance retrieved from the maps, or null if not found (or unrecognized type).
		return req;
	}

	/**
	 * Retrieves a requirement instance from the model's elements, given its declared interface's name.
	 * 
	 * @param reqClassName
	 *          The name of the declared interface of the requirement.
	 * @return The requirement instance, if found, or <code>null</code> otherwise.
	 */
	public Requirement retrieveRequirementInstance(String reqClassName) {
		// Searches for the interface that represents this requirement by its name.
		Class<? extends Requirement> iface = ifacesMap.get(reqClassName);

		// If not null, search for the instance using the requirement's interface.
		return (iface == null) ? null : retrieveRequirementInstance(iface);
	}
}
