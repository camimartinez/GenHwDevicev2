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
package alma.control.datamodel.meta.base.impl;





import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.impl.AmbPackageImpl;
import alma.control.datamodel.meta.base.ArchiveProperty;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.ControlPoint;
import alma.control.datamodel.meta.base.DeviceModel;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.Pair;
import alma.control.datamodel.meta.base.SimpleErrorHandler;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;
import alma.control.datamodel.meta.eth.EthPackage;
import alma.control.datamodel.meta.eth.impl.EthPackageImpl;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandCBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archivePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleErrorHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleErrorHandlerDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mandCBaseDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mainBaseDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashtableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType errorHandlerDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saxParseExceptionDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringArray3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringArray2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see alma.control.datamodel.meta.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AmbPackageImpl theAmbPackage = (AmbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI) instanceof AmbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI) : AmbPackage.eINSTANCE);
		EthPackageImpl theEthPackage = (EthPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EthPackage.eNS_URI) instanceof EthPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EthPackage.eNS_URI) : EthPackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theAmbPackage.createPackageContents();
		theEthPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theAmbPackage.initializePackageContents();
		theEthPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceModel() {
		return deviceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_DescriptionIndex() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_Spreadsheet() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_Main() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_Notes() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_MonitorPoints() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_ControlPoints() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_ArchiveProperties() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_DeviceName() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_BusType() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_DeviceDir() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_CodegenDir() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_SpreadsheetDir() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_GeneratedDir() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_MonitorDBOnly() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceModel_GenerateAlt() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToArchiveIndex() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToContPoints() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToMoniPoints() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToEndOfGeneration() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToArchivProp() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToInfFromSpread() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitorPoint() {
		return monitorPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorPoint_ToInfoFromAPSpread() {
		return (EReference)monitorPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorPoint_ToInfoFromMPSpread() {
		return (EReference)monitorPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlPoint() {
		return controlPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPoint_ToArchOnUseControl() {
		return (EReference)controlPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_DepChar() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_CelsiusToKelvin() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_SheetNames() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ColNames() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_TagNames() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCPP() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToIDL() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToIDLSeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCORBA() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCORBASeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCORBADevIO() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToBACI() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToDatabase() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RawToCPP() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RawToByteSwapped() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RawBytes() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCPP() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToIDL() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToIDLSeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCORBA() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCORBASeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCORBADevIO() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToBACI() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToJava() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToDatabase() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandCBase() {
		return mandCBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_SpreadsheetName() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_SheetName() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Row() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_ParentRow() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Sheet() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Parent() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Archive() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Dependents() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Table() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Util() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_SetInfFromSpread() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_ToCommonInf() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_ToMPorCP() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_ToSheetMP() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchiveProperty() {
		return archivePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchiveProperty_Row() {
		return (EAttribute)archivePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchiveProperty_Sheet() {
		return (EAttribute)archivePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchiveProperty_Mp() {
		return (EAttribute)archivePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchiveProperty_Cp() {
		return (EAttribute)archivePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchiveProperty_Table() {
		return (EAttribute)archivePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchiveProperty_ToColumnsInfoOfArchi() {
		return (EReference)archivePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Note() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadsheetValidator() {
		return spreadsheetValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetValidator_Seh() {
		return (EAttribute)spreadsheetValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetValidator_ErrorList() {
		return (EAttribute)spreadsheetValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetValidator_SehTmp() {
		return (EAttribute)spreadsheetValidatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetValidator_ErrorHandler() {
		return (EReference)spreadsheetValidatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadsheetParser() {
		return spreadsheetParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetParser_RefPath() {
		return (EAttribute)spreadsheetParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetParser_RefStatus() {
		return (EAttribute)spreadsheetParserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetParser_Xml() {
		return (EAttribute)spreadsheetParserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetParser_XsdFile() {
		return (EAttribute)spreadsheetParserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetParser_Newline() {
		return (EAttribute)spreadsheetParserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetParser_ToNewContent() {
		return (EReference)spreadsheetParserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetParser_TovalidateSpreads() {
		return (EReference)spreadsheetParserEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtil() {
		return utilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_Newline() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_Table() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_MaxLength() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_MONTH() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_MONTHalt() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_ToRawBytes() {
		return (EReference)utilEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPair_Content() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPair_NewString() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleErrorHandler() {
		return simpleErrorHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleErrorHandler_Errors() {
		return (EAttribute)simpleErrorHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainBase() {
		return mainBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainBase_Row() {
		return (EAttribute)mainBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainBase_Sheet() {
		return (EAttribute)mainBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainBase_Table() {
		return (EAttribute)mainBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainBase_Util() {
		return (EAttribute)mainBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainBase_ToImplement() {
		return (EReference)mainBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainBase_ToConvertInfo() {
		return (EReference)mainBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainBase_ToInfoFromSpread() {
		return (EReference)mainBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleErrorHandlerDT() {
		return simpleErrorHandlerDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMandCBaseDT() {
		return mandCBaseDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMainBaseDT() {
		return mainBaseDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayList() {
		return arrayListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashtable() {
		return hashtableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getErrorHandlerDT() {
		return errorHandlerDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAXParseExceptionDT() {
		return saxParseExceptionDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEStringArray3() {
		return eStringArray3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEStringArray2() {
		return eStringArray2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEStringArray() {
		return eStringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deviceModelEClass = createEClass(DEVICE_MODEL);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__DESCRIPTION_INDEX);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__SPREADSHEET);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__MAIN);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__NOTES);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__MONITOR_POINTS);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__CONTROL_POINTS);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__ARCHIVE_PROPERTIES);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__DEVICE_NAME);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__BUS_TYPE);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__DEVICE_DIR);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__CODEGEN_DIR);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__SPREADSHEET_DIR);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__GENERATED_DIR);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__MONITOR_DB_ONLY);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__GENERATE_ALT);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_ARCHIVE_INDEX);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_CONT_POINTS);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_MONI_POINTS);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_END_OF_GENERATION);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_ARCHIV_PROP);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_INF_FROM_SPREAD);

		monitorPointEClass = createEClass(MONITOR_POINT);
		createEReference(monitorPointEClass, MONITOR_POINT__TO_INFO_FROM_AP_SPREAD);
		createEReference(monitorPointEClass, MONITOR_POINT__TO_INFO_FROM_MP_SPREAD);

		controlPointEClass = createEClass(CONTROL_POINT);
		createEReference(controlPointEClass, CONTROL_POINT__TO_ARCH_ON_USE_CONTROL);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__DEP_CHAR);
		createEAttribute(tableEClass, TABLE__CELSIUS_TO_KELVIN);
		createEAttribute(tableEClass, TABLE__SHEET_NAMES);
		createEAttribute(tableEClass, TABLE__COL_NAMES);
		createEAttribute(tableEClass, TABLE__TAG_NAMES);
		createEAttribute(tableEClass, TABLE__TO_CPP);
		createEAttribute(tableEClass, TABLE__TO_IDL);
		createEAttribute(tableEClass, TABLE__TO_IDL_SEQ);
		createEAttribute(tableEClass, TABLE__TO_CORBA);
		createEAttribute(tableEClass, TABLE__TO_CORBA_SEQ);
		createEAttribute(tableEClass, TABLE__TO_CORBA_DEV_IO);
		createEAttribute(tableEClass, TABLE__TO_BACI);
		createEAttribute(tableEClass, TABLE__TO_DATABASE);
		createEAttribute(tableEClass, TABLE__RAW_TO_CPP);
		createEAttribute(tableEClass, TABLE__RAW_TO_BYTE_SWAPPED);
		createEAttribute(tableEClass, TABLE__RAW_BYTES);
		createEAttribute(tableEClass, TABLE__WORLD_TO_CPP);
		createEAttribute(tableEClass, TABLE__WORLD_TO_IDL);
		createEAttribute(tableEClass, TABLE__WORLD_TO_IDL_SEQ);
		createEAttribute(tableEClass, TABLE__WORLD_TO_CORBA);
		createEAttribute(tableEClass, TABLE__WORLD_TO_CORBA_SEQ);
		createEAttribute(tableEClass, TABLE__WORLD_TO_CORBA_DEV_IO);
		createEAttribute(tableEClass, TABLE__WORLD_TO_BACI);
		createEAttribute(tableEClass, TABLE__WORLD_TO_JAVA);
		createEAttribute(tableEClass, TABLE__WORLD_TO_DATABASE);

		mandCBaseEClass = createEClass(MAND_CBASE);
		createEAttribute(mandCBaseEClass, MAND_CBASE__SPREADSHEET_NAME);
		createEAttribute(mandCBaseEClass, MAND_CBASE__SHEET_NAME);
		createEAttribute(mandCBaseEClass, MAND_CBASE__ROW);
		createEAttribute(mandCBaseEClass, MAND_CBASE__PARENT_ROW);
		createEAttribute(mandCBaseEClass, MAND_CBASE__SHEET);
		createEAttribute(mandCBaseEClass, MAND_CBASE__PARENT);
		createEAttribute(mandCBaseEClass, MAND_CBASE__ARCHIVE);
		createEAttribute(mandCBaseEClass, MAND_CBASE__DEPENDENTS);
		createEAttribute(mandCBaseEClass, MAND_CBASE__TABLE);
		createEAttribute(mandCBaseEClass, MAND_CBASE__UTIL);
		createEReference(mandCBaseEClass, MAND_CBASE__SET_INF_FROM_SPREAD);
		createEReference(mandCBaseEClass, MAND_CBASE__TO_COMMON_INF);
		createEReference(mandCBaseEClass, MAND_CBASE__TO_MPOR_CP);
		createEReference(mandCBaseEClass, MAND_CBASE__TO_SHEET_MP);

		archivePropertyEClass = createEClass(ARCHIVE_PROPERTY);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__ROW);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__SHEET);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__MP);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__CP);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__TABLE);
		createEReference(archivePropertyEClass, ARCHIVE_PROPERTY__TO_COLUMNS_INFO_OF_ARCHI);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__NOTE);

		spreadsheetValidatorEClass = createEClass(SPREADSHEET_VALIDATOR);
		createEAttribute(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__SEH);
		createEAttribute(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__ERROR_LIST);
		createEAttribute(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__SEH_TMP);
		createEReference(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__ERROR_HANDLER);

		spreadsheetParserEClass = createEClass(SPREADSHEET_PARSER);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__REF_PATH);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__REF_STATUS);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__XML);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__XSD_FILE);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__NEWLINE);
		createEReference(spreadsheetParserEClass, SPREADSHEET_PARSER__TO_NEW_CONTENT);
		createEReference(spreadsheetParserEClass, SPREADSHEET_PARSER__TOVALIDATE_SPREADS);

		utilEClass = createEClass(UTIL);
		createEAttribute(utilEClass, UTIL__NEWLINE);
		createEAttribute(utilEClass, UTIL__TABLE);
		createEAttribute(utilEClass, UTIL__MAX_LENGTH);
		createEAttribute(utilEClass, UTIL__MONTH);
		createEAttribute(utilEClass, UTIL__MONT_HALT);
		createEReference(utilEClass, UTIL__TO_RAW_BYTES);

		pairEClass = createEClass(PAIR);
		createEAttribute(pairEClass, PAIR__CONTENT);
		createEAttribute(pairEClass, PAIR__NEW_STRING);

		simpleErrorHandlerEClass = createEClass(SIMPLE_ERROR_HANDLER);
		createEAttribute(simpleErrorHandlerEClass, SIMPLE_ERROR_HANDLER__ERRORS);

		mainBaseEClass = createEClass(MAIN_BASE);
		createEAttribute(mainBaseEClass, MAIN_BASE__ROW);
		createEAttribute(mainBaseEClass, MAIN_BASE__SHEET);
		createEAttribute(mainBaseEClass, MAIN_BASE__TABLE);
		createEAttribute(mainBaseEClass, MAIN_BASE__UTIL);
		createEReference(mainBaseEClass, MAIN_BASE__TO_IMPLEMENT);
		createEReference(mainBaseEClass, MAIN_BASE__TO_CONVERT_INFO);
		createEReference(mainBaseEClass, MAIN_BASE__TO_INFO_FROM_SPREAD);

		// Create data types
		simpleErrorHandlerDTEDataType = createEDataType(SIMPLE_ERROR_HANDLER_DT);
		mandCBaseDTEDataType = createEDataType(MAND_CBASE_DT);
		mainBaseDTEDataType = createEDataType(MAIN_BASE_DT);
		arrayListEDataType = createEDataType(ARRAY_LIST);
		hashtableEDataType = createEDataType(HASHTABLE);
		errorHandlerDTEDataType = createEDataType(ERROR_HANDLER_DT);
		saxParseExceptionDTEDataType = createEDataType(SAX_PARSE_EXCEPTION_DT);
		eStringArray3EDataType = createEDataType(ESTRING_ARRAY3);
		eStringArray2EDataType = createEDataType(ESTRING_ARRAY2);
		eStringArrayEDataType = createEDataType(ESTRING_ARRAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AmbPackage theAmbPackage = (AmbPackage)EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		monitorPointEClass.getESuperTypes().add(this.getMandCBase());
		monitorPointEClass.getESuperTypes().add(theAmbPackage.getResourceAuxClass());
		controlPointEClass.getESuperTypes().add(this.getMandCBase());
		controlPointEClass.getESuperTypes().add(theAmbPackage.getResourceAuxClass());
		mandCBaseEClass.getESuperTypes().add(theAmbPackage.getResourceAuxClass());
		archivePropertyEClass.getESuperTypes().add(theAmbPackage.getResourceAuxClass());
		pairEClass.getESuperTypes().add(this.getSpreadsheetParser());

		// Initialize classes and features; add operations and parameters
		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceModel_DescriptionIndex(), ecorePackage.getEInt(), "DescriptionIndex", "1", 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_Spreadsheet(), this.getEStringArray3(), "spreadsheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_Main(), this.getMainBaseDT(), "main", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_Notes(), ecorePackage.getEResourceSet(), "notes", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_MonitorPoints(), ecorePackage.getEResourceSet(), "monitorPoints", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_ControlPoints(), ecorePackage.getEResourceSet(), "controlPoints", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_ArchiveProperties(), ecorePackage.getEResourceSet(), "archiveProperties", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_BusType(), ecorePackage.getEString(), "busType", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_DeviceDir(), ecorePackage.getEString(), "deviceDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_CodegenDir(), ecorePackage.getEString(), "codegenDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_SpreadsheetDir(), ecorePackage.getEString(), "spreadsheetDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_GeneratedDir(), ecorePackage.getEString(), "generatedDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_MonitorDBOnly(), ecorePackage.getEBoolean(), "monitorDBOnly", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_GenerateAlt(), ecorePackage.getEBoolean(), "generateAlt", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToArchiveIndex(), this.getTable(), null, "toArchiveIndex", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToContPoints(), this.getControlPoint(), null, "toContPoints", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToMoniPoints(), this.getMonitorPoint(), null, "toMoniPoints", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToEndOfGeneration(), this.getUtil(), null, "toEndOfGeneration", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToArchivProp(), this.getArchiveProperty(), null, "toArchivProp", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToInfFromSpread(), this.getMainBase(), null, "toInfFromSpread", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CreateModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CheckConstraints", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, null, "initializeModelDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "DirPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "TheEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "checkIfFileExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "checkIfFileExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "directory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "checkIfDeviceFileExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "directory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "localFileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "checkIfTestFileExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "directory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "localFileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "checkIfCvsignoreFileExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "directory", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, ecorePackage.getEResource(), "getArchive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, this.getMonitorPoint(), "getMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, this.getControlPoint(), "getControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Extends", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "DeviceName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICD", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICDDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICDDateAsDatabaseDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICDDateAsArrayTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEResourceSet(), "Notes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEResourceSet(), "MonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEResourceSet(), "ControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEResourceSet(), "ArchiveProperty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorPointEClass, MonitorPoint.class, "MonitorPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitorPoint_ToInfoFromAPSpread(), this.getArchiveProperty(), null, "toInfoFromAPSpread", null, 0, 1, MonitorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorPoint_ToInfoFromMPSpread(), this.getTable(), null, "toInfoFromMPSpread", null, 0, 1, MonitorPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "Default", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "ErrorCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "ErrorSeverity", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "ErrorAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "APName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "RefersTo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "Interval", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "OnlyOnChange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "DisplayUnits", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "GraphMin", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "GraphMax", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "Format", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "Title", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "MPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEString(), "AltMPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "isMonitored", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "isPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "isHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "isPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlPointEClass, ControlPoint.class, "ControlPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlPoint_ToArchOnUseControl(), this.getTable(), null, "toArchOnUseControl", null, 0, 1, ControlPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEString(), "CPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEString(), "AltCPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEBoolean(), "ArchiveOnUse", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEBoolean(), "isMonitored", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_DepChar(), ecorePackage.getEString(), "DepChar", "^", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_CelsiusToKelvin(), ecorePackage.getEString(), "CelsiusToKelvin", "CelsiusToKelvin", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SheetNames(), this.getArrayList(), "sheetNames", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ColNames(), this.getArrayList(), "colNames", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TagNames(), this.getArrayList(), "tagNames", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCPP(), this.getHashtable(), "toCPP", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToIDL(), this.getHashtable(), "toIDL", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToIDLSeq(), this.getHashtable(), "toIDLSeq", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCORBA(), this.getHashtable(), "toCORBA", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCORBASeq(), this.getHashtable(), "toCORBASeq", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCORBADevIO(), this.getHashtable(), "toCORBADevIO", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToBACI(), this.getHashtable(), "toBACI", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToDatabase(), this.getHashtable(), "toDatabase", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RawToCPP(), this.getHashtable(), "rawToCPP", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RawToByteSwapped(), this.getHashtable(), "rawToByteSwapped", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RawBytes(), this.getHashtable(), "rawBytes", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCPP(), this.getHashtable(), "worldToCPP", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToIDL(), this.getHashtable(), "worldToIDL", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToIDLSeq(), this.getHashtable(), "worldToIDLSeq", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCORBA(), this.getHashtable(), "worldToCORBA", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCORBASeq(), this.getHashtable(), "worldToCORBASeq", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCORBADevIO(), this.getHashtable(), "worldToCORBADevIO", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToBACI(), this.getHashtable(), "worldToBACI", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToJava(), this.getHashtable(), "worldToJava", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToDatabase(), this.getHashtable(), "worldToDatabase", "null", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tableEClass, ecorePackage.getEInt(), "getSheetNum", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tableEClass, ecorePackage.getEInt(), "getColNum", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tableEClass, null, "addSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tableEClass, null, "addCol", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tableEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray3(), "sh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCBaseEClass, MandCBase.class, "MandCBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandCBase_SpreadsheetName(), ecorePackage.getEString(), "spreadsheetName", "Not needed", 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_SheetName(), ecorePackage.getEString(), "sheetName", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Row(), this.getEStringArray(), "row", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_ParentRow(), this.getEStringArray(), "parentRow", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Parent(), ecorePackage.getEResource(), "parent", null, 0, 1, MandCBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Archive(), ecorePackage.getEResource(), "archive", null, 0, 1, MandCBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Dependents(), ecorePackage.getEResourceSet(), "dependents", null, 0, 1, MandCBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Table(), theAmbPackage.getTableDT(), "table", "BaseFactory.eINSTANCE;", 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Util(), theAmbPackage.getUtilDT(), "util", "BaseFactory.eINSTANCE;", 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_SetInfFromSpread(), this.getUtil(), null, "setInfFromSpread", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_ToCommonInf(), this.getTable(), null, "toCommonInf", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_ToMPorCP(), this.getArchiveProperty(), null, "toMPorCP", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_ToSheetMP(), this.getMonitorPoint(), null, "toSheetMP", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, null, "addDependent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "son", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "isDependent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "hasDependents", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "FullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "Name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "getDependentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "getAltDependentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "getDependsOnName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "getAltDependsOnName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DataUnits", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "MinRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "MaxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "Mode", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "Implement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "External", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "isExternal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "isArchived", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "isImplemented", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, ecorePackage.getEString(), "dropPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "PName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "AltPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionFormatted", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionFormattedL4", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionFormattedL5", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "isMonitored", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archivePropertyEClass, ArchiveProperty.class, "ArchiveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchiveProperty_Row(), this.getEStringArray(), "row", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchiveProperty_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchiveProperty_Mp(), ecorePackage.getEResource(), "mp", null, 0, 1, ArchiveProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchiveProperty_Cp(), ecorePackage.getEResource(), "cp", null, 0, 1, ArchiveProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchiveProperty_Table(), theAmbPackage.getTableDT(), "table", "BaseFactory.eINSTANCE;", 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchiveProperty_ToColumnsInfoOfArchi(), this.getTable(), null, "toColumnsInfoOfArchi", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "isRefersTo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "isMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "isControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEResource(), "getMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEResource(), "getControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "APName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "Name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "RefersTo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "IntervalFull", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "Interval", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "OnlyOnChange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "DisplayUnits", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "GraphMin", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "GraphMax", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "Format", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "OnStartup", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "Title", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Note(), ecorePackage.getEString(), "note", "", 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(noteEClass, ecorePackage.getEString(), "Note", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(spreadsheetValidatorEClass, SpreadsheetValidator.class, "SpreadsheetValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadsheetValidator_Seh(), this.getSimpleErrorHandlerDT(), "seh", null, 0, 1, SpreadsheetValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetValidator_ErrorList(), this.getArrayList(), "errorList", null, 0, 1, SpreadsheetValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetValidator_SehTmp(), this.getErrorHandlerDT(), "sehTmp", null, 0, 1, SpreadsheetValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetValidator_ErrorHandler(), this.getSimpleErrorHandler(), null, "errorHandler", null, 0, 1, SpreadsheetValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(spreadsheetValidatorEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "xmlFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "xsdFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(spreadsheetParserEClass, SpreadsheetParser.class, "SpreadsheetParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadsheetParser_RefPath(), ecorePackage.getEString(), "refPath", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_RefStatus(), ecorePackage.getEBoolean(), "refStatus", "false", 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_Xml(), ecorePackage.getEString(), "xml", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_XsdFile(), ecorePackage.getEString(), "xsdFile", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_Newline(), ecorePackage.getEString(), "newline", "", 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetParser_ToNewContent(), this.getPair(), null, "toNewContent", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetParser_TovalidateSpreads(), this.getSpreadsheetValidator(), null, "tovalidateSpreads", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, ecorePackage.getEString(), "getSpreadsheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dirName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, this.getPair(), "getBoundedContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "beginPart1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "beginPart2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "end", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, this.getEStringArray(), "getDataCells", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(spreadsheetParserEClass, this.getEStringArray3(), "getWorksheets", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(spreadsheetParserEClass, ecorePackage.getEBoolean(), "isReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(spreadsheetParserEClass, ecorePackage.getEString(), "getReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, null, "setXSD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "xsd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, this.getEStringArray3(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, null, "deleteRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray2(), "worksheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(spreadsheetParserEClass, null, "modifyRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray2(), "worksheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "lineNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "rowName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(utilEClass, Util.class, "Util", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtil_Newline(), ecorePackage.getEString(), "newline", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_Table(), theAmbPackage.getTableDT(), "table", "BaseFactory.eINSTANCE;", 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_MaxLength(), ecorePackage.getEInt(), "maxLength", "54", 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_MONTH(), this.getEStringArray(), "MONTH", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_MONTHalt(), this.getEStringArray(), "MONTHalt", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_ToRawBytes(), this.getTable(), null, "toRawBytes", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(utilEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, null, "RemoveLinesFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dirName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "replace", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "AltName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "str", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "formatDescriptionBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "prefix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "formatDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "formatDescriptionL1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "formatDescriptionL2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "formatDescriptionL4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "formatDescriptionL5", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "descriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "decodeHTMLChars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEBoolean(), "isArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "RawDataTypeTotalBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "NumberOfItems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEInt(), "getRawDataTypeIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "toArrayTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "parseDateString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "alt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "normalizeNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "wdt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "normalizeFloat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "normalizeBoolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(utilEClass, ecorePackage.getEString(), "getInstallDir", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEString(), "toDatabaseDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pairEClass, Pair.class, "Pair", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPair_Content(), ecorePackage.getEString(), "content", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPair_NewString(), ecorePackage.getEString(), "newString", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleErrorHandlerEClass, SimpleErrorHandler.class, "SimpleErrorHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleErrorHandler_Errors(), ecorePackage.getEBoolean(), "errors", "false", 0, 1, SimpleErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(simpleErrorHandlerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSAXParseExceptionDT(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleErrorHandlerEClass, null, "fatalError", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSAXParseExceptionDT(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleErrorHandlerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSAXParseExceptionDT(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(simpleErrorHandlerEClass, ecorePackage.getEBoolean(), "areErrors", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainBaseEClass, MainBase.class, "MainBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainBase_Row(), this.getEStringArray(), "row", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainBase_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainBase_Table(), theAmbPackage.getTableDT(), "table", "BaseFactory.eINSTANCE;", 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainBase_Util(), theAmbPackage.getUtilDT(), "util", "BaseFactory.eINSTANCE;", 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainBase_ToImplement(), this.getDeviceModel(), null, "toImplement", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainBase_ToConvertInfo(), this.getUtil(), null, "toConvertInfo", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainBase_ToInfoFromSpread(), this.getTable(), null, "toInfoFromSpread", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "DeviceName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "Extends", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICD", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICDDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICDDateAsDatabaseDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICDDateAsArrayTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(simpleErrorHandlerDTEDataType, SimpleErrorHandler.class, "SimpleErrorHandlerDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mandCBaseDTEDataType, MandCBase.class, "MandCBaseDT", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mainBaseDTEDataType, MainBase.class, "MainBaseDT", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashtableEDataType, Hashtable.class, "Hashtable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(errorHandlerDTEDataType, ErrorHandler.class, "ErrorHandlerDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(saxParseExceptionDTEDataType, SAXParseException.class, "SAXParseExceptionDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringArray3EDataType, String[][][].class, "EStringArray3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringArray2EDataType, String[][].class, "EStringArray2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringArrayEDataType, String[].class, "EStringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl