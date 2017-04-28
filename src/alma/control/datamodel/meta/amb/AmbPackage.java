/**
 * ALMA - Atacama Large Millimiter Array
 * (c) European Southern Observatory, 2017
 * Copyright by ESO (in the framework of the ALMA collaboration),
 * All rights reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, 
 * MA 02111-1307  USA
 * 
 */
package alma.control.datamodel.meta.amb;

import alma.control.datamodel.meta.base.BasePackage;

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
 * @see alma.control.datamodel.meta.amb.AmbFactory
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
	String eNS_URI = "http://alma/Control/datamodel/meta/amb/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alma.Control.datamodel.meta.amb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmbPackage eINSTANCE = alma.control.datamodel.meta.amb.impl.AmbPackageImpl.init();

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.ArchiveImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ROW = BasePackage.ARCHIVE_PROPERTY__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__SHEET = BasePackage.ARCHIVE_PROPERTY__SHEET;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__CP = BasePackage.ARCHIVE_PROPERTY__CP;

	/**
	 * The feature id for the '<em><b>Mp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__MP = BasePackage.ARCHIVE_PROPERTY__MP;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__TABLES = BasePackage.ARCHIVE_PROPERTY__TABLES;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.ControlImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SPREADSHEET_NAME = BasePackage.CONTROL_POINT__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTAINER = BasePackage.CONTROL_POINT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DEPENDENTS = BasePackage.CONTROL_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARENT = BasePackage.CONTROL_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ARCHIVE = BasePackage.CONTROL_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SHEET_NAME = BasePackage.CONTROL_POINT__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ROW = BasePackage.CONTROL_POINT__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SHEET = BasePackage.CONTROL_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Manc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MANC = BasePackage.CONTROL_POINT__MANC;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TABLES = BasePackage.CONTROL_POINT__TABLES;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__UTILS = BasePackage.CONTROL_POINT__UTILS;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MAC = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.DeviceModelImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getDeviceModel()
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
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CONTAINER = BasePackage.DEVICE_MODEL__CONTAINER;

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
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MAIN = BasePackage.DEVICE_MODEL__MAIN;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TABLES = BasePackage.DEVICE_MODEL__TABLES;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__UTILS = BasePackage.DEVICE_MODEL__UTILS;

	/**
	 * The feature id for the '<em><b>Main Amb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MAIN_AMB = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CPoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CPOINTS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>APoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__APOINTS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MPoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MPOINTS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__NOTE = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl <em>Generic Monitor Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getGenericMonitorPoints()
	 * @generated
	 */
	int GENERIC_MONITOR_POINTS = 3;

	/**
	 * The feature id for the '<em><b>New Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__NEW_SPREADSHEET = 0;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__DEVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__DIR_LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Generic Monitor Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.MainImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ROW = BasePackage.MAIN_BASE__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__SHEET = BasePackage.MAIN_BASE__SHEET;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TABLES = BasePackage.MAIN_BASE__TABLES;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__UTILS = BasePackage.MAIN_BASE__UTILS;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.MandCImpl <em>Mand C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.MandCImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMandC()
	 * @generated
	 */
	int MAND_C = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__ROW = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__MASK = 2;

	/**
	 * The feature id for the '<em><b>Mcp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__MCP = 3;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__TABLES = 4;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__UTILS = 5;

	/**
	 * The number of structural features of the '<em>Mand C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.MonitorImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 6;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SPREADSHEET_NAME = BasePackage.MONITOR_POINT__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__CONTAINER = BasePackage.MONITOR_POINT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__DEPENDENTS = BasePackage.MONITOR_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__PARENT = BasePackage.MONITOR_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__ARCHIVE = BasePackage.MONITOR_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SHEET_NAME = BasePackage.MONITOR_POINT__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__ROW = BasePackage.MONITOR_POINT__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SHEET = BasePackage.MONITOR_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Manc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__MANC = BasePackage.MONITOR_POINT__MANC;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TABLES = BasePackage.MONITOR_POINT__TABLES;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__UTILS = BasePackage.MONITOR_POINT__UTILS;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__MAC = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see alma.control.datamodel.meta.amb.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see alma.control.datamodel.meta.amb.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.Control#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mac</em>'.
	 * @see alma.control.datamodel.meta.amb.Control#getMac()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Mac();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link alma.control.datamodel.meta.amb.DeviceModel#getMainAmbList <em>Main Amb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Main Amb</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getMainAmbList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_MainAmb();

	/**
	 * Returns the meta object for the containment reference list '{@link alma.control.datamodel.meta.amb.DeviceModel#getCPointsList <em>CPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CPoints</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getCPointsList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_CPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link alma.control.datamodel.meta.amb.DeviceModel#getAPointsList <em>APoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>APoints</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getAPointsList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_APoints();

	/**
	 * Returns the meta object for the containment reference list '{@link alma.control.datamodel.meta.amb.DeviceModel#getMPointsList <em>MPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MPoints</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getMPointsList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_MPoints();

	/**
	 * Returns the meta object for the containment reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getNote()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_Note();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints <em>Generic Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints
	 * @generated
	 */
	EClass getGenericMonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getNewSpreadsheet()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_NewSpreadsheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getDeviceName()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Location</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getDirLocation()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_DirLocation();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see alma.control.datamodel.meta.amb.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.MandC <em>Mand C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand C</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC
	 * @generated
	 */
	EClass getMandC();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getRow()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getSheet()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getMask()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Mask();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.MandC#getMcp <em>Mcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mcp</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getMcp()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_Mcp();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.MandC#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getTables()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_Tables();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.MandC#getUtils <em>Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utils</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getUtils()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_Utils();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see alma.control.datamodel.meta.amb.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.Monitor#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mac</em>'.
	 * @see alma.control.datamodel.meta.amb.Monitor#getMac()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Mac();

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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.ArchiveImpl <em>Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.ArchiveImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.ControlImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MAC = eINSTANCE.getControl_Mac();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.DeviceModelImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getDeviceModel()
		 * @generated
		 */
		EClass DEVICE_MODEL = eINSTANCE.getDeviceModel();

		/**
		 * The meta object literal for the '<em><b>Main Amb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__MAIN_AMB = eINSTANCE.getDeviceModel_MainAmb();

		/**
		 * The meta object literal for the '<em><b>CPoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__CPOINTS = eINSTANCE.getDeviceModel_CPoints();

		/**
		 * The meta object literal for the '<em><b>APoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__APOINTS = eINSTANCE.getDeviceModel_APoints();

		/**
		 * The meta object literal for the '<em><b>MPoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__MPOINTS = eINSTANCE.getDeviceModel_MPoints();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__NOTE = eINSTANCE.getDeviceModel_Note();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl <em>Generic Monitor Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getGenericMonitorPoints()
		 * @generated
		 */
		EClass GENERIC_MONITOR_POINTS = eINSTANCE.getGenericMonitorPoints();

		/**
		 * The meta object literal for the '<em><b>New Spreadsheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MONITOR_POINTS__NEW_SPREADSHEET = eINSTANCE.getGenericMonitorPoints_NewSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MONITOR_POINTS__DEVICE_NAME = eINSTANCE.getGenericMonitorPoints_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Dir Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MONITOR_POINTS__DIR_LOCATION = eINSTANCE.getGenericMonitorPoints_DirLocation();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.MainImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.MandCImpl <em>Mand C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.MandCImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMandC()
		 * @generated
		 */
		EClass MAND_C = eINSTANCE.getMandC();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__ROW = eINSTANCE.getMandC_Row();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__SHEET = eINSTANCE.getMandC_Sheet();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__MASK = eINSTANCE.getMandC_Mask();

		/**
		 * The meta object literal for the '<em><b>Mcp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__MCP = eINSTANCE.getMandC_Mcp();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__TABLES = eINSTANCE.getMandC_Tables();

		/**
		 * The meta object literal for the '<em><b>Utils</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__UTILS = eINSTANCE.getMandC_Utils();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.MonitorImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__MAC = eINSTANCE.getMonitor_Mac();

	}

} //AmbPackage
