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
package alma.control.datamodel.meta.base;

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
 * @see alma.control.datamodel.meta.base.BaseFactory
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
	String eNS_URI = "http://alma/Control/datamodel/meta/base/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alma.Control.datamodel.meta.base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = alma.control.datamodel.meta.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.ArchivePropertyImpl <em>Archive Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.ArchivePropertyImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getArchiveProperty()
	 * @generated
	 */
	int ARCHIVE_PROPERTY = 0;

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
	 * The feature id for the '<em><b>Mp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__MP = 2;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__CP = 3;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__TABLES = 4;

	/**
	 * The number of structural features of the '<em>Archive Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl <em>Mand CBase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.MandCBaseImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMandCBase()
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
	 * The feature id for the '<em><b>Resource Set Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__RESOURCE_SET_DEPENDENT = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__PARENT = 6;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__DEPENDENTS = 7;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__TABLES = 8;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__UTILS = 9;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__ARCHIVE = 10;

	/**
	 * The number of structural features of the '<em>Mand CBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.ControlPointImpl <em>Control Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.ControlPointImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getControlPoint()
	 * @generated
	 */
	int CONTROL_POINT = 1;

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
	 * The feature id for the '<em><b>Resource Set Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__RESOURCE_SET_DEPENDENT = MAND_CBASE__RESOURCE_SET_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__PARENT = MAND_CBASE__PARENT;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__DEPENDENTS = MAND_CBASE__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__TABLES = MAND_CBASE__TABLES;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__UTILS = MAND_CBASE__UTILS;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__ARCHIVE = MAND_CBASE__ARCHIVE;

	/**
	 * The number of structural features of the '<em>Control Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT_FEATURE_COUNT = MAND_CBASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.DeviceModelImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getDeviceModel()
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
	 * The feature id for the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MONITOR_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CONTROL_POINTS = 4;

	/**
	 * The feature id for the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__ARCHIVE_PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CONTAINER = 6;

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
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MAIN = 15;

	/**
	 * The feature id for the '<em><b>AProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__APROPERTIES = 16;

	/**
	 * The feature id for the '<em><b>CPoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__CPOINTS = 17;

	/**
	 * The feature id for the '<em><b>MPoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__MPOINTS = 18;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__UTILS = 19;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TABLES = 20;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.MainBaseImpl <em>Main Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.MainBaseImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMainBase()
	 * @generated
	 */
	int MAIN_BASE = 3;

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
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__TABLES = 2;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__UTILS = 3;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__DEVICES = 4;

	/**
	 * The number of structural features of the '<em>Main Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.MonitorPointImpl <em>Monitor Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.MonitorPointImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMonitorPoint()
	 * @generated
	 */
	int MONITOR_POINT = 5;

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
	 * The feature id for the '<em><b>Resource Set Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__RESOURCE_SET_DEPENDENT = MAND_CBASE__RESOURCE_SET_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__PARENT = MAND_CBASE__PARENT;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__DEPENDENTS = MAND_CBASE__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__TABLES = MAND_CBASE__TABLES;

	/**
	 * The feature id for the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__UTILS = MAND_CBASE__UTILS;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__ARCHIVE = MAND_CBASE__ARCHIVE;

	/**
	 * The number of structural features of the '<em>Monitor Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT_FEATURE_COUNT = MAND_CBASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.NoteImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getNote()
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
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl <em>Spreadsheet Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetParser()
	 * @generated
	 */
	int SPREADSHEET_PARSER = 9;

	/**
	 * The feature id for the '<em><b>Ref Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__REF_PATH = 0;

	/**
	 * The feature id for the '<em><b>Ref Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__REF_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__XML = 2;

	/**
	 * The feature id for the '<em><b>Xsd File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__XSD_FILE = 3;

	/**
	 * The feature id for the '<em><b>Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__NEWLINE = 4;

	/**
	 * The number of structural features of the '<em>Spreadsheet Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.PairImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 7;

	/**
	 * The feature id for the '<em><b>Ref Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__REF_PATH = SPREADSHEET_PARSER__REF_PATH;

	/**
	 * The feature id for the '<em><b>Ref Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__REF_STATUS = SPREADSHEET_PARSER__REF_STATUS;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__XML = SPREADSHEET_PARSER__XML;

	/**
	 * The feature id for the '<em><b>Xsd File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__XSD_FILE = SPREADSHEET_PARSER__XSD_FILE;

	/**
	 * The feature id for the '<em><b>Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__NEWLINE = SPREADSHEET_PARSER__NEWLINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__CONTENT = SPREADSHEET_PARSER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__NEW_STRING = SPREADSHEET_PARSER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = SPREADSHEET_PARSER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xml.sax.ErrorHandler <em>Error Handler Aux Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml.sax.ErrorHandler
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getErrorHandlerAuxClass()
	 * @generated
	 */
	int ERROR_HANDLER_AUX_CLASS = 13;

	/**
	 * The number of structural features of the '<em>Error Handler Aux Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER_AUX_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.SimpleErrorHandlerImpl <em>Simple Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.SimpleErrorHandlerImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandler()
	 * @generated
	 */
	int SIMPLE_ERROR_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ERROR_HANDLER__ERRORS = ERROR_HANDLER_AUX_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ERROR_HANDLER_FEATURE_COUNT = ERROR_HANDLER_AUX_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl <em>Spreadsheet Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetValidator()
	 * @generated
	 */
	int SPREADSHEET_VALIDATOR = 10;

	/**
	 * The feature id for the '<em><b>Seh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__SEH = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__ERROR_LIST = 1;

	/**
	 * The feature id for the '<em><b>Seh Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__SEH_TMP = 2;

	/**
	 * The number of structural features of the '<em>Spreadsheet Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.TableImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 11;

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
	 * The feature id for the '<em><b>To CPP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CPP = 4;

	/**
	 * The feature id for the '<em><b>To IDL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_IDL = 5;

	/**
	 * The feature id for the '<em><b>To IDL Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_IDL_SEQ = 6;

	/**
	 * The feature id for the '<em><b>To CORBA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CORBA = 7;

	/**
	 * The feature id for the '<em><b>To CORBA Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CORBA_SEQ = 8;

	/**
	 * The feature id for the '<em><b>To CORBA Dev IO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_CORBA_DEV_IO = 9;

	/**
	 * The feature id for the '<em><b>To BACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_BACI = 10;

	/**
	 * The feature id for the '<em><b>To Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TO_DATABASE = 11;

	/**
	 * The feature id for the '<em><b>Raw To CPP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW_TO_CPP = 12;

	/**
	 * The feature id for the '<em><b>Raw To Byte Swapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW_TO_BYTE_SWAPPED = 13;

	/**
	 * The feature id for the '<em><b>Raw Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW_BYTES = 14;

	/**
	 * The feature id for the '<em><b>World To CPP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CPP = 15;

	/**
	 * The feature id for the '<em><b>World To IDL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_IDL = 16;

	/**
	 * The feature id for the '<em><b>World To IDL Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_IDL_SEQ = 17;

	/**
	 * The feature id for the '<em><b>World To CORBA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CORBA = 18;

	/**
	 * The feature id for the '<em><b>World To CORBA Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CORBA_SEQ = 19;

	/**
	 * The feature id for the '<em><b>World To CORBA Dev IO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_CORBA_DEV_IO = 20;

	/**
	 * The feature id for the '<em><b>World To BACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_BACI = 21;

	/**
	 * The feature id for the '<em><b>World To Java</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_JAVA = 22;

	/**
	 * The feature id for the '<em><b>World To Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WORLD_TO_DATABASE = 23;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.base.impl.UtilImpl <em>Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.UtilImpl
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getUtil()
	 * @generated
	 */
	int UTIL = 12;

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
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__TABLES = 4;

	/**
	 * The number of structural features of the '<em>Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '<em>Control Point DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.ControlPoint
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getControlPointDT()
	 * @generated
	 */
	int CONTROL_POINT_DT = 14;

	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 15;

	/**
	 * The meta object id for the '<em>Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getHashtable()
	 * @generated
	 */
	int HASHTABLE = 16;

	/**
	 * The meta object id for the '<em>Monitor Point DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.MonitorPoint
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMonitorPointDT()
	 * @generated
	 */
	int MONITOR_POINT_DT = 17;

	/**
	 * The meta object id for the '<em>Archive Property DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.ArchiveProperty
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getArchivePropertyDT()
	 * @generated
	 */
	int ARCHIVE_PROPERTY_DT = 18;

	/**
	 * The meta object id for the '<em>Simple Error Handler DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.SimpleErrorHandler
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandlerDT()
	 * @generated
	 */
	int SIMPLE_ERROR_HANDLER_DT = 19;

	/**
	 * The meta object id for the '<em>Mand CBase DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.MandCBase
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMandCBaseDT()
	 * @generated
	 */
	int MAND_CBASE_DT = 20;

	/**
	 * The meta object id for the '<em>Main Base DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.MainBase
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMainBaseDT()
	 * @generated
	 */
	int MAIN_BASE_DT = 21;

	/**
	 * The meta object id for the '<em>Runtime Exception DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.RuntimeException
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getRuntimeExceptionDT()
	 * @generated
	 */
	int RUNTIME_EXCEPTION_DT = 22;

	/**
	 * The meta object id for the '<em>Error Handler DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml.sax.ErrorHandler
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getErrorHandlerDT()
	 * @generated
	 */
	int ERROR_HANDLER_DT = 23;

	/**
	 * The meta object id for the '<em>SAX Parse Exception DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml.sax.SAXParseException
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSAXParseExceptionDT()
	 * @generated
	 */
	int SAX_PARSE_EXCEPTION_DT = 24;

	/**
	 * The meta object id for the '<em>EString Array3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray3()
	 * @generated
	 */
	int ESTRING_ARRAY3 = 26;

	/**
	 * The meta object id for the '<em>EString Array2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray2()
	 * @generated
	 */
	int ESTRING_ARRAY2 = 27;

	/**
	 * The meta object id for the '<em>EString Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray()
	 * @generated
	 */
	int ESTRING_ARRAY = 25;

	/**
	 * The meta object id for the '<em>Mand CETHDT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.MandC
	 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMandCETHDT()
	 * @generated
	 */
	int MAND_CETHDT = 28;


	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.ArchiveProperty <em>Archive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Property</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty
	 * @generated
	 */
	EClass getArchiveProperty();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.ArchiveProperty#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty#getRow()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.ArchiveProperty#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty#getSheet()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Sheet();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.ArchiveProperty#getMp <em>Mp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mp</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty#getMp()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EReference getArchiveProperty_Mp();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.ArchiveProperty#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cp</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty#getCp()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EReference getArchiveProperty_Cp();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.ArchiveProperty#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty#getTables()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EReference getArchiveProperty_Tables();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.ControlPoint <em>Control Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Point</em>'.
	 * @see alma.control.datamodel.meta.base.ControlPoint
	 * @generated
	 */
	EClass getControlPoint();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Index</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getDescriptionIndex()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DescriptionIndex();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Spreadsheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getNotes()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Notes();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getMonitorPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_MonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Points</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getControlPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_ControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Properties</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getArchiveProperties()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_ArchiveProperties();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getContainer()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Container();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getDeviceName()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getBusType()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_BusType();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getDeviceDir <em>Device Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Dir</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getDeviceDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DeviceDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codegen Dir</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getCodegenDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_CodegenDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet Dir</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getSpreadsheetDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_SpreadsheetDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Dir</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getGeneratedDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_GeneratedDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor DB Only</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#isMonitorDBOnly()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_MonitorDBOnly();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Alt</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#isGenerateAlt()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_GenerateAlt();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.DeviceModel#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_Main();

	/**
	 * Returns the meta object for the reference list '{@link alma.control.datamodel.meta.base.DeviceModel#getAPropertiesList <em>AProperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>AProperties</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getAPropertiesList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_AProperties();

	/**
	 * Returns the meta object for the reference list '{@link alma.control.datamodel.meta.base.DeviceModel#getCPointsList <em>CPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CPoints</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getCPointsList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_CPoints();

	/**
	 * Returns the meta object for the reference list '{@link alma.control.datamodel.meta.base.DeviceModel#getMPointsList <em>MPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MPoints</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getMPointsList()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_MPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.DeviceModel#getUtils <em>Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utils</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getUtils()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_Utils();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.DeviceModel#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see alma.control.datamodel.meta.base.DeviceModel#getTables()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_Tables();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.MainBase <em>Main Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Base</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase
	 * @generated
	 */
	EClass getMainBase();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MainBase#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase#getRow()
	 * @see #getMainBase()
	 * @generated
	 */
	EAttribute getMainBase_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MainBase#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase#getSheet()
	 * @see #getMainBase()
	 * @generated
	 */
	EAttribute getMainBase_Sheet();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.MainBase#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase#getTables()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_Tables();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.MainBase#getUtils <em>Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utils</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase#getUtils()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_Utils();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.MainBase#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devices</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase#getDevices()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_Devices();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.MandCBase <em>Mand CBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand CBase</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase
	 * @generated
	 */
	EClass getMandCBase();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet Name</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getSpreadsheetName()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_SpreadsheetName();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getSheetName <em>Sheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Name</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getSheetName()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_SheetName();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getRow()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getParentRow <em>Parent Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Row</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getParentRow()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_ParentRow();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getSheet()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getResourceSetDependent <em>Resource Set Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Set Dependent</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getResourceSetDependent()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_ResourceSetDependent();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getParent()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Parent();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Archive</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getArchive()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_Archive();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependents</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getDependents()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Dependents();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.MandCBase#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getTables()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_Tables();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.MandCBase#getUtils <em>Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utils</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase#getUtils()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_Utils();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.MonitorPoint <em>Monitor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor Point</em>'.
	 * @see alma.control.datamodel.meta.base.MonitorPoint
	 * @generated
	 */
	EClass getMonitorPoint();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see alma.control.datamodel.meta.base.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Note#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see alma.control.datamodel.meta.base.Note#getNote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Note();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see alma.control.datamodel.meta.base.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Pair#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see alma.control.datamodel.meta.base.Pair#getContent()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Content();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Pair#getNewString <em>New String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New String</em>'.
	 * @see alma.control.datamodel.meta.base.Pair#getNewString()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_NewString();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.SimpleErrorHandler <em>Simple Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Error Handler</em>'.
	 * @see alma.control.datamodel.meta.base.SimpleErrorHandler
	 * @generated
	 */
	EClass getSimpleErrorHandler();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SimpleErrorHandler#isErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see alma.control.datamodel.meta.base.SimpleErrorHandler#isErrors()
	 * @see #getSimpleErrorHandler()
	 * @generated
	 */
	EAttribute getSimpleErrorHandler_Errors();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.SpreadsheetParser <em>Spreadsheet Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Parser</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser
	 * @generated
	 */
	EClass getSpreadsheetParser();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Path</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser#getRefPath()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_RefPath();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Status</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser#isRefStatus()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_RefStatus();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser#getXml()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Xml();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd File</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser#getXsdFile()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_XsdFile();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getNewline <em>Newline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newline</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser#getNewline()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Newline();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.SpreadsheetValidator <em>Spreadsheet Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Validator</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetValidator
	 * @generated
	 */
	EClass getSpreadsheetValidator();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetValidator#getSeh <em>Seh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seh</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetValidator#getSeh()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_Seh();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetValidator#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error List</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetValidator#getErrorList()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_ErrorList();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.SpreadsheetValidator#getSehTmp <em>Seh Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seh Tmp</em>'.
	 * @see alma.control.datamodel.meta.base.SpreadsheetValidator#getSehTmp()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_SehTmp();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see alma.control.datamodel.meta.base.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getDepChar <em>Dep Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Char</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getDepChar()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_DepChar();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Celsius To Kelvin</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getCelsiusToKelvin()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_CelsiusToKelvin();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getSheetNames <em>Sheet Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Names</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getSheetNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_SheetNames();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getColNames <em>Col Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Names</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getColNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ColNames();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToCPP <em>To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CPP</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCPP();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToIDL <em>To IDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To IDL</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToIDL()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToIDL();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToIDLSeq <em>To IDL Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To IDL Seq</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToIDLSeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToIDLSeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToCORBA <em>To CORBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToCORBA()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBA();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToCORBASeq <em>To CORBA Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA Seq</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToCORBASeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBASeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA Dev IO</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToCORBADevIO()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBADevIO();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToBACI <em>To BACI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To BACI</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToBACI()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToBACI();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getToDatabase <em>To Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Database</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getToDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToDatabase();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getRawToCPP <em>Raw To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw To CPP</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getRawToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawToCPP();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw To Byte Swapped</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getRawToByteSwapped()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawToByteSwapped();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getRawBytes <em>Raw Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Bytes</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getRawBytes()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawBytes();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToCPP <em>World To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CPP</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCPP();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToIDL <em>World To IDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To IDL</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToIDL()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToIDL();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To IDL Seq</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToIDLSeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToIDLSeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToCORBA <em>World To CORBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToCORBA()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBA();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA Seq</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToCORBASeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBASeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA Dev IO</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToCORBADevIO()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBADevIO();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToBACI <em>World To BACI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To BACI</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToBACI()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToBACI();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToJava <em>World To Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To Java</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToJava()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToJava();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Table#getWorldToDatabase <em>World To Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To Database</em>'.
	 * @see alma.control.datamodel.meta.base.Table#getWorldToDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToDatabase();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.base.Util <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Util</em>'.
	 * @see alma.control.datamodel.meta.base.Util
	 * @generated
	 */
	EClass getUtil();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Util#getNewline <em>Newline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newline</em>'.
	 * @see alma.control.datamodel.meta.base.Util#getNewline()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_Newline();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Util#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see alma.control.datamodel.meta.base.Util#getMaxLength()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Util#getMONTH <em>MONTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MONTH</em>'.
	 * @see alma.control.datamodel.meta.base.Util#getMONTH()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MONTH();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.base.Util#getMONTHalt <em>MONT Halt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MONT Halt</em>'.
	 * @see alma.control.datamodel.meta.base.Util#getMONTHalt()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MONTHalt();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.base.Util#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see alma.control.datamodel.meta.base.Util#getTables()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_Tables();

	/**
	 * Returns the meta object for class '{@link org.xml.sax.ErrorHandler <em>Error Handler Aux Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Handler Aux Class</em>'.
	 * @see org.xml.sax.ErrorHandler
	 * @model instanceClass="org.xml.sax.ErrorHandler"
	 * @generated
	 */
	EClass getErrorHandlerAuxClass();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.ControlPoint <em>Control Point DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Control Point DT</em>'.
	 * @see alma.control.datamodel.meta.base.ControlPoint
	 * @model instanceClass="alma.control.datamodel.meta.base.ControlPoint"
	 * @generated
	 */
	EDataType getControlPointDT();

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
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.MonitorPoint <em>Monitor Point DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Monitor Point DT</em>'.
	 * @see alma.control.datamodel.meta.base.MonitorPoint
	 * @model instanceClass="alma.control.datamodel.meta.base.MonitorPoint"
	 * @generated
	 */
	EDataType getMonitorPointDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.ArchiveProperty <em>Archive Property DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Archive Property DT</em>'.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty
	 * @model instanceClass="alma.control.datamodel.meta.base.ArchiveProperty"
	 * @generated
	 */
	EDataType getArchivePropertyDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.SimpleErrorHandler <em>Simple Error Handler DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Error Handler DT</em>'.
	 * @see alma.control.datamodel.meta.base.SimpleErrorHandler
	 * @model instanceClass="alma.control.datamodel.meta.base.SimpleErrorHandler"
	 * @generated
	 */
	EDataType getSimpleErrorHandlerDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.MandCBase <em>Mand CBase DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CBase DT</em>'.
	 * @see alma.control.datamodel.meta.base.MandCBase
	 * @model instanceClass="alma.control.datamodel.meta.base.MandCBase"
	 * @generated
	 */
	EDataType getMandCBaseDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.MainBase <em>Main Base DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Main Base DT</em>'.
	 * @see alma.control.datamodel.meta.base.MainBase
	 * @model instanceClass="alma.control.datamodel.meta.base.MainBase" serializeable="false"
	 * @generated
	 */
	EDataType getMainBaseDT();

	/**
	 * Returns the meta object for data type '{@link java.lang.RuntimeException <em>Runtime Exception DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Runtime Exception DT</em>'.
	 * @see java.lang.RuntimeException
	 * @model instanceClass="java.lang.RuntimeException"
	 * @generated
	 */
	EDataType getRuntimeExceptionDT();

	/**
	 * Returns the meta object for data type '{@link org.xml.sax.ErrorHandler <em>Error Handler DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Error Handler DT</em>'.
	 * @see org.xml.sax.ErrorHandler
	 * @model instanceClass="org.xml.sax.ErrorHandler"
	 * @generated
	 */
	EDataType getErrorHandlerDT();

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
	 * Returns the meta object for data type '<em>EString Array3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString Array3</em>'.
	 * @model instanceClass="java.lang.String[][][]"
	 * @generated
	 */
	EDataType getEStringArray3();

	/**
	 * Returns the meta object for data type '<em>EString Array2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString Array2</em>'.
	 * @model instanceClass="java.lang.String[][]"
	 * @generated
	 */
	EDataType getEStringArray2();

	/**
	 * Returns the meta object for data type '<em>EString Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getEStringArray();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.eth.MandC <em>Mand CETHDT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CETHDT</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC
	 * @model instanceClass="alma.control.datamodel.meta.eth.MandC"
	 * @generated
	 */
	EDataType getMandCETHDT();

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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.ArchivePropertyImpl <em>Archive Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.ArchivePropertyImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getArchiveProperty()
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
		 * The meta object literal for the '<em><b>Mp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_PROPERTY__MP = eINSTANCE.getArchiveProperty_Mp();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_PROPERTY__CP = eINSTANCE.getArchiveProperty_Cp();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_PROPERTY__TABLES = eINSTANCE.getArchiveProperty_Tables();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.ControlPointImpl <em>Control Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.ControlPointImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getControlPoint()
		 * @generated
		 */
		EClass CONTROL_POINT = eINSTANCE.getControlPoint();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.DeviceModelImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getDeviceModel()
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
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__CONTAINER = eINSTANCE.getDeviceModel_Container();

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
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__MAIN = eINSTANCE.getDeviceModel_Main();

		/**
		 * The meta object literal for the '<em><b>AProperties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__APROPERTIES = eINSTANCE.getDeviceModel_AProperties();

		/**
		 * The meta object literal for the '<em><b>CPoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__CPOINTS = eINSTANCE.getDeviceModel_CPoints();

		/**
		 * The meta object literal for the '<em><b>MPoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__MPOINTS = eINSTANCE.getDeviceModel_MPoints();

		/**
		 * The meta object literal for the '<em><b>Utils</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__UTILS = eINSTANCE.getDeviceModel_Utils();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TABLES = eINSTANCE.getDeviceModel_Tables();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.MainBaseImpl <em>Main Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.MainBaseImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMainBase()
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
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__TABLES = eINSTANCE.getMainBase_Tables();

		/**
		 * The meta object literal for the '<em><b>Utils</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__UTILS = eINSTANCE.getMainBase_Utils();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__DEVICES = eINSTANCE.getMainBase_Devices();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl <em>Mand CBase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.MandCBaseImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMandCBase()
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
		 * The meta object literal for the '<em><b>Resource Set Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__RESOURCE_SET_DEPENDENT = eINSTANCE.getMandCBase_ResourceSetDependent();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__PARENT = eINSTANCE.getMandCBase_Parent();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__ARCHIVE = eINSTANCE.getMandCBase_Archive();

		/**
		 * The meta object literal for the '<em><b>Dependents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CBASE__DEPENDENTS = eINSTANCE.getMandCBase_Dependents();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__TABLES = eINSTANCE.getMandCBase_Tables();

		/**
		 * The meta object literal for the '<em><b>Utils</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__UTILS = eINSTANCE.getMandCBase_Utils();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.MonitorPointImpl <em>Monitor Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.MonitorPointImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMonitorPoint()
		 * @generated
		 */
		EClass MONITOR_POINT = eINSTANCE.getMonitorPoint();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.NoteImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getNote()
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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.PairImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getPair()
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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.SimpleErrorHandlerImpl <em>Simple Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.SimpleErrorHandlerImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandler()
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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl <em>Spreadsheet Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetParser()
		 * @generated
		 */
		EClass SPREADSHEET_PARSER = eINSTANCE.getSpreadsheetParser();

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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl <em>Spreadsheet Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetValidator()
		 * @generated
		 */
		EClass SPREADSHEET_VALIDATOR = eINSTANCE.getSpreadsheetValidator();

		/**
		 * The meta object literal for the '<em><b>Seh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_VALIDATOR__SEH = eINSTANCE.getSpreadsheetValidator_Seh();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_VALIDATOR__ERROR_LIST = eINSTANCE.getSpreadsheetValidator_ErrorList();

		/**
		 * The meta object literal for the '<em><b>Seh Tmp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_VALIDATOR__SEH_TMP = eINSTANCE.getSpreadsheetValidator_SehTmp();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.TableImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getTable()
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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.base.impl.UtilImpl <em>Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.UtilImpl
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getUtil()
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
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__TABLES = eINSTANCE.getUtil_Tables();

		/**
		 * The meta object literal for the '{@link org.xml.sax.ErrorHandler <em>Error Handler Aux Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml.sax.ErrorHandler
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getErrorHandlerAuxClass()
		 * @generated
		 */
		EClass ERROR_HANDLER_AUX_CLASS = eINSTANCE.getErrorHandlerAuxClass();

		/**
		 * The meta object literal for the '<em>Control Point DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.ControlPoint
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getControlPointDT()
		 * @generated
		 */
		EDataType CONTROL_POINT_DT = eINSTANCE.getControlPointDT();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getHashtable()
		 * @generated
		 */
		EDataType HASHTABLE = eINSTANCE.getHashtable();

		/**
		 * The meta object literal for the '<em>Monitor Point DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.MonitorPoint
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMonitorPointDT()
		 * @generated
		 */
		EDataType MONITOR_POINT_DT = eINSTANCE.getMonitorPointDT();

		/**
		 * The meta object literal for the '<em>Archive Property DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.ArchiveProperty
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getArchivePropertyDT()
		 * @generated
		 */
		EDataType ARCHIVE_PROPERTY_DT = eINSTANCE.getArchivePropertyDT();

		/**
		 * The meta object literal for the '<em>Simple Error Handler DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.SimpleErrorHandler
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandlerDT()
		 * @generated
		 */
		EDataType SIMPLE_ERROR_HANDLER_DT = eINSTANCE.getSimpleErrorHandlerDT();

		/**
		 * The meta object literal for the '<em>Mand CBase DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.MandCBase
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMandCBaseDT()
		 * @generated
		 */
		EDataType MAND_CBASE_DT = eINSTANCE.getMandCBaseDT();

		/**
		 * The meta object literal for the '<em>Main Base DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.MainBase
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMainBaseDT()
		 * @generated
		 */
		EDataType MAIN_BASE_DT = eINSTANCE.getMainBaseDT();

		/**
		 * The meta object literal for the '<em>Runtime Exception DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.RuntimeException
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getRuntimeExceptionDT()
		 * @generated
		 */
		EDataType RUNTIME_EXCEPTION_DT = eINSTANCE.getRuntimeExceptionDT();

		/**
		 * The meta object literal for the '<em>Error Handler DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml.sax.ErrorHandler
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getErrorHandlerDT()
		 * @generated
		 */
		EDataType ERROR_HANDLER_DT = eINSTANCE.getErrorHandlerDT();

		/**
		 * The meta object literal for the '<em>SAX Parse Exception DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml.sax.SAXParseException
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getSAXParseExceptionDT()
		 * @generated
		 */
		EDataType SAX_PARSE_EXCEPTION_DT = eINSTANCE.getSAXParseExceptionDT();

		/**
		 * The meta object literal for the '<em>EString Array3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray3()
		 * @generated
		 */
		EDataType ESTRING_ARRAY3 = eINSTANCE.getEStringArray3();

		/**
		 * The meta object literal for the '<em>EString Array2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray2()
		 * @generated
		 */
		EDataType ESTRING_ARRAY2 = eINSTANCE.getEStringArray2();

		/**
		 * The meta object literal for the '<em>EString Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray()
		 * @generated
		 */
		EDataType ESTRING_ARRAY = eINSTANCE.getEStringArray();

		/**
		 * The meta object literal for the '<em>Mand CETHDT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.MandC
		 * @see alma.control.datamodel.meta.base.impl.BasePackageImpl#getMandCETHDT()
		 * @generated
		 */
		EDataType MAND_CETHDT = eINSTANCE.getMandCETHDT();

	}

} //BasePackage
