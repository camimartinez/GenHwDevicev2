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
package datamodel.amb;

import datamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;


public interface MyAmbPackage extends AmbPackage {
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
	String eNS_PREFIX = "alma.Control.datamodel.meta.amb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmbPackage eINSTANCE = datamodel.amb.impl.AmbPackageImpl.init();

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.ArchiveAMBImpl <em>Archive AMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.ArchiveAMBImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getArchiveAMB()
	 * @generated
	 */
	int ARCHIVE_AMB = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__ROW = BasePackage.ARCHIVE_PROPERTY__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__SHEET = BasePackage.ARCHIVE_PROPERTY__SHEET;

	/**
	 * The feature id for the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__MP = BasePackage.ARCHIVE_PROPERTY__MP;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__CP = BasePackage.ARCHIVE_PROPERTY__CP;

	/**
	 * The feature id for the '<em><b>Get Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__GET_COLUMNS_INFO_OF_ARCHI = BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI;

	/**
	 * The feature id for the '<em><b>Base Fac Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__BASE_FAC_TMP = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get Assembly Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB__GET_ASSEMBLY_COLUMN = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archive AMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_AMB_FEATURE_COUNT = BasePackage.ARCHIVE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.ControlAMBImpl <em>Control AMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.ControlAMBImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getControlAMB()
	 * @generated
	 */
	int CONTROL_AMB = 1;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__SPREADSHEET_NAME = BasePackage.CONTROL_POINT__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__SHEET_NAME = BasePackage.CONTROL_POINT__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__ROW = BasePackage.CONTROL_POINT__ROW;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__PARENT_ROW = BasePackage.CONTROL_POINT__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__SHEET = BasePackage.CONTROL_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__PARENT = BasePackage.CONTROL_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__ARCHIVE = BasePackage.CONTROL_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__DEPENDENTS = BasePackage.CONTROL_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__SET_INF_FROM_SPREAD = BasePackage.CONTROL_POINT__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__GET_COMMON_INF = BasePackage.CONTROL_POINT__GET_COMMON_INF;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__SET_MPOR_CP = BasePackage.CONTROL_POINT__SET_MPOR_CP;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__GET_SHEET_MP = BasePackage.CONTROL_POINT__GET_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Get Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__GET_ARCH_ON_USE_CONTROL = BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__MAC = BasePackage.CONTROL_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__TMP = BasePackage.CONTROL_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tmp2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__TMP2 = BasePackage.CONTROL_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>World To Data Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__WORLD_TO_DATA_COLUMNS = BasePackage.CONTROL_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Get Info Control Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__GET_INFO_CONTROL_SHEET = BasePackage.CONTROL_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Normalize Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB__TO_NORMALIZE_NUMBER = BasePackage.CONTROL_POINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Control AMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AMB_FEATURE_COUNT = BasePackage.CONTROL_POINT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.DeviceModelImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getDeviceModel()
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
	 * The feature id for the '<em><b>Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TMP = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Add CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_ADD_CP = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Get Note From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_NOTE_FROM_MAIN = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Add MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_ADD_MP = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Get Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_INFO_MAIN = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Get CPfrom Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_CPFROM_CONTROL = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Get Info From Main Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Get MPfrom Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_MPFROM_MONITOR = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Get Data From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_DATA_FROM_SPREAD = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Get APfrom Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_APFROM_ARCHIVE = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Toinstall End Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TOINSTALL_END_GENERATION = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Get From Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_FROM_SPREADSHEET = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>To Validate Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_VALIDATE_SPREADSHEET = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Get Generic MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__GET_GENERIC_MP = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = BasePackage.DEVICE_MODEL_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.MainAMBImpl <em>Main AMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.MainAMBImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getMainAMB()
	 * @generated
	 */
	int MAIN_AMB = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__ROW = BasePackage.MAIN_BASE__ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__SHEET = BasePackage.MAIN_BASE__SHEET;

	/**
	 * The feature id for the '<em><b>Implement To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__IMPLEMENT_TO = BasePackage.MAIN_BASE__IMPLEMENT_TO;

	/**
	 * The feature id for the '<em><b>Convert Info To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__CONVERT_INFO_TO = BasePackage.MAIN_BASE__CONVERT_INFO_TO;

	/**
	 * The feature id for the '<em><b>Get Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__GET_INFO_FROM_SPREAD = BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__TMP = BasePackage.MAIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get Info From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB__GET_INFO_FROM_MAIN = BasePackage.MAIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Main AMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_AMB_FEATURE_COUNT = BasePackage.MAIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.MandCAMBImpl <em>Mand CAMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.MandCAMBImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getMandCAMB()
	 * @generated
	 */
	int MAND_CAMB = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__ROW = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Mcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__MCP = 2;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__MASK = 3;

