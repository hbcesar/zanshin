package it.unitn.disi.zanshin.controller.internal.server;

import it.unitn.disi.zanshin.controller.ControllerUtils;
import it.unitn.disi.zanshin.model.gore.GOREElement;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ZanshinClassLoader extends ClassLoader {
	/** TODO: document this field. */
	private static final String COMPILED_CLASSES_PATH = "/bin/"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String CLASS_EXTENSION = "class"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String UTILITY_PACKAGE_NAME = "util"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String IMPLEMENTATION_PACKAGE_NAME = "impl"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String IMPLEMENTATION_CLASS_SUFFIX = "Impl"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String FACTORY_CLASS_SUFFIX = "Factory"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String PACKAGE_CLASS_SUFFIX = "Package"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String PACKAGE_LITERALS_CLASS_SUFFIX = "Package$Literals"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String SWITCH_CLASS_SUFFIX = "Switch"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String ADAPTER_FACTORY_CLASS_SUFFIX = "AdapterFactory"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String FACTORY_INIT_METHOD_NAME = "init"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String FACTORY_CREATE_METHOD_PREFIX = "create"; //$NON-NLS-1$

	/** TODO: document this field. */
	private IProject modelProject;

	/** TODO: document this field. */
	private EPackage ePackage;

	/** TODO: document this field. */
	private String basePackage;

	/** TODO: document this field. */
	private String basePackagePath;

	/** TODO: document this field. */
	private Class<? extends EFactory> factoryClass;

	/** TODO: document this field. */
	private EFactory factoryInstance;

	/** TODO: document this field. */
	private Map<String, Class<? extends GOREElement>> requirementsMap = new HashMap<>();

	/** Constructor. */
	protected ZanshinClassLoader(IProject modelProject, EPackage ePackage, String basePackage) {
		super(ZanshinClassLoader.class.getClassLoader());
		this.modelProject = modelProject;
		this.ePackage = ePackage;
		this.basePackage = basePackage;

		// Determines the base package path from its fully-qualified name.
		basePackagePath = COMPILED_CLASSES_PATH + basePackage.replaceAll("\\.", "/"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * TODO: document this method.
	 * 
	 * @throws ZanshinClassLoaderException
	 */
	protected void loadModelClasses() throws ZanshinClassLoaderException {
		// Initializes the class loader, loading the model classes, package, factory and utils.
		// The boolean parameter indicates loading of interfaces (false) or classes (true).
		try {
			loadModelClasses(false);
			loadUtilityClasses(false);
			loadModelClasses(true);
			loadUtilityClasses(true);
		}
		catch (Exception e) {
			throw new ZanshinClassLoaderException(e);
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @throws IOException
	 *           If an I/O error occurs during the loading of a compiled class.
	 * @throws CoreException
	 *           If Eclipse throws an exception during the loading of a compiled class.
	 */
	@SuppressWarnings("unchecked")
	private void loadModelClasses(boolean loadImplementation) throws IOException, CoreException {
		ControllerUtils.log.debug("Loading the {0} of the classes defined in the model: {1}", loadImplementation ? "implementations" : "interfaces", ePackage.getName()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		// Iterates through all defined classes in the ecore package.
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			String className = classifier.getName();
			ControllerUtils.log.debug("Loading: {0}", className); //$NON-NLS-1$

			// Loads the class.
			Class<?> clazz = loadCompiledClass(className + (loadImplementation ? IMPLEMENTATION_CLASS_SUFFIX : ""), loadImplementation ? IMPLEMENTATION_PACKAGE_NAME : null); //$NON-NLS-1$

			// If it's an implementation of a definable requirement, place it in the requirements map.
			if (loadImplementation && (GOREElement.class.isAssignableFrom(clazz)))
				requirementsMap.put(className, (Class<? extends GOREElement>) clazz);
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param loadImplementation
	 * @throws IOException
	 *           If an I/O error occurs during the loading of a compiled class.
	 * @throws CoreException
	 *           If Eclipse throws an exception during the loading of a compiled class.
	 * @throws InstantiationException
	 *           If the factory instance cannot be created for some reason.
	 * @throws SecurityException
	 *           If the initialization method in the factory is not visible and, thus, cannot be retrieved.
	 * @throws NoSuchMethodException
	 *           If the factory does not contain an initialization method.
	 * @throws InvocationTargetException
	 *           If the initialization method retrieved from the factory class cannot be invoked in the factory instance.
	 * @throws IllegalArgumentException
	 *           If the arguments passed to the initialization method are incorrect.
	 * @throws IllegalAccessException
	 *           If the initialization method is enforcing Java language access control and the underlying method is
	 *           inaccessible.
	 */
	@SuppressWarnings("unchecked")
	private void loadUtilityClasses(boolean loadImplementation) throws IOException, CoreException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		String packageName = ePackage.getName();
		ControllerUtils.log.debug("Loading the {0} of utility classes (factory, package, etc.) created for the model: {1}", loadImplementation ? "implementations" : "interfaces", packageName); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		// Converts the package name to camel case to compose the name of the utility classes.
		packageName = Character.toUpperCase(packageName.charAt(0)) + packageName.substring(1);

		// Loads package and factory classes.
		String impl = (loadImplementation ? IMPLEMENTATION_CLASS_SUFFIX : ""); //$NON-NLS-1$
		Class<?> packageClazz = loadCompiledClass(packageName + PACKAGE_CLASS_SUFFIX + impl, loadImplementation ? IMPLEMENTATION_PACKAGE_NAME : null);
		Class<?> factoryClazz = loadCompiledClass(packageName + FACTORY_CLASS_SUFFIX + impl, loadImplementation ? IMPLEMENTATION_PACKAGE_NAME : null);

		// If we're loading implementations, initializes them.
		if (loadImplementation) {
			// Initializes the package, so it will register itself within EMF.
			Class<? extends EPackage> packageClass = (Class<? extends EPackage>) packageClazz;
			Method initMethod = packageClass.getMethod(FACTORY_INIT_METHOD_NAME);
			initMethod.invoke(null);
			// Initializes the factory class, keeping a reference to it in the class loader.
			factoryClass = (Class<? extends EFactory>) factoryClazz;
			factoryInstance = factoryClass.newInstance();
			initMethod = factoryClass.getMethod(FACTORY_INIT_METHOD_NAME);
			initMethod.invoke(factoryInstance);
			ControllerUtils.log.debug("oie");
		}

		
		// Else, load the Literals inner class from the package class.
		else {
			ControllerUtils.log.debug("4");
			loadCompiledClass(packageName + PACKAGE_LITERALS_CLASS_SUFFIX, null);
		}

		// If we're loading implementations, loads also the switch and adapter factory utility classes.
		if (loadImplementation) {
			loadCompiledClass(packageName + SWITCH_CLASS_SUFFIX, UTILITY_PACKAGE_NAME);
			loadCompiledClass(packageName + ADAPTER_FACTORY_CLASS_SUFFIX, UTILITY_PACKAGE_NAME);
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param className
	 * @param subPackage
	 * @return
	 * @throws IOException
	 *           If an I/O exception occurs when reading from the compiled class' file.
	 * @throws CoreException
	 *           If Eclipse throws an exception when trying to locate the compiled class' file in the model project.
	 */
	private Class<?> loadCompiledClass(String className, String subPackage) throws IOException, CoreException {
		// Obtains the file of the compiled class from the model project.
		String classFilePath = basePackagePath + ((subPackage == null) ? '/' : '/' + subPackage + '/') + className + '.' + CLASS_EXTENSION;
		IFile classFile = modelProject.getFile(new Path(classFilePath));

		// Reads the contents of the bytecode, defines the class and returns it.
		byte[] bytecode = readByteCode(classFile);
		String classFQN = basePackage + ((subPackage == null) ? '.' : '.' + subPackage + '.') + className;
		return defineClass(classFQN, bytecode, 0, bytecode.length);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param classFile
	 * @return
	 * @throws IOException
	 *           If an I/O exception occurs when reading from the compiled class' file.
	 * @throws CoreException
	 *           If Eclipse throws an exception when trying to locate the compiled class' file in the model project.
	 */
	private byte[] readByteCode(IFile classFile) throws IOException, CoreException {
		// Using try-with-resources, opens an input stream for the class contents and an output stream for a byte array.
		try (InputStream inputStream = classFile.getContents(); ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
			int nRead;
			byte[] data = new byte[16384];

			// Reads the contents of the file into the byte array output stream.
			while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}

			// Synchronizes the streams and returns the bytes read.
			buffer.flush();
			return buffer.toByteArray();
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param className
	 * @return
	 * @throws SecurityException
	 *           If the create method in the factory is not visible and, thus, cannot be retrieved.
	 * @throws NoSuchMethodException
	 *           If the factory does not contain a create method for the given requirement's class.
	 * @throws InvocationTargetException
	 *           If the create method retrieved from the factory class cannot be invoked in the factory instance.
	 * @throws IllegalArgumentException
	 *           If the arguments passed to the create method are incorrect.
	 * @throws IllegalAccessException
	 *           If the create method is enforcing Java language access control and the underlying method is inaccessible.
	 */
	public GOREElement instantiate(String className) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Checks that this requirement belongs to the model.
		if (!requirementsMap.containsKey(className))
			return null;

		// Invoke the factory method that creates this type of requirement and returns the new instance.
		Method createMethod = factoryClass.getMethod(FACTORY_CREATE_METHOD_PREFIX + className);
		Object result = createMethod.invoke(factoryInstance);
		return (GOREElement) result;
	}
}
