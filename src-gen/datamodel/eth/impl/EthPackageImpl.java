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
package datamodel.eth.impl;

import datamodel.amb.AmbPackage;

import datamodel.amb.impl.AmbPackageImpl;

import datamodel.base.BasePackage;

import datamodel.base.impl.BasePackageImpl;

import datamodel.eth.ArchiveETH;
import datamodel.eth.ControlETH;
import datamodel.eth.DeviceModel;
import datamodel.eth.EthFactory;
import datamodel.eth.EthPackage;
import datamodel.eth.MainETH;
import datamodel.eth.MandCETH;
import datamodel.eth.MonitorETH;

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
	private EClass archiveETHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlETHEClass = null;

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
	private EClass mainETHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandCETHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorETHEClass = null;

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
	 * @see datamodel.eth.EthPackage#eNS_URI
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
	public EClass getArchiveETH() {
		return archiveETHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlETH() {
		return controlETHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlETH_Mac() {
		return (EAttribute)controlETHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlETH_InfoControlEth() {
		return (EReference)controlETHEClass.getEStructuralFeatures().get(1);
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
	public EClass getMainETH() {
		return mainETHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainETH_Aux() {
		return (EAttribute)mainETHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainETH_ToInfoMain() {
		return (EReference)mainETHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandCETH() {
		return mandCETHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCETH_Row() {
		return (EAttribute)mandCETHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCETH_Sheet() {
		return (EAttribute)mandCETHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCETH_Assembly() {
		return (EAttribute)mandCETHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCETH_Aux() {
		return (EAttribute)mandCETHEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCETH_GetInfoFromCol() {
		return (EReference)mandCETHEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitorETH() {
		return monitorETHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitorETH_Mac() {
		return (EAttribute)monitorETHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorETH_GetInfoMPEth() {
		return (EReference)monitorETHEClass.getEStructuralFeatures().get(1);
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
		archiveETHEClass = createEClass(ARCHIVE_ETH);

		controlETHEClass = createEClass(CONTROL_ETH);
		createEAttribute(controlETHEClass, CONTROL_ETH__MAC);
		createEReference(controlETHEClass, CONTROL_ETH__INFO_CONTROL_ETH);

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

		mainETHEClass = createEClass(MAIN_ETH);
		createEAttribute(mainETHEClass, MAIN_ETH__AUX);
		createEReference(mainETHEClass, MAIN_ETH__TO_INFO_MAIN);

		mandCETHEClass = createEClass(MAND_CETH);
		createEAttribute(mandCETHEClass, MAND_CETH__ROW);
		createEAttribute(mandCETHEClass, MAND_CETH__SHEET);
		createEAttribute(mandCETHEClass, MAND_CETH__ASSEMBLY);
		createEAttribute(mandCETHEClass, MAND_CETH__AUX);
		createEReference(mandCETHEClass, MAND_CETH__GET_INFO_FROM_COL);

		monitorETHEClass = createEClass(MONITOR_ETH);
		createEAttribute(monitorETHEClass, MONITOR_ETH__MAC);
		createEReference(monitorETHEClass, MONITOR_ETH__GET_INFO_MP_ETH);

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
		archiveETHEClass.getESuperTypes().add(theBasePackage.getArchiveProperty());
		controlETHEClass.getESuperTypes().add(theBasePackage.getControlPoint());
		deviceModelEClass.getESuperTypes().add(theBasePackage.getDeviceModel());
		mainETHEClass.getESuperTypes().add(theBasePackage.getMainBase());
		monitorETHEClass.getESuperTypes().add(theBasePackage.getMonitorPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(archiveETHEClass, ArchiveETH.class, "ArchiveETH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlETHEClass, ControlETH.class, "ControlETH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlETH_Mac(), this.getMandCETHDT(), "mac", null, 0, 1, ControlETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlETH_InfoControlEth(), this.getMandCETH(), null, "infoControlEth", null, 0, 1, ControlETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(controlETHEClass, null, "setAssembly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "Address", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEBoolean(), "isEnumAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEBoolean(), "isDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEBoolean(), "isOpenArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "getArrayLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlETHEClass, ecorePackage.getEString(), "DataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceModel_InfoDevMain(), theBasePackage.getMainBase(), null, "infoDevMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_InfoControl(), this.getControlETH(), null, "infoControl", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_InfoMonitor(), this.getMonitorETH(), null, "infoMonitor", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToEndEth(), theBasePackage.getUtil(), null, "toEndEth", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_InfoArch(), this.getArchiveETH(), null, "infoArch", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_DataSpreadsheet(), theBasePackage.getTable(), null, "dataSpreadsheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_NotesTo(), theBasePackage.getNote(), null, "notesTo", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ValidateSpreadEth(), theBasePackage.getSpreadsheetValidator(), null, "validateSpreadEth", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_FromSpreadEth(), theBasePackage.getSpreadsheetParser(), null, "fromSpreadEth", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CreateModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "VendorClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainETHEClass, MainETH.class, "MainETH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainETH_Aux(), theAmbPackage.getBaseFactoryImpDT(), "aux", null, 0, 1, MainETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainETH_ToInfoMain(), theBasePackage.getTable(), null, "toInfoMain", null, 0, 1, MainETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainETHEClass, ecorePackage.getEString(), "VendorClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCETHEClass, MandCETH.class, "MandCETH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandCETH_Row(), theBasePackage.getString1DT(), "row", null, 0, 1, MandCETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCETH_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandCETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCETH_Assembly(), ecorePackage.getEString(), "assembly", null, 0, 1, MandCETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCETH_Aux(), theAmbPackage.getBaseFactoryImpDT(), "aux", null, 0, 1, MandCETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCETH_GetInfoFromCol(), theBasePackage.getTable(), null, "getInfoFromCol", null, 0, 1, MandCETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(mandCETHEClass, null, "setAssemblyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "Address", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEBoolean(), "isDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEBoolean(), "isOpenArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "getArrayLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCETHEClass, ecorePackage.getEString(), "DataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorETHEClass, MonitorETH.class, "MonitorETH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitorETH_Mac(), this.getMandCETHDT(), "mac", null, 0, 1, MonitorETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorETH_GetInfoMPEth(), this.getMandCETH(), null, "getInfoMPEth", null, 0, 1, MonitorETH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(monitorETHEClass, null, "setAssembly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "Address", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isEnumAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isOpenArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "getArrayLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEString(), "DataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isArchived", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorETHEClass, ecorePackage.getEBoolean(), "isPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(mandCETHDTEDataType, MandCETH.class, "MandCETHDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EthPackageImpl
