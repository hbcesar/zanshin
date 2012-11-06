package it.unitn.disi.zanshin.controller.internal.server;

import it.unitn.disi.zanshin.controller.ControllerUtils;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.remote.ITargetSystem;
import it.unitn.disi.zanshin.remote.IZanshinServer;
import it.unitn.disi.zanshin.remote.ZanshinSecurityManager;
import it.unitn.disi.zanshin.services.IModelManagementService;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ZanshinRMIServer extends UnicastRemoteObject implements IZanshinServer, Serializable {
	/** TODO: document this field. */
	private static final String REQUIREMENTS_MODEL_FAKE_URI = "inputStream://fakeURI"; //$NON-NLS-1$

	/** The model management service. */
	private IModelManagementService modelManagementService;

	/** The repository service. */
	private IRepositoryService repositoryService;

	/** TODO: document this field. */
	private Map<String, SessionManager> sessionManagers = new HashMap<>();

	static {
		// Uses a custom security manager that allows RMI to operate.
		System.setSecurityManager(new ZanshinSecurityManager());
	}

	/** Constructor. */
	public ZanshinRMIServer() throws RemoteException {
		super();
	}

	/** Setter for modelManagementService. */
	public void setModelManagementService(IModelManagementService modelManagementService) {
		this.modelManagementService = modelManagementService;
		ControllerUtils.log.info("Model Management Service injected in the RMI server"); //$NON-NLS-1$
	}

	/** Un-setter for modelManagementService (required by OSGi Declarative Services). */
	public void unsetModelManagementService(IModelManagementService modelManagementService) {
		this.modelManagementService = null;
		ControllerUtils.log.info("Model Management disposed from the RMI server"); //$NON-NLS-1$
	}

	/** Setter for repositoryService. */
	public void setRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
		ControllerUtils.log.info("Repository Service injected in the RMI server"); //$NON-NLS-1$
	}

	/** Un-setter for repositoryService (required by OSGi Declarative Services). */
	public void unsetRepositoryService(IRepositoryService repositoryService) {
		this.repositoryService = null;
		ControllerUtils.log.info("Repository Service disposed from the RMI server"); //$NON-NLS-1$
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#registerTargetSystem(it.unitn.disi.zanshin.remote.ITargetSystem,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public String registerTargetSystem(ITargetSystem targetSystem, String metaModel, String model) throws RemoteException {
		ControllerUtils.log.debug("Received remote request to register a target system..."); //$NON-NLS-1$

		try {
			// Extracts the ID for this target system from its requirements meta-model.
			String targetSystemId = extractTargetSystemId(metaModel);

			// If the system is already registered, returns immediately.
			if (isTargetSystemRegistered(targetSystemId))
				return targetSystemId;

			// Creates a new project in the workspace for this target system.
			IProject project = modelManagementService.createZanshinProject(targetSystemId);

			// Creates files in the project to hold the system's requirements meta-model and model.
			IFile metaModelFile = modelManagementService.createMetaModel(project, targetSystemId + '.' + IModelManagementService.META_MODEL_FILE_EXTENSION, metaModel);
			IFile modelFile = modelManagementService.createModel(project, IModelManagementService.MODEL_FILE_BASE_NAME + '.' + targetSystemId, model);

			// Creates the genmodel file that is used to generate the Java classes.
			Resource genModelResource = modelManagementService.createGenModelFile(metaModelFile, IModelManagementService.DEFAULT_BASE_PACKAGE);
			ControllerUtils.log.debug("Target system model generator file created: {0}.", genModelResource.getURI()); //$NON-NLS-1$

			// Generate the Java classes.
			modelManagementService.generateClasses(genModelResource);
			ControllerUtils.log.debug("Target system model classes generated at project folder: {0}.", project.getLocation()); //$NON-NLS-1$

			// Compiles the Java classes that were generated.
			modelManagementService.compileClasses(project);
			ControllerUtils.log.debug("Classes generated for target system {0} were compiled successfully.", targetSystemId); //$NON-NLS-1$

			// Removes the generic ecore package that was added to the model management's package registry, so the real
			// package that was just compiled can take its place when it's initialized by the class loader (next).
			EPackage ePkg = (EPackage) modelManagementService.readModel(metaModelFile).getContents().get(0);
			modelManagementService.unregisterMetaModel(ePkg);

			// Creates a class loader for the classes that were just compiled and loads the model classes.
			ZanshinClassLoader classLoader = new ZanshinClassLoader(project, ePkg, IModelManagementService.DEFAULT_BASE_PACKAGE + '.' + targetSystemId);
			classLoader.loadModelClasses();

			// Creates a new session manager for this target system and stores it.
			SessionManager sessionManager = new SessionManager(modelManagementService, repositoryService, targetSystem, targetSystemId, modelFile);
			sessionManagers.put(targetSystemId, sessionManager);

			// Returns to the target system its ID so it's used in future calls.
			ControllerUtils.log.info("Successfully registered a new target system: {0}", targetSystemId); //$NON-NLS-1$
			return targetSystemId;
		}
		catch (Throwable e) {
			if (e instanceof Serializable)
				throw new RemoteException("Could not register target system. Causing exception attached.", e); //$NON-NLS-1$
			else throw new RemoteException("Could not register target system: " + e.getMessage()); //$NON-NLS-1$
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param requirements
	 * @return
	 * @throws IOException
	 */
	private String extractTargetSystemId(String requirements) throws IOException {
		// Initializes the ECore model.
		EcorePackage.eINSTANCE.eClass();

		// Loads the requirements as a resource from its contents.
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(REQUIREMENTS_MODEL_FAKE_URI));
		resource.load(new ByteArrayInputStream(requirements.getBytes()), Collections.EMPTY_MAP);

		// Retrieves the package object and returns its name.
		EPackage ePackage = (EPackage) resource.getContents().get(0);
		String id = ePackage.getName();
		ControllerUtils.log.debug("Extracted target system id from the system requirements: {0}", id); //$NON-NLS-1$
		return id;
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#createUserSession(java.lang.String) */
	@Override
	public Long createUserSession(String targetSystemId) throws RemoteException {
		ControllerUtils.log.debug("Received remote request to create a new user session for target system {0}...", targetSystemId); //$NON-NLS-1$

		try {
			// Retrieves the session manager for the given target system.
			SessionManager sessionManager = sessionManagers.get(targetSystemId);

			// Creates the new user session and returns its id.
			Long sessionId = sessionManager.createSession();
			ControllerUtils.log.info("Successfully created a new user session for target system {0}: {1}", targetSystemId, sessionId); //$NON-NLS-1$
			return sessionId;
		}
		catch (Throwable e) {
			if (e instanceof Serializable)
				throw new RemoteException("Could not create user session. Causing exception attached.", e); //$NON-NLS-1$
			else throw new RemoteException("Could not create user session: " + e.getMessage()); //$NON-NLS-1$
		}
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementStart(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementStart(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		logRequirementLifecycleMethod(targetSystemId, userSessionId, requirementsName, MonitorableMethod.START);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementSuccess(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementSuccess(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		logRequirementLifecycleMethod(targetSystemId, userSessionId, requirementsName, MonitorableMethod.SUCCESS);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementFailure(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementFailure(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		logRequirementLifecycleMethod(targetSystemId, userSessionId, requirementsName, MonitorableMethod.FAIL);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementCancellation(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementCancellation(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		logRequirementLifecycleMethod(targetSystemId, userSessionId, requirementsName, MonitorableMethod.CANCEL);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param targetSystemId
	 * @param userSessionId
	 * @param requirementsName
	 * @param start
	 */
	private void logRequirementLifecycleMethod(String targetSystemId, Long userSessionId, String requirementsName, MonitorableMethod method) throws RemoteException {
		ControllerUtils.log.debug("Received log for life-cycle method call in session {0}/{1}: {2}.{3}()", targetSystemId, userSessionId, requirementsName, method.getName()); //$NON-NLS-1$

		try {
			// Retrieves the session manager for the given target system.
			SessionManager sessionManager = sessionManagers.get(targetSystemId);

			// Retrieve the requirement instance of the given class corresponding to the session id.
			DefinableRequirement requirement = sessionManager.retrieveRequirement(userSessionId, requirementsName);

			// Calls the appropriate method in the class. The monitoring component should catch this via aspects and verify
			// the appropriate AwReqs.
			switch (method) {
			case START:
				requirement.start();
				break;
			case SUCCESS:
				requirement.success();
				break;
			case FAIL:
				requirement.fail();
				break;
			case CANCEL:
				((PerformativeRequirement) requirement).cancel();
				break;
			case END:
				requirement.end();
				break;
			}
		}
		catch (Throwable e) {
			if (e instanceof Serializable)
				throw new RemoteException("Could not create user session. Causing exception attached.", e); //$NON-NLS-1$
			else throw new RemoteException("Could not create user session: " + e.getMessage()); //$NON-NLS-1$
		}
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#isTargetSystemRegistered(java.lang.String) */
	@Override
	public Boolean isTargetSystemRegistered(String targetSystemId) throws RemoteException {
		return sessionManagers.containsKey(targetSystemId);
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#unregisterTargetSystem(java.lang.String) */
	@Override
	public Boolean unregisterTargetSystem(String targetSystemId) throws RemoteException {

		// If the system is registered, unregisters it.
		boolean result = isTargetSystemRegistered(targetSystemId);
		if (result)
			sessionManagers.remove(targetSystemId);

		// Returns true if the system was successfully unregistered, false otherwise.
		return result;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param targetSystemId
	 * @return
	 * @throws RemoteException
	 */
	public ITargetSystem retrieveTargetSystem(String targetSystemId) {
		// Retrieves the session manager for the given target system.
		SessionManager sessionManager = sessionManagers.get(targetSystemId);

		// If the session manager exists, returns the reference to the target system.
		return (sessionManager == null) ? null : sessionManager.getTargetSystem();
	}
}