	/**
	 * The feature id for the '<em><b>Get Info Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__GET_INFO_SHEET = 4;

	/**
	 * The feature id for the '<em><b>Get Data From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__GET_DATA_FROM_MAIN = 5;

	/**
	 * The feature id for the '<em><b>Is MP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__IS_MP_DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Is CP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__IS_CP_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Utils To Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB__UTILS_TO_DATA = 8;

	/**
	 * The number of structural features of the '<em>Mand CAMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CAMB_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.MonitorAMBImpl <em>Monitor AMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.MonitorAMBImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getMonitorAMB()
	 * @generated
	 */
	int MONITOR_AMB = 5;

	/**
	 * The feature id for the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__SPREADSHEET_NAME = BasePackage.MONITOR_POINT__SPREADSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__SHEET_NAME = BasePackage.MONITOR_POINT__SHEET_NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__ROW = BasePackage.MONITOR_POINT__ROW;

	/**
	 * The feature id for the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__PARENT_ROW = BasePackage.MONITOR_POINT__PARENT_ROW;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__SHEET = BasePackage.MONITOR_POINT__SHEET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__PARENT = BasePackage.MONITOR_POINT__PARENT;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__ARCHIVE = BasePackage.MONITOR_POINT__ARCHIVE;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__DEPENDENTS = BasePackage.MONITOR_POINT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__SET_INF_FROM_SPREAD = BasePackage.MONITOR_POINT__SET_INF_FROM_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__GET_COMMON_INF = BasePackage.MONITOR_POINT__GET_COMMON_INF;

	/**
	 * The feature id for the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__SET_MPOR_CP = BasePackage.MONITOR_POINT__SET_MPOR_CP;

	/**
	 * The feature id for the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__GET_SHEET_MP = BasePackage.MONITOR_POINT__GET_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Get Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__GET_INFO_FROM_AP_SPREAD = BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD;

	/**
	 * The feature id for the '<em><b>Get Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__GET_INFO_FROM_MP_SPREAD = BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__AUX = BasePackage.MONITOR_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__MAC = BasePackage.MONITOR_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aux2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__AUX2 = BasePackage.MONITOR_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aux3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__AUX3 = BasePackage.MONITOR_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Normalize Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__TO_NORMALIZE_DATA = BasePackage.MONITOR_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Get Columns Can Be Inv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__GET_COLUMNS_CAN_BE_INV = BasePackage.MONITOR_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Get Info MP Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB__GET_INFO_MP_SHEET = BasePackage.MONITOR_POINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Monitor AMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_AMB_FEATURE_COUNT = BasePackage.MONITOR_POINT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.SWModuleImpl <em>SW Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.SWModuleImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getSWModule()
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
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__AUX = 12;

	/**
	 * The feature id for the '<em><b>Add All MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ADD_ALL_MP = 13;

	/**
	 * The feature id for the '<em><b>Add All CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__ADD_ALL_CP = 14;

	/**
	 * The feature id for the '<em><b>Set Format Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__SET_FORMAT_DESCRIPTIONS = 15;

	/**
	 * The feature id for the '<em><b>Get Sheet Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE__GET_SHEET_COLUMNS = 16;

	/**
	 * The number of structural features of the '<em>SW Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODULE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link datamodel.amb.impl.GenericMonitorPointsImpl <em>Generic Monitor Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.impl.GenericMonitorPointsImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getGenericMonitorPoints()
	 * @generated
	 */
	int GENERIC_MONITOR_POINTS = 7;

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
	 * The feature id for the '<em><b>Get The Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET = 3;

	/**
	 * The feature id for the '<em><b>To Validate The Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET = 4;

	/**
	 * The feature id for the '<em><b>To Install Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS__TO_INSTALL_DIR = 5;

	/**
	 * The number of structural features of the '<em>Generic Monitor Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MONITOR_POINTS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '<em>Mand CAMBDT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.amb.MandCAMB
	 * @see datamodel.amb.impl.AmbPackageImpl#getMandCAMBDT()
	 * @generated
	 */
	int MAND_CAMBDT = 8;

