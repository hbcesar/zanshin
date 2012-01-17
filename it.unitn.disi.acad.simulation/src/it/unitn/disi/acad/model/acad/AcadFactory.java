/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.acad.model.acad;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.acad.model.acad.AcadPackage
 * @generated
 */
public interface AcadFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcadFactory eINSTANCE = it.unitn.disi.acad.model.acad.impl.AcadFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GGen Dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GGen Dispatch</em>'.
	 * @generated
	 */
	G_GenDispatch createG_GenDispatch();

	/**
	 * Returns a new object of class '<em>GCall Taking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GCall Taking</em>'.
	 * @generated
	 */
	G_CallTaking createG_CallTaking();

	/**
	 * Returns a new object of class '<em>DData Upd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DData Upd</em>'.
	 * @generated
	 */
	D_DataUpd createD_DataUpd();

	/**
	 * Returns a new object of class '<em>GResource Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GResource Id</em>'.
	 * @generated
	 */
	G_ResourceId createG_ResourceId();

	/**
	 * Returns a new object of class '<em>GResource Mob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GResource Mob</em>'.
	 * @generated
	 */
	G_ResourceMob createG_ResourceMob();

	/**
	 * Returns a new object of class '<em>GObtain Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GObtain Map</em>'.
	 * @generated
	 */
	G_ObtainMap createG_ObtainMap();

	/**
	 * Returns a new object of class '<em>GIncident Upd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GIncident Upd</em>'.
	 * @generated
	 */
	G_IncidentUpd createG_IncidentUpd();

	/**
	 * Returns a new object of class '<em>DMax Calls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMax Calls</em>'.
	 * @generated
	 */
	D_MaxCalls createD_MaxCalls();

	/**
	 * Returns a new object of class '<em>GReg Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GReg Call</em>'.
	 * @generated
	 */
	G_RegCall createG_RegCall();

	/**
	 * Returns a new object of class '<em>TConfirm Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConfirm Call</em>'.
	 * @generated
	 */
	T_ConfirmCall createT_ConfirmCall();

	/**
	 * Returns a new object of class '<em>GAssign Incident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAssign Incident</em>'.
	 * @generated
	 */
	G_AssignIncident createG_AssignIncident();

	/**
	 * Returns a new object of class '<em>TSearch Duplic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSearch Duplic</em>'.
	 * @generated
	 */
	T_SearchDuplic createT_SearchDuplic();

	/**
	 * Returns a new object of class '<em>TCreate Or Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCreate Or Assign</em>'.
	 * @generated
	 */
	T_CreateOrAssign createT_CreateOrAssign();

	/**
	 * Returns a new object of class '<em>TInput Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInput Info</em>'.
	 * @generated
	 */
	T_InputInfo createT_InputInfo();

	/**
	 * Returns a new object of class '<em>TDetect Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDetect Loc</em>'.
	 * @generated
	 */
	T_DetectLoc createT_DetectLoc();

	/**
	 * Returns a new object of class '<em>TSpec Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSpec Config</em>'.
	 * @generated
	 */
	T_SpecConfig createT_SpecConfig();

	/**
	 * Returns a new object of class '<em>TConf Incident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConf Incident</em>'.
	 * @generated
	 */
	T_ConfIncident createT_ConfIncident();

	/**
	 * Returns a new object of class '<em>TDet Best Amb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDet Best Amb</em>'.
	 * @generated
	 */
	T_DetBestAmb createT_DetBestAmb();

	/**
	 * Returns a new object of class '<em>TInform Stat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInform Stat</em>'.
	 * @generated
	 */
	T_InformStat createT_InformStat();

	/**
	 * Returns a new object of class '<em>GRoute Assist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GRoute Assist</em>'.
	 * @generated
	 */
	G_RouteAssist createG_RouteAssist();

	/**
	 * Returns a new object of class '<em>DDriver Knows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDriver Knows</em>'.
	 * @generated
	 */
	D_DriverKnows createD_DriverKnows();

	/**
	 * Returns a new object of class '<em>TAcad Assists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAcad Assists</em>'.
	 * @generated
	 */
	T_AcadAssists createT_AcadAssists();

	/**
	 * Returns a new object of class '<em>TStaff Assists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TStaff Assists</em>'.
	 * @generated
	 */
	T_StaffAssists createT_StaffAssists();

	/**
	 * Returns a new object of class '<em>TFeedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFeedback</em>'.
	 * @generated
	 */
	T_Feedback createT_Feedback();

	/**
	 * Returns a new object of class '<em>DGazet Upd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DGazet Upd</em>'.
	 * @generated
	 */
	D_GazetUpd createD_GazetUpd();

	/**
	 * Returns a new object of class '<em>GManual Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GManual Map</em>'.
	 * @generated
	 */
	G_ManualMap createG_ManualMap();

	/**
	 * Returns a new object of class '<em>TCheck Gazet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCheck Gazet</em>'.
	 * @generated
	 */
	T_CheckGazet createT_CheckGazet();

	/**
	 * Returns a new object of class '<em>TCheck Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCheck Paper</em>'.
	 * @generated
	 */
	T_CheckPaper createT_CheckPaper();

	/**
	 * Returns a new object of class '<em>GDisp Except</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GDisp Except</em>'.
	 * @generated
	 */
	G_DispExcept createG_DispExcept();

	/**
	 * Returns a new object of class '<em>GMonitor Res</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GMonitor Res</em>'.
	 * @generated
	 */
	G_MonitorRes createG_MonitorRes();

	/**
	 * Returns a new object of class '<em>GUpd Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUpd Position</em>'.
	 * @generated
	 */
	G_UpdPosition createG_UpdPosition();

	/**
	 * Returns a new object of class '<em>DMDT Pos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMDT Pos</em>'.
	 * @generated
	 */
	D_MDTPos createD_MDTPos();

	/**
	 * Returns a new object of class '<em>TRadio Pos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRadio Pos</em>'.
	 * @generated
	 */
	T_RadioPos createT_RadioPos();

	/**
	 * Returns a new object of class '<em>DMDT Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMDT Use</em>'.
	 * @generated
	 */
	D_MDTUse createD_MDTUse();

	/**
	 * Returns a new object of class '<em>TMonitor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMonitor Status</em>'.
	 * @generated
	 */
	T_MonitorStatus createT_MonitorStatus();

	/**
	 * Returns a new object of class '<em>TDisp Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDisp Status</em>'.
	 * @generated
	 */
	T_DispStatus createT_DispStatus();

	/**
	 * Returns a new object of class '<em>TDisp Dep Arriv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDisp Dep Arriv</em>'.
	 * @generated
	 */
	T_DispDepArriv createT_DispDepArriv();

	/**
	 * Returns a new object of class '<em>TRepl Amb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRepl Amb</em>'.
	 * @generated
	 */
	T_ReplAmb createT_ReplAmb();

	/**
	 * Returns a new object of class '<em>TExcept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExcept</em>'.
	 * @generated
	 */
	T_Except createT_Except();

	/**
	 * Returns a new object of class '<em>TExcept Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExcept Queue</em>'.
	 * @generated
	 */
	T_ExceptQueue createT_ExceptQueue();

	/**
	 * Returns a new object of class '<em>TClose Incident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClose Incident</em>'.
	 * @generated
	 */
	T_CloseIncident createT_CloseIncident();

	/**
	 * Returns a new object of class '<em>SFast Dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFast Dispatch</em>'.
	 * @generated
	 */
	S_FastDispatch createS_FastDispatch();

	/**
	 * Returns a new object of class '<em>QDispatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QDispatch</em>'.
	 * @generated
	 */
	Q_Dispatch createQ_Dispatch();

	/**
	 * Returns a new object of class '<em>SFast Assist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFast Assist</em>'.
	 * @generated
	 */
	S_FastAssist createS_FastAssist();

	/**
	 * Returns a new object of class '<em>QIncid Resolv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QIncid Resolv</em>'.
	 * @generated
	 */
	Q_IncidResolv createQ_IncidResolv();

	/**
	 * Returns a new object of class '<em>SFast Arriv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFast Arriv</em>'.
	 * @generated
	 */
	S_FastArriv createS_FastArriv();

	/**
	 * Returns a new object of class '<em>QAmb Arriv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QAmb Arriv</em>'.
	 * @generated
	 */
	Q_AmbArriv createQ_AmbArriv();

	/**
	 * Returns a new object of class '<em>SLow Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLow Cost</em>'.
	 * @generated
	 */
	S_LowCost createS_LowCost();

	/**
	 * Returns a new object of class '<em>QMax Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QMax Cost</em>'.
	 * @generated
	 */
	Q_MaxCost createQ_MaxCost();

	/**
	 * Returns a new object of class '<em>SUser Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SUser Friendly</em>'.
	 * @generated
	 */
	S_UserFriendly createS_UserFriendly();

	/**
	 * Returns a new object of class '<em>QMax Time Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QMax Time Msg</em>'.
	 * @generated
	 */
	Q_MaxTimeMsg createQ_MaxTimeMsg();

	/**
	 * Returns a new object of class '<em>AR1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR1</em>'.
	 * @generated
	 */
	AR1 createAR1();

	/**
	 * Returns a new object of class '<em>AR2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR2</em>'.
	 * @generated
	 */
	AR2 createAR2();

	/**
	 * Returns a new object of class '<em>AR3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR3</em>'.
	 * @generated
	 */
	AR3 createAR3();

	/**
	 * Returns a new object of class '<em>AR4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR4</em>'.
	 * @generated
	 */
	AR4 createAR4();

	/**
	 * Returns a new object of class '<em>AR5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR5</em>'.
	 * @generated
	 */
	AR5 createAR5();

	/**
	 * Returns a new object of class '<em>AR6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR6</em>'.
	 * @generated
	 */
	AR6 createAR6();

	/**
	 * Returns a new object of class '<em>AR7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR7</em>'.
	 * @generated
	 */
	AR7 createAR7();

	/**
	 * Returns a new object of class '<em>AR8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR8</em>'.
	 * @generated
	 */
	AR8 createAR8();

	/**
	 * Returns a new object of class '<em>AR9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR9</em>'.
	 * @generated
	 */
	AR9 createAR9();

	/**
	 * Returns a new object of class '<em>AR10</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR10</em>'.
	 * @generated
	 */
	AR10 createAR10();

	/**
	 * Returns a new object of class '<em>AR11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR11</em>'.
	 * @generated
	 */
	AR11 createAR11();

	/**
	 * Returns a new object of class '<em>AR12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR12</em>'.
	 * @generated
	 */
	AR12 createAR12();

	/**
	 * Returns a new object of class '<em>AR13</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR13</em>'.
	 * @generated
	 */
	AR13 createAR13();

	/**
	 * Returns a new object of class '<em>AR14</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR14</em>'.
	 * @generated
	 */
	AR14 createAR14();

	/**
	 * Returns a new object of class '<em>AR15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR15</em>'.
	 * @generated
	 */
	AR15 createAR15();

	/**
	 * Returns a new object of class '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Model</em>'.
	 * @generated
	 */
	AcadGoalModel createAcadGoalModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AcadPackage getAcadPackage();

} //AcadFactory
