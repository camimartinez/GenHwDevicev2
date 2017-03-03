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
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.ControlImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 1;

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
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.MainImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 3;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.MandCImpl <em>Mand C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.MandCImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMandC()
	 * @generated
	 */
	int MAND_C = 4;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.MonitorImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 5;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl <em>SW Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.SWModuleImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getSWModule()
	 * @generated
	 */
	int SW_MODULE = 6;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl <em>Generic Monitor Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getGenericMonitorPoints()
	 * @generated
	 */
	int GENERIC_MONITOR_POINTS = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource Aux Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getResourceAuxClass()
	 * @generated
	 */
	int RESOURCE_AUX_CLASS = 8;

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
	 * The feature id for the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__MP = BasePackage.ARCHIVE_PROPERTY__MP;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__CP = BasePackage.ARCHIVE_PROPERTY__CP;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__TABLE = BasePackage.ARCHIVE_PROPERTY__TABLE;

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
	 * The number of structural features of the '<em>Resource Aux Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AUX_CLASS_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SPREADSHEET_NAME = BasePackage.CONTROL_POINT__SPREADSHEET_NAME;

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
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARENT_ROW = BasePackage.CONTROL_POINT__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SHEET = BasePackage.CONTROL_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARENT = BasePackage.CONTROL_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ARCHIVE = BasePackage.CONTROL_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DEPENDENTS = BasePackage.CONTROL_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TABLE = BasePackage.CONTROL_POINT__TABLE;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TABLES = BasePackage.CONTROL_POINT__TABLES;

	/**
	 * The feature id for the '<em><b>Archives Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ARCHIVES_PROPERTIES = BasePackage.CONTROL_POINT__ARCHIVES_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Util</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__UTIL = BasePackage.CONTROL_POINT__UTIL;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MAC = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aux Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__AUX_RESOURCE = BasePackage.CONTROL_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mand Cb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MAND_CB = BasePackage.CONTROL_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Archives Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__ARCHIVES_PROPERTIES = BasePackage.DEVICE_MODEL__ARCHIVES_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Obtain Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__OBTAIN_MAIN = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obtain Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__OBTAIN_MONITOR_POINTS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obtain Archive Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Obtain Control Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__OBTAIN_CONTROL_POINTS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parser Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__PARSER_SPREADSHEET = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validate Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__VALIDATE_SPREADSHEET = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GENERIC_MONITOR_POINTS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Notess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__NOTESS = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Util DT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__UTIL_DT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Table DT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TABLE_DT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 10;

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
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TABLE = BasePackage.MAIN_BASE__TABLE;

	/**
	 * The feature id for the '<em><b>Util</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__UTIL = BasePackage.MAIN_BASE__UTIL;

	/**
	 * The feature id for the '<em><b>Utilss</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__UTILSS = BasePackage.MAIN_BASE__UTILSS;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TABLES = BasePackage.MAIN_BASE__TABLES;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Util</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__UTIL = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__ROW = 2;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__SHEET = 3;

	/**
	 * The feature id for the '<em><b>Mcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__MCP = 4;

	/**
	 * The feature id for the '<em><b>Amask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__AMASK = 5;

	/**
	 * The feature id for the '<em><b>Mand Cb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__MAND_CB = 6;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__TABLES = 7;

	/**
	 * The feature id for the '<em><b>Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__MONITOR_POINTS = 8;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__CONTROL_POINTS = 9;

	/**
	 * The feature id for the '<em><b>Utilss</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__UTILSS = 10;

	/**
	 * The number of structural features of the '<em>Mand C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C_FEATURE_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SPREADSHEET_NAME = BasePackage.MONITOR_POINT__SPREADSHEET_NAME;

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
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__PARENT_ROW = BasePackage.MONITOR_POINT__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SHEET = BasePackage.MONITOR_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__PARENT = BasePackage.MONITOR_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__ARCHIVE = BasePackage.MONITOR_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__DEPENDENTS = BasePackage.MONITOR_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TABLE = BasePackage.MONITOR_POINT__TABLE;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TABLES = BasePackage.MONITOR_POINT__TABLES;

	/**
	 * The feature id for the '<em><b>Archives Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__ARCHIVES_PROPERTIES = BasePackage.MONITOR_POINT__ARCHIVES_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Util</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__UTIL = BasePackage.MONITOR_POINT__UTIL;

	/**
	 * The feature id for the '<em><b>Archive Proper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__ARCHIVE_PROPER = BasePackage.MONITOR_POINT__ARCHIVE_PROPER;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__MAC = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aux Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__AUX_ITERATOR = BasePackage.MONITOR_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aux Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__AUX_RESOURCE = BasePackage.MONITOR_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__TABLE = 12;

	/**
	 * The feature id for the '<em><b>Util</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__UTIL = 13;

	/**
	 * The feature id for the '<em><b>Add Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ADD_MONITOR_POINTS = 14;

	/**
	 * The feature id for the '<em><b>Add Control Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ADD_CONTROL_POINTS = 15;

	/**
	 * The number of structural features of the '<em>SW Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE_FEATURE_COUNT = 16;

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
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__BASE = 3;

	/**
	 * The feature id for the '<em><b>Parser Spreadsheet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET = 4;

	/**
	 * The feature id for the '<em><b>Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__UTIL = 5;

	/**
	 * The feature id for the '<em><b>Validate Spreadsheet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET = 6;

	/**
	 * The number of structural features of the '<em>Generic Monitor Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '<em>Mand CAMBDT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.amb.MandC
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMandCAMBDT()
	 * @generated
	 */
	int MAND_CAMBDT = 9;

	/**
	 * The meta object id for the '<em>Base Factory Imp DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.impl.BaseFactoryImpl
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getBaseFactoryImpDT()
	 * @generated
	 */
	int BASE_FACTORY_IMP_DT = 10;

	/**
	 * The meta object id for the '<em>Base Factory DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.BaseFactory
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getBaseFactoryDT()
	 * @generated
	 */
	int BASE_FACTORY_DT = 11;

	/**
	 * The meta object id for the '<em>Table DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.Table
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getTableDT()
	 * @generated
	 */
	int TABLE_DT = 12;

	/**
	 * The meta object id for the '<em>Util DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.base.Util
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getUtilDT()
	 * @generated
	 */
	int UTIL_DT = 13;

	/**
	 * The meta object id for the '<em>Iterator DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getIteratorDT()
	 * @generated
	 */
	int ITERATOR_DT = 14;

	/**
	 * The meta object id for the '<em>Resource DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getResourceDT()
	 * @generated
	 */
	int RESOURCE_DT = 15;


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
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.Control#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see alma.control.datamodel.meta.amb.Control#getMac()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Mac();

	/**
	 * Returns the meta object for the containment reference '{@link alma.control.datamodel.meta.amb.Control#getMandCb <em>Mand Cb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mand Cb</em>'.
	 * @see alma.control.datamodel.meta.amb.Control#getMandCb()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_MandCb();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.Control#getAuxResource <em>Aux Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Resource</em>'.
	 * @see alma.control.datamodel.meta.amb.Control#getAuxResource()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_AuxResource();

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
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainMain <em>Obtain Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obtain Main</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getObtainMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ObtainMain();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainMonitorPoints <em>Obtain Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obtain Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getObtainMonitorPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ObtainMonitorPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainArchiveProperties <em>Obtain Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obtain Archive Properties</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getObtainArchiveProperties()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ObtainArchiveProperties();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainControlPoints <em>Obtain Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obtain Control Points</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getObtainControlPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ObtainControlPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getParserSpreadsheet <em>Parser Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parser Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getParserSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ParserSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getValidateSpreadsheet <em>Validate Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validate Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getValidateSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ValidateSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getGenericMonitorPoints <em>Generic Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getGenericMonitorPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GenericMonitorPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.DeviceModel#getNotess <em>Notess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notess</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getNotess()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_Notess();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.DeviceModel#getUtilDT <em>Util DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Util DT</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getUtilDT()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_UtilDT();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.DeviceModel#getTableDT <em>Table DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table DT</em>'.
	 * @see alma.control.datamodel.meta.amb.DeviceModel#getTableDT()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_TableDT();

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
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getTable()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Table();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getUtil <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Util</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getUtil()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Util();

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
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getMcp <em>Mcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcp</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getMcp()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Mcp();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.MandC#getAmask <em>Amask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amask</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getAmask()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Amask();

	/**
	 * Returns the meta object for the containment reference '{@link alma.control.datamodel.meta.amb.MandC#getMandCb <em>Mand Cb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mand Cb</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getMandCb()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_MandCb();

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
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.MandC#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getMonitorPoints()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_MonitorPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.MandC#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Points</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getControlPoints()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_ControlPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.MandC#getUtilss <em>Utilss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utilss</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC#getUtilss()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_Utilss();

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
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.Monitor#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see alma.control.datamodel.meta.amb.Monitor#getMac()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Mac();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.Monitor#getAuxIterator <em>Aux Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Iterator</em>'.
	 * @see alma.control.datamodel.meta.amb.Monitor#getAuxIterator()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_AuxIterator();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.Monitor#getAuxResource <em>Aux Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Resource</em>'.
	 * @see alma.control.datamodel.meta.amb.Monitor#getAuxResource()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_AuxResource();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.amb.SWModule <em>SW Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Module</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule
	 * @generated
	 */
	EClass getSWModule();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getAssemblyName <em>Assembly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly Name</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getAssemblyName()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_AssemblyName();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getDirPath <em>Dir Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Path</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getDirPath()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_DirPath();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getMainAssembly <em>Main Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Assembly</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getMainAssembly()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_MainAssembly();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#isOneSwModule <em>One Sw Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Sw Module</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#isOneSwModule()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_OneSwModule();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getRow()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getParentRow <em>Parent Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Row</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getParentRow()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ParentRow();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getSheet()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_MonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Points</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Properties</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getArchiveProperties()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ArchiveProperties();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getSimMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_SimMonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Control Points</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getSimControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_SimControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getTable()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Table();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.SWModule#getUtil <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Util</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getUtil()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Util();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.SWModule#getAddMonitorPoints <em>Add Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Monitor Points</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getAddMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_AddMonitorPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.SWModule#getAddControlPoints <em>Add Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Control Points</em>'.
	 * @see alma.control.datamodel.meta.amb.SWModule#getAddControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_AddControlPoints();

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
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getBase()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_Base();

	/**
	 * Returns the meta object for the containment reference '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getParserSpreadsheet <em>Parser Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parser Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getParserSpreadsheet()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EReference getGenericMonitorPoints_ParserSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getUtil <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Util</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getUtil()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EReference getGenericMonitorPoints_Util();

	/**
	 * Returns the meta object for the containment reference '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getValidateSpreadsheet <em>Validate Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.amb.GenericMonitorPoints#getValidateSpreadsheet()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EReference getGenericMonitorPoints_ValidateSpreadsheet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource Aux Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Aux Class</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EClass getResourceAuxClass();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.amb.MandC <em>Mand CAMBDT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CAMBDT</em>'.
	 * @see alma.control.datamodel.meta.amb.MandC
	 * @model instanceClass="alma.control.datamodel.meta.amb.MandC"
	 * @generated
	 */
	EDataType getMandCAMBDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.impl.BaseFactoryImpl <em>Base Factory Imp DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base Factory Imp DT</em>'.
	 * @see alma.control.datamodel.meta.base.impl.BaseFactoryImpl
	 * @model instanceClass="alma.control.datamodel.meta.base.impl.BaseFactoryImpl"
	 * @generated
	 */
	EDataType getBaseFactoryImpDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.BaseFactory <em>Base Factory DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base Factory DT</em>'.
	 * @see alma.control.datamodel.meta.base.BaseFactory
	 * @model instanceClass="alma.control.datamodel.meta.base.BaseFactory"
	 * @generated
	 */
	EDataType getBaseFactoryDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.Table <em>Table DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table DT</em>'.
	 * @see alma.control.datamodel.meta.base.Table
	 * @model instanceClass="alma.control.datamodel.meta.base.Table"
	 * @generated
	 */
	EDataType getTableDT();

	/**
	 * Returns the meta object for data type '{@link alma.control.datamodel.meta.base.Util <em>Util DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Util DT</em>'.
	 * @see alma.control.datamodel.meta.base.Util
	 * @model instanceClass="alma.control.datamodel.meta.base.Util"
	 * @generated
	 */
	EDataType getUtilDT();

	/**
	 * Returns the meta object for data type '{@link java.util.Iterator <em>Iterator DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Iterator DT</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator"
	 * @generated
	 */
	EDataType getIteratorDT();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource DT</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EDataType getResourceDT();

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
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__MAC = eINSTANCE.getControl_Mac();

		/**
		 * The meta object literal for the '<em><b>Mand Cb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MAND_CB = eINSTANCE.getControl_MandCb();

		/**
		 * The meta object literal for the '<em><b>Aux Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__AUX_RESOURCE = eINSTANCE.getControl_AuxResource();

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
		 * The meta object literal for the '<em><b>Obtain Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__OBTAIN_MAIN = eINSTANCE.getDeviceModel_ObtainMain();

		/**
		 * The meta object literal for the '<em><b>Obtain Monitor Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__OBTAIN_MONITOR_POINTS = eINSTANCE.getDeviceModel_ObtainMonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Obtain Archive Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES = eINSTANCE.getDeviceModel_ObtainArchiveProperties();

		/**
		 * The meta object literal for the '<em><b>Obtain Control Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__OBTAIN_CONTROL_POINTS = eINSTANCE.getDeviceModel_ObtainControlPoints();

		/**
		 * The meta object literal for the '<em><b>Parser Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__PARSER_SPREADSHEET = eINSTANCE.getDeviceModel_ParserSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Validate Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__VALIDATE_SPREADSHEET = eINSTANCE.getDeviceModel_ValidateSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Generic Monitor Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GENERIC_MONITOR_POINTS = eINSTANCE.getDeviceModel_GenericMonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Notess</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__NOTESS = eINSTANCE.getDeviceModel_Notess();

		/**
		 * The meta object literal for the '<em><b>Util DT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__UTIL_DT = eINSTANCE.getDeviceModel_UtilDT();

		/**
		 * The meta object literal for the '<em><b>Table DT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__TABLE_DT = eINSTANCE.getDeviceModel_TableDT();

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
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__TABLE = eINSTANCE.getMandC_Table();

		/**
		 * The meta object literal for the '<em><b>Util</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__UTIL = eINSTANCE.getMandC_Util();

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
		 * The meta object literal for the '<em><b>Mcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__MCP = eINSTANCE.getMandC_Mcp();

		/**
		 * The meta object literal for the '<em><b>Amask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__AMASK = eINSTANCE.getMandC_Amask();

		/**
		 * The meta object literal for the '<em><b>Mand Cb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__MAND_CB = eINSTANCE.getMandC_MandCb();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__TABLES = eINSTANCE.getMandC_Tables();

		/**
		 * The meta object literal for the '<em><b>Monitor Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__MONITOR_POINTS = eINSTANCE.getMandC_MonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Control Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__CONTROL_POINTS = eINSTANCE.getMandC_ControlPoints();

		/**
		 * The meta object literal for the '<em><b>Utilss</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__UTILSS = eINSTANCE.getMandC_Utilss();

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
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__MAC = eINSTANCE.getMonitor_Mac();

		/**
		 * The meta object literal for the '<em><b>Aux Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__AUX_ITERATOR = eINSTANCE.getMonitor_AuxIterator();

		/**
		 * The meta object literal for the '<em><b>Aux Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__AUX_RESOURCE = eINSTANCE.getMonitor_AuxResource();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl <em>SW Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.impl.SWModuleImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getSWModule()
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
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__TABLE = eINSTANCE.getSWModule_Table();

		/**
		 * The meta object literal for the '<em><b>Util</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__UTIL = eINSTANCE.getSWModule_Util();

		/**
		 * The meta object literal for the '<em><b>Add Monitor Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__ADD_MONITOR_POINTS = eINSTANCE.getSWModule_AddMonitorPoints();

		/**
		 * The meta object literal for the '<em><b>Add Control Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__ADD_CONTROL_POINTS = eINSTANCE.getSWModule_AddControlPoints();

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
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MONITOR_POINTS__BASE = eINSTANCE.getGenericMonitorPoints_Base();

		/**
		 * The meta object literal for the '<em><b>Parser Spreadsheet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET = eINSTANCE.getGenericMonitorPoints_ParserSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Util</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MONITOR_POINTS__UTIL = eINSTANCE.getGenericMonitorPoints_Util();

		/**
		 * The meta object literal for the '<em><b>Validate Spreadsheet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET = eINSTANCE.getGenericMonitorPoints_ValidateSpreadsheet();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource Aux Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getResourceAuxClass()
		 * @generated
		 */
		EClass RESOURCE_AUX_CLASS = eINSTANCE.getResourceAuxClass();

		/**
		 * The meta object literal for the '<em>Mand CAMBDT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.amb.MandC
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getMandCAMBDT()
		 * @generated
		 */
		EDataType MAND_CAMBDT = eINSTANCE.getMandCAMBDT();

		/**
		 * The meta object literal for the '<em>Base Factory Imp DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.impl.BaseFactoryImpl
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getBaseFactoryImpDT()
		 * @generated
		 */
		EDataType BASE_FACTORY_IMP_DT = eINSTANCE.getBaseFactoryImpDT();

		/**
		 * The meta object literal for the '<em>Base Factory DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.BaseFactory
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getBaseFactoryDT()
		 * @generated
		 */
		EDataType BASE_FACTORY_DT = eINSTANCE.getBaseFactoryDT();

		/**
		 * The meta object literal for the '<em>Table DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.Table
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getTableDT()
		 * @generated
		 */
		EDataType TABLE_DT = eINSTANCE.getTableDT();

		/**
		 * The meta object literal for the '<em>Util DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.base.Util
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getUtilDT()
		 * @generated
		 */
		EDataType UTIL_DT = eINSTANCE.getUtilDT();

		/**
		 * The meta object literal for the '<em>Iterator DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getIteratorDT()
		 * @generated
		 */
		EDataType ITERATOR_DT = eINSTANCE.getIteratorDT();

		/**
		 * The meta object literal for the '<em>Resource DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see alma.control.datamodel.meta.amb.impl.AmbPackageImpl#getResourceDT()
		 * @generated
		 */
		EDataType RESOURCE_DT = eINSTANCE.getResourceDT();

	}

} //AmbPackage