	/**
	 * The meta object id for the '<em>Base Factory Imp DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.impl.BaseFactoryImpl
	 * @see datamodel.amb.impl.AmbPackageImpl#getBaseFactoryImpDT()
	 * @generated
	 */
	int BASE_FACTORY_IMP_DT = 9;

	/**
	 * The meta object id for the '<em>Base Factory DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datamodel.base.BaseFactory
	 * @see datamodel.amb.impl.AmbPackageImpl#getBaseFactoryDT()
	 * @generated
	 */
	int BASE_FACTORY_DT = 10;

	/**
	 * The meta object id for the '<em>Iterator DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see datamodel.amb.impl.AmbPackageImpl#getIteratorDT()
	 * @generated
	 */
	int ITERATOR_DT = 11;

	/**
	 * The meta object id for the '<em>Resource DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see datamodel.amb.impl.AmbPackageImpl#getResourceDT()
	 * @generated
	 */
	int RESOURCE_DT = 12;


	/**
	 * Returns the meta object for class '{@link datamodel.amb.ArchiveAMB <em>Archive AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive AMB</em>'.
	 * @see datamodel.amb.ArchiveAMB
	 * @generated
	 */
	EClass getArchiveAMB();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.ArchiveAMB#getBaseFacTmp <em>Base Fac Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Fac Tmp</em>'.
	 * @see datamodel.amb.ArchiveAMB#getBaseFacTmp()
	 * @see #getArchiveAMB()
	 * @generated
	 */
	EAttribute getArchiveAMB_BaseFacTmp();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.ArchiveAMB#getGetAssemblyColumn <em>Get Assembly Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Assembly Column</em>'.
	 * @see datamodel.amb.ArchiveAMB#getGetAssemblyColumn()
	 * @see #getArchiveAMB()
	 * @generated
	 */
	EReference getArchiveAMB_GetAssemblyColumn();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.ControlAMB <em>Control AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control AMB</em>'.
	 * @see datamodel.amb.ControlAMB
	 * @generated
	 */
	EClass getControlAMB();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.ControlAMB#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see datamodel.amb.ControlAMB#getMac()
	 * @see #getControlAMB()
	 * @generated
	 */
	EAttribute getControlAMB_Mac();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.ControlAMB#getTmp <em>Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmp</em>'.
	 * @see datamodel.amb.ControlAMB#getTmp()
	 * @see #getControlAMB()
	 * @generated
	 */
	EAttribute getControlAMB_Tmp();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.ControlAMB#getTmp2 <em>Tmp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmp2</em>'.
	 * @see datamodel.amb.ControlAMB#getTmp2()
	 * @see #getControlAMB()
	 * @generated
	 */
	EAttribute getControlAMB_Tmp2();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.ControlAMB#getWorldToDataColumns <em>World To Data Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>World To Data Columns</em>'.
	 * @see datamodel.amb.ControlAMB#getWorldToDataColumns()
	 * @see #getControlAMB()
	 * @generated
	 */
	EReference getControlAMB_WorldToDataColumns();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.ControlAMB#getGetInfoControlSheet <em>Get Info Control Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info Control Sheet</em>'.
	 * @see datamodel.amb.ControlAMB#getGetInfoControlSheet()
	 * @see #getControlAMB()
	 * @generated
	 */
	EReference getControlAMB_GetInfoControlSheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.ControlAMB#getToNormalizeNumber <em>To Normalize Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Normalize Number</em>'.
	 * @see datamodel.amb.ControlAMB#getToNormalizeNumber()
	 * @see #getControlAMB()
	 * @generated
	 */
	EReference getControlAMB_ToNormalizeNumber();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see datamodel.amb.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.DeviceModel#getTmp <em>Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmp</em>'.
	 * @see datamodel.amb.DeviceModel#getTmp()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Tmp();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getToAddCP <em>To Add CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Add CP</em>'.
	 * @see datamodel.amb.DeviceModel#getToAddCP()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToAddCP();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetNoteFromMain <em>Get Note From Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Note From Main</em>'.
	 * @see datamodel.amb.DeviceModel#getGetNoteFromMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetNoteFromMain();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getToAddMP <em>To Add MP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Add MP</em>'.
	 * @see datamodel.amb.DeviceModel#getToAddMP()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToAddMP();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetInfoMain <em>Get Info Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info Main</em>'.
	 * @see datamodel.amb.DeviceModel#getGetInfoMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetInfoMain();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetCPfromControl <em>Get CPfrom Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get CPfrom Control</em>'.
	 * @see datamodel.amb.DeviceModel#getGetCPfromControl()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetCPfromControl();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetInfoFromMainSheet <em>Get Info From Main Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info From Main Sheet</em>'.
	 * @see datamodel.amb.DeviceModel#getGetInfoFromMainSheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetInfoFromMainSheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetMPfromMonitor <em>Get MPfrom Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get MPfrom Monitor</em>'.
	 * @see datamodel.amb.DeviceModel#getGetMPfromMonitor()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetMPfromMonitor();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetDataFromSpread <em>Get Data From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Data From Spread</em>'.
	 * @see datamodel.amb.DeviceModel#getGetDataFromSpread()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetDataFromSpread();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetAPfromArchive <em>Get APfrom Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get APfrom Archive</em>'.
	 * @see datamodel.amb.DeviceModel#getGetAPfromArchive()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetAPfromArchive();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getToinstallEndGeneration <em>Toinstall End Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Toinstall End Generation</em>'.
	 * @see datamodel.amb.DeviceModel#getToinstallEndGeneration()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToinstallEndGeneration();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetFromSpreadsheet <em>Get From Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get From Spreadsheet</em>'.
	 * @see datamodel.amb.DeviceModel#getGetFromSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetFromSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Validate Spreadsheet</em>'.
	 * @see datamodel.amb.DeviceModel#getToValidateSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToValidateSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.DeviceModel#getGetGenericMP <em>Get Generic MP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Generic MP</em>'.
	 * @see datamodel.amb.DeviceModel#getGetGenericMP()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_GetGenericMP();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.MainAMB <em>Main AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main AMB</em>'.
	 * @see datamodel.amb.MainAMB
	 * @generated
	 */
	EClass getMainAMB();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MainAMB#getTmp <em>Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmp</em>'.
	 * @see datamodel.amb.MainAMB#getTmp()
	 * @see #getMainAMB()
	 * @generated
	 */
	EAttribute getMainAMB_Tmp();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MainAMB#getGetInfoFromMain <em>Get Info From Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info From Main</em>'.
	 * @see datamodel.amb.MainAMB#getGetInfoFromMain()
	 * @see #getMainAMB()
	 * @generated
	 */
	EReference getMainAMB_GetInfoFromMain();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.MandCAMB <em>Mand CAMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand CAMB</em>'.
	 * @see datamodel.amb.MandCAMB
	 * @generated
	 */
	EClass getMandCAMB();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MandCAMB#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see datamodel.amb.MandCAMB#getRow()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EAttribute getMandCAMB_Row();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MandCAMB#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see datamodel.amb.MandCAMB#getSheet()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EAttribute getMandCAMB_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MandCAMB#getMcp <em>Mcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcp</em>'.
	 * @see datamodel.amb.MandCAMB#getMcp()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EAttribute getMandCAMB_Mcp();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MandCAMB#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see datamodel.amb.MandCAMB#getMask()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EAttribute getMandCAMB_Mask();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MandCAMB#getGetInfoSheet <em>Get Info Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info Sheet</em>'.
	 * @see datamodel.amb.MandCAMB#getGetInfoSheet()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EReference getMandCAMB_GetInfoSheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MandCAMB#getGetDataFromMain <em>Get Data From Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Data From Main</em>'.
	 * @see datamodel.amb.MandCAMB#getGetDataFromMain()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EReference getMandCAMB_GetDataFromMain();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MandCAMB#getIsMPDataType <em>Is MP Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is MP Data Type</em>'.
	 * @see datamodel.amb.MandCAMB#getIsMPDataType()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EReference getMandCAMB_IsMPDataType();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MandCAMB#getIsCPDataType <em>Is CP Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is CP Data Type</em>'.
	 * @see datamodel.amb.MandCAMB#getIsCPDataType()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EReference getMandCAMB_IsCPDataType();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MandCAMB#getUtilsToData <em>Utils To Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utils To Data</em>'.
	 * @see datamodel.amb.MandCAMB#getUtilsToData()
	 * @see #getMandCAMB()
	 * @generated
	 */
	EReference getMandCAMB_UtilsToData();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.MonitorAMB <em>Monitor AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor AMB</em>'.
	 * @see datamodel.amb.MonitorAMB
	 * @generated
	 */
	EClass getMonitorAMB();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MonitorAMB#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see datamodel.amb.MonitorAMB#getAux()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EAttribute getMonitorAMB_Aux();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MonitorAMB#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see datamodel.amb.MonitorAMB#getMac()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EAttribute getMonitorAMB_Mac();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MonitorAMB#getAux2 <em>Aux2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux2</em>'.
	 * @see datamodel.amb.MonitorAMB#getAux2()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EAttribute getMonitorAMB_Aux2();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.MonitorAMB#getAux3 <em>Aux3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux3</em>'.
	 * @see datamodel.amb.MonitorAMB#getAux3()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EAttribute getMonitorAMB_Aux3();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MonitorAMB#getToNormalizeData <em>To Normalize Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Normalize Data</em>'.
	 * @see datamodel.amb.MonitorAMB#getToNormalizeData()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EReference getMonitorAMB_ToNormalizeData();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MonitorAMB#getGetColumnsCanBeInv <em>Get Columns Can Be Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Columns Can Be Inv</em>'.
	 * @see datamodel.amb.MonitorAMB#getGetColumnsCanBeInv()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EReference getMonitorAMB_GetColumnsCanBeInv();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.MonitorAMB#getGetInfoMPSheet <em>Get Info MP Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Info MP Sheet</em>'.
	 * @see datamodel.amb.MonitorAMB#getGetInfoMPSheet()
	 * @see #getMonitorAMB()
	 * @generated
	 */
	EReference getMonitorAMB_GetInfoMPSheet();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.SWModule <em>SW Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Module</em>'.
	 * @see datamodel.amb.SWModule
	 * @generated
	 */
	EClass getSWModule();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getAssemblyName <em>Assembly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly Name</em>'.
	 * @see datamodel.amb.SWModule#getAssemblyName()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_AssemblyName();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getDirPath <em>Dir Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Path</em>'.
	 * @see datamodel.amb.SWModule#getDirPath()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_DirPath();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getMainAssembly <em>Main Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Assembly</em>'.
	 * @see datamodel.amb.SWModule#getMainAssembly()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_MainAssembly();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#isOneSwModule <em>One Sw Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Sw Module</em>'.
	 * @see datamodel.amb.SWModule#isOneSwModule()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_OneSwModule();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see datamodel.amb.SWModule#getRow()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Row();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getParentRow <em>Parent Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Row</em>'.
	 * @see datamodel.amb.SWModule#getParentRow()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ParentRow();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see datamodel.amb.SWModule#getSheet()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Points</em>'.
	 * @see datamodel.amb.SWModule#getMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_MonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Points</em>'.
	 * @see datamodel.amb.SWModule#getControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Properties</em>'.
	 * @see datamodel.amb.SWModule#getArchiveProperties()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_ArchiveProperties();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Monitor Points</em>'.
	 * @see datamodel.amb.SWModule#getSimMonitorPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_SimMonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Control Points</em>'.
	 * @see datamodel.amb.SWModule#getSimControlPoints()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_SimControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.SWModule#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see datamodel.amb.SWModule#getAux()
	 * @see #getSWModule()
	 * @generated
	 */
	EAttribute getSWModule_Aux();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.SWModule#getAddAllMP <em>Add All MP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add All MP</em>'.
	 * @see datamodel.amb.SWModule#getAddAllMP()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_AddAllMP();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.SWModule#getAddAllCP <em>Add All CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add All CP</em>'.
	 * @see datamodel.amb.SWModule#getAddAllCP()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_AddAllCP();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.SWModule#getSetFormatDescriptions <em>Set Format Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Format Descriptions</em>'.
	 * @see datamodel.amb.SWModule#getSetFormatDescriptions()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_SetFormatDescriptions();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.SWModule#getGetSheetColumns <em>Get Sheet Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Sheet Columns</em>'.
	 * @see datamodel.amb.SWModule#getGetSheetColumns()
	 * @see #getSWModule()
	 * @generated
	 */
	EReference getSWModule_GetSheetColumns();

	/**
	 * Returns the meta object for class '{@link datamodel.amb.GenericMonitorPoints <em>Generic Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Monitor Points</em>'.
	 * @see datamodel.amb.GenericMonitorPoints
	 * @generated
	 */
	EClass getGenericMonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Spreadsheet</em>'.
	 * @see datamodel.amb.GenericMonitorPoints#getNewSpreadsheet()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_NewSpreadsheet();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see datamodel.amb.GenericMonitorPoints#getDeviceName()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link datamodel.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Location</em>'.
	 * @see datamodel.amb.GenericMonitorPoints#getDirLocation()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EAttribute getGenericMonitorPoints_DirLocation();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.GenericMonitorPoints#getGetTheSpreadsheet <em>Get The Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get The Spreadsheet</em>'.
	 * @see datamodel.amb.GenericMonitorPoints#getGetTheSpreadsheet()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EReference getGenericMonitorPoints_GetTheSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.GenericMonitorPoints#getToValidateTheSpreadsheet <em>To Validate The Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Validate The Spreadsheet</em>'.
	 * @see datamodel.amb.GenericMonitorPoints#getToValidateTheSpreadsheet()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EReference getGenericMonitorPoints_ToValidateTheSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link datamodel.amb.GenericMonitorPoints#getToInstallDir <em>To Install Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Install Dir</em>'.
	 * @see datamodel.amb.GenericMonitorPoints#getToInstallDir()
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	EReference getGenericMonitorPoints_ToInstallDir();

	/**
	 * Returns the meta object for data type '{@link datamodel.amb.MandCAMB <em>Mand CAMBDT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CAMBDT</em>'.
	 * @see datamodel.amb.MandCAMB
	 * @model instanceClass="datamodel.amb.MandCAMB"
	 * @generated
	 */
	EDataType getMandCAMBDT();

	/**
	 * Returns the meta object for data type '{@link datamodel.base.impl.BaseFactoryImpl <em>Base Factory Imp DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base Factory Imp DT</em>'.
	 * @see datamodel.base.impl.BaseFactoryImpl
	 * @model instanceClass="datamodel.base.impl.BaseFactoryImpl"
	 * @generated
	 */
	EDataType getBaseFactoryImpDT();

	/**
	 * Returns the meta object for data type '{@link datamodel.base.BaseFactory <em>Base Factory DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base Factory DT</em>'.
	 * @see datamodel.base.BaseFactory
	 * @model instanceClass="datamodel.base.BaseFactory"
	 * @generated
	 */
	EDataType getBaseFactoryDT();

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
		 * The meta object literal for the '{@link datamodel.amb.impl.ArchiveAMBImpl <em>Archive AMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.ArchiveAMBImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getArchiveAMB()
		 * @generated
		 */
		EClass ARCHIVE_AMB = eINSTANCE.getArchiveAMB();

		/**
		 * The meta object literal for the '<em><b>Base Fac Tmp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE_AMB__BASE_FAC_TMP = eINSTANCE.getArchiveAMB_BaseFacTmp();

		/**
		 * The meta object literal for the '<em><b>Get Assembly Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_AMB__GET_ASSEMBLY_COLUMN = eINSTANCE.getArchiveAMB_GetAssemblyColumn();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.ControlAMBImpl <em>Control AMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.ControlAMBImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getControlAMB()
		 * @generated
		 */
		EClass CONTROL_AMB = eINSTANCE.getControlAMB();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AMB__MAC = eINSTANCE.getControlAMB_Mac();

		/**
		 * The meta object literal for the '<em><b>Tmp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AMB__TMP = eINSTANCE.getControlAMB_Tmp();

		/**
		 * The meta object literal for the '<em><b>Tmp2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AMB__TMP2 = eINSTANCE.getControlAMB_Tmp2();

		/**
		 * The meta object literal for the '<em><b>World To Data Columns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AMB__WORLD_TO_DATA_COLUMNS = eINSTANCE.getControlAMB_WorldToDataColumns();

		/**
		 * The meta object literal for the '<em><b>Get Info Control Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AMB__GET_INFO_CONTROL_SHEET = eINSTANCE.getControlAMB_GetInfoControlSheet();

		/**
		 * The meta object literal for the '<em><b>To Normalize Number</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AMB__TO_NORMALIZE_NUMBER = eINSTANCE.getControlAMB_ToNormalizeNumber();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.DeviceModelImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getDeviceModel()
		 * @generated
		 */
		EClass DEVICE_MODEL = eINSTANCE.getDeviceModel();

