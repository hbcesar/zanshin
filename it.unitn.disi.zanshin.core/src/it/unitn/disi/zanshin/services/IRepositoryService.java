package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;

import org.eclipse.emf.ecore.EClass;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IRepositoryService {
	/**
	 * TODO: document this method.
	 * @param model
	 */
	void storeGoalModel(GoalModel model);
	
	/**
	 * TODO: document this method.
	 * @param id
	 * @return
	 */
	GoalModel retrieveGoalModel(Long id);
	
	/**
	 * TODO: document this method.
	 * @param modelId
	 * @param eClass
	 * @return
	 */
	Requirement retrieveRequirement(Long modelId, EClass eClass);
	
	/**
	 * TODO: document this method.
	 * @param modelId
	 * @param eClassName
	 * @return
	 */
	Requirement retrieveRequirement(Long modelId, String eClassName);
}
