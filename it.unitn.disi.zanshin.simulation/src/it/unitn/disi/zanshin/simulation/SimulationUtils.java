package it.unitn.disi.zanshin.simulation;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;
import it.unitn.disi.zanshin.util.EmptyLogger;
import it.unitn.disi.zanshin.util.ILogger;
import it.unitn.disi.zanshin.util.PlatformLogger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

	/** TODO: document this field. */
	private static AcadGoalModel acadGoalModel;

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
	 * TODO: document this method.
	 * 
	 * @return
	 */
	public static AcadGoalModel retrieveAcadGoalModel() {
		// If the model hasn't yet been loaded from the file, loads it now.
		if (acadGoalModel == null) {
			Bundle bundle = Activator.getContext().getBundle();
			acadGoalModel = readAcadGoalModel(bundle.getEntry(DEFAULT_GOAL_MODEL_PATH));
		}

		// Returns a copy of the goal model, simulating an execution session.
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		AcadGoalModel modelCopy = (AcadGoalModel) copier.copy(acadGoalModel);
		copier.copyReferences();
		fixLocalReferences(modelCopy);
		return modelCopy;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param newModel
	 */
	public static void changeAcadGoalModel(AcadGoalModel newModel) {
		// Copies the given model and uses it as the class-level model from now on.
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		acadGoalModel = (AcadGoalModel) copier.copy(newModel);
		copier.copyReferences();
		fixLocalReferences(acadGoalModel);
	}

	/**
	 * Reads a goal model from a bundle file (using EMF), given the URL of this file.
	 * 
	 * @param modelFileUrl
	 *          The URL pointing to the location of the goal model file in the bundle.
	 * @return An instance of AcadGoalModel, which represents the goal model written in the file.
	 */
	private static AcadGoalModel readAcadGoalModel(URL modelFileUrl) {
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

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 */
	private static void fixLocalReferences(AcadGoalModel model) {
		// FIXME: see if there is a better way to do this or finish the implementation for all elements.

		// This method makes sure that local objects in the model are pointing to other local objects instead of point to
		// objects in other models. This latter situation can be possible because models are being copied with
		// EcoreUtil.Copier, which does not know references should be local.
		IRepositoryService repositoryService = Activator.getRepositoryService();
		boolean notRegistered = (repositoryService.retrieveGoalModel(model.getId()) == null);
		if (notRegistered)
			repositoryService.storeGoalModel(model);
		
		// Fixes differential relations.
		for (DifferentialRelation relation : model.getRelations()) {
			EClass indicatorClass = relation.getIndicator().eClass();
			EClass parameterClass = relation.getParameter().eClass();
			relation.setIndicator((AwReq)repositoryService.retrieveRequirement(model.getId(), indicatorClass));
			for (Parameter param : model.getConfiguration().getParameters())
				if (param.eClass().equals(parameterClass))
					relation.setParameter(param);
		}
		
		// If the model was not registered in the repository service before, dispose it.
		if (notRegistered)
			repositoryService.disposeGoalModel(model.getId());
	}
}
