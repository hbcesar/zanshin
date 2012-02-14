package it.unitn.disi.zanshin.simulation.cases.scalable;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DefinableRequirementState;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.services.IAdaptationService;
import it.unitn.disi.zanshin.services.IMonitoringService;
import it.unitn.disi.zanshin.simulation.Activator;

import java.text.MessageFormat;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableAwReqsMonitor implements IMonitoringService {
	/** The adaptation service. */
	private IAdaptationService adaptationService;
	
	/** Timestamp of when the simulation started. */
	private long startTimestamp;
	
	/** Constructor. */
	public ScalableAwReqsMonitor() {
		BundleContext context = Activator.getContext();
		ServiceReference<IAdaptationService> adaptationReference = context.getServiceReference(IAdaptationService.class);
		adaptationService = context.getService(adaptationReference);
	}

	/**
	 * @see it.unitn.disi.zanshin.services.IMonitoringService#monitorMethodCall(it.unitn.disi.zanshin.model.gore.DefinableRequirement,
	 *      it.unitn.disi.zanshin.model.gore.MonitorableMethod)
	 */
	@Override
	public void monitorMethodCall(DefinableRequirement req, MonitorableMethod method) {
		// If this is the first call, register the timestamp.
		if (startTimestamp == 0)
			startTimestamp = System.currentTimeMillis();

		// If the target element in the goal model has succeeded/failed, trigger a success/failure in the AwReq.
		GoalModel model = req.findGoalModel();
		if ((model != null) && (model.getAwReqs() != null) && (model.getAwReqs().size() > 0)) {
			AwReq awreq = model.getAwReqs().get(0);
			DefinableRequirement target = awreq.getTarget();
			if (req.equals(target)) {
				switch (method) {
				case FAIL:
					awreq.setState(DefinableRequirementState.FAILED);
					break;
				case SUCCESS:
					awreq.setState(DefinableRequirementState.SUCCEEDED);
					break;
				default:
					awreq = null;
				}
				
				// Notify the adaptation service of the AwReq state change.
				if (awreq != null) {
					adaptationService.processStateChange(awreq);
				}
			}
	
			// If it's not the target element, check if it's the root element ending. In that case, calculate and print the time.
			else if (req.eClass().getName().equals("G00000") && (method == MonitorableMethod.END)) { //$NON-NLS-1$
				long modelSize = req.getTime().getTime();
				long endTimestamp = System.currentTimeMillis();
				System.out.println(MessageFormat.format(">>> TIMING <<< Model Size: {0}; Adaptation Framework time: {1}", modelSize, (endTimestamp - startTimestamp))); //$NON-NLS-1$
			}
		}
	}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#stop() */
	@Override
	public void stop() {}

	/** @see it.unitn.disi.zanshin.services.IMonitoringService#setSimulatedMonitor(it.unitn.disi.zanshin.services.IMonitoringService) */
	@Override
	public void setSimulatedMonitor(IMonitoringService simulatedMonitor) {}
}
