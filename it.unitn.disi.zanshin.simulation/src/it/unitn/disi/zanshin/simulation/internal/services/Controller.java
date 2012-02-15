package it.unitn.disi.zanshin.simulation.internal.services;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Controller extends ITargetSystemControllerService {
	/**
	 * TODO: document this method.
	 * @return
	 * @throws Exception
	 */
	GoalModel createNewModel() throws Exception;
}
