package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * Abstract class that implements the Adaptation Framework part of the Target System Controller Service, calling
 * abstract methods that should be implemented by application-specific controllers that are responsible for the Target
 * System part. This way, it implements the GoF design pattern "Template Method".
 * 
 * The Adaptation Framework part consists of manipulations on the goal model that can be done in a generic way, i.e.,
 * without knowing any particular characteristics of the target system's requirement.
 * 
 * Important note / FIXME: this class is not fully implemented. Only the parts that were used in the simulation were.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractTargetSystemControllerService implements ITargetSystemControllerService {
	// TODO: delete when done
	// /** The repository service. */
	// protected IRepositoryService repositoryService;
	//
	// /** Constructor. */
	// public AbstractTargetSystemControllerService() {
	// // Initializes the repository service using the registered service in the platform.
	// BundleContext context = Activator.getContext();
	// ServiceReference<IRepositoryService> repositoryReference = context.getServiceReference(IRepositoryService.class);
	// repositoryService = context.getService(repositoryReference);
	// }

	/**
	 * Abstract method that provides the repository service. Should be implemented by concrete subclasses.
	 * 
	 * @return The repository service that is registered in the platform.
	 */
	protected abstract IRepositoryService getRepositoryService();

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#copyData(it.unitn.disi.zanshin.model.gore.PerformativeRequirement,
	 *      it.unitn.disi.zanshin.model.gore.PerformativeRequirement)
	 */
	@Override
	public final void copyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq) {
		// Replaces the source requirement with the destination requirement in its goal model.
		Long modelId = srcReq.findGoalModel().getId();
		getRepositoryService().replaceRequirement(modelId, srcReq, dstReq);

		// Calls the application-specific implementation.
		doCopyData(srcReq, dstReq);
	}

	/**
	 * Called by copyData(), this method should be implemented by the concrete subclass with the application-specific
	 * adaptation logic related to the copy-data operation.
	 * 
	 * @param srcReq
	 *          The source requirement instance.
	 * @param dstReq
	 *          The destination requirement instance.
	 */
	protected abstract void doCopyData(PerformativeRequirement srcReq, PerformativeRequirement dstReq);

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#newInstance(org.eclipse.emf.ecore.EClass) */
	@Override
	public final Requirement newInstance(EClass reqClass) throws InstantiationException {
		IRepositoryService repositoryService = getRepositoryService();
		
		try {
			// Creates a new copy of the entire application goal model and retrieve the new instance from it.
			GoalModel newModel = createNewModel(reqClass.getEPackage());
			repositoryService.storeGoalModel(newModel);
			Requirement newReq = repositoryService.retrieveRequirement(newModel.getId(), reqClass);

			// Checks if the requirement really existed in the model.
			if (newReq == null)
				throw new IllegalArgumentException("Requirement " + reqClass.getName() + " does not exist in the goal model " + newModel.eClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$

			// Detaches the requirement from the goal model and disposes the model from the repository service.
			newReq.setParent(null);
			repositoryService.disposeGoalModel(newModel.getId());

			// Returns the new requirement.
			return newReq;
		}

		// If any problems occur during the creation of the instance, throw an instantiation exception.
		catch (Exception e) {
			throw new InstantiationException("An exception occurred while creating a new instance of " + reqClass.getName() + ": " + e.getMessage()); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * Called by the newInstance() method, this method should be implemented by the concrete subclass and provide a new
	 * instance of the application goal model. The Adaptation Framework is capable to create the new instance of the
	 * requirement then, without any application-specific adaptation logic.
	 * 
	 * @param ePackage
	 *          The EMF package from which to create a new requirements model.
	 * 
	 * @return A new instance of the application requirement model.
	 */
	protected abstract GoalModel createNewModel(EPackage ePackage) throws Exception;

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#disable(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public final void suspend(Requirement req) {
		// Suspending a requirement instance means removing it from its parent (or from the model itself).
		// Note: the parent-child or model-element association is bidirectional and EMF takes care of the opposite side.
		Requirement parent = req.getParent();
		if (parent != null) {
			req.setParent(null);

			// Re-evaluates the parent, because the remaining children might all be successful.
			if (parent instanceof DefinableRequirement)
				((DefinableRequirement) parent).checkState();
		}
		else if ((req instanceof Goal) && (((Goal) req).getGoalModel() != null))
			((Goal) req).setGoalModel(null);
		else if ((req instanceof Softgoal) && (((Softgoal) req).getGoalModel() != null))
			((Softgoal) req).setGoalModel(null);
		else if ((req instanceof AwReq) && (((AwReq) req).getGoalModel() != null))
			((AwReq) req).setGoalModel(null);
		else if (req instanceof QualityConstraint) {
			Softgoal softgoal = ((QualityConstraint) req).getSoftgoal();
			if ((softgoal != null) && (softgoal.getGoalModel() != null))
				softgoal.setGoalModel(null);
		}

		// Calls the application-specific implementation.
		doSuspend(req);
	}

	/**
	 * Called by suspend(), this method should be implemented by the concrete subclass with the application-specific
	 * adaptation logic related to the suspend operation.
	 * 
	 * @param req
	 *          The requirement instance.
	 */
	protected abstract void doSuspend(Requirement req);
}
