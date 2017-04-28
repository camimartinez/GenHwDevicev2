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
import org.eclipse.emf.ecore.EObject;
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
	private EClass archivePropertyEClass = null;

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
	private EClass deviceModelEClass = null;

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
	private EClass mandCBaseEClass = null;

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
	private EClass noteEClass = null;

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
	private EClass spreadsheetParserEClass = null;

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
	private EClass tableEClass = null;

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
	private EClass errorHandlerAuxClassEClass = null;

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
	private EDataType simpleErrorHandlerDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType runtimeExceptionDTEDataType = null;

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
	private EDataType eObjectDTEDataType = null;

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
	private EDataType eStringArrayEDataType = null;

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
	private EDataType eStringArray3EDataType = null;

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
	public EReference getArchiveProperty_Cp() {
		return (EReference)archivePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchiveProperty_Mp() {
		return (EReference)archivePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchiveProperty_Tables() {
		return (EReference)archivePropertyEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getDeviceModel_Container() {
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
	public EReference getDeviceModel_Main() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_Tables() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_Utils() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(17);
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
	public EReference getMainBase_Tables() {
		return (EReference)mainBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainBase_Utils() {
		return (EReference)mainBaseEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMandCBase_Container() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Dependents() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Parent() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_Archive() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_SheetName() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Row() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCBase_Sheet() {
		return (EAttribute)mandCBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_Manc() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_Tables() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCBase_Utils() {
		return (EReference)mandCBaseEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getTable_ToCPP() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToIDL() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToIDLSeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCORBA() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCORBASeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToCORBADevIO() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToBACI() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ToDatabase() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RawToCPP() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RawToByteSwapped() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_RawBytes() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCPP() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToIDL() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToIDLSeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCORBA() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCORBASeq() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToCORBADevIO() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToBACI() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToJava() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WorldToDatabase() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(23);
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
	public EAttribute getUtil_MaxLength() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_MONTH() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_MONTHalt() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_Tables() {
		return (EReference)utilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorHandlerAuxClass() {
		return errorHandlerAuxClassEClass;
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
	public EDataType getSimpleErrorHandlerDT() {
		return simpleErrorHandlerDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRuntimeExceptionDT() {
		return runtimeExceptionDTEDataType;
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
	public EDataType getEObjectDT() {
		return eObjectDTEDataType;
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
	public EDataType getEStringArray() {
		return eStringArrayEDataType;
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
	public EDataType getEStringArray3() {
		return eStringArray3EDataType;
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
		archivePropertyEClass = createEClass(ARCHIVE_PROPERTY);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__ROW);
		createEAttribute(archivePropertyEClass, ARCHIVE_PROPERTY__SHEET);
		createEReference(archivePropertyEClass, ARCHIVE_PROPERTY__CP);
		createEReference(archivePropertyEClass, ARCHIVE_PROPERTY__MP);
		createEReference(archivePropertyEClass, ARCHIVE_PROPERTY__TABLES);

		controlPointEClass = createEClass(CONTROL_POINT);

		deviceModelEClass = createEClass(DEVICE_MODEL);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__DESCRIPTION_INDEX);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__SPREADSHEET);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__CONTAINER);
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
		createEReference(deviceModelEClass, DEVICE_MODEL__MAIN);
		createEReference(deviceModelEClass, DEVICE_MODEL__TABLES);
		createEReference(deviceModelEClass, DEVICE_MODEL__UTILS);

		mainBaseEClass = createEClass(MAIN_BASE);
		createEAttribute(mainBaseEClass, MAIN_BASE__ROW);
		createEAttribute(mainBaseEClass, MAIN_BASE__SHEET);
		createEReference(mainBaseEClass, MAIN_BASE__TABLES);
		createEReference(mainBaseEClass, MAIN_BASE__UTILS);

		mandCBaseEClass = createEClass(MAND_CBASE);
		createEAttribute(mandCBaseEClass, MAND_CBASE__SPREADSHEET_NAME);
		createEAttribute(mandCBaseEClass, MAND_CBASE__CONTAINER);
		createEAttribute(mandCBaseEClass, MAND_CBASE__DEPENDENTS);
		createEAttribute(mandCBaseEClass, MAND_CBASE__PARENT);
		createEReference(mandCBaseEClass, MAND_CBASE__ARCHIVE);
		createEAttribute(mandCBaseEClass, MAND_CBASE__SHEET_NAME);
		createEAttribute(mandCBaseEClass, MAND_CBASE__ROW);
		createEAttribute(mandCBaseEClass, MAND_CBASE__SHEET);
		createEReference(mandCBaseEClass, MAND_CBASE__MANC);
		createEReference(mandCBaseEClass, MAND_CBASE__TABLES);
		createEReference(mandCBaseEClass, MAND_CBASE__UTILS);

		monitorPointEClass = createEClass(MONITOR_POINT);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__NOTE);

		pairEClass = createEClass(PAIR);
		createEAttribute(pairEClass, PAIR__CONTENT);
		createEAttribute(pairEClass, PAIR__NEW_STRING);

		simpleErrorHandlerEClass = createEClass(SIMPLE_ERROR_HANDLER);
		createEAttribute(simpleErrorHandlerEClass, SIMPLE_ERROR_HANDLER__ERRORS);

		spreadsheetParserEClass = createEClass(SPREADSHEET_PARSER);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__REF_PATH);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__REF_STATUS);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__XML);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__XSD_FILE);
		createEAttribute(spreadsheetParserEClass, SPREADSHEET_PARSER__NEWLINE);

		spreadsheetValidatorEClass = createEClass(SPREADSHEET_VALIDATOR);
		createEAttribute(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__SEH);
		createEAttribute(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__ERROR_LIST);
		createEAttribute(spreadsheetValidatorEClass, SPREADSHEET_VALIDATOR__SEH_TMP);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__DEP_CHAR);
		createEAttribute(tableEClass, TABLE__CELSIUS_TO_KELVIN);
		createEAttribute(tableEClass, TABLE__SHEET_NAMES);
		createEAttribute(tableEClass, TABLE__COL_NAMES);
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

		utilEClass = createEClass(UTIL);
		createEAttribute(utilEClass, UTIL__NEWLINE);
		createEAttribute(utilEClass, UTIL__MAX_LENGTH);
		createEAttribute(utilEClass, UTIL__MONTH);
		createEAttribute(utilEClass, UTIL__MONT_HALT);
		createEReference(utilEClass, UTIL__TABLES);

		errorHandlerAuxClassEClass = createEClass(ERROR_HANDLER_AUX_CLASS);

		// Create data types
		arrayListEDataType = createEDataType(ARRAY_LIST);
		hashtableEDataType = createEDataType(HASHTABLE);
		simpleErrorHandlerDTEDataType = createEDataType(SIMPLE_ERROR_HANDLER_DT);
		runtimeExceptionDTEDataType = createEDataType(RUNTIME_EXCEPTION_DT);
		errorHandlerDTEDataType = createEDataType(ERROR_HANDLER_DT);
		eObjectDTEDataType = createEDataType(EOBJECT_DT);
		saxParseExceptionDTEDataType = createEDataType(SAX_PARSE_EXCEPTION_DT);
		eStringArrayEDataType = createEDataType(ESTRING_ARRAY);
		eStringArray2EDataType = createEDataType(ESTRING_ARRAY2);
		eStringArray3EDataType = createEDataType(ESTRING_ARRAY3);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlPointEClass.getESuperTypes().add(this.getMandCBase());
		monitorPointEClass.getESuperTypes().add(this.getMandCBase());
		pairEClass.getESuperTypes().add(this.getSpreadsheetParser());
		simpleErrorHandlerEClass.getESuperTypes().add(this.getErrorHandlerAuxClass());

		// Initialize classes and features; add operations and parameters
		initEClass(archivePropertyEClass, ArchiveProperty.class, "ArchiveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchiveProperty_Row(), this.getEStringArray(), "row", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchiveProperty_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchiveProperty_Cp(), this.getControlPoint(), null, "cp", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchiveProperty_Mp(), this.getMonitorPoint(), null, "mp", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchiveProperty_Tables(), this.getTable(), null, "tables", null, 0, 1, ArchiveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "IsRefersTo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "IsMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEBoolean(), "IsControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "Name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archivePropertyEClass, ecorePackage.getEString(), "APName", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		EOperation op = addEOperation(archivePropertyEClass, null, "setArchiveProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlPointEClass, ControlPoint.class, "ControlPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(controlPointEClass, ecorePackage.getEString(), "CPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEString(), "AltCPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEBoolean(), "ArchiveOnUse", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlPointEClass, ecorePackage.getEBoolean(), "IsMonitored", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(controlPointEClass, null, "setControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(controlPointEClass, null, "setControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceModel_DescriptionIndex(), ecorePackage.getEInt(), "DescriptionIndex", "1", 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_Spreadsheet(), this.getEStringArray3(), "spreadsheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_Container(), ecorePackage.getEResourceSet(), "container", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_Notes(), ecorePackage.getEResource(), "notes", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_MonitorPoints(), ecorePackage.getEResource(), "monitorPoints", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_ControlPoints(), ecorePackage.getEResource(), "controlPoints", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_ArchiveProperties(), ecorePackage.getEResource(), "archiveProperties", null, 0, 1, DeviceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_BusType(), ecorePackage.getEString(), "busType", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_DeviceDir(), ecorePackage.getEString(), "deviceDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_CodegenDir(), ecorePackage.getEString(), "codegenDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_SpreadsheetDir(), ecorePackage.getEString(), "spreadsheetDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_GeneratedDir(), ecorePackage.getEString(), "generatedDir", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_MonitorDBOnly(), ecorePackage.getEBoolean(), "monitorDBOnly", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceModel_GenerateAlt(), ecorePackage.getEBoolean(), "generateAlt", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_Main(), this.getMainBase(), null, "main", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_Tables(), this.getTable(), null, "tables", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_Utils(), this.getUtil(), null, "utils", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CreateModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Extends", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "DeviceName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICD", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICDDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICDDateAsDatabaseDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "ICDDateAsArrayTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "DirPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "TheEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "checkIfFileExists", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		addEOperation(deviceModelEClass, null, "setDeviceModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainBaseEClass, MainBase.class, "MainBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainBase_Row(), this.getEStringArray(), "row", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainBase_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainBase_Tables(), this.getTable(), null, "tables", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainBase_Utils(), this.getUtil(), null, "utils", null, 0, 1, MainBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "DeviceName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "Extends", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICD", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICDDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICDDateAsDatabaseDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainBaseEClass, ecorePackage.getEString(), "ICDDateAsArrayTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainBaseEClass, null, "setMainBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainBaseEClass, null, "setMainBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCBaseEClass, MandCBase.class, "MandCBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandCBase_SpreadsheetName(), ecorePackage.getEString(), "spreadsheetName", "Not needed", 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Container(), ecorePackage.getEResourceSet(), "container", null, 0, 1, MandCBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Dependents(), ecorePackage.getEResource(), "dependents", null, 0, 1, MandCBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Parent(), this.getEObjectDT(), "parent", null, 0, 1, MandCBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_Archive(), this.getArchiveProperty(), null, "archive", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_SheetName(), ecorePackage.getEString(), "sheetName", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Row(), this.getEStringArray(), "row", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCBase_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_Manc(), this.getMandCBase(), null, "manc", null, 0, -1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_Tables(), this.getTable(), null, "tables", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCBase_Utils(), this.getUtil(), null, "utils", null, 0, 1, MandCBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, null, "addDependent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "son", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "IsDependent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "hasDependents", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "FullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "Name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "GetDependentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "GetAltDependentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "GetDependsOnName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "GetAltDependsOnName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DataUnits", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "MinRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "MaxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "Mode", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "Implement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "External", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "IsExternal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "IsArchived", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "IsImplemented", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, this.getRuntimeExceptionDT(), "dErr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRuntimeExceptionDT(), "err", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, this.getRuntimeExceptionDT(), "dErr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "err", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, ecorePackage.getEString(), "dropPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "PName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "AltPName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionFormatted", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionFormattedL4", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEString(), "DescriptionFormattedL5", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCBaseEClass, ecorePackage.getEBoolean(), "IsMonitored", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, null, "setMandCBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCBaseEClass, null, "setMandCBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorPointEClass, MonitorPoint.class, "MonitorPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "IsMonitored", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "IsPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "IsHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorPointEClass, ecorePackage.getEBoolean(), "IsPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(monitorPointEClass, null, "setMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(monitorPointEClass, null, "setMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Note(), ecorePackage.getEString(), "note", "", 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pairEClass, Pair.class, "Pair", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPair_Content(), ecorePackage.getEString(), "content", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPair_NewString(), ecorePackage.getEString(), "newString", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(pairEClass, null, "setPair", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleErrorHandlerEClass, SimpleErrorHandler.class, "SimpleErrorHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleErrorHandler_Errors(), ecorePackage.getEBoolean(), "errors", "false", 0, 1, SimpleErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(simpleErrorHandlerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSAXParseExceptionDT(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleErrorHandlerEClass, null, "fatalError", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSAXParseExceptionDT(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleErrorHandlerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSAXParseExceptionDT(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(simpleErrorHandlerEClass, ecorePackage.getEBoolean(), "areErrors", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(spreadsheetParserEClass, SpreadsheetParser.class, "SpreadsheetParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadsheetParser_RefPath(), ecorePackage.getEString(), "refPath", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_RefStatus(), ecorePackage.getEBoolean(), "refStatus", "false", 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_Xml(), ecorePackage.getEString(), "xml", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_XsdFile(), ecorePackage.getEString(), "xsdFile", null, 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetParser_Newline(), ecorePackage.getEString(), "newline", "", 0, 1, SpreadsheetParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		op = addEOperation(spreadsheetParserEClass, null, "setSpreadsheetParser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "xml", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(spreadsheetValidatorEClass, SpreadsheetValidator.class, "SpreadsheetValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadsheetValidator_Seh(), this.getSimpleErrorHandlerDT(), "seh", null, 0, 1, SpreadsheetValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetValidator_ErrorList(), this.getArrayList(), "errorList", null, 0, 1, SpreadsheetValidator.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetValidator_SehTmp(), this.getErrorHandlerDT(), "sehTmp", null, 0, 1, SpreadsheetValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(spreadsheetValidatorEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "xmlFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "xsdFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(spreadsheetValidatorEClass, null, "setSpreadsheetValidator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_DepChar(), ecorePackage.getEString(), "DepChar", "^", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_CelsiusToKelvin(), ecorePackage.getEString(), "CelsiusToKelvin", "CelsiusToKelvin", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SheetNames(), this.getArrayList(), "sheetNames", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ColNames(), this.getArrayList(), "colNames", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCPP(), this.getHashtable(), "toCPP", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToIDL(), this.getHashtable(), "toIDL", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToIDLSeq(), this.getHashtable(), "toIDLSeq", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCORBA(), this.getHashtable(), "toCORBA", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCORBASeq(), this.getHashtable(), "toCORBASeq", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToCORBADevIO(), this.getHashtable(), "toCORBADevIO", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToBACI(), this.getHashtable(), "toBACI", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ToDatabase(), this.getHashtable(), "toDatabase", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RawToCPP(), this.getHashtable(), "rawToCPP", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RawToByteSwapped(), this.getHashtable(), "rawToByteSwapped", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RawBytes(), this.getHashtable(), "rawBytes", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCPP(), this.getHashtable(), "worldToCPP", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToIDL(), this.getHashtable(), "worldToIDL", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToIDLSeq(), this.getHashtable(), "worldToIDLSeq", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCORBA(), this.getHashtable(), "worldToCORBA", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCORBASeq(), this.getHashtable(), "worldToCORBASeq", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToCORBADevIO(), this.getHashtable(), "worldToCORBADevIO", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToBACI(), this.getHashtable(), "worldToBACI", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToJava(), this.getHashtable(), "worldToJava", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WorldToDatabase(), this.getHashtable(), "worldToDatabase", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(utilEClass, Util.class, "Util", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtil_Newline(), ecorePackage.getEString(), "newline", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_MaxLength(), ecorePackage.getEInt(), "maxLength", "54", 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_MONTH(), this.getEStringArray(), "MONTH", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_MONTHalt(), this.getEStringArray(), "MONTHalt", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_Tables(), this.getTable(), null, "tables", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		op = addEOperation(utilEClass, ecorePackage.getEString(), "toDatabaseDate", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(errorHandlerAuxClassEClass, ErrorHandler.class, "ErrorHandlerAuxClass", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashtableEDataType, Hashtable.class, "Hashtable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleErrorHandlerDTEDataType, SimpleErrorHandler.class, "SimpleErrorHandlerDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(runtimeExceptionDTEDataType, RuntimeException.class, "RuntimeExceptionDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(errorHandlerDTEDataType, ErrorHandler.class, "ErrorHandlerDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eObjectDTEDataType, EObject.class, "EObjectDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(saxParseExceptionDTEDataType, SAXParseException.class, "SAXParseExceptionDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringArrayEDataType, String[].class, "EStringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringArray2EDataType, String[][].class, "EStringArray2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringArray3EDataType, String[][][].class, "EStringArray3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
