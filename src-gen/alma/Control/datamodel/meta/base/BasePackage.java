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
package alma.Control.datamodel.meta.base;

import alma.Control.datamodel.meta.amb.AmbPackage;

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
 * @see alma.Control.datamodel.meta.base.BaseFactory
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
	BasePackage eINSTANCE = alma.Control.datamodel.meta.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl <em>Device Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.DeviceModelImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getDeviceModel()
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
	 * The feature id for the '<em><b>To Archive Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_ARCHIVE_INDEX = 15;

	/**
	 * The feature id for the '<em><b>To Cont Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_CONT_POINTS = 16;

	/**
	 * The feature id for the '<em><b>To Moni Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_MONI_POINTS = 17;

	/**
	 * The feature id for the '<em><b>To End Of Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_END_OF_GENERATION = 18;

	/**
	 * The feature id for the '<em><b>To Archiv Prop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_ARCHIV_PROP = 19;

	/**
	 * The feature id for the '<em><b>To Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL__TO_INF_FROM_SPREAD = 20;

	/**
	 * The number of structural features of the '<em>Device Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODEL_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl <em>Mand CBase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.MandCBaseImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMandCBase()
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
	 * The feature id for the '<em><b>To Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__TO_COMMON_INF = 9;

	/**
	 * The feature id for the '<em><b>To MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__TO_MPOR_CP = 10;

	/**
	 * The feature id for the '<em><b>To Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE__TO_SHEET_MP = 11;

	/**
	 * The number of structural features of the '<em>Mand CBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAND_CBASE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.MonitorPointImpl <em>Monitor Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.MonitorPointImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMonitorPoint()
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
	 * The feature id for the '<em><b>To Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__TO_COMMON_INF = MAND_CBASE__TO_COMMON_INF;

	/**
	 * The feature id for the '<em><b>To MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__TO_MPOR_CP = MAND_CBASE__TO_MPOR_CP;

	/**
	 * The feature id for the '<em><b>To Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__TO_SHEET_MP = MAND_CBASE__TO_SHEET_MP;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__AUX = MAND_CBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__TO_INFO_FROM_AP_SPREAD = MAND_CBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT__TO_INFO_FROM_MP_SPREAD = MAND_CBASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitor Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_POINT_FEATURE_COUNT = MAND_CBASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.ControlPointImpl <em>Control Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.ControlPointImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getControlPoint()
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
	 * The feature id for the '<em><b>To Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__TO_COMMON_INF = MAND_CBASE__TO_COMMON_INF;

	/**
	 * The feature id for the '<em><b>To MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__TO_MPOR_CP = MAND_CBASE__TO_MPOR_CP;

	/**
	 * The feature id for the '<em><b>To Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__TO_SHEET_MP = MAND_CBASE__TO_SHEET_MP;

	/**
	 * The feature id for the '<em><b>To Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__TO_ARCH_ON_USE_CONTROL = MAND_CBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT__AUX = MAND_CBASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POINT_FEATURE_COUNT = MAND_CBASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.TableImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getTable()
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
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl <em>Archive Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getArchiveProperty()
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
	int ARCHIVE_PROPERTY__ROW = AmbPackage.RESOURCE_AUX_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__SHEET = AmbPackage.RESOURCE_AUX_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__MP = AmbPackage.RESOURCE_AUX_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__CP = AmbPackage.RESOURCE_AUX_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY__TO_COLUMNS_INFO_OF_ARCHI = AmbPackage.RESOURCE_AUX_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Archive Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_PROPERTY_FEATURE_COUNT = AmbPackage.RESOURCE_AUX_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.NoteImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getNote()
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
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.SpreadsheetValidatorImpl <em>Spreadsheet Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.SpreadsheetValidatorImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetValidator()
	 * @generated
	 */
	int SPREADSHEET_VALIDATOR = 7;

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
	 * The feature id for the '<em><b>Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR__ERROR_HANDLER = 3;

	/**
	 * The number of structural features of the '<em>Spreadsheet Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_VALIDATOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl <em>Spreadsheet Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetParser()
	 * @generated
	 */
	int SPREADSHEET_PARSER = 8;

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
	 * The feature id for the '<em><b>To New Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__TO_NEW_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Tovalidate Spreads</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER__TOVALIDATE_SPREADS = 6;

	/**
	 * The number of structural features of the '<em>Spreadsheet Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_PARSER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.UtilImpl <em>Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.UtilImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getUtil()
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
	 * The feature id for the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__AUX = 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MAX_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>MONTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MONTH = 3;

	/**
	 * The feature id for the '<em><b>MONT Halt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__MONT_HALT = 4;

	/**
	 * The feature id for the '<em><b>To Raw Bytes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL__TO_RAW_BYTES = 5;

	/**
	 * The number of structural features of the '<em>Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.PairImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 10;

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
	 * The feature id for the '<em><b>To New Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__TO_NEW_CONTENT = SPREADSHEET_PARSER__TO_NEW_CONTENT;

	/**
	 * The feature id for the '<em><b>Tovalidate Spreads</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__TOVALIDATE_SPREADS = SPREADSHEET_PARSER__TOVALIDATE_SPREADS;

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
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.SimpleErrorHandlerImpl <em>Simple Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.SimpleErrorHandlerImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandler()
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
	 * The meta object id for the '{@link alma.Control.datamodel.meta.base.impl.MainBaseImpl <em>Main Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.MainBaseImpl
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMainBase()
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
	 * The feature id for the '<em><b>To Implement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__TO_IMPLEMENT = 2;

	/**
	 * The feature id for the '<em><b>To Convert Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__TO_CONVERT_INFO = 3;

	/**
	 * The feature id for the '<em><b>To Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BASE__TO_INFO_FROM_SPREAD = 4;

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
	 * @see alma.Control.datamodel.meta.base.SimpleErrorHandler
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandlerDT()
	 * @generated
	 */
	int SIMPLE_ERROR_HANDLER_DT = 13;

	/**
	 * The meta object id for the '<em>Mand CBase DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.MandCBase
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMandCBaseDT()
	 * @generated
	 */
	int MAND_CBASE_DT = 14;

	/**
	 * The meta object id for the '<em>Main Base DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.MainBase
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMainBaseDT()
	 * @generated
	 */
	int MAIN_BASE_DT = 15;

	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 16;

	/**
	 * The meta object id for the '<em>Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getHashtable()
	 * @generated
	 */
	int HASHTABLE = 17;

	/**
	 * The meta object id for the '<em>Error Handler DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml.sax.ErrorHandler
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getErrorHandlerDT()
	 * @generated
	 */
	int ERROR_HANDLER_DT = 18;

	/**
	 * The meta object id for the '<em>SAX Parse Exception DT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml.sax.SAXParseException
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSAXParseExceptionDT()
	 * @generated
	 */
	int SAX_PARSE_EXCEPTION_DT = 19;

	/**
	 * The meta object id for the '<em>EString Array3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray3()
	 * @generated
	 */
	int ESTRING_ARRAY3 = 20;

	/**
	 * The meta object id for the '<em>EString Array2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray2()
	 * @generated
	 */
	int ESTRING_ARRAY2 = 21;

	/**
	 * The meta object id for the '<em>EString Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray()
	 * @generated
	 */
	int ESTRING_ARRAY = 22;

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Model</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel
	 * @generated
	 */
	EClass getDeviceModel();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Index</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getDescriptionIndex()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DescriptionIndex();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getSpreadsheet()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Spreadsheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getMain()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Main();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getNotes()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_Notes();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Points</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getMonitorPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_MonitorPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Points</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getControlPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_ControlPoints();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Properties</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getArchiveProperties()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_ArchiveProperties();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getDeviceName()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getBusType()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_BusType();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getDeviceDir <em>Device Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Dir</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getDeviceDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_DeviceDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codegen Dir</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getCodegenDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_CodegenDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet Dir</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getSpreadsheetDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_SpreadsheetDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Dir</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getGeneratedDir()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_GeneratedDir();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor DB Only</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#isMonitorDBOnly()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_MonitorDBOnly();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Alt</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#isGenerateAlt()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EAttribute getDeviceModel_GenerateAlt();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.DeviceModel#getToArchiveIndex <em>To Archive Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Archive Index</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getToArchiveIndex()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToArchiveIndex();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.DeviceModel#getToContPoints <em>To Cont Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Cont Points</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getToContPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToContPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.DeviceModel#getToMoniPoints <em>To Moni Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Moni Points</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getToMoniPoints()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToMoniPoints();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.DeviceModel#getToEndOfGeneration <em>To End Of Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To End Of Generation</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getToEndOfGeneration()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToEndOfGeneration();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.DeviceModel#getToArchivProp <em>To Archiv Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Archiv Prop</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getToArchivProp()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToArchivProp();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.DeviceModel#getToInfFromSpread <em>To Inf From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Inf From Spread</em>'.
	 * @see alma.Control.datamodel.meta.base.DeviceModel#getToInfFromSpread()
	 * @see #getDeviceModel()
	 * @generated
	 */
	EReference getDeviceModel_ToInfFromSpread();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.MonitorPoint <em>Monitor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor Point</em>'.
	 * @see alma.Control.datamodel.meta.base.MonitorPoint
	 * @generated
	 */
	EClass getMonitorPoint();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MonitorPoint#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see alma.Control.datamodel.meta.base.MonitorPoint#getAux()
	 * @see #getMonitorPoint()
	 * @generated
	 */
	EAttribute getMonitorPoint_Aux();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromAPSpread <em>To Info From AP Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info From AP Spread</em>'.
	 * @see alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromAPSpread()
	 * @see #getMonitorPoint()
	 * @generated
	 */
	EReference getMonitorPoint_ToInfoFromAPSpread();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromMPSpread <em>To Info From MP Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info From MP Spread</em>'.
	 * @see alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromMPSpread()
	 * @see #getMonitorPoint()
	 * @generated
	 */
	EReference getMonitorPoint_ToInfoFromMPSpread();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.ControlPoint <em>Control Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Point</em>'.
	 * @see alma.Control.datamodel.meta.base.ControlPoint
	 * @generated
	 */
	EClass getControlPoint();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.ControlPoint#getToArchOnUseControl <em>To Arch On Use Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Arch On Use Control</em>'.
	 * @see alma.Control.datamodel.meta.base.ControlPoint#getToArchOnUseControl()
	 * @see #getControlPoint()
	 * @generated
	 */
	EReference getControlPoint_ToArchOnUseControl();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.ControlPoint#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see alma.Control.datamodel.meta.base.ControlPoint#getAux()
	 * @see #getControlPoint()
	 * @generated
	 */
	EAttribute getControlPoint_Aux();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see alma.Control.datamodel.meta.base.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getDepChar <em>Dep Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Char</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getDepChar()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_DepChar();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Celsius To Kelvin</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getCelsiusToKelvin()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_CelsiusToKelvin();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getSheetNames <em>Sheet Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Names</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getSheetNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_SheetNames();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getColNames <em>Col Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Names</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getColNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ColNames();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getTagNames <em>Tag Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Names</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getTagNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TagNames();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToCPP <em>To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CPP</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCPP();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToIDL <em>To IDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To IDL</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToIDL()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToIDL();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToIDLSeq <em>To IDL Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To IDL Seq</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToIDLSeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToIDLSeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToCORBA <em>To CORBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToCORBA()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBA();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToCORBASeq <em>To CORBA Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA Seq</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToCORBASeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBASeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To CORBA Dev IO</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToCORBADevIO()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToCORBADevIO();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToBACI <em>To BACI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To BACI</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToBACI()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToBACI();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getToDatabase <em>To Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Database</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getToDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ToDatabase();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getRawToCPP <em>Raw To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw To CPP</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getRawToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawToCPP();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw To Byte Swapped</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getRawToByteSwapped()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawToByteSwapped();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getRawBytes <em>Raw Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Bytes</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getRawBytes()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RawBytes();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToCPP <em>World To CPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CPP</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToCPP()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCPP();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToIDL <em>World To IDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To IDL</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToIDL()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToIDL();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To IDL Seq</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToIDLSeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToIDLSeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBA <em>World To CORBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToCORBA()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBA();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA Seq</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToCORBASeq()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBASeq();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To CORBA Dev IO</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToCORBADevIO()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToCORBADevIO();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToBACI <em>World To BACI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To BACI</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToBACI()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToBACI();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToJava <em>World To Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To Java</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToJava()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToJava();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Table#getWorldToDatabase <em>World To Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World To Database</em>'.
	 * @see alma.Control.datamodel.meta.base.Table#getWorldToDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WorldToDatabase();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.MandCBase <em>Mand CBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mand CBase</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase
	 * @generated
	 */
	EClass getMandCBase();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreadsheet Name</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getSpreadsheetName()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_SpreadsheetName();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getSheetName <em>Sheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Name</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getSheetName()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_SheetName();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getRow()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getParentRow <em>Parent Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Row</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getParentRow()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_ParentRow();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getSheet()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getParent()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Parent();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getArchive()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Archive();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependents</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getDependents()
	 * @see #getMandCBase()
	 * @generated
	 */
	EAttribute getMandCBase_Dependents();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MandCBase#getSetInfFromSpread <em>Set Inf From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Inf From Spread</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getSetInfFromSpread()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_SetInfFromSpread();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MandCBase#getToCommonInf <em>To Common Inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Common Inf</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getToCommonInf()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_ToCommonInf();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MandCBase#getToMPorCP <em>To MPor CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To MPor CP</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getToMPorCP()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_ToMPorCP();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MandCBase#getToSheetMP <em>To Sheet MP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Sheet MP</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase#getToSheetMP()
	 * @see #getMandCBase()
	 * @generated
	 */
	EReference getMandCBase_ToSheetMP();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.ArchiveProperty <em>Archive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Property</em>'.
	 * @see alma.Control.datamodel.meta.base.ArchiveProperty
	 * @generated
	 */
	EClass getArchiveProperty();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.ArchiveProperty#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.Control.datamodel.meta.base.ArchiveProperty#getRow()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.ArchiveProperty#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.Control.datamodel.meta.base.ArchiveProperty#getSheet()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.ArchiveProperty#getMp <em>Mp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp</em>'.
	 * @see alma.Control.datamodel.meta.base.ArchiveProperty#getMp()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Mp();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.ArchiveProperty#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see alma.Control.datamodel.meta.base.ArchiveProperty#getCp()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EAttribute getArchiveProperty_Cp();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.ArchiveProperty#getToColumnsInfoOfArchi <em>To Columns Info Of Archi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Columns Info Of Archi</em>'.
	 * @see alma.Control.datamodel.meta.base.ArchiveProperty#getToColumnsInfoOfArchi()
	 * @see #getArchiveProperty()
	 * @generated
	 */
	EReference getArchiveProperty_ToColumnsInfoOfArchi();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see alma.Control.datamodel.meta.base.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Note#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see alma.Control.datamodel.meta.base.Note#getNote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Note();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator <em>Spreadsheet Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Validator</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetValidator
	 * @generated
	 */
	EClass getSpreadsheetValidator();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getSeh <em>Seh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seh</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetValidator#getSeh()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_Seh();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error List</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorList()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_ErrorList();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getSehTmp <em>Seh Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seh Tmp</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetValidator#getSehTmp()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EAttribute getSpreadsheetValidator_SehTmp();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Handler</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorHandler()
	 * @see #getSpreadsheetValidator()
	 * @generated
	 */
	EReference getSpreadsheetValidator_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.SpreadsheetParser <em>Spreadsheet Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Parser</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser
	 * @generated
	 */
	EClass getSpreadsheetParser();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Path</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#getRefPath()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_RefPath();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Status</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#isRefStatus()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_RefStatus();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#getXml()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Xml();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd File</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#getXsdFile()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_XsdFile();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#getNewline <em>Newline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newline</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#getNewline()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EAttribute getSpreadsheetParser_Newline();

	/**
	 * Returns the meta object for the containment reference '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#getToNewContent <em>To New Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To New Content</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#getToNewContent()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EReference getSpreadsheetParser_ToNewContent();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.SpreadsheetParser#getTovalidateSpreads <em>Tovalidate Spreads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tovalidate Spreads</em>'.
	 * @see alma.Control.datamodel.meta.base.SpreadsheetParser#getTovalidateSpreads()
	 * @see #getSpreadsheetParser()
	 * @generated
	 */
	EReference getSpreadsheetParser_TovalidateSpreads();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.Util <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Util</em>'.
	 * @see alma.Control.datamodel.meta.base.Util
	 * @generated
	 */
	EClass getUtil();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Util#getNewline <em>Newline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newline</em>'.
	 * @see alma.Control.datamodel.meta.base.Util#getNewline()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_Newline();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Util#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux</em>'.
	 * @see alma.Control.datamodel.meta.base.Util#getAux()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_Aux();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Util#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see alma.Control.datamodel.meta.base.Util#getMaxLength()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Util#getMONTH <em>MONTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MONTH</em>'.
	 * @see alma.Control.datamodel.meta.base.Util#getMONTH()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MONTH();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Util#getMONTHalt <em>MONT Halt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MONT Halt</em>'.
	 * @see alma.Control.datamodel.meta.base.Util#getMONTHalt()
	 * @see #getUtil()
	 * @generated
	 */
	EAttribute getUtil_MONTHalt();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.Util#getToRawBytes <em>To Raw Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Raw Bytes</em>'.
	 * @see alma.Control.datamodel.meta.base.Util#getToRawBytes()
	 * @see #getUtil()
	 * @generated
	 */
	EReference getUtil_ToRawBytes();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see alma.Control.datamodel.meta.base.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Pair#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see alma.Control.datamodel.meta.base.Pair#getContent()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Content();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.Pair#getNewString <em>New String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New String</em>'.
	 * @see alma.Control.datamodel.meta.base.Pair#getNewString()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_NewString();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.SimpleErrorHandler <em>Simple Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Error Handler</em>'.
	 * @see alma.Control.datamodel.meta.base.SimpleErrorHandler
	 * @generated
	 */
	EClass getSimpleErrorHandler();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.SimpleErrorHandler#isErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see alma.Control.datamodel.meta.base.SimpleErrorHandler#isErrors()
	 * @see #getSimpleErrorHandler()
	 * @generated
	 */
	EAttribute getSimpleErrorHandler_Errors();

	/**
	 * Returns the meta object for class '{@link alma.Control.datamodel.meta.base.MainBase <em>Main Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Base</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase
	 * @generated
	 */
	EClass getMainBase();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MainBase#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase#getRow()
	 * @see #getMainBase()
	 * @generated
	 */
	EAttribute getMainBase_Row();

	/**
	 * Returns the meta object for the attribute '{@link alma.Control.datamodel.meta.base.MainBase#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase#getSheet()
	 * @see #getMainBase()
	 * @generated
	 */
	EAttribute getMainBase_Sheet();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MainBase#getToImplement <em>To Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Implement</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase#getToImplement()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_ToImplement();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MainBase#getToConvertInfo <em>To Convert Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Convert Info</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase#getToConvertInfo()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_ToConvertInfo();

	/**
	 * Returns the meta object for the reference '{@link alma.Control.datamodel.meta.base.MainBase#getToInfoFromSpread <em>To Info From Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Info From Spread</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase#getToInfoFromSpread()
	 * @see #getMainBase()
	 * @generated
	 */
	EReference getMainBase_ToInfoFromSpread();

	/**
	 * Returns the meta object for data type '{@link alma.Control.datamodel.meta.base.SimpleErrorHandler <em>Simple Error Handler DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Error Handler DT</em>'.
	 * @see alma.Control.datamodel.meta.base.SimpleErrorHandler
	 * @model instanceClass="alma.Control.datamodel.meta.base.SimpleErrorHandler"
	 * @generated
	 */
	EDataType getSimpleErrorHandlerDT();

	/**
	 * Returns the meta object for data type '{@link alma.Control.datamodel.meta.base.MandCBase <em>Mand CBase DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mand CBase DT</em>'.
	 * @see alma.Control.datamodel.meta.base.MandCBase
	 * @model instanceClass="alma.Control.datamodel.meta.base.MandCBase" serializeable="false"
	 * @generated
	 */
	EDataType getMandCBaseDT();

	/**
	 * Returns the meta object for data type '{@link alma.Control.datamodel.meta.base.MainBase <em>Main Base DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Main Base DT</em>'.
	 * @see alma.Control.datamodel.meta.base.MainBase
	 * @model instanceClass="alma.Control.datamodel.meta.base.MainBase" serializeable="false"
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
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl <em>Device Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.DeviceModelImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getDeviceModel()
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
		 * The meta object literal for the '<em><b>To Archive Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_ARCHIVE_INDEX = eINSTANCE.getDeviceModel_ToArchiveIndex();

		/**
		 * The meta object literal for the '<em><b>To Cont Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_CONT_POINTS = eINSTANCE.getDeviceModel_ToContPoints();

		/**
		 * The meta object literal for the '<em><b>To Moni Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_MONI_POINTS = eINSTANCE.getDeviceModel_ToMoniPoints();

		/**
		 * The meta object literal for the '<em><b>To End Of Generation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_END_OF_GENERATION = eINSTANCE.getDeviceModel_ToEndOfGeneration();

		/**
		 * The meta object literal for the '<em><b>To Archiv Prop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_ARCHIV_PROP = eINSTANCE.getDeviceModel_ToArchivProp();

		/**
		 * The meta object literal for the '<em><b>To Inf From Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MODEL__TO_INF_FROM_SPREAD = eINSTANCE.getDeviceModel_ToInfFromSpread();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.MonitorPointImpl <em>Monitor Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.MonitorPointImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMonitorPoint()
		 * @generated
		 */
		EClass MONITOR_POINT = eINSTANCE.getMonitorPoint();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR_POINT__AUX = eINSTANCE.getMonitorPoint_Aux();

		/**
		 * The meta object literal for the '<em><b>To Info From AP Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_POINT__TO_INFO_FROM_AP_SPREAD = eINSTANCE.getMonitorPoint_ToInfoFromAPSpread();

		/**
		 * The meta object literal for the '<em><b>To Info From MP Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_POINT__TO_INFO_FROM_MP_SPREAD = eINSTANCE.getMonitorPoint_ToInfoFromMPSpread();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.ControlPointImpl <em>Control Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.ControlPointImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getControlPoint()
		 * @generated
		 */
		EClass CONTROL_POINT = eINSTANCE.getControlPoint();

		/**
		 * The meta object literal for the '<em><b>To Arch On Use Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_POINT__TO_ARCH_ON_USE_CONTROL = eINSTANCE.getControlPoint_ToArchOnUseControl();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_POINT__AUX = eINSTANCE.getControlPoint_Aux();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.TableImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getTable()
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
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl <em>Mand CBase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.MandCBaseImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMandCBase()
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
		 * The meta object literal for the '<em><b>To Common Inf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__TO_COMMON_INF = eINSTANCE.getMandCBase_ToCommonInf();

		/**
		 * The meta object literal for the '<em><b>To MPor CP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__TO_MPOR_CP = eINSTANCE.getMandCBase_ToMPorCP();

		/**
		 * The meta object literal for the '<em><b>To Sheet MP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAND_CBASE__TO_SHEET_MP = eINSTANCE.getMandCBase_ToSheetMP();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl <em>Archive Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getArchiveProperty()
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
		 * The meta object literal for the '<em><b>To Columns Info Of Archi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE_PROPERTY__TO_COLUMNS_INFO_OF_ARCHI = eINSTANCE.getArchiveProperty_ToColumnsInfoOfArchi();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.NoteImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getNote()
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
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.SpreadsheetValidatorImpl <em>Spreadsheet Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.SpreadsheetValidatorImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetValidator()
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
		 * The meta object literal for the '<em><b>Error Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_VALIDATOR__ERROR_HANDLER = eINSTANCE.getSpreadsheetValidator_ErrorHandler();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl <em>Spreadsheet Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSpreadsheetParser()
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
		 * The meta object literal for the '<em><b>To New Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_PARSER__TO_NEW_CONTENT = eINSTANCE.getSpreadsheetParser_ToNewContent();

		/**
		 * The meta object literal for the '<em><b>Tovalidate Spreads</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_PARSER__TOVALIDATE_SPREADS = eINSTANCE.getSpreadsheetParser_TovalidateSpreads();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.UtilImpl <em>Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.UtilImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getUtil()
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
		 * The meta object literal for the '<em><b>Aux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTIL__AUX = eINSTANCE.getUtil_Aux();

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
		 * The meta object literal for the '<em><b>To Raw Bytes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTIL__TO_RAW_BYTES = eINSTANCE.getUtil_ToRawBytes();

		/**
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.PairImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getPair()
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
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.SimpleErrorHandlerImpl <em>Simple Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.SimpleErrorHandlerImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandler()
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
		 * The meta object literal for the '{@link alma.Control.datamodel.meta.base.impl.MainBaseImpl <em>Main Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.MainBaseImpl
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMainBase()
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
		 * The meta object literal for the '<em><b>To Implement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__TO_IMPLEMENT = eINSTANCE.getMainBase_ToImplement();

		/**
		 * The meta object literal for the '<em><b>To Convert Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__TO_CONVERT_INFO = eINSTANCE.getMainBase_ToConvertInfo();

		/**
		 * The meta object literal for the '<em><b>To Info From Spread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BASE__TO_INFO_FROM_SPREAD = eINSTANCE.getMainBase_ToInfoFromSpread();

		/**
		 * The meta object literal for the '<em>Simple Error Handler DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.SimpleErrorHandler
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSimpleErrorHandlerDT()
		 * @generated
		 */
		EDataType SIMPLE_ERROR_HANDLER_DT = eINSTANCE.getSimpleErrorHandlerDT();

		/**
		 * The meta object literal for the '<em>Mand CBase DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.MandCBase
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMandCBaseDT()
		 * @generated
		 */
		EDataType MAND_CBASE_DT = eINSTANCE.getMandCBaseDT();

		/**
		 * The meta object literal for the '<em>Main Base DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.MainBase
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getMainBaseDT()
		 * @generated
		 */
		EDataType MAIN_BASE_DT = eINSTANCE.getMainBaseDT();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getHashtable()
		 * @generated
		 */
		EDataType HASHTABLE = eINSTANCE.getHashtable();

		/**
		 * The meta object literal for the '<em>Error Handler DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml.sax.ErrorHandler
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getErrorHandlerDT()
		 * @generated
		 */
		EDataType ERROR_HANDLER_DT = eINSTANCE.getErrorHandlerDT();

		/**
		 * The meta object literal for the '<em>SAX Parse Exception DT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml.sax.SAXParseException
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getSAXParseExceptionDT()
		 * @generated
		 */
		EDataType SAX_PARSE_EXCEPTION_DT = eINSTANCE.getSAXParseExceptionDT();

		/**
		 * The meta object literal for the '<em>EString Array3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray3()
		 * @generated
		 */
		EDataType ESTRING_ARRAY3 = eINSTANCE.getEStringArray3();

		/**
		 * The meta object literal for the '<em>EString Array2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray2()
		 * @generated
		 */
		EDataType ESTRING_ARRAY2 = eINSTANCE.getEStringArray2();

		/**
		 * The meta object literal for the '<em>EString Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alma.Control.datamodel.meta.base.impl.BasePackageImpl#getEStringArray()
		 * @generated
		 */
		EDataType ESTRING_ARRAY = eINSTANCE.getEStringArray();

	}

} //BasePackage