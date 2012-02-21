package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.adaptation.qualia.Activator;
import it.unitn.disi.zanshin.adaptation.qualia.QualiaUtils;
import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.eca.ResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;

import java.util.List;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AdaptationAlgorithm {
	/** TODO: document this field. */
	private static final String DEFAULT_PARAMETER_CHOICE_PROCEDURE_ID = "random-single-parameter-choice"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_VALUE_CALCULATION_PROCEDURE_ID = "simple-value-calculation"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_PARAMETER_CHANGE_PROCEDURE_ID = "simple-parameter-change"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_WAITING_PROCEDURE_ID = "default-waiting"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_INDICATOR_EVALUATION_PROCEDURE_ID = "boolean-indicator-evaluation"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_LEARNING_PROCEDURE_ID = "no-learning"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_RESOLUTION_CHECK_PROCEDURE_ID = "simple-resolution-check"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String DEFAULT_ALGORITHM_REASSESSMENT_PROCEDURE_ID = "no-algorithm-reassessment"; //$NON-NLS-1$

	/** TODO: document this field. */
	private ParameterChoiceProcedure parameterChoiceProcedure;

	/** TODO: document this field. */
	private ValueCalculationProcedure valueCalculationProcedure;

	/** TODO: document this field. */
	private ParameterChangeProcedure parameterChangeProcedure;

	/** TODO: document this field. */
	private WaitingProcedure waitingProcedure;

	/** TODO: document this field. */
	private IndicatorEvaluationProcedure indicatorEvaluationProcedure;

	/** TODO: document this field. */
	private LearningProcedure learningProcedure;

	/** TODO: document this field. */
	private ResolutionCheckProcedure resolutionCheckProcedure;

	/** TODO: document this field. */
	private AlgorithmReassessmentProcedure algorithmReassessmentProcedure;

	/** Constructor. Assembles the default algorithm. */
	public AdaptationAlgorithm() {
		QualiaUtils.log.debug("Creating a default algorithm..."); //$NON-NLS-1$

		// Assembles the default algorithm.
		parameterChoiceProcedure = Activator.retrieveProcedure(DEFAULT_PARAMETER_CHOICE_PROCEDURE_ID).as(ParameterChoiceProcedure.class);
		valueCalculationProcedure = Activator.retrieveProcedure(DEFAULT_VALUE_CALCULATION_PROCEDURE_ID).as(ValueCalculationProcedure.class);
		parameterChangeProcedure = Activator.retrieveProcedure(DEFAULT_PARAMETER_CHANGE_PROCEDURE_ID).as(ParameterChangeProcedure.class);
		waitingProcedure = Activator.retrieveProcedure(DEFAULT_WAITING_PROCEDURE_ID).as(WaitingProcedure.class);
		indicatorEvaluationProcedure = Activator.retrieveProcedure(DEFAULT_INDICATOR_EVALUATION_PROCEDURE_ID).as(IndicatorEvaluationProcedure.class);
		learningProcedure = Activator.retrieveProcedure(DEFAULT_LEARNING_PROCEDURE_ID).as(LearningProcedure.class);
		resolutionCheckProcedure = Activator.retrieveProcedure(DEFAULT_RESOLUTION_CHECK_PROCEDURE_ID).as(ResolutionCheckProcedure.class);
		algorithmReassessmentProcedure = Activator.retrieveProcedure(DEFAULT_ALGORITHM_REASSESSMENT_PROCEDURE_ID).as(AlgorithmReassessmentProcedure.class);
	}

	/** Constructor. Assembles the default algorithm and replaces some procedures, given their IDs. */
	public AdaptationAlgorithm(List<String> procedureIds) {
		this();

		// Retrieves the procedures and has them replace a default one.
		for (String id : procedureIds) {
			Procedure procedure = Activator.retrieveProcedure(id);
			if (procedure != null)
				procedure.replaceDefaultProcedure(this);
			else QualiaUtils.log.warn("Procedure not found: {0}", id); //$NON-NLS-1$
		}
	}

	/** Getter for parameterChoiceProcedure. */
	protected ParameterChoiceProcedure getParameterChoiceProcedure() {
		return parameterChoiceProcedure;
	}

	/** Setter for parameterChoiceProcedure. */
	protected void setParameterChoiceProcedure(ParameterChoiceProcedure parameterChoiceProcedure) {
		QualiaUtils.log.debug("Replacing Parameter Choice procedure: {0} -> {1}", this.parameterChoiceProcedure, parameterChoiceProcedure); //$NON-NLS-1$
		this.parameterChoiceProcedure = parameterChoiceProcedure;
	}

	/** Getter for valueCalculationProcedure. */
	protected ValueCalculationProcedure getValueCalculationProcedure() {
		return valueCalculationProcedure;
	}

	/** Setter for valueCalculationProcedure. */
	protected void setValueCalculationProcedure(ValueCalculationProcedure valueCalculationProcedure) {
		QualiaUtils.log.debug("Replacing Value Calculation procedure: {0} -> {1}", this.valueCalculationProcedure, valueCalculationProcedure); //$NON-NLS-1$
		this.valueCalculationProcedure = valueCalculationProcedure;
	}

	/** Getter for parameterChangeProcedure. */
	protected ParameterChangeProcedure getParameterChangeProcedure() {
		return parameterChangeProcedure;
	}

	/** Setter for parameterChangeProcedure. */
	protected void setParameterChangeProcedure(ParameterChangeProcedure parameterChangeProcedure) {
		QualiaUtils.log.debug("Replacing Parameter Change procedure: {0} -> {1}", this.parameterChangeProcedure, parameterChangeProcedure); //$NON-NLS-1$
		this.parameterChangeProcedure = parameterChangeProcedure;
	}

	/** Getter for waitingProcedure. */
	protected WaitingProcedure getWaitingProcedure() {
		return waitingProcedure;
	}

	/** Setter for waitingProcedure. */
	protected void setWaitingProcedure(WaitingProcedure waitingProcedure) {
		QualiaUtils.log.debug("Replacing Waiting procedure: {0} -> {1}", this.waitingProcedure, waitingProcedure); //$NON-NLS-1$
		this.waitingProcedure = waitingProcedure;
	}

	/** Getter for indicatorEvaluationProcedure. */
	protected IndicatorEvaluationProcedure getIndicatorEvaluationProcedure() {
		return indicatorEvaluationProcedure;
	}

	/** Setter for indicatorEvaluationProcedure. */
	protected void setIndicatorEvaluationProcedure(IndicatorEvaluationProcedure indicatorEvaluationProcedure) {
		QualiaUtils.log.debug("Replacing Indicator Evaluation procedure: {0} -> {1}", this.indicatorEvaluationProcedure, indicatorEvaluationProcedure); //$NON-NLS-1$
		this.indicatorEvaluationProcedure = indicatorEvaluationProcedure;
	}

	/** Getter for learningProcedure. */
	protected LearningProcedure getLearningProcedure() {
		return learningProcedure;
	}

	/** Setter for learningProcedure. */
	protected void setLearningProcedure(LearningProcedure learningProcedure) {
		QualiaUtils.log.debug("Replacing Learning procedure: {0} -> {1}", this.learningProcedure, learningProcedure); //$NON-NLS-1$
		this.learningProcedure = learningProcedure;
	}

	/** Getter for resolutionCheckProcedure. */
	protected ResolutionCheckProcedure getResolutionCheckProcedure() {
		return resolutionCheckProcedure;
	}

	/** Setter for resolutionCheckProcedure. */
	protected void setResolutionCheckProcedure(ResolutionCheckProcedure resolutionCheckProcedure) {
		QualiaUtils.log.debug("Replacing Resolution Check procedure: {0} -> {1}", this.resolutionCheckProcedure, resolutionCheckProcedure); //$NON-NLS-1$
		this.resolutionCheckProcedure = resolutionCheckProcedure;
	}

	/** Getter for algorithmReassessmentProcedure. */
	protected AlgorithmReassessmentProcedure getAlgorithmReassessmentProcedure() {
		return algorithmReassessmentProcedure;
	}

	/** Setter for algorithmReassessmentProcedure. */
	protected void setAlgorithmReassessmentProcedure(AlgorithmReassessmentProcedure algorithmReassessmentProcedure) {
		QualiaUtils.log.debug("Replacing Algorithm Reassessment procedure: {0} -> {1}", this.algorithmReassessmentProcedure, algorithmReassessmentProcedure); //$NON-NLS-1$
		this.algorithmReassessmentProcedure = algorithmReassessmentProcedure;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param awreq
	 * @param session
	 * @return
	 */
	public boolean checkApplicability(AwReq awreq, AdaptationSession session) {
		return parameterChoiceProcedure.checkApplicability(awreq, session) && valueCalculationProcedure.checkApplicability(awreq, session) && parameterChangeProcedure.checkApplicability(awreq, session) && waitingProcedure.checkApplicability(awreq, session) && indicatorEvaluationProcedure.checkApplicability(awreq, session) && learningProcedure.checkApplicability(awreq, session) && resolutionCheckProcedure.checkApplicability(awreq, session) && algorithmReassessmentProcedure.checkApplicability(awreq, session);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param awreq
	 * @return
	 */
	public List<Parameter> chooseParameters(GoalModel model, AwReq awreq) {
		return parameterChoiceProcedure.chooseParameters(model, awreq);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param awreq
	 * @param parameters
	 * @return
	 */
	public List<String> calculateValues(GoalModel model, AwReq awreq, List<Parameter> parameters) {
		return valueCalculationProcedure.calculateValues(model, awreq, parameters);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param awreq
	 * @param parameters
	 * @param values
	 * @return
	 */
	public Configuration changeParameters(GoalModel model, AwReq awreq, List<Parameter> parameters, List<String> values) {
		return parameterChangeProcedure.changeParameters(model, awreq, parameters, values);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @return
	 */
	public boolean waitForEvaluation(GoalModel model, AwReq awreq) {
		return waitingProcedure.hasWaitedEnough(model, awreq);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param awreq
	 * @param session
	 * @param wrappedCondition
	 * @return
	 */
	public boolean evaluateIndicators(GoalModel model, AwReq awreq, AdaptationSession session, ResolutionCondition wrappedCondition) {
		return indicatorEvaluationProcedure.evaluateIndicator(model, awreq, session, wrappedCondition);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param session
	 */
	public void learn(AdaptationSession session) {
		learningProcedure.learn(session);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param evaluation
	 * @return
	 */
	public boolean checkResolution(boolean evaluation) {
		return resolutionCheckProcedure.checkResolution(evaluation);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param model
	 * @param session
	 */
	public void reassessAlgorithm(GoalModel model, AdaptationSession session) {
		algorithmReassessmentProcedure.reassess(model, session);
	}
}
