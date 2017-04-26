package it.unitn.disi.zanshin.core.internal.services;

import it.unitn.disi.zanshin.core.Activator;
import it.unitn.disi.zanshin.core.CoreUtils;
import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.services.IModelManagementService;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * Implementation of the Model Management Service that uses Eclipse's features (Java compiler, EMF, etc.) to implement
 * Zanshin projects and related operations.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ModelManagementService implements IModelManagementService {
	/** Path for the generator file for the base packages eca, goalmodel and LTL. */
	private static final String BASE_GENMODEL_FILE_PATH = "it.unitn.disi.zanshin.core/META-INF/zanshin.genmodel"; //$NON-NLS-1$

	/** String that represents the path to the root of a bundle. */
	private static final String ROOT_PATH = "/"; //$NON-NLS-1$

	/** String that represents the path to the JAR that contains the base classes for Zanshin models. */
	private static final String ZANSHIN_MODELS_JAR_PATH = "/META-INF/zanshin-models.jar"; //$NON-NLS-1$

	/** String that represents the path to the JAR that contains basic Java classes (rt.jar, provided by the JRE). */
	private static final String JAVA_RUNTIME_JAR_PATH = System.getProperty("java.home") + File.separator + "lib" + File.separator + "rt.jar"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	/** Global EMF resource set, where EMF packages are registered. */
	private ResourceSet resourceSet;

	/** Reference to Zanshin's generator model, instantiated during class initialization. */
	private GenModel baseGenModel;

	/**
	 * Initializes the model management service implementation
	 * 
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	@SuppressWarnings("deprecation")
	private void init() throws CoreException, IOException {
		CoreUtils.log.debug("Initializing Zanshin Model Management Service"); //$NON-NLS-1$

		// Initializes the ECore and GenModel models.
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Initializes Zanshin packages.
		EcaPackage.eINSTANCE.eClass();

		// Creates a resource set for this service, using the global package registry.
		resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
		resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);

		// Registers a factory for generator models.
		Resource.Factory.Registry registry = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put(IModelManagementService.GENMODEL_FILE_EXTENSION, new XMIResourceFactoryImpl());
		map.put(IModelManagementService.META_MODEL_FILE_EXTENSION, new XMIResourceFactoryImpl());

		// Loads Zanshin's generator model.
		URI genModelURI = URI.createPlatformPluginURI(BASE_GENMODEL_FILE_PATH, false);
		Resource baseGenModelResource = resourceSet.getResource(genModelURI, true);
		baseGenModelResource.load(Collections.EMPTY_MAP);
		baseGenModel = (GenModel) baseGenModelResource.getContents().get(0);

		// Fixes the references to generic EPackages to the proper EcaPackage, GorePackage, etc.
		for (GenPackage genPackage : baseGenModel.getGenPackages()) {
			String uri = genPackage.getEcorePackage().getNsURI();
			EPackage correctPackage = resourceSet.getPackageRegistry().getEPackage(uri);
			genPackage.setEcorePackage(correctPackage);
		}

		// Disables auto-build for Zanshin projects.
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceDescription description = workspace.getDescription();
		description.setAutoBuilding(false);
		workspace.setDescription(description);
	}

	/** @see it.unitn.disi.zanshin.services.IModelManagementService#createZanshinProject(java.lang.String) */
	@Override
	public IProject createZanshinProject(String projectName) throws CoreException, IOException {
		CoreUtils.log.debug("Creating a Zanshin project in the workspace: {0}", projectName); //$NON-NLS-1$
		IProgressMonitor monitor = new NullProgressMonitor();

		// Creates the reference to a project in the workspace for the target system.
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);

		// If the project exists, deletes it.
		if (project.exists())
			project.delete(true, true, monitor);

		// Creates a new project and opens it.
		project.create(monitor);
		project.open(monitor);

		// Creates the project's subfolders.
		for (String subdir : PROJECT_SUBDIRS) {
			IFolder folder = project.getFolder(subdir);
			folder.create(true, true, monitor);
		}

		// Adds the Java project nature to the project so we can compile classes later.
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = JavaCore.NATURE_ID;
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);

		// Creates a classpath for the Java project so we can compile classes later.
		IJavaProject javaProject = JavaCore.create(project);
		List<IClasspathEntry> classpath = new ArrayList<>();

		// First and foremost, adds the Java Runtime classes to the classpath.
		classpath.add(JavaCore.newLibraryEntry(new Path(JAVA_RUNTIME_JAR_PATH), null, null));

		// FIXME: is there a better way of retrieving the Java rt.jar path from the environment?
		// In the code below, vmInstall is null and the following line throws an NPE.
		// IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		// LibraryLocation[] locations= JavaRuntime.getLibraryLocations(vmInstall);
		// for (LibraryLocation location : locations)
		// classpath.add(JavaCore.newLibraryEntry(location.getSystemLibraryPath(), null, null));

		// Adds EMF Common and ECore Eclipse plug-ins to the classpath.
		classpath.add(createClasspathEntryForClass(Adapter.class));
		classpath.add(createClasspathEntryForClass(EClass.class));

		// Adds the Zanshin model classes to the classpath.
		Bundle bundle = Activator.getContext().getBundle();
		URL url = bundle.getEntry(ZANSHIN_MODELS_JAR_PATH);
		IPath path = new Path(FileLocator.toFileURL(url).getPath());
		classpath.add(JavaCore.newLibraryEntry(path, null, null));

		// Adds the source folder to the classpath.
		IFolder sourceFolder = project.getFolder(SOURCES_PROJECT_SUBDIR);
		classpath.add(JavaCore.newSourceEntry(sourceFolder.getFullPath()));

		// Effectively sets the classpath in the project.
		javaProject.setRawClasspath(classpath.toArray(new IClasspathEntry[0]), monitor);

		// Sets the project's classes folder, in which Java classes will be compiled.
		IFolder classesFolder = project.getFolder(CLASSES_PROJECT_SUBDIR);
		javaProject.setOutputLocation(classesFolder.getFullPath(), monitor);

		// Returns the created project.
		CoreUtils.log.info("Created Zanshin project {0} in location: {1}", projectName, project.getLocation()); //$NON-NLS-1$
		return project;
	}

	/**
	 * Create's an Eclipse classpath entry for the bundle (plug-in) that contains a specific class. This method is used to
	 * include Eclipse plug-ins like EMF Common and EMF Ecore in the classpath of the Zanshin project in order to compile
	 * the classes that are generated from requirements meta-models.
	 * 
	 * @param clazz
	 *          The class whose bundle should be included in the classpath.
	 * @return The Eclipse classpath entry that can be associated with an Eclipse Java project.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	private IClasspathEntry createClasspathEntryForClass(Class<?> clazz) throws IOException {
		Bundle bundle = FrameworkUtil.getBundle(clazz);
		URL url = bundle.getEntry(ROOT_PATH);
		IPath path = new Path(FileLocator.toFileURL(url).getPath());
		return JavaCore.newLibraryEntry(path, null, null);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IModelManagementService#createMetaModel(org.eclipse.core.resources.IProject,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public IFile createMetaModel(IProject project, String metaModelName, String contents) throws CoreException, IOException {
		CoreUtils.log.debug("Creating a new meta-model file in project {0} with name: {1}", project.getName(), metaModelName); //$NON-NLS-1$

		// Creates the file in the model folder of the project.
		IFolder modelFolder = project.getFolder(MODELS_PROJECT_SUBDIR);
		IFile metaModelFile = createFile(modelFolder, metaModelName, contents);

		// Returns the file descriptor.
		CoreUtils.log.info("Created meta-model file in project {0} in location: {1}", project.getName(), metaModelFile.getLocation()); //$NON-NLS-1$
		return metaModelFile;
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IModelManagementService#createModel(org.eclipse.core.resources.IProject,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public IFile createModel(IProject project, String modelName, String contents) throws CoreException, IOException {
		CoreUtils.log.debug("Creating a new model file in project {0} with name: {1}", project.getName(), modelName); //$NON-NLS-1$

		// If the service's resource set has not been initialized yet, initializes it now.
		if (resourceSet == null)
			init();

		// Creates the file in the model folder of the project.
		IFolder modelFolder = project.getFolder(MODELS_PROJECT_SUBDIR);
		IFile modelFile = createFile(modelFolder, modelName, contents);

		// Registers the resource factory for the extension of this model.
		Resource.Factory.Registry registry = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put(modelFile.getFileExtension(), new XMIResourceFactoryImpl());

		// Returns the file descriptor.
		CoreUtils.log.info("Created model file in project {0} in location: {1}", project.getName(), modelFile.getLocation()); //$NON-NLS-1$
		return modelFile;
	}

	/**
	 * Given an Eclipse descriptor for a folder, a file name and its textual contents, creates the file in the specified
	 * folder with the specified contents and returns a descriptor to it.
	 * 
	 * @param folder
	 *          The descriptor of the folder in the project that should hold the file.
	 * @param fileName
	 *          The name of the file to be created.
	 * @param contents
	 *          The contents to be put into the file that is created.
	 * @return An Eclipse descriptor of the file that was just created in the project's folder.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	private IFile createFile(IFolder folder, String fileName, String contents) throws CoreException, IOException {
		// Creates the reference to the model file in the given folder.
		IFile file = folder.getFile(fileName);

		// If the file already exists, deletes it.
		IProgressMonitor monitor = new NullProgressMonitor();
		if (file.exists())
			file.delete(true, monitor);

		// Creates a new file with the specified contents and returns it.
		try (InputStream inputStream = new ByteArrayInputStream(contents.getBytes())) {
			file.create(inputStream, true, monitor);
		}
		return file;
	}

	/** @see it.unitn.disi.zanshin.services.IModelManagementService#readModel(org.eclipse.core.resources.IFile) */
	@Override
	public Resource readModel(IFile metaModelFile) throws IOException, CoreException {
		return readModel(URI.createFileURI(metaModelFile.getLocation().toString()));
	}

	/**
	 * Given an EMF URI, reads the model that is pointed by it and returns the EMF resource that contains the models'
	 * contents.
	 * 
	 * @param modelURI
	 *          The EMF URI that points to the model.
	 * @return An EMF resource with the models' contents.
	 * @throws CoreException
	 *           If any Eclipse errors occur during this operation.
	 * @throws IOException
	 *           If any I/O errors occur during this operation.
	 */
	private Resource readModel(URI modelURI) throws IOException, CoreException {
		CoreUtils.log.debug("Reading a (meta-)model file from location: {0}", modelURI); //$NON-NLS-1$

		// If the service's resource set has not been initialized yet, initializes it now.
		if (resourceSet == null)
			init();

		// Loads the model file as a resource and returns.
		return resourceSet.getResource(modelURI, true);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IModelManagementService#createGenModelFile(org.eclipse.emf.ecore.EPackage,
	 *      java.lang.String, java.lang.String, org.eclipse.core.resources.IFolder, org.eclipse.core.resources.IFolder)
	 */
	@Override
	public Resource createGenModelFile(IFile metaModelFile, String basePackage) throws IOException, CoreException {
		// If the service's resource set has not been initialized yet, initializes it now.
		if (resourceSet == null)
			init();

		CoreUtils.log.debug("Creating a generator model for {0} with base package: {1}", metaModelFile.getName(), basePackage); //$NON-NLS-1$

		// Retrieves the target dir (where the sources should be generated).
		IProject project = metaModelFile.getProject();
		IFolder targetDir = project.getFolder(SOURCES_PROJECT_SUBDIR);

		// Determines the paths and URIs.
		IPath ecorePath = metaModelFile.getLocation();
		CoreUtils.log.debug("Caminho do metamodelo: {0}", ecorePath.toString()); 
		IPath genModelPath = ecorePath.removeFileExtension().addFileExtension(GENMODEL_FILE_EXTENSION);
		URI ecoreURI = URI.createFileURI(ecorePath.toString());
		URI genModelURI = URI.createFileURI(genModelPath.toString());

		// Retrieves the model package.
		Resource resource = resourceSet.getResource(ecoreURI, true);
		EPackage ePackage = (EPackage) resource.getContents().get(0);

		// Initializes the generator model and its resource.
		Resource genModelResource = resourceSet.createResource(genModelURI);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);
		resourceSet.getResources().add(genModelResource);

		// Indicates where the classes should be generated (uses file system path, not URI).
		genModel.setModelDirectory(targetDir.getFullPath().toString());

		// Indicates the name of the model file whose classes should be generated.
		String modelFileName = ePackage.eResource().getURI().lastSegment();
		genModel.getForeignModel().add(modelFileName);

		// Finishes the generator model configuration (model name, base package).
		genModel.initialize(Collections.singleton(ePackage));
		genModel.setModelName(genModelURI.trimFileExtension().lastSegment());
		GenPackage genPackage = genModel.getGenPackages().get(0);
		genPackage.setBasePackage(basePackage);

		// Adds a reference to the base generator model for Zanshin.
		for (GenPackage pkg : baseGenModel.getGenPackages())
			genModel.getUsedGenPackages().add(pkg);

		// Generates the genmodel file and returns.
		genModelResource.save(Collections.EMPTY_MAP);
		CoreUtils.log.info("Generator model created in location: {0}", genModelPath); //$NON-NLS-1$
		CoreUtils.log.info("Generator model should generate files in the following location: {0}", targetDir.getLocation()); //$NON-NLS-1$
		return genModelResource;
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IModelManagementService#generateClasses(org.eclipse.core.runtime.IProgressMonitor,
	 *      org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	public void generateClasses(Resource genModelResource) {
		CoreUtils.log.debug("Generating classes from generator model..."); //$NON-NLS-1$
		IProgressMonitor monitor = new NullProgressMonitor();

		//AQUI: Nessa parte que ele throws o erro, dizendo que o genmodel ta invalido.
		// Retrieves the genmodel object from the genmodel resource and checks that it's valid.
		GenModel genModel = (GenModel) genModelResource.getContents().get(0);
		CoreUtils.log.debug(genModel.toString());
		IStatus status = genModel.validate();
		if (!status.isOK()) {
			Diagnostic diagnostic = genModel.diagnose();
			throw new IllegalStateException("Genmodel file is not valid. Diagnostic message is: " + diagnostic.getMessage()); //$NON-NLS-1$
		}

		// Creates a generator from the genmodel file and configures the generation.
		Generator generator = new Generator();
		generator.setInput(genModel);
		genModel.setForceOverwrite(true);
		genModel.reconcile();
		genModel.setCanGenerate(true);
		genModel.setValidateModel(true);
		genModel.setUpdateClasspath(false);
		genModel.setCodeFormatting(true);

		// Generates the source code following the instructions contained in the genmodel file.
		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, CodeGenUtil.EclipseUtil.createMonitor(monitor, 1));
		CoreUtils.log.info("Source files for model classes generated in the location specified in the generator model."); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.IModelManagementService#compileClasses(org.eclipse.core.resources.IProject) */
	@Override
	public void compileClasses(IProject project) throws CoreException {
		CoreUtils.log.debug("Compiling classes that were generated in project {0}...", project.getName()); //$NON-NLS-1$
		IProgressMonitor monitor = new NullProgressMonitor();

		// Builds the project, as classpath and source folder have already been set.
		project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
	}

	/** @see it.unitn.disi.zanshin.services.IModelManagementService#unregisterMetaModel(org.eclipse.emf.ecore.EPackage) */
	@Override
	public void unregisterMetaModel(EPackage ePackage) {
		// Retrieves the package that is registered under the same namespace as the given package (for logging purposes).
		String namespaceURI = ePackage.getNsURI();
		EPackage.Registry packageRegistry = resourceSet.getPackageRegistry();
		EPackage registeredPackage = packageRegistry.getEPackage(namespaceURI);

		// Removes the package that was registered under the given namespace (if any).
		packageRegistry.remove(namespaceURI);
		CoreUtils.log.info("Removed namespace {0} from the package registry: {1}", namespaceURI, registeredPackage); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.services.IModelManagementService#createGoalModel(org.eclipse.emf.ecore.resource.Resource) */
	@Override
	public GoalModel createGoalModel(Resource modelResource) {
		// Retrieves the root object from the model.
		EObject modelRoot = modelResource.getContents().get(0);

		// Creates a copy of the original model, otherwise this will always return the same instance.
		EObject modelRootCopy = EcoreUtil.copy(modelRoot);

		// Converts the object to the GoalModel interface and returns.
		return (GoalModel) modelRootCopy;
	}
}
