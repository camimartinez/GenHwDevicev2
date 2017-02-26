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
package alma.control.datamodel.meta.eth;

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
 * @see alma.control.datamodel.meta.eth.EthFactory
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
	String eNS_URI = "http://alma/Control/datamodel/meta/eth/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alma.Control.datamodel.meta.eth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EthPackage eINSTANCE = alma.control.datamodel.meta.eth.impl.EthPackageImpl.init();

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.eth.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.impl.ArchiveImpl
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getArchive()
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
	 * The feature id for the '<em><b>To Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__TO_COLUMNS_INFO_OF_ARCHI = BasePackage.ARCHIVE_PROPERTY__TO_COLUMNS_INFO_OF_ARCHI;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.eth.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.impl.ControlImpl
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getControl()
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
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SET_INF_FROM_SPREAD = BasePackage.CONTROL_POINT__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>To Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TO_COMMON_INF = BasePackage.CONTROL_POINT__TO_COMMON_INF;

	/**
	 * The feature id for the '<em><b>To MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TO_MPOR_CP = BasePackage.CONTROL_POINT__TO_MPOR_CP;

	/**
	 * The feature id for the '<em><b>To Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TO_SHEET_MP = BasePackage.CONTROL_POINT__TO_SHEET_MP;

	/**
	 * The feature id for the '<em><b>To Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TO_ARCH_ON_USE_CONTROL = BasePackage.CONTROL_POINT__TO_ARCH_ON_USE_CONTROL;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__AUX = BasePackage.CONTROL_POINT__AUX;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MAC = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aux2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__AUX2 = BasePackage.CONTROL_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Info Control Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TO_INFO_CONTROL_ETH = BasePackage.CONTROL_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.impl.DeviceModelImpl
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getDeviceModel()
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
	 * The feature id for the '<em><b>To Archive Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_ARCHIVE_INDEX = BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX;

	/**
	 * The feature id for the '<em><b>To Cont Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_CONT_POINTS = BasePackage.DEVICE_MODEL__TO_CONT_POINTS;

	/**
	 * The feature id for the '<em><b>To Moni Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_MONI_POINTS = BasePackage.DEVICE_MODEL__TO_MONI_POINTS;

	/**
	 * The feature id for the '<em><b>To End Of Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_END_OF_GENERATION = BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION;

	/**
	 * The feature id for the '<em><b>To Archiv Prop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_ARCHIV_PROP = BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP;

	/**
	 * The feature id for the '<em><b>To Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_INF_FROM_SPREAD = BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Info Dev Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__INFO_DEV_MAIN = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__INFO_CONTROL = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Info Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__INFO_MONITOR = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To End Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_END_ETH = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Info Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__INFO_ARCH = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__DATA_SPREADSHEET = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>To Notes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_NOTES = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To Validate Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>To Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_SPREAD_ETH = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.eth.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.impl.MainImpl
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 3;

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
	 * The feature id for the '<em><b>To Implement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TO_IMPLEMENT = BasePackage.MAIN_BASE__TO_IMPLEMENT;

	/**
	 * The feature id for the '<em><b>To Convert Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TO_CONVERT_INFO = BasePackage.MAIN_BASE__TO_CONVERT_INFO;

	/**
	 * The feature id for the '<em><b>To Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TO_INFO_FROM_SPREAD = BasePackage.MAIN_BASE__TO_INFO_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__AUX = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TO_INFO_MAIN = BasePackage.MAIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.eth.impl.MandCImpl <em>Mand C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.impl.MandCImpl
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMandC()
	 * @generated
	 */
	int MAND_C = 4;

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
	 * The feature id for the '<em><b>Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__ASSEMBLY = 2;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__AUX = 3;

	/**
	 * The feature id for the '<em><b>To Info From Col</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C__TO_INFO_FROM_COL = 4;

	/**
	 * The number of structural features of the '<em>Mand C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_C_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link alma.control.datamodel.meta.eth.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.impl.MonitorImpl
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 5;

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
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SET_INF_FROM_SPREAD = BasePackage.MONITOR_POINT__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>To Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TO_COMMON_INF = BasePackage.MONITOR_POINT__TO_COMMON_INF;

	/**
	 * The feature id for the '<em><b>To MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TO_MPOR_CP = BasePackage.MONITOR_POINT__TO_MPOR_CP;

	/**
	 * The feature id for the '<em><b>To Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TO_SHEET_MP = BasePackage.MONITOR_POINT__TO_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__AUX = BasePackage.MONITOR_POINT__AUX;

	/**
	 * The feature id for the '<em><b>To Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TO_INFO_FROM_AP_SPREAD = BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD;

	/**
	 * The feature id for the '<em><b>To Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TO_INFO_FROM_MP_SPREAD = BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__MAC = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aux1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__AUX1 = BasePackage.MONITOR_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Info MP Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TO_INFO_MP_ETH = BasePackage.MONITOR_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>Mand CETHDT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.control.datamodel.meta.eth.MandC
	 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMandCETHDT()
	 * @generated
	 */
	int MAND_CETHDT = 6;


	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.eth.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see alma.control.datamodel.meta.eth.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.eth.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see alma.control.datamodel.meta.eth.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.Control#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see alma.control.datamodel.meta.eth.Control#getMac()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Mac();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.Control#getAux2 <em>Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux2</em>'.
	 * @see alma.control.datamodel.meta.eth.Control#getAux2()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Aux2();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.Control#getToInfoControlEth <em>To Info Control Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info Control Eth</em>'.
	 * @see alma.control.datamodel.meta.eth.Control#getToInfoControlEth()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_ToInfoControlEth();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.eth.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Dev Main</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getInfoDevMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoDevMain();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getInfoControl <em>Info Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Control</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getInfoControl()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoControl();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getInfoMonitor <em>Info Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Monitor</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getInfoMonitor()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoMonitor();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getToEndEth <em>To End Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To End Eth</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getToEndEth()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToEndEth();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getInfoArch <em>Info Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Arch</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getInfoArch()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoArch();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getDataSpreadsheet <em>Data Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Spreadsheet</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getDataSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_DataSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getToNotes <em>To Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Notes</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getToNotes()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToNotes();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getToValidateSpreadEth <em>To Validate Spread Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Validate Spread Eth</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getToValidateSpreadEth()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToValidateSpreadEth();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.DeviceModel#getToSpreadEth <em>To Spread Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Spread Eth</em>'.
	 * @see alma.control.datamodel.meta.eth.DeviceModel#getToSpreadEth()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToSpreadEth();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.eth.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see alma.control.datamodel.meta.eth.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.Main#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see alma.control.datamodel.meta.eth.Main#getAux()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_Aux();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.Main#getToInfoMain <em>To Info Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info Main</em>'.
	 * @see alma.control.datamodel.meta.eth.Main#getToInfoMain()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_ToInfoMain();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.eth.MandC <em>Mand C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand C</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC
	 * @generated
	 */
	EClass getMandC();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.MandC#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC#getRow()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.MandC#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC#getSheet()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.MandC#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC#getAssembly()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Assembly();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.MandC#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC#getAux()
	 * @see #getMandC()
	 * @generated
	 */
	EAttribute getMandC_Aux();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.MandC#getToInfoFromCol <em>To Info From Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info From Col</em>'.
	 * @see alma.control.datamodel.meta.eth.MandC#getToInfoFromCol()
	 * @see #getMandC()
	 * @generated
	 */
	EReference getMandC_ToInfoFromCol();

	/**
	 * Returns the meta object for class '{@link alma.control.datamodel.meta.eth.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see alma.control.datamodel.meta.eth.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.Monitor#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see alma.control.datamodel.meta.eth.Monitor#getMac()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Mac();

	/**
	 * Returns the meta object for the attribute '{@link alma.control.datamodel.meta.eth.Monitor#getAux1 <em>Aux1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux1</em>'.
	 * @see alma.control.datamodel.meta.eth.Monitor#getAux1()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Aux1();

	/**
	 * Returns the meta object for the reference '{@link alma.control.datamodel.meta.eth.Monitor#getToInfoMPEth <em>To Info MP Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info MP Eth</em>'.
	 * @see alma.control.datamodel.meta.eth.Monitor#getToInfoMPEth()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_ToInfoMPEth();

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
		 * The meta object literal for the '{@link alma.control.datamodel.meta.eth.impl.ArchiveImpl <em>Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.impl.ArchiveImpl
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.eth.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.impl.ControlImpl
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getControl()
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
		 * The meta object literal for the '<em><b>Aux2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__AUX2 = eINSTANCE.getControl_Aux2();

		/**
		 * The meta object literal for the '<em><b>To Info Control Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__TO_INFO_CONTROL_ETH = eINSTANCE.getControl_ToInfoControlEth();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.impl.DeviceModelImpl
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getDeviceModel()
		 * @generated
		 */
		EClass DEVICE_MODEL = eINSTANCE.getDeviceModel();

		/**
		 * The meta object literal for the '<em><b>Info Dev Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__INFO_DEV_MAIN = eINSTANCE.getDeviceModel_InfoDevMain();

		/**
		 * The meta object literal for the '<em><b>Info Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__INFO_CONTROL = eINSTANCE.getDeviceModel_InfoControl();

		/**
		 * The meta object literal for the '<em><b>Info Monitor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__INFO_MONITOR = eINSTANCE.getDeviceModel_InfoMonitor();

		/**
		 * The meta object literal for the '<em><b>To End Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_END_ETH = eINSTANCE.getDeviceModel_ToEndEth();

		/**
		 * The meta object literal for the '<em><b>Info Arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__INFO_ARCH = eINSTANCE.getDeviceModel_InfoArch();

		/**
		 * The meta object literal for the '<em><b>Data Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__DATA_SPREADSHEET = eINSTANCE.getDeviceModel_DataSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>To Notes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_NOTES = eINSTANCE.getDeviceModel_ToNotes();

		/**
		 * The meta object literal for the '<em><b>To Validate Spread Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH = eINSTANCE.getDeviceModel_ToValidateSpreadEth();

		/**
		 * The meta object literal for the '<em><b>To Spread Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_SPREAD_ETH = eINSTANCE.getDeviceModel_ToSpreadEth();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.eth.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.impl.MainImpl
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN__AUX = eINSTANCE.getMain_Aux();

		/**
		 * The meta object literal for the '<em><b>To Info Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__TO_INFO_MAIN = eINSTANCE.getMain_ToInfoMain();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.eth.impl.MandCImpl <em>Mand C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.impl.MandCImpl
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMandC()
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
		 * The meta object literal for the '<em><b>Assembly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__ASSEMBLY = eINSTANCE.getMandC_Assembly();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_C__AUX = eINSTANCE.getMandC_Aux();

		/**
		 * The meta object literal for the '<em><b>To Info From Col</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_C__TO_INFO_FROM_COL = eINSTANCE.getMandC_ToInfoFromCol();

		/**
		 * The meta object literal for the '{@link alma.control.datamodel.meta.eth.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.impl.MonitorImpl
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMonitor()
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
		 * The meta object literal for the '<em><b>Aux1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__AUX1 = eINSTANCE.getMonitor_Aux1();

		/**
		 * The meta object literal for the '<em><b>To Info MP Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__TO_INFO_MP_ETH = eINSTANCE.getMonitor_ToInfoMPEth();

		/**
		 * The meta object literal for the '<em>Mand CETHDT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.control.datamodel.meta.eth.MandC
		 * @see alma.control.datamodel.meta.eth.impl.EthPackageImpl#getMandCETHDT()
		 * @generated
		 */
		EDataType MAND_CETHDT = eINSTANCE.getMandCETHDT();

	}

} //EthPackage
