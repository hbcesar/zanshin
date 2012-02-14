package it.unitn.disi.zanshin.simulation.internal.services;

import org.eclipse.emf.ecore.EPackage;

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
	 * @param ePackage
	 * @return
	 * @throws Exception
	 */
	GoalModel createNewModel(EPackage ePackage) throws Exception;
}
