/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.simulation.model.acad.util;

import it.unitn.disi.zanshin.model.eca.EcaAwReq;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;
import it.unitn.disi.zanshin.simulation.model.acad.*;
import it.unitn.disi.zanshin.simulation.model.acad.AR1;
import it.unitn.disi.zanshin.simulation.model.acad.AR10;
import it.unitn.disi.zanshin.simulation.model.acad.AR11;
import it.unitn.disi.zanshin.simulation.model.acad.AR12;
import it.unitn.disi.zanshin.simulation.model.acad.AR13;
import it.unitn.disi.zanshin.simulation.model.acad.AR14;
import it.unitn.disi.zanshin.simulation.model.acad.AR15;
import it.unitn.disi.zanshin.simulation.model.acad.AR2;
import it.unitn.disi.zanshin.simulation.model.acad.AR3;
import it.unitn.disi.zanshin.simulation.model.acad.AR4;
import it.unitn.disi.zanshin.simulation.model.acad.AR5;
import it.unitn.disi.zanshin.simulation.model.acad.AR6;
import it.unitn.disi.zanshin.simulation.model.acad.AR7;
import it.unitn.disi.zanshin.simulation.model.acad.AR8;
import it.unitn.disi.zanshin.simulation.model.acad.AR9;
import it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel;
import it.unitn.disi.zanshin.simulation.model.acad.AcadPackage;
import it.unitn.disi.zanshin.simulation.model.acad.D_DataUpd;
import it.unitn.disi.zanshin.simulation.model.acad.D_DriverKnows;
import it.unitn.disi.zanshin.simulation.model.acad.D_GazetUpd;
import it.unitn.disi.zanshin.simulation.model.acad.D_MDTPos;
import it.unitn.disi.zanshin.simulation.model.acad.D_MDTUse;
import it.unitn.disi.zanshin.simulation.model.acad.D_MaxCalls;
import it.unitn.disi.zanshin.simulation.model.acad.G_AssignIncident;
import it.unitn.disi.zanshin.simulation.model.acad.G_CallTaking;
import it.unitn.disi.zanshin.simulation.model.acad.G_DispExcept;
import it.unitn.disi.zanshin.simulation.model.acad.G_GenDispatch;
import it.unitn.disi.zanshin.simulation.model.acad.G_IncidentUpd;
import it.unitn.disi.zanshin.simulation.model.acad.G_ManualMap;
import it.unitn.disi.zanshin.simulation.model.acad.G_MonitorRes;
import it.unitn.disi.zanshin.simulation.model.acad.G_ObtainMap;
import it.unitn.disi.zanshin.simulation.model.acad.G_RegCall;
import it.unitn.disi.zanshin.simulation.model.acad.G_ResourceId;
import it.unitn.disi.zanshin.simulation.model.acad.G_ResourceMob;
import it.unitn.disi.zanshin.simulation.model.acad.G_RouteAssist;
import it.unitn.disi.zanshin.simulation.model.acad.G_UpdPosition;
import it.unitn.disi.zanshin.simulation.model.acad.Q_AmbArriv;
import it.unitn.disi.zanshin.simulation.model.acad.Q_Dispatch;
import it.unitn.disi.zanshin.simulation.model.acad.Q_IncidResolv;
import it.unitn.disi.zanshin.simulation.model.acad.Q_MaxCost;
import it.unitn.disi.zanshin.simulation.model.acad.Q_MaxTimeMsg;
import it.unitn.disi.zanshin.simulation.model.acad.S_FastArriv;
import it.unitn.disi.zanshin.simulation.model.acad.S_FastAssist;
import it.unitn.disi.zanshin.simulation.model.acad.S_FastDispatch;
import it.unitn.disi.zanshin.simulation.model.acad.S_LowCost;
import it.unitn.disi.zanshin.simulation.model.acad.S_UserFriendly;
import it.unitn.disi.zanshin.simulation.model.acad.T_AcadAssists;
import it.unitn.disi.zanshin.simulation.model.acad.T_CheckGazet;
import it.unitn.disi.zanshin.simulation.model.acad.T_CheckPaper;
import it.unitn.disi.zanshin.simulation.model.acad.T_CloseIncident;
import it.unitn.disi.zanshin.simulation.model.acad.T_ConfIncident;
import it.unitn.disi.zanshin.simulation.model.acad.T_ConfirmCall;
import it.unitn.disi.zanshin.simulation.model.acad.T_CreateOrAssign;
import it.unitn.disi.zanshin.simulation.model.acad.T_DetBestAmb;
import it.unitn.disi.zanshin.simulation.model.acad.T_DetectLoc;
import it.unitn.disi.zanshin.simulation.model.acad.T_DispDepArriv;
import it.unitn.disi.zanshin.simulation.model.acad.T_DispStatus;
import it.unitn.disi.zanshin.simulation.model.acad.T_Except;
import it.unitn.disi.zanshin.simulation.model.acad.T_ExceptQueue;
import it.unitn.disi.zanshin.simulation.model.acad.T_Feedback;
import it.unitn.disi.zanshin.simulation.model.acad.T_InformStat;
import it.unitn.disi.zanshin.simulation.model.acad.T_InputInfo;
import it.unitn.disi.zanshin.simulation.model.acad.T_MonitorStatus;
import it.unitn.disi.zanshin.simulation.model.acad.T_RadioPos;
import it.unitn.disi.zanshin.simulation.model.acad.T_ReplAmb;
import it.unitn.disi.zanshin.simulation.model.acad.T_SearchDuplic;
import it.unitn.disi.zanshin.simulation.model.acad.T_SpecConfig;
import it.unitn.disi.zanshin.simulation.model.acad.T_StaffAssists;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.simulation.model.acad.AcadPackage
 * @generated
 */
public class AcadAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static AcadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AcadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AcadPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This implementation
	 * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
	 * end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) { return true; }
		if (object instanceof EObject) { return ((EObject) object).eClass().getEPackage() == modelPackage; }
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AcadSwitch modelSwitch = new AcadSwitch() {
		public Object caseG_GenDispatch(G_GenDispatch object) {
			return createG_GenDispatchAdapter();
		}

		public Object caseG_CallTaking(G_CallTaking object) {
			return createG_CallTakingAdapter();
		}

		public Object caseD_DataUpd(D_DataUpd object) {
			return createD_DataUpdAdapter();
		}

		public Object caseG_ResourceId(G_ResourceId object) {
			return createG_ResourceIdAdapter();
		}

		public Object caseG_ResourceMob(G_ResourceMob object) {
			return createG_ResourceMobAdapter();
		}

		public Object caseG_ObtainMap(G_ObtainMap object) {
			return createG_ObtainMapAdapter();
		}

		public Object caseG_IncidentUpd(G_IncidentUpd object) {
			return createG_IncidentUpdAdapter();
		}

		public Object caseD_MaxCalls(D_MaxCalls object) {
			return createD_MaxCallsAdapter();
		}

		public Object caseG_RegCall(G_RegCall object) {
			return createG_RegCallAdapter();
		}

		public Object caseT_ConfirmCall(T_ConfirmCall object) {
			return createT_ConfirmCallAdapter();
		}

		public Object caseG_AssignIncident(G_AssignIncident object) {
			return createG_AssignIncidentAdapter();
		}

		public Object caseT_SearchDuplic(T_SearchDuplic object) {
			return createT_SearchDuplicAdapter();
		}

		public Object caseT_CreateOrAssign(T_CreateOrAssign object) {
			return createT_CreateOrAssignAdapter();
		}

		public Object caseT_InputInfo(T_InputInfo object) {
			return createT_InputInfoAdapter();
		}

		public Object caseT_DetectLoc(T_DetectLoc object) {
			return createT_DetectLocAdapter();
		}

		public Object caseT_SpecConfig(T_SpecConfig object) {
			return createT_SpecConfigAdapter();
		}

		public Object caseT_ConfIncident(T_ConfIncident object) {
			return createT_ConfIncidentAdapter();
		}

		public Object caseT_DetBestAmb(T_DetBestAmb object) {
			return createT_DetBestAmbAdapter();
		}

		public Object caseT_InformStat(T_InformStat object) {
			return createT_InformStatAdapter();
		}

		public Object caseG_RouteAssist(G_RouteAssist object) {
			return createG_RouteAssistAdapter();
		}

		public Object caseD_DriverKnows(D_DriverKnows object) {
			return createD_DriverKnowsAdapter();
		}

		public Object caseT_AcadAssists(T_AcadAssists object) {
			return createT_AcadAssistsAdapter();
		}

		public Object caseT_StaffAssists(T_StaffAssists object) {
			return createT_StaffAssistsAdapter();
		}

		public Object caseT_Feedback(T_Feedback object) {
			return createT_FeedbackAdapter();
		}

		public Object caseD_GazetUpd(D_GazetUpd object) {
			return createD_GazetUpdAdapter();
		}

		public Object caseG_ManualMap(G_ManualMap object) {
			return createG_ManualMapAdapter();
		}

		public Object caseT_CheckGazet(T_CheckGazet object) {
			return createT_CheckGazetAdapter();
		}

		public Object caseT_CheckPaper(T_CheckPaper object) {
			return createT_CheckPaperAdapter();
		}

		public Object caseG_DispExcept(G_DispExcept object) {
			return createG_DispExceptAdapter();
		}

		public Object caseG_MonitorRes(G_MonitorRes object) {
			return createG_MonitorResAdapter();
		}

		public Object caseG_UpdPosition(G_UpdPosition object) {
			return createG_UpdPositionAdapter();
		}

		public Object caseD_MDTPos(D_MDTPos object) {
			return createD_MDTPosAdapter();
		}

		public Object caseT_RadioPos(T_RadioPos object) {
			return createT_RadioPosAdapter();
		}

		public Object caseD_MDTUse(D_MDTUse object) {
			return createD_MDTUseAdapter();
		}

		public Object caseT_MonitorStatus(T_MonitorStatus object) {
			return createT_MonitorStatusAdapter();
		}

		public Object caseT_DispStatus(T_DispStatus object) {
			return createT_DispStatusAdapter();
		}

		public Object caseT_DispDepArriv(T_DispDepArriv object) {
			return createT_DispDepArrivAdapter();
		}

		public Object caseT_ReplAmb(T_ReplAmb object) {
			return createT_ReplAmbAdapter();
		}

		public Object caseT_Except(T_Except object) {
			return createT_ExceptAdapter();
		}

		public Object caseT_ExceptQueue(T_ExceptQueue object) {
			return createT_ExceptQueueAdapter();
		}

		public Object caseT_CloseIncident(T_CloseIncident object) {
			return createT_CloseIncidentAdapter();
		}

		public Object caseS_FastDispatch(S_FastDispatch object) {
			return createS_FastDispatchAdapter();
		}

		public Object caseQ_Dispatch(Q_Dispatch object) {
			return createQ_DispatchAdapter();
		}

		public Object caseS_FastAssist(S_FastAssist object) {
			return createS_FastAssistAdapter();
		}

		public Object caseQ_IncidResolv(Q_IncidResolv object) {
			return createQ_IncidResolvAdapter();
		}

		public Object caseS_FastArriv(S_FastArriv object) {
			return createS_FastArrivAdapter();
		}

		public Object caseQ_AmbArriv(Q_AmbArriv object) {
			return createQ_AmbArrivAdapter();
		}

		public Object caseS_LowCost(S_LowCost object) {
			return createS_LowCostAdapter();
		}

		public Object caseQ_MaxCost(Q_MaxCost object) {
			return createQ_MaxCostAdapter();
		}

		public Object caseS_UserFriendly(S_UserFriendly object) {
			return createS_UserFriendlyAdapter();
		}

		public Object caseQ_MaxTimeMsg(Q_MaxTimeMsg object) {
			return createQ_MaxTimeMsgAdapter();
		}

		public Object caseAR1(AR1 object) {
			return createAR1Adapter();
		}

		public Object caseAR2(AR2 object) {
			return createAR2Adapter();
		}

		public Object caseAR3(AR3 object) {
			return createAR3Adapter();
		}

		public Object caseAR4(AR4 object) {
			return createAR4Adapter();
		}

		public Object caseAR5(AR5 object) {
			return createAR5Adapter();
		}

		public Object caseAR6(AR6 object) {
			return createAR6Adapter();
		}

		public Object caseAR7(AR7 object) {
			return createAR7Adapter();
		}

		public Object caseAR8(AR8 object) {
			return createAR8Adapter();
		}

		public Object caseAR9(AR9 object) {
			return createAR9Adapter();
		}

		public Object caseAR10(AR10 object) {
			return createAR10Adapter();
		}

		public Object caseAR11(AR11 object) {
			return createAR11Adapter();
		}

		public Object caseAR12(AR12 object) {
			return createAR12Adapter();
		}

		public Object caseAR13(AR13 object) {
			return createAR13Adapter();
		}

		public Object caseAR14(AR14 object) {
			return createAR14Adapter();
		}

		public Object caseAR15(AR15 object) {
			return createAR15Adapter();
		}

		public Object caseAcadGoalModel(AcadGoalModel object) {
			return createAcadGoalModelAdapter();
		}

		public Object caseCV_MST(CV_MST object) {
			return createCV_MSTAdapter();
		}

		public Object caseOclAny(OclAny object) {
			return createOclAnyAdapter();
		}

		public Object caseRequirement(Requirement object) {
			return createRequirementAdapter();
		}

		public Object caseDefinableRequirement(DefinableRequirement object) {
			return createDefinableRequirementAdapter();
		}

		public Object casePerformativeRequirement(PerformativeRequirement object) {
			return createPerformativeRequirementAdapter();
		}

		public Object caseGoal(Goal object) {
			return createGoalAdapter();
		}

		public Object caseDomainAssumption(DomainAssumption object) {
			return createDomainAssumptionAdapter();
		}

		public Object caseTask(Task object) {
			return createTaskAdapter();
		}

		public Object caseSoftgoal(Softgoal object) {
			return createSoftgoalAdapter();
		}

		public Object caseQualityConstraint(QualityConstraint object) {
			return createQualityConstraintAdapter();
		}

		public Object caseAwReq(AwReq object) {
			return createAwReqAdapter();
		}

		public Object caseEcaAwReq(EcaAwReq object) {
			return createEcaAwReqAdapter();
		}

		public Object caseGoalModel(GoalModel object) {
			return createGoalModelAdapter();
		}

		public Object caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *          the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_GenDispatch
	 * <em>GGen Dispatch</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_GenDispatch
	 * @generated
	 */
	public Adapter createG_GenDispatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_CallTaking
	 * <em>GCall Taking</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_CallTaking
	 * @generated
	 */
	public Adapter createG_CallTakingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_DataUpd
	 * <em>DData Upd</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_DataUpd
	 * @generated
	 */
	public Adapter createD_DataUpdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ResourceId
	 * <em>GResource Id</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ResourceId
	 * @generated
	 */
	public Adapter createG_ResourceIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ResourceMob
	 * <em>GResource Mob</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ResourceMob
	 * @generated
	 */
	public Adapter createG_ResourceMobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ObtainMap
	 * <em>GObtain Map</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ObtainMap
	 * @generated
	 */
	public Adapter createG_ObtainMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_IncidentUpd
	 * <em>GIncident Upd</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_IncidentUpd
	 * @generated
	 */
	public Adapter createG_IncidentUpdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_MaxCalls
	 * <em>DMax Calls</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_MaxCalls
	 * @generated
	 */
	public Adapter createD_MaxCallsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_RegCall
	 * <em>GReg Call</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_RegCall
	 * @generated
	 */
	public Adapter createG_RegCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ConfirmCall
	 * <em>TConfirm Call</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ConfirmCall
	 * @generated
	 */
	public Adapter createT_ConfirmCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_AssignIncident
	 * <em>GAssign Incident</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_AssignIncident
	 * @generated
	 */
	public Adapter createG_AssignIncidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_SearchDuplic
	 * <em>TSearch Duplic</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_SearchDuplic
	 * @generated
	 */
	public Adapter createT_SearchDuplicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CreateOrAssign
	 * <em>TCreate Or Assign</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CreateOrAssign
	 * @generated
	 */
	public Adapter createT_CreateOrAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_InputInfo
	 * <em>TInput Info</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_InputInfo
	 * @generated
	 */
	public Adapter createT_InputInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DetectLoc
	 * <em>TDetect Loc</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DetectLoc
	 * @generated
	 */
	public Adapter createT_DetectLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_SpecConfig
	 * <em>TSpec Config</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_SpecConfig
	 * @generated
	 */
	public Adapter createT_SpecConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ConfIncident
	 * <em>TConf Incident</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ConfIncident
	 * @generated
	 */
	public Adapter createT_ConfIncidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DetBestAmb
	 * <em>TDet Best Amb</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DetBestAmb
	 * @generated
	 */
	public Adapter createT_DetBestAmbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_InformStat
	 * <em>TInform Stat</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_InformStat
	 * @generated
	 */
	public Adapter createT_InformStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_RouteAssist
	 * <em>GRoute Assist</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_RouteAssist
	 * @generated
	 */
	public Adapter createG_RouteAssistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_DriverKnows
	 * <em>DDriver Knows</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_DriverKnows
	 * @generated
	 */
	public Adapter createD_DriverKnowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_AcadAssists
	 * <em>TAcad Assists</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_AcadAssists
	 * @generated
	 */
	public Adapter createT_AcadAssistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_StaffAssists
	 * <em>TStaff Assists</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_StaffAssists
	 * @generated
	 */
	public Adapter createT_StaffAssistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_Feedback
	 * <em>TFeedback</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_Feedback
	 * @generated
	 */
	public Adapter createT_FeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_GazetUpd
	 * <em>DGazet Upd</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_GazetUpd
	 * @generated
	 */
	public Adapter createD_GazetUpdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ManualMap
	 * <em>GManual Map</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ManualMap
	 * @generated
	 */
	public Adapter createG_ManualMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CheckGazet
	 * <em>TCheck Gazet</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CheckGazet
	 * @generated
	 */
	public Adapter createT_CheckGazetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CheckPaper
	 * <em>TCheck Paper</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CheckPaper
	 * @generated
	 */
	public Adapter createT_CheckPaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_DispExcept
	 * <em>GDisp Except</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_DispExcept
	 * @generated
	 */
	public Adapter createG_DispExceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_MonitorRes
	 * <em>GMonitor Res</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_MonitorRes
	 * @generated
	 */
	public Adapter createG_MonitorResAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_UpdPosition
	 * <em>GUpd Position</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_UpdPosition
	 * @generated
	 */
	public Adapter createG_UpdPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_MDTPos
	 * <em>DMDT Pos</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_MDTPos
	 * @generated
	 */
	public Adapter createD_MDTPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_RadioPos
	 * <em>TRadio Pos</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_RadioPos
	 * @generated
	 */
	public Adapter createT_RadioPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_MDTUse
	 * <em>DMDT Use</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_MDTUse
	 * @generated
	 */
	public Adapter createD_MDTUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_MonitorStatus
	 * <em>TMonitor Status</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_MonitorStatus
	 * @generated
	 */
	public Adapter createT_MonitorStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DispStatus
	 * <em>TDisp Status</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DispStatus
	 * @generated
	 */
	public Adapter createT_DispStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DispDepArriv
	 * <em>TDisp Dep Arriv</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DispDepArriv
	 * @generated
	 */
	public Adapter createT_DispDepArrivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ReplAmb
	 * <em>TRepl Amb</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ReplAmb
	 * @generated
	 */
	public Adapter createT_ReplAmbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_Except
	 * <em>TExcept</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_Except
	 * @generated
	 */
	public Adapter createT_ExceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ExceptQueue
	 * <em>TExcept Queue</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ExceptQueue
	 * @generated
	 */
	public Adapter createT_ExceptQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CloseIncident
	 * <em>TClose Incident</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CloseIncident
	 * @generated
	 */
	public Adapter createT_CloseIncidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_FastDispatch
	 * <em>SFast Dispatch</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_FastDispatch
	 * @generated
	 */
	public Adapter createS_FastDispatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_Dispatch
	 * <em>QDispatch</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_Dispatch
	 * @generated
	 */
	public Adapter createQ_DispatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_FastAssist
	 * <em>SFast Assist</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_FastAssist
	 * @generated
	 */
	public Adapter createS_FastAssistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_IncidResolv
	 * <em>QIncid Resolv</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_IncidResolv
	 * @generated
	 */
	public Adapter createQ_IncidResolvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_FastArriv
	 * <em>SFast Arriv</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_FastArriv
	 * @generated
	 */
	public Adapter createS_FastArrivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_AmbArriv
	 * <em>QAmb Arriv</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_AmbArriv
	 * @generated
	 */
	public Adapter createQ_AmbArrivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_LowCost
	 * <em>SLow Cost</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_LowCost
	 * @generated
	 */
	public Adapter createS_LowCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_MaxCost
	 * <em>QMax Cost</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_MaxCost
	 * @generated
	 */
	public Adapter createQ_MaxCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_UserFriendly
	 * <em>SUser Friendly</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_UserFriendly
	 * @generated
	 */
	public Adapter createS_UserFriendlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_MaxTimeMsg
	 * <em>QMax Time Msg</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_MaxTimeMsg
	 * @generated
	 */
	public Adapter createQ_MaxTimeMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR1 <em>AR1</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR1
	 * @generated
	 */
	public Adapter createAR1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR2 <em>AR2</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR2
	 * @generated
	 */
	public Adapter createAR2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR3 <em>AR3</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR3
	 * @generated
	 */
	public Adapter createAR3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR4 <em>AR4</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR4
	 * @generated
	 */
	public Adapter createAR4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR5 <em>AR5</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR5
	 * @generated
	 */
	public Adapter createAR5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR6 <em>AR6</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR6
	 * @generated
	 */
	public Adapter createAR6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR7 <em>AR7</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR7
	 * @generated
	 */
	public Adapter createAR7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR8 <em>AR8</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR8
	 * @generated
	 */
	public Adapter createAR8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR9 <em>AR9</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR9
	 * @generated
	 */
	public Adapter createAR9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR10
	 * <em>AR10</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR10
	 * @generated
	 */
	public Adapter createAR10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR11
	 * <em>AR11</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR11
	 * @generated
	 */
	public Adapter createAR11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR12
	 * <em>AR12</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR12
	 * @generated
	 */
	public Adapter createAR12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR13
	 * <em>AR13</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR13
	 * @generated
	 */
	public Adapter createAR13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR14
	 * <em>AR14</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR14
	 * @generated
	 */
	public Adapter createAR14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR15
	 * <em>AR15</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR15
	 * @generated
	 */
	public Adapter createAR15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel
	 * <em>Goal Model</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel
	 * @generated
	 */
	public Adapter createAcadGoalModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.simulation.model.acad.CV_MST
	 * <em>CV MST</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.CV_MST
	 * @generated
	 */
	public Adapter createCV_MSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eeat.model.LTL.OclAny <em>Ocl Any</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eeat.model.LTL.OclAny
	 * @generated
	 */
	public Adapter createOclAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.Requirement
	 * <em>Requirement</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.DefinableRequirement
	 * <em>Definable Requirement</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.DefinableRequirement
	 * @generated
	 */
	public Adapter createDefinableRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.PerformativeRequirement
	 * <em>Performative Requirement</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.PerformativeRequirement
	 * @generated
	 */
	public Adapter createPerformativeRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.Goal <em>Goal</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.DomainAssumption
	 * <em>Domain Assumption</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.DomainAssumption
	 * @generated
	 */
	public Adapter createDomainAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.Task <em>Task</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.Softgoal
	 * @generated
	 */
	public Adapter createSoftgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.QualityConstraint
	 * <em>Quality Constraint</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.QualityConstraint
	 * @generated
	 */
	public Adapter createQualityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.AwReq <em>Aw Req</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.AwReq
	 * @generated
	 */
	public Adapter createAwReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.eca.EcaAwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.eca.EcaAwReq
	 * @generated
	 */
	public Adapter createEcaAwReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.GoalModel
	 * <em>Goal Model</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel
	 * @generated
	 */
	public Adapter createGoalModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.zanshin.model.gore.Parameter <em>Parameter</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.unitn.disi.zanshin.model.gore.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // AcadAdapterFactory
