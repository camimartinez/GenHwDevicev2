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
package alma.Control.datamodel.meta.eth.impl;

import alma.Control.datamodel.meta.amb.AmbPackage;

import alma.Control.datamodel.meta.amb.impl.AmbPackageImpl;

import alma.Control.datamodel.meta.base.BasePackage;

import alma.Control.datamodel.meta.base.impl.BasePackageImpl;

import alma.Control.datamodel.meta.eth.Archive;
import alma.Control.datamodel.meta.eth.Control;
import alma.Control.datamodel.meta.eth.DeviceModel;
import alma.Control.datamodel.meta.eth.EthFactory;
import alma.Control.datamodel.meta.eth.EthPackage;
import alma.Control.datamodel.meta.eth.Main;
import alma.Control.datamodel.meta.eth.MandC;
import alma.Control.datamodel.meta.eth.Monitor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EthPackageImpl extends EPackageImpl implements EthPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

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
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mandCETHDTEDataType = null;

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
	 * @see alma.Control.datamodel.meta.eth.EthPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EthPackageImpl() {
		super(eNS_URI, EthFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EthPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EthPackage init() {
		if (isInited) return (EthPackage)EPackage.Registry.INSTANCE.getEPackage(EthPackage.eNS_URI);

		// Obtain or create and register package
		EthPackageImpl theEthPackage = (EthPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EthPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EthPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AmbPackageImpl theAmbPackage = (AmbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI) instanceof AmbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI) : AmbPackage.eINSTANCE);
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);

		// Create package meta-data objects
		theEthPackage.createPackageContents();
		theAmbPackage.createPackageContents();
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theEthPackage.initializePackageContents();
		theAmbPackage.initializePackageContents();
		theBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEthPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EthPackage.eNS_URI, theEthPackage);
		return theEthPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchive() {
		return archiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Mac() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Aux2() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_InfoControlEth() {
		return (EReference)controlEClass.getEStructuralFeatures().get(2);
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
	public EReference getDeviceModel_InfoDevMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_InfoControl() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_InfoMonitor() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToEndEth() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_InfoArch() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_DataSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_NotesTo() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ValidateSpreadEth() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_FromSpreadEth() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMain_Aux() {
		return (EAttribute)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_ToInfoMain() {
		return (EReference)mainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandC() {
		return mandCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandC_Row() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandC_Sheet() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandC_Assembly() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandC_Aux() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_GetInfoFromCol() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Mac() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Aux1() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_GetInfoMPEth() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMandCETHDT() {
		return mandCETHDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthFactory getEthFactory() {
		return (EthFactory)getEFactoryInstance();
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
		archiveEClass = createEClass(ARCHIVE);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__MAC);
		createEAttribute(controlEClass, CONTROL__AUX2);
		createEReference(controlEClass, CONTROL__INFO_CONTROL_ETH);

		deviceModelEClass = createEClass(DEVICE_MODEL);
		createEReference(deviceModelEClass, DEVICE_MODEL__INFO_DEV_MAIN);
		createEReference(deviceModelEClass, DEVICE_MODEL__INFO_CONTROL);
		createEReference(deviceModelEClass, DEVICE_MODEL__INFO_MONITOR);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_END_ETH);
		createEReference(deviceModelEClass, DEVICE_MODEL__INFO_ARCH);
		createEReference(deviceModelEClass, DEVICE_MODEL__DATA_SPREADSHEET);
		createEReference(deviceModelEClass, DEVICE_MODEL__NOTES_TO);
		createEReference(deviceModelEClass, DEVICE_MODEL__VALIDATE_SPREAD_ETH);
		createEReference(deviceModelEClass, DEVICE_MODEL__FROM_SPREAD_ETH);

		mainEClass = createEClass(MAIN);
		createEAttribute(mainEClass, MAIN__AUX);
		createEReference(mainEClass, MAIN__TO_INFO_MAIN);

		mandCEClass = createEClass(MAND_C);
		createEAttribute(mandCEClass, MAND_C__ROW);
		createEAttribute(mandCEClass, MAND_C__SHEET);
		createEAttribute(mandCEClass, MAND_C__ASSEMBLY);
		createEAttribute(mandCEClass, MAND_C__AUX);
		createEReference(mandCEClass, MAND_C__GET_INFO_FROM_COL);

		monitorEClass = createEClass(MONITOR);
		createEAttribute(monitorEClass, MONITOR__MAC);
		createEAttribute(monitorEClass, MONITOR__AUX1);
		createEReference(monitorEClass, MONITOR__GET_INFO_MP_ETH);

		// Create data types
		mandCETHDTEDataType = createEDataType(MAND_CETHDT);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		AmbPackage theAmbPackage = (AmbPackage)EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		archiveEClass.getESuperTypes().add(theBasePackage.getArchiveProperty());
		controlEClass.getESuperTypes().add(theBasePackage.getControlPoint());
		deviceModelEClass.getESuperTypes().add(theBasePackage.getDeviceModel());
		mainEClass.getESuperTypes().add(theBasePackage.getMainBase());
		monitorEClass.getESuperTypes().add(theBasePackage.getMonitorPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(archiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Mac(), this.getMandCETHDT(), "mac", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Aux2(), ecorePackage.getEResource(), "aux2", null, 0, 1, Control.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_InfoControlEth(), this.getMandC(), null, "infoControlEth", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(controlEClass, null, "setAssemblyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Address", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isEnumAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isOpenArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getArrayLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "DataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceModel_InfoDevMain(), theBasePackage.getMainBase(), null, "infoDevMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_InfoControl(), this.getControl(), null, "infoControl", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_InfoMonitor(), this.getMonitor(), null, "infoMonitor", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToEndEth(), theBasePackage.getUtil(), null, "toEndEth", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_InfoArch(), this.getArchive(), null, "infoArch", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_DataSpreadsheet(), theBasePackage.getTable(), null, "dataSpreadsheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_NotesTo(), theBasePackage.getNote(), null, "notesTo", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ValidateSpreadEth(), theBasePackage.getSpreadsheetValidator(), null, "validateSpreadEth", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_FromSpreadEth(), theBasePackage.getSpreadsheetParser(), null, "fromSpreadEth", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CreateModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "VendorClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMain_Aux(), theAmbPackage.getBaseFactoryImpDT(), "aux", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_ToInfoMain(), theBasePackage.getTable(), null, "toInfoMain", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEString(), "VendorClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCEClass, MandC.class, "MandC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandC_Row(), theBasePackage.getString1DT(), "row", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Assembly(), ecorePackage.getEString(), "assembly", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Aux(), theAmbPackage.getBaseFactoryImpDT(), "aux", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_GetInfoFromCol(), theBasePackage.getTable(), null, "getInfoFromCol", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(mandCEClass, null, "setAssemblyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "Address", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isOpenArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getArrayLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "DataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitor_Mac(), this.getMandCETHDT(), "mac", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Aux1(), ecorePackage.getEResource(), "aux1", null, 0, 1, Monitor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_GetInfoMPEth(), this.getMandC(), null, "getInfoMPEth", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(monitorEClass, null, "setAssemblyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "Address", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isEnumAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isOpenArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getArrayLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "DataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isArchived", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(mandCETHDTEDataType, MandC.class, "MandCETHDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EthPackageImpl
