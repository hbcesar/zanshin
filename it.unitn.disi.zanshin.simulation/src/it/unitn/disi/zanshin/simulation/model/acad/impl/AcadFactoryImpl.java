/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.simulation.model.acad.impl;

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
import it.unitn.disi.zanshin.simulation.model.acad.AcadFactory;
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

import org.eclipse.emf.ecore.EClass;
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
public class AcadFactoryImpl extends EFactoryImpl implements AcadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcadFactory init() {
		try {
			AcadFactory theAcadFactory = (AcadFactory)EPackage.Registry.INSTANCE.getEFactory("http://acad/1.0"); 
			if (theAcadFactory != null) {
				return theAcadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AcadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcadFactoryImpl() {
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
			case AcadPackage.GGEN_DISPATCH: return createG_GenDispatch();
			case AcadPackage.GCALL_TAKING: return createG_CallTaking();
			case AcadPackage.DDATA_UPD: return createD_DataUpd();
			case AcadPackage.GRESOURCE_ID: return createG_ResourceId();
			case AcadPackage.GRESOURCE_MOB: return createG_ResourceMob();
			case AcadPackage.GOBTAIN_MAP: return createG_ObtainMap();
			case AcadPackage.GINCIDENT_UPD: return createG_IncidentUpd();
			case AcadPackage.DMAX_CALLS: return createD_MaxCalls();
			case AcadPackage.GREG_CALL: return createG_RegCall();
			case AcadPackage.TCONFIRM_CALL: return createT_ConfirmCall();
			case AcadPackage.GASSIGN_INCIDENT: return createG_AssignIncident();
			case AcadPackage.TSEARCH_DUPLIC: return createT_SearchDuplic();
			case AcadPackage.TCREATE_OR_ASSIGN: return createT_CreateOrAssign();
			case AcadPackage.TINPUT_INFO: return createT_InputInfo();
			case AcadPackage.TDETECT_LOC: return createT_DetectLoc();
			case AcadPackage.TSPEC_CONFIG: return createT_SpecConfig();
			case AcadPackage.TCONF_INCIDENT: return createT_ConfIncident();
			case AcadPackage.TDET_BEST_AMB: return createT_DetBestAmb();
			case AcadPackage.TINFORM_STAT: return createT_InformStat();
			case AcadPackage.GROUTE_ASSIST: return createG_RouteAssist();
			case AcadPackage.DDRIVER_KNOWS: return createD_DriverKnows();
			case AcadPackage.TACAD_ASSISTS: return createT_AcadAssists();
			case AcadPackage.TSTAFF_ASSISTS: return createT_StaffAssists();
			case AcadPackage.TFEEDBACK: return createT_Feedback();
			case AcadPackage.DGAZET_UPD: return createD_GazetUpd();
			case AcadPackage.GMANUAL_MAP: return createG_ManualMap();
			case AcadPackage.TCHECK_GAZET: return createT_CheckGazet();
			case AcadPackage.TCHECK_PAPER: return createT_CheckPaper();
			case AcadPackage.GDISP_EXCEPT: return createG_DispExcept();
			case AcadPackage.GMONITOR_RES: return createG_MonitorRes();
			case AcadPackage.GUPD_POSITION: return createG_UpdPosition();
			case AcadPackage.DMDT_POS: return createD_MDTPos();
			case AcadPackage.TRADIO_POS: return createT_RadioPos();
			case AcadPackage.DMDT_USE: return createD_MDTUse();
			case AcadPackage.TMONITOR_STATUS: return createT_MonitorStatus();
			case AcadPackage.TDISP_STATUS: return createT_DispStatus();
			case AcadPackage.TDISP_DEP_ARRIV: return createT_DispDepArriv();
			case AcadPackage.TREPL_AMB: return createT_ReplAmb();
			case AcadPackage.TEXCEPT: return createT_Except();
			case AcadPackage.TEXCEPT_QUEUE: return createT_ExceptQueue();
			case AcadPackage.TCLOSE_INCIDENT: return createT_CloseIncident();
			case AcadPackage.SFAST_DISPATCH: return createS_FastDispatch();
			case AcadPackage.QDISPATCH: return createQ_Dispatch();
			case AcadPackage.SFAST_ASSIST: return createS_FastAssist();
			case AcadPackage.QINCID_RESOLV: return createQ_IncidResolv();
			case AcadPackage.SFAST_ARRIV: return createS_FastArriv();
			case AcadPackage.QAMB_ARRIV: return createQ_AmbArriv();
			case AcadPackage.SLOW_COST: return createS_LowCost();
			case AcadPackage.QMAX_COST: return createQ_MaxCost();
			case AcadPackage.SUSER_FRIENDLY: return createS_UserFriendly();
			case AcadPackage.QMAX_TIME_MSG: return createQ_MaxTimeMsg();
			case AcadPackage.AR1: return createAR1();
			case AcadPackage.AR2: return createAR2();
			case AcadPackage.AR3: return createAR3();
			case AcadPackage.AR4: return createAR4();
			case AcadPackage.AR5: return createAR5();
			case AcadPackage.AR6: return createAR6();
			case AcadPackage.AR7: return createAR7();
			case AcadPackage.AR8: return createAR8();
			case AcadPackage.AR9: return createAR9();
			case AcadPackage.AR10: return createAR10();
			case AcadPackage.AR11: return createAR11();
			case AcadPackage.AR12: return createAR12();
			case AcadPackage.AR13: return createAR13();
			case AcadPackage.AR14: return createAR14();
			case AcadPackage.AR15: return createAR15();
			case AcadPackage.ACAD_GOAL_MODEL: return createAcadGoalModel();
			case AcadPackage.CV_MST: return createCV_MST();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_GenDispatch createG_GenDispatch() {
		G_GenDispatchImpl g_GenDispatch = new G_GenDispatchImpl();
		return g_GenDispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_CallTaking createG_CallTaking() {
		G_CallTakingImpl g_CallTaking = new G_CallTakingImpl();
		return g_CallTaking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_DataUpd createD_DataUpd() {
		D_DataUpdImpl d_DataUpd = new D_DataUpdImpl();
		return d_DataUpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_ResourceId createG_ResourceId() {
		G_ResourceIdImpl g_ResourceId = new G_ResourceIdImpl();
		return g_ResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_ResourceMob createG_ResourceMob() {
		G_ResourceMobImpl g_ResourceMob = new G_ResourceMobImpl();
		return g_ResourceMob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_ObtainMap createG_ObtainMap() {
		G_ObtainMapImpl g_ObtainMap = new G_ObtainMapImpl();
		return g_ObtainMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_IncidentUpd createG_IncidentUpd() {
		G_IncidentUpdImpl g_IncidentUpd = new G_IncidentUpdImpl();
		return g_IncidentUpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_MaxCalls createD_MaxCalls() {
		D_MaxCallsImpl d_MaxCalls = new D_MaxCallsImpl();
		return d_MaxCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_RegCall createG_RegCall() {
		G_RegCallImpl g_RegCall = new G_RegCallImpl();
		return g_RegCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ConfirmCall createT_ConfirmCall() {
		T_ConfirmCallImpl t_ConfirmCall = new T_ConfirmCallImpl();
		return t_ConfirmCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_AssignIncident createG_AssignIncident() {
		G_AssignIncidentImpl g_AssignIncident = new G_AssignIncidentImpl();
		return g_AssignIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_SearchDuplic createT_SearchDuplic() {
		T_SearchDuplicImpl t_SearchDuplic = new T_SearchDuplicImpl();
		return t_SearchDuplic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CreateOrAssign createT_CreateOrAssign() {
		T_CreateOrAssignImpl t_CreateOrAssign = new T_CreateOrAssignImpl();
		return t_CreateOrAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_InputInfo createT_InputInfo() {
		T_InputInfoImpl t_InputInfo = new T_InputInfoImpl();
		return t_InputInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DetectLoc createT_DetectLoc() {
		T_DetectLocImpl t_DetectLoc = new T_DetectLocImpl();
		return t_DetectLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_SpecConfig createT_SpecConfig() {
		T_SpecConfigImpl t_SpecConfig = new T_SpecConfigImpl();
		return t_SpecConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ConfIncident createT_ConfIncident() {
		T_ConfIncidentImpl t_ConfIncident = new T_ConfIncidentImpl();
		return t_ConfIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DetBestAmb createT_DetBestAmb() {
		T_DetBestAmbImpl t_DetBestAmb = new T_DetBestAmbImpl();
		return t_DetBestAmb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_InformStat createT_InformStat() {
		T_InformStatImpl t_InformStat = new T_InformStatImpl();
		return t_InformStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_RouteAssist createG_RouteAssist() {
		G_RouteAssistImpl g_RouteAssist = new G_RouteAssistImpl();
		return g_RouteAssist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_DriverKnows createD_DriverKnows() {
		D_DriverKnowsImpl d_DriverKnows = new D_DriverKnowsImpl();
		return d_DriverKnows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_AcadAssists createT_AcadAssists() {
		T_AcadAssistsImpl t_AcadAssists = new T_AcadAssistsImpl();
		return t_AcadAssists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_StaffAssists createT_StaffAssists() {
		T_StaffAssistsImpl t_StaffAssists = new T_StaffAssistsImpl();
		return t_StaffAssists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Feedback createT_Feedback() {
		T_FeedbackImpl t_Feedback = new T_FeedbackImpl();
		return t_Feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_GazetUpd createD_GazetUpd() {
		D_GazetUpdImpl d_GazetUpd = new D_GazetUpdImpl();
		return d_GazetUpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_ManualMap createG_ManualMap() {
		G_ManualMapImpl g_ManualMap = new G_ManualMapImpl();
		return g_ManualMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CheckGazet createT_CheckGazet() {
		T_CheckGazetImpl t_CheckGazet = new T_CheckGazetImpl();
		return t_CheckGazet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CheckPaper createT_CheckPaper() {
		T_CheckPaperImpl t_CheckPaper = new T_CheckPaperImpl();
		return t_CheckPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_DispExcept createG_DispExcept() {
		G_DispExceptImpl g_DispExcept = new G_DispExceptImpl();
		return g_DispExcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_MonitorRes createG_MonitorRes() {
		G_MonitorResImpl g_MonitorRes = new G_MonitorResImpl();
		return g_MonitorRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_UpdPosition createG_UpdPosition() {
		G_UpdPositionImpl g_UpdPosition = new G_UpdPositionImpl();
		return g_UpdPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_MDTPos createD_MDTPos() {
		D_MDTPosImpl d_MDTPos = new D_MDTPosImpl();
		return d_MDTPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_RadioPos createT_RadioPos() {
		T_RadioPosImpl t_RadioPos = new T_RadioPosImpl();
		return t_RadioPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_MDTUse createD_MDTUse() {
		D_MDTUseImpl d_MDTUse = new D_MDTUseImpl();
		return d_MDTUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_MonitorStatus createT_MonitorStatus() {
		T_MonitorStatusImpl t_MonitorStatus = new T_MonitorStatusImpl();
		return t_MonitorStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DispStatus createT_DispStatus() {
		T_DispStatusImpl t_DispStatus = new T_DispStatusImpl();
		return t_DispStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DispDepArriv createT_DispDepArriv() {
		T_DispDepArrivImpl t_DispDepArriv = new T_DispDepArrivImpl();
		return t_DispDepArriv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ReplAmb createT_ReplAmb() {
		T_ReplAmbImpl t_ReplAmb = new T_ReplAmbImpl();
		return t_ReplAmb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Except createT_Except() {
		T_ExceptImpl t_Except = new T_ExceptImpl();
		return t_Except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExceptQueue createT_ExceptQueue() {
		T_ExceptQueueImpl t_ExceptQueue = new T_ExceptQueueImpl();
		return t_ExceptQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CloseIncident createT_CloseIncident() {
		T_CloseIncidentImpl t_CloseIncident = new T_CloseIncidentImpl();
		return t_CloseIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FastDispatch createS_FastDispatch() {
		S_FastDispatchImpl s_FastDispatch = new S_FastDispatchImpl();
		return s_FastDispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q_Dispatch createQ_Dispatch() {
		Q_DispatchImpl q_Dispatch = new Q_DispatchImpl();
		return q_Dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FastAssist createS_FastAssist() {
		S_FastAssistImpl s_FastAssist = new S_FastAssistImpl();
		return s_FastAssist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q_IncidResolv createQ_IncidResolv() {
		Q_IncidResolvImpl q_IncidResolv = new Q_IncidResolvImpl();
		return q_IncidResolv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FastArriv createS_FastArriv() {
		S_FastArrivImpl s_FastArriv = new S_FastArrivImpl();
		return s_FastArriv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q_AmbArriv createQ_AmbArriv() {
		Q_AmbArrivImpl q_AmbArriv = new Q_AmbArrivImpl();
		return q_AmbArriv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_LowCost createS_LowCost() {
		S_LowCostImpl s_LowCost = new S_LowCostImpl();
		return s_LowCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q_MaxCost createQ_MaxCost() {
		Q_MaxCostImpl q_MaxCost = new Q_MaxCostImpl();
		return q_MaxCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_UserFriendly createS_UserFriendly() {
		S_UserFriendlyImpl s_UserFriendly = new S_UserFriendlyImpl();
		return s_UserFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q_MaxTimeMsg createQ_MaxTimeMsg() {
		Q_MaxTimeMsgImpl q_MaxTimeMsg = new Q_MaxTimeMsgImpl();
		return q_MaxTimeMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR1 createAR1() {
		AR1Impl ar1 = new AR1Impl();
		return ar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR2 createAR2() {
		AR2Impl ar2 = new AR2Impl();
		return ar2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR3 createAR3() {
		AR3Impl ar3 = new AR3Impl();
		return ar3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR4 createAR4() {
		AR4Impl ar4 = new AR4Impl();
		return ar4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR5 createAR5() {
		AR5Impl ar5 = new AR5Impl();
		return ar5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR6 createAR6() {
		AR6Impl ar6 = new AR6Impl();
		return ar6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR7 createAR7() {
		AR7Impl ar7 = new AR7Impl();
		return ar7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR8 createAR8() {
		AR8Impl ar8 = new AR8Impl();
		return ar8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR9 createAR9() {
		AR9Impl ar9 = new AR9Impl();
		return ar9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR10 createAR10() {
		AR10Impl ar10 = new AR10Impl();
		return ar10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR11 createAR11() {
		AR11Impl ar11 = new AR11Impl();
		return ar11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR12 createAR12() {
		AR12Impl ar12 = new AR12Impl();
		return ar12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR13 createAR13() {
		AR13Impl ar13 = new AR13Impl();
		return ar13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR14 createAR14() {
		AR14Impl ar14 = new AR14Impl();
		return ar14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AR15 createAR15() {
		AR15Impl ar15 = new AR15Impl();
		return ar15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcadGoalModel createAcadGoalModel() {
		AcadGoalModelImpl acadGoalModel = new AcadGoalModelImpl();
		return acadGoalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CV_MST createCV_MST() {
		CV_MSTImpl cV_MST = new CV_MSTImpl();
		return cV_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcadPackage getAcadPackage() {
		return (AcadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AcadPackage getPackage() {
		return AcadPackage.eINSTANCE;
	}

} //AcadFactoryImpl
