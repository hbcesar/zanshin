package it.unitn.disi.zanshin.controller.internal.server;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GOREElement;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.remote.ITargetSystem;
import it.unitn.disi.zanshin.services.IModelManagementService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SessionManager {
	/** TODO: document this field. */
	private IModelManagementService modelManagementService;

	/** TODO: document this field. */
	private IRepositoryService repositoryService;

	/** TODO: document this field. */
	private ITargetSystem targetSystem;

	/** TODO: document this field. */
	private String targetSystemId;

	/** TODO: document this field. */
	private IFile modelFile;

	/** TODO: document this field. */
	private Resource modelResource;

	/** Constructor. */
	public SessionManager(IModelManagementService modelManagementService, IRepositoryService repositoryService, ITargetSystem targetSystem, String targetSystemId, IFile modelFile) {
		this.modelManagementService = modelManagementService;
		this.repositoryService = repositoryService;
		this.targetSystem = targetSystem;
		this.targetSystemId = targetSystemId;
		this.modelFile = modelFile;
	}

	/** Getter for targetSystem. */
	ITargetSystem getTargetSystem() {
		return targetSystem;
	}

	/** Getter for targetSystemId. */
	String getTargetSystemId() {
		return targetSystemId;
	}

	/** Setter for targetSystem. */
	void setTargetSystem(ITargetSystem targetSystem) {
		this.targetSystem = targetSystem;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	Long createSession() throws IOException, CoreException {
		// Checks if the resource has been loaded, loading it otherwise.
		if (modelResource == null)
			modelResource = modelManagementService.readModel(modelFile);

		// Creates a new instance of the requirements model.
		GoalModel model = modelManagementService.createGoalModel(modelResource);

		// Registers this model in the repository service.
		repositoryService.storeGoalModel(model);

		// Returns the ID of the goal model as the ID of the session.
		return model.getId();
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param userSessionId
	 * @param requirementsName
	 * @return
	 */
	GOREElement retrieveRequirement(Long userSessionId, String requirementsName) {
		// Retrieve the requirement instance from the repository service.
		return (GOREElement) repositoryService.retrieveRequirement(userSessionId, requirementsName);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param userSessionId
	 * @return
	 */
	boolean disposeSession(Long userSessionId) {
		// If the session doesn't exist, returns.
		GoalModel model = repositoryService.retrieveGoalModel(userSessionId);
		if (model == null)
			return false;

		// If it does disposes it and then returns.
		repositoryService.disposeGoalModel(userSessionId);
		return true;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param newConfig
	 * @param level
	 * @param userSessionId
	 * @throws CoreException
	 * @throws IOException
	 */
	void updateModel(Configuration newConfig, AggregationLevel level, Long userSessionId) throws IOException, CoreException {
		// Checks if the update should be done at the instance level.
		if ((level == AggregationLevel.INSTANCE) || (level == AggregationLevel.BOTH)) {
			GoalModel model = repositoryService.retrieveGoalModel(userSessionId);

			// If the session exists, updates its configuration.
			if (model != null)
				updateConfiguration(model.getConfiguration(), newConfig);
		}

		// Checks if the update should be done at the class level.
		if ((level == AggregationLevel.CLASS) || (level == AggregationLevel.BOTH)) {
			// Checks if the resource has been loaded, loading it otherwise.
			if (modelResource == null)
				modelResource = modelManagementService.readModel(modelFile);

			// Retrieves the configuration object from the model and updates it.
			GoalModel model = (GoalModel) modelResource.getContents().get(0);
			updateConfiguration(model.getConfiguration(), newConfig);
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param originalConfig
	 * @param newConfig
	 */
	private void updateConfiguration(Configuration originalConfig, Configuration newConfig) {
		// Look for the parameters given in the new configuration in the original model and changes them.
		for (Parameter newParam : newConfig.getParameters()) {
			Parameter paramToChange = null;
			for (Parameter param : originalConfig.getParameters()) {
				if (param.eClass().equals(newParam.eClass()))
					paramToChange = param;
			}

			// If the parameter was found, changes its value.
			if (paramToChange != null)
				paramToChange.setValue(newParam.getValue());
		}
	}
}
