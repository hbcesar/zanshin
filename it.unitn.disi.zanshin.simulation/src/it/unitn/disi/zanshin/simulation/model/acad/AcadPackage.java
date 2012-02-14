/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.simulation.model.acad;

import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.gore.GorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unitn.disi.zanshin.simulation.model.acad.AcadFactory
 * @model kind="package"
 * @generated
 */
public interface AcadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "acad"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://acad/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "acad"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcadPackage eINSTANCE = it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_GenDispatchImpl <em>GGen Dispatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_GenDispatchImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_GenDispatch()
	 * @generated
	 */
	int GGEN_DISPATCH = 0;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GGen Dispatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGEN_DISPATCH_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_CallTakingImpl <em>GCall Taking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_CallTakingImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_CallTaking()
	 * @generated
	 */
	int GCALL_TAKING = 1;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GCall Taking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCALL_TAKING_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_DataUpdImpl <em>DData Upd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_DataUpdImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_DataUpd()
	 * @generated
	 */
	int DDATA_UPD = 2;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATA_UPD__REFINEMENT_TYPE = GorePackage.DOMAIN_ASSUMPTION__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATA_UPD__CHILDREN = GorePackage.DOMAIN_ASSUMPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATA_UPD__PARENT = GorePackage.DOMAIN_ASSUMPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATA_UPD__TIME = GorePackage.DOMAIN_ASSUMPTION__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATA_UPD__STATE = GorePackage.DOMAIN_ASSUMPTION__STATE;

	/**
	 * The number of structural features of the '<em>DData Upd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATA_UPD_FEATURE_COUNT = GorePackage.DOMAIN_ASSUMPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceIdImpl <em>GResource Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceIdImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ResourceId()
	 * @generated
	 */
	int GRESOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GResource Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_ID_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceMobImpl <em>GResource Mob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceMobImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ResourceMob()
	 * @generated
	 */
	int GRESOURCE_MOB = 4;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GResource Mob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_MOB_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ObtainMapImpl <em>GObtain Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ObtainMapImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ObtainMap()
	 * @generated
	 */
	int GOBTAIN_MAP = 5;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GObtain Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBTAIN_MAP_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_IncidentUpdImpl <em>GIncident Upd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_IncidentUpdImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_IncidentUpd()
	 * @generated
	 */
	int GINCIDENT_UPD = 6;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GIncident Upd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINCIDENT_UPD_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_MaxCallsImpl <em>DMax Calls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_MaxCallsImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_MaxCalls()
	 * @generated
	 */
	int DMAX_CALLS = 7;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAX_CALLS__REFINEMENT_TYPE = GorePackage.DOMAIN_ASSUMPTION__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAX_CALLS__CHILDREN = GorePackage.DOMAIN_ASSUMPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAX_CALLS__PARENT = GorePackage.DOMAIN_ASSUMPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAX_CALLS__TIME = GorePackage.DOMAIN_ASSUMPTION__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAX_CALLS__STATE = GorePackage.DOMAIN_ASSUMPTION__STATE;

	/**
	 * The number of structural features of the '<em>DMax Calls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAX_CALLS_FEATURE_COUNT = GorePackage.DOMAIN_ASSUMPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_RegCallImpl <em>GReg Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_RegCallImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_RegCall()
	 * @generated
	 */
	int GREG_CALL = 8;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GReg Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREG_CALL_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfirmCallImpl <em>TConfirm Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfirmCallImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ConfirmCall()
	 * @generated
	 */
	int TCONFIRM_CALL = 9;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TConfirm Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONFIRM_CALL_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_AssignIncidentImpl <em>GAssign Incident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_AssignIncidentImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_AssignIncident()
	 * @generated
	 */
	int GASSIGN_INCIDENT = 10;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GAssign Incident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASSIGN_INCIDENT_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_SearchDuplicImpl <em>TSearch Duplic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_SearchDuplicImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_SearchDuplic()
	 * @generated
	 */
	int TSEARCH_DUPLIC = 11;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TSearch Duplic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEARCH_DUPLIC_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CreateOrAssignImpl <em>TCreate Or Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CreateOrAssignImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CreateOrAssign()
	 * @generated
	 */
	int TCREATE_OR_ASSIGN = 12;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TCreate Or Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_OR_ASSIGN_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_InputInfoImpl <em>TInput Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_InputInfoImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_InputInfo()
	 * @generated
	 */
	int TINPUT_INFO = 13;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TInput Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_INFO_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetectLocImpl <em>TDetect Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetectLocImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DetectLoc()
	 * @generated
	 */
	int TDETECT_LOC = 14;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TDetect Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETECT_LOC_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_SpecConfigImpl <em>TSpec Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_SpecConfigImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_SpecConfig()
	 * @generated
	 */
	int TSPEC_CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TSpec Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPEC_CONFIG_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfIncidentImpl <em>TConf Incident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfIncidentImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ConfIncident()
	 * @generated
	 */
	int TCONF_INCIDENT = 16;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TConf Incident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_INCIDENT_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetBestAmbImpl <em>TDet Best Amb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetBestAmbImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DetBestAmb()
	 * @generated
	 */
	int TDET_BEST_AMB = 17;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TDet Best Amb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDET_BEST_AMB_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_InformStatImpl <em>TInform Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_InformStatImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_InformStat()
	 * @generated
	 */
	int TINFORM_STAT = 18;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TInform Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORM_STAT_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_RouteAssistImpl <em>GRoute Assist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_RouteAssistImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_RouteAssist()
	 * @generated
	 */
	int GROUTE_ASSIST = 19;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GRoute Assist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUTE_ASSIST_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_DriverKnowsImpl <em>DDriver Knows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_DriverKnowsImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_DriverKnows()
	 * @generated
	 */
	int DDRIVER_KNOWS = 20;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDRIVER_KNOWS__REFINEMENT_TYPE = GorePackage.DOMAIN_ASSUMPTION__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDRIVER_KNOWS__CHILDREN = GorePackage.DOMAIN_ASSUMPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDRIVER_KNOWS__PARENT = GorePackage.DOMAIN_ASSUMPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDRIVER_KNOWS__TIME = GorePackage.DOMAIN_ASSUMPTION__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDRIVER_KNOWS__STATE = GorePackage.DOMAIN_ASSUMPTION__STATE;

	/**
	 * The number of structural features of the '<em>DDriver Knows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDRIVER_KNOWS_FEATURE_COUNT = GorePackage.DOMAIN_ASSUMPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_AcadAssistsImpl <em>TAcad Assists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_AcadAssistsImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_AcadAssists()
	 * @generated
	 */
	int TACAD_ASSISTS = 21;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TAcad Assists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACAD_ASSISTS_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_StaffAssistsImpl <em>TStaff Assists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_StaffAssistsImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_StaffAssists()
	 * @generated
	 */
	int TSTAFF_ASSISTS = 22;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TStaff Assists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAFF_ASSISTS_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_FeedbackImpl <em>TFeedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_FeedbackImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_Feedback()
	 * @generated
	 */
	int TFEEDBACK = 23;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TFeedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEEDBACK_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_GazetUpdImpl <em>DGazet Upd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_GazetUpdImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_GazetUpd()
	 * @generated
	 */
	int DGAZET_UPD = 24;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DGAZET_UPD__REFINEMENT_TYPE = GorePackage.DOMAIN_ASSUMPTION__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DGAZET_UPD__CHILDREN = GorePackage.DOMAIN_ASSUMPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DGAZET_UPD__PARENT = GorePackage.DOMAIN_ASSUMPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DGAZET_UPD__TIME = GorePackage.DOMAIN_ASSUMPTION__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DGAZET_UPD__STATE = GorePackage.DOMAIN_ASSUMPTION__STATE;

	/**
	 * The number of structural features of the '<em>DGazet Upd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DGAZET_UPD_FEATURE_COUNT = GorePackage.DOMAIN_ASSUMPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ManualMapImpl <em>GManual Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ManualMapImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ManualMap()
	 * @generated
	 */
	int GMANUAL_MAP = 25;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GManual Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMANUAL_MAP_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckGazetImpl <em>TCheck Gazet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckGazetImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CheckGazet()
	 * @generated
	 */
	int TCHECK_GAZET = 26;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TCheck Gazet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_GAZET_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckPaperImpl <em>TCheck Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckPaperImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CheckPaper()
	 * @generated
	 */
	int TCHECK_PAPER = 27;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TCheck Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHECK_PAPER_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_DispExceptImpl <em>GDisp Except</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_DispExceptImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_DispExcept()
	 * @generated
	 */
	int GDISP_EXCEPT = 28;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GDisp Except</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDISP_EXCEPT_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_MonitorResImpl <em>GMonitor Res</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_MonitorResImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_MonitorRes()
	 * @generated
	 */
	int GMONITOR_RES = 29;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GMonitor Res</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMONITOR_RES_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_UpdPositionImpl <em>GUpd Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_UpdPositionImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_UpdPosition()
	 * @generated
	 */
	int GUPD_POSITION = 30;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__REFINEMENT_TYPE = GorePackage.GOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__CHILDREN = GorePackage.GOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__PARENT = GorePackage.GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__TIME = GorePackage.GOAL__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__STATE = GorePackage.GOAL__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__START_TIME = GorePackage.GOAL__START_TIME;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION__GOAL_MODEL = GorePackage.GOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>GUpd Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUPD_POSITION_FEATURE_COUNT = GorePackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTPosImpl <em>DMDT Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTPosImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_MDTPos()
	 * @generated
	 */
	int DMDT_POS = 31;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_POS__REFINEMENT_TYPE = GorePackage.DOMAIN_ASSUMPTION__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_POS__CHILDREN = GorePackage.DOMAIN_ASSUMPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_POS__PARENT = GorePackage.DOMAIN_ASSUMPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_POS__TIME = GorePackage.DOMAIN_ASSUMPTION__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_POS__STATE = GorePackage.DOMAIN_ASSUMPTION__STATE;

	/**
	 * The number of structural features of the '<em>DMDT Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_POS_FEATURE_COUNT = GorePackage.DOMAIN_ASSUMPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_RadioPosImpl <em>TRadio Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_RadioPosImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_RadioPos()
	 * @generated
	 */
	int TRADIO_POS = 32;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TRadio Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADIO_POS_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTUseImpl <em>DMDT Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTUseImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_MDTUse()
	 * @generated
	 */
	int DMDT_USE = 33;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_USE__REFINEMENT_TYPE = GorePackage.DOMAIN_ASSUMPTION__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_USE__CHILDREN = GorePackage.DOMAIN_ASSUMPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_USE__PARENT = GorePackage.DOMAIN_ASSUMPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_USE__TIME = GorePackage.DOMAIN_ASSUMPTION__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_USE__STATE = GorePackage.DOMAIN_ASSUMPTION__STATE;

	/**
	 * The number of structural features of the '<em>DMDT Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMDT_USE_FEATURE_COUNT = GorePackage.DOMAIN_ASSUMPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_MonitorStatusImpl <em>TMonitor Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_MonitorStatusImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_MonitorStatus()
	 * @generated
	 */
	int TMONITOR_STATUS = 34;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TMonitor Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITOR_STATUS_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispStatusImpl <em>TDisp Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispStatusImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DispStatus()
	 * @generated
	 */
	int TDISP_STATUS = 35;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TDisp Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_STATUS_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispDepArrivImpl <em>TDisp Dep Arriv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispDepArrivImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DispDepArriv()
	 * @generated
	 */
	int TDISP_DEP_ARRIV = 36;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TDisp Dep Arriv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISP_DEP_ARRIV_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ReplAmbImpl <em>TRepl Amb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ReplAmbImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ReplAmb()
	 * @generated
	 */
	int TREPL_AMB = 37;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TRepl Amb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPL_AMB_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptImpl <em>TExcept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_Except()
	 * @generated
	 */
	int TEXCEPT = 38;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TExcept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptQueueImpl <em>TExcept Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptQueueImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ExceptQueue()
	 * @generated
	 */
	int TEXCEPT_QUEUE = 39;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TExcept Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCEPT_QUEUE_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CloseIncidentImpl <em>TClose Incident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CloseIncidentImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CloseIncident()
	 * @generated
	 */
	int TCLOSE_INCIDENT = 40;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT__REFINEMENT_TYPE = GorePackage.TASK__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT__CHILDREN = GorePackage.TASK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT__PARENT = GorePackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT__TIME = GorePackage.TASK__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT__STATE = GorePackage.TASK__STATE;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT__START_TIME = GorePackage.TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>TClose Incident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLOSE_INCIDENT_FEATURE_COUNT = GorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastDispatchImpl <em>SFast Dispatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastDispatchImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_FastDispatch()
	 * @generated
	 */
	int SFAST_DISPATCH = 41;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_DISPATCH__REFINEMENT_TYPE = GorePackage.SOFTGOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_DISPATCH__CHILDREN = GorePackage.SOFTGOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_DISPATCH__PARENT = GorePackage.SOFTGOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_DISPATCH__CONSTRAINTS = GorePackage.SOFTGOAL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_DISPATCH__GOAL_MODEL = GorePackage.SOFTGOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>SFast Dispatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_DISPATCH_FEATURE_COUNT = GorePackage.SOFTGOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_DispatchImpl <em>QDispatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_DispatchImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_Dispatch()
	 * @generated
	 */
	int QDISPATCH = 42;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH__REFINEMENT_TYPE = GorePackage.QUALITY_CONSTRAINT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH__CHILDREN = GorePackage.QUALITY_CONSTRAINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH__PARENT = GorePackage.QUALITY_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH__TIME = GorePackage.QUALITY_CONSTRAINT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH__STATE = GorePackage.QUALITY_CONSTRAINT__STATE;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH__SOFTGOAL = GorePackage.QUALITY_CONSTRAINT__SOFTGOAL;

	/**
	 * The number of structural features of the '<em>QDispatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QDISPATCH_FEATURE_COUNT = GorePackage.QUALITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastAssistImpl <em>SFast Assist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastAssistImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_FastAssist()
	 * @generated
	 */
	int SFAST_ASSIST = 43;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ASSIST__REFINEMENT_TYPE = GorePackage.SOFTGOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ASSIST__CHILDREN = GorePackage.SOFTGOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ASSIST__PARENT = GorePackage.SOFTGOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ASSIST__CONSTRAINTS = GorePackage.SOFTGOAL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ASSIST__GOAL_MODEL = GorePackage.SOFTGOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>SFast Assist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ASSIST_FEATURE_COUNT = GorePackage.SOFTGOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_IncidResolvImpl <em>QIncid Resolv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_IncidResolvImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_IncidResolv()
	 * @generated
	 */
	int QINCID_RESOLV = 44;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV__REFINEMENT_TYPE = GorePackage.QUALITY_CONSTRAINT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV__CHILDREN = GorePackage.QUALITY_CONSTRAINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV__PARENT = GorePackage.QUALITY_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV__TIME = GorePackage.QUALITY_CONSTRAINT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV__STATE = GorePackage.QUALITY_CONSTRAINT__STATE;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV__SOFTGOAL = GorePackage.QUALITY_CONSTRAINT__SOFTGOAL;

	/**
	 * The number of structural features of the '<em>QIncid Resolv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QINCID_RESOLV_FEATURE_COUNT = GorePackage.QUALITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastArrivImpl <em>SFast Arriv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastArrivImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_FastArriv()
	 * @generated
	 */
	int SFAST_ARRIV = 45;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ARRIV__REFINEMENT_TYPE = GorePackage.SOFTGOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ARRIV__CHILDREN = GorePackage.SOFTGOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ARRIV__PARENT = GorePackage.SOFTGOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ARRIV__CONSTRAINTS = GorePackage.SOFTGOAL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ARRIV__GOAL_MODEL = GorePackage.SOFTGOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>SFast Arriv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFAST_ARRIV_FEATURE_COUNT = GorePackage.SOFTGOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_AmbArrivImpl <em>QAmb Arriv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_AmbArrivImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_AmbArriv()
	 * @generated
	 */
	int QAMB_ARRIV = 46;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV__REFINEMENT_TYPE = GorePackage.QUALITY_CONSTRAINT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV__CHILDREN = GorePackage.QUALITY_CONSTRAINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV__PARENT = GorePackage.QUALITY_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV__TIME = GorePackage.QUALITY_CONSTRAINT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV__STATE = GorePackage.QUALITY_CONSTRAINT__STATE;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV__SOFTGOAL = GorePackage.QUALITY_CONSTRAINT__SOFTGOAL;

	/**
	 * The number of structural features of the '<em>QAmb Arriv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAMB_ARRIV_FEATURE_COUNT = GorePackage.QUALITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_LowCostImpl <em>SLow Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_LowCostImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_LowCost()
	 * @generated
	 */
	int SLOW_COST = 47;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COST__REFINEMENT_TYPE = GorePackage.SOFTGOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COST__CHILDREN = GorePackage.SOFTGOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COST__PARENT = GorePackage.SOFTGOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COST__CONSTRAINTS = GorePackage.SOFTGOAL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COST__GOAL_MODEL = GorePackage.SOFTGOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>SLow Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COST_FEATURE_COUNT = GorePackage.SOFTGOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxCostImpl <em>QMax Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxCostImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_MaxCost()
	 * @generated
	 */
	int QMAX_COST = 48;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST__REFINEMENT_TYPE = GorePackage.QUALITY_CONSTRAINT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST__CHILDREN = GorePackage.QUALITY_CONSTRAINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST__PARENT = GorePackage.QUALITY_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST__TIME = GorePackage.QUALITY_CONSTRAINT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST__STATE = GorePackage.QUALITY_CONSTRAINT__STATE;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST__SOFTGOAL = GorePackage.QUALITY_CONSTRAINT__SOFTGOAL;

	/**
	 * The number of structural features of the '<em>QMax Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_COST_FEATURE_COUNT = GorePackage.QUALITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_UserFriendlyImpl <em>SUser Friendly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_UserFriendlyImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_UserFriendly()
	 * @generated
	 */
	int SUSER_FRIENDLY = 49;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSER_FRIENDLY__REFINEMENT_TYPE = GorePackage.SOFTGOAL__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSER_FRIENDLY__CHILDREN = GorePackage.SOFTGOAL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSER_FRIENDLY__PARENT = GorePackage.SOFTGOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSER_FRIENDLY__CONSTRAINTS = GorePackage.SOFTGOAL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSER_FRIENDLY__GOAL_MODEL = GorePackage.SOFTGOAL__GOAL_MODEL;

	/**
	 * The number of structural features of the '<em>SUser Friendly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSER_FRIENDLY_FEATURE_COUNT = GorePackage.SOFTGOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxTimeMsgImpl <em>QMax Time Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxTimeMsgImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_MaxTimeMsg()
	 * @generated
	 */
	int QMAX_TIME_MSG = 50;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG__REFINEMENT_TYPE = GorePackage.QUALITY_CONSTRAINT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG__CHILDREN = GorePackage.QUALITY_CONSTRAINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG__PARENT = GorePackage.QUALITY_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG__TIME = GorePackage.QUALITY_CONSTRAINT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG__STATE = GorePackage.QUALITY_CONSTRAINT__STATE;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG__SOFTGOAL = GorePackage.QUALITY_CONSTRAINT__SOFTGOAL;

	/**
	 * The number of structural features of the '<em>QMax Time Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMAX_TIME_MSG_FEATURE_COUNT = GorePackage.QUALITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR1Impl <em>AR1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR1Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR1()
	 * @generated
	 */
	int AR1 = 51;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR1_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR2Impl <em>AR2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR2Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR2()
	 * @generated
	 */
	int AR2 = 52;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR2_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR3Impl <em>AR3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR3Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR3()
	 * @generated
	 */
	int AR3 = 53;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR3_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR4Impl <em>AR4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR4Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR4()
	 * @generated
	 */
	int AR4 = 54;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR4_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR5Impl <em>AR5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR5Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR5()
	 * @generated
	 */
	int AR5 = 55;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR5_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR6Impl <em>AR6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR6Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR6()
	 * @generated
	 */
	int AR6 = 56;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR6_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR7Impl <em>AR7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR7Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR7()
	 * @generated
	 */
	int AR7 = 57;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR7_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR8Impl <em>AR8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR8Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR8()
	 * @generated
	 */
	int AR8 = 58;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR8_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR9Impl <em>AR9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR9Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR9()
	 * @generated
	 */
	int AR9 = 59;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR9_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR10Impl <em>AR10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR10Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR10()
	 * @generated
	 */
	int AR10 = 60;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR10_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR11Impl <em>AR11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR11Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR11()
	 * @generated
	 */
	int AR11 = 61;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR11_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR12Impl <em>AR12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR12Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR12()
	 * @generated
	 */
	int AR12 = 62;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR12_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR13Impl <em>AR13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR13Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR13()
	 * @generated
	 */
	int AR13 = 63;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR13_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR14Impl <em>AR14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR14Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR14()
	 * @generated
	 */
	int AR14 = 64;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR14_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR15Impl <em>AR15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR15Impl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR15()
	 * @generated
	 */
	int AR15 = 65;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__REFINEMENT_TYPE = EcaPackage.ECA_AW_REQ__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__CHILDREN = EcaPackage.ECA_AW_REQ__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__PARENT = EcaPackage.ECA_AW_REQ__PARENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__TIME = EcaPackage.ECA_AW_REQ__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__STATE = EcaPackage.ECA_AW_REQ__STATE;

	/**
	 * The feature id for the '<em><b>Other Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__OTHER_TARGETS = EcaPackage.ECA_AW_REQ__OTHER_TARGETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__TARGET = EcaPackage.ECA_AW_REQ__TARGET;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__GOAL_MODEL = EcaPackage.ECA_AW_REQ__GOAL_MODEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__CONDITION = EcaPackage.ECA_AW_REQ__CONDITION;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__STRATEGIES = EcaPackage.ECA_AW_REQ__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Selected Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15__SELECTED_STRATEGY = EcaPackage.ECA_AW_REQ__SELECTED_STRATEGY;

	/**
	 * The number of structural features of the '<em>AR15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR15_FEATURE_COUNT = EcaPackage.ECA_AW_REQ_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AcadGoalModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadGoalModelImpl
	 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAcadGoalModel()
	 * @generated
	 */
	int ACAD_GOAL_MODEL = 66;

	/**
	 * The feature id for the '<em><b>Root Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL__ROOT_GOAL = GorePackage.GOAL_MODEL__ROOT_GOAL;

	/**
	 * The feature id for the '<em><b>Softgoals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL__SOFTGOALS = GorePackage.GOAL_MODEL__SOFTGOALS;

	/**
	 * The feature id for the '<em><b>Aw Reqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL__AW_REQS = GorePackage.GOAL_MODEL__AW_REQS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL__ACTORS = GorePackage.GOAL_MODEL__ACTORS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL__PARAMETERS = GorePackage.GOAL_MODEL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL__INTERNAL_ID = GorePackage.GOAL_MODEL__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAD_GOAL_MODEL_FEATURE_COUNT = GorePackage.GOAL_MODEL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_GenDispatch <em>GGen Dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GGen Dispatch</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_GenDispatch
	 * @generated
	 */
	EClass getG_GenDispatch();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_CallTaking <em>GCall Taking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCall Taking</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_CallTaking
	 * @generated
	 */
	EClass getG_CallTaking();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_DataUpd <em>DData Upd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DData Upd</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_DataUpd
	 * @generated
	 */
	EClass getD_DataUpd();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ResourceId <em>GResource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GResource Id</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ResourceId
	 * @generated
	 */
	EClass getG_ResourceId();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ResourceMob <em>GResource Mob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GResource Mob</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ResourceMob
	 * @generated
	 */
	EClass getG_ResourceMob();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ObtainMap <em>GObtain Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObtain Map</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ObtainMap
	 * @generated
	 */
	EClass getG_ObtainMap();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_IncidentUpd <em>GIncident Upd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GIncident Upd</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_IncidentUpd
	 * @generated
	 */
	EClass getG_IncidentUpd();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_MaxCalls <em>DMax Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMax Calls</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_MaxCalls
	 * @generated
	 */
	EClass getD_MaxCalls();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_RegCall <em>GReg Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GReg Call</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_RegCall
	 * @generated
	 */
	EClass getG_RegCall();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ConfirmCall <em>TConfirm Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConfirm Call</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ConfirmCall
	 * @generated
	 */
	EClass getT_ConfirmCall();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_AssignIncident <em>GAssign Incident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAssign Incident</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_AssignIncident
	 * @generated
	 */
	EClass getG_AssignIncident();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_SearchDuplic <em>TSearch Duplic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSearch Duplic</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_SearchDuplic
	 * @generated
	 */
	EClass getT_SearchDuplic();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CreateOrAssign <em>TCreate Or Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCreate Or Assign</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CreateOrAssign
	 * @generated
	 */
	EClass getT_CreateOrAssign();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_InputInfo <em>TInput Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Info</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_InputInfo
	 * @generated
	 */
	EClass getT_InputInfo();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DetectLoc <em>TDetect Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDetect Loc</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DetectLoc
	 * @generated
	 */
	EClass getT_DetectLoc();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_SpecConfig <em>TSpec Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSpec Config</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_SpecConfig
	 * @generated
	 */
	EClass getT_SpecConfig();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ConfIncident <em>TConf Incident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConf Incident</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ConfIncident
	 * @generated
	 */
	EClass getT_ConfIncident();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DetBestAmb <em>TDet Best Amb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDet Best Amb</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DetBestAmb
	 * @generated
	 */
	EClass getT_DetBestAmb();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_InformStat <em>TInform Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInform Stat</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_InformStat
	 * @generated
	 */
	EClass getT_InformStat();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_RouteAssist <em>GRoute Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRoute Assist</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_RouteAssist
	 * @generated
	 */
	EClass getG_RouteAssist();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_DriverKnows <em>DDriver Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDriver Knows</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_DriverKnows
	 * @generated
	 */
	EClass getD_DriverKnows();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_AcadAssists <em>TAcad Assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAcad Assists</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_AcadAssists
	 * @generated
	 */
	EClass getT_AcadAssists();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_StaffAssists <em>TStaff Assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TStaff Assists</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_StaffAssists
	 * @generated
	 */
	EClass getT_StaffAssists();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_Feedback <em>TFeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFeedback</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_Feedback
	 * @generated
	 */
	EClass getT_Feedback();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_GazetUpd <em>DGazet Upd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DGazet Upd</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_GazetUpd
	 * @generated
	 */
	EClass getD_GazetUpd();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_ManualMap <em>GManual Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GManual Map</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_ManualMap
	 * @generated
	 */
	EClass getG_ManualMap();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CheckGazet <em>TCheck Gazet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCheck Gazet</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CheckGazet
	 * @generated
	 */
	EClass getT_CheckGazet();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CheckPaper <em>TCheck Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCheck Paper</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CheckPaper
	 * @generated
	 */
	EClass getT_CheckPaper();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_DispExcept <em>GDisp Except</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GDisp Except</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_DispExcept
	 * @generated
	 */
	EClass getG_DispExcept();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_MonitorRes <em>GMonitor Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GMonitor Res</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_MonitorRes
	 * @generated
	 */
	EClass getG_MonitorRes();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.G_UpdPosition <em>GUpd Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUpd Position</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.G_UpdPosition
	 * @generated
	 */
	EClass getG_UpdPosition();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_MDTPos <em>DMDT Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMDT Pos</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_MDTPos
	 * @generated
	 */
	EClass getD_MDTPos();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_RadioPos <em>TRadio Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRadio Pos</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_RadioPos
	 * @generated
	 */
	EClass getT_RadioPos();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.D_MDTUse <em>DMDT Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMDT Use</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.D_MDTUse
	 * @generated
	 */
	EClass getD_MDTUse();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_MonitorStatus <em>TMonitor Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMonitor Status</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_MonitorStatus
	 * @generated
	 */
	EClass getT_MonitorStatus();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DispStatus <em>TDisp Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDisp Status</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DispStatus
	 * @generated
	 */
	EClass getT_DispStatus();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_DispDepArriv <em>TDisp Dep Arriv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDisp Dep Arriv</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_DispDepArriv
	 * @generated
	 */
	EClass getT_DispDepArriv();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ReplAmb <em>TRepl Amb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRepl Amb</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ReplAmb
	 * @generated
	 */
	EClass getT_ReplAmb();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_Except <em>TExcept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExcept</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_Except
	 * @generated
	 */
	EClass getT_Except();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_ExceptQueue <em>TExcept Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExcept Queue</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_ExceptQueue
	 * @generated
	 */
	EClass getT_ExceptQueue();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.T_CloseIncident <em>TClose Incident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClose Incident</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.T_CloseIncident
	 * @generated
	 */
	EClass getT_CloseIncident();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_FastDispatch <em>SFast Dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFast Dispatch</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_FastDispatch
	 * @generated
	 */
	EClass getS_FastDispatch();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_Dispatch <em>QDispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QDispatch</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_Dispatch
	 * @generated
	 */
	EClass getQ_Dispatch();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_FastAssist <em>SFast Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFast Assist</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_FastAssist
	 * @generated
	 */
	EClass getS_FastAssist();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_IncidResolv <em>QIncid Resolv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QIncid Resolv</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_IncidResolv
	 * @generated
	 */
	EClass getQ_IncidResolv();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_FastArriv <em>SFast Arriv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFast Arriv</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_FastArriv
	 * @generated
	 */
	EClass getS_FastArriv();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_AmbArriv <em>QAmb Arriv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QAmb Arriv</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_AmbArriv
	 * @generated
	 */
	EClass getQ_AmbArriv();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_LowCost <em>SLow Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLow Cost</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_LowCost
	 * @generated
	 */
	EClass getS_LowCost();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_MaxCost <em>QMax Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QMax Cost</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_MaxCost
	 * @generated
	 */
	EClass getQ_MaxCost();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.S_UserFriendly <em>SUser Friendly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUser Friendly</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.S_UserFriendly
	 * @generated
	 */
	EClass getS_UserFriendly();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.Q_MaxTimeMsg <em>QMax Time Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QMax Time Msg</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.Q_MaxTimeMsg
	 * @generated
	 */
	EClass getQ_MaxTimeMsg();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR1 <em>AR1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR1</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR1
	 * @generated
	 */
	EClass getAR1();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR2 <em>AR2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR2</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR2
	 * @generated
	 */
	EClass getAR2();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR3 <em>AR3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR3</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR3
	 * @generated
	 */
	EClass getAR3();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR4 <em>AR4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR4</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR4
	 * @generated
	 */
	EClass getAR4();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR5 <em>AR5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR5</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR5
	 * @generated
	 */
	EClass getAR5();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR6 <em>AR6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR6</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR6
	 * @generated
	 */
	EClass getAR6();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR7 <em>AR7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR7</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR7
	 * @generated
	 */
	EClass getAR7();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR8 <em>AR8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR8</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR8
	 * @generated
	 */
	EClass getAR8();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR9 <em>AR9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR9</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR9
	 * @generated
	 */
	EClass getAR9();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR10 <em>AR10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR10</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR10
	 * @generated
	 */
	EClass getAR10();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR11 <em>AR11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR11</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR11
	 * @generated
	 */
	EClass getAR11();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR12 <em>AR12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR12</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR12
	 * @generated
	 */
	EClass getAR12();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR13 <em>AR13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR13</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR13
	 * @generated
	 */
	EClass getAR13();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR14 <em>AR14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR14</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR14
	 * @generated
	 */
	EClass getAR14();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AR15 <em>AR15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR15</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AR15
	 * @generated
	 */
	EClass getAR15();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see it.unitn.disi.zanshin.simulation.model.acad.AcadGoalModel
	 * @generated
	 */
	EClass getAcadGoalModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AcadFactory getAcadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_GenDispatchImpl <em>GGen Dispatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_GenDispatchImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_GenDispatch()
		 * @generated
		 */
		EClass GGEN_DISPATCH = eINSTANCE.getG_GenDispatch();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_CallTakingImpl <em>GCall Taking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_CallTakingImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_CallTaking()
		 * @generated
		 */
		EClass GCALL_TAKING = eINSTANCE.getG_CallTaking();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_DataUpdImpl <em>DData Upd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_DataUpdImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_DataUpd()
		 * @generated
		 */
		EClass DDATA_UPD = eINSTANCE.getD_DataUpd();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceIdImpl <em>GResource Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceIdImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ResourceId()
		 * @generated
		 */
		EClass GRESOURCE_ID = eINSTANCE.getG_ResourceId();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceMobImpl <em>GResource Mob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ResourceMobImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ResourceMob()
		 * @generated
		 */
		EClass GRESOURCE_MOB = eINSTANCE.getG_ResourceMob();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ObtainMapImpl <em>GObtain Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ObtainMapImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ObtainMap()
		 * @generated
		 */
		EClass GOBTAIN_MAP = eINSTANCE.getG_ObtainMap();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_IncidentUpdImpl <em>GIncident Upd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_IncidentUpdImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_IncidentUpd()
		 * @generated
		 */
		EClass GINCIDENT_UPD = eINSTANCE.getG_IncidentUpd();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_MaxCallsImpl <em>DMax Calls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_MaxCallsImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_MaxCalls()
		 * @generated
		 */
		EClass DMAX_CALLS = eINSTANCE.getD_MaxCalls();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_RegCallImpl <em>GReg Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_RegCallImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_RegCall()
		 * @generated
		 */
		EClass GREG_CALL = eINSTANCE.getG_RegCall();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfirmCallImpl <em>TConfirm Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfirmCallImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ConfirmCall()
		 * @generated
		 */
		EClass TCONFIRM_CALL = eINSTANCE.getT_ConfirmCall();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_AssignIncidentImpl <em>GAssign Incident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_AssignIncidentImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_AssignIncident()
		 * @generated
		 */
		EClass GASSIGN_INCIDENT = eINSTANCE.getG_AssignIncident();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_SearchDuplicImpl <em>TSearch Duplic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_SearchDuplicImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_SearchDuplic()
		 * @generated
		 */
		EClass TSEARCH_DUPLIC = eINSTANCE.getT_SearchDuplic();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CreateOrAssignImpl <em>TCreate Or Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CreateOrAssignImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CreateOrAssign()
		 * @generated
		 */
		EClass TCREATE_OR_ASSIGN = eINSTANCE.getT_CreateOrAssign();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_InputInfoImpl <em>TInput Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_InputInfoImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_InputInfo()
		 * @generated
		 */
		EClass TINPUT_INFO = eINSTANCE.getT_InputInfo();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetectLocImpl <em>TDetect Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetectLocImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DetectLoc()
		 * @generated
		 */
		EClass TDETECT_LOC = eINSTANCE.getT_DetectLoc();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_SpecConfigImpl <em>TSpec Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_SpecConfigImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_SpecConfig()
		 * @generated
		 */
		EClass TSPEC_CONFIG = eINSTANCE.getT_SpecConfig();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfIncidentImpl <em>TConf Incident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ConfIncidentImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ConfIncident()
		 * @generated
		 */
		EClass TCONF_INCIDENT = eINSTANCE.getT_ConfIncident();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetBestAmbImpl <em>TDet Best Amb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DetBestAmbImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DetBestAmb()
		 * @generated
		 */
		EClass TDET_BEST_AMB = eINSTANCE.getT_DetBestAmb();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_InformStatImpl <em>TInform Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_InformStatImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_InformStat()
		 * @generated
		 */
		EClass TINFORM_STAT = eINSTANCE.getT_InformStat();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_RouteAssistImpl <em>GRoute Assist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_RouteAssistImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_RouteAssist()
		 * @generated
		 */
		EClass GROUTE_ASSIST = eINSTANCE.getG_RouteAssist();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_DriverKnowsImpl <em>DDriver Knows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_DriverKnowsImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_DriverKnows()
		 * @generated
		 */
		EClass DDRIVER_KNOWS = eINSTANCE.getD_DriverKnows();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_AcadAssistsImpl <em>TAcad Assists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_AcadAssistsImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_AcadAssists()
		 * @generated
		 */
		EClass TACAD_ASSISTS = eINSTANCE.getT_AcadAssists();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_StaffAssistsImpl <em>TStaff Assists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_StaffAssistsImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_StaffAssists()
		 * @generated
		 */
		EClass TSTAFF_ASSISTS = eINSTANCE.getT_StaffAssists();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_FeedbackImpl <em>TFeedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_FeedbackImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_Feedback()
		 * @generated
		 */
		EClass TFEEDBACK = eINSTANCE.getT_Feedback();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_GazetUpdImpl <em>DGazet Upd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_GazetUpdImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_GazetUpd()
		 * @generated
		 */
		EClass DGAZET_UPD = eINSTANCE.getD_GazetUpd();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_ManualMapImpl <em>GManual Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_ManualMapImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_ManualMap()
		 * @generated
		 */
		EClass GMANUAL_MAP = eINSTANCE.getG_ManualMap();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckGazetImpl <em>TCheck Gazet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckGazetImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CheckGazet()
		 * @generated
		 */
		EClass TCHECK_GAZET = eINSTANCE.getT_CheckGazet();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckPaperImpl <em>TCheck Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CheckPaperImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CheckPaper()
		 * @generated
		 */
		EClass TCHECK_PAPER = eINSTANCE.getT_CheckPaper();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_DispExceptImpl <em>GDisp Except</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_DispExceptImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_DispExcept()
		 * @generated
		 */
		EClass GDISP_EXCEPT = eINSTANCE.getG_DispExcept();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_MonitorResImpl <em>GMonitor Res</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_MonitorResImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_MonitorRes()
		 * @generated
		 */
		EClass GMONITOR_RES = eINSTANCE.getG_MonitorRes();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.G_UpdPositionImpl <em>GUpd Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.G_UpdPositionImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getG_UpdPosition()
		 * @generated
		 */
		EClass GUPD_POSITION = eINSTANCE.getG_UpdPosition();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTPosImpl <em>DMDT Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTPosImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_MDTPos()
		 * @generated
		 */
		EClass DMDT_POS = eINSTANCE.getD_MDTPos();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_RadioPosImpl <em>TRadio Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_RadioPosImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_RadioPos()
		 * @generated
		 */
		EClass TRADIO_POS = eINSTANCE.getT_RadioPos();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTUseImpl <em>DMDT Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.D_MDTUseImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getD_MDTUse()
		 * @generated
		 */
		EClass DMDT_USE = eINSTANCE.getD_MDTUse();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_MonitorStatusImpl <em>TMonitor Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_MonitorStatusImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_MonitorStatus()
		 * @generated
		 */
		EClass TMONITOR_STATUS = eINSTANCE.getT_MonitorStatus();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispStatusImpl <em>TDisp Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispStatusImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DispStatus()
		 * @generated
		 */
		EClass TDISP_STATUS = eINSTANCE.getT_DispStatus();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispDepArrivImpl <em>TDisp Dep Arriv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_DispDepArrivImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_DispDepArriv()
		 * @generated
		 */
		EClass TDISP_DEP_ARRIV = eINSTANCE.getT_DispDepArriv();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ReplAmbImpl <em>TRepl Amb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ReplAmbImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ReplAmb()
		 * @generated
		 */
		EClass TREPL_AMB = eINSTANCE.getT_ReplAmb();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptImpl <em>TExcept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_Except()
		 * @generated
		 */
		EClass TEXCEPT = eINSTANCE.getT_Except();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptQueueImpl <em>TExcept Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_ExceptQueueImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_ExceptQueue()
		 * @generated
		 */
		EClass TEXCEPT_QUEUE = eINSTANCE.getT_ExceptQueue();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.T_CloseIncidentImpl <em>TClose Incident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.T_CloseIncidentImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getT_CloseIncident()
		 * @generated
		 */
		EClass TCLOSE_INCIDENT = eINSTANCE.getT_CloseIncident();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastDispatchImpl <em>SFast Dispatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastDispatchImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_FastDispatch()
		 * @generated
		 */
		EClass SFAST_DISPATCH = eINSTANCE.getS_FastDispatch();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_DispatchImpl <em>QDispatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_DispatchImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_Dispatch()
		 * @generated
		 */
		EClass QDISPATCH = eINSTANCE.getQ_Dispatch();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastAssistImpl <em>SFast Assist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastAssistImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_FastAssist()
		 * @generated
		 */
		EClass SFAST_ASSIST = eINSTANCE.getS_FastAssist();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_IncidResolvImpl <em>QIncid Resolv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_IncidResolvImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_IncidResolv()
		 * @generated
		 */
		EClass QINCID_RESOLV = eINSTANCE.getQ_IncidResolv();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastArrivImpl <em>SFast Arriv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_FastArrivImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_FastArriv()
		 * @generated
		 */
		EClass SFAST_ARRIV = eINSTANCE.getS_FastArriv();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_AmbArrivImpl <em>QAmb Arriv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_AmbArrivImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_AmbArriv()
		 * @generated
		 */
		EClass QAMB_ARRIV = eINSTANCE.getQ_AmbArriv();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_LowCostImpl <em>SLow Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_LowCostImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_LowCost()
		 * @generated
		 */
		EClass SLOW_COST = eINSTANCE.getS_LowCost();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxCostImpl <em>QMax Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxCostImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_MaxCost()
		 * @generated
		 */
		EClass QMAX_COST = eINSTANCE.getQ_MaxCost();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.S_UserFriendlyImpl <em>SUser Friendly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.S_UserFriendlyImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getS_UserFriendly()
		 * @generated
		 */
		EClass SUSER_FRIENDLY = eINSTANCE.getS_UserFriendly();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxTimeMsgImpl <em>QMax Time Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.Q_MaxTimeMsgImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getQ_MaxTimeMsg()
		 * @generated
		 */
		EClass QMAX_TIME_MSG = eINSTANCE.getQ_MaxTimeMsg();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR1Impl <em>AR1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR1Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR1()
		 * @generated
		 */
		EClass AR1 = eINSTANCE.getAR1();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR2Impl <em>AR2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR2Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR2()
		 * @generated
		 */
		EClass AR2 = eINSTANCE.getAR2();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR3Impl <em>AR3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR3Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR3()
		 * @generated
		 */
		EClass AR3 = eINSTANCE.getAR3();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR4Impl <em>AR4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR4Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR4()
		 * @generated
		 */
		EClass AR4 = eINSTANCE.getAR4();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR5Impl <em>AR5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR5Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR5()
		 * @generated
		 */
		EClass AR5 = eINSTANCE.getAR5();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR6Impl <em>AR6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR6Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR6()
		 * @generated
		 */
		EClass AR6 = eINSTANCE.getAR6();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR7Impl <em>AR7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR7Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR7()
		 * @generated
		 */
		EClass AR7 = eINSTANCE.getAR7();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR8Impl <em>AR8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR8Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR8()
		 * @generated
		 */
		EClass AR8 = eINSTANCE.getAR8();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR9Impl <em>AR9</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR9Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR9()
		 * @generated
		 */
		EClass AR9 = eINSTANCE.getAR9();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR10Impl <em>AR10</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR10Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR10()
		 * @generated
		 */
		EClass AR10 = eINSTANCE.getAR10();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR11Impl <em>AR11</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR11Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR11()
		 * @generated
		 */
		EClass AR11 = eINSTANCE.getAR11();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR12Impl <em>AR12</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR12Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR12()
		 * @generated
		 */
		EClass AR12 = eINSTANCE.getAR12();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR13Impl <em>AR13</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR13Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR13()
		 * @generated
		 */
		EClass AR13 = eINSTANCE.getAR13();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR14Impl <em>AR14</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR14Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR14()
		 * @generated
		 */
		EClass AR14 = eINSTANCE.getAR14();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AR15Impl <em>AR15</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AR15Impl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAR15()
		 * @generated
		 */
		EClass AR15 = eINSTANCE.getAR15();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.zanshin.simulation.model.acad.impl.AcadGoalModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadGoalModelImpl
		 * @see it.unitn.disi.zanshin.simulation.model.acad.impl.AcadPackageImpl#getAcadGoalModel()
		 * @generated
		 */
		EClass ACAD_GOAL_MODEL = eINSTANCE.getAcadGoalModel();

	}

} //AcadPackage
