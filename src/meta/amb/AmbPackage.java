/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.amb;

import meta.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see meta.amb.AmbFactory
 * @model kind="package"
 * @generated
 */
public interface AmbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "amb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alma.Control.datamodel.meta.amb/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "amb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmbPackage eINSTANCE = meta.amb.impl.AmbPackageImpl.init();

	/**
	 * The meta object id for the '{@link meta.amb.impl.ArchiveImplImpl <em>Archive Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.ArchiveImplImpl
	 * @see meta.amb.impl.AmbPackageImpl#getArchiveImpl()
	 * @generated
	 */
	int ARCHIVE_IMPL = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL__ROW = BasePackage.ARCHIVE_PROPERTY__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL__SHEET = BasePackage.ARCHIVE_PROPERTY__SHEET;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL__EREFERENCE0 = BasePackage.ARCHIVE_PROPERTY__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL__MP = BasePackage.ARCHIVE_PROPERTY__MP;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL__CP = BasePackage.ARCHIVE_PROPERTY__CP;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL__EREFERENCE1 = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archive Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_IMPL_FEATURE_COUNT = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link meta.amb.impl.ControlImplImpl <em>Control Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.ControlImplImpl
	 * @see meta.amb.impl.AmbPackageImpl#getControlImpl()
	 * @generated
	 */
	int CONTROL_IMPL = 1;

	/**
	 * The feature id for the '<em><b>EReference4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_IMPL__EREFERENCE4 = BasePackage.CONTROL_POINT__EREFERENCE4;

	/**
	 * The feature id for the '<em><b>EReference5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_IMPL__EREFERENCE5 = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_IMPL__EREFERENCE6 = BasePackage.CONTROL_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference7</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_IMPL__EREFERENCE7 = BasePackage.CONTROL_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_IMPL_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link meta.amb.impl.DeviceModelAMBImpl <em>Device Model AMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.DeviceModelAMBImpl
	 * @see meta.amb.impl.AmbPackageImpl#getDeviceModelAMB()
	 * @generated
	 */
	int DEVICE_MODEL_AMB = 2;

	/**
	 * The feature id for the '<em><b>Description Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__DESCRIPTION_INDEX = BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX;

	/**
	 * The feature id for the '<em><b>Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__SPREADSHEET = BasePackage.DEVICE_MODEL__SPREADSHEET;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__MAIN = BasePackage.DEVICE_MODEL__MAIN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__NOTES = BasePackage.DEVICE_MODEL__NOTES;

	/**
	 * The feature id for the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__MONITOR_POINTS = BasePackage.DEVICE_MODEL__MONITOR_POINTS;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__CONTROL_POINTS = BasePackage.DEVICE_MODEL__CONTROL_POINTS;

	/**
	 * The feature id for the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__ARCHIVE_PROPERTIES = BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__DEVICE_NAME = BasePackage.DEVICE_MODEL__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__BUS_TYPE = BasePackage.DEVICE_MODEL__BUS_TYPE;

	/**
	 * The feature id for the '<em><b>Device Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__DEVICE_DIR = BasePackage.DEVICE_MODEL__DEVICE_DIR;

	/**
	 * The feature id for the '<em><b>Codegen Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__CODEGEN_DIR = BasePackage.DEVICE_MODEL__CODEGEN_DIR;

	/**
	 * The feature id for the '<em><b>Spreadsheet Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__SPREADSHEET_DIR = BasePackage.DEVICE_MODEL__SPREADSHEET_DIR;

	/**
	 * The feature id for the '<em><b>Generated Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__GENERATED_DIR = BasePackage.DEVICE_MODEL__GENERATED_DIR;

	/**
	 * The feature id for the '<em><b>Monitor DB Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__MONITOR_DB_ONLY = BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY;

	/**
	 * The feature id for the '<em><b>Generate Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__GENERATE_ALT = BasePackage.DEVICE_MODEL__GENERATE_ALT;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE1 = BasePackage.DEVICE_MODEL__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE3 = BasePackage.DEVICE_MODEL__EREFERENCE3;

	/**
	 * The feature id for the '<em><b>EReference4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE4 = BasePackage.DEVICE_MODEL__EREFERENCE4;

	/**
	 * The feature id for the '<em><b>EReference5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE5 = BasePackage.DEVICE_MODEL__EREFERENCE5;

	/**
	 * The feature id for the '<em><b>EReference6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE6 = BasePackage.DEVICE_MODEL__EREFERENCE6;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE0 = BasePackage.DEVICE_MODEL__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference7</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE7 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference8</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE8 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference9</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE9 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EReference10</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE10 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference11</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE11 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EReference12</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE12 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReference13</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE13 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EReference14</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE14 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EReference15</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE15 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EReference16</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE16 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>EReference17</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE17 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EReference18</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB__EREFERENCE18 = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Device Model AMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_AMB_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link meta.amb.impl.MainImplImpl <em>Main Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.MainImplImpl
	 * @see meta.amb.impl.AmbPackageImpl#getMainImpl()
	 * @generated
	 */
	int MAIN_IMPL = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL__ROW = BasePackage.MAIN_BASE__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL__SHEET = BasePackage.MAIN_BASE__SHEET;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL__EREFERENCE0 = BasePackage.MAIN_BASE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL__EREFERENCE1 = BasePackage.MAIN_BASE__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL__EREFERENCE2 = BasePackage.MAIN_BASE__EREFERENCE2;

	/**
	 * The feature id for the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL__EREFERENCE3 = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_IMPL_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link meta.amb.impl.MandCImplImpl <em>Mand CImpl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.MandCImplImpl
	 * @see meta.amb.impl.AmbPackageImpl#getMandCImpl()
	 * @generated
	 */
	int MAND_CIMPL = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__ROW = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Mcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__MCP = 2;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__MASK = 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__EREFERENCE0 = 4;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__EREFERENCE1 = 5;

	/**
	 * The feature id for the '<em><b>EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__EREFERENCE2 = 6;

	/**
	 * The feature id for the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__EREFERENCE3 = 7;

	/**
	 * The feature id for the '<em><b>EReference4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL__EREFERENCE4 = 8;

	/**
	 * The number of structural features of the '<em>Mand CImpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CIMPL_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link meta.amb.impl.MonitorImplImpl <em>Monitor Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.MonitorImplImpl
	 * @see meta.amb.impl.AmbPackageImpl#getMonitorImpl()
	 * @generated
	 */
	int MONITOR_IMPL = 5;

	/**
	 * The feature id for the '<em><b>EReference4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_IMPL__EREFERENCE4 = BasePackage.MONITOR_POINT__EREFERENCE4;

	/**
	 * The feature id for the '<em><b>EReference5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_IMPL__EREFERENCE5 = BasePackage.MONITOR_POINT__EREFERENCE5;

	/**
	 * The feature id for the '<em><b>EReference6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_IMPL__EREFERENCE6 = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference7</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_IMPL__EREFERENCE7 = BasePackage.MONITOR_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference8</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_IMPL__EREFERENCE8 = BasePackage.MONITOR_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitor Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_IMPL_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link meta.amb.impl.SWModuleImpl <em>SW Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meta.amb.impl.SWModuleImpl
	 * @see meta.amb.impl.AmbPackageImpl#getSWModule()
	 * @generated
	 */
	int SW_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Assembly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ASSEMBLY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dir Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__DIR_PATH = 1;

	/**
	 * The feature id for the '<em><b>Main Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__MAIN_ASSEMBLY = 2;

	/**
	 * The feature id for the '<em><b>One Sw Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ONE_SW_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ROW = 4;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__PARENT_ROW = 5;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__SHEET = 6;

	/**
	 * The feature id for the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__MONITOR_POINTS = 7;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__CONTROL_POINTS = 8;

	/**
	 * The feature id for the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ARCHIVE_PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Sim Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__SIM_MONITOR_POINTS = 10;

	/**
	 * The feature id for the '<em><b>Sim Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__SIM_CONTROL_POINTS = 11;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__EREFERENCE0 = 12;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__EREFERENCE1 = 13;

	/**
	 * The feature id for the '<em><b>EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__EREFERENCE2 = 14;

	/**
	 * The feature id for the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__EREFERENCE3 = 15;

	/**
	 * The number of structural features of the '<em>SW Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE_FEATURE_COUNT = 16;


	/**
	 * Returns the meta object for class '{@link meta.amb.ArchiveImpl <em>Archive Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Impl</em>'.
	 * @see meta.amb.ArchiveImpl
	 * @generated
	 */
	EClass getArchiveImpl();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.ArchiveImpl#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see meta.amb.ArchiveImpl#getEReference1()
	 * @see #getArchiveImpl()
	 * @generated
	 */
	EReference getArchiveImpl_EReference1();

	/**
	 * Returns the meta object for class '{@link meta.amb.ControlImpl <em>Control Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Impl</em>'.
	 * @see meta.amb.ControlImpl
	 * @generated
	 */
	EClass getControlImpl();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.ControlImpl#getEReference5 <em>EReference5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference5</em>'.
	 * @see meta.amb.ControlImpl#getEReference5()
	 * @see #getControlImpl()
	 * @generated
	 */
	EReference getControlImpl_EReference5();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.ControlImpl#getEReference6 <em>EReference6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference6</em>'.
	 * @see meta.amb.ControlImpl#getEReference6()
	 * @see #getControlImpl()
	 * @generated
	 */
	EReference getControlImpl_EReference6();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.ControlImpl#getEReference7 <em>EReference7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference7</em>'.
	 * @see meta.amb.ControlImpl#getEReference7()
	 * @see #getControlImpl()
	 * @generated
	 */
	EReference getControlImpl_EReference7();

	/**
	 * Returns the meta object for class '{@link meta.amb.DeviceModelAMB <em>Device Model AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model AMB</em>'.
	 * @see meta.amb.DeviceModelAMB
	 * @generated
	 */
	EClass getDeviceModelAMB();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference7 <em>EReference7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference7</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference7()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference7();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference8 <em>EReference8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference8</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference8()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference8();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference9 <em>EReference9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference9</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference9()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference9();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference10 <em>EReference10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference10</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference10()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference10();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference11 <em>EReference11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference11</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference11()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference11();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference12 <em>EReference12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference12</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference12()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference12();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference13 <em>EReference13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference13</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference13()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference13();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference14 <em>EReference14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference14</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference14()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference14();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference15 <em>EReference15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference15</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference15()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference15();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference16 <em>EReference16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference16</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference16()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference16();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference17 <em>EReference17</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference17</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference17()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference17();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.DeviceModelAMB#getEReference18 <em>EReference18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference18</em>'.
	 * @see meta.amb.DeviceModelAMB#getEReference18()
	 * @see #getDeviceModelAMB()
	 * @generated
	 */
	EReference getDeviceModelAMB_EReference18();

	/**
	 * Returns the meta object for class '{@link meta.amb.MainImpl <em>Main Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Impl</em>'.
	 * @see meta.amb.MainImpl
	 * @generated
	 */
	EClass getMainImpl();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MainImpl#getEReference3 <em>EReference3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference3</em>'.
	 * @see meta.amb.MainImpl#getEReference3()
	 * @see #getMainImpl()
	 * @generated
	 */
	EReference getMainImpl_EReference3();

	/**
	 * Returns the meta object for class '{@link meta.amb.MandCImpl <em>Mand CImpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand CImpl</em>'.
	 * @see meta.amb.MandCImpl
	 * @generated
	 */
	EClass getMandCImpl();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.MandCImpl#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see meta.amb.MandCImpl#getRow()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EAttribute getMandCImpl_Row();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.MandCImpl#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see meta.amb.MandCImpl#getSheet()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EAttribute getMandCImpl_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.MandCImpl#getMcp <em>Mcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcp</em>'.
	 * @see meta.amb.MandCImpl#getMcp()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EAttribute getMandCImpl_Mcp();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.MandCImpl#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see meta.amb.MandCImpl#getMask()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EAttribute getMandCImpl_Mask();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MandCImpl#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see meta.amb.MandCImpl#getEReference0()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EReference getMandCImpl_EReference0();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MandCImpl#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see meta.amb.MandCImpl#getEReference1()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EReference getMandCImpl_EReference1();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MandCImpl#getEReference2 <em>EReference2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference2</em>'.
	 * @see meta.amb.MandCImpl#getEReference2()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EReference getMandCImpl_EReference2();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MandCImpl#getEReference3 <em>EReference3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference3</em>'.
	 * @see meta.amb.MandCImpl#getEReference3()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EReference getMandCImpl_EReference3();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MandCImpl#getEReference4 <em>EReference4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference4</em>'.
	 * @see meta.amb.MandCImpl#getEReference4()
	 * @see #getMandCImpl()
	 * @generated
	 */
	EReference getMandCImpl_EReference4();

	/**
	 * Returns the meta object for class '{@link meta.amb.MonitorImpl <em>Monitor Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor Impl</em>'.
	 * @see meta.amb.MonitorImpl
	 * @generated
	 */
	EClass getMonitorImpl();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MonitorImpl#getEReference6 <em>EReference6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference6</em>'.
	 * @see meta.amb.MonitorImpl#getEReference6()
	 * @see #getMonitorImpl()
	 * @generated
	 */
	EReference getMonitorImpl_EReference6();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MonitorImpl#getEReference7 <em>EReference7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference7</em>'.
	 * @see meta.amb.MonitorImpl#getEReference7()
	 * @see #getMonitorImpl()
	 * @generated
	 */
	EReference getMonitorImpl_EReference7();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.MonitorImpl#getEReference8 <em>EReference8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference8</em>'.
	 * @see meta.amb.MonitorImpl#getEReference8()
	 * @see #getMonitorImpl()
	 * @generated
	 */
	EReference getMonitorImpl_EReference8();

	/**
	 * Returns the meta object for class '{@link meta.amb.SWModule <em>SW Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Module</em>'.
	 * @see meta.amb.SWModule
	 * @generated
	 */
	EClass getSWModule();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getAssemblyName <em>Assembly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly Name</em>'.
	 * @see meta.amb.SWModule#getAssemblyName()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_AssemblyName();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getDirPath <em>Dir Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Path</em>'.
	 * @see meta.amb.SWModule#getDirPath()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_DirPath();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getMainAssembly <em>Main Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Assembly</em>'.
	 * @see meta.amb.SWModule#getMainAssembly()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_MainAssembly();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#isOneSwModule <em>One Sw Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Sw Module</em>'.
	 * @see meta.amb.SWModule#isOneSwModule()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_OneSwModule();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see meta.amb.SWModule#getRow()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Row();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getParentRow <em>Parent Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Row</em>'.
	 * @see meta.amb.SWModule#getParentRow()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ParentRow();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see meta.amb.SWModule#getSheet()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Points</em>'.
	 * @see meta.amb.SWModule#getMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_MonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Points</em>'.
	 * @see meta.amb.SWModule#getControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Properties</em>'.
	 * @see meta.amb.SWModule#getArchiveProperties()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ArchiveProperties();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Monitor Points</em>'.
	 * @see meta.amb.SWModule#getSimMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_SimMonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link meta.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Control Points</em>'.
	 * @see meta.amb.SWModule#getSimControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_SimControlPoints();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.SWModule#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see meta.amb.SWModule#getEReference0()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_EReference0();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.SWModule#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see meta.amb.SWModule#getEReference1()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_EReference1();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.SWModule#getEReference2 <em>EReference2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference2</em>'.
	 * @see meta.amb.SWModule#getEReference2()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_EReference2();

	/**
	 * Returns the meta object for the reference '{@link meta.amb.SWModule#getEReference3 <em>EReference3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference3</em>'.
	 * @see meta.amb.SWModule#getEReference3()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_EReference3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmbFactory getAmbFactory();

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
		 * The meta object literal for the '{@link meta.amb.impl.ArchiveImplImpl <em>Archive Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.ArchiveImplImpl
		 * @see meta.amb.impl.AmbPackageImpl#getArchiveImpl()
		 * @generated
		 */
		EClass ARCHIVE_IMPL = eINSTANCE.getArchiveImpl();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_IMPL__EREFERENCE1 = eINSTANCE.getArchiveImpl_EReference1();

		/**
		 * The meta object literal for the '{@link meta.amb.impl.ControlImplImpl <em>Control Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.ControlImplImpl
		 * @see meta.amb.impl.AmbPackageImpl#getControlImpl()
		 * @generated
		 */
		EClass CONTROL_IMPL = eINSTANCE.getControlImpl();

		/**
		 * The meta object literal for the '<em><b>EReference5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_IMPL__EREFERENCE5 = eINSTANCE.getControlImpl_EReference5();

		/**
		 * The meta object literal for the '<em><b>EReference6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_IMPL__EREFERENCE6 = eINSTANCE.getControlImpl_EReference6();

		/**
		 * The meta object literal for the '<em><b>EReference7</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_IMPL__EREFERENCE7 = eINSTANCE.getControlImpl_EReference7();

		/**
		 * The meta object literal for the '{@link meta.amb.impl.DeviceModelAMBImpl <em>Device Model AMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.DeviceModelAMBImpl
		 * @see meta.amb.impl.AmbPackageImpl#getDeviceModelAMB()
		 * @generated
		 */
		EClass DEVICE_MODEL_AMB = eINSTANCE.getDeviceModelAMB();

		/**
		 * The meta object literal for the '<em><b>EReference7</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE7 = eINSTANCE.getDeviceModelAMB_EReference7();

		/**
		 * The meta object literal for the '<em><b>EReference8</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE8 = eINSTANCE.getDeviceModelAMB_EReference8();

		/**
		 * The meta object literal for the '<em><b>EReference9</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE9 = eINSTANCE.getDeviceModelAMB_EReference9();

		/**
		 * The meta object literal for the '<em><b>EReference10</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE10 = eINSTANCE.getDeviceModelAMB_EReference10();

		/**
		 * The meta object literal for the '<em><b>EReference11</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE11 = eINSTANCE.getDeviceModelAMB_EReference11();

		/**
		 * The meta object literal for the '<em><b>EReference12</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE12 = eINSTANCE.getDeviceModelAMB_EReference12();

		/**
		 * The meta object literal for the '<em><b>EReference13</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE13 = eINSTANCE.getDeviceModelAMB_EReference13();

		/**
		 * The meta object literal for the '<em><b>EReference14</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE14 = eINSTANCE.getDeviceModelAMB_EReference14();

		/**
		 * The meta object literal for the '<em><b>EReference15</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE15 = eINSTANCE.getDeviceModelAMB_EReference15();

		/**
		 * The meta object literal for the '<em><b>EReference16</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE16 = eINSTANCE.getDeviceModelAMB_EReference16();

		/**
		 * The meta object literal for the '<em><b>EReference17</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE17 = eINSTANCE.getDeviceModelAMB_EReference17();

		/**
		 * The meta object literal for the '<em><b>EReference18</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL_AMB__EREFERENCE18 = eINSTANCE.getDeviceModelAMB_EReference18();

		/**
		 * The meta object literal for the '{@link meta.amb.impl.MainImplImpl <em>Main Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.MainImplImpl
		 * @see meta.amb.impl.AmbPackageImpl#getMainImpl()
		 * @generated
		 */
		EClass MAIN_IMPL = eINSTANCE.getMainImpl();

		/**
		 * The meta object literal for the '<em><b>EReference3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_IMPL__EREFERENCE3 = eINSTANCE.getMainImpl_EReference3();

		/**
		 * The meta object literal for the '{@link meta.amb.impl.MandCImplImpl <em>Mand CImpl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.MandCImplImpl
		 * @see meta.amb.impl.AmbPackageImpl#getMandCImpl()
		 * @generated
		 */
		EClass MAND_CIMPL = eINSTANCE.getMandCImpl();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CIMPL__ROW = eINSTANCE.getMandCImpl_Row();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CIMPL__SHEET = eINSTANCE.getMandCImpl_Sheet();

		/**
		 * The meta object literal for the '<em><b>Mcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CIMPL__MCP = eINSTANCE.getMandCImpl_Mcp();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CIMPL__MASK = eINSTANCE.getMandCImpl_Mask();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CIMPL__EREFERENCE0 = eINSTANCE.getMandCImpl_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CIMPL__EREFERENCE1 = eINSTANCE.getMandCImpl_EReference1();

		/**
		 * The meta object literal for the '<em><b>EReference2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CIMPL__EREFERENCE2 = eINSTANCE.getMandCImpl_EReference2();

		/**
		 * The meta object literal for the '<em><b>EReference3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CIMPL__EREFERENCE3 = eINSTANCE.getMandCImpl_EReference3();

		/**
		 * The meta object literal for the '<em><b>EReference4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CIMPL__EREFERENCE4 = eINSTANCE.getMandCImpl_EReference4();

		/**
		 * The meta object literal for the '{@link meta.amb.impl.MonitorImplImpl <em>Monitor Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.MonitorImplImpl
		 * @see meta.amb.impl.AmbPackageImpl#getMonitorImpl()
		 * @generated
		 */
		EClass MONITOR_IMPL = eINSTANCE.getMonitorImpl();

		/**
		 * The meta object literal for the '<em><b>EReference6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_IMPL__EREFERENCE6 = eINSTANCE.getMonitorImpl_EReference6();

		/**
		 * The meta object literal for the '<em><b>EReference7</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_IMPL__EREFERENCE7 = eINSTANCE.getMonitorImpl_EReference7();

		/**
		 * The meta object literal for the '<em><b>EReference8</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_IMPL__EREFERENCE8 = eINSTANCE.getMonitorImpl_EReference8();

		/**
		 * The meta object literal for the '{@link meta.amb.impl.SWModuleImpl <em>SW Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meta.amb.impl.SWModuleImpl
		 * @see meta.amb.impl.AmbPackageImpl#getSWModule()
		 * @generated
		 */
		EClass SW_MODULE = eINSTANCE.getSWModule();

		/**
		 * The meta object literal for the '<em><b>Assembly Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__ASSEMBLY_NAME = eINSTANCE.getSWModule_AssemblyName();

		/**
		 * The meta object literal for the '<em><b>Dir Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__DIR_PATH = eINSTANCE.getSWModule_DirPath();

		/**
		 * The meta object literal for the '<em><b>Main Assembly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__MAIN_ASSEMBLY = eINSTANCE.getSWModule_MainAssembly();

		/**
		 * The meta object literal for the '<em><b>One Sw Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__ONE_SW_MODULE = eINSTANCE.getSWModule_OneSwModule();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__ROW = eINSTANCE.getSWModule_Row();

		/**
		 * The meta object literal for the '<em><b>Parent Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__PARENT_ROW = eINSTANCE.getSWModule_ParentRow();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__SHEET = eINSTANCE.getSWModule_Sheet();

		/**
		 * The meta object literal for the '<em><b>Monitor Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__MONITOR_POINTS = eINSTANCE.getSWModule_MonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Control Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__CONTROL_POINTS = eINSTANCE.getSWModule_ControlPoints();

		/**
		 * The meta object literal for the '<em><b>Archive Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__ARCHIVE_PROPERTIES = eINSTANCE.getSWModule_ArchiveProperties();

		/**
		 * The meta object literal for the '<em><b>Sim Monitor Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__SIM_MONITOR_POINTS = eINSTANCE.getSWModule_SimMonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Sim Control Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__SIM_CONTROL_POINTS = eINSTANCE.getSWModule_SimControlPoints();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__EREFERENCE0 = eINSTANCE.getSWModule_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__EREFERENCE1 = eINSTANCE.getSWModule_EReference1();

		/**
		 * The meta object literal for the '<em><b>EReference2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__EREFERENCE2 = eINSTANCE.getSWModule_EReference2();

		/**
		 * The meta object literal for the '<em><b>EReference3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__EREFERENCE3 = eINSTANCE.getSWModule_EReference3();

	}

} //AmbPackage