		/**
		 * The meta object literal for the '<em><b>Tmp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MODEL__TMP = eINSTANCE.getDeviceModel_Tmp();

		/**
		 * The meta object literal for the '<em><b>To Add CP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_ADD_CP = eINSTANCE.getDeviceModel_ToAddCP();

		/**
		 * The meta object literal for the '<em><b>Get Note From Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_NOTE_FROM_MAIN = eINSTANCE.getDeviceModel_GetNoteFromMain();

		/**
		 * The meta object literal for the '<em><b>To Add MP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_ADD_MP = eINSTANCE.getDeviceModel_ToAddMP();

		/**
		 * The meta object literal for the '<em><b>Get Info Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_INFO_MAIN = eINSTANCE.getDeviceModel_GetInfoMain();

		/**
		 * The meta object literal for the '<em><b>Get CPfrom Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_CPFROM_CONTROL = eINSTANCE.getDeviceModel_GetCPfromControl();

		/**
		 * The meta object literal for the '<em><b>Get Info From Main Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET = eINSTANCE.getDeviceModel_GetInfoFromMainSheet();

		/**
		 * The meta object literal for the '<em><b>Get MPfrom Monitor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_MPFROM_MONITOR = eINSTANCE.getDeviceModel_GetMPfromMonitor();

		/**
		 * The meta object literal for the '<em><b>Get Data From Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_DATA_FROM_SPREAD = eINSTANCE.getDeviceModel_GetDataFromSpread();

		/**
		 * The meta object literal for the '<em><b>Get APfrom Archive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_APFROM_ARCHIVE = eINSTANCE.getDeviceModel_GetAPfromArchive();

		/**
		 * The meta object literal for the '<em><b>Toinstall End Generation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TOINSTALL_END_GENERATION = eINSTANCE.getDeviceModel_ToinstallEndGeneration();

		/**
		 * The meta object literal for the '<em><b>Get From Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_FROM_SPREADSHEET = eINSTANCE.getDeviceModel_GetFromSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>To Validate Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_VALIDATE_SPREADSHEET = eINSTANCE.getDeviceModel_ToValidateSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Get Generic MP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__GET_GENERIC_MP = eINSTANCE.getDeviceModel_GetGenericMP();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.MainAMBImpl <em>Main AMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.MainAMBImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getMainAMB()
		 * @generated
		 */
		EClass MAIN_AMB = eINSTANCE.getMainAMB();

		/**
		 * The meta object literal for the '<em><b>Tmp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_AMB__TMP = eINSTANCE.getMainAMB_Tmp();

		/**
		 * The meta object literal for the '<em><b>Get Info From Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_AMB__GET_INFO_FROM_MAIN = eINSTANCE.getMainAMB_GetInfoFromMain();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.MandCAMBImpl <em>Mand CAMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.MandCAMBImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getMandCAMB()
		 * @generated
		 */
		EClass MAND_CAMB = eINSTANCE.getMandCAMB();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CAMB__ROW = eINSTANCE.getMandCAMB_Row();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CAMB__SHEET = eINSTANCE.getMandCAMB_Sheet();

		/**
		 * The meta object literal for the '<em><b>Mcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CAMB__MCP = eINSTANCE.getMandCAMB_Mcp();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAND_CAMB__MASK = eINSTANCE.getMandCAMB_Mask();

		/**
		 * The meta object literal for the '<em><b>Get Info Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CAMB__GET_INFO_SHEET = eINSTANCE.getMandCAMB_GetInfoSheet();

		/**
		 * The meta object literal for the '<em><b>Get Data From Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CAMB__GET_DATA_FROM_MAIN = eINSTANCE.getMandCAMB_GetDataFromMain();

		/**
		 * The meta object literal for the '<em><b>Is MP Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CAMB__IS_MP_DATA_TYPE = eINSTANCE.getMandCAMB_IsMPDataType();

		/**
		 * The meta object literal for the '<em><b>Is CP Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CAMB__IS_CP_DATA_TYPE = eINSTANCE.getMandCAMB_IsCPDataType();

		/**
		 * The meta object literal for the '<em><b>Utils To Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CAMB__UTILS_TO_DATA = eINSTANCE.getMandCAMB_UtilsToData();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.MonitorAMBImpl <em>Monitor AMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.MonitorAMBImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getMonitorAMB()
		 * @generated
		 */
		EClass MONITOR_AMB = eINSTANCE.getMonitorAMB();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR_AMB__AUX = eINSTANCE.getMonitorAMB_Aux();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR_AMB__MAC = eINSTANCE.getMonitorAMB_Mac();

