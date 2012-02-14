package it.unitn.disi.zanshin.simulation;

import it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;
import it.unitn.disi.zanshin.util.EmptyLogger;
import it.unitn.disi.zanshin.util.ILogger;
import it.unitn.disi.zanshin.util.PlatformLogger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;
import org.osgi.service.log.LogService;

/**
 * Internal utilities for the Core Component.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class SimulationUtils {
	/** Path to the file that contains the simulations' properties. */
	private static final String PROPERTIES_PATH = "/META-INF/simulation.properties"; //$NON-NLS-1$

	/** Path to the file that represents the default goal model in this bundle. */
	private static final String DEFAULT_GOAL_MODEL_PATH = "/META-INF/model.acad"; //$NON-NLS-1$

	/** The logger. */
	public static ILogger log = new EmptyLogger();

	/** This class is not meant to have objects. */
	private SimulationUtils() {}

	/**
	 * Initialization method that should be called by the bundle's activator.
	 * 
	 * @param logService
	 *          The platform log service to be used for logging.
	 */
	static void initialize(LogService logService) {
		log = new PlatformLogger(logService);
	}

	/**
	 * Reads the simulation properties from a file in the bundle.
	 * 
	 * @return The properties object representing the properties in the file.
	 * @throws IOException
	 *           If the file cannot be found, read, closed, etc.
	 */
	public static Properties readSimulationProperties() throws IOException {
		// Loads the properties file from the bundle.
		Bundle bundle = Activator.getContext().getBundle();
		URL propsUrl = bundle.getEntry(PROPERTIES_PATH);
		InputStream in = propsUrl.openStream();

		// Creates a properties object with its contents.
		Properties props = new Properties();
		props.load(in);
		in.close();

		return props;
	}

	/**
	 * Reads the default goal model from a file in the bundle. The location of the file in the bundle is specified by the
	 * constant DEFAULT_GOAL_MODEL_PATH.
	 * 
	 * @return An instance of AcadGoalModel, which represents the goal model written in the file.
	 * @throws URISyntaxException
	 *           If the file cannot be found at the specified location.
	 */
	public static AcadGoalModel readDefaultGoalModel() throws URISyntaxException {
		Bundle bundle = Activator.getContext().getBundle();
		return readGoalModel(bundle.getEntry(DEFAULT_GOAL_MODEL_PATH));
	}

	/**
	 * Reads a goal model from a bundle file (using EMF), given the URL of this file.
	 * 
	 * @param modelFileUrl
	 *          The URL pointing to the location of the goal model file in the bundle.
	 * @return An instance of AcadGoalModel, which represents the goal model written in the file.
	 */
	public static AcadGoalModel readGoalModel(URL modelFileUrl) {
		// Initializes the EMF model.
		AcadPackage.eINSTANCE.eClass();

		// Registers the XMI resource factory for the .goal extension.
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("acad", new XMIResourceFactoryImpl()); //$NON-NLS-1$

		// Obtains the resource and extract the goal model from its first element.
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(modelFileUrl.toString()), true);
		return (AcadGoalModel) resource.getContents().get(0);
	}
}
