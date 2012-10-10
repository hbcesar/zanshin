package it.unitn.disi.zanshin.services;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.Requirement;

/**
 * Abstract class that implements the Adaptation Framework part of the Target System Controller Service, calling
 * abstract methods that should be implemented by application-specific controllers that are responsible for the Target
 * System part. This way, it implements the GoF design pattern "Template Method".
 * 
 * The Adaptation Framework part consists of manipulations on the goal model that can be done in a generic way, i.e.,
 * without knowing any particular characteristics of the target system's requirement.
 * 
 * Important note: this class is not fully implemented. Only the parts that were used in the simulation were. New
 * implementations might require new code in this abstract controller service.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractTargetSystemControllerService implements ITargetSystemControllerService {
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

	/** @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#suspend(it.unitn.disi.zanshin.model.gore.Requirement) */
	@Override
	public final void suspend(Requirement req) {
		// Suspending a requirement instance means removing it from its parent.
		// Note: the parent-child or model-element association is bidirectional and EMF takes care of the opposite side.
		Requirement parent = req.getParent();
		if (parent != null) {
			req.setParent(null);

			// Re-evaluates the parent, because the remaining children might all be successful.
			if (parent instanceof DefinableRequirement)
				((DefinableRequirement) parent).checkState();
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

	/**
	 * @see it.unitn.disi.zanshin.services.ITargetSystemControllerService#resume(it.unitn.disi.zanshin.model.gore.Requirement,
	 *      it.unitn.disi.zanshin.model.gore.Requirement)
	 */
	@Override
	public final void resume(Requirement req, Requirement parent) {
		// Resuming a requirement instance means attaching it back to its parent.
		// Note: the parent-child or model-element association is bidirectional and EMF takes care of the opposite side.
		req.setParent(parent);

		// Calls the application-specific implementation.
		doResume(req, parent);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param req
	 * @param parent
	 */
	protected abstract void doResume(Requirement req, Requirement parent);
}
