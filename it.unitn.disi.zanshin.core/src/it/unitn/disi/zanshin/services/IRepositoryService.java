package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;

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
	 * @param reqClass
	 * @return
	 */
	<R extends Requirement> R retrieveRequirement(Long modelId, Class<R> reqClass);
	
	/**
	 * TODO: document this method.
	 * @param modelId
	 * @param reqClassName
	 * @return
	 */
	Requirement retrieveRequirement(Long modelId, String reqClassName);
}
