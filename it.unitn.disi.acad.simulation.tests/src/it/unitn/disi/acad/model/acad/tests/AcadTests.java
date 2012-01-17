/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.acad.model.acad.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>acad</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcadTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AcadTests("acad Tests");
		suite.addTestSuite(G_GenDispatchTest.class);
		suite.addTestSuite(G_CallTakingTest.class);
		suite.addTestSuite(D_DataUpdTest.class);
		suite.addTestSuite(G_ResourceIdTest.class);
		suite.addTestSuite(G_ResourceMobTest.class);
		suite.addTestSuite(G_ObtainMapTest.class);
		suite.addTestSuite(G_IncidentUpdTest.class);
		suite.addTestSuite(D_MaxCallsTest.class);
		suite.addTestSuite(G_RegCallTest.class);
		suite.addTestSuite(T_ConfirmCallTest.class);
		suite.addTestSuite(G_AssignIncidentTest.class);
		suite.addTestSuite(T_SearchDuplicTest.class);
		suite.addTestSuite(T_CreateOrAssignTest.class);
		suite.addTestSuite(T_InputInfoTest.class);
		suite.addTestSuite(T_DetectLocTest.class);
		suite.addTestSuite(T_SpecConfigTest.class);
		suite.addTestSuite(T_ConfIncidentTest.class);
		suite.addTestSuite(T_DetBestAmbTest.class);
		suite.addTestSuite(T_InformStatTest.class);
		suite.addTestSuite(G_RouteAssistTest.class);
		suite.addTestSuite(D_DriverKnowsTest.class);
		suite.addTestSuite(T_AcadAssistsTest.class);
		suite.addTestSuite(T_StaffAssistsTest.class);
		suite.addTestSuite(T_FeedbackTest.class);
		suite.addTestSuite(D_GazetUpdTest.class);
		suite.addTestSuite(G_ManualMapTest.class);
		suite.addTestSuite(T_CheckGazetTest.class);
		suite.addTestSuite(T_CheckPaperTest.class);
		suite.addTestSuite(G_DispExceptTest.class);
		suite.addTestSuite(G_MonitorResTest.class);
		suite.addTestSuite(G_UpdPositionTest.class);
		suite.addTestSuite(D_MDTPosTest.class);
		suite.addTestSuite(T_RadioPosTest.class);
		suite.addTestSuite(D_MDTUseTest.class);
		suite.addTestSuite(T_MonitorStatusTest.class);
		suite.addTestSuite(T_DispStatusTest.class);
		suite.addTestSuite(T_DispDepArrivTest.class);
		suite.addTestSuite(T_ReplAmbTest.class);
		suite.addTestSuite(T_ExceptTest.class);
		suite.addTestSuite(T_ExceptQueueTest.class);
		suite.addTestSuite(T_CloseIncidentTest.class);
		suite.addTestSuite(S_FastDispatchTest.class);
		suite.addTestSuite(Q_DispatchTest.class);
		suite.addTestSuite(S_FastAssistTest.class);
		suite.addTestSuite(Q_IncidResolvTest.class);
		suite.addTestSuite(S_FastArrivTest.class);
		suite.addTestSuite(Q_AmbArrivTest.class);
		suite.addTestSuite(S_LowCostTest.class);
		suite.addTestSuite(Q_MaxCostTest.class);
		suite.addTestSuite(S_UserFriendlyTest.class);
		suite.addTestSuite(Q_MaxTimeMsgTest.class);
		suite.addTestSuite(AR1Test.class);
		suite.addTestSuite(AR2Test.class);
		suite.addTestSuite(AR3Test.class);
		suite.addTestSuite(AR4Test.class);
		suite.addTestSuite(AR5Test.class);
		suite.addTestSuite(AR6Test.class);
		suite.addTestSuite(AR7Test.class);
		suite.addTestSuite(AR8Test.class);
		suite.addTestSuite(AR9Test.class);
		suite.addTestSuite(AR10Test.class);
		suite.addTestSuite(AR11Test.class);
		suite.addTestSuite(AR12Test.class);
		suite.addTestSuite(AR13Test.class);
		suite.addTestSuite(AR14Test.class);
		suite.addTestSuite(AR15Test.class);
		suite.addTestSuite(AcadGoalModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcadTests(String name) {
		super(name);
	}

} //AcadTests
