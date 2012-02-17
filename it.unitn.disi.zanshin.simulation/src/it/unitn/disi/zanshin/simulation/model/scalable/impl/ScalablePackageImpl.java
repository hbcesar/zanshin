/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.simulation.model.scalable.impl;

import it.unitn.disi.zanshin.model.eca.EcaPackage;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.simulation.model.scalable.ScalableFactory;
import it.unitn.disi.zanshin.simulation.model.scalable.ScalablePackage;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eeat.model.LTL.LTLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ScalablePackageImpl extends EPackageImpl implements ScalablePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected String packageFilename = "scalable.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass scalableGoalModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ar1EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00000EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00001EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00002EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00003EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00004EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00005EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00006EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00007EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00008EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00009EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00010EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00011EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00012EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00013EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00014EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00015EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00016EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00017EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00018EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00019EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00020EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00021EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00022EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00023EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00024EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00025EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00026EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00027EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00028EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00029EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00030EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00031EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00032EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00033EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00034EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00035EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00036EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00037EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00038EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00039EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00040EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00041EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00042EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00043EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00044EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00045EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00046EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00047EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00048EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00049EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00050EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00051EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00052EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00053EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00054EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00055EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00056EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00057EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00058EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00059EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00060EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00061EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00062EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00063EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00064EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00065EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00066EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00067EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00068EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00069EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00070EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00071EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00072EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00073EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00074EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00075EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00076EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00077EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00078EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00079EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00080EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00081EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00082EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00083EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00084EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00085EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00086EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00087EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00088EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00089EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00090EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00091EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00092EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00093EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00094EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00095EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00096EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00097EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00098EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00099EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00100EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00101EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00102EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00103EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00104EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00105EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00106EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00107EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00108EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00109EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00110EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00111EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00112EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00113EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00114EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00115EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00116EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00117EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00118EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00119EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00120EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00121EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00122EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00123EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00124EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00125EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00126EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00127EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00128EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00129EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00130EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00131EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00132EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00133EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00134EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00135EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00136EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00137EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00138EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00139EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00140EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00141EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00142EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00143EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00144EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00145EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00146EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00147EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00148EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00149EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00150EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00151EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00152EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00153EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00154EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00155EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00156EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00157EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00158EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00159EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00160EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00161EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00162EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00163EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00164EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00165EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00166EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00167EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00168EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00169EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00170EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00171EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00172EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00173EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00174EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00175EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00176EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00177EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00178EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00179EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00180EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00181EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00182EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00183EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00184EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00185EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00186EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00187EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00188EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00189EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00190EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00191EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00192EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00193EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00194EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00195EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00196EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00197EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00198EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00199EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00200EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00201EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00202EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00203EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00204EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00205EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00206EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00207EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00208EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00209EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00210EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00211EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00212EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00213EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00214EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00215EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00216EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00217EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00218EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00219EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00220EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00221EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00222EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00223EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00224EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00225EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00226EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00227EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00228EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00229EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00230EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00231EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00232EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00233EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00234EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00235EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00236EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00237EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00238EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00239EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00240EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00241EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00242EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00243EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00244EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00245EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00246EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00247EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00248EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00249EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00250EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00251EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00252EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00253EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00254EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00255EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00256EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00257EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00258EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00259EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00260EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00261EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00262EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00263EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00264EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00265EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00266EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00267EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00268EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00269EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00270EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00271EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00272EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00273EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00274EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00275EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00276EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00277EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00278EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00279EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00280EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00281EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00282EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00283EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00284EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00285EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00286EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00287EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00288EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00289EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00290EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00291EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00292EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00293EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00294EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00295EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00296EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00297EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00298EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00299EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00300EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00301EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00302EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00303EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00304EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00305EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00306EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00307EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00308EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00309EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00310EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00311EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00312EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00313EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00314EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00315EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00316EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00317EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00318EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00319EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00320EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00321EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00322EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00323EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00324EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00325EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00326EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00327EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00328EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00329EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00330EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00331EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00332EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00333EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00334EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00335EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00336EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00337EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00338EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00339EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00340EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00341EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00342EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00343EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00344EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00345EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00346EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00347EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00348EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00349EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00350EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00351EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00352EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00353EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00354EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00355EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00356EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00357EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00358EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00359EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00360EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00361EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00362EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00363EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00364EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00365EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00366EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00367EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00368EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00369EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00370EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00371EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00372EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00373EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00374EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00375EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00376EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00377EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00378EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00379EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00380EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00381EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00382EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00383EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00384EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00385EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00386EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00387EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00388EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00389EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00390EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00391EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00392EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00393EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00394EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00395EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00396EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00397EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00398EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00399EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00400EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00401EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00402EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00403EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00404EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00405EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00406EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00407EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00408EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00409EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00410EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00411EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00412EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00413EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00414EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00415EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00416EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00417EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00418EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00419EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00420EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00421EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00422EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00423EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00424EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00425EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00426EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00427EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00428EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00429EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00430EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00431EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00432EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00433EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00434EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00435EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00436EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00437EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00438EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00439EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00440EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00441EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00442EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00443EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00444EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00445EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00446EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00447EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00448EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00449EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00450EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00451EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00452EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00453EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00454EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00455EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00456EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00457EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00458EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00459EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00460EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00461EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00462EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00463EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00464EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00465EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00466EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00467EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00468EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00469EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00470EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00471EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00472EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00473EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00474EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00475EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00476EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00477EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00478EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00479EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00480EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00481EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00482EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00483EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00484EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00485EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00486EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00487EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00488EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00489EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00490EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00491EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00492EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00493EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00494EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00495EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00496EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00497EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00498EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00499EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00500EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00501EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00502EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00503EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00504EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00505EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00506EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00507EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00508EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00509EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00510EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00511EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00512EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00513EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00514EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00515EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00516EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00517EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00518EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00519EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00520EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00521EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00522EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00523EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00524EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00525EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00526EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00527EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00528EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00529EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00530EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00531EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00532EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00533EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00534EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00535EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00536EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00537EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00538EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00539EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00540EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00541EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00542EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00543EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00544EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00545EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00546EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00547EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00548EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00549EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00550EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00551EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00552EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00553EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00554EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00555EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00556EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00557EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00558EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00559EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00560EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00561EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00562EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00563EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00564EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00565EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00566EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00567EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00568EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00569EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00570EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00571EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00572EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00573EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00574EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00575EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00576EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00577EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00578EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00579EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00580EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00581EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00582EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00583EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00584EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00585EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00586EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00587EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00588EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00589EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00590EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00591EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00592EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00593EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00594EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00595EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00596EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00597EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00598EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00599EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00600EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00601EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00602EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00603EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00604EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00605EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00606EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00607EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00608EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00609EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00610EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00611EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00612EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00613EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00614EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00615EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00616EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00617EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00618EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00619EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00620EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00621EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00622EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00623EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00624EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00625EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00626EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00627EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00628EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00629EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00630EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00631EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00632EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00633EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00634EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00635EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00636EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00637EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00638EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00639EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00640EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00641EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00642EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00643EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00644EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00645EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00646EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00647EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00648EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00649EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00650EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00651EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00652EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00653EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00654EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00655EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00656EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00657EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00658EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00659EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00660EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00661EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00662EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00663EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00664EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00665EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00666EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00667EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00668EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00669EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00670EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00671EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00672EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00673EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00674EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00675EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00676EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00677EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00678EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00679EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00680EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00681EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00682EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00683EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00684EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00685EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00686EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00687EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00688EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00689EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00690EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00691EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00692EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00693EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00694EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00695EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00696EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00697EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00698EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00699EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00700EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00701EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00702EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00703EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00704EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00705EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00706EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00707EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00708EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00709EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00710EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00711EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00712EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00713EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00714EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00715EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00716EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00717EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00718EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00719EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00720EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00721EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00722EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00723EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00724EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00725EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00726EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00727EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00728EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00729EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00730EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00731EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00732EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00733EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00734EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00735EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00736EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00737EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00738EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00739EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00740EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00741EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00742EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00743EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00744EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00745EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00746EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00747EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00748EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00749EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00750EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00751EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00752EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00753EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00754EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00755EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00756EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00757EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00758EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00759EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00760EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00761EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00762EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00763EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00764EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00765EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00766EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00767EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00768EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00769EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00770EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00771EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00772EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00773EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00774EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00775EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00776EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00777EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00778EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00779EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00780EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00781EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00782EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00783EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00784EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00785EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00786EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00787EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00788EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00789EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00790EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00791EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00792EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00793EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00794EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00795EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00796EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00797EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00798EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00799EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00800EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00801EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00802EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00803EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00804EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00805EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00806EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00807EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00808EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00809EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00810EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00811EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00812EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00813EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00814EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00815EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00816EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00817EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00818EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00819EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00820EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00821EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00822EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00823EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00824EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00825EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00826EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00827EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00828EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00829EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00830EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00831EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00832EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00833EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00834EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00835EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00836EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00837EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00838EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00839EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00840EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00841EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00842EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00843EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00844EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00845EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00846EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00847EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00848EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00849EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00850EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00851EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00852EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00853EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00854EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00855EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00856EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00857EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00858EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00859EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00860EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00861EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00862EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00863EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00864EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00865EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00866EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00867EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00868EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00869EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00870EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00871EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00872EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00873EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00874EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00875EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00876EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00877EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00878EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00879EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00880EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00881EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00882EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00883EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00884EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00885EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00886EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00887EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00888EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00889EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00890EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00891EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00892EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00893EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00894EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00895EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00896EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00897EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00898EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00899EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00900EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00901EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00902EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00903EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00904EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00905EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00906EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00907EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00908EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00909EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00910EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00911EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00912EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00913EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00914EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00915EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00916EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00917EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00918EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00919EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00920EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00921EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00922EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00923EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00924EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00925EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00926EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00927EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00928EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00929EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00930EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00931EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00932EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00933EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00934EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00935EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00936EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00937EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00938EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00939EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00940EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00941EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00942EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00943EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00944EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00945EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00946EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00947EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00948EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00949EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00950EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00951EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00952EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00953EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00954EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00955EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00956EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00957EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00958EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00959EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00960EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00961EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00962EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00963EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00964EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00965EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00966EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00967EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00968EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00969EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00970EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00971EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00972EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00973EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00974EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00975EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00976EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00977EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00978EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00979EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00980EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00981EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00982EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00983EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00984EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00985EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00986EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00987EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00988EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00989EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00990EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00991EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00992EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00993EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00994EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00995EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00996EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00997EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00998EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g00999EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass g01000EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unitn.disi.zanshin.simulation.model.scalable.ScalablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScalablePackageImpl() {
		super(eNS_URI, ScalableFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ScalablePackage#eINSTANCE} when that field is accessed. Clients should not
	 * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @generated
	 */
	public static ScalablePackage init() {
		if (isInited)
			return (ScalablePackage) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI);

		// Obtain or create and register package
		ScalablePackageImpl theScalablePackage = (ScalablePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScalablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScalablePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcaPackage.eINSTANCE.eClass();
		GorePackage.eINSTANCE.eClass();
		LTLPackage.eINSTANCE.eClass();

		// Load packages
		theScalablePackage.loadPackage();

		// Fix loaded packages
		theScalablePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theScalablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScalablePackage.eNS_URI, theScalablePackage);
		return theScalablePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getScalableGoalModel() {
		if (scalableGoalModelEClass == null) {
			scalableGoalModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(0);
		}
		return scalableGoalModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAR1() {
		if (ar1EClass == null) {
			ar1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(1);
		}
		return ar1EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00000() {
		if (g00000EClass == null) {
			g00000EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(2);
		}
		return g00000EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00001() {
		if (g00001EClass == null) {
			g00001EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(3);
		}
		return g00001EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00002() {
		if (g00002EClass == null) {
			g00002EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(4);
		}
		return g00002EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00003() {
		if (g00003EClass == null) {
			g00003EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(5);
		}
		return g00003EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00004() {
		if (g00004EClass == null) {
			g00004EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(6);
		}
		return g00004EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00005() {
		if (g00005EClass == null) {
			g00005EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(7);
		}
		return g00005EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00006() {
		if (g00006EClass == null) {
			g00006EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(8);
		}
		return g00006EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00007() {
		if (g00007EClass == null) {
			g00007EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(9);
		}
		return g00007EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00008() {
		if (g00008EClass == null) {
			g00008EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(10);
		}
		return g00008EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00009() {
		if (g00009EClass == null) {
			g00009EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(11);
		}
		return g00009EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00010() {
		if (g00010EClass == null) {
			g00010EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(12);
		}
		return g00010EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00011() {
		if (g00011EClass == null) {
			g00011EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(13);
		}
		return g00011EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00012() {
		if (g00012EClass == null) {
			g00012EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(14);
		}
		return g00012EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00013() {
		if (g00013EClass == null) {
			g00013EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(15);
		}
		return g00013EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00014() {
		if (g00014EClass == null) {
			g00014EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(16);
		}
		return g00014EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00015() {
		if (g00015EClass == null) {
			g00015EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(17);
		}
		return g00015EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00016() {
		if (g00016EClass == null) {
			g00016EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(18);
		}
		return g00016EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00017() {
		if (g00017EClass == null) {
			g00017EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(19);
		}
		return g00017EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00018() {
		if (g00018EClass == null) {
			g00018EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(20);
		}
		return g00018EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00019() {
		if (g00019EClass == null) {
			g00019EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(21);
		}
		return g00019EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00020() {
		if (g00020EClass == null) {
			g00020EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(22);
		}
		return g00020EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00021() {
		if (g00021EClass == null) {
			g00021EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(23);
		}
		return g00021EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00022() {
		if (g00022EClass == null) {
			g00022EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(24);
		}
		return g00022EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00023() {
		if (g00023EClass == null) {
			g00023EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(25);
		}
		return g00023EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00024() {
		if (g00024EClass == null) {
			g00024EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(26);
		}
		return g00024EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00025() {
		if (g00025EClass == null) {
			g00025EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(27);
		}
		return g00025EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00026() {
		if (g00026EClass == null) {
			g00026EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(28);
		}
		return g00026EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00027() {
		if (g00027EClass == null) {
			g00027EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(29);
		}
		return g00027EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00028() {
		if (g00028EClass == null) {
			g00028EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(30);
		}
		return g00028EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00029() {
		if (g00029EClass == null) {
			g00029EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(31);
		}
		return g00029EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00030() {
		if (g00030EClass == null) {
			g00030EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(32);
		}
		return g00030EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00031() {
		if (g00031EClass == null) {
			g00031EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(33);
		}
		return g00031EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00032() {
		if (g00032EClass == null) {
			g00032EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(34);
		}
		return g00032EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00033() {
		if (g00033EClass == null) {
			g00033EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(35);
		}
		return g00033EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00034() {
		if (g00034EClass == null) {
			g00034EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(36);
		}
		return g00034EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00035() {
		if (g00035EClass == null) {
			g00035EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(37);
		}
		return g00035EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00036() {
		if (g00036EClass == null) {
			g00036EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(38);
		}
		return g00036EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00037() {
		if (g00037EClass == null) {
			g00037EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(39);
		}
		return g00037EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00038() {
		if (g00038EClass == null) {
			g00038EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(40);
		}
		return g00038EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00039() {
		if (g00039EClass == null) {
			g00039EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(41);
		}
		return g00039EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00040() {
		if (g00040EClass == null) {
			g00040EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(42);
		}
		return g00040EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00041() {
		if (g00041EClass == null) {
			g00041EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(43);
		}
		return g00041EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00042() {
		if (g00042EClass == null) {
			g00042EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(44);
		}
		return g00042EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00043() {
		if (g00043EClass == null) {
			g00043EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(45);
		}
		return g00043EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00044() {
		if (g00044EClass == null) {
			g00044EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(46);
		}
		return g00044EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00045() {
		if (g00045EClass == null) {
			g00045EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(47);
		}
		return g00045EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00046() {
		if (g00046EClass == null) {
			g00046EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(48);
		}
		return g00046EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00047() {
		if (g00047EClass == null) {
			g00047EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(49);
		}
		return g00047EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00048() {
		if (g00048EClass == null) {
			g00048EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(50);
		}
		return g00048EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00049() {
		if (g00049EClass == null) {
			g00049EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(51);
		}
		return g00049EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00050() {
		if (g00050EClass == null) {
			g00050EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(52);
		}
		return g00050EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00051() {
		if (g00051EClass == null) {
			g00051EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(53);
		}
		return g00051EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00052() {
		if (g00052EClass == null) {
			g00052EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(54);
		}
		return g00052EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00053() {
		if (g00053EClass == null) {
			g00053EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(55);
		}
		return g00053EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00054() {
		if (g00054EClass == null) {
			g00054EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(56);
		}
		return g00054EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00055() {
		if (g00055EClass == null) {
			g00055EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(57);
		}
		return g00055EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00056() {
		if (g00056EClass == null) {
			g00056EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(58);
		}
		return g00056EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00057() {
		if (g00057EClass == null) {
			g00057EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(59);
		}
		return g00057EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00058() {
		if (g00058EClass == null) {
			g00058EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(60);
		}
		return g00058EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00059() {
		if (g00059EClass == null) {
			g00059EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(61);
		}
		return g00059EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00060() {
		if (g00060EClass == null) {
			g00060EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(62);
		}
		return g00060EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00061() {
		if (g00061EClass == null) {
			g00061EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(63);
		}
		return g00061EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00062() {
		if (g00062EClass == null) {
			g00062EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(64);
		}
		return g00062EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00063() {
		if (g00063EClass == null) {
			g00063EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(65);
		}
		return g00063EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00064() {
		if (g00064EClass == null) {
			g00064EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(66);
		}
		return g00064EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00065() {
		if (g00065EClass == null) {
			g00065EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(67);
		}
		return g00065EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00066() {
		if (g00066EClass == null) {
			g00066EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(68);
		}
		return g00066EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00067() {
		if (g00067EClass == null) {
			g00067EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(69);
		}
		return g00067EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00068() {
		if (g00068EClass == null) {
			g00068EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(70);
		}
		return g00068EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00069() {
		if (g00069EClass == null) {
			g00069EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(71);
		}
		return g00069EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00070() {
		if (g00070EClass == null) {
			g00070EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(72);
		}
		return g00070EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00071() {
		if (g00071EClass == null) {
			g00071EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(73);
		}
		return g00071EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00072() {
		if (g00072EClass == null) {
			g00072EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(74);
		}
		return g00072EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00073() {
		if (g00073EClass == null) {
			g00073EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(75);
		}
		return g00073EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00074() {
		if (g00074EClass == null) {
			g00074EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(76);
		}
		return g00074EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00075() {
		if (g00075EClass == null) {
			g00075EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(77);
		}
		return g00075EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00076() {
		if (g00076EClass == null) {
			g00076EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(78);
		}
		return g00076EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00077() {
		if (g00077EClass == null) {
			g00077EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(79);
		}
		return g00077EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00078() {
		if (g00078EClass == null) {
			g00078EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(80);
		}
		return g00078EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00079() {
		if (g00079EClass == null) {
			g00079EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(81);
		}
		return g00079EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00080() {
		if (g00080EClass == null) {
			g00080EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(82);
		}
		return g00080EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00081() {
		if (g00081EClass == null) {
			g00081EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(83);
		}
		return g00081EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00082() {
		if (g00082EClass == null) {
			g00082EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(84);
		}
		return g00082EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00083() {
		if (g00083EClass == null) {
			g00083EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(85);
		}
		return g00083EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00084() {
		if (g00084EClass == null) {
			g00084EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(86);
		}
		return g00084EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00085() {
		if (g00085EClass == null) {
			g00085EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(87);
		}
		return g00085EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00086() {
		if (g00086EClass == null) {
			g00086EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(88);
		}
		return g00086EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00087() {
		if (g00087EClass == null) {
			g00087EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(89);
		}
		return g00087EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00088() {
		if (g00088EClass == null) {
			g00088EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(90);
		}
		return g00088EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00089() {
		if (g00089EClass == null) {
			g00089EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(91);
		}
		return g00089EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00090() {
		if (g00090EClass == null) {
			g00090EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(92);
		}
		return g00090EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00091() {
		if (g00091EClass == null) {
			g00091EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(93);
		}
		return g00091EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00092() {
		if (g00092EClass == null) {
			g00092EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(94);
		}
		return g00092EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00093() {
		if (g00093EClass == null) {
			g00093EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(95);
		}
		return g00093EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00094() {
		if (g00094EClass == null) {
			g00094EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(96);
		}
		return g00094EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00095() {
		if (g00095EClass == null) {
			g00095EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(97);
		}
		return g00095EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00096() {
		if (g00096EClass == null) {
			g00096EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(98);
		}
		return g00096EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00097() {
		if (g00097EClass == null) {
			g00097EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(99);
		}
		return g00097EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00098() {
		if (g00098EClass == null) {
			g00098EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(100);
		}
		return g00098EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00099() {
		if (g00099EClass == null) {
			g00099EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(101);
		}
		return g00099EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00100() {
		if (g00100EClass == null) {
			g00100EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(102);
		}
		return g00100EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00101() {
		if (g00101EClass == null) {
			g00101EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(103);
		}
		return g00101EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00102() {
		if (g00102EClass == null) {
			g00102EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(104);
		}
		return g00102EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00103() {
		if (g00103EClass == null) {
			g00103EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(105);
		}
		return g00103EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00104() {
		if (g00104EClass == null) {
			g00104EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(106);
		}
		return g00104EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00105() {
		if (g00105EClass == null) {
			g00105EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(107);
		}
		return g00105EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00106() {
		if (g00106EClass == null) {
			g00106EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(108);
		}
		return g00106EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00107() {
		if (g00107EClass == null) {
			g00107EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(109);
		}
		return g00107EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00108() {
		if (g00108EClass == null) {
			g00108EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(110);
		}
		return g00108EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00109() {
		if (g00109EClass == null) {
			g00109EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(111);
		}
		return g00109EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00110() {
		if (g00110EClass == null) {
			g00110EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(112);
		}
		return g00110EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00111() {
		if (g00111EClass == null) {
			g00111EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(113);
		}
		return g00111EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00112() {
		if (g00112EClass == null) {
			g00112EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(114);
		}
		return g00112EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00113() {
		if (g00113EClass == null) {
			g00113EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(115);
		}
		return g00113EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00114() {
		if (g00114EClass == null) {
			g00114EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(116);
		}
		return g00114EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00115() {
		if (g00115EClass == null) {
			g00115EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(117);
		}
		return g00115EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00116() {
		if (g00116EClass == null) {
			g00116EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(118);
		}
		return g00116EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00117() {
		if (g00117EClass == null) {
			g00117EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(119);
		}
		return g00117EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00118() {
		if (g00118EClass == null) {
			g00118EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(120);
		}
		return g00118EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00119() {
		if (g00119EClass == null) {
			g00119EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(121);
		}
		return g00119EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00120() {
		if (g00120EClass == null) {
			g00120EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(122);
		}
		return g00120EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00121() {
		if (g00121EClass == null) {
			g00121EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(123);
		}
		return g00121EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00122() {
		if (g00122EClass == null) {
			g00122EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(124);
		}
		return g00122EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00123() {
		if (g00123EClass == null) {
			g00123EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(125);
		}
		return g00123EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00124() {
		if (g00124EClass == null) {
			g00124EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(126);
		}
		return g00124EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00125() {
		if (g00125EClass == null) {
			g00125EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(127);
		}
		return g00125EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00126() {
		if (g00126EClass == null) {
			g00126EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(128);
		}
		return g00126EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00127() {
		if (g00127EClass == null) {
			g00127EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(129);
		}
		return g00127EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00128() {
		if (g00128EClass == null) {
			g00128EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(130);
		}
		return g00128EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00129() {
		if (g00129EClass == null) {
			g00129EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(131);
		}
		return g00129EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00130() {
		if (g00130EClass == null) {
			g00130EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(132);
		}
		return g00130EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00131() {
		if (g00131EClass == null) {
			g00131EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(133);
		}
		return g00131EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00132() {
		if (g00132EClass == null) {
			g00132EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(134);
		}
		return g00132EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00133() {
		if (g00133EClass == null) {
			g00133EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(135);
		}
		return g00133EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00134() {
		if (g00134EClass == null) {
			g00134EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(136);
		}
		return g00134EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00135() {
		if (g00135EClass == null) {
			g00135EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(137);
		}
		return g00135EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00136() {
		if (g00136EClass == null) {
			g00136EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(138);
		}
		return g00136EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00137() {
		if (g00137EClass == null) {
			g00137EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(139);
		}
		return g00137EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00138() {
		if (g00138EClass == null) {
			g00138EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(140);
		}
		return g00138EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00139() {
		if (g00139EClass == null) {
			g00139EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(141);
		}
		return g00139EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00140() {
		if (g00140EClass == null) {
			g00140EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(142);
		}
		return g00140EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00141() {
		if (g00141EClass == null) {
			g00141EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(143);
		}
		return g00141EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00142() {
		if (g00142EClass == null) {
			g00142EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(144);
		}
		return g00142EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00143() {
		if (g00143EClass == null) {
			g00143EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(145);
		}
		return g00143EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00144() {
		if (g00144EClass == null) {
			g00144EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(146);
		}
		return g00144EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00145() {
		if (g00145EClass == null) {
			g00145EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(147);
		}
		return g00145EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00146() {
		if (g00146EClass == null) {
			g00146EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(148);
		}
		return g00146EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00147() {
		if (g00147EClass == null) {
			g00147EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(149);
		}
		return g00147EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00148() {
		if (g00148EClass == null) {
			g00148EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(150);
		}
		return g00148EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00149() {
		if (g00149EClass == null) {
			g00149EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(151);
		}
		return g00149EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00150() {
		if (g00150EClass == null) {
			g00150EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(152);
		}
		return g00150EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00151() {
		if (g00151EClass == null) {
			g00151EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(153);
		}
		return g00151EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00152() {
		if (g00152EClass == null) {
			g00152EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(154);
		}
		return g00152EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00153() {
		if (g00153EClass == null) {
			g00153EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(155);
		}
		return g00153EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00154() {
		if (g00154EClass == null) {
			g00154EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(156);
		}
		return g00154EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00155() {
		if (g00155EClass == null) {
			g00155EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(157);
		}
		return g00155EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00156() {
		if (g00156EClass == null) {
			g00156EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(158);
		}
		return g00156EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00157() {
		if (g00157EClass == null) {
			g00157EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(159);
		}
		return g00157EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00158() {
		if (g00158EClass == null) {
			g00158EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(160);
		}
		return g00158EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00159() {
		if (g00159EClass == null) {
			g00159EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(161);
		}
		return g00159EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00160() {
		if (g00160EClass == null) {
			g00160EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(162);
		}
		return g00160EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00161() {
		if (g00161EClass == null) {
			g00161EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(163);
		}
		return g00161EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00162() {
		if (g00162EClass == null) {
			g00162EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(164);
		}
		return g00162EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00163() {
		if (g00163EClass == null) {
			g00163EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(165);
		}
		return g00163EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00164() {
		if (g00164EClass == null) {
			g00164EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(166);
		}
		return g00164EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00165() {
		if (g00165EClass == null) {
			g00165EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(167);
		}
		return g00165EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00166() {
		if (g00166EClass == null) {
			g00166EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(168);
		}
		return g00166EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00167() {
		if (g00167EClass == null) {
			g00167EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(169);
		}
		return g00167EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00168() {
		if (g00168EClass == null) {
			g00168EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(170);
		}
		return g00168EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00169() {
		if (g00169EClass == null) {
			g00169EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(171);
		}
		return g00169EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00170() {
		if (g00170EClass == null) {
			g00170EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(172);
		}
		return g00170EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00171() {
		if (g00171EClass == null) {
			g00171EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(173);
		}
		return g00171EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00172() {
		if (g00172EClass == null) {
			g00172EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(174);
		}
		return g00172EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00173() {
		if (g00173EClass == null) {
			g00173EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(175);
		}
		return g00173EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00174() {
		if (g00174EClass == null) {
			g00174EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(176);
		}
		return g00174EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00175() {
		if (g00175EClass == null) {
			g00175EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(177);
		}
		return g00175EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00176() {
		if (g00176EClass == null) {
			g00176EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(178);
		}
		return g00176EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00177() {
		if (g00177EClass == null) {
			g00177EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(179);
		}
		return g00177EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00178() {
		if (g00178EClass == null) {
			g00178EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(180);
		}
		return g00178EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00179() {
		if (g00179EClass == null) {
			g00179EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(181);
		}
		return g00179EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00180() {
		if (g00180EClass == null) {
			g00180EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(182);
		}
		return g00180EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00181() {
		if (g00181EClass == null) {
			g00181EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(183);
		}
		return g00181EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00182() {
		if (g00182EClass == null) {
			g00182EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(184);
		}
		return g00182EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00183() {
		if (g00183EClass == null) {
			g00183EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(185);
		}
		return g00183EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00184() {
		if (g00184EClass == null) {
			g00184EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(186);
		}
		return g00184EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00185() {
		if (g00185EClass == null) {
			g00185EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(187);
		}
		return g00185EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00186() {
		if (g00186EClass == null) {
			g00186EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(188);
		}
		return g00186EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00187() {
		if (g00187EClass == null) {
			g00187EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(189);
		}
		return g00187EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00188() {
		if (g00188EClass == null) {
			g00188EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(190);
		}
		return g00188EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00189() {
		if (g00189EClass == null) {
			g00189EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(191);
		}
		return g00189EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00190() {
		if (g00190EClass == null) {
			g00190EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(192);
		}
		return g00190EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00191() {
		if (g00191EClass == null) {
			g00191EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(193);
		}
		return g00191EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00192() {
		if (g00192EClass == null) {
			g00192EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(194);
		}
		return g00192EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00193() {
		if (g00193EClass == null) {
			g00193EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(195);
		}
		return g00193EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00194() {
		if (g00194EClass == null) {
			g00194EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(196);
		}
		return g00194EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00195() {
		if (g00195EClass == null) {
			g00195EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(197);
		}
		return g00195EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00196() {
		if (g00196EClass == null) {
			g00196EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(198);
		}
		return g00196EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00197() {
		if (g00197EClass == null) {
			g00197EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(199);
		}
		return g00197EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00198() {
		if (g00198EClass == null) {
			g00198EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(200);
		}
		return g00198EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00199() {
		if (g00199EClass == null) {
			g00199EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(201);
		}
		return g00199EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00200() {
		if (g00200EClass == null) {
			g00200EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(202);
		}
		return g00200EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00201() {
		if (g00201EClass == null) {
			g00201EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(203);
		}
		return g00201EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00202() {
		if (g00202EClass == null) {
			g00202EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(204);
		}
		return g00202EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00203() {
		if (g00203EClass == null) {
			g00203EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(205);
		}
		return g00203EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00204() {
		if (g00204EClass == null) {
			g00204EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(206);
		}
		return g00204EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00205() {
		if (g00205EClass == null) {
			g00205EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(207);
		}
		return g00205EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00206() {
		if (g00206EClass == null) {
			g00206EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(208);
		}
		return g00206EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00207() {
		if (g00207EClass == null) {
			g00207EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(209);
		}
		return g00207EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00208() {
		if (g00208EClass == null) {
			g00208EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(210);
		}
		return g00208EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00209() {
		if (g00209EClass == null) {
			g00209EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(211);
		}
		return g00209EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00210() {
		if (g00210EClass == null) {
			g00210EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(212);
		}
		return g00210EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00211() {
		if (g00211EClass == null) {
			g00211EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(213);
		}
		return g00211EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00212() {
		if (g00212EClass == null) {
			g00212EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(214);
		}
		return g00212EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00213() {
		if (g00213EClass == null) {
			g00213EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(215);
		}
		return g00213EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00214() {
		if (g00214EClass == null) {
			g00214EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(216);
		}
		return g00214EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00215() {
		if (g00215EClass == null) {
			g00215EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(217);
		}
		return g00215EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00216() {
		if (g00216EClass == null) {
			g00216EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(218);
		}
		return g00216EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00217() {
		if (g00217EClass == null) {
			g00217EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(219);
		}
		return g00217EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00218() {
		if (g00218EClass == null) {
			g00218EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(220);
		}
		return g00218EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00219() {
		if (g00219EClass == null) {
			g00219EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(221);
		}
		return g00219EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00220() {
		if (g00220EClass == null) {
			g00220EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(222);
		}
		return g00220EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00221() {
		if (g00221EClass == null) {
			g00221EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(223);
		}
		return g00221EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00222() {
		if (g00222EClass == null) {
			g00222EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(224);
		}
		return g00222EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00223() {
		if (g00223EClass == null) {
			g00223EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(225);
		}
		return g00223EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00224() {
		if (g00224EClass == null) {
			g00224EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(226);
		}
		return g00224EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00225() {
		if (g00225EClass == null) {
			g00225EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(227);
		}
		return g00225EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00226() {
		if (g00226EClass == null) {
			g00226EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(228);
		}
		return g00226EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00227() {
		if (g00227EClass == null) {
			g00227EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(229);
		}
		return g00227EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00228() {
		if (g00228EClass == null) {
			g00228EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(230);
		}
		return g00228EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00229() {
		if (g00229EClass == null) {
			g00229EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(231);
		}
		return g00229EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00230() {
		if (g00230EClass == null) {
			g00230EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(232);
		}
		return g00230EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00231() {
		if (g00231EClass == null) {
			g00231EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(233);
		}
		return g00231EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00232() {
		if (g00232EClass == null) {
			g00232EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(234);
		}
		return g00232EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00233() {
		if (g00233EClass == null) {
			g00233EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(235);
		}
		return g00233EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00234() {
		if (g00234EClass == null) {
			g00234EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(236);
		}
		return g00234EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00235() {
		if (g00235EClass == null) {
			g00235EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(237);
		}
		return g00235EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00236() {
		if (g00236EClass == null) {
			g00236EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(238);
		}
		return g00236EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00237() {
		if (g00237EClass == null) {
			g00237EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(239);
		}
		return g00237EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00238() {
		if (g00238EClass == null) {
			g00238EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(240);
		}
		return g00238EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00239() {
		if (g00239EClass == null) {
			g00239EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(241);
		}
		return g00239EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00240() {
		if (g00240EClass == null) {
			g00240EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(242);
		}
		return g00240EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00241() {
		if (g00241EClass == null) {
			g00241EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(243);
		}
		return g00241EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00242() {
		if (g00242EClass == null) {
			g00242EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(244);
		}
		return g00242EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00243() {
		if (g00243EClass == null) {
			g00243EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(245);
		}
		return g00243EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00244() {
		if (g00244EClass == null) {
			g00244EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(246);
		}
		return g00244EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00245() {
		if (g00245EClass == null) {
			g00245EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(247);
		}
		return g00245EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00246() {
		if (g00246EClass == null) {
			g00246EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(248);
		}
		return g00246EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00247() {
		if (g00247EClass == null) {
			g00247EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(249);
		}
		return g00247EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00248() {
		if (g00248EClass == null) {
			g00248EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(250);
		}
		return g00248EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00249() {
		if (g00249EClass == null) {
			g00249EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(251);
		}
		return g00249EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00250() {
		if (g00250EClass == null) {
			g00250EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(252);
		}
		return g00250EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00251() {
		if (g00251EClass == null) {
			g00251EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(253);
		}
		return g00251EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00252() {
		if (g00252EClass == null) {
			g00252EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(254);
		}
		return g00252EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00253() {
		if (g00253EClass == null) {
			g00253EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(255);
		}
		return g00253EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00254() {
		if (g00254EClass == null) {
			g00254EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(256);
		}
		return g00254EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00255() {
		if (g00255EClass == null) {
			g00255EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(257);
		}
		return g00255EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00256() {
		if (g00256EClass == null) {
			g00256EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(258);
		}
		return g00256EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00257() {
		if (g00257EClass == null) {
			g00257EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(259);
		}
		return g00257EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00258() {
		if (g00258EClass == null) {
			g00258EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(260);
		}
		return g00258EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00259() {
		if (g00259EClass == null) {
			g00259EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(261);
		}
		return g00259EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00260() {
		if (g00260EClass == null) {
			g00260EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(262);
		}
		return g00260EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00261() {
		if (g00261EClass == null) {
			g00261EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(263);
		}
		return g00261EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00262() {
		if (g00262EClass == null) {
			g00262EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(264);
		}
		return g00262EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00263() {
		if (g00263EClass == null) {
			g00263EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(265);
		}
		return g00263EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00264() {
		if (g00264EClass == null) {
			g00264EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(266);
		}
		return g00264EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00265() {
		if (g00265EClass == null) {
			g00265EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(267);
		}
		return g00265EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00266() {
		if (g00266EClass == null) {
			g00266EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(268);
		}
		return g00266EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00267() {
		if (g00267EClass == null) {
			g00267EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(269);
		}
		return g00267EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00268() {
		if (g00268EClass == null) {
			g00268EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(270);
		}
		return g00268EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00269() {
		if (g00269EClass == null) {
			g00269EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(271);
		}
		return g00269EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00270() {
		if (g00270EClass == null) {
			g00270EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(272);
		}
		return g00270EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00271() {
		if (g00271EClass == null) {
			g00271EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(273);
		}
		return g00271EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00272() {
		if (g00272EClass == null) {
			g00272EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(274);
		}
		return g00272EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00273() {
		if (g00273EClass == null) {
			g00273EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(275);
		}
		return g00273EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00274() {
		if (g00274EClass == null) {
			g00274EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(276);
		}
		return g00274EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00275() {
		if (g00275EClass == null) {
			g00275EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(277);
		}
		return g00275EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00276() {
		if (g00276EClass == null) {
			g00276EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(278);
		}
		return g00276EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00277() {
		if (g00277EClass == null) {
			g00277EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(279);
		}
		return g00277EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00278() {
		if (g00278EClass == null) {
			g00278EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(280);
		}
		return g00278EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00279() {
		if (g00279EClass == null) {
			g00279EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(281);
		}
		return g00279EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00280() {
		if (g00280EClass == null) {
			g00280EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(282);
		}
		return g00280EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00281() {
		if (g00281EClass == null) {
			g00281EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(283);
		}
		return g00281EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00282() {
		if (g00282EClass == null) {
			g00282EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(284);
		}
		return g00282EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00283() {
		if (g00283EClass == null) {
			g00283EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(285);
		}
		return g00283EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00284() {
		if (g00284EClass == null) {
			g00284EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(286);
		}
		return g00284EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00285() {
		if (g00285EClass == null) {
			g00285EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(287);
		}
		return g00285EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00286() {
		if (g00286EClass == null) {
			g00286EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(288);
		}
		return g00286EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00287() {
		if (g00287EClass == null) {
			g00287EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(289);
		}
		return g00287EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00288() {
		if (g00288EClass == null) {
			g00288EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(290);
		}
		return g00288EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00289() {
		if (g00289EClass == null) {
			g00289EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(291);
		}
		return g00289EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00290() {
		if (g00290EClass == null) {
			g00290EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(292);
		}
		return g00290EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00291() {
		if (g00291EClass == null) {
			g00291EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(293);
		}
		return g00291EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00292() {
		if (g00292EClass == null) {
			g00292EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(294);
		}
		return g00292EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00293() {
		if (g00293EClass == null) {
			g00293EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(295);
		}
		return g00293EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00294() {
		if (g00294EClass == null) {
			g00294EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(296);
		}
		return g00294EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00295() {
		if (g00295EClass == null) {
			g00295EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(297);
		}
		return g00295EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00296() {
		if (g00296EClass == null) {
			g00296EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(298);
		}
		return g00296EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00297() {
		if (g00297EClass == null) {
			g00297EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(299);
		}
		return g00297EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00298() {
		if (g00298EClass == null) {
			g00298EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(300);
		}
		return g00298EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00299() {
		if (g00299EClass == null) {
			g00299EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(301);
		}
		return g00299EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00300() {
		if (g00300EClass == null) {
			g00300EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(302);
		}
		return g00300EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00301() {
		if (g00301EClass == null) {
			g00301EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(303);
		}
		return g00301EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00302() {
		if (g00302EClass == null) {
			g00302EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(304);
		}
		return g00302EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00303() {
		if (g00303EClass == null) {
			g00303EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(305);
		}
		return g00303EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00304() {
		if (g00304EClass == null) {
			g00304EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(306);
		}
		return g00304EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00305() {
		if (g00305EClass == null) {
			g00305EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(307);
		}
		return g00305EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00306() {
		if (g00306EClass == null) {
			g00306EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(308);
		}
		return g00306EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00307() {
		if (g00307EClass == null) {
			g00307EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(309);
		}
		return g00307EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00308() {
		if (g00308EClass == null) {
			g00308EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(310);
		}
		return g00308EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00309() {
		if (g00309EClass == null) {
			g00309EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(311);
		}
		return g00309EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00310() {
		if (g00310EClass == null) {
			g00310EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(312);
		}
		return g00310EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00311() {
		if (g00311EClass == null) {
			g00311EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(313);
		}
		return g00311EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00312() {
		if (g00312EClass == null) {
			g00312EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(314);
		}
		return g00312EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00313() {
		if (g00313EClass == null) {
			g00313EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(315);
		}
		return g00313EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00314() {
		if (g00314EClass == null) {
			g00314EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(316);
		}
		return g00314EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00315() {
		if (g00315EClass == null) {
			g00315EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(317);
		}
		return g00315EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00316() {
		if (g00316EClass == null) {
			g00316EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(318);
		}
		return g00316EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00317() {
		if (g00317EClass == null) {
			g00317EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(319);
		}
		return g00317EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00318() {
		if (g00318EClass == null) {
			g00318EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(320);
		}
		return g00318EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00319() {
		if (g00319EClass == null) {
			g00319EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(321);
		}
		return g00319EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00320() {
		if (g00320EClass == null) {
			g00320EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(322);
		}
		return g00320EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00321() {
		if (g00321EClass == null) {
			g00321EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(323);
		}
		return g00321EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00322() {
		if (g00322EClass == null) {
			g00322EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(324);
		}
		return g00322EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00323() {
		if (g00323EClass == null) {
			g00323EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(325);
		}
		return g00323EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00324() {
		if (g00324EClass == null) {
			g00324EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(326);
		}
		return g00324EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00325() {
		if (g00325EClass == null) {
			g00325EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(327);
		}
		return g00325EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00326() {
		if (g00326EClass == null) {
			g00326EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(328);
		}
		return g00326EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00327() {
		if (g00327EClass == null) {
			g00327EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(329);
		}
		return g00327EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00328() {
		if (g00328EClass == null) {
			g00328EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(330);
		}
		return g00328EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00329() {
		if (g00329EClass == null) {
			g00329EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(331);
		}
		return g00329EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00330() {
		if (g00330EClass == null) {
			g00330EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(332);
		}
		return g00330EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00331() {
		if (g00331EClass == null) {
			g00331EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(333);
		}
		return g00331EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00332() {
		if (g00332EClass == null) {
			g00332EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(334);
		}
		return g00332EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00333() {
		if (g00333EClass == null) {
			g00333EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(335);
		}
		return g00333EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00334() {
		if (g00334EClass == null) {
			g00334EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(336);
		}
		return g00334EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00335() {
		if (g00335EClass == null) {
			g00335EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(337);
		}
		return g00335EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00336() {
		if (g00336EClass == null) {
			g00336EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(338);
		}
		return g00336EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00337() {
		if (g00337EClass == null) {
			g00337EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(339);
		}
		return g00337EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00338() {
		if (g00338EClass == null) {
			g00338EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(340);
		}
		return g00338EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00339() {
		if (g00339EClass == null) {
			g00339EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(341);
		}
		return g00339EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00340() {
		if (g00340EClass == null) {
			g00340EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(342);
		}
		return g00340EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00341() {
		if (g00341EClass == null) {
			g00341EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(343);
		}
		return g00341EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00342() {
		if (g00342EClass == null) {
			g00342EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(344);
		}
		return g00342EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00343() {
		if (g00343EClass == null) {
			g00343EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(345);
		}
		return g00343EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00344() {
		if (g00344EClass == null) {
			g00344EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(346);
		}
		return g00344EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00345() {
		if (g00345EClass == null) {
			g00345EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(347);
		}
		return g00345EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00346() {
		if (g00346EClass == null) {
			g00346EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(348);
		}
		return g00346EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00347() {
		if (g00347EClass == null) {
			g00347EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(349);
		}
		return g00347EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00348() {
		if (g00348EClass == null) {
			g00348EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(350);
		}
		return g00348EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00349() {
		if (g00349EClass == null) {
			g00349EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(351);
		}
		return g00349EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00350() {
		if (g00350EClass == null) {
			g00350EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(352);
		}
		return g00350EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00351() {
		if (g00351EClass == null) {
			g00351EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(353);
		}
		return g00351EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00352() {
		if (g00352EClass == null) {
			g00352EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(354);
		}
		return g00352EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00353() {
		if (g00353EClass == null) {
			g00353EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(355);
		}
		return g00353EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00354() {
		if (g00354EClass == null) {
			g00354EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(356);
		}
		return g00354EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00355() {
		if (g00355EClass == null) {
			g00355EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(357);
		}
		return g00355EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00356() {
		if (g00356EClass == null) {
			g00356EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(358);
		}
		return g00356EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00357() {
		if (g00357EClass == null) {
			g00357EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(359);
		}
		return g00357EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00358() {
		if (g00358EClass == null) {
			g00358EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(360);
		}
		return g00358EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00359() {
		if (g00359EClass == null) {
			g00359EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(361);
		}
		return g00359EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00360() {
		if (g00360EClass == null) {
			g00360EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(362);
		}
		return g00360EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00361() {
		if (g00361EClass == null) {
			g00361EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(363);
		}
		return g00361EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00362() {
		if (g00362EClass == null) {
			g00362EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(364);
		}
		return g00362EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00363() {
		if (g00363EClass == null) {
			g00363EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(365);
		}
		return g00363EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00364() {
		if (g00364EClass == null) {
			g00364EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(366);
		}
		return g00364EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00365() {
		if (g00365EClass == null) {
			g00365EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(367);
		}
		return g00365EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00366() {
		if (g00366EClass == null) {
			g00366EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(368);
		}
		return g00366EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00367() {
		if (g00367EClass == null) {
			g00367EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(369);
		}
		return g00367EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00368() {
		if (g00368EClass == null) {
			g00368EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(370);
		}
		return g00368EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00369() {
		if (g00369EClass == null) {
			g00369EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(371);
		}
		return g00369EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00370() {
		if (g00370EClass == null) {
			g00370EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(372);
		}
		return g00370EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00371() {
		if (g00371EClass == null) {
			g00371EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(373);
		}
		return g00371EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00372() {
		if (g00372EClass == null) {
			g00372EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(374);
		}
		return g00372EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00373() {
		if (g00373EClass == null) {
			g00373EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(375);
		}
		return g00373EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00374() {
		if (g00374EClass == null) {
			g00374EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(376);
		}
		return g00374EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00375() {
		if (g00375EClass == null) {
			g00375EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(377);
		}
		return g00375EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00376() {
		if (g00376EClass == null) {
			g00376EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(378);
		}
		return g00376EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00377() {
		if (g00377EClass == null) {
			g00377EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(379);
		}
		return g00377EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00378() {
		if (g00378EClass == null) {
			g00378EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(380);
		}
		return g00378EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00379() {
		if (g00379EClass == null) {
			g00379EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(381);
		}
		return g00379EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00380() {
		if (g00380EClass == null) {
			g00380EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(382);
		}
		return g00380EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00381() {
		if (g00381EClass == null) {
			g00381EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(383);
		}
		return g00381EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00382() {
		if (g00382EClass == null) {
			g00382EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(384);
		}
		return g00382EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00383() {
		if (g00383EClass == null) {
			g00383EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(385);
		}
		return g00383EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00384() {
		if (g00384EClass == null) {
			g00384EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(386);
		}
		return g00384EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00385() {
		if (g00385EClass == null) {
			g00385EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(387);
		}
		return g00385EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00386() {
		if (g00386EClass == null) {
			g00386EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(388);
		}
		return g00386EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00387() {
		if (g00387EClass == null) {
			g00387EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(389);
		}
		return g00387EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00388() {
		if (g00388EClass == null) {
			g00388EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(390);
		}
		return g00388EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00389() {
		if (g00389EClass == null) {
			g00389EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(391);
		}
		return g00389EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00390() {
		if (g00390EClass == null) {
			g00390EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(392);
		}
		return g00390EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00391() {
		if (g00391EClass == null) {
			g00391EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(393);
		}
		return g00391EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00392() {
		if (g00392EClass == null) {
			g00392EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(394);
		}
		return g00392EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00393() {
		if (g00393EClass == null) {
			g00393EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(395);
		}
		return g00393EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00394() {
		if (g00394EClass == null) {
			g00394EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(396);
		}
		return g00394EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00395() {
		if (g00395EClass == null) {
			g00395EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(397);
		}
		return g00395EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00396() {
		if (g00396EClass == null) {
			g00396EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(398);
		}
		return g00396EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00397() {
		if (g00397EClass == null) {
			g00397EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(399);
		}
		return g00397EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00398() {
		if (g00398EClass == null) {
			g00398EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(400);
		}
		return g00398EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00399() {
		if (g00399EClass == null) {
			g00399EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(401);
		}
		return g00399EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00400() {
		if (g00400EClass == null) {
			g00400EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(402);
		}
		return g00400EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00401() {
		if (g00401EClass == null) {
			g00401EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(403);
		}
		return g00401EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00402() {
		if (g00402EClass == null) {
			g00402EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(404);
		}
		return g00402EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00403() {
		if (g00403EClass == null) {
			g00403EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(405);
		}
		return g00403EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00404() {
		if (g00404EClass == null) {
			g00404EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(406);
		}
		return g00404EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00405() {
		if (g00405EClass == null) {
			g00405EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(407);
		}
		return g00405EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00406() {
		if (g00406EClass == null) {
			g00406EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(408);
		}
		return g00406EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00407() {
		if (g00407EClass == null) {
			g00407EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(409);
		}
		return g00407EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00408() {
		if (g00408EClass == null) {
			g00408EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(410);
		}
		return g00408EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00409() {
		if (g00409EClass == null) {
			g00409EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(411);
		}
		return g00409EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00410() {
		if (g00410EClass == null) {
			g00410EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(412);
		}
		return g00410EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00411() {
		if (g00411EClass == null) {
			g00411EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(413);
		}
		return g00411EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00412() {
		if (g00412EClass == null) {
			g00412EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(414);
		}
		return g00412EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00413() {
		if (g00413EClass == null) {
			g00413EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(415);
		}
		return g00413EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00414() {
		if (g00414EClass == null) {
			g00414EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(416);
		}
		return g00414EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00415() {
		if (g00415EClass == null) {
			g00415EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(417);
		}
		return g00415EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00416() {
		if (g00416EClass == null) {
			g00416EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(418);
		}
		return g00416EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00417() {
		if (g00417EClass == null) {
			g00417EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(419);
		}
		return g00417EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00418() {
		if (g00418EClass == null) {
			g00418EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(420);
		}
		return g00418EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00419() {
		if (g00419EClass == null) {
			g00419EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(421);
		}
		return g00419EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00420() {
		if (g00420EClass == null) {
			g00420EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(422);
		}
		return g00420EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00421() {
		if (g00421EClass == null) {
			g00421EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(423);
		}
		return g00421EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00422() {
		if (g00422EClass == null) {
			g00422EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(424);
		}
		return g00422EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00423() {
		if (g00423EClass == null) {
			g00423EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(425);
		}
		return g00423EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00424() {
		if (g00424EClass == null) {
			g00424EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(426);
		}
		return g00424EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00425() {
		if (g00425EClass == null) {
			g00425EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(427);
		}
		return g00425EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00426() {
		if (g00426EClass == null) {
			g00426EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(428);
		}
		return g00426EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00427() {
		if (g00427EClass == null) {
			g00427EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(429);
		}
		return g00427EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00428() {
		if (g00428EClass == null) {
			g00428EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(430);
		}
		return g00428EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00429() {
		if (g00429EClass == null) {
			g00429EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(431);
		}
		return g00429EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00430() {
		if (g00430EClass == null) {
			g00430EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(432);
		}
		return g00430EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00431() {
		if (g00431EClass == null) {
			g00431EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(433);
		}
		return g00431EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00432() {
		if (g00432EClass == null) {
			g00432EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(434);
		}
		return g00432EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00433() {
		if (g00433EClass == null) {
			g00433EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(435);
		}
		return g00433EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00434() {
		if (g00434EClass == null) {
			g00434EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(436);
		}
		return g00434EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00435() {
		if (g00435EClass == null) {
			g00435EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(437);
		}
		return g00435EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00436() {
		if (g00436EClass == null) {
			g00436EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(438);
		}
		return g00436EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00437() {
		if (g00437EClass == null) {
			g00437EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(439);
		}
		return g00437EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00438() {
		if (g00438EClass == null) {
			g00438EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(440);
		}
		return g00438EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00439() {
		if (g00439EClass == null) {
			g00439EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(441);
		}
		return g00439EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00440() {
		if (g00440EClass == null) {
			g00440EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(442);
		}
		return g00440EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00441() {
		if (g00441EClass == null) {
			g00441EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(443);
		}
		return g00441EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00442() {
		if (g00442EClass == null) {
			g00442EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(444);
		}
		return g00442EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00443() {
		if (g00443EClass == null) {
			g00443EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(445);
		}
		return g00443EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00444() {
		if (g00444EClass == null) {
			g00444EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(446);
		}
		return g00444EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00445() {
		if (g00445EClass == null) {
			g00445EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(447);
		}
		return g00445EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00446() {
		if (g00446EClass == null) {
			g00446EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(448);
		}
		return g00446EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00447() {
		if (g00447EClass == null) {
			g00447EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(449);
		}
		return g00447EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00448() {
		if (g00448EClass == null) {
			g00448EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(450);
		}
		return g00448EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00449() {
		if (g00449EClass == null) {
			g00449EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(451);
		}
		return g00449EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00450() {
		if (g00450EClass == null) {
			g00450EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(452);
		}
		return g00450EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00451() {
		if (g00451EClass == null) {
			g00451EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(453);
		}
		return g00451EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00452() {
		if (g00452EClass == null) {
			g00452EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(454);
		}
		return g00452EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00453() {
		if (g00453EClass == null) {
			g00453EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(455);
		}
		return g00453EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00454() {
		if (g00454EClass == null) {
			g00454EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(456);
		}
		return g00454EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00455() {
		if (g00455EClass == null) {
			g00455EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(457);
		}
		return g00455EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00456() {
		if (g00456EClass == null) {
			g00456EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(458);
		}
		return g00456EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00457() {
		if (g00457EClass == null) {
			g00457EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(459);
		}
		return g00457EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00458() {
		if (g00458EClass == null) {
			g00458EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(460);
		}
		return g00458EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00459() {
		if (g00459EClass == null) {
			g00459EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(461);
		}
		return g00459EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00460() {
		if (g00460EClass == null) {
			g00460EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(462);
		}
		return g00460EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00461() {
		if (g00461EClass == null) {
			g00461EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(463);
		}
		return g00461EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00462() {
		if (g00462EClass == null) {
			g00462EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(464);
		}
		return g00462EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00463() {
		if (g00463EClass == null) {
			g00463EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(465);
		}
		return g00463EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00464() {
		if (g00464EClass == null) {
			g00464EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(466);
		}
		return g00464EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00465() {
		if (g00465EClass == null) {
			g00465EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(467);
		}
		return g00465EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00466() {
		if (g00466EClass == null) {
			g00466EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(468);
		}
		return g00466EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00467() {
		if (g00467EClass == null) {
			g00467EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(469);
		}
		return g00467EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00468() {
		if (g00468EClass == null) {
			g00468EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(470);
		}
		return g00468EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00469() {
		if (g00469EClass == null) {
			g00469EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(471);
		}
		return g00469EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00470() {
		if (g00470EClass == null) {
			g00470EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(472);
		}
		return g00470EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00471() {
		if (g00471EClass == null) {
			g00471EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(473);
		}
		return g00471EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00472() {
		if (g00472EClass == null) {
			g00472EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(474);
		}
		return g00472EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00473() {
		if (g00473EClass == null) {
			g00473EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(475);
		}
		return g00473EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00474() {
		if (g00474EClass == null) {
			g00474EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(476);
		}
		return g00474EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00475() {
		if (g00475EClass == null) {
			g00475EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(477);
		}
		return g00475EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00476() {
		if (g00476EClass == null) {
			g00476EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(478);
		}
		return g00476EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00477() {
		if (g00477EClass == null) {
			g00477EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(479);
		}
		return g00477EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00478() {
		if (g00478EClass == null) {
			g00478EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(480);
		}
		return g00478EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00479() {
		if (g00479EClass == null) {
			g00479EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(481);
		}
		return g00479EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00480() {
		if (g00480EClass == null) {
			g00480EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(482);
		}
		return g00480EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00481() {
		if (g00481EClass == null) {
			g00481EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(483);
		}
		return g00481EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00482() {
		if (g00482EClass == null) {
			g00482EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(484);
		}
		return g00482EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00483() {
		if (g00483EClass == null) {
			g00483EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(485);
		}
		return g00483EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00484() {
		if (g00484EClass == null) {
			g00484EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(486);
		}
		return g00484EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00485() {
		if (g00485EClass == null) {
			g00485EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(487);
		}
		return g00485EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00486() {
		if (g00486EClass == null) {
			g00486EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(488);
		}
		return g00486EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00487() {
		if (g00487EClass == null) {
			g00487EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(489);
		}
		return g00487EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00488() {
		if (g00488EClass == null) {
			g00488EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(490);
		}
		return g00488EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00489() {
		if (g00489EClass == null) {
			g00489EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(491);
		}
		return g00489EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00490() {
		if (g00490EClass == null) {
			g00490EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(492);
		}
		return g00490EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00491() {
		if (g00491EClass == null) {
			g00491EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(493);
		}
		return g00491EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00492() {
		if (g00492EClass == null) {
			g00492EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(494);
		}
		return g00492EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00493() {
		if (g00493EClass == null) {
			g00493EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(495);
		}
		return g00493EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00494() {
		if (g00494EClass == null) {
			g00494EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(496);
		}
		return g00494EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00495() {
		if (g00495EClass == null) {
			g00495EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(497);
		}
		return g00495EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00496() {
		if (g00496EClass == null) {
			g00496EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(498);
		}
		return g00496EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00497() {
		if (g00497EClass == null) {
			g00497EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(499);
		}
		return g00497EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00498() {
		if (g00498EClass == null) {
			g00498EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(500);
		}
		return g00498EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00499() {
		if (g00499EClass == null) {
			g00499EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(501);
		}
		return g00499EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00500() {
		if (g00500EClass == null) {
			g00500EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(502);
		}
		return g00500EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00501() {
		if (g00501EClass == null) {
			g00501EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(503);
		}
		return g00501EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00502() {
		if (g00502EClass == null) {
			g00502EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(504);
		}
		return g00502EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00503() {
		if (g00503EClass == null) {
			g00503EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(505);
		}
		return g00503EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00504() {
		if (g00504EClass == null) {
			g00504EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(506);
		}
		return g00504EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00505() {
		if (g00505EClass == null) {
			g00505EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(507);
		}
		return g00505EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00506() {
		if (g00506EClass == null) {
			g00506EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(508);
		}
		return g00506EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00507() {
		if (g00507EClass == null) {
			g00507EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(509);
		}
		return g00507EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00508() {
		if (g00508EClass == null) {
			g00508EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(510);
		}
		return g00508EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00509() {
		if (g00509EClass == null) {
			g00509EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(511);
		}
		return g00509EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00510() {
		if (g00510EClass == null) {
			g00510EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(512);
		}
		return g00510EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00511() {
		if (g00511EClass == null) {
			g00511EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(513);
		}
		return g00511EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00512() {
		if (g00512EClass == null) {
			g00512EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(514);
		}
		return g00512EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00513() {
		if (g00513EClass == null) {
			g00513EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(515);
		}
		return g00513EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00514() {
		if (g00514EClass == null) {
			g00514EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(516);
		}
		return g00514EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00515() {
		if (g00515EClass == null) {
			g00515EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(517);
		}
		return g00515EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00516() {
		if (g00516EClass == null) {
			g00516EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(518);
		}
		return g00516EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00517() {
		if (g00517EClass == null) {
			g00517EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(519);
		}
		return g00517EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00518() {
		if (g00518EClass == null) {
			g00518EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(520);
		}
		return g00518EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00519() {
		if (g00519EClass == null) {
			g00519EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(521);
		}
		return g00519EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00520() {
		if (g00520EClass == null) {
			g00520EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(522);
		}
		return g00520EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00521() {
		if (g00521EClass == null) {
			g00521EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(523);
		}
		return g00521EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00522() {
		if (g00522EClass == null) {
			g00522EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(524);
		}
		return g00522EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00523() {
		if (g00523EClass == null) {
			g00523EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(525);
		}
		return g00523EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00524() {
		if (g00524EClass == null) {
			g00524EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(526);
		}
		return g00524EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00525() {
		if (g00525EClass == null) {
			g00525EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(527);
		}
		return g00525EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00526() {
		if (g00526EClass == null) {
			g00526EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(528);
		}
		return g00526EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00527() {
		if (g00527EClass == null) {
			g00527EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(529);
		}
		return g00527EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00528() {
		if (g00528EClass == null) {
			g00528EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(530);
		}
		return g00528EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00529() {
		if (g00529EClass == null) {
			g00529EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(531);
		}
		return g00529EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00530() {
		if (g00530EClass == null) {
			g00530EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(532);
		}
		return g00530EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00531() {
		if (g00531EClass == null) {
			g00531EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(533);
		}
		return g00531EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00532() {
		if (g00532EClass == null) {
			g00532EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(534);
		}
		return g00532EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00533() {
		if (g00533EClass == null) {
			g00533EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(535);
		}
		return g00533EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00534() {
		if (g00534EClass == null) {
			g00534EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(536);
		}
		return g00534EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00535() {
		if (g00535EClass == null) {
			g00535EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(537);
		}
		return g00535EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00536() {
		if (g00536EClass == null) {
			g00536EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(538);
		}
		return g00536EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00537() {
		if (g00537EClass == null) {
			g00537EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(539);
		}
		return g00537EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00538() {
		if (g00538EClass == null) {
			g00538EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(540);
		}
		return g00538EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00539() {
		if (g00539EClass == null) {
			g00539EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(541);
		}
		return g00539EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00540() {
		if (g00540EClass == null) {
			g00540EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(542);
		}
		return g00540EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00541() {
		if (g00541EClass == null) {
			g00541EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(543);
		}
		return g00541EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00542() {
		if (g00542EClass == null) {
			g00542EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(544);
		}
		return g00542EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00543() {
		if (g00543EClass == null) {
			g00543EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(545);
		}
		return g00543EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00544() {
		if (g00544EClass == null) {
			g00544EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(546);
		}
		return g00544EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00545() {
		if (g00545EClass == null) {
			g00545EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(547);
		}
		return g00545EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00546() {
		if (g00546EClass == null) {
			g00546EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(548);
		}
		return g00546EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00547() {
		if (g00547EClass == null) {
			g00547EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(549);
		}
		return g00547EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00548() {
		if (g00548EClass == null) {
			g00548EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(550);
		}
		return g00548EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00549() {
		if (g00549EClass == null) {
			g00549EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(551);
		}
		return g00549EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00550() {
		if (g00550EClass == null) {
			g00550EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(552);
		}
		return g00550EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00551() {
		if (g00551EClass == null) {
			g00551EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(553);
		}
		return g00551EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00552() {
		if (g00552EClass == null) {
			g00552EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(554);
		}
		return g00552EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00553() {
		if (g00553EClass == null) {
			g00553EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(555);
		}
		return g00553EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00554() {
		if (g00554EClass == null) {
			g00554EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(556);
		}
		return g00554EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00555() {
		if (g00555EClass == null) {
			g00555EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(557);
		}
		return g00555EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00556() {
		if (g00556EClass == null) {
			g00556EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(558);
		}
		return g00556EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00557() {
		if (g00557EClass == null) {
			g00557EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(559);
		}
		return g00557EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00558() {
		if (g00558EClass == null) {
			g00558EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(560);
		}
		return g00558EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00559() {
		if (g00559EClass == null) {
			g00559EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(561);
		}
		return g00559EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00560() {
		if (g00560EClass == null) {
			g00560EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(562);
		}
		return g00560EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00561() {
		if (g00561EClass == null) {
			g00561EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(563);
		}
		return g00561EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00562() {
		if (g00562EClass == null) {
			g00562EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(564);
		}
		return g00562EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00563() {
		if (g00563EClass == null) {
			g00563EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(565);
		}
		return g00563EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00564() {
		if (g00564EClass == null) {
			g00564EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(566);
		}
		return g00564EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00565() {
		if (g00565EClass == null) {
			g00565EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(567);
		}
		return g00565EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00566() {
		if (g00566EClass == null) {
			g00566EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(568);
		}
		return g00566EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00567() {
		if (g00567EClass == null) {
			g00567EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(569);
		}
		return g00567EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00568() {
		if (g00568EClass == null) {
			g00568EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(570);
		}
		return g00568EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00569() {
		if (g00569EClass == null) {
			g00569EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(571);
		}
		return g00569EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00570() {
		if (g00570EClass == null) {
			g00570EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(572);
		}
		return g00570EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00571() {
		if (g00571EClass == null) {
			g00571EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(573);
		}
		return g00571EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00572() {
		if (g00572EClass == null) {
			g00572EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(574);
		}
		return g00572EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00573() {
		if (g00573EClass == null) {
			g00573EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(575);
		}
		return g00573EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00574() {
		if (g00574EClass == null) {
			g00574EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(576);
		}
		return g00574EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00575() {
		if (g00575EClass == null) {
			g00575EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(577);
		}
		return g00575EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00576() {
		if (g00576EClass == null) {
			g00576EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(578);
		}
		return g00576EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00577() {
		if (g00577EClass == null) {
			g00577EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(579);
		}
		return g00577EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00578() {
		if (g00578EClass == null) {
			g00578EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(580);
		}
		return g00578EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00579() {
		if (g00579EClass == null) {
			g00579EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(581);
		}
		return g00579EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00580() {
		if (g00580EClass == null) {
			g00580EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(582);
		}
		return g00580EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00581() {
		if (g00581EClass == null) {
			g00581EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(583);
		}
		return g00581EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00582() {
		if (g00582EClass == null) {
			g00582EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(584);
		}
		return g00582EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00583() {
		if (g00583EClass == null) {
			g00583EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(585);
		}
		return g00583EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00584() {
		if (g00584EClass == null) {
			g00584EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(586);
		}
		return g00584EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00585() {
		if (g00585EClass == null) {
			g00585EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(587);
		}
		return g00585EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00586() {
		if (g00586EClass == null) {
			g00586EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(588);
		}
		return g00586EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00587() {
		if (g00587EClass == null) {
			g00587EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(589);
		}
		return g00587EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00588() {
		if (g00588EClass == null) {
			g00588EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(590);
		}
		return g00588EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00589() {
		if (g00589EClass == null) {
			g00589EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(591);
		}
		return g00589EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00590() {
		if (g00590EClass == null) {
			g00590EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(592);
		}
		return g00590EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00591() {
		if (g00591EClass == null) {
			g00591EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(593);
		}
		return g00591EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00592() {
		if (g00592EClass == null) {
			g00592EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(594);
		}
		return g00592EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00593() {
		if (g00593EClass == null) {
			g00593EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(595);
		}
		return g00593EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00594() {
		if (g00594EClass == null) {
			g00594EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(596);
		}
		return g00594EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00595() {
		if (g00595EClass == null) {
			g00595EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(597);
		}
		return g00595EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00596() {
		if (g00596EClass == null) {
			g00596EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(598);
		}
		return g00596EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00597() {
		if (g00597EClass == null) {
			g00597EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(599);
		}
		return g00597EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00598() {
		if (g00598EClass == null) {
			g00598EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(600);
		}
		return g00598EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00599() {
		if (g00599EClass == null) {
			g00599EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(601);
		}
		return g00599EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00600() {
		if (g00600EClass == null) {
			g00600EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(602);
		}
		return g00600EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00601() {
		if (g00601EClass == null) {
			g00601EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(603);
		}
		return g00601EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00602() {
		if (g00602EClass == null) {
			g00602EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(604);
		}
		return g00602EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00603() {
		if (g00603EClass == null) {
			g00603EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(605);
		}
		return g00603EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00604() {
		if (g00604EClass == null) {
			g00604EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(606);
		}
		return g00604EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00605() {
		if (g00605EClass == null) {
			g00605EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(607);
		}
		return g00605EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00606() {
		if (g00606EClass == null) {
			g00606EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(608);
		}
		return g00606EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00607() {
		if (g00607EClass == null) {
			g00607EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(609);
		}
		return g00607EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00608() {
		if (g00608EClass == null) {
			g00608EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(610);
		}
		return g00608EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00609() {
		if (g00609EClass == null) {
			g00609EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(611);
		}
		return g00609EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00610() {
		if (g00610EClass == null) {
			g00610EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(612);
		}
		return g00610EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00611() {
		if (g00611EClass == null) {
			g00611EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(613);
		}
		return g00611EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00612() {
		if (g00612EClass == null) {
			g00612EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(614);
		}
		return g00612EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00613() {
		if (g00613EClass == null) {
			g00613EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(615);
		}
		return g00613EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00614() {
		if (g00614EClass == null) {
			g00614EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(616);
		}
		return g00614EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00615() {
		if (g00615EClass == null) {
			g00615EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(617);
		}
		return g00615EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00616() {
		if (g00616EClass == null) {
			g00616EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(618);
		}
		return g00616EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00617() {
		if (g00617EClass == null) {
			g00617EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(619);
		}
		return g00617EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00618() {
		if (g00618EClass == null) {
			g00618EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(620);
		}
		return g00618EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00619() {
		if (g00619EClass == null) {
			g00619EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(621);
		}
		return g00619EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00620() {
		if (g00620EClass == null) {
			g00620EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(622);
		}
		return g00620EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00621() {
		if (g00621EClass == null) {
			g00621EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(623);
		}
		return g00621EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00622() {
		if (g00622EClass == null) {
			g00622EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(624);
		}
		return g00622EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00623() {
		if (g00623EClass == null) {
			g00623EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(625);
		}
		return g00623EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00624() {
		if (g00624EClass == null) {
			g00624EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(626);
		}
		return g00624EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00625() {
		if (g00625EClass == null) {
			g00625EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(627);
		}
		return g00625EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00626() {
		if (g00626EClass == null) {
			g00626EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(628);
		}
		return g00626EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00627() {
		if (g00627EClass == null) {
			g00627EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(629);
		}
		return g00627EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00628() {
		if (g00628EClass == null) {
			g00628EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(630);
		}
		return g00628EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00629() {
		if (g00629EClass == null) {
			g00629EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(631);
		}
		return g00629EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00630() {
		if (g00630EClass == null) {
			g00630EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(632);
		}
		return g00630EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00631() {
		if (g00631EClass == null) {
			g00631EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(633);
		}
		return g00631EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00632() {
		if (g00632EClass == null) {
			g00632EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(634);
		}
		return g00632EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00633() {
		if (g00633EClass == null) {
			g00633EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(635);
		}
		return g00633EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00634() {
		if (g00634EClass == null) {
			g00634EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(636);
		}
		return g00634EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00635() {
		if (g00635EClass == null) {
			g00635EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(637);
		}
		return g00635EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00636() {
		if (g00636EClass == null) {
			g00636EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(638);
		}
		return g00636EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00637() {
		if (g00637EClass == null) {
			g00637EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(639);
		}
		return g00637EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00638() {
		if (g00638EClass == null) {
			g00638EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(640);
		}
		return g00638EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00639() {
		if (g00639EClass == null) {
			g00639EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(641);
		}
		return g00639EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00640() {
		if (g00640EClass == null) {
			g00640EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(642);
		}
		return g00640EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00641() {
		if (g00641EClass == null) {
			g00641EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(643);
		}
		return g00641EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00642() {
		if (g00642EClass == null) {
			g00642EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(644);
		}
		return g00642EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00643() {
		if (g00643EClass == null) {
			g00643EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(645);
		}
		return g00643EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00644() {
		if (g00644EClass == null) {
			g00644EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(646);
		}
		return g00644EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00645() {
		if (g00645EClass == null) {
			g00645EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(647);
		}
		return g00645EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00646() {
		if (g00646EClass == null) {
			g00646EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(648);
		}
		return g00646EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00647() {
		if (g00647EClass == null) {
			g00647EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(649);
		}
		return g00647EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00648() {
		if (g00648EClass == null) {
			g00648EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(650);
		}
		return g00648EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00649() {
		if (g00649EClass == null) {
			g00649EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(651);
		}
		return g00649EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00650() {
		if (g00650EClass == null) {
			g00650EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(652);
		}
		return g00650EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00651() {
		if (g00651EClass == null) {
			g00651EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(653);
		}
		return g00651EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00652() {
		if (g00652EClass == null) {
			g00652EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(654);
		}
		return g00652EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00653() {
		if (g00653EClass == null) {
			g00653EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(655);
		}
		return g00653EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00654() {
		if (g00654EClass == null) {
			g00654EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(656);
		}
		return g00654EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00655() {
		if (g00655EClass == null) {
			g00655EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(657);
		}
		return g00655EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00656() {
		if (g00656EClass == null) {
			g00656EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(658);
		}
		return g00656EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00657() {
		if (g00657EClass == null) {
			g00657EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(659);
		}
		return g00657EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00658() {
		if (g00658EClass == null) {
			g00658EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(660);
		}
		return g00658EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00659() {
		if (g00659EClass == null) {
			g00659EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(661);
		}
		return g00659EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00660() {
		if (g00660EClass == null) {
			g00660EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(662);
		}
		return g00660EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00661() {
		if (g00661EClass == null) {
			g00661EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(663);
		}
		return g00661EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00662() {
		if (g00662EClass == null) {
			g00662EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(664);
		}
		return g00662EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00663() {
		if (g00663EClass == null) {
			g00663EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(665);
		}
		return g00663EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00664() {
		if (g00664EClass == null) {
			g00664EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(666);
		}
		return g00664EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00665() {
		if (g00665EClass == null) {
			g00665EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(667);
		}
		return g00665EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00666() {
		if (g00666EClass == null) {
			g00666EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(668);
		}
		return g00666EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00667() {
		if (g00667EClass == null) {
			g00667EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(669);
		}
		return g00667EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00668() {
		if (g00668EClass == null) {
			g00668EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(670);
		}
		return g00668EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00669() {
		if (g00669EClass == null) {
			g00669EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(671);
		}
		return g00669EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00670() {
		if (g00670EClass == null) {
			g00670EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(672);
		}
		return g00670EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00671() {
		if (g00671EClass == null) {
			g00671EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(673);
		}
		return g00671EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00672() {
		if (g00672EClass == null) {
			g00672EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(674);
		}
		return g00672EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00673() {
		if (g00673EClass == null) {
			g00673EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(675);
		}
		return g00673EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00674() {
		if (g00674EClass == null) {
			g00674EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(676);
		}
		return g00674EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00675() {
		if (g00675EClass == null) {
			g00675EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(677);
		}
		return g00675EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00676() {
		if (g00676EClass == null) {
			g00676EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(678);
		}
		return g00676EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00677() {
		if (g00677EClass == null) {
			g00677EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(679);
		}
		return g00677EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00678() {
		if (g00678EClass == null) {
			g00678EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(680);
		}
		return g00678EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00679() {
		if (g00679EClass == null) {
			g00679EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(681);
		}
		return g00679EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00680() {
		if (g00680EClass == null) {
			g00680EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(682);
		}
		return g00680EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00681() {
		if (g00681EClass == null) {
			g00681EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(683);
		}
		return g00681EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00682() {
		if (g00682EClass == null) {
			g00682EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(684);
		}
		return g00682EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00683() {
		if (g00683EClass == null) {
			g00683EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(685);
		}
		return g00683EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00684() {
		if (g00684EClass == null) {
			g00684EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(686);
		}
		return g00684EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00685() {
		if (g00685EClass == null) {
			g00685EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(687);
		}
		return g00685EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00686() {
		if (g00686EClass == null) {
			g00686EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(688);
		}
		return g00686EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00687() {
		if (g00687EClass == null) {
			g00687EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(689);
		}
		return g00687EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00688() {
		if (g00688EClass == null) {
			g00688EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(690);
		}
		return g00688EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00689() {
		if (g00689EClass == null) {
			g00689EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(691);
		}
		return g00689EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00690() {
		if (g00690EClass == null) {
			g00690EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(692);
		}
		return g00690EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00691() {
		if (g00691EClass == null) {
			g00691EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(693);
		}
		return g00691EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00692() {
		if (g00692EClass == null) {
			g00692EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(694);
		}
		return g00692EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00693() {
		if (g00693EClass == null) {
			g00693EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(695);
		}
		return g00693EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00694() {
		if (g00694EClass == null) {
			g00694EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(696);
		}
		return g00694EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00695() {
		if (g00695EClass == null) {
			g00695EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(697);
		}
		return g00695EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00696() {
		if (g00696EClass == null) {
			g00696EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(698);
		}
		return g00696EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00697() {
		if (g00697EClass == null) {
			g00697EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(699);
		}
		return g00697EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00698() {
		if (g00698EClass == null) {
			g00698EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(700);
		}
		return g00698EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00699() {
		if (g00699EClass == null) {
			g00699EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(701);
		}
		return g00699EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00700() {
		if (g00700EClass == null) {
			g00700EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(702);
		}
		return g00700EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00701() {
		if (g00701EClass == null) {
			g00701EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(703);
		}
		return g00701EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00702() {
		if (g00702EClass == null) {
			g00702EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(704);
		}
		return g00702EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00703() {
		if (g00703EClass == null) {
			g00703EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(705);
		}
		return g00703EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00704() {
		if (g00704EClass == null) {
			g00704EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(706);
		}
		return g00704EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00705() {
		if (g00705EClass == null) {
			g00705EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(707);
		}
		return g00705EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00706() {
		if (g00706EClass == null) {
			g00706EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(708);
		}
		return g00706EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00707() {
		if (g00707EClass == null) {
			g00707EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(709);
		}
		return g00707EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00708() {
		if (g00708EClass == null) {
			g00708EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(710);
		}
		return g00708EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00709() {
		if (g00709EClass == null) {
			g00709EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(711);
		}
		return g00709EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00710() {
		if (g00710EClass == null) {
			g00710EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(712);
		}
		return g00710EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00711() {
		if (g00711EClass == null) {
			g00711EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(713);
		}
		return g00711EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00712() {
		if (g00712EClass == null) {
			g00712EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(714);
		}
		return g00712EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00713() {
		if (g00713EClass == null) {
			g00713EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(715);
		}
		return g00713EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00714() {
		if (g00714EClass == null) {
			g00714EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(716);
		}
		return g00714EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00715() {
		if (g00715EClass == null) {
			g00715EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(717);
		}
		return g00715EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00716() {
		if (g00716EClass == null) {
			g00716EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(718);
		}
		return g00716EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00717() {
		if (g00717EClass == null) {
			g00717EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(719);
		}
		return g00717EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00718() {
		if (g00718EClass == null) {
			g00718EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(720);
		}
		return g00718EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00719() {
		if (g00719EClass == null) {
			g00719EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(721);
		}
		return g00719EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00720() {
		if (g00720EClass == null) {
			g00720EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(722);
		}
		return g00720EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00721() {
		if (g00721EClass == null) {
			g00721EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(723);
		}
		return g00721EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00722() {
		if (g00722EClass == null) {
			g00722EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(724);
		}
		return g00722EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00723() {
		if (g00723EClass == null) {
			g00723EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(725);
		}
		return g00723EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00724() {
		if (g00724EClass == null) {
			g00724EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(726);
		}
		return g00724EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00725() {
		if (g00725EClass == null) {
			g00725EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(727);
		}
		return g00725EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00726() {
		if (g00726EClass == null) {
			g00726EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(728);
		}
		return g00726EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00727() {
		if (g00727EClass == null) {
			g00727EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(729);
		}
		return g00727EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00728() {
		if (g00728EClass == null) {
			g00728EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(730);
		}
		return g00728EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00729() {
		if (g00729EClass == null) {
			g00729EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(731);
		}
		return g00729EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00730() {
		if (g00730EClass == null) {
			g00730EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(732);
		}
		return g00730EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00731() {
		if (g00731EClass == null) {
			g00731EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(733);
		}
		return g00731EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00732() {
		if (g00732EClass == null) {
			g00732EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(734);
		}
		return g00732EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00733() {
		if (g00733EClass == null) {
			g00733EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(735);
		}
		return g00733EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00734() {
		if (g00734EClass == null) {
			g00734EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(736);
		}
		return g00734EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00735() {
		if (g00735EClass == null) {
			g00735EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(737);
		}
		return g00735EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00736() {
		if (g00736EClass == null) {
			g00736EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(738);
		}
		return g00736EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00737() {
		if (g00737EClass == null) {
			g00737EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(739);
		}
		return g00737EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00738() {
		if (g00738EClass == null) {
			g00738EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(740);
		}
		return g00738EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00739() {
		if (g00739EClass == null) {
			g00739EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(741);
		}
		return g00739EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00740() {
		if (g00740EClass == null) {
			g00740EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(742);
		}
		return g00740EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00741() {
		if (g00741EClass == null) {
			g00741EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(743);
		}
		return g00741EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00742() {
		if (g00742EClass == null) {
			g00742EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(744);
		}
		return g00742EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00743() {
		if (g00743EClass == null) {
			g00743EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(745);
		}
		return g00743EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00744() {
		if (g00744EClass == null) {
			g00744EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(746);
		}
		return g00744EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00745() {
		if (g00745EClass == null) {
			g00745EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(747);
		}
		return g00745EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00746() {
		if (g00746EClass == null) {
			g00746EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(748);
		}
		return g00746EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00747() {
		if (g00747EClass == null) {
			g00747EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(749);
		}
		return g00747EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00748() {
		if (g00748EClass == null) {
			g00748EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(750);
		}
		return g00748EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00749() {
		if (g00749EClass == null) {
			g00749EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(751);
		}
		return g00749EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00750() {
		if (g00750EClass == null) {
			g00750EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(752);
		}
		return g00750EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00751() {
		if (g00751EClass == null) {
			g00751EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(753);
		}
		return g00751EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00752() {
		if (g00752EClass == null) {
			g00752EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(754);
		}
		return g00752EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00753() {
		if (g00753EClass == null) {
			g00753EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(755);
		}
		return g00753EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00754() {
		if (g00754EClass == null) {
			g00754EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(756);
		}
		return g00754EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00755() {
		if (g00755EClass == null) {
			g00755EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(757);
		}
		return g00755EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00756() {
		if (g00756EClass == null) {
			g00756EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(758);
		}
		return g00756EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00757() {
		if (g00757EClass == null) {
			g00757EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(759);
		}
		return g00757EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00758() {
		if (g00758EClass == null) {
			g00758EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(760);
		}
		return g00758EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00759() {
		if (g00759EClass == null) {
			g00759EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(761);
		}
		return g00759EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00760() {
		if (g00760EClass == null) {
			g00760EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(762);
		}
		return g00760EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00761() {
		if (g00761EClass == null) {
			g00761EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(763);
		}
		return g00761EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00762() {
		if (g00762EClass == null) {
			g00762EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(764);
		}
		return g00762EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00763() {
		if (g00763EClass == null) {
			g00763EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(765);
		}
		return g00763EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00764() {
		if (g00764EClass == null) {
			g00764EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(766);
		}
		return g00764EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00765() {
		if (g00765EClass == null) {
			g00765EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(767);
		}
		return g00765EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00766() {
		if (g00766EClass == null) {
			g00766EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(768);
		}
		return g00766EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00767() {
		if (g00767EClass == null) {
			g00767EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(769);
		}
		return g00767EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00768() {
		if (g00768EClass == null) {
			g00768EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(770);
		}
		return g00768EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00769() {
		if (g00769EClass == null) {
			g00769EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(771);
		}
		return g00769EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00770() {
		if (g00770EClass == null) {
			g00770EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(772);
		}
		return g00770EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00771() {
		if (g00771EClass == null) {
			g00771EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(773);
		}
		return g00771EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00772() {
		if (g00772EClass == null) {
			g00772EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(774);
		}
		return g00772EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00773() {
		if (g00773EClass == null) {
			g00773EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(775);
		}
		return g00773EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00774() {
		if (g00774EClass == null) {
			g00774EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(776);
		}
		return g00774EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00775() {
		if (g00775EClass == null) {
			g00775EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(777);
		}
		return g00775EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00776() {
		if (g00776EClass == null) {
			g00776EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(778);
		}
		return g00776EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00777() {
		if (g00777EClass == null) {
			g00777EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(779);
		}
		return g00777EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00778() {
		if (g00778EClass == null) {
			g00778EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(780);
		}
		return g00778EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00779() {
		if (g00779EClass == null) {
			g00779EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(781);
		}
		return g00779EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00780() {
		if (g00780EClass == null) {
			g00780EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(782);
		}
		return g00780EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00781() {
		if (g00781EClass == null) {
			g00781EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(783);
		}
		return g00781EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00782() {
		if (g00782EClass == null) {
			g00782EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(784);
		}
		return g00782EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00783() {
		if (g00783EClass == null) {
			g00783EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(785);
		}
		return g00783EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00784() {
		if (g00784EClass == null) {
			g00784EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(786);
		}
		return g00784EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00785() {
		if (g00785EClass == null) {
			g00785EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(787);
		}
		return g00785EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00786() {
		if (g00786EClass == null) {
			g00786EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(788);
		}
		return g00786EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00787() {
		if (g00787EClass == null) {
			g00787EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(789);
		}
		return g00787EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00788() {
		if (g00788EClass == null) {
			g00788EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(790);
		}
		return g00788EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00789() {
		if (g00789EClass == null) {
			g00789EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(791);
		}
		return g00789EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00790() {
		if (g00790EClass == null) {
			g00790EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(792);
		}
		return g00790EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00791() {
		if (g00791EClass == null) {
			g00791EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(793);
		}
		return g00791EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00792() {
		if (g00792EClass == null) {
			g00792EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(794);
		}
		return g00792EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00793() {
		if (g00793EClass == null) {
			g00793EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(795);
		}
		return g00793EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00794() {
		if (g00794EClass == null) {
			g00794EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(796);
		}
		return g00794EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00795() {
		if (g00795EClass == null) {
			g00795EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(797);
		}
		return g00795EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00796() {
		if (g00796EClass == null) {
			g00796EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(798);
		}
		return g00796EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00797() {
		if (g00797EClass == null) {
			g00797EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(799);
		}
		return g00797EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00798() {
		if (g00798EClass == null) {
			g00798EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(800);
		}
		return g00798EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00799() {
		if (g00799EClass == null) {
			g00799EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(801);
		}
		return g00799EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00800() {
		if (g00800EClass == null) {
			g00800EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(802);
		}
		return g00800EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00801() {
		if (g00801EClass == null) {
			g00801EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(803);
		}
		return g00801EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00802() {
		if (g00802EClass == null) {
			g00802EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(804);
		}
		return g00802EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00803() {
		if (g00803EClass == null) {
			g00803EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(805);
		}
		return g00803EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00804() {
		if (g00804EClass == null) {
			g00804EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(806);
		}
		return g00804EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00805() {
		if (g00805EClass == null) {
			g00805EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(807);
		}
		return g00805EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00806() {
		if (g00806EClass == null) {
			g00806EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(808);
		}
		return g00806EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00807() {
		if (g00807EClass == null) {
			g00807EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(809);
		}
		return g00807EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00808() {
		if (g00808EClass == null) {
			g00808EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(810);
		}
		return g00808EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00809() {
		if (g00809EClass == null) {
			g00809EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(811);
		}
		return g00809EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00810() {
		if (g00810EClass == null) {
			g00810EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(812);
		}
		return g00810EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00811() {
		if (g00811EClass == null) {
			g00811EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(813);
		}
		return g00811EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00812() {
		if (g00812EClass == null) {
			g00812EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(814);
		}
		return g00812EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00813() {
		if (g00813EClass == null) {
			g00813EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(815);
		}
		return g00813EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00814() {
		if (g00814EClass == null) {
			g00814EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(816);
		}
		return g00814EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00815() {
		if (g00815EClass == null) {
			g00815EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(817);
		}
		return g00815EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00816() {
		if (g00816EClass == null) {
			g00816EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(818);
		}
		return g00816EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00817() {
		if (g00817EClass == null) {
			g00817EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(819);
		}
		return g00817EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00818() {
		if (g00818EClass == null) {
			g00818EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(820);
		}
		return g00818EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00819() {
		if (g00819EClass == null) {
			g00819EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(821);
		}
		return g00819EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00820() {
		if (g00820EClass == null) {
			g00820EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(822);
		}
		return g00820EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00821() {
		if (g00821EClass == null) {
			g00821EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(823);
		}
		return g00821EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00822() {
		if (g00822EClass == null) {
			g00822EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(824);
		}
		return g00822EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00823() {
		if (g00823EClass == null) {
			g00823EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(825);
		}
		return g00823EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00824() {
		if (g00824EClass == null) {
			g00824EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(826);
		}
		return g00824EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00825() {
		if (g00825EClass == null) {
			g00825EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(827);
		}
		return g00825EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00826() {
		if (g00826EClass == null) {
			g00826EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(828);
		}
		return g00826EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00827() {
		if (g00827EClass == null) {
			g00827EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(829);
		}
		return g00827EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00828() {
		if (g00828EClass == null) {
			g00828EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(830);
		}
		return g00828EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00829() {
		if (g00829EClass == null) {
			g00829EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(831);
		}
		return g00829EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00830() {
		if (g00830EClass == null) {
			g00830EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(832);
		}
		return g00830EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00831() {
		if (g00831EClass == null) {
			g00831EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(833);
		}
		return g00831EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00832() {
		if (g00832EClass == null) {
			g00832EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(834);
		}
		return g00832EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00833() {
		if (g00833EClass == null) {
			g00833EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(835);
		}
		return g00833EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00834() {
		if (g00834EClass == null) {
			g00834EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(836);
		}
		return g00834EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00835() {
		if (g00835EClass == null) {
			g00835EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(837);
		}
		return g00835EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00836() {
		if (g00836EClass == null) {
			g00836EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(838);
		}
		return g00836EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00837() {
		if (g00837EClass == null) {
			g00837EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(839);
		}
		return g00837EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00838() {
		if (g00838EClass == null) {
			g00838EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(840);
		}
		return g00838EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00839() {
		if (g00839EClass == null) {
			g00839EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(841);
		}
		return g00839EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00840() {
		if (g00840EClass == null) {
			g00840EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(842);
		}
		return g00840EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00841() {
		if (g00841EClass == null) {
			g00841EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(843);
		}
		return g00841EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00842() {
		if (g00842EClass == null) {
			g00842EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(844);
		}
		return g00842EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00843() {
		if (g00843EClass == null) {
			g00843EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(845);
		}
		return g00843EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00844() {
		if (g00844EClass == null) {
			g00844EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(846);
		}
		return g00844EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00845() {
		if (g00845EClass == null) {
			g00845EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(847);
		}
		return g00845EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00846() {
		if (g00846EClass == null) {
			g00846EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(848);
		}
		return g00846EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00847() {
		if (g00847EClass == null) {
			g00847EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(849);
		}
		return g00847EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00848() {
		if (g00848EClass == null) {
			g00848EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(850);
		}
		return g00848EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00849() {
		if (g00849EClass == null) {
			g00849EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(851);
		}
		return g00849EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00850() {
		if (g00850EClass == null) {
			g00850EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(852);
		}
		return g00850EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00851() {
		if (g00851EClass == null) {
			g00851EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(853);
		}
		return g00851EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00852() {
		if (g00852EClass == null) {
			g00852EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(854);
		}
		return g00852EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00853() {
		if (g00853EClass == null) {
			g00853EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(855);
		}
		return g00853EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00854() {
		if (g00854EClass == null) {
			g00854EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(856);
		}
		return g00854EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00855() {
		if (g00855EClass == null) {
			g00855EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(857);
		}
		return g00855EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00856() {
		if (g00856EClass == null) {
			g00856EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(858);
		}
		return g00856EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00857() {
		if (g00857EClass == null) {
			g00857EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(859);
		}
		return g00857EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00858() {
		if (g00858EClass == null) {
			g00858EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(860);
		}
		return g00858EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00859() {
		if (g00859EClass == null) {
			g00859EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(861);
		}
		return g00859EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00860() {
		if (g00860EClass == null) {
			g00860EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(862);
		}
		return g00860EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00861() {
		if (g00861EClass == null) {
			g00861EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(863);
		}
		return g00861EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00862() {
		if (g00862EClass == null) {
			g00862EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(864);
		}
		return g00862EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00863() {
		if (g00863EClass == null) {
			g00863EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(865);
		}
		return g00863EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00864() {
		if (g00864EClass == null) {
			g00864EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(866);
		}
		return g00864EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00865() {
		if (g00865EClass == null) {
			g00865EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(867);
		}
		return g00865EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00866() {
		if (g00866EClass == null) {
			g00866EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(868);
		}
		return g00866EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00867() {
		if (g00867EClass == null) {
			g00867EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(869);
		}
		return g00867EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00868() {
		if (g00868EClass == null) {
			g00868EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(870);
		}
		return g00868EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00869() {
		if (g00869EClass == null) {
			g00869EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(871);
		}
		return g00869EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00870() {
		if (g00870EClass == null) {
			g00870EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(872);
		}
		return g00870EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00871() {
		if (g00871EClass == null) {
			g00871EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(873);
		}
		return g00871EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00872() {
		if (g00872EClass == null) {
			g00872EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(874);
		}
		return g00872EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00873() {
		if (g00873EClass == null) {
			g00873EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(875);
		}
		return g00873EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00874() {
		if (g00874EClass == null) {
			g00874EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(876);
		}
		return g00874EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00875() {
		if (g00875EClass == null) {
			g00875EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(877);
		}
		return g00875EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00876() {
		if (g00876EClass == null) {
			g00876EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(878);
		}
		return g00876EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00877() {
		if (g00877EClass == null) {
			g00877EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(879);
		}
		return g00877EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00878() {
		if (g00878EClass == null) {
			g00878EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(880);
		}
		return g00878EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00879() {
		if (g00879EClass == null) {
			g00879EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(881);
		}
		return g00879EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00880() {
		if (g00880EClass == null) {
			g00880EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(882);
		}
		return g00880EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00881() {
		if (g00881EClass == null) {
			g00881EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(883);
		}
		return g00881EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00882() {
		if (g00882EClass == null) {
			g00882EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(884);
		}
		return g00882EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00883() {
		if (g00883EClass == null) {
			g00883EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(885);
		}
		return g00883EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00884() {
		if (g00884EClass == null) {
			g00884EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(886);
		}
		return g00884EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00885() {
		if (g00885EClass == null) {
			g00885EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(887);
		}
		return g00885EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00886() {
		if (g00886EClass == null) {
			g00886EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(888);
		}
		return g00886EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00887() {
		if (g00887EClass == null) {
			g00887EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(889);
		}
		return g00887EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00888() {
		if (g00888EClass == null) {
			g00888EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(890);
		}
		return g00888EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00889() {
		if (g00889EClass == null) {
			g00889EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(891);
		}
		return g00889EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00890() {
		if (g00890EClass == null) {
			g00890EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(892);
		}
		return g00890EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00891() {
		if (g00891EClass == null) {
			g00891EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(893);
		}
		return g00891EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00892() {
		if (g00892EClass == null) {
			g00892EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(894);
		}
		return g00892EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00893() {
		if (g00893EClass == null) {
			g00893EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(895);
		}
		return g00893EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00894() {
		if (g00894EClass == null) {
			g00894EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(896);
		}
		return g00894EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00895() {
		if (g00895EClass == null) {
			g00895EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(897);
		}
		return g00895EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00896() {
		if (g00896EClass == null) {
			g00896EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(898);
		}
		return g00896EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00897() {
		if (g00897EClass == null) {
			g00897EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(899);
		}
		return g00897EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00898() {
		if (g00898EClass == null) {
			g00898EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(900);
		}
		return g00898EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00899() {
		if (g00899EClass == null) {
			g00899EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(901);
		}
		return g00899EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00900() {
		if (g00900EClass == null) {
			g00900EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(902);
		}
		return g00900EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00901() {
		if (g00901EClass == null) {
			g00901EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(903);
		}
		return g00901EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00902() {
		if (g00902EClass == null) {
			g00902EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(904);
		}
		return g00902EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00903() {
		if (g00903EClass == null) {
			g00903EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(905);
		}
		return g00903EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00904() {
		if (g00904EClass == null) {
			g00904EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(906);
		}
		return g00904EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00905() {
		if (g00905EClass == null) {
			g00905EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(907);
		}
		return g00905EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00906() {
		if (g00906EClass == null) {
			g00906EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(908);
		}
		return g00906EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00907() {
		if (g00907EClass == null) {
			g00907EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(909);
		}
		return g00907EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00908() {
		if (g00908EClass == null) {
			g00908EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(910);
		}
		return g00908EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00909() {
		if (g00909EClass == null) {
			g00909EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(911);
		}
		return g00909EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00910() {
		if (g00910EClass == null) {
			g00910EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(912);
		}
		return g00910EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00911() {
		if (g00911EClass == null) {
			g00911EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(913);
		}
		return g00911EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00912() {
		if (g00912EClass == null) {
			g00912EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(914);
		}
		return g00912EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00913() {
		if (g00913EClass == null) {
			g00913EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(915);
		}
		return g00913EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00914() {
		if (g00914EClass == null) {
			g00914EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(916);
		}
		return g00914EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00915() {
		if (g00915EClass == null) {
			g00915EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(917);
		}
		return g00915EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00916() {
		if (g00916EClass == null) {
			g00916EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(918);
		}
		return g00916EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00917() {
		if (g00917EClass == null) {
			g00917EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(919);
		}
		return g00917EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00918() {
		if (g00918EClass == null) {
			g00918EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(920);
		}
		return g00918EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00919() {
		if (g00919EClass == null) {
			g00919EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(921);
		}
		return g00919EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00920() {
		if (g00920EClass == null) {
			g00920EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(922);
		}
		return g00920EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00921() {
		if (g00921EClass == null) {
			g00921EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(923);
		}
		return g00921EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00922() {
		if (g00922EClass == null) {
			g00922EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(924);
		}
		return g00922EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00923() {
		if (g00923EClass == null) {
			g00923EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(925);
		}
		return g00923EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00924() {
		if (g00924EClass == null) {
			g00924EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(926);
		}
		return g00924EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00925() {
		if (g00925EClass == null) {
			g00925EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(927);
		}
		return g00925EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00926() {
		if (g00926EClass == null) {
			g00926EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(928);
		}
		return g00926EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00927() {
		if (g00927EClass == null) {
			g00927EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(929);
		}
		return g00927EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00928() {
		if (g00928EClass == null) {
			g00928EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(930);
		}
		return g00928EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00929() {
		if (g00929EClass == null) {
			g00929EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(931);
		}
		return g00929EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00930() {
		if (g00930EClass == null) {
			g00930EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(932);
		}
		return g00930EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00931() {
		if (g00931EClass == null) {
			g00931EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(933);
		}
		return g00931EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00932() {
		if (g00932EClass == null) {
			g00932EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(934);
		}
		return g00932EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00933() {
		if (g00933EClass == null) {
			g00933EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(935);
		}
		return g00933EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00934() {
		if (g00934EClass == null) {
			g00934EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(936);
		}
		return g00934EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00935() {
		if (g00935EClass == null) {
			g00935EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(937);
		}
		return g00935EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00936() {
		if (g00936EClass == null) {
			g00936EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(938);
		}
		return g00936EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00937() {
		if (g00937EClass == null) {
			g00937EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(939);
		}
		return g00937EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00938() {
		if (g00938EClass == null) {
			g00938EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(940);
		}
		return g00938EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00939() {
		if (g00939EClass == null) {
			g00939EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(941);
		}
		return g00939EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00940() {
		if (g00940EClass == null) {
			g00940EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(942);
		}
		return g00940EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00941() {
		if (g00941EClass == null) {
			g00941EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(943);
		}
		return g00941EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00942() {
		if (g00942EClass == null) {
			g00942EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(944);
		}
		return g00942EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00943() {
		if (g00943EClass == null) {
			g00943EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(945);
		}
		return g00943EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00944() {
		if (g00944EClass == null) {
			g00944EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(946);
		}
		return g00944EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00945() {
		if (g00945EClass == null) {
			g00945EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(947);
		}
		return g00945EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00946() {
		if (g00946EClass == null) {
			g00946EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(948);
		}
		return g00946EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00947() {
		if (g00947EClass == null) {
			g00947EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(949);
		}
		return g00947EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00948() {
		if (g00948EClass == null) {
			g00948EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(950);
		}
		return g00948EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00949() {
		if (g00949EClass == null) {
			g00949EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(951);
		}
		return g00949EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00950() {
		if (g00950EClass == null) {
			g00950EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(952);
		}
		return g00950EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00951() {
		if (g00951EClass == null) {
			g00951EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(953);
		}
		return g00951EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00952() {
		if (g00952EClass == null) {
			g00952EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(954);
		}
		return g00952EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00953() {
		if (g00953EClass == null) {
			g00953EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(955);
		}
		return g00953EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00954() {
		if (g00954EClass == null) {
			g00954EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(956);
		}
		return g00954EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00955() {
		if (g00955EClass == null) {
			g00955EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(957);
		}
		return g00955EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00956() {
		if (g00956EClass == null) {
			g00956EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(958);
		}
		return g00956EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00957() {
		if (g00957EClass == null) {
			g00957EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(959);
		}
		return g00957EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00958() {
		if (g00958EClass == null) {
			g00958EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(960);
		}
		return g00958EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00959() {
		if (g00959EClass == null) {
			g00959EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(961);
		}
		return g00959EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00960() {
		if (g00960EClass == null) {
			g00960EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(962);
		}
		return g00960EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00961() {
		if (g00961EClass == null) {
			g00961EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(963);
		}
		return g00961EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00962() {
		if (g00962EClass == null) {
			g00962EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(964);
		}
		return g00962EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00963() {
		if (g00963EClass == null) {
			g00963EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(965);
		}
		return g00963EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00964() {
		if (g00964EClass == null) {
			g00964EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(966);
		}
		return g00964EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00965() {
		if (g00965EClass == null) {
			g00965EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(967);
		}
		return g00965EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00966() {
		if (g00966EClass == null) {
			g00966EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(968);
		}
		return g00966EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00967() {
		if (g00967EClass == null) {
			g00967EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(969);
		}
		return g00967EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00968() {
		if (g00968EClass == null) {
			g00968EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(970);
		}
		return g00968EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00969() {
		if (g00969EClass == null) {
			g00969EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(971);
		}
		return g00969EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00970() {
		if (g00970EClass == null) {
			g00970EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(972);
		}
		return g00970EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00971() {
		if (g00971EClass == null) {
			g00971EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(973);
		}
		return g00971EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00972() {
		if (g00972EClass == null) {
			g00972EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(974);
		}
		return g00972EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00973() {
		if (g00973EClass == null) {
			g00973EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(975);
		}
		return g00973EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00974() {
		if (g00974EClass == null) {
			g00974EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(976);
		}
		return g00974EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00975() {
		if (g00975EClass == null) {
			g00975EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(977);
		}
		return g00975EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00976() {
		if (g00976EClass == null) {
			g00976EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(978);
		}
		return g00976EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00977() {
		if (g00977EClass == null) {
			g00977EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(979);
		}
		return g00977EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00978() {
		if (g00978EClass == null) {
			g00978EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(980);
		}
		return g00978EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00979() {
		if (g00979EClass == null) {
			g00979EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(981);
		}
		return g00979EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00980() {
		if (g00980EClass == null) {
			g00980EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(982);
		}
		return g00980EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00981() {
		if (g00981EClass == null) {
			g00981EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(983);
		}
		return g00981EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00982() {
		if (g00982EClass == null) {
			g00982EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(984);
		}
		return g00982EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00983() {
		if (g00983EClass == null) {
			g00983EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(985);
		}
		return g00983EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00984() {
		if (g00984EClass == null) {
			g00984EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(986);
		}
		return g00984EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00985() {
		if (g00985EClass == null) {
			g00985EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(987);
		}
		return g00985EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00986() {
		if (g00986EClass == null) {
			g00986EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(988);
		}
		return g00986EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00987() {
		if (g00987EClass == null) {
			g00987EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(989);
		}
		return g00987EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00988() {
		if (g00988EClass == null) {
			g00988EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(990);
		}
		return g00988EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00989() {
		if (g00989EClass == null) {
			g00989EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(991);
		}
		return g00989EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00990() {
		if (g00990EClass == null) {
			g00990EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(992);
		}
		return g00990EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00991() {
		if (g00991EClass == null) {
			g00991EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(993);
		}
		return g00991EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00992() {
		if (g00992EClass == null) {
			g00992EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(994);
		}
		return g00992EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00993() {
		if (g00993EClass == null) {
			g00993EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(995);
		}
		return g00993EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00994() {
		if (g00994EClass == null) {
			g00994EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(996);
		}
		return g00994EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00995() {
		if (g00995EClass == null) {
			g00995EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(997);
		}
		return g00995EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00996() {
		if (g00996EClass == null) {
			g00996EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(998);
		}
		return g00996EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00997() {
		if (g00997EClass == null) {
			g00997EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(999);
		}
		return g00997EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00998() {
		if (g00998EClass == null) {
			g00998EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(1000);
		}
		return g00998EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG00999() {
		if (g00999EClass == null) {
			g00999EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(1001);
		}
		return g00999EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getG01000() {
		if (g01000EClass == null) {
			g01000EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ScalablePackage.eNS_URI).getEClassifiers().get(1002);
		}
		return g01000EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScalableFactory getScalableFactory() {
		return (ScalableFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) { throw new RuntimeException("Missing serialized package: " + packageFilename); //$NON-NLS-1$
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("it.unitn.disi.zanshin.simulation.model.scalable." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} // ScalablePackageImpl
