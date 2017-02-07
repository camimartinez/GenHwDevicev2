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
 */
package datamodel.eth;

import datamodel.base.BasePackage;

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
	String eNS_PREFIX = "alma.Control.datamodel.meta.eth";

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
	 * The feature id for the '<em><b>Get Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_ETH__GET_COLUMNS_INFO_OF_ARCHI = BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI;

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
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__MAC = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info Control Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH__INFO_CONTROL_ETH = BasePackage.CONTROL_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ETH_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Notes To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__NOTES_TO = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Validate Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__VALIDATE_SPREAD_ETH = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__FROM_SPREAD_ETH = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>Implement To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__IMPLEMENT_TO = BasePackage.MAIN_BASE__IMPLEMENT_TO;

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
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__AUX = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH__TO_INFO_MAIN = BasePackage.MAIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Main ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ETH_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH__ROW = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH__ASSEMBLY = 2;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH__AUX = 3;

	/**
	 * The feature id for the '<em><b>Get Info From Col</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH__GET_INFO_FROM_COL = 4;

	/**
	 * The number of structural features of the '<em>Mand CETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CETH_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__MAC = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get Info MP Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH__GET_INFO_MP_ETH = BasePackage.MONITOR_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monitor ETH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_ETH_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Mand CETHDT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.eth.MandCETH
	 * @see datamodel.eth.impl.EthPackageImpl#getMandCETHDT()
	 * @generated
	 */
	int MAND_CETHDT = 6;


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
	 * Returns the meta object for the attribute '{@link datamodel.eth.ControlETH#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see datamodel.eth.ControlETH#getMac()
	 * @see #getControlETH()
	 * @generated
	 */
	EAttribute getControlETH_Mac();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.ControlETH#getInfoControlEth <em>Info Control Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Control Eth</em>'.
	 * @see datamodel.eth.ControlETH#getInfoControlEth()
	 * @see #getControlETH()
	 * @generated
	 */
	EReference getControlETH_InfoControlEth();

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
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Dev Main</em>'.
	 * @see datamodel.eth.DeviceModel#getInfoDevMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoDevMain();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getInfoControl <em>Info Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Control</em>'.
	 * @see datamodel.eth.DeviceModel#getInfoControl()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoControl();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getInfoMonitor <em>Info Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Monitor</em>'.
	 * @see datamodel.eth.DeviceModel#getInfoMonitor()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoMonitor();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getToEndEth <em>To End Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To End Eth</em>'.
	 * @see datamodel.eth.DeviceModel#getToEndEth()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToEndEth();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getInfoArch <em>Info Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Arch</em>'.
	 * @see datamodel.eth.DeviceModel#getInfoArch()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_InfoArch();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getDataSpreadsheet <em>Data Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Spreadsheet</em>'.
	 * @see datamodel.eth.DeviceModel#getDataSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_DataSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getNotesTo <em>Notes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notes To</em>'.
	 * @see datamodel.eth.DeviceModel#getNotesTo()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_NotesTo();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getValidateSpreadEth <em>Validate Spread Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validate Spread Eth</em>'.
	 * @see datamodel.eth.DeviceModel#getValidateSpreadEth()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ValidateSpreadEth();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.DeviceModel#getFromSpreadEth <em>From Spread Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Spread Eth</em>'.
	 * @see datamodel.eth.DeviceModel#getFromSpreadEth()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_FromSpreadEth();

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
	 * Returns the meta object for the attribute '{@link datamodel.eth.MainETH#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see datamodel.eth.MainETH#getAux()
	 * @see #getMainETH()
	 * @generated
	 */
	EAttribute getMainETH_Aux();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.MainETH#getToInfoMain <em>To Info Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info Main</em>'.
	 * @see datamodel.eth.MainETH#getToInfoMain()
	 * @see #getMainETH()
	 * @generated
	 */
	EReference getMainETH_ToInfoMain();

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
	 * Returns the meta object for the attribute '{@link datamodel.eth.MandCETH#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see datamodel.eth.MandCETH#getRow()
	 * @see #getMandCETH()
	 * @generated
	 */
	EAttribute getMandCETH_Row();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.eth.MandCETH#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see datamodel.eth.MandCETH#getSheet()
	 * @see #getMandCETH()
	 * @generated
	 */
	EAttribute getMandCETH_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.eth.MandCETH#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly</em>'.
	 * @see datamodel.eth.MandCETH#getAssembly()
	 * @see #getMandCETH()
	 * @generated
	 */
	EAttribute getMandCETH_Assembly();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.eth.MandCETH#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see datamodel.eth.MandCETH#getAux()
	 * @see #getMandCETH()
	 * @generated
	 */
	EAttribute getMandCETH_Aux();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.MandCETH#getGetInfoFromCol <em>Get Info From Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info From Col</em>'.
	 * @see datamodel.eth.MandCETH#getGetInfoFromCol()
	 * @see #getMandCETH()
	 * @generated
	 */
	EReference getMandCETH_GetInfoFromCol();

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
	 * Returns the meta object for the attribute '{@link datamodel.eth.MonitorETH#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see datamodel.eth.MonitorETH#getMac()
	 * @see #getMonitorETH()
	 * @generated
	 */
	EAttribute getMonitorETH_Mac();

	/**
	 * Returns the meta object for the reference '{@link datamodel.eth.MonitorETH#getGetInfoMPEth <em>Get Info MP Eth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info MP Eth</em>'.
	 * @see datamodel.eth.MonitorETH#getGetInfoMPEth()
	 * @see #getMonitorETH()
	 * @generated
	 */
	EReference getMonitorETH_GetInfoMPEth();

	/**
	 * Returns the meta object for data type '{@link datamodel.eth.MandCETH <em>Mand CETHDT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CETHDT</em>'.
	 * @see datamodel.eth.MandCETH
	 * @model instanceClass="datamodel.eth.MandCETH"
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
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_ETH__MAC = eINSTANCE.getControlETH_Mac();

		/**
		 * The meta object literal for the '<em><b>Info Control Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ETH__INFO_CONTROL_ETH = eINSTANCE.getControlETH_InfoControlEth();

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
		 * The meta object literal for the '<em><b>Notes To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__NOTES_TO = eINSTANCE.getDeviceModel_NotesTo();

		/**
		 * The meta object literal for the '<em><b>Validate Spread Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__VALIDATE_SPREAD_ETH = eINSTANCE.getDeviceModel_ValidateSpreadEth();

		/**
		 * The meta object literal for the '<em><b>From Spread Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__FROM_SPREAD_ETH = eINSTANCE.getDeviceModel_FromSpreadEth();

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
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_ETH__AUX = eINSTANCE.getMainETH_Aux();

		/**
		 * The meta object literal for the '<em><b>To Info Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ETH__TO_INFO_MAIN = eINSTANCE.getMainETH_ToInfoMain();

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
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CETH__ROW = eINSTANCE.getMandCETH_Row();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CETH__SHEET = eINSTANCE.getMandCETH_Sheet();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CETH__ASSEMBLY = eINSTANCE.getMandCETH_Assembly();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CETH__AUX = eINSTANCE.getMandCETH_Aux();

		/**
		 * The meta object literal for the '<em><b>Get Info From Col</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CETH__GET_INFO_FROM_COL = eINSTANCE.getMandCETH_GetInfoFromCol();

		/**
		 * The meta object literal for the '{@link datamodel.eth.impl.MonitorETHImpl <em>Monitor ETH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.impl.MonitorETHImpl
		 * @see datamodel.eth.impl.EthPackageImpl#getMonitorETH()
		 * @generated
		 */
		EClass MONITOR_ETH = eINSTANCE.getMonitorETH();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR_ETH__MAC = eINSTANCE.getMonitorETH_Mac();

		/**
		 * The meta object literal for the '<em><b>Get Info MP Eth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_ETH__GET_INFO_MP_ETH = eINSTANCE.getMonitorETH_GetInfoMPEth();

		/**
		 * The meta object literal for the '<em>Mand CETHDT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.eth.MandCETH
		 * @see datamodel.eth.impl.EthPackageImpl#getMandCETHDT()
		 * @generated
		 */
		EDataType MAND_CETHDT = eINSTANCE.getMandCETHDT();

	}

} //EthPackage
