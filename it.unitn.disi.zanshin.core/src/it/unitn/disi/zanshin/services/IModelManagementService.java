package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.GoalModel;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Interface that defines the Model Management Service. This service is responsible for creating Zanshin projects and
 * operating on their contents (create/load models, create/compile classes, etc.).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IModelManagementService {
	/** File extension for requirements models. */
	String META_MODEL_FILE_EXTENSION = "ecore"; //$NON-NLS-1$

	/** Default name for the model file of a target system, created by the model management service. */
	String MODEL_FILE_BASE_NAME = "model"; //$NON-NLS-1$

	/** Default extension for model generation files created by the model management service. */
	String GENMODEL_FILE_EXTENSION = "genmodel"; //$NON-NLS-1$

	/** Default value for the base package of classes generated using the model management service. */
	String DEFAULT_BASE_PACKAGE = "it.unitn.disi.zanshin.model"; //$NON-NLS-1$

	/** Name of the project sub-directory that will hold the project's models. */
	String MODELS_PROJECT_SUBDIR = "model"; //$NON-NLS-1$

	/** Name of the project sub-directory that will hold the project's source code files. */
	String SOURCES_PROJECT_SUBDIR = "src"; //$NON-NLS-1$

	/** Name of the project sub-directory that will hold the project's compiled classes. */
	String CLASSES_PROJECT_SUBDIR = "bin"; //$NON-NLS-1$

	/** List of names of sub-directories that should exist/be created for every project. */
	String[] PROJECT_SUBDIRS = new String[] { MODELS_PROJECT_SUBDIR, SOURCES_PROJECT_SUBDIR, CLASSES_PROJECT_SUBDIR };

	/**
	 * Creates a Zanshin project. One such project is created for every target system that is registered in Zanshin, in
	 * order to allow the framework to perform operations such as class generation, class compilation, model loading, etc.
	 * 
	 * @param projectName
	 *          Name of the project that should be created.
	 * @return An Eclipse project representing the target system.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	IProject createZanshinProject(String projectName) throws CoreException, IOException;

	/**
	 * Given the contents of the requirements meta-model of a target system (theoretically provided by the target system
	 * itself), creates a meta-model file for the project, so it is accessible for operations such as class generation,
	 * etc.
	 * 
	 * @param project
	 *          The Zanshin project related to the target system in question.
	 * @param metaModelName
	 *          The name of the meta-model file (without extension, a default one is appended).
	 * @param contents
	 *          The contents of the meta-model file, provided by the target system in question.
	 * @return An Eclipse file descriptor that represents the meta-model file that was created in the project.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	IFile createMetaModel(IProject project, String metaModelName, String contents) throws CoreException, IOException;

	/**
	 * Given the contents of the requirements model of a target system (theoretically provided by the target system
	 * itself), creates a model file for the project, so it is accessible for operations such as model instantiation, etc.
	 * 
	 * @param project
	 *          The Zanshin project related to the target system in question.
	 * @param metaModelName
	 *          The name of the model file (without extension, a default one is appended).
	 * @param contents
	 *          The contents of the model file, provided by the target system in question.
	 * @return An Eclipse file descriptor that represents the model file that was created in the project.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	IFile createModel(IProject project, String modelName, String contents) throws CoreException, IOException;

	/**
	 * Reads the (meta-)model file, returning a resource whose contents can be navigated.
	 * 
	 * @param modelFile
	 *          The (meta-)model file to be read.
	 * @return An EMF resource, whose contents can be read and modified.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 */
	Resource readModel(IFile modelFile) throws IOException, CoreException;

	/**
	 * Creates the generator model file based on the system's requirements meta-model. This step is required in order to
	 * generate the source code for the classes that represent the target system's requirements.
	 * 
	 * @param metaModelFile
	 *          The meta-model file that defines the classes to be generated.
	 * @param basePackage
	 *          The base package in which the classes will be put.
	 * @return An EMF resource representing the generator model, which can be used to effectively generate the classes.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 */
	Resource createGenModelFile(IFile metaModelFile, String basePackage) throws IOException, CoreException;

	/**
	 * Given a generator model, effectively generates source files for classes defined in the meta-model that was used to
	 * create it. All the details about the generation should be present in the model itself.
	 * 
	 * @param genModelResource
	 *          The EMF resource that represents the generator model.
	 */
	void generateClasses(Resource genModelResource);

	/**
	 * Compiles the classes of a Zanshin project. The sources for the classes should have been generated earlier,
	 * otherwise this method has no effect. Class compilation is necessary in order to load the classes in memory later
	 * and call life-cycle methods in them.
	 * 
	 * @param project
	 *          The project whose classes should be compiled.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 */
	void compileClasses(IProject project) throws CoreException;

	/**
	 * Unregisters a meta-model package from the global registry. This step is necessary in order for the real package,
	 * which can be loaded after its classes are generated and compiled, to take its place in the global registry.
	 * 
	 * @param ePackage
	 *          The meta-model package that should be unregistered.
	 */
	void unregisterMetaModel(EPackage ePackage);

	/**
	 * Creates a goal model instance, given the resource that refers to a target system's requirements model. Usually,
	 * this method creates a copy of the original model in memory so different sessions can refer to different instances
	 * and be independent.
	 * 
	 * @param modelResource
	 *          The EMF resource that refers to the target system's requirements model.
	 * @return An instance of a goal model, which should be the root of a target system's requirements model.
	 */
	GoalModel createGoalModel(Resource modelResource);
}
