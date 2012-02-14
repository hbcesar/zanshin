/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.simulation.model.acad.impl;

import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.gore.GorePackage;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eeat.model.LTL.LTLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcadPackageImpl extends EPackageImpl implements AcadPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_GenDispatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_CallTakingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_DataUpdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ResourceIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ResourceMobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ObtainMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_IncidentUpdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_MaxCallsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_RegCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ConfirmCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_AssignIncidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_SearchDuplicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CreateOrAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_InputInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DetectLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_SpecConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ConfIncidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DetBestAmbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_InformStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_RouteAssistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_DriverKnowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_AcadAssistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_StaffAssistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_FeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_GazetUpdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ManualMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CheckGazetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CheckPaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_DispExceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_MonitorResEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_UpdPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_MDTPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_RadioPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_MDTUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_MonitorStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DispStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DispDepArrivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ReplAmbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExceptQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CloseIncidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FastDispatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass q_DispatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FastAssistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass q_IncidResolvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FastArrivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass q_AmbArrivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_LowCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass q_MaxCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_UserFriendlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass q_MaxTimeMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar12EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar13EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar14EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acadGoalModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AcadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AcadPackageImpl() {
		super(eNS_URI, AcadFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AcadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AcadPackage init() {
		if (isInited) return (AcadPackage)EPackage.Registry.INSTANCE.getEPackage(AcadPackage.eNS_URI);

		// Obtain or create and register package
		AcadPackageImpl theAcadPackage = (AcadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AcadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AcadPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcaPackage.eINSTANCE.eClass();
		GorePackage.eINSTANCE.eClass();
		LTLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAcadPackage.createPackageContents();

		// Initialize created meta-data
		theAcadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAcadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AcadPackage.eNS_URI, theAcadPackage);
		return theAcadPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_GenDispatch() {
		return g_GenDispatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_CallTaking() {
		return g_CallTakingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_DataUpd() {
		return d_DataUpdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_ResourceId() {
		return g_ResourceIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_ResourceMob() {
		return g_ResourceMobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_ObtainMap() {
		return g_ObtainMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_IncidentUpd() {
		return g_IncidentUpdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_MaxCalls() {
		return d_MaxCallsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_RegCall() {
		return g_RegCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ConfirmCall() {
		return t_ConfirmCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_AssignIncident() {
		return g_AssignIncidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_SearchDuplic() {
		return t_SearchDuplicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CreateOrAssign() {
		return t_CreateOrAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_InputInfo() {
		return t_InputInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DetectLoc() {
		return t_DetectLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_SpecConfig() {
		return t_SpecConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ConfIncident() {
		return t_ConfIncidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DetBestAmb() {
		return t_DetBestAmbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_InformStat() {
		return t_InformStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_RouteAssist() {
		return g_RouteAssistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_DriverKnows() {
		return d_DriverKnowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_AcadAssists() {
		return t_AcadAssistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_StaffAssists() {
		return t_StaffAssistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Feedback() {
		return t_FeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_GazetUpd() {
		return d_GazetUpdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_ManualMap() {
		return g_ManualMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CheckGazet() {
		return t_CheckGazetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CheckPaper() {
		return t_CheckPaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_DispExcept() {
		return g_DispExceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_MonitorRes() {
		return g_MonitorResEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG_UpdPosition() {
		return g_UpdPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_MDTPos() {
		return d_MDTPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_RadioPos() {
		return t_RadioPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_MDTUse() {
		return d_MDTUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_MonitorStatus() {
		return t_MonitorStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DispStatus() {
		return t_DispStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DispDepArriv() {
		return t_DispDepArrivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ReplAmb() {
		return t_ReplAmbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Except() {
		return t_ExceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExceptQueue() {
		return t_ExceptQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CloseIncident() {
		return t_CloseIncidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FastDispatch() {
		return s_FastDispatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQ_Dispatch() {
		return q_DispatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FastAssist() {
		return s_FastAssistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQ_IncidResolv() {
		return q_IncidResolvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FastArriv() {
		return s_FastArrivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQ_AmbArriv() {
		return q_AmbArrivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_LowCost() {
		return s_LowCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQ_MaxCost() {
		return q_MaxCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_UserFriendly() {
		return s_UserFriendlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQ_MaxTimeMsg() {
		return q_MaxTimeMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR1() {
		return ar1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR2() {
		return ar2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR3() {
		return ar3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR4() {
		return ar4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR5() {
		return ar5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR6() {
		return ar6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR7() {
		return ar7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR8() {
		return ar8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR9() {
		return ar9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR10() {
		return ar10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR11() {
		return ar11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR12() {
		return ar12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR13() {
		return ar13EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR14() {
		return ar14EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAR15() {
		return ar15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcadGoalModel() {
		return acadGoalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcadFactory getAcadFactory() {
		return (AcadFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		g_GenDispatchEClass = createEClass(GGEN_DISPATCH);

		g_CallTakingEClass = createEClass(GCALL_TAKING);

		d_DataUpdEClass = createEClass(DDATA_UPD);

		g_ResourceIdEClass = createEClass(GRESOURCE_ID);

		g_ResourceMobEClass = createEClass(GRESOURCE_MOB);

		g_ObtainMapEClass = createEClass(GOBTAIN_MAP);

		g_IncidentUpdEClass = createEClass(GINCIDENT_UPD);

		d_MaxCallsEClass = createEClass(DMAX_CALLS);

		g_RegCallEClass = createEClass(GREG_CALL);

		t_ConfirmCallEClass = createEClass(TCONFIRM_CALL);

		g_AssignIncidentEClass = createEClass(GASSIGN_INCIDENT);

		t_SearchDuplicEClass = createEClass(TSEARCH_DUPLIC);

		t_CreateOrAssignEClass = createEClass(TCREATE_OR_ASSIGN);

		t_InputInfoEClass = createEClass(TINPUT_INFO);

		t_DetectLocEClass = createEClass(TDETECT_LOC);

		t_SpecConfigEClass = createEClass(TSPEC_CONFIG);

		t_ConfIncidentEClass = createEClass(TCONF_INCIDENT);

		t_DetBestAmbEClass = createEClass(TDET_BEST_AMB);

		t_InformStatEClass = createEClass(TINFORM_STAT);

		g_RouteAssistEClass = createEClass(GROUTE_ASSIST);

		d_DriverKnowsEClass = createEClass(DDRIVER_KNOWS);

		t_AcadAssistsEClass = createEClass(TACAD_ASSISTS);

		t_StaffAssistsEClass = createEClass(TSTAFF_ASSISTS);

		t_FeedbackEClass = createEClass(TFEEDBACK);

		d_GazetUpdEClass = createEClass(DGAZET_UPD);

		g_ManualMapEClass = createEClass(GMANUAL_MAP);

		t_CheckGazetEClass = createEClass(TCHECK_GAZET);

		t_CheckPaperEClass = createEClass(TCHECK_PAPER);

		g_DispExceptEClass = createEClass(GDISP_EXCEPT);

		g_MonitorResEClass = createEClass(GMONITOR_RES);

		g_UpdPositionEClass = createEClass(GUPD_POSITION);

		d_MDTPosEClass = createEClass(DMDT_POS);

		t_RadioPosEClass = createEClass(TRADIO_POS);

		d_MDTUseEClass = createEClass(DMDT_USE);

		t_MonitorStatusEClass = createEClass(TMONITOR_STATUS);

		t_DispStatusEClass = createEClass(TDISP_STATUS);

		t_DispDepArrivEClass = createEClass(TDISP_DEP_ARRIV);

		t_ReplAmbEClass = createEClass(TREPL_AMB);

		t_ExceptEClass = createEClass(TEXCEPT);

		t_ExceptQueueEClass = createEClass(TEXCEPT_QUEUE);

		t_CloseIncidentEClass = createEClass(TCLOSE_INCIDENT);

		s_FastDispatchEClass = createEClass(SFAST_DISPATCH);

		q_DispatchEClass = createEClass(QDISPATCH);

		s_FastAssistEClass = createEClass(SFAST_ASSIST);

		q_IncidResolvEClass = createEClass(QINCID_RESOLV);

		s_FastArrivEClass = createEClass(SFAST_ARRIV);

		q_AmbArrivEClass = createEClass(QAMB_ARRIV);

		s_LowCostEClass = createEClass(SLOW_COST);

		q_MaxCostEClass = createEClass(QMAX_COST);

		s_UserFriendlyEClass = createEClass(SUSER_FRIENDLY);

		q_MaxTimeMsgEClass = createEClass(QMAX_TIME_MSG);

		ar1EClass = createEClass(AR1);

		ar2EClass = createEClass(AR2);

		ar3EClass = createEClass(AR3);

		ar4EClass = createEClass(AR4);

		ar5EClass = createEClass(AR5);

		ar6EClass = createEClass(AR6);

		ar7EClass = createEClass(AR7);

		ar8EClass = createEClass(AR8);

		ar9EClass = createEClass(AR9);

		ar10EClass = createEClass(AR10);

		ar11EClass = createEClass(AR11);

		ar12EClass = createEClass(AR12);

		ar13EClass = createEClass(AR13);

		ar14EClass = createEClass(AR14);

		ar15EClass = createEClass(AR15);

		acadGoalModelEClass = createEClass(ACAD_GOAL_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GorePackage theGorePackage = (GorePackage)EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI);
		EcaPackage theEcaPackage = (EcaPackage)EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI);

		// Add supertypes to classes
		g_GenDispatchEClass.getESuperTypes().add(theGorePackage.getGoal());
		g_CallTakingEClass.getESuperTypes().add(theGorePackage.getGoal());
		d_DataUpdEClass.getESuperTypes().add(theGorePackage.getDomainAssumption());
		g_ResourceIdEClass.getESuperTypes().add(theGorePackage.getGoal());
		g_ResourceMobEClass.getESuperTypes().add(theGorePackage.getGoal());
		g_ObtainMapEClass.getESuperTypes().add(theGorePackage.getGoal());
		g_IncidentUpdEClass.getESuperTypes().add(theGorePackage.getGoal());
		d_MaxCallsEClass.getESuperTypes().add(theGorePackage.getDomainAssumption());
		g_RegCallEClass.getESuperTypes().add(theGorePackage.getGoal());
		t_ConfirmCallEClass.getESuperTypes().add(theGorePackage.getTask());
		g_AssignIncidentEClass.getESuperTypes().add(theGorePackage.getGoal());
		t_SearchDuplicEClass.getESuperTypes().add(theGorePackage.getTask());
		t_CreateOrAssignEClass.getESuperTypes().add(theGorePackage.getTask());
		t_InputInfoEClass.getESuperTypes().add(theGorePackage.getTask());
		t_DetectLocEClass.getESuperTypes().add(theGorePackage.getTask());
		t_SpecConfigEClass.getESuperTypes().add(theGorePackage.getTask());
		t_ConfIncidentEClass.getESuperTypes().add(theGorePackage.getTask());
		t_DetBestAmbEClass.getESuperTypes().add(theGorePackage.getTask());
		t_InformStatEClass.getESuperTypes().add(theGorePackage.getTask());
		g_RouteAssistEClass.getESuperTypes().add(theGorePackage.getGoal());
		d_DriverKnowsEClass.getESuperTypes().add(theGorePackage.getDomainAssumption());
		t_AcadAssistsEClass.getESuperTypes().add(theGorePackage.getTask());
		t_StaffAssistsEClass.getESuperTypes().add(theGorePackage.getTask());
		t_FeedbackEClass.getESuperTypes().add(theGorePackage.getTask());
		d_GazetUpdEClass.getESuperTypes().add(theGorePackage.getDomainAssumption());
		g_ManualMapEClass.getESuperTypes().add(theGorePackage.getGoal());
		t_CheckGazetEClass.getESuperTypes().add(theGorePackage.getTask());
		t_CheckPaperEClass.getESuperTypes().add(theGorePackage.getTask());
		g_DispExceptEClass.getESuperTypes().add(theGorePackage.getGoal());
		g_MonitorResEClass.getESuperTypes().add(theGorePackage.getGoal());
		g_UpdPositionEClass.getESuperTypes().add(theGorePackage.getGoal());
		d_MDTPosEClass.getESuperTypes().add(theGorePackage.getDomainAssumption());
		t_RadioPosEClass.getESuperTypes().add(theGorePackage.getTask());
		d_MDTUseEClass.getESuperTypes().add(theGorePackage.getDomainAssumption());
		t_MonitorStatusEClass.getESuperTypes().add(theGorePackage.getTask());
		t_DispStatusEClass.getESuperTypes().add(theGorePackage.getTask());
		t_DispDepArrivEClass.getESuperTypes().add(theGorePackage.getTask());
		t_ReplAmbEClass.getESuperTypes().add(theGorePackage.getTask());
		t_ExceptEClass.getESuperTypes().add(theGorePackage.getTask());
		t_ExceptQueueEClass.getESuperTypes().add(theGorePackage.getTask());
		t_CloseIncidentEClass.getESuperTypes().add(theGorePackage.getTask());
		s_FastDispatchEClass.getESuperTypes().add(theGorePackage.getSoftgoal());
		q_DispatchEClass.getESuperTypes().add(theGorePackage.getQualityConstraint());
		s_FastAssistEClass.getESuperTypes().add(theGorePackage.getSoftgoal());
		q_IncidResolvEClass.getESuperTypes().add(theGorePackage.getQualityConstraint());
		s_FastArrivEClass.getESuperTypes().add(theGorePackage.getSoftgoal());
		q_AmbArrivEClass.getESuperTypes().add(theGorePackage.getQualityConstraint());
		s_LowCostEClass.getESuperTypes().add(theGorePackage.getSoftgoal());
		q_MaxCostEClass.getESuperTypes().add(theGorePackage.getQualityConstraint());
		s_UserFriendlyEClass.getESuperTypes().add(theGorePackage.getSoftgoal());
		q_MaxTimeMsgEClass.getESuperTypes().add(theGorePackage.getQualityConstraint());
		ar1EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar2EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar3EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar4EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar5EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar6EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar7EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar8EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar9EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar10EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar11EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar12EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar13EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar14EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		ar15EClass.getESuperTypes().add(theEcaPackage.getEcaAwReq());
		acadGoalModelEClass.getESuperTypes().add(theGorePackage.getGoalModel());

		// Initialize classes and features; add operations and parameters
		initEClass(g_GenDispatchEClass, G_GenDispatch.class, "G_GenDispatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_CallTakingEClass, G_CallTaking.class, "G_CallTaking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(d_DataUpdEClass, D_DataUpd.class, "D_DataUpd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_ResourceIdEClass, G_ResourceId.class, "G_ResourceId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_ResourceMobEClass, G_ResourceMob.class, "G_ResourceMob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_ObtainMapEClass, G_ObtainMap.class, "G_ObtainMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_IncidentUpdEClass, G_IncidentUpd.class, "G_IncidentUpd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(d_MaxCallsEClass, D_MaxCalls.class, "D_MaxCalls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_RegCallEClass, G_RegCall.class, "G_RegCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_ConfirmCallEClass, T_ConfirmCall.class, "T_ConfirmCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_AssignIncidentEClass, G_AssignIncident.class, "G_AssignIncident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_SearchDuplicEClass, T_SearchDuplic.class, "T_SearchDuplic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_CreateOrAssignEClass, T_CreateOrAssign.class, "T_CreateOrAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_InputInfoEClass, T_InputInfo.class, "T_InputInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_DetectLocEClass, T_DetectLoc.class, "T_DetectLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_SpecConfigEClass, T_SpecConfig.class, "T_SpecConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_ConfIncidentEClass, T_ConfIncident.class, "T_ConfIncident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_DetBestAmbEClass, T_DetBestAmb.class, "T_DetBestAmb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_InformStatEClass, T_InformStat.class, "T_InformStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_RouteAssistEClass, G_RouteAssist.class, "G_RouteAssist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(d_DriverKnowsEClass, D_DriverKnows.class, "D_DriverKnows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_AcadAssistsEClass, T_AcadAssists.class, "T_AcadAssists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_StaffAssistsEClass, T_StaffAssists.class, "T_StaffAssists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_FeedbackEClass, T_Feedback.class, "T_Feedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(d_GazetUpdEClass, D_GazetUpd.class, "D_GazetUpd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_ManualMapEClass, G_ManualMap.class, "G_ManualMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_CheckGazetEClass, T_CheckGazet.class, "T_CheckGazet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_CheckPaperEClass, T_CheckPaper.class, "T_CheckPaper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_DispExceptEClass, G_DispExcept.class, "G_DispExcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_MonitorResEClass, G_MonitorRes.class, "G_MonitorRes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(g_UpdPositionEClass, G_UpdPosition.class, "G_UpdPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(d_MDTPosEClass, D_MDTPos.class, "D_MDTPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_RadioPosEClass, T_RadioPos.class, "T_RadioPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(d_MDTUseEClass, D_MDTUse.class, "D_MDTUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_MonitorStatusEClass, T_MonitorStatus.class, "T_MonitorStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_DispStatusEClass, T_DispStatus.class, "T_DispStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_DispDepArrivEClass, T_DispDepArriv.class, "T_DispDepArriv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_ReplAmbEClass, T_ReplAmb.class, "T_ReplAmb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_ExceptEClass, T_Except.class, "T_Except", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_ExceptQueueEClass, T_ExceptQueue.class, "T_ExceptQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(t_CloseIncidentEClass, T_CloseIncident.class, "T_CloseIncident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(s_FastDispatchEClass, S_FastDispatch.class, "S_FastDispatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(q_DispatchEClass, Q_Dispatch.class, "Q_Dispatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(s_FastAssistEClass, S_FastAssist.class, "S_FastAssist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(q_IncidResolvEClass, Q_IncidResolv.class, "Q_IncidResolv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(s_FastArrivEClass, S_FastArriv.class, "S_FastArriv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(q_AmbArrivEClass, Q_AmbArriv.class, "Q_AmbArriv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(s_LowCostEClass, S_LowCost.class, "S_LowCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(q_MaxCostEClass, Q_MaxCost.class, "Q_MaxCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(s_UserFriendlyEClass, S_UserFriendly.class, "S_UserFriendly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(q_MaxTimeMsgEClass, Q_MaxTimeMsg.class, "Q_MaxTimeMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar1EClass, it.unitn.disi.zanshin.simulation.model.acad.AR1.class, "AR1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar2EClass, it.unitn.disi.zanshin.simulation.model.acad.AR2.class, "AR2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar3EClass, it.unitn.disi.zanshin.simulation.model.acad.AR3.class, "AR3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar4EClass, it.unitn.disi.zanshin.simulation.model.acad.AR4.class, "AR4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar5EClass, it.unitn.disi.zanshin.simulation.model.acad.AR5.class, "AR5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar6EClass, it.unitn.disi.zanshin.simulation.model.acad.AR6.class, "AR6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar7EClass, it.unitn.disi.zanshin.simulation.model.acad.AR7.class, "AR7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar8EClass, it.unitn.disi.zanshin.simulation.model.acad.AR8.class, "AR8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar9EClass, it.unitn.disi.zanshin.simulation.model.acad.AR9.class, "AR9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar10EClass, it.unitn.disi.zanshin.simulation.model.acad.AR10.class, "AR10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar11EClass, it.unitn.disi.zanshin.simulation.model.acad.AR11.class, "AR11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar12EClass, it.unitn.disi.zanshin.simulation.model.acad.AR12.class, "AR12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar13EClass, it.unitn.disi.zanshin.simulation.model.acad.AR13.class, "AR13", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar14EClass, it.unitn.disi.zanshin.simulation.model.acad.AR14.class, "AR14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ar15EClass, it.unitn.disi.zanshin.simulation.model.acad.AR15.class, "AR15", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(acadGoalModelEClass, AcadGoalModel.class, "AcadGoalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //AcadPackageImpl
