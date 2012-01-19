package it.unitn.disi.zanshin.internal.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * Helper class for the Repository Service's implementation, which parses a goal model and stores their elements in maps
 * indexed by their EMF classes. This class also contains a map that indexes EMF classes by their name, in order to
 * allow for the search of a requirement instance given their name, and a map of AwReq targets, that maps requirements
 * to AwReqs that target them.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class GoalModelElements {
	/** Goal model that owns the elements contained in this. */
	private GoalModel model;

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

	/** The EMF class map, mapping the EMF Class name to its object. */
	private Map<String, EClass> eClassMap = new HashMap<>();

	/** The targets map, mapping EMF Classes to AwReqs that target them. */
	private Map<EClass, Set<AwReq>> targetsMap = new HashMap<>();

	/** Constructor. */
	protected GoalModelElements(GoalModel model) {
		this.model = model;
		buildCollections();
	}

	/**
	 * Builds the collections of elements of the model.
	 */
	private void buildCollections() {
		// Uses a visitor to go through every element in the tree and store them in the collections, starting from the root.
		RequirementTreeVisitor visitor = new RequirementTreeVisitor(model.getRootGoal()) {
			@Override
			protected void visit(Requirement req) {
				// Checks the element's type and stores it in the appropriate collections.
				EList<EClass> superTypes = req.eClass().getEAllSuperTypes();
				int superTypeId = superTypes.get(superTypes.size() - 1).getClassifierID();
				switch (superTypeId) {
				case GorePackage.AW_REQ:
					store((AwReq) req, awReqsMap);
					break;
				case GorePackage.DOMAIN_ASSUMPTION:
					store((DomainAssumption) req, domainAssumptionsMap);
					break;
				case GorePackage.GOAL:
					store((Goal) req, goalsMap);
					break;
				case GorePackage.QUALITY_CONSTRAINT:
					store((QualityConstraint) req, qualityConstraintsMap);
					break;
				case GorePackage.SOFTGOAL:
					store((Softgoal) req, softgoalsMap);
					break;
				case GorePackage.TASK:
					store((Task) req, tasksMap);
					break;
				}
			}
		};

		// Parses the tree with the visitor.
		visitor.parse();

		// Goes through the softgoal list.
		for (Softgoal sg : model.getSoftgoals()) {
			store(sg, softgoalsMap);

			// Goes through the softgoal's quality constraint list.
			for (QualityConstraint qc : sg.getConstraints())
				store(qc, qualityConstraintsMap);
		}

		// Lastly, goes through the AwReqs list.
		for (AwReq awreq : model.getAwReqs())
			store(awreq, awReqsMap);
	}

	/**
	 * Generic method to store a requirement in its appropriate requirement map. This method assumes the map has already
	 * been instantiated and, therefore, is only a shortcut to make the buildCollections() method less verbose.
	 * 
	 * Also, if the requirement is an AwReq, adds its target to thet target map.
	 * 
	 * @param eClass
	 *          The EMF class of the requirement that serves as key for the requirements map.
	 * @param req
	 *          The requirement instance.
	 * @param reqsMap
	 *          The requirements map.
	 */
	private <R extends Requirement> void store(R req, Map<EClass, R> reqsMap) {
		EClass eClass = req.eClass();
		reqsMap.put(eClass, req);
		eClassMap.put(eClass.getName(), eClass);

		// If the requirement is an AwReq, adds its targets to the target map.
		if (req instanceof AwReq) {
			AwReq awreq = (AwReq) req;
			DefinableRequirement target = awreq.getTarget();
			if (target != null)
				addToTargetMap(target, awreq);
			for (DefinableRequirement otherTarget : awreq.getOtherTargets())
				addToTargetMap(otherTarget, awreq);
		}
	}

	/**
	 * Adds the given AwReq to the targets map, checking if the EMF class of the target is already on the map. If it is,
	 * adds to the existing set of AwReqs, otherwise it creates a new set for that EMF class.
	 * 
	 * @param target
	 *          The target of the AwReq.
	 * @param awreq
	 *          The AwReq to be added to the targets map.
	 */
	private void addToTargetMap(DefinableRequirement target, AwReq awreq) {
		// Checks if this class is already present in the map.
		EClass reqClass = target.eClass();
		if (targetsMap.containsKey(reqClass)) {
			// If already present, add the AwReq to the set of targets.
			Set<AwReq> awreqs = targetsMap.get(reqClass);
			awreqs.add(awreq);
		}
		else {
			// If not present, create a new set of AwReqs for this target and place it in the map.
			Set<AwReq> awreqs = new HashSet<>();
			awreqs.add(awreq);
			targetsMap.put(reqClass, awreqs);
		}
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
		for (EClass superType : superTypes)
			superTypeIds.add(superType.getClassifierID());
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

	/**
	 * Replaces an instance of a requirement with a new instance, not only in the goal model itself but also in any
	 * collections in which these instances might appear.
	 * 
	 * @param oldReq
	 *          The requirement to be replaced.
	 * @param newReq
	 *          The new requirement.
	 */
	public void replaceRequirement(Requirement oldReq, Requirement newReq) {
		// Changes the parent-child relationship.
		Requirement parent = oldReq.getParent();
		newReq.setParent(parent);
		oldReq.setParent(null);
		if (parent != null) {
			EList<Requirement> children = parent.getChildren();
			children.remove(oldReq);
			children.add(newReq);
		}

		// If the requirement to replace is a softgoal, replace it in the softgoal list and map.
		if (oldReq instanceof Softgoal) {
			Softgoal oldSG = (Softgoal) oldReq, newSG = (Softgoal) newReq;
			model.getSoftgoals().remove(oldSG);
			model.getSoftgoals().add(newSG);
			softgoalsMap.put(newSG.eClass(), newSG);
		}

		// If the requirement to replace is a quality constraint, replace it in the softgoal and the QC map.
		else if (oldReq instanceof QualityConstraint) {
			QualityConstraint oldQC = (QualityConstraint) oldReq, newQC = (QualityConstraint) newReq;
			Softgoal softgoal = oldQC.getSoftgoal();
			EList<QualityConstraint> qcs = softgoal.getConstraints();
			qcs.remove(oldQC);
			qcs.add(newQC);
			qualityConstraintsMap.put(newQC.eClass(), newQC);
		}

		// If the requirement to replace is an AwReq, replace it in the AwReq list and maps.
		else if (oldReq instanceof AwReq) {
			AwReq oldAwReq = (AwReq) oldReq, newAwReq = (AwReq) newReq;
			model.getAwReqs().remove(oldAwReq);
			model.getAwReqs().add(newAwReq);
			awReqsMap.put(newAwReq.eClass(), newAwReq);
			DefinableRequirement oldTarget = oldAwReq.getTarget();
			if ((oldTarget != null) && (targetsMap.containsKey(oldTarget.eClass()))) {
				Set<AwReq> awreqs = targetsMap.get(oldTarget.eClass());
				awreqs.remove(oldAwReq);
				awreqs.add(newAwReq);
			}
		}

		// Finally, uses a visitor to replace the requirement and all its descendants as AwReq targets.
		RequirementTreeVisitor visitor = new RequirementTreeVisitor(newReq) {
			@Override
			protected void visit(Requirement req) {
				EClass reqClass = req.eClass();

				// Checks if the requirement is target of any AwReq.
				if (targetsMap.containsKey(reqClass)) {
					// Goes through all AwReqs that target the requirement.
					for (AwReq awreq : targetsMap.get(reqClass)) {
						// If it's the primary target, replace it.
						if (reqClass.equals(awreq.getTarget().eClass()))
							awreq.setTarget((DefinableRequirement) req);

						// If it's one of the other targets, replace it.
						DefinableRequirement oldTarget = null;
						EList<DefinableRequirement> otherTargets = awreq.getOtherTargets();
						for (DefinableRequirement target : otherTargets)
							if (reqClass.equals(target.eClass()))
								oldTarget = target;
						if (oldTarget != null) {
							otherTargets.remove(oldTarget);
							otherTargets.add((DefinableRequirement) req);
						}
					}
				}
			}
		};
		visitor.parse();
	}
}
