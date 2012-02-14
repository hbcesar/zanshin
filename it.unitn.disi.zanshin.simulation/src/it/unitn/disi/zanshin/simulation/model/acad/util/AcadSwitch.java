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
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;
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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eeat.model.LTL.OclAny;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.zanshin.simulation.model.acad.AcadPackage
 * @generated
 */
@SuppressWarnings("rawtypes")
public class AcadSwitch  {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AcadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcadSwitch() {
		if (modelPackage == null) {
			modelPackage = AcadPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AcadPackage.GGEN_DISPATCH: {
				G_GenDispatch g_GenDispatch = (G_GenDispatch)theEObject;
				Object result = caseG_GenDispatch(g_GenDispatch);
				if (result == null) result = caseGoal(g_GenDispatch);
				if (result == null) result = casePerformativeRequirement(g_GenDispatch);
				if (result == null) result = caseDefinableRequirement(g_GenDispatch);
				if (result == null) result = caseRequirement(g_GenDispatch);
				if (result == null) result = caseOclAny(g_GenDispatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GCALL_TAKING: {
				G_CallTaking g_CallTaking = (G_CallTaking)theEObject;
				Object result = caseG_CallTaking(g_CallTaking);
				if (result == null) result = caseGoal(g_CallTaking);
				if (result == null) result = casePerformativeRequirement(g_CallTaking);
				if (result == null) result = caseDefinableRequirement(g_CallTaking);
				if (result == null) result = caseRequirement(g_CallTaking);
				if (result == null) result = caseOclAny(g_CallTaking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.DDATA_UPD: {
				D_DataUpd d_DataUpd = (D_DataUpd)theEObject;
				Object result = caseD_DataUpd(d_DataUpd);
				if (result == null) result = caseDomainAssumption(d_DataUpd);
				if (result == null) result = caseDefinableRequirement(d_DataUpd);
				if (result == null) result = caseRequirement(d_DataUpd);
				if (result == null) result = caseOclAny(d_DataUpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GRESOURCE_ID: {
				G_ResourceId g_ResourceId = (G_ResourceId)theEObject;
				Object result = caseG_ResourceId(g_ResourceId);
				if (result == null) result = caseGoal(g_ResourceId);
				if (result == null) result = casePerformativeRequirement(g_ResourceId);
				if (result == null) result = caseDefinableRequirement(g_ResourceId);
				if (result == null) result = caseRequirement(g_ResourceId);
				if (result == null) result = caseOclAny(g_ResourceId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GRESOURCE_MOB: {
				G_ResourceMob g_ResourceMob = (G_ResourceMob)theEObject;
				Object result = caseG_ResourceMob(g_ResourceMob);
				if (result == null) result = caseGoal(g_ResourceMob);
				if (result == null) result = casePerformativeRequirement(g_ResourceMob);
				if (result == null) result = caseDefinableRequirement(g_ResourceMob);
				if (result == null) result = caseRequirement(g_ResourceMob);
				if (result == null) result = caseOclAny(g_ResourceMob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GOBTAIN_MAP: {
				G_ObtainMap g_ObtainMap = (G_ObtainMap)theEObject;
				Object result = caseG_ObtainMap(g_ObtainMap);
				if (result == null) result = caseGoal(g_ObtainMap);
				if (result == null) result = casePerformativeRequirement(g_ObtainMap);
				if (result == null) result = caseDefinableRequirement(g_ObtainMap);
				if (result == null) result = caseRequirement(g_ObtainMap);
				if (result == null) result = caseOclAny(g_ObtainMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GINCIDENT_UPD: {
				G_IncidentUpd g_IncidentUpd = (G_IncidentUpd)theEObject;
				Object result = caseG_IncidentUpd(g_IncidentUpd);
				if (result == null) result = caseGoal(g_IncidentUpd);
				if (result == null) result = casePerformativeRequirement(g_IncidentUpd);
				if (result == null) result = caseDefinableRequirement(g_IncidentUpd);
				if (result == null) result = caseRequirement(g_IncidentUpd);
				if (result == null) result = caseOclAny(g_IncidentUpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.DMAX_CALLS: {
				D_MaxCalls d_MaxCalls = (D_MaxCalls)theEObject;
				Object result = caseD_MaxCalls(d_MaxCalls);
				if (result == null) result = caseDomainAssumption(d_MaxCalls);
				if (result == null) result = caseDefinableRequirement(d_MaxCalls);
				if (result == null) result = caseRequirement(d_MaxCalls);
				if (result == null) result = caseOclAny(d_MaxCalls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GREG_CALL: {
				G_RegCall g_RegCall = (G_RegCall)theEObject;
				Object result = caseG_RegCall(g_RegCall);
				if (result == null) result = caseGoal(g_RegCall);
				if (result == null) result = casePerformativeRequirement(g_RegCall);
				if (result == null) result = caseDefinableRequirement(g_RegCall);
				if (result == null) result = caseRequirement(g_RegCall);
				if (result == null) result = caseOclAny(g_RegCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TCONFIRM_CALL: {
				T_ConfirmCall t_ConfirmCall = (T_ConfirmCall)theEObject;
				Object result = caseT_ConfirmCall(t_ConfirmCall);
				if (result == null) result = caseTask(t_ConfirmCall);
				if (result == null) result = casePerformativeRequirement(t_ConfirmCall);
				if (result == null) result = caseDefinableRequirement(t_ConfirmCall);
				if (result == null) result = caseRequirement(t_ConfirmCall);
				if (result == null) result = caseOclAny(t_ConfirmCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GASSIGN_INCIDENT: {
				G_AssignIncident g_AssignIncident = (G_AssignIncident)theEObject;
				Object result = caseG_AssignIncident(g_AssignIncident);
				if (result == null) result = caseGoal(g_AssignIncident);
				if (result == null) result = casePerformativeRequirement(g_AssignIncident);
				if (result == null) result = caseDefinableRequirement(g_AssignIncident);
				if (result == null) result = caseRequirement(g_AssignIncident);
				if (result == null) result = caseOclAny(g_AssignIncident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TSEARCH_DUPLIC: {
				T_SearchDuplic t_SearchDuplic = (T_SearchDuplic)theEObject;
				Object result = caseT_SearchDuplic(t_SearchDuplic);
				if (result == null) result = caseTask(t_SearchDuplic);
				if (result == null) result = casePerformativeRequirement(t_SearchDuplic);
				if (result == null) result = caseDefinableRequirement(t_SearchDuplic);
				if (result == null) result = caseRequirement(t_SearchDuplic);
				if (result == null) result = caseOclAny(t_SearchDuplic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TCREATE_OR_ASSIGN: {
				T_CreateOrAssign t_CreateOrAssign = (T_CreateOrAssign)theEObject;
				Object result = caseT_CreateOrAssign(t_CreateOrAssign);
				if (result == null) result = caseTask(t_CreateOrAssign);
				if (result == null) result = casePerformativeRequirement(t_CreateOrAssign);
				if (result == null) result = caseDefinableRequirement(t_CreateOrAssign);
				if (result == null) result = caseRequirement(t_CreateOrAssign);
				if (result == null) result = caseOclAny(t_CreateOrAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TINPUT_INFO: {
				T_InputInfo t_InputInfo = (T_InputInfo)theEObject;
				Object result = caseT_InputInfo(t_InputInfo);
				if (result == null) result = caseTask(t_InputInfo);
				if (result == null) result = casePerformativeRequirement(t_InputInfo);
				if (result == null) result = caseDefinableRequirement(t_InputInfo);
				if (result == null) result = caseRequirement(t_InputInfo);
				if (result == null) result = caseOclAny(t_InputInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TDETECT_LOC: {
				T_DetectLoc t_DetectLoc = (T_DetectLoc)theEObject;
				Object result = caseT_DetectLoc(t_DetectLoc);
				if (result == null) result = caseTask(t_DetectLoc);
				if (result == null) result = casePerformativeRequirement(t_DetectLoc);
				if (result == null) result = caseDefinableRequirement(t_DetectLoc);
				if (result == null) result = caseRequirement(t_DetectLoc);
				if (result == null) result = caseOclAny(t_DetectLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TSPEC_CONFIG: {
				T_SpecConfig t_SpecConfig = (T_SpecConfig)theEObject;
				Object result = caseT_SpecConfig(t_SpecConfig);
				if (result == null) result = caseTask(t_SpecConfig);
				if (result == null) result = casePerformativeRequirement(t_SpecConfig);
				if (result == null) result = caseDefinableRequirement(t_SpecConfig);
				if (result == null) result = caseRequirement(t_SpecConfig);
				if (result == null) result = caseOclAny(t_SpecConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TCONF_INCIDENT: {
				T_ConfIncident t_ConfIncident = (T_ConfIncident)theEObject;
				Object result = caseT_ConfIncident(t_ConfIncident);
				if (result == null) result = caseTask(t_ConfIncident);
				if (result == null) result = casePerformativeRequirement(t_ConfIncident);
				if (result == null) result = caseDefinableRequirement(t_ConfIncident);
				if (result == null) result = caseRequirement(t_ConfIncident);
				if (result == null) result = caseOclAny(t_ConfIncident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TDET_BEST_AMB: {
				T_DetBestAmb t_DetBestAmb = (T_DetBestAmb)theEObject;
				Object result = caseT_DetBestAmb(t_DetBestAmb);
				if (result == null) result = caseTask(t_DetBestAmb);
				if (result == null) result = casePerformativeRequirement(t_DetBestAmb);
				if (result == null) result = caseDefinableRequirement(t_DetBestAmb);
				if (result == null) result = caseRequirement(t_DetBestAmb);
				if (result == null) result = caseOclAny(t_DetBestAmb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TINFORM_STAT: {
				T_InformStat t_InformStat = (T_InformStat)theEObject;
				Object result = caseT_InformStat(t_InformStat);
				if (result == null) result = caseTask(t_InformStat);
				if (result == null) result = casePerformativeRequirement(t_InformStat);
				if (result == null) result = caseDefinableRequirement(t_InformStat);
				if (result == null) result = caseRequirement(t_InformStat);
				if (result == null) result = caseOclAny(t_InformStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GROUTE_ASSIST: {
				G_RouteAssist g_RouteAssist = (G_RouteAssist)theEObject;
				Object result = caseG_RouteAssist(g_RouteAssist);
				if (result == null) result = caseGoal(g_RouteAssist);
				if (result == null) result = casePerformativeRequirement(g_RouteAssist);
				if (result == null) result = caseDefinableRequirement(g_RouteAssist);
				if (result == null) result = caseRequirement(g_RouteAssist);
				if (result == null) result = caseOclAny(g_RouteAssist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.DDRIVER_KNOWS: {
				D_DriverKnows d_DriverKnows = (D_DriverKnows)theEObject;
				Object result = caseD_DriverKnows(d_DriverKnows);
				if (result == null) result = caseDomainAssumption(d_DriverKnows);
				if (result == null) result = caseDefinableRequirement(d_DriverKnows);
				if (result == null) result = caseRequirement(d_DriverKnows);
				if (result == null) result = caseOclAny(d_DriverKnows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TACAD_ASSISTS: {
				T_AcadAssists t_AcadAssists = (T_AcadAssists)theEObject;
				Object result = caseT_AcadAssists(t_AcadAssists);
				if (result == null) result = caseTask(t_AcadAssists);
				if (result == null) result = casePerformativeRequirement(t_AcadAssists);
				if (result == null) result = caseDefinableRequirement(t_AcadAssists);
				if (result == null) result = caseRequirement(t_AcadAssists);
				if (result == null) result = caseOclAny(t_AcadAssists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TSTAFF_ASSISTS: {
				T_StaffAssists t_StaffAssists = (T_StaffAssists)theEObject;
				Object result = caseT_StaffAssists(t_StaffAssists);
				if (result == null) result = caseTask(t_StaffAssists);
				if (result == null) result = casePerformativeRequirement(t_StaffAssists);
				if (result == null) result = caseDefinableRequirement(t_StaffAssists);
				if (result == null) result = caseRequirement(t_StaffAssists);
				if (result == null) result = caseOclAny(t_StaffAssists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TFEEDBACK: {
				T_Feedback t_Feedback = (T_Feedback)theEObject;
				Object result = caseT_Feedback(t_Feedback);
				if (result == null) result = caseTask(t_Feedback);
				if (result == null) result = casePerformativeRequirement(t_Feedback);
				if (result == null) result = caseDefinableRequirement(t_Feedback);
				if (result == null) result = caseRequirement(t_Feedback);
				if (result == null) result = caseOclAny(t_Feedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.DGAZET_UPD: {
				D_GazetUpd d_GazetUpd = (D_GazetUpd)theEObject;
				Object result = caseD_GazetUpd(d_GazetUpd);
				if (result == null) result = caseDomainAssumption(d_GazetUpd);
				if (result == null) result = caseDefinableRequirement(d_GazetUpd);
				if (result == null) result = caseRequirement(d_GazetUpd);
				if (result == null) result = caseOclAny(d_GazetUpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GMANUAL_MAP: {
				G_ManualMap g_ManualMap = (G_ManualMap)theEObject;
				Object result = caseG_ManualMap(g_ManualMap);
				if (result == null) result = caseGoal(g_ManualMap);
				if (result == null) result = casePerformativeRequirement(g_ManualMap);
				if (result == null) result = caseDefinableRequirement(g_ManualMap);
				if (result == null) result = caseRequirement(g_ManualMap);
				if (result == null) result = caseOclAny(g_ManualMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TCHECK_GAZET: {
				T_CheckGazet t_CheckGazet = (T_CheckGazet)theEObject;
				Object result = caseT_CheckGazet(t_CheckGazet);
				if (result == null) result = caseTask(t_CheckGazet);
				if (result == null) result = casePerformativeRequirement(t_CheckGazet);
				if (result == null) result = caseDefinableRequirement(t_CheckGazet);
				if (result == null) result = caseRequirement(t_CheckGazet);
				if (result == null) result = caseOclAny(t_CheckGazet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TCHECK_PAPER: {
				T_CheckPaper t_CheckPaper = (T_CheckPaper)theEObject;
				Object result = caseT_CheckPaper(t_CheckPaper);
				if (result == null) result = caseTask(t_CheckPaper);
				if (result == null) result = casePerformativeRequirement(t_CheckPaper);
				if (result == null) result = caseDefinableRequirement(t_CheckPaper);
				if (result == null) result = caseRequirement(t_CheckPaper);
				if (result == null) result = caseOclAny(t_CheckPaper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GDISP_EXCEPT: {
				G_DispExcept g_DispExcept = (G_DispExcept)theEObject;
				Object result = caseG_DispExcept(g_DispExcept);
				if (result == null) result = caseGoal(g_DispExcept);
				if (result == null) result = casePerformativeRequirement(g_DispExcept);
				if (result == null) result = caseDefinableRequirement(g_DispExcept);
				if (result == null) result = caseRequirement(g_DispExcept);
				if (result == null) result = caseOclAny(g_DispExcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GMONITOR_RES: {
				G_MonitorRes g_MonitorRes = (G_MonitorRes)theEObject;
				Object result = caseG_MonitorRes(g_MonitorRes);
				if (result == null) result = caseGoal(g_MonitorRes);
				if (result == null) result = casePerformativeRequirement(g_MonitorRes);
				if (result == null) result = caseDefinableRequirement(g_MonitorRes);
				if (result == null) result = caseRequirement(g_MonitorRes);
				if (result == null) result = caseOclAny(g_MonitorRes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.GUPD_POSITION: {
				G_UpdPosition g_UpdPosition = (G_UpdPosition)theEObject;
				Object result = caseG_UpdPosition(g_UpdPosition);
				if (result == null) result = caseGoal(g_UpdPosition);
				if (result == null) result = casePerformativeRequirement(g_UpdPosition);
				if (result == null) result = caseDefinableRequirement(g_UpdPosition);
				if (result == null) result = caseRequirement(g_UpdPosition);
				if (result == null) result = caseOclAny(g_UpdPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.DMDT_POS: {
				D_MDTPos d_MDTPos = (D_MDTPos)theEObject;
				Object result = caseD_MDTPos(d_MDTPos);
				if (result == null) result = caseDomainAssumption(d_MDTPos);
				if (result == null) result = caseDefinableRequirement(d_MDTPos);
				if (result == null) result = caseRequirement(d_MDTPos);
				if (result == null) result = caseOclAny(d_MDTPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TRADIO_POS: {
				T_RadioPos t_RadioPos = (T_RadioPos)theEObject;
				Object result = caseT_RadioPos(t_RadioPos);
				if (result == null) result = caseTask(t_RadioPos);
				if (result == null) result = casePerformativeRequirement(t_RadioPos);
				if (result == null) result = caseDefinableRequirement(t_RadioPos);
				if (result == null) result = caseRequirement(t_RadioPos);
				if (result == null) result = caseOclAny(t_RadioPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.DMDT_USE: {
				D_MDTUse d_MDTUse = (D_MDTUse)theEObject;
				Object result = caseD_MDTUse(d_MDTUse);
				if (result == null) result = caseDomainAssumption(d_MDTUse);
				if (result == null) result = caseDefinableRequirement(d_MDTUse);
				if (result == null) result = caseRequirement(d_MDTUse);
				if (result == null) result = caseOclAny(d_MDTUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TMONITOR_STATUS: {
				T_MonitorStatus t_MonitorStatus = (T_MonitorStatus)theEObject;
				Object result = caseT_MonitorStatus(t_MonitorStatus);
				if (result == null) result = caseTask(t_MonitorStatus);
				if (result == null) result = casePerformativeRequirement(t_MonitorStatus);
				if (result == null) result = caseDefinableRequirement(t_MonitorStatus);
				if (result == null) result = caseRequirement(t_MonitorStatus);
				if (result == null) result = caseOclAny(t_MonitorStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TDISP_STATUS: {
				T_DispStatus t_DispStatus = (T_DispStatus)theEObject;
				Object result = caseT_DispStatus(t_DispStatus);
				if (result == null) result = caseTask(t_DispStatus);
				if (result == null) result = casePerformativeRequirement(t_DispStatus);
				if (result == null) result = caseDefinableRequirement(t_DispStatus);
				if (result == null) result = caseRequirement(t_DispStatus);
				if (result == null) result = caseOclAny(t_DispStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TDISP_DEP_ARRIV: {
				T_DispDepArriv t_DispDepArriv = (T_DispDepArriv)theEObject;
				Object result = caseT_DispDepArriv(t_DispDepArriv);
				if (result == null) result = caseTask(t_DispDepArriv);
				if (result == null) result = casePerformativeRequirement(t_DispDepArriv);
				if (result == null) result = caseDefinableRequirement(t_DispDepArriv);
				if (result == null) result = caseRequirement(t_DispDepArriv);
				if (result == null) result = caseOclAny(t_DispDepArriv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TREPL_AMB: {
				T_ReplAmb t_ReplAmb = (T_ReplAmb)theEObject;
				Object result = caseT_ReplAmb(t_ReplAmb);
				if (result == null) result = caseTask(t_ReplAmb);
				if (result == null) result = casePerformativeRequirement(t_ReplAmb);
				if (result == null) result = caseDefinableRequirement(t_ReplAmb);
				if (result == null) result = caseRequirement(t_ReplAmb);
				if (result == null) result = caseOclAny(t_ReplAmb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TEXCEPT: {
				T_Except t_Except = (T_Except)theEObject;
				Object result = caseT_Except(t_Except);
				if (result == null) result = caseTask(t_Except);
				if (result == null) result = casePerformativeRequirement(t_Except);
				if (result == null) result = caseDefinableRequirement(t_Except);
				if (result == null) result = caseRequirement(t_Except);
				if (result == null) result = caseOclAny(t_Except);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TEXCEPT_QUEUE: {
				T_ExceptQueue t_ExceptQueue = (T_ExceptQueue)theEObject;
				Object result = caseT_ExceptQueue(t_ExceptQueue);
				if (result == null) result = caseTask(t_ExceptQueue);
				if (result == null) result = casePerformativeRequirement(t_ExceptQueue);
				if (result == null) result = caseDefinableRequirement(t_ExceptQueue);
				if (result == null) result = caseRequirement(t_ExceptQueue);
				if (result == null) result = caseOclAny(t_ExceptQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.TCLOSE_INCIDENT: {
				T_CloseIncident t_CloseIncident = (T_CloseIncident)theEObject;
				Object result = caseT_CloseIncident(t_CloseIncident);
				if (result == null) result = caseTask(t_CloseIncident);
				if (result == null) result = casePerformativeRequirement(t_CloseIncident);
				if (result == null) result = caseDefinableRequirement(t_CloseIncident);
				if (result == null) result = caseRequirement(t_CloseIncident);
				if (result == null) result = caseOclAny(t_CloseIncident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.SFAST_DISPATCH: {
				S_FastDispatch s_FastDispatch = (S_FastDispatch)theEObject;
				Object result = caseS_FastDispatch(s_FastDispatch);
				if (result == null) result = caseSoftgoal(s_FastDispatch);
				if (result == null) result = caseRequirement(s_FastDispatch);
				if (result == null) result = caseOclAny(s_FastDispatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.QDISPATCH: {
				Q_Dispatch q_Dispatch = (Q_Dispatch)theEObject;
				Object result = caseQ_Dispatch(q_Dispatch);
				if (result == null) result = caseQualityConstraint(q_Dispatch);
				if (result == null) result = caseDefinableRequirement(q_Dispatch);
				if (result == null) result = caseRequirement(q_Dispatch);
				if (result == null) result = caseOclAny(q_Dispatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.SFAST_ASSIST: {
				S_FastAssist s_FastAssist = (S_FastAssist)theEObject;
				Object result = caseS_FastAssist(s_FastAssist);
				if (result == null) result = caseSoftgoal(s_FastAssist);
				if (result == null) result = caseRequirement(s_FastAssist);
				if (result == null) result = caseOclAny(s_FastAssist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.QINCID_RESOLV: {
				Q_IncidResolv q_IncidResolv = (Q_IncidResolv)theEObject;
				Object result = caseQ_IncidResolv(q_IncidResolv);
				if (result == null) result = caseQualityConstraint(q_IncidResolv);
				if (result == null) result = caseDefinableRequirement(q_IncidResolv);
				if (result == null) result = caseRequirement(q_IncidResolv);
				if (result == null) result = caseOclAny(q_IncidResolv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.SFAST_ARRIV: {
				S_FastArriv s_FastArriv = (S_FastArriv)theEObject;
				Object result = caseS_FastArriv(s_FastArriv);
				if (result == null) result = caseSoftgoal(s_FastArriv);
				if (result == null) result = caseRequirement(s_FastArriv);
				if (result == null) result = caseOclAny(s_FastArriv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.QAMB_ARRIV: {
				Q_AmbArriv q_AmbArriv = (Q_AmbArriv)theEObject;
				Object result = caseQ_AmbArriv(q_AmbArriv);
				if (result == null) result = caseQualityConstraint(q_AmbArriv);
				if (result == null) result = caseDefinableRequirement(q_AmbArriv);
				if (result == null) result = caseRequirement(q_AmbArriv);
				if (result == null) result = caseOclAny(q_AmbArriv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.SLOW_COST: {
				S_LowCost s_LowCost = (S_LowCost)theEObject;
				Object result = caseS_LowCost(s_LowCost);
				if (result == null) result = caseSoftgoal(s_LowCost);
				if (result == null) result = caseRequirement(s_LowCost);
				if (result == null) result = caseOclAny(s_LowCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.QMAX_COST: {
				Q_MaxCost q_MaxCost = (Q_MaxCost)theEObject;
				Object result = caseQ_MaxCost(q_MaxCost);
				if (result == null) result = caseQualityConstraint(q_MaxCost);
				if (result == null) result = caseDefinableRequirement(q_MaxCost);
				if (result == null) result = caseRequirement(q_MaxCost);
				if (result == null) result = caseOclAny(q_MaxCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.SUSER_FRIENDLY: {
				S_UserFriendly s_UserFriendly = (S_UserFriendly)theEObject;
				Object result = caseS_UserFriendly(s_UserFriendly);
				if (result == null) result = caseSoftgoal(s_UserFriendly);
				if (result == null) result = caseRequirement(s_UserFriendly);
				if (result == null) result = caseOclAny(s_UserFriendly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.QMAX_TIME_MSG: {
				Q_MaxTimeMsg q_MaxTimeMsg = (Q_MaxTimeMsg)theEObject;
				Object result = caseQ_MaxTimeMsg(q_MaxTimeMsg);
				if (result == null) result = caseQualityConstraint(q_MaxTimeMsg);
				if (result == null) result = caseDefinableRequirement(q_MaxTimeMsg);
				if (result == null) result = caseRequirement(q_MaxTimeMsg);
				if (result == null) result = caseOclAny(q_MaxTimeMsg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR1: {
				AR1 ar1 = (AR1)theEObject;
				Object result = caseAR1(ar1);
				if (result == null) result = caseEcaAwReq(ar1);
				if (result == null) result = caseAwReq(ar1);
				if (result == null) result = caseDefinableRequirement(ar1);
				if (result == null) result = caseRequirement(ar1);
				if (result == null) result = caseOclAny(ar1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR2: {
				AR2 ar2 = (AR2)theEObject;
				Object result = caseAR2(ar2);
				if (result == null) result = caseEcaAwReq(ar2);
				if (result == null) result = caseAwReq(ar2);
				if (result == null) result = caseDefinableRequirement(ar2);
				if (result == null) result = caseRequirement(ar2);
				if (result == null) result = caseOclAny(ar2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR3: {
				AR3 ar3 = (AR3)theEObject;
				Object result = caseAR3(ar3);
				if (result == null) result = caseEcaAwReq(ar3);
				if (result == null) result = caseAwReq(ar3);
				if (result == null) result = caseDefinableRequirement(ar3);
				if (result == null) result = caseRequirement(ar3);
				if (result == null) result = caseOclAny(ar3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR4: {
				AR4 ar4 = (AR4)theEObject;
				Object result = caseAR4(ar4);
				if (result == null) result = caseEcaAwReq(ar4);
				if (result == null) result = caseAwReq(ar4);
				if (result == null) result = caseDefinableRequirement(ar4);
				if (result == null) result = caseRequirement(ar4);
				if (result == null) result = caseOclAny(ar4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR5: {
				AR5 ar5 = (AR5)theEObject;
				Object result = caseAR5(ar5);
				if (result == null) result = caseEcaAwReq(ar5);
				if (result == null) result = caseAwReq(ar5);
				if (result == null) result = caseDefinableRequirement(ar5);
				if (result == null) result = caseRequirement(ar5);
				if (result == null) result = caseOclAny(ar5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR6: {
				AR6 ar6 = (AR6)theEObject;
				Object result = caseAR6(ar6);
				if (result == null) result = caseEcaAwReq(ar6);
				if (result == null) result = caseAwReq(ar6);
				if (result == null) result = caseDefinableRequirement(ar6);
				if (result == null) result = caseRequirement(ar6);
				if (result == null) result = caseOclAny(ar6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR7: {
				AR7 ar7 = (AR7)theEObject;
				Object result = caseAR7(ar7);
				if (result == null) result = caseEcaAwReq(ar7);
				if (result == null) result = caseAwReq(ar7);
				if (result == null) result = caseDefinableRequirement(ar7);
				if (result == null) result = caseRequirement(ar7);
				if (result == null) result = caseOclAny(ar7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR8: {
				AR8 ar8 = (AR8)theEObject;
				Object result = caseAR8(ar8);
				if (result == null) result = caseEcaAwReq(ar8);
				if (result == null) result = caseAwReq(ar8);
				if (result == null) result = caseDefinableRequirement(ar8);
				if (result == null) result = caseRequirement(ar8);
				if (result == null) result = caseOclAny(ar8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR9: {
				AR9 ar9 = (AR9)theEObject;
				Object result = caseAR9(ar9);
				if (result == null) result = caseEcaAwReq(ar9);
				if (result == null) result = caseAwReq(ar9);
				if (result == null) result = caseDefinableRequirement(ar9);
				if (result == null) result = caseRequirement(ar9);
				if (result == null) result = caseOclAny(ar9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR10: {
				AR10 ar10 = (AR10)theEObject;
				Object result = caseAR10(ar10);
				if (result == null) result = caseEcaAwReq(ar10);
				if (result == null) result = caseAwReq(ar10);
				if (result == null) result = caseDefinableRequirement(ar10);
				if (result == null) result = caseRequirement(ar10);
				if (result == null) result = caseOclAny(ar10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR11: {
				AR11 ar11 = (AR11)theEObject;
				Object result = caseAR11(ar11);
				if (result == null) result = caseEcaAwReq(ar11);
				if (result == null) result = caseAwReq(ar11);
				if (result == null) result = caseDefinableRequirement(ar11);
				if (result == null) result = caseRequirement(ar11);
				if (result == null) result = caseOclAny(ar11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR12: {
				AR12 ar12 = (AR12)theEObject;
				Object result = caseAR12(ar12);
				if (result == null) result = caseEcaAwReq(ar12);
				if (result == null) result = caseAwReq(ar12);
				if (result == null) result = caseDefinableRequirement(ar12);
				if (result == null) result = caseRequirement(ar12);
				if (result == null) result = caseOclAny(ar12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR13: {
				AR13 ar13 = (AR13)theEObject;
				Object result = caseAR13(ar13);
				if (result == null) result = caseEcaAwReq(ar13);
				if (result == null) result = caseAwReq(ar13);
				if (result == null) result = caseDefinableRequirement(ar13);
				if (result == null) result = caseRequirement(ar13);
				if (result == null) result = caseOclAny(ar13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR14: {
				AR14 ar14 = (AR14)theEObject;
				Object result = caseAR14(ar14);
				if (result == null) result = caseEcaAwReq(ar14);
				if (result == null) result = caseAwReq(ar14);
				if (result == null) result = caseDefinableRequirement(ar14);
				if (result == null) result = caseRequirement(ar14);
				if (result == null) result = caseOclAny(ar14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.AR15: {
				AR15 ar15 = (AR15)theEObject;
				Object result = caseAR15(ar15);
				if (result == null) result = caseEcaAwReq(ar15);
				if (result == null) result = caseAwReq(ar15);
				if (result == null) result = caseDefinableRequirement(ar15);
				if (result == null) result = caseRequirement(ar15);
				if (result == null) result = caseOclAny(ar15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcadPackage.ACAD_GOAL_MODEL: {
				AcadGoalModel acadGoalModel = (AcadGoalModel)theEObject;
				Object result = caseAcadGoalModel(acadGoalModel);
				if (result == null) result = caseGoalModel(acadGoalModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GGen Dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GGen Dispatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_GenDispatch(G_GenDispatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCall Taking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCall Taking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_CallTaking(G_CallTaking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DData Upd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DData Upd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD_DataUpd(D_DataUpd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GResource Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GResource Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_ResourceId(G_ResourceId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GResource Mob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GResource Mob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_ResourceMob(G_ResourceMob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GObtain Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GObtain Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_ObtainMap(G_ObtainMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIncident Upd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIncident Upd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_IncidentUpd(G_IncidentUpd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMax Calls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMax Calls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD_MaxCalls(D_MaxCalls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GReg Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GReg Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_RegCall(G_RegCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConfirm Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConfirm Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_ConfirmCall(T_ConfirmCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAssign Incident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAssign Incident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_AssignIncident(G_AssignIncident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSearch Duplic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSearch Duplic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_SearchDuplic(T_SearchDuplic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCreate Or Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCreate Or Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_CreateOrAssign(T_CreateOrAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInput Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInput Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_InputInfo(T_InputInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDetect Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDetect Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_DetectLoc(T_DetectLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSpec Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSpec Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_SpecConfig(T_SpecConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConf Incident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConf Incident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_ConfIncident(T_ConfIncident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDet Best Amb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDet Best Amb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_DetBestAmb(T_DetBestAmb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInform Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInform Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_InformStat(T_InformStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRoute Assist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRoute Assist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_RouteAssist(G_RouteAssist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDriver Knows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDriver Knows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD_DriverKnows(D_DriverKnows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAcad Assists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAcad Assists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_AcadAssists(T_AcadAssists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TStaff Assists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TStaff Assists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_StaffAssists(T_StaffAssists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFeedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFeedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_Feedback(T_Feedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DGazet Upd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DGazet Upd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD_GazetUpd(D_GazetUpd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GManual Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GManual Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_ManualMap(G_ManualMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCheck Gazet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCheck Gazet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_CheckGazet(T_CheckGazet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCheck Paper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCheck Paper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_CheckPaper(T_CheckPaper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GDisp Except</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GDisp Except</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_DispExcept(G_DispExcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GMonitor Res</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GMonitor Res</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_MonitorRes(G_MonitorRes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUpd Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUpd Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseG_UpdPosition(G_UpdPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMDT Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMDT Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD_MDTPos(D_MDTPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRadio Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRadio Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_RadioPos(T_RadioPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMDT Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMDT Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseD_MDTUse(D_MDTUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMonitor Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMonitor Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_MonitorStatus(T_MonitorStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDisp Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDisp Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_DispStatus(T_DispStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDisp Dep Arriv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDisp Dep Arriv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_DispDepArriv(T_DispDepArriv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRepl Amb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRepl Amb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_ReplAmb(T_ReplAmb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExcept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExcept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_Except(T_Except object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExcept Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExcept Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_ExceptQueue(T_ExceptQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClose Incident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClose Incident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseT_CloseIncident(T_CloseIncident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFast Dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFast Dispatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseS_FastDispatch(S_FastDispatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QDispatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QDispatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQ_Dispatch(Q_Dispatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFast Assist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFast Assist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseS_FastAssist(S_FastAssist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QIncid Resolv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QIncid Resolv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQ_IncidResolv(Q_IncidResolv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFast Arriv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFast Arriv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseS_FastArriv(S_FastArriv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QAmb Arriv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QAmb Arriv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQ_AmbArriv(Q_AmbArriv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLow Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLow Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseS_LowCost(S_LowCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QMax Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QMax Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQ_MaxCost(Q_MaxCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUser Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUser Friendly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseS_UserFriendly(S_UserFriendly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QMax Time Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QMax Time Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQ_MaxTimeMsg(Q_MaxTimeMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR1(AR1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR2(AR2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR3(AR3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR4(AR4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR5(AR5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR6(AR6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR7(AR7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR8(AR8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR9(AR9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR10(AR10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR11(AR11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR12(AR12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR13(AR13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR14(AR14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAR15(AR15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAcadGoalModel(AcadGoalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclAny(OclAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definable Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definable Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefinableRequirement(DefinableRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performative Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performative Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerformativeRequirement(PerformativeRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainAssumption(DomainAssumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSoftgoal(Softgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualityConstraint(QualityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAwReq(AwReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aw Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEcaAwReq(EcaAwReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGoalModel(GoalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //AcadSwitch
