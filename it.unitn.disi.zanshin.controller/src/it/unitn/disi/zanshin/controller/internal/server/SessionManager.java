package it.unitn.disi.zanshin.controller.internal.server;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.GoalModel;
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
	private String targetSystemId;

	/** TODO: document this field. */
	private IFile modelFile;

	/** TODO: document this field. */
	private Resource modelResource;

	/** Constructor. */
	public SessionManager(IModelManagementService modelManagementService, IRepositoryService repositoryService, String targetSystemId, IFile modelFile) {
		this.modelManagementService = modelManagementService;
		this.repositoryService = repositoryService;
		this.targetSystemId = targetSystemId;
		this.modelFile = modelFile;
	}

	/** Getter for targetSystemId. */
	public String getTargetSystemId() {
		return targetSystemId;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	public Long createSession() throws IOException, CoreException {
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
	public DefinableRequirement retrieveRequirement(Long userSessionId, String requirementsName) {
		// Retrieve the requirement instance from the repository service.
		return (DefinableRequirement) repositoryService.retrieveRequirement(userSessionId, requirementsName);
	}
}