		/**
		 * The meta object literal for the '<em><b>Aux2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR_AMB__AUX2 = eINSTANCE.getMonitorAMB_Aux2();

		/**
		 * The meta object literal for the '<em><b>Aux3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR_AMB__AUX3 = eINSTANCE.getMonitorAMB_Aux3();

		/**
		 * The meta object literal for the '<em><b>To Normalize Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_AMB__TO_NORMALIZE_DATA = eINSTANCE.getMonitorAMB_ToNormalizeData();

		/**
		 * The meta object literal for the '<em><b>Get Columns Can Be Inv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_AMB__GET_COLUMNS_CAN_BE_INV = eINSTANCE.getMonitorAMB_GetColumnsCanBeInv();

		/**
		 * The meta object literal for the '<em><b>Get Info MP Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_AMB__GET_INFO_MP_SHEET = eINSTANCE.getMonitorAMB_GetInfoMPSheet();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.SWModuleImpl <em>SW Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.SWModuleImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getSWModule()
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
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_MODULE__AUX = eINSTANCE.getSWModule_Aux();

		/**
		 * The meta object literal for the '<em><b>Add All MP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__ADD_ALL_MP = eINSTANCE.getSWModule_AddAllMP();

		/**
		 * The meta object literal for the '<em><b>Add All CP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__ADD_ALL_CP = eINSTANCE.getSWModule_AddAllCP();

		/**
		 * The meta object literal for the '<em><b>Set Format Descriptions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__SET_FORMAT_DESCRIPTIONS = eINSTANCE.getSWModule_SetFormatDescriptions();

		/**
		 * The meta object literal for the '<em><b>Get Sheet Columns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_MODULE__GET_SHEET_COLUMNS = eINSTANCE.getSWModule_GetSheetColumns();

		/**
		 * The meta object literal for the '{@link datamodel.amb.impl.GenericMonitorPointsImpl <em>Generic Monitor Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.impl.GenericMonitorPointsImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getGenericMonitorPoints()
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
		 * The meta object literal for the '<em><b>Get The Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET = eINSTANCE.getGenericMonitorPoints_GetTheSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>To Validate The Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET = eINSTANCE.getGenericMonitorPoints_ToValidateTheSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>To Install Dir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MONITOR_POINTS__TO_INSTALL_DIR = eINSTANCE.getGenericMonitorPoints_ToInstallDir();

		/**
		 * The meta object literal for the '<em>Mand CAMBDT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.amb.MandCAMB
		 * @see datamodel.amb.impl.AmbPackageImpl#getMandCAMBDT()
		 * @generated
		 */
		EDataType MAND_CAMBDT = eINSTANCE.getMandCAMBDT();

		/**
		 * The meta object literal for the '<em>Base Factory Imp DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.impl.BaseFactoryImpl
		 * @see datamodel.amb.impl.AmbPackageImpl#getBaseFactoryImpDT()
		 * @generated
		 */
		EDataType BASE_FACTORY_IMP_DT = eINSTANCE.getBaseFactoryImpDT();

		/**
		 * The meta object literal for the '<em>Base Factory DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datamodel.base.BaseFactory
		 * @see datamodel.amb.impl.AmbPackageImpl#getBaseFactoryDT()
		 * @generated
		 */
		EDataType BASE_FACTORY_DT = eINSTANCE.getBaseFactoryDT();

		/**
		 * The meta object literal for the '<em>Iterator DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see datamodel.amb.impl.AmbPackageImpl#getIteratorDT()
		 * @generated
		 */
		EDataType ITERATOR_DT = eINSTANCE.getIteratorDT();

		/**
		 * The meta object literal for the '<em>Resource DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see datamodel.amb.impl.AmbPackageImpl#getResourceDT()
		 * @generated
		 */
		EDataType RESOURCE_DT = eINSTANCE.getResourceDT();

	}

} //AmbPackage
