/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see datamodel.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alma.Control.datamodel.base/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = datamodel.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link datamodel.base.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.DeviceModelImpl
	 * @see datamodel.base.impl.BasePackageImpl#getDeviceModel()
	 * @generated
	 */
	int DEVICE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Description Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DESCRIPTION_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__SPREADSHEET = 1;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MAIN = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MONITOR_POINTS = 4;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CONTROL_POINTS = 5;

	/**
	 * The feature id for the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__ARCHIVE_PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DEVICE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__BUS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Device Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DEVICE_DIR = 9;

	/**
	 * The feature id for the '<em><b>Codegen Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CODEGEN_DIR = 10;

	/**
	 * The feature id for the '<em><b>Spreadsheet Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__SPREADSHEET_DIR = 11;

	/**
	 * The feature id for the '<em><b>Generated Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GENERATED_DIR = 12;

	/**
	 * The feature id for the '<em><b>Monitor DB Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MONITOR_DB_ONLY = 13;

	/**
	 * The feature id for the '<em><b>Generate Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GENERATE_ALT = 14;

	/**
	 * The feature id for the '<em><b>Get Archive Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_ARCHIVE_INDEX = 15;

	/**
	 * The feature id for the '<em><b>Get Cont Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_CONT_POINTS = 16;

	/**
	 * The feature id for the '<em><b>Get Moni Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_MONI_POINTS = 17;

	/**
	 * The feature id for the '<em><b>Get End Of Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_END_OF_GENERATION = 18;

	/**
	 * The feature id for the '<em><b>Get Archiv Prop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_ARCHIV_PROP = 19;

	/**
	 * The feature id for the '<em><b>Get Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_INF_FROM_SPREAD = 20;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.MandCBaseImpl <em>Mand CBase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.MandCBaseImpl
	 * @see datamodel.base.impl.BasePackageImpl#getMandCBase()
	 * @generated
	 */
	int MAND_CBASE = 4;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__SPREADSHEET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__SHEET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__ROW = 2;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__PARENT_ROW = 3;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__SHEET = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__ARCHIVE = 6;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__DEPENDENTS = 7;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__SET_INF_FROM_SPREAD = 8;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__GET_COMMON_INF = 9;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__SET_MPOR_CP = 10;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__GET_SHEET_MP = 11;

	/**
	 * The number of structural features of the '<em>Mand CBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.MonitorPointImpl <em>Monitor Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.MonitorPointImpl
	 * @see datamodel.base.impl.BasePackageImpl#getMonitorPoint()
	 * @generated
	 */
	int MONITOR_POINT = 1;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__SPREADSHEET_NAME = MAND_CBASE__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__SHEET_NAME = MAND_CBASE__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__ROW = MAND_CBASE__ROW;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__PARENT_ROW = MAND_CBASE__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__SHEET = MAND_CBASE__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__PARENT = MAND_CBASE__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__ARCHIVE = MAND_CBASE__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__DEPENDENTS = MAND_CBASE__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__SET_INF_FROM_SPREAD = MAND_CBASE__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__GET_COMMON_INF = MAND_CBASE__GET_COMMON_INF;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__SET_MPOR_CP = MAND_CBASE__SET_MPOR_CP;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__GET_SHEET_MP = MAND_CBASE__GET_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Get Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__GET_INFO_FROM_AP_SPREAD = MAND_CBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__GET_INFO_FROM_MP_SPREAD = MAND_CBASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monitor Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT_FEATURE_COUNT = MAND_CBASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.ControlPointImpl <em>Control Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.ControlPointImpl
	 * @see datamodel.base.impl.BasePackageImpl#getControlPoint()
	 * @generated
	 */
	int CONTROL_POINT = 2;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__SPREADSHEET_NAME = MAND_CBASE__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__SHEET_NAME = MAND_CBASE__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__ROW = MAND_CBASE__ROW;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__PARENT_ROW = MAND_CBASE__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__SHEET = MAND_CBASE__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__PARENT = MAND_CBASE__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__ARCHIVE = MAND_CBASE__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__DEPENDENTS = MAND_CBASE__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__SET_INF_FROM_SPREAD = MAND_CBASE__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__GET_COMMON_INF = MAND_CBASE__GET_COMMON_INF;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__SET_MPOR_CP = MAND_CBASE__SET_MPOR_CP;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__GET_SHEET_MP = MAND_CBASE__GET_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Get Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__GET_ARCH_ON_USE_CONTROL = MAND_CBASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT_FEATURE_COUNT = MAND_CBASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.TableImpl
	 * @see datamodel.base.impl.BasePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Dep Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DEP_CHAR = 0;

	/**
	 * The feature id for the '<em><b>Celsius To Kelvin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CELSIUS_TO_KELVIN = 1;

	/**
	 * The feature id for the '<em><b>Sheet Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SHEET_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Col Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COL_NAMES = 3;

	/**
	 * The feature id for the '<em><b>Tag Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TAG_NAMES = 4;

	/**
	 * The feature id for the '<em><b>To CPP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CPP = 5;

	/**
	 * The feature id for the '<em><b>To IDL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_IDL = 6;

	/**
	 * The feature id for the '<em><b>To IDL Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_IDL_SEQ = 7;

	/**
	 * The feature id for the '<em><b>To CORBA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CORBA = 8;

	/**
	 * The feature id for the '<em><b>To CORBA Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CORBA_SEQ = 9;

	/**
	 * The feature id for the '<em><b>To CORBA Dev IO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CORBA_DEV_IO = 10;

	/**
	 * The feature id for the '<em><b>To BACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_BACI = 11;

	/**
	 * The feature id for the '<em><b>To Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_DATABASE = 12;

	/**
	 * The feature id for the '<em><b>Raw To CPP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW_TO_CPP = 13;

	/**
	 * The feature id for the '<em><b>Raw To Byte Swapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW_TO_BYTE_SWAPPED = 14;

	/**
	 * The feature id for the '<em><b>Raw Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW_BYTES = 15;

	/**
	 * The feature id for the '<em><b>World To CPP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CPP = 16;

	/**
	 * The feature id for the '<em><b>World To IDL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_IDL = 17;

	/**
	 * The feature id for the '<em><b>World To IDL Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_IDL_SEQ = 18;

	/**
	 * The feature id for the '<em><b>World To CORBA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CORBA = 19;

	/**
	 * The feature id for the '<em><b>World To CORBA Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CORBA_SEQ = 20;

	/**
	 * The feature id for the '<em><b>World To CORBA Dev IO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CORBA_DEV_IO = 21;

	/**
	 * The feature id for the '<em><b>World To BACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_BACI = 22;

	/**
	 * The feature id for the '<em><b>World To Java</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_JAVA = 23;

	/**
	 * The feature id for the '<em><b>World To Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_DATABASE = 24;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.ArchivePropertyImpl <em>Archive Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.ArchivePropertyImpl
	 * @see datamodel.base.impl.BasePackageImpl#getArchiveProperty()
	 * @generated
	 */
	int ARCHIVE_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__ROW = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Get Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI = 2;

	/**
	 * The feature id for the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__MP = 3;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__CP = 4;

	/**
	 * The number of structural features of the '<em>Archive Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.NoteImpl
	 * @see datamodel.base.impl.BasePackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTE = 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.SpreadsheetValidatorImpl <em>Spreadsheet Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.SpreadsheetValidatorImpl
	 * @see datamodel.base.impl.BasePackageImpl#getSpreadsheetValidator()
	 * @generated
	 */
	int SPREADSHEET_VALIDATOR = 7;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__ERROR_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__ERROR_LIST = 1;

	/**
	 * The feature id for the '<em><b>Seh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__SEH = 2;

	/**
	 * The number of structural features of the '<em>Spreadsheet Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.SpreadsheetParserImpl <em>Spreadsheet Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.SpreadsheetParserImpl
	 * @see datamodel.base.impl.BasePackageImpl#getSpreadsheetParser()
	 * @generated
	 */
	int SPREADSHEET_PARSER = 8;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Ref Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__REF_PATH = 1;

	/**
	 * The feature id for the '<em><b>Ref Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__REF_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__XML = 3;

	/**
	 * The feature id for the '<em><b>Xsd File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__XSD_FILE = 4;

	/**
	 * The feature id for the '<em><b>Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__NEWLINE = 5;

	/**
	 * The feature id for the '<em><b>Set New Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__SET_NEW_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Newlinetmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__NEWLINETMP = 7;

	/**
	 * The number of structural features of the '<em>Spreadsheet Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.UtilImpl <em>Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.UtilImpl
	 * @see datamodel.base.impl.BasePackageImpl#getUtil()
	 * @generated
	 */
	int UTIL = 9;

	/**
	 * The feature id for the '<em><b>Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__NEWLINE = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>MONTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MONTH = 2;

	/**
	 * The feature id for the '<em><b>MONT Halt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MONT_HALT = 3;

	/**
	 * The feature id for the '<em><b>Get Raw Bytes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__GET_RAW_BYTES = 4;

	/**
	 * The number of structural features of the '<em>Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.PairImpl
	 * @see datamodel.base.impl.BasePackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 10;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>New String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__NEW_STRING = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.SimpleErrorHandlerImpl <em>Simple Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.SimpleErrorHandlerImpl
	 * @see datamodel.base.impl.BasePackageImpl#getSimpleErrorHandler()
	 * @generated
	 */
	int SIMPLE_ERROR_HANDLER = 11;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ERROR_HANDLER__ERRORS = 0;

	/**
	 * The number of structural features of the '<em>Simple Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ERROR_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link datamodel.base.impl.MainBaseImpl <em>Main Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.MainBaseImpl
	 * @see datamodel.base.impl.BasePackageImpl#getMainBase()
	 * @generated
	 */
	int MAIN_BASE = 12;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__ROW = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__SHEET = 1;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__EREFERENCE0 = 2;

	/**
	 * The feature id for the '<em><b>Convert Info To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__CONVERT_INFO_TO = 3;

	/**
	 * The feature id for the '<em><b>Get Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__GET_INFO_FROM_SPREAD = 4;

	/**
	 * The number of structural features of the '<em>Main Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '<em>Simple Error Handler DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see datamodel.base.impl.BasePackageImpl#getSimpleErrorHandlerDT()
	 * @generated
	 */
	int SIMPLE_ERROR_HANDLER_DT = 13;

	/**
	 * The meta object id for the '<em>Mand CBase DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see datamodel.base.impl.BasePackageImpl#getMandCBaseDT()
	 * @generated
	 */
	int MAND_CBASE_DT = 14;

	/**
	 * The meta object id for the '<em>Main Base DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see datamodel.base.impl.BasePackageImpl#getMainBaseDT()
	 * @generated
	 */
	int MAIN_BASE_DT = 15;

	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see datamodel.base.impl.BasePackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 16;

	/**
	 * The meta object id for the '<em>Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see datamodel.base.impl.BasePackageImpl#getHashtable()
	 * @generated
	 */
	int HASHTABLE = 17;

	/**
	 * The meta object id for the '<em>SAX Parse Exception DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml.sax.SAXParseException
	 * @see datamodel.base.impl.BasePackageImpl#getSAXParseExceptionDT()
	 * @generated
	 */
	int SAX_PARSE_EXCEPTION_DT = 18;

	/**
	 * The meta object id for the '<em>String3 DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.BasePackageImpl#getString3DT()
	 * @generated
	 */
	int STRING3_DT = 19;

	/**
	 * The meta object id for the '<em>String2 DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.BasePackageImpl#getString2DT()
	 * @generated
	 */
	int STRING2_DT = 20;

	/**
	 * The meta object id for the '<em>String1 DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.BasePackageImpl#getString1DT()
	 * @generated
	 */
	int STRING1_DT = 21;

	/**
	 * The meta object id for the '<em>System DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.System
	 * @see datamodel.base.impl.BasePackageImpl#getSystemDT()
	 * @generated
	 */
	int SYSTEM_DT = 22;


	/**
	 * Returns the meta object for class '{@link datamodel.base.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see datamodel.base.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Index</em>'.
	 * @see datamodel.base.DeviceModel#getDescriptionIndex()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DescriptionIndex();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet</em>'.
	 * @see datamodel.base.DeviceModel#getSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Spreadsheet();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see datamodel.base.DeviceModel#getMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Main();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see datamodel.base.DeviceModel#getNotes()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Notes();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Points</em>'.
	 * @see datamodel.base.DeviceModel#getMonitorPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_MonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Points</em>'.
	 * @see datamodel.base.DeviceModel#getControlPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_ControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Properties</em>'.
	 * @see datamodel.base.DeviceModel#getArchiveProperties()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_ArchiveProperties();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see datamodel.base.DeviceModel#getDeviceName()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see datamodel.base.DeviceModel#getBusType()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_BusType();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getDeviceDir <em>Device Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Dir</em>'.
	 * @see datamodel.base.DeviceModel#getDeviceDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DeviceDir();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codegen Dir</em>'.
	 * @see datamodel.base.DeviceModel#getCodegenDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_CodegenDir();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet Dir</em>'.
	 * @see datamodel.base.DeviceModel#getSpreadsheetDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_SpreadsheetDir();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Dir</em>'.
	 * @see datamodel.base.DeviceModel#getGeneratedDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_GeneratedDir();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor DB Only</em>'.
	 * @see datamodel.base.DeviceModel#isMonitorDBOnly()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_MonitorDBOnly();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Alt</em>'.
	 * @see datamodel.base.DeviceModel#isGenerateAlt()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_GenerateAlt();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.DeviceModel#getGetArchiveIndex <em>Get Archive Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Archive Index</em>'.
	 * @see datamodel.base.DeviceModel#getGetArchiveIndex()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetArchiveIndex();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.DeviceModel#getGetContPoints <em>Get Cont Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Cont Points</em>'.
	 * @see datamodel.base.DeviceModel#getGetContPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetContPoints();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.DeviceModel#getGetMoniPoints <em>Get Moni Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Moni Points</em>'.
	 * @see datamodel.base.DeviceModel#getGetMoniPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetMoniPoints();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.DeviceModel#getGetEndOfGeneration <em>Get End Of Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get End Of Generation</em>'.
	 * @see datamodel.base.DeviceModel#getGetEndOfGeneration()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetEndOfGeneration();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.DeviceModel#getGetArchivProp <em>Get Archiv Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Archiv Prop</em>'.
	 * @see datamodel.base.DeviceModel#getGetArchivProp()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetArchivProp();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.DeviceModel#getGetInfFromSpread <em>Get Inf From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Inf From Spread</em>'.
	 * @see datamodel.base.DeviceModel#getGetInfFromSpread()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetInfFromSpread();

	/**
	 * Returns the meta object for class '{@link datamodel.base.MonitorPoint <em>Monitor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor Point</em>'.
	 * @see datamodel.base.MonitorPoint
	 * @generated
	 */
	EClass getMonitorPoint();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MonitorPoint#getGetInfoFromAPSpread <em>Get Info From AP Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info From AP Spread</em>'.
	 * @see datamodel.base.MonitorPoint#getGetInfoFromAPSpread()
	 * @see #getMonitorPoint()
	 * @generated
	 */
	EReference getMonitorPoint_GetInfoFromAPSpread();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MonitorPoint#getGetInfoFromMPSpread <em>Get Info From MP Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info From MP Spread</em>'.
	 * @see datamodel.base.MonitorPoint#getGetInfoFromMPSpread()
	 * @see #getMonitorPoint()
	 * @generated
	 */
	EReference getMonitorPoint_GetInfoFromMPSpread();

	/**
	 * Returns the meta object for class '{@link datamodel.base.ControlPoint <em>Control Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Point</em>'.
	 * @see datamodel.base.ControlPoint
	 * @generated
	 */
	EClass getControlPoint();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.ControlPoint#getGetArchOnUseControl <em>Get Arch On Use Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Arch On Use Control</em>'.
	 * @see datamodel.base.ControlPoint#getGetArchOnUseControl()
	 * @see #getControlPoint()
	 * @generated
	 */
	EReference getControlPoint_GetArchOnUseControl();

	/**
	 * Returns the meta object for class '{@link datamodel.base.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see datamodel.base.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getDepChar <em>Dep Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Char</em>'.
	 * @see datamodel.base.Table#getDepChar()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_DepChar();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Celsius To Kelvin</em>'.
	 * @see datamodel.base.Table#getCelsiusToKelvin()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_CelsiusToKelvin();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getSheetNames <em>Sheet Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Names</em>'.
	 * @see datamodel.base.Table#getSheetNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_SheetNames();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getColNames <em>Col Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Names</em>'.
	 * @see datamodel.base.Table#getColNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ColNames();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getTagNames <em>Tag Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Names</em>'.
	 * @see datamodel.base.Table#getTagNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TagNames();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToCPP <em>To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CPP</em>'.
	 * @see datamodel.base.Table#getToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCPP();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToIDL <em>To IDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To IDL</em>'.
	 * @see datamodel.base.Table#getToIDL()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToIDL();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToIDLSeq <em>To IDL Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To IDL Seq</em>'.
	 * @see datamodel.base.Table#getToIDLSeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToIDLSeq();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToCORBA <em>To CORBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA</em>'.
	 * @see datamodel.base.Table#getToCORBA()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBA();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToCORBASeq <em>To CORBA Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA Seq</em>'.
	 * @see datamodel.base.Table#getToCORBASeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBASeq();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA Dev IO</em>'.
	 * @see datamodel.base.Table#getToCORBADevIO()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBADevIO();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToBACI <em>To BACI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To BACI</em>'.
	 * @see datamodel.base.Table#getToBACI()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToBACI();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getToDatabase <em>To Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Database</em>'.
	 * @see datamodel.base.Table#getToDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToDatabase();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getRawToCPP <em>Raw To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw To CPP</em>'.
	 * @see datamodel.base.Table#getRawToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawToCPP();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw To Byte Swapped</em>'.
	 * @see datamodel.base.Table#getRawToByteSwapped()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawToByteSwapped();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getRawBytes <em>Raw Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Bytes</em>'.
	 * @see datamodel.base.Table#getRawBytes()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawBytes();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToCPP <em>World To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CPP</em>'.
	 * @see datamodel.base.Table#getWorldToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCPP();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToIDL <em>World To IDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To IDL</em>'.
	 * @see datamodel.base.Table#getWorldToIDL()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToIDL();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To IDL Seq</em>'.
	 * @see datamodel.base.Table#getWorldToIDLSeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToIDLSeq();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToCORBA <em>World To CORBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA</em>'.
	 * @see datamodel.base.Table#getWorldToCORBA()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBA();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA Seq</em>'.
	 * @see datamodel.base.Table#getWorldToCORBASeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBASeq();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA Dev IO</em>'.
	 * @see datamodel.base.Table#getWorldToCORBADevIO()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBADevIO();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToBACI <em>World To BACI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To BACI</em>'.
	 * @see datamodel.base.Table#getWorldToBACI()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToBACI();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToJava <em>World To Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To Java</em>'.
	 * @see datamodel.base.Table#getWorldToJava()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToJava();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Table#getWorldToDatabase <em>World To Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To Database</em>'.
	 * @see datamodel.base.Table#getWorldToDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToDatabase();

	/**
	 * Returns the meta object for class '{@link datamodel.base.MandCBase <em>Mand CBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand CBase</em>'.
	 * @see datamodel.base.MandCBase
	 * @generated
	 */
	EClass getMandCBase();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet Name</em>'.
	 * @see datamodel.base.MandCBase#getSpreadsheetName()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_SpreadsheetName();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getSheetName <em>Sheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Name</em>'.
	 * @see datamodel.base.MandCBase#getSheetName()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_SheetName();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see datamodel.base.MandCBase#getRow()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Row();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getParentRow <em>Parent Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Row</em>'.
	 * @see datamodel.base.MandCBase#getParentRow()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_ParentRow();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see datamodel.base.MandCBase#getSheet()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see datamodel.base.MandCBase#getParent()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Parent();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see datamodel.base.MandCBase#getArchive()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Archive();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MandCBase#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependents</em>'.
	 * @see datamodel.base.MandCBase#getDependents()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Dependents();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MandCBase#getSetInfFromSpread <em>Set Inf From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Inf From Spread</em>'.
	 * @see datamodel.base.MandCBase#getSetInfFromSpread()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_SetInfFromSpread();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MandCBase#getGetCommonInf <em>Get Common Inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Common Inf</em>'.
	 * @see datamodel.base.MandCBase#getGetCommonInf()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_GetCommonInf();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MandCBase#getSetMPorCP <em>Set MPor CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set MPor CP</em>'.
	 * @see datamodel.base.MandCBase#getSetMPorCP()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_SetMPorCP();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MandCBase#getGetSheetMP <em>Get Sheet MP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Sheet MP</em>'.
	 * @see datamodel.base.MandCBase#getGetSheetMP()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_GetSheetMP();

	/**
	 * Returns the meta object for class '{@link datamodel.base.ArchiveProperty <em>Archive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Property</em>'.
	 * @see datamodel.base.ArchiveProperty
	 * @generated
	 */
	EClass getArchiveProperty();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.ArchiveProperty#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see datamodel.base.ArchiveProperty#getRow()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Row();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.ArchiveProperty#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see datamodel.base.ArchiveProperty#getSheet()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Sheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.ArchiveProperty#getGetColumnsInfoOfArchi <em>Get Columns Info Of Archi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Columns Info Of Archi</em>'.
	 * @see datamodel.base.ArchiveProperty#getGetColumnsInfoOfArchi()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EReference getArchiveProperty_GetColumnsInfoOfArchi();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.ArchiveProperty#getMp <em>Mp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp</em>'.
	 * @see datamodel.base.ArchiveProperty#getMp()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Mp();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.ArchiveProperty#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see datamodel.base.ArchiveProperty#getCp()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Cp();

	/**
	 * Returns the meta object for class '{@link datamodel.base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see datamodel.base.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Note#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see datamodel.base.Note#getNote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Note();

	/**
	 * Returns the meta object for class '{@link datamodel.base.SpreadsheetValidator <em>Spreadsheet Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Validator</em>'.
	 * @see datamodel.base.SpreadsheetValidator
	 * @generated
	 */
	EClass getSpreadsheetValidator();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Handler</em>'.
	 * @see datamodel.base.SpreadsheetValidator#getErrorHandler()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EReference getSpreadsheetValidator_ErrorHandler();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetValidator#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error List</em>'.
	 * @see datamodel.base.SpreadsheetValidator#getErrorList()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_ErrorList();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetValidator#getSeh <em>Seh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seh</em>'.
	 * @see datamodel.base.SpreadsheetValidator#getSeh()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_Seh();

	/**
	 * Returns the meta object for class '{@link datamodel.base.SpreadsheetParser <em>Spreadsheet Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Parser</em>'.
	 * @see datamodel.base.SpreadsheetParser
	 * @generated
	 */
	EClass getSpreadsheetParser();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.SpreadsheetParser#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see datamodel.base.SpreadsheetParser#getEReference0()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EReference getSpreadsheetParser_EReference0();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Path</em>'.
	 * @see datamodel.base.SpreadsheetParser#getRefPath()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_RefPath();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Status</em>'.
	 * @see datamodel.base.SpreadsheetParser#isRefStatus()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_RefStatus();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetParser#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml</em>'.
	 * @see datamodel.base.SpreadsheetParser#getXml()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Xml();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd File</em>'.
	 * @see datamodel.base.SpreadsheetParser#getXsdFile()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_XsdFile();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetParser#getNewline <em>Newline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newline</em>'.
	 * @see datamodel.base.SpreadsheetParser#getNewline()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Newline();

	/**
	 * Returns the meta object for the containment reference '{@link datamodel.base.SpreadsheetParser#getSetNewContent <em>Set New Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set New Content</em>'.
	 * @see datamodel.base.SpreadsheetParser#getSetNewContent()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EReference getSpreadsheetParser_SetNewContent();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SpreadsheetParser#getNewlinetmp <em>Newlinetmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newlinetmp</em>'.
	 * @see datamodel.base.SpreadsheetParser#getNewlinetmp()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Newlinetmp();

	/**
	 * Returns the meta object for class '{@link datamodel.base.Util <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Util</em>'.
	 * @see datamodel.base.Util
	 * @generated
	 */
	EClass getUtil();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Util#getNewline <em>Newline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newline</em>'.
	 * @see datamodel.base.Util#getNewline()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_Newline();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Util#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see datamodel.base.Util#getMaxLength()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Util#getMONTH <em>MONTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MONTH</em>'.
	 * @see datamodel.base.Util#getMONTH()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MONTH();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Util#getMONTHalt <em>MONT Halt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MONT Halt</em>'.
	 * @see datamodel.base.Util#getMONTHalt()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MONTHalt();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.Util#getGetRawBytes <em>Get Raw Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Raw Bytes</em>'.
	 * @see datamodel.base.Util#getGetRawBytes()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_GetRawBytes();

	/**
	 * Returns the meta object for class '{@link datamodel.base.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see datamodel.base.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Pair#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see datamodel.base.Pair#getContent()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Content();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.Pair#getNewString <em>New String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New String</em>'.
	 * @see datamodel.base.Pair#getNewString()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_NewString();

	/**
	 * Returns the meta object for class '{@link datamodel.base.SimpleErrorHandler <em>Simple Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Error Handler</em>'.
	 * @see datamodel.base.SimpleErrorHandler
	 * @generated
	 */
	EClass getSimpleErrorHandler();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.SimpleErrorHandler#isErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see datamodel.base.SimpleErrorHandler#isErrors()
	 * @see #getSimpleErrorHandler()
	 * @generated
	 */
	EAttribute getSimpleErrorHandler_Errors();

	/**
	 * Returns the meta object for class '{@link datamodel.base.MainBase <em>Main Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Base</em>'.
	 * @see datamodel.base.MainBase
	 * @generated
	 */
	EClass getMainBase();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MainBase#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see datamodel.base.MainBase#getRow()
	 * @see #getMainBase()
	 * @generated
	 */
	EAttribute getMainBase_Row();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.base.MainBase#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see datamodel.base.MainBase#getSheet()
	 * @see #getMainBase()
	 * @generated
	 */
	EAttribute getMainBase_Sheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MainBase#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see datamodel.base.MainBase#getEReference0()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_EReference0();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MainBase#getConvertInfoTo <em>Convert Info To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Convert Info To</em>'.
	 * @see datamodel.base.MainBase#getConvertInfoTo()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_ConvertInfoTo();

	/**
	 * Returns the meta object for the reference '{@link datamodel.base.MainBase#getGetInfoFromSpread <em>Get Info From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info From Spread</em>'.
	 * @see datamodel.base.MainBase#getGetInfoFromSpread()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_GetInfoFromSpread();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Simple Error Handler DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Error Handler DT</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSimpleErrorHandlerDT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Mand CBase DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CBase DT</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 * @generated
	 */
	EDataType getMandCBaseDT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Main Base DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Main Base DT</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 * @generated
	 */
	EDataType getMainBaseDT();

	/**
	 * Returns the meta object for data type '{@link java.util.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array List</em>'.
	 * @see java.util.ArrayList
	 * @model instanceClass="java.util.ArrayList"
	 * @generated
	 */
	EDataType getArrayList();

	/**
	 * Returns the meta object for data type '{@link java.util.Hashtable <em>Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hashtable</em>'.
	 * @see java.util.Hashtable
	 * @model instanceClass="java.util.Hashtable"
	 * @generated
	 */
	EDataType getHashtable();

	/**
	 * Returns the meta object for data type '{@link org.xml.sax.SAXParseException <em>SAX Parse Exception DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAX Parse Exception DT</em>'.
	 * @see org.xml.sax.SAXParseException
	 * @model instanceClass="org.xml.sax.SAXParseException"
	 * @generated
	 */
	EDataType getSAXParseExceptionDT();

	/**
	 * Returns the meta object for data type '<em>String3 DT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String3 DT</em>'.
	 * @model instanceClass="java.lang.String[][][]"
	 * @generated
	 */
	EDataType getString3DT();

	/**
	 * Returns the meta object for data type '<em>String2 DT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String2 DT</em>'.
	 * @model instanceClass="java.lang.String[][]"
	 * @generated
	 */
	EDataType getString2DT();

	/**
	 * Returns the meta object for data type '<em>String1 DT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String1 DT</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getString1DT();

	/**
	 * Returns the meta object for data type '{@link java.lang.System <em>System DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>System DT</em>'.
	 * @see java.lang.System
	 * @model instanceClass="java.lang.System"
	 * @generated
	 */
	EDataType getSystemDT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link datamodel.base.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.DeviceModelImpl
		 * @see datamodel.base.impl.BasePackageImpl#getDeviceModel()
		 * @generated
		 */
		EClass DEVICE_MODEL = eINSTANCE.getDeviceModel();

		/**
		 * The meta object literal for the '<em><b>Description Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__DESCRIPTION_INDEX = eINSTANCE.getDeviceModel_DescriptionIndex();

		/**
		 * The meta object literal for the '<em><b>Spreadsheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__SPREADSHEET = eINSTANCE.getDeviceModel_Spreadsheet();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__MAIN = eINSTANCE.getDeviceModel_Main();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__NOTES = eINSTANCE.getDeviceModel_Notes();

		/**
		 * The meta object literal for the '<em><b>Monitor Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__MONITOR_POINTS = eINSTANCE.getDeviceModel_MonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Control Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__CONTROL_POINTS = eINSTANCE.getDeviceModel_ControlPoints();

		/**
		 * The meta object literal for the '<em><b>Archive Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__ARCHIVE_PROPERTIES = eINSTANCE.getDeviceModel_ArchiveProperties();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__DEVICE_NAME = eINSTANCE.getDeviceModel_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Bus Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__BUS_TYPE = eINSTANCE.getDeviceModel_BusType();

		/**
		 * The meta object literal for the '<em><b>Device Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__DEVICE_DIR = eINSTANCE.getDeviceModel_DeviceDir();

		/**
		 * The meta object literal for the '<em><b>Codegen Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__CODEGEN_DIR = eINSTANCE.getDeviceModel_CodegenDir();

		/**
		 * The meta object literal for the '<em><b>Spreadsheet Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__SPREADSHEET_DIR = eINSTANCE.getDeviceModel_SpreadsheetDir();

		/**
		 * The meta object literal for the '<em><b>Generated Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__GENERATED_DIR = eINSTANCE.getDeviceModel_GeneratedDir();

		/**
		 * The meta object literal for the '<em><b>Monitor DB Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__MONITOR_DB_ONLY = eINSTANCE.getDeviceModel_MonitorDBOnly();

		/**
		 * The meta object literal for the '<em><b>Generate Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__GENERATE_ALT = eINSTANCE.getDeviceModel_GenerateAlt();

		/**
		 * The meta object literal for the '<em><b>Get Archive Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_ARCHIVE_INDEX = eINSTANCE.getDeviceModel_GetArchiveIndex();

		/**
		 * The meta object literal for the '<em><b>Get Cont Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_CONT_POINTS = eINSTANCE.getDeviceModel_GetContPoints();

		/**
		 * The meta object literal for the '<em><b>Get Moni Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_MONI_POINTS = eINSTANCE.getDeviceModel_GetMoniPoints();

		/**
		 * The meta object literal for the '<em><b>Get End Of Generation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_END_OF_GENERATION = eINSTANCE.getDeviceModel_GetEndOfGeneration();

		/**
		 * The meta object literal for the '<em><b>Get Archiv Prop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_ARCHIV_PROP = eINSTANCE.getDeviceModel_GetArchivProp();

		/**
		 * The meta object literal for the '<em><b>Get Inf From Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_INF_FROM_SPREAD = eINSTANCE.getDeviceModel_GetInfFromSpread();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.MonitorPointImpl <em>Monitor Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.MonitorPointImpl
		 * @see datamodel.base.impl.BasePackageImpl#getMonitorPoint()
		 * @generated
		 */
		EClass MONITOR_POINT = eINSTANCE.getMonitorPoint();

		/**
		 * The meta object literal for the '<em><b>Get Info From AP Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_POINT__GET_INFO_FROM_AP_SPREAD = eINSTANCE.getMonitorPoint_GetInfoFromAPSpread();

		/**
		 * The meta object literal for the '<em><b>Get Info From MP Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_POINT__GET_INFO_FROM_MP_SPREAD = eINSTANCE.getMonitorPoint_GetInfoFromMPSpread();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.ControlPointImpl <em>Control Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.ControlPointImpl
		 * @see datamodel.base.impl.BasePackageImpl#getControlPoint()
		 * @generated
		 */
		EClass CONTROL_POINT = eINSTANCE.getControlPoint();

		/**
		 * The meta object literal for the '<em><b>Get Arch On Use Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_POINT__GET_ARCH_ON_USE_CONTROL = eINSTANCE.getControlPoint_GetArchOnUseControl();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.TableImpl
		 * @see datamodel.base.impl.BasePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Dep Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__DEP_CHAR = eINSTANCE.getTable_DepChar();

		/**
		 * The meta object literal for the '<em><b>Celsius To Kelvin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CELSIUS_TO_KELVIN = eINSTANCE.getTable_CelsiusToKelvin();

		/**
		 * The meta object literal for the '<em><b>Sheet Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SHEET_NAMES = eINSTANCE.getTable_SheetNames();

		/**
		 * The meta object literal for the '<em><b>Col Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__COL_NAMES = eINSTANCE.getTable_ColNames();

		/**
		 * The meta object literal for the '<em><b>Tag Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TAG_NAMES = eINSTANCE.getTable_TagNames();

		/**
		 * The meta object literal for the '<em><b>To CPP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_CPP = eINSTANCE.getTable_ToCPP();

		/**
		 * The meta object literal for the '<em><b>To IDL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_IDL = eINSTANCE.getTable_ToIDL();

		/**
		 * The meta object literal for the '<em><b>To IDL Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_IDL_SEQ = eINSTANCE.getTable_ToIDLSeq();

		/**
		 * The meta object literal for the '<em><b>To CORBA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_CORBA = eINSTANCE.getTable_ToCORBA();

		/**
		 * The meta object literal for the '<em><b>To CORBA Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_CORBA_SEQ = eINSTANCE.getTable_ToCORBASeq();

		/**
		 * The meta object literal for the '<em><b>To CORBA Dev IO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_CORBA_DEV_IO = eINSTANCE.getTable_ToCORBADevIO();

		/**
		 * The meta object literal for the '<em><b>To BACI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_BACI = eINSTANCE.getTable_ToBACI();

		/**
		 * The meta object literal for the '<em><b>To Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TO_DATABASE = eINSTANCE.getTable_ToDatabase();

		/**
		 * The meta object literal for the '<em><b>Raw To CPP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__RAW_TO_CPP = eINSTANCE.getTable_RawToCPP();

		/**
		 * The meta object literal for the '<em><b>Raw To Byte Swapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__RAW_TO_BYTE_SWAPPED = eINSTANCE.getTable_RawToByteSwapped();

		/**
		 * The meta object literal for the '<em><b>Raw Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__RAW_BYTES = eINSTANCE.getTable_RawBytes();

		/**
		 * The meta object literal for the '<em><b>World To CPP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_CPP = eINSTANCE.getTable_WorldToCPP();

		/**
		 * The meta object literal for the '<em><b>World To IDL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_IDL = eINSTANCE.getTable_WorldToIDL();

		/**
		 * The meta object literal for the '<em><b>World To IDL Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_IDL_SEQ = eINSTANCE.getTable_WorldToIDLSeq();

		/**
		 * The meta object literal for the '<em><b>World To CORBA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_CORBA = eINSTANCE.getTable_WorldToCORBA();

		/**
		 * The meta object literal for the '<em><b>World To CORBA Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_CORBA_SEQ = eINSTANCE.getTable_WorldToCORBASeq();

		/**
		 * The meta object literal for the '<em><b>World To CORBA Dev IO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_CORBA_DEV_IO = eINSTANCE.getTable_WorldToCORBADevIO();

		/**
		 * The meta object literal for the '<em><b>World To BACI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_BACI = eINSTANCE.getTable_WorldToBACI();

		/**
		 * The meta object literal for the '<em><b>World To Java</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_JAVA = eINSTANCE.getTable_WorldToJava();

		/**
		 * The meta object literal for the '<em><b>World To Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WORLD_TO_DATABASE = eINSTANCE.getTable_WorldToDatabase();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.MandCBaseImpl <em>Mand CBase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.MandCBaseImpl
		 * @see datamodel.base.impl.BasePackageImpl#getMandCBase()
		 * @generated
		 */
		EClass MAND_CBASE = eINSTANCE.getMandCBase();

		/**
		 * The meta object literal for the '<em><b>Spreadsheet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__SPREADSHEET_NAME = eINSTANCE.getMandCBase_SpreadsheetName();

		/**
		 * The meta object literal for the '<em><b>Sheet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__SHEET_NAME = eINSTANCE.getMandCBase_SheetName();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__ROW = eINSTANCE.getMandCBase_Row();

		/**
		 * The meta object literal for the '<em><b>Parent Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__PARENT_ROW = eINSTANCE.getMandCBase_ParentRow();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__SHEET = eINSTANCE.getMandCBase_Sheet();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__PARENT = eINSTANCE.getMandCBase_Parent();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__ARCHIVE = eINSTANCE.getMandCBase_Archive();

		/**
		 * The meta object literal for the '<em><b>Dependents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__DEPENDENTS = eINSTANCE.getMandCBase_Dependents();

		/**
		 * The meta object literal for the '<em><b>Set Inf From Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__SET_INF_FROM_SPREAD = eINSTANCE.getMandCBase_SetInfFromSpread();

		/**
		 * The meta object literal for the '<em><b>Get Common Inf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__GET_COMMON_INF = eINSTANCE.getMandCBase_GetCommonInf();

		/**
		 * The meta object literal for the '<em><b>Set MPor CP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__SET_MPOR_CP = eINSTANCE.getMandCBase_SetMPorCP();

		/**
		 * The meta object literal for the '<em><b>Get Sheet MP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__GET_SHEET_MP = eINSTANCE.getMandCBase_GetSheetMP();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.ArchivePropertyImpl <em>Archive Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.ArchivePropertyImpl
		 * @see datamodel.base.impl.BasePackageImpl#getArchiveProperty()
		 * @generated
		 */
		EClass ARCHIVE_PROPERTY = eINSTANCE.getArchiveProperty();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE_PROPERTY__ROW = eINSTANCE.getArchiveProperty_Row();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE_PROPERTY__SHEET = eINSTANCE.getArchiveProperty_Sheet();

		/**
		 * The meta object literal for the '<em><b>Get Columns Info Of Archi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI = eINSTANCE.getArchiveProperty_GetColumnsInfoOfArchi();

		/**
		 * The meta object literal for the '<em><b>Mp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE_PROPERTY__MP = eINSTANCE.getArchiveProperty_Mp();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE_PROPERTY__CP = eINSTANCE.getArchiveProperty_Cp();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.NoteImpl
		 * @see datamodel.base.impl.BasePackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NOTE = eINSTANCE.getNote_Note();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.SpreadsheetValidatorImpl <em>Spreadsheet Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.SpreadsheetValidatorImpl
		 * @see datamodel.base.impl.BasePackageImpl#getSpreadsheetValidator()
		 * @generated
		 */
		EClass SPREADSHEET_VALIDATOR = eINSTANCE.getSpreadsheetValidator();

		/**
		 * The meta object literal for the '<em><b>Error Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_VALIDATOR__ERROR_HANDLER = eINSTANCE.getSpreadsheetValidator_ErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_VALIDATOR__ERROR_LIST = eINSTANCE.getSpreadsheetValidator_ErrorList();

		/**
		 * The meta object literal for the '<em><b>Seh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_VALIDATOR__SEH = eINSTANCE.getSpreadsheetValidator_Seh();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.SpreadsheetParserImpl <em>Spreadsheet Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.SpreadsheetParserImpl
		 * @see datamodel.base.impl.BasePackageImpl#getSpreadsheetParser()
		 * @generated
		 */
		EClass SPREADSHEET_PARSER = eINSTANCE.getSpreadsheetParser();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_PARSER__EREFERENCE0 = eINSTANCE.getSpreadsheetParser_EReference0();

		/**
		 * The meta object literal for the '<em><b>Ref Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_PARSER__REF_PATH = eINSTANCE.getSpreadsheetParser_RefPath();

		/**
		 * The meta object literal for the '<em><b>Ref Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_PARSER__REF_STATUS = eINSTANCE.getSpreadsheetParser_RefStatus();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_PARSER__XML = eINSTANCE.getSpreadsheetParser_Xml();

		/**
		 * The meta object literal for the '<em><b>Xsd File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_PARSER__XSD_FILE = eINSTANCE.getSpreadsheetParser_XsdFile();

		/**
		 * The meta object literal for the '<em><b>Newline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_PARSER__NEWLINE = eINSTANCE.getSpreadsheetParser_Newline();

		/**
		 * The meta object literal for the '<em><b>Set New Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_PARSER__SET_NEW_CONTENT = eINSTANCE.getSpreadsheetParser_SetNewContent();

		/**
		 * The meta object literal for the '<em><b>Newlinetmp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_PARSER__NEWLINETMP = eINSTANCE.getSpreadsheetParser_Newlinetmp();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.UtilImpl <em>Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.UtilImpl
		 * @see datamodel.base.impl.BasePackageImpl#getUtil()
		 * @generated
		 */
		EClass UTIL = eINSTANCE.getUtil();

		/**
		 * The meta object literal for the '<em><b>Newline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__NEWLINE = eINSTANCE.getUtil_Newline();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__MAX_LENGTH = eINSTANCE.getUtil_MaxLength();

		/**
		 * The meta object literal for the '<em><b>MONTH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__MONTH = eINSTANCE.getUtil_MONTH();

		/**
		 * The meta object literal for the '<em><b>MONT Halt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__MONT_HALT = eINSTANCE.getUtil_MONTHalt();

		/**
		 * The meta object literal for the '<em><b>Get Raw Bytes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__GET_RAW_BYTES = eINSTANCE.getUtil_GetRawBytes();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.PairImpl
		 * @see datamodel.base.impl.BasePackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__CONTENT = eINSTANCE.getPair_Content();

		/**
		 * The meta object literal for the '<em><b>New String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__NEW_STRING = eINSTANCE.getPair_NewString();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.SimpleErrorHandlerImpl <em>Simple Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.SimpleErrorHandlerImpl
		 * @see datamodel.base.impl.BasePackageImpl#getSimpleErrorHandler()
		 * @generated
		 */
		EClass SIMPLE_ERROR_HANDLER = eINSTANCE.getSimpleErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ERROR_HANDLER__ERRORS = eINSTANCE.getSimpleErrorHandler_Errors();

		/**
		 * The meta object literal for the '{@link datamodel.base.impl.MainBaseImpl <em>Main Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.MainBaseImpl
		 * @see datamodel.base.impl.BasePackageImpl#getMainBase()
		 * @generated
		 */
		EClass MAIN_BASE = eINSTANCE.getMainBase();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_BASE__ROW = eINSTANCE.getMainBase_Row();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_BASE__SHEET = eINSTANCE.getMainBase_Sheet();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__EREFERENCE0 = eINSTANCE.getMainBase_EReference0();

		/**
		 * The meta object literal for the '<em><b>Convert Info To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__CONVERT_INFO_TO = eINSTANCE.getMainBase_ConvertInfoTo();

		/**
		 * The meta object literal for the '<em><b>Get Info From Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__GET_INFO_FROM_SPREAD = eINSTANCE.getMainBase_GetInfoFromSpread();

		/**
		 * The meta object literal for the '<em>Simple Error Handler DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see datamodel.base.impl.BasePackageImpl#getSimpleErrorHandlerDT()
		 * @generated
		 */
		EDataType SIMPLE_ERROR_HANDLER_DT = eINSTANCE.getSimpleErrorHandlerDT();

		/**
		 * The meta object literal for the '<em>Mand CBase DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see datamodel.base.impl.BasePackageImpl#getMandCBaseDT()
		 * @generated
		 */
		EDataType MAND_CBASE_DT = eINSTANCE.getMandCBaseDT();

		/**
		 * The meta object literal for the '<em>Main Base DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see datamodel.base.impl.BasePackageImpl#getMainBaseDT()
		 * @generated
		 */
		EDataType MAIN_BASE_DT = eINSTANCE.getMainBaseDT();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see datamodel.base.impl.BasePackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see datamodel.base.impl.BasePackageImpl#getHashtable()
		 * @generated
		 */
		EDataType HASHTABLE = eINSTANCE.getHashtable();

		/**
		 * The meta object literal for the '<em>SAX Parse Exception DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml.sax.SAXParseException
		 * @see datamodel.base.impl.BasePackageImpl#getSAXParseExceptionDT()
		 * @generated
		 */
		EDataType SAX_PARSE_EXCEPTION_DT = eINSTANCE.getSAXParseExceptionDT();

		/**
		 * The meta object literal for the '<em>String3 DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.BasePackageImpl#getString3DT()
		 * @generated
		 */
		EDataType STRING3_DT = eINSTANCE.getString3DT();

		/**
		 * The meta object literal for the '<em>String2 DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.BasePackageImpl#getString2DT()
		 * @generated
		 */
		EDataType STRING2_DT = eINSTANCE.getString2DT();

		/**
		 * The meta object literal for the '<em>String1 DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.BasePackageImpl#getString1DT()
		 * @generated
		 */
		EDataType STRING1_DT = eINSTANCE.getString1DT();

		/**
		 * The meta object literal for the '<em>System DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.System
		 * @see datamodel.base.impl.BasePackageImpl#getSystemDT()
		 * @generated
		 */
		EDataType SYSTEM_DT = eINSTANCE.getSystemDT();

	}

} //BasePackage
