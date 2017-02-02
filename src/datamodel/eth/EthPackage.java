/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.eth;

import datamodel.base.BasePackage;

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
 * @see datamodel.eth.EthFactory
 * @model kind="package"
 * @generated
 */
public interface EthPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eth";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alma.Control.datamodel.eth/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EthPackage eINSTANCE = datamodel.eth.impl.EthPackageImpl.init();

	/**
	 * The meta object id for the '{@link datamodel.eth.impl.ArchiveETHImpl <em>Archive ETH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.impl.ArchiveETHImpl
	 * @see datamodel.eth.impl.EthPackageImpl#getArchiveETH()
	 * @generated
	 */
	int ARCHIVE_ETH = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH__ROW = BasePackage.ARCHIVE_PROPERTY__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH__SHEET = BasePackage.ARCHIVE_PROPERTY__SHEET;

	/**
	 * The feature id for the '<em><b>Get Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH__GET_COLUMNS_INFO_OF_ARCHI = BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI;

	/**
	 * The feature id for the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH__MP = BasePackage.ARCHIVE_PROPERTY__MP;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH__CP = BasePackage.ARCHIVE_PROPERTY__CP;

	/**
	 * The number of structural features of the '<em>Archive ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH_FEATURE_COUNT = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datamodel.eth.impl.ControlETHImpl <em>Control ETH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.impl.ControlETHImpl
	 * @see datamodel.eth.impl.EthPackageImpl#getControlETH()
	 * @generated
	 */
	int CONTROL_ETH = 1;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__SPREADSHEET_NAME = BasePackage.CONTROL_POINT__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__SHEET_NAME = BasePackage.CONTROL_POINT__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__ROW = BasePackage.CONTROL_POINT__ROW;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__PARENT_ROW = BasePackage.CONTROL_POINT__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__SHEET = BasePackage.CONTROL_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__PARENT = BasePackage.CONTROL_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__ARCHIVE = BasePackage.CONTROL_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__DEPENDENTS = BasePackage.CONTROL_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__SET_INF_FROM_SPREAD = BasePackage.CONTROL_POINT__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__GET_COMMON_INF = BasePackage.CONTROL_POINT__GET_COMMON_INF;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__SET_MPOR_CP = BasePackage.CONTROL_POINT__SET_MPOR_CP;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__GET_SHEET_MP = BasePackage.CONTROL_POINT__GET_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Get Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__GET_ARCH_ON_USE_CONTROL = BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL;

	/**
	 * The number of structural features of the '<em>Control ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datamodel.eth.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.impl.DeviceModelImpl
	 * @see datamodel.eth.impl.EthPackageImpl#getDeviceModel()
	 * @generated
	 */
	int DEVICE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Description Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DESCRIPTION_INDEX = BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX;

	/**
	 * The feature id for the '<em><b>Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__SPREADSHEET = BasePackage.DEVICE_MODEL__SPREADSHEET;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MAIN = BasePackage.DEVICE_MODEL__MAIN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__NOTES = BasePackage.DEVICE_MODEL__NOTES;

	/**
	 * The feature id for the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MONITOR_POINTS = BasePackage.DEVICE_MODEL__MONITOR_POINTS;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CONTROL_POINTS = BasePackage.DEVICE_MODEL__CONTROL_POINTS;

	/**
	 * The feature id for the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__ARCHIVE_PROPERTIES = BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DEVICE_NAME = BasePackage.DEVICE_MODEL__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__BUS_TYPE = BasePackage.DEVICE_MODEL__BUS_TYPE;

	/**
	 * The feature id for the '<em><b>Device Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DEVICE_DIR = BasePackage.DEVICE_MODEL__DEVICE_DIR;

	/**
	 * The feature id for the '<em><b>Codegen Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CODEGEN_DIR = BasePackage.DEVICE_MODEL__CODEGEN_DIR;

	/**
	 * The feature id for the '<em><b>Spreadsheet Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__SPREADSHEET_DIR = BasePackage.DEVICE_MODEL__SPREADSHEET_DIR;

	/**
	 * The feature id for the '<em><b>Generated Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GENERATED_DIR = BasePackage.DEVICE_MODEL__GENERATED_DIR;

	/**
	 * The feature id for the '<em><b>Monitor DB Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MONITOR_DB_ONLY = BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY;

	/**
	 * The feature id for the '<em><b>Generate Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GENERATE_ALT = BasePackage.DEVICE_MODEL__GENERATE_ALT;

	/**
	 * The feature id for the '<em><b>Get Archive Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_ARCHIVE_INDEX = BasePackage.DEVICE_MODEL__GET_ARCHIVE_INDEX;

	/**
	 * The feature id for the '<em><b>Get Cont Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_CONT_POINTS = BasePackage.DEVICE_MODEL__GET_CONT_POINTS;

	/**
	 * The feature id for the '<em><b>Get Moni Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_MONI_POINTS = BasePackage.DEVICE_MODEL__GET_MONI_POINTS;

	/**
	 * The feature id for the '<em><b>Get End Of Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_END_OF_GENERATION = BasePackage.DEVICE_MODEL__GET_END_OF_GENERATION;

	/**
	 * The feature id for the '<em><b>Get Archiv Prop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_ARCHIV_PROP = BasePackage.DEVICE_MODEL__GET_ARCHIV_PROP;

	/**
	 * The feature id for the '<em><b>Get Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_INF_FROM_SPREAD = BasePackage.DEVICE_MODEL__GET_INF_FROM_SPREAD;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datamodel.eth.impl.MainETHImpl <em>Main ETH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.impl.MainETHImpl
	 * @see datamodel.eth.impl.EthPackageImpl#getMainETH()
	 * @generated
	 */
	int MAIN_ETH = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__ROW = BasePackage.MAIN_BASE__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__SHEET = BasePackage.MAIN_BASE__SHEET;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__EREFERENCE0 = BasePackage.MAIN_BASE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Convert Info To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__CONVERT_INFO_TO = BasePackage.MAIN_BASE__CONVERT_INFO_TO;

	/**
	 * The feature id for the '<em><b>Get Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__GET_INFO_FROM_SPREAD = BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD;

	/**
	 * The number of structural features of the '<em>Main ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datamodel.eth.impl.MandCETHImpl <em>Mand CETH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.impl.MandCETHImpl
	 * @see datamodel.eth.impl.EthPackageImpl#getMandCETH()
	 * @generated
	 */
	int MAND_CETH = 4;

	/**
	 * The number of structural features of the '<em>Mand CETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link datamodel.eth.impl.MonitorETHImpl <em>Monitor ETH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.impl.MonitorETHImpl
	 * @see datamodel.eth.impl.EthPackageImpl#getMonitorETH()
	 * @generated
	 */
	int MONITOR_ETH = 5;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__SPREADSHEET_NAME = BasePackage.MONITOR_POINT__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__SHEET_NAME = BasePackage.MONITOR_POINT__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__ROW = BasePackage.MONITOR_POINT__ROW;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__PARENT_ROW = BasePackage.MONITOR_POINT__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__SHEET = BasePackage.MONITOR_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__PARENT = BasePackage.MONITOR_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__ARCHIVE = BasePackage.MONITOR_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__DEPENDENTS = BasePackage.MONITOR_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__SET_INF_FROM_SPREAD = BasePackage.MONITOR_POINT__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__GET_COMMON_INF = BasePackage.MONITOR_POINT__GET_COMMON_INF;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__SET_MPOR_CP = BasePackage.MONITOR_POINT__SET_MPOR_CP;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__GET_SHEET_MP = BasePackage.MONITOR_POINT__GET_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Get Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__GET_INFO_FROM_AP_SPREAD = BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__GET_INFO_FROM_MP_SPREAD = BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD;

	/**
	 * The number of structural features of the '<em>Monitor ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link datamodel.eth.ArchiveETH <em>Archive ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive ETH</em>'.
	 * @see datamodel.eth.ArchiveETH
	 * @generated
	 */
	EClass getArchiveETH();

	/**
	 * Returns the meta object for class '{@link datamodel.eth.ControlETH <em>Control ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control ETH</em>'.
	 * @see datamodel.eth.ControlETH
	 * @generated
	 */
	EClass getControlETH();

	/**
	 * Returns the meta object for class '{@link datamodel.eth.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see datamodel.eth.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for class '{@link datamodel.eth.MainETH <em>Main ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main ETH</em>'.
	 * @see datamodel.eth.MainETH
	 * @generated
	 */
	EClass getMainETH();

	/**
	 * Returns the meta object for class '{@link datamodel.eth.MandCETH <em>Mand CETH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand CETH</em>'.
	 * @see datamodel.eth.MandCETH
	 * @generated
	 */
	EClass getMandCETH();

	/**
	 * Returns the meta object for class '{@link datamodel.eth.MonitorETH <em>Monitor ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor ETH</em>'.
	 * @see datamodel.eth.MonitorETH
	 * @generated
	 */
	EClass getMonitorETH();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EthFactory getEthFactory();

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
		 * The meta object literal for the '{@link datamodel.eth.impl.ArchiveETHImpl <em>Archive ETH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.ArchiveETHImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getArchiveETH()
		 * @generated
		 */
		EClass ARCHIVE_ETH = eINSTANCE.getArchiveETH();

		/**
		 * The meta object literal for the '{@link datamodel.eth.impl.ControlETHImpl <em>Control ETH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.ControlETHImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getControlETH()
		 * @generated
		 */
		EClass CONTROL_ETH = eINSTANCE.getControlETH();

		/**
		 * The meta object literal for the '{@link datamodel.eth.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.DeviceModelImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getDeviceModel()
		 * @generated
		 */
		EClass DEVICE_MODEL = eINSTANCE.getDeviceModel();

		/**
		 * The meta object literal for the '{@link datamodel.eth.impl.MainETHImpl <em>Main ETH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.MainETHImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getMainETH()
		 * @generated
		 */
		EClass MAIN_ETH = eINSTANCE.getMainETH();

		/**
		 * The meta object literal for the '{@link datamodel.eth.impl.MandCETHImpl <em>Mand CETH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.MandCETHImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getMandCETH()
		 * @generated
		 */
		EClass MAND_CETH = eINSTANCE.getMandCETH();

		/**
		 * The meta object literal for the '{@link datamodel.eth.impl.MonitorETHImpl <em>Monitor ETH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.MonitorETHImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getMonitorETH()
		 * @generated
		 */
		EClass MONITOR_ETH = eINSTANCE.getMonitorETH();

	}

} //EthPackage
