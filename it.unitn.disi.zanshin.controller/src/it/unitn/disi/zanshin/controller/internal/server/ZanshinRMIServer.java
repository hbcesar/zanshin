package it.unitn.disi.zanshin.controller.internal.server;

import it.unitn.disi.zanshin.controller.ControllerUtils;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.remote.IZanshinServer;
import it.unitn.disi.zanshin.services.IModelManagementService;

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
	
	/** TODO: document this field. */
	private Map<String, SessionManager> sessionManagers = new HashMap<>();

	/** Constructor. */
	public ZanshinRMIServer() throws RemoteException {
		super();
	}

	/** Setter for modelManagementService. */
	public void setModelManagementService(IModelManagementService modelManagementService) {
		this.modelManagementService = modelManagementService;
		ControllerUtils.log.info("Model Management Service injected in this bundle"); //$NON-NLS-1$
	}

	/** Un-setter for modelManagementService (required by OSGi Declarative Services). */
	public void unsetModelManagementService(IModelManagementService modelManagementService) {
		this.modelManagementService = null;
		ControllerUtils.log.info("Model Management disposed from this bundle"); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#registerTargetSystem(java.lang.String) */
	@Override
	public String registerTargetSystem(String requirements) throws RemoteException {
		String targetSystemId = null;
		ControllerUtils.log.debug("Received remote request to register a target system..."); //$NON-NLS-1$

		try {
			// Extracts the ID for this target system from its requirements definitions.
			targetSystemId = extractTargetSystemId(requirements);

			// Creates a new project in the workspace for this target system.
			IProject project = modelManagementService.createModelProject(targetSystemId);

			// Creates a file in the project to hold the system's requirements.
			IFile modelFile = modelManagementService.createModel(project, targetSystemId + '.' + IModelManagementService.MODEL_FILE_EXTENSION, requirements);

			// Creates the genmodel file that is used to generate the Java classes.
			Resource genModelResource = modelManagementService.createGenModelFile(modelFile, IModelManagementService.DEFAULT_BASE_PACKAGE);
			ControllerUtils.log.debug("Target system model generator file created: {0}.", genModelResource.getURI()); //$NON-NLS-1$

			// Generate the Java classes.
			modelManagementService.generateClasses(genModelResource);
			ControllerUtils.log.debug("Target system model classes generated at project folder: {0}.", project.getLocation()); //$NON-NLS-1$

			// Compiles the Java classes that were generated.
			modelManagementService.compileClasses(project);
			ControllerUtils.log.debug("Classes generated for target system {0} were compiled successfully.", targetSystemId); //$NON-NLS-1$

			// Creates a class loader for the classes that were just compiled.
			EPackage ePkg = (EPackage) modelManagementService.readModel(modelFile).getContents().get(0);
			ZanshinClassLoader classLoader = new ZanshinClassLoader(project, ePkg, IModelManagementService.DEFAULT_BASE_PACKAGE + '.' + targetSystemId);
			
			// Creates a new session manager for this target system and stores it.
			SessionManager sessionManager = new SessionManager(targetSystemId, classLoader);
			sessionManagers.put(targetSystemId, sessionManager);
		}
		catch (Throwable e) {
			if (e instanceof Serializable)
				throw new RemoteException("Could not register target system. Causing exception attached.", e); //$NON-NLS-1$
			else throw new RemoteException("Could not register target system: " + e.getMessage()); //$NON-NLS-1$
		}

		// Returns to the target system its ID so it's used in future calls.
		ControllerUtils.log.info("Successfully registered a new target system: {0}", targetSystemId); //$NON-NLS-1$
		return targetSystemId;
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
	public String createUserSession(String targetSystemId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementLifecycleMethodCall(java.lang.String, java.lang.String, java.lang.String, it.unitn.disi.zanshin.model.gore.MonitorableMethod) */
	@Override
	public void logRequirementLifecycleMethodCall(String targetSystemId, String userSessionId, String requirementsName, MonitorableMethod method) {
		// TODO Auto-generated method stub
		
	}
}
