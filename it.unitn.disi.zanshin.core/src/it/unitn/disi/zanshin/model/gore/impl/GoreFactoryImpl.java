/**
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoreFactoryImpl extends EFactoryImpl implements GoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoreFactory init() {
		try {
			GoreFactory theGoreFactory = (GoreFactory)EPackage.Registry.INSTANCE.getEFactory(GorePackage.eNS_URI);
			if (theGoreFactory != null) {
				return theGoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GorePackage.HARD_GOAL: return createHardGoal();
			case GorePackage.SOFTGOAL: return createSoftgoal();
			case GorePackage.QUALITY_CONSTRAINT: return createQualityConstraint();
			case GorePackage.AW_REQ: return createAwReq();
			case GorePackage.DOMAIN_ASSUMPTION: return createDomainAssumption();
			case GorePackage.TASK: return createTask();
			case GorePackage.ACTOR: return createActor();
			case GorePackage.CONFIGURATION: return createConfiguration();
			case GorePackage.DIFFERENTIAL_RELATION: return createDifferentialRelation();
			case GorePackage.GOAL_MODEL: return createGoalModel();
			case GorePackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GorePackage.AGGREGATION_LEVEL:
				return createAggregationLevelFromString(eDataType, initialValue);
			case GorePackage.GORE_ELEMENT_STATE:
				return createGOREElementStateFromString(eDataType, initialValue);
			case GorePackage.DIFFERENTIAL_RELATION_OPERATOR:
				return createDifferentialRelationOperatorFromString(eDataType, initialValue);
			case GorePackage.MONITORABLE_METHOD:
				return createMonitorableMethodFromString(eDataType, initialValue);
			case GorePackage.PARAMETER_METRIC:
				return createParameterMetricFromString(eDataType, initialValue);
			case GorePackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case GorePackage.REFINEMENT_TYPE:
				return createRefinementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GorePackage.AGGREGATION_LEVEL:
				return convertAggregationLevelToString(eDataType, instanceValue);
			case GorePackage.GORE_ELEMENT_STATE:
				return convertGOREElementStateToString(eDataType, instanceValue);
			case GorePackage.DIFFERENTIAL_RELATION_OPERATOR:
				return convertDifferentialRelationOperatorToString(eDataType, instanceValue);
			case GorePackage.MONITORABLE_METHOD:
				return convertMonitorableMethodToString(eDataType, instanceValue);
			case GorePackage.PARAMETER_METRIC:
				return convertParameterMetricToString(eDataType, instanceValue);
			case GorePackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case GorePackage.REFINEMENT_TYPE:
				return convertRefinementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardGoal createHardGoal() {
		HardGoalImpl hardGoal = new HardGoalImpl();
		return hardGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal createSoftgoal() {
		SoftgoalImpl softgoal = new SoftgoalImpl();
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityConstraint createQualityConstraint() {
		QualityConstraintImpl qualityConstraint = new QualityConstraintImpl();
		return qualityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwReq createAwReq() {
		AwReqImpl awReq = new AwReqImpl();
		return awReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssumption createDomainAssumption() {
		DomainAssumptionImpl domainAssumption = new DomainAssumptionImpl();
		return domainAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentialRelation createDifferentialRelation() {
		DifferentialRelationImpl differentialRelation = new DifferentialRelationImpl();
		return differentialRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel createGoalModel() {
		GoalModelImpl goalModel = new GoalModelImpl();
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationLevel createAggregationLevelFromString(EDataType eDataType, String initialValue) {
		AggregationLevel result = AggregationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElementState createGOREElementStateFromString(EDataType eDataType, String initialValue) {
		GOREElementState result = GOREElementState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGOREElementStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentialRelationOperator createDifferentialRelationOperatorFromString(EDataType eDataType, String initialValue) {
		DifferentialRelationOperator result = DifferentialRelationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDifferentialRelationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorableMethod createMonitorableMethodFromString(EDataType eDataType, String initialValue) {
		MonitorableMethod result = MonitorableMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitorableMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMetric createParameterMetricFromString(EDataType eDataType, String initialValue) {
		ParameterMetric result = ParameterMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType createRefinementTypeFromString(EDataType eDataType, String initialValue) {
		RefinementType result = RefinementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefinementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GorePackage getGorePackage() {
		return (GorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GorePackage getPackage() {
		return GorePackage.eINSTANCE;
	}

} //GoreFactoryImpl
