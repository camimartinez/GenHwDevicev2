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
package datamodel.amb.impl;

import datamodel.amb.AmbFactory;
import datamodel.amb.AmbPackage;
import datamodel.amb.ArchiveAMB;
import datamodel.amb.ControlAMB;
import datamodel.amb.DeviceModel;
import datamodel.amb.GenericMonitorPoints;
import datamodel.amb.MainAMB;
import datamodel.amb.MandCAMB;
import datamodel.amb.MonitorAMB;
import datamodel.amb.SWModule;

import datamodel.base.BaseFactory;
import datamodel.base.BasePackage;

import datamodel.base.impl.BaseFactoryImpl;
import datamodel.base.impl.BasePackageImpl;

import datamodel.eth.EthPackage;

import datamodel.eth.impl.EthPackageImpl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

public class MyAmbPackageImpl extends EPackageImpl implements AmbPackage {

	private EClass archiveAMBEClass = null;

	private EClass controlAMBEClass = null;

	private EClass deviceModelEClass = null;

	private EClass mainAMBEClass = null;

	private EClass mandCAMBEClass = null;

	private EClass monitorAMBEClass = null;

	private EClass swModuleEClass = null;

	private EClass genericMonitorPointsEClass = null;

	private EDataType mandCAMBDTEDataType = null;

	private EDataType baseFactoryImpDTEDataType = null;

	private EDataType baseFactoryDTEDataType = null;

	private EDataType iteratorDTEDataType = null;

	private EDataType resourceDTEDataType = null;

	private MyAmbPackageImpl() {
		super(eNS_URI, AmbFactory.eINSTANCE);
	}

	private static boolean isInited = false;

	public static AmbPackage init() {
		if (isInited) return (AmbPackage)EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI);

		// Obtain or create and register package
		AmbPackageImpl theAmbPackage = (AmbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyAmbPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		EthPackageImpl theEthPackage = (EthPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EthPackage.eNS_URI) instanceof EthPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EthPackage.eNS_URI) : EthPackage.eINSTANCE);

		// Create package meta-data objects
		theAmbPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theEthPackage.createPackageContents();

		// Initialize created meta-data
		theAmbPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theEthPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAmbPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AmbPackage.eNS_URI, theAmbPackage);
		return theAmbPackage;
	}

	public EClass getArchiveAMB() {
		return archiveAMBEClass;
	}

	public EAttribute getArchiveAMB_BaseFacTmp() {
		return (EAttribute)archiveAMBEClass.getEStructuralFeatures().get(0);
	}

	public EReference getArchiveAMB_GetAssemblyColumn() {
		return (EReference)archiveAMBEClass.getEStructuralFeatures().get(1);
	}

	public EClass getControlAMB() {
		return controlAMBEClass;
	}

	public EAttribute getControlAMB_Mac() {
		return (EAttribute)controlAMBEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getControlAMB_Tmp() {
		return (EAttribute)controlAMBEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getControlAMB_Tmp2() {
		return (EAttribute)controlAMBEClass.getEStructuralFeatures().get(2);
	}

	public EReference getControlAMB_WorldToDataColumns() {
		return (EReference)controlAMBEClass.getEStructuralFeatures().get(3);
	}

	public EReference getControlAMB_GetInfoControlSheet() {
		return (EReference)controlAMBEClass.getEStructuralFeatures().get(4);
	}

	public EReference getControlAMB_ToNormalizeNumber() {
		return (EReference)controlAMBEClass.getEStructuralFeatures().get(5);
	}

	public EClass getDeviceModel() {
		return deviceModelEClass;
	}

	public EAttribute getDeviceModel_Tmp() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDeviceModel_ToAddCP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDeviceModel_GetNoteFromMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(2);
	}

	public EReference getDeviceModel_ToAddMP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(3);
	}

	public EReference getDeviceModel_GetInfoMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(4);
	}

	public EReference getDeviceModel_GetCPfromControl() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(5);
	}

	public EReference getDeviceModel_GetInfoFromMainSheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(6);
	}

	public EReference getDeviceModel_GetMPfromMonitor() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(7);
	}

	public EReference getDeviceModel_GetDataFromSpread() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(8);
	}

	public EReference getDeviceModel_GetAPfromArchive() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(9);
	}

	public EReference getDeviceModel_ToinstallEndGeneration() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(10);
	}

	public EReference getDeviceModel_GetFromSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(11);
	}

	public EReference getDeviceModel_ToValidateSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(12);
	}

	public EReference getDeviceModel_GetGenericMP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(13);
	}

	public EClass getMainAMB() {
		return mainAMBEClass;
	}

	public EAttribute getMainAMB_Tmp() {
		return (EAttribute)mainAMBEClass.getEStructuralFeatures().get(0);
	}

	public EReference getMainAMB_GetInfoFromMain() {
		return (EReference)mainAMBEClass.getEStructuralFeatures().get(1);
	}

	public EClass getMandCAMB() {
		return mandCAMBEClass;
	}

	public EAttribute getMandCAMB_Row() {
		return (EAttribute)mandCAMBEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getMandCAMB_Sheet() {
		return (EAttribute)mandCAMBEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getMandCAMB_Mcp() {
		return (EAttribute)mandCAMBEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getMandCAMB_Mask() {
		return (EAttribute)mandCAMBEClass.getEStructuralFeatures().get(3);
	}

	public EReference getMandCAMB_GetInfoSheet() {
		return (EReference)mandCAMBEClass.getEStructuralFeatures().get(4);
	}

	public EReference getMandCAMB_GetDataFromMain() {
		return (EReference)mandCAMBEClass.getEStructuralFeatures().get(5);
	}

	public EReference getMandCAMB_IsMPDataType() {
		return (EReference)mandCAMBEClass.getEStructuralFeatures().get(6);
	}

	public EReference getMandCAMB_IsCPDataType() {
		return (EReference)mandCAMBEClass.getEStructuralFeatures().get(7);
	}

	public EReference getMandCAMB_UtilsToData() {
		return (EReference)mandCAMBEClass.getEStructuralFeatures().get(8);
	}

	public EClass getMonitorAMB() {
		return monitorAMBEClass;
	}

	public EAttribute getMonitorAMB_Aux() {
		return (EAttribute)monitorAMBEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getMonitorAMB_Mac() {
		return (EAttribute)monitorAMBEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getMonitorAMB_Aux2() {
		return (EAttribute)monitorAMBEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getMonitorAMB_Aux3() {
		return (EAttribute)monitorAMBEClass.getEStructuralFeatures().get(3);
	}

	public EReference getMonitorAMB_ToNormalizeData() {
		return (EReference)monitorAMBEClass.getEStructuralFeatures().get(4);
	}

	public EReference getMonitorAMB_GetColumnsCanBeInv() {
		return (EReference)monitorAMBEClass.getEStructuralFeatures().get(5);
	}

	public EReference getMonitorAMB_GetInfoMPSheet() {
		return (EReference)monitorAMBEClass.getEStructuralFeatures().get(6);
	}

	public EClass getSWModule() {
		return swModuleEClass;
	}


	public EAttribute getSWModule_AssemblyName() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getSWModule_DirPath() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_MainAssembly() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_OneSwModule() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_Row() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_ParentRow() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_Sheet() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_MonitorPoints() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_ControlPoints() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_ArchiveProperties() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_SimMonitorPoints() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_SimControlPoints() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_Aux() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_AddAllMP() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_AddAllCP() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_SetFormatDescriptions() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_GetSheetColumns() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericMonitorPoints() {
		return genericMonitorPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMonitorPoints_NewSpreadsheet() {
		return (EAttribute)genericMonitorPointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMonitorPoints_DeviceName() {
		return (EAttribute)genericMonitorPointsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMonitorPoints_DirLocation() {
		return (EAttribute)genericMonitorPointsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericMonitorPoints_GetTheSpreadsheet() {
		return (EReference)genericMonitorPointsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericMonitorPoints_ToValidateTheSpreadsheet() {
		return (EReference)genericMonitorPointsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericMonitorPoints_ToInstallDir() {
		return (EReference)genericMonitorPointsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMandCAMBDT() {
		return mandCAMBDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBaseFactoryImpDT() {
		return baseFactoryImpDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBaseFactoryDT() {
		return baseFactoryDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIteratorDT() {
		return iteratorDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResourceDT() {
		return resourceDTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbFactory getAmbFactory() {
		return (AmbFactory)getEFactoryInstance();
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
		archiveAMBEClass = createEClass(ARCHIVE_AMB);
		createEAttribute(archiveAMBEClass, ARCHIVE_AMB__BASE_FAC_TMP);
		createEReference(archiveAMBEClass, ARCHIVE_AMB__GET_ASSEMBLY_COLUMN);

		controlAMBEClass = createEClass(CONTROL_AMB);
		createEAttribute(controlAMBEClass, CONTROL_AMB__MAC);
		createEAttribute(controlAMBEClass, CONTROL_AMB__TMP);
		createEAttribute(controlAMBEClass, CONTROL_AMB__TMP2);
		createEReference(controlAMBEClass, CONTROL_AMB__WORLD_TO_DATA_COLUMNS);
		createEReference(controlAMBEClass, CONTROL_AMB__GET_INFO_CONTROL_SHEET);
		createEReference(controlAMBEClass, CONTROL_AMB__TO_NORMALIZE_NUMBER);

		deviceModelEClass = createEClass(DEVICE_MODEL);
		createEAttribute(deviceModelEClass, DEVICE_MODEL__TMP);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_ADD_CP);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_NOTE_FROM_MAIN);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_ADD_MP);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_INFO_MAIN);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_CPFROM_CONTROL);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_MPFROM_MONITOR);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_DATA_FROM_SPREAD);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_APFROM_ARCHIVE);
		createEReference(deviceModelEClass, DEVICE_MODEL__TOINSTALL_END_GENERATION);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_FROM_SPREADSHEET);
		createEReference(deviceModelEClass, DEVICE_MODEL__TO_VALIDATE_SPREADSHEET);
		createEReference(deviceModelEClass, DEVICE_MODEL__GET_GENERIC_MP);

		mainAMBEClass = createEClass(MAIN_AMB);
		createEAttribute(mainAMBEClass, MAIN_AMB__TMP);
		createEReference(mainAMBEClass, MAIN_AMB__GET_INFO_FROM_MAIN);

		mandCAMBEClass = createEClass(MAND_CAMB);
		createEAttribute(mandCAMBEClass, MAND_CAMB__ROW);
		createEAttribute(mandCAMBEClass, MAND_CAMB__SHEET);
		createEAttribute(mandCAMBEClass, MAND_CAMB__MCP);
		createEAttribute(mandCAMBEClass, MAND_CAMB__MASK);
		createEReference(mandCAMBEClass, MAND_CAMB__GET_INFO_SHEET);
		createEReference(mandCAMBEClass, MAND_CAMB__GET_DATA_FROM_MAIN);
		createEReference(mandCAMBEClass, MAND_CAMB__IS_MP_DATA_TYPE);
		createEReference(mandCAMBEClass, MAND_CAMB__IS_CP_DATA_TYPE);
		createEReference(mandCAMBEClass, MAND_CAMB__UTILS_TO_DATA);

		monitorAMBEClass = createEClass(MONITOR_AMB);
		createEAttribute(monitorAMBEClass, MONITOR_AMB__AUX);
		createEAttribute(monitorAMBEClass, MONITOR_AMB__MAC);
		createEAttribute(monitorAMBEClass, MONITOR_AMB__AUX2);
		createEAttribute(monitorAMBEClass, MONITOR_AMB__AUX3);
		createEReference(monitorAMBEClass, MONITOR_AMB__TO_NORMALIZE_DATA);
		createEReference(monitorAMBEClass, MONITOR_AMB__GET_COLUMNS_CAN_BE_INV);
		createEReference(monitorAMBEClass, MONITOR_AMB__GET_INFO_MP_SHEET);

		swModuleEClass = createEClass(SW_MODULE);
		createEAttribute(swModuleEClass, SW_MODULE__ASSEMBLY_NAME);
		createEAttribute(swModuleEClass, SW_MODULE__DIR_PATH);
		createEAttribute(swModuleEClass, SW_MODULE__MAIN_ASSEMBLY);
		createEAttribute(swModuleEClass, SW_MODULE__ONE_SW_MODULE);
		createEAttribute(swModuleEClass, SW_MODULE__ROW);
		createEAttribute(swModuleEClass, SW_MODULE__PARENT_ROW);
		createEAttribute(swModuleEClass, SW_MODULE__SHEET);
		createEAttribute(swModuleEClass, SW_MODULE__MONITOR_POINTS);
		createEAttribute(swModuleEClass, SW_MODULE__CONTROL_POINTS);
		createEAttribute(swModuleEClass, SW_MODULE__ARCHIVE_PROPERTIES);
		createEAttribute(swModuleEClass, SW_MODULE__SIM_MONITOR_POINTS);
		createEAttribute(swModuleEClass, SW_MODULE__SIM_CONTROL_POINTS);
		createEAttribute(swModuleEClass, SW_MODULE__AUX);
		createEReference(swModuleEClass, SW_MODULE__ADD_ALL_MP);
		createEReference(swModuleEClass, SW_MODULE__ADD_ALL_CP);
		createEReference(swModuleEClass, SW_MODULE__SET_FORMAT_DESCRIPTIONS);
		createEReference(swModuleEClass, SW_MODULE__GET_SHEET_COLUMNS);

		genericMonitorPointsEClass = createEClass(GENERIC_MONITOR_POINTS);
		createEAttribute(genericMonitorPointsEClass, GENERIC_MONITOR_POINTS__NEW_SPREADSHEET);
		createEAttribute(genericMonitorPointsEClass, GENERIC_MONITOR_POINTS__DEVICE_NAME);
		createEAttribute(genericMonitorPointsEClass, GENERIC_MONITOR_POINTS__DIR_LOCATION);
		createEReference(genericMonitorPointsEClass, GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET);
		createEReference(genericMonitorPointsEClass, GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET);
		createEReference(genericMonitorPointsEClass, GENERIC_MONITOR_POINTS__TO_INSTALL_DIR);

		// Create data types
		mandCAMBDTEDataType = createEDataType(MAND_CAMBDT);
		baseFactoryImpDTEDataType = createEDataType(BASE_FACTORY_IMP_DT);
		baseFactoryDTEDataType = createEDataType(BASE_FACTORY_DT);
		iteratorDTEDataType = createEDataType(ITERATOR_DT);
		resourceDTEDataType = createEDataType(RESOURCE_DT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		archiveAMBEClass.getESuperTypes().add(theBasePackage.getArchiveProperty());
		controlAMBEClass.getESuperTypes().add(theBasePackage.getControlPoint());
		deviceModelEClass.getESuperTypes().add(theBasePackage.getDeviceModel());
		mainAMBEClass.getESuperTypes().add(theBasePackage.getMainBase());
		monitorAMBEClass.getESuperTypes().add(theBasePackage.getMonitorPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(archiveAMBEClass, ArchiveAMB.class, "ArchiveAMB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchiveAMB_BaseFacTmp(), this.getBaseFactoryImpDT(), "baseFacTmp", null, 0, 1, ArchiveAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchiveAMB_GetAssemblyColumn(), theBasePackage.getTable(), null, "getAssemblyColumn", null, 0, 1, ArchiveAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(archiveAMBEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archiveAMBEClass, ecorePackage.getEBoolean(), "isIntervalTE", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archiveAMBEClass, ecorePackage.getEString(), "Interval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlAMBEClass, ControlAMB.class, "ControlAMB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlAMB_Mac(), this.getMandCAMBDT(), "mac", null, 0, 1, ControlAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlAMB_Tmp(), this.getBaseFactoryDT(), "tmp", null, 0, 1, ControlAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlAMB_Tmp2(), this.getBaseFactoryImpDT(), "tmp2", null, 0, 1, ControlAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlAMB_WorldToDataColumns(), theBasePackage.getTable(), null, "worldToDataColumns", null, 0, 1, ControlAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlAMB_GetInfoControlSheet(), this.getMandCAMB(), null, "getInfoControlSheet", null, 0, 1, ControlAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlAMB_ToNormalizeNumber(), theBasePackage.getUtil(), null, "toNormalizeNumber", null, 0, 1, ControlAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Data", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Returns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "MinRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "MaxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "idlReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "corbaReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "idlDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "idlSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "idlParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "corbaDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "corbaParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "cppReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "cppDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "cppParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "argList", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "argWords", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "GetDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorlDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlAMBEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceModel_Tmp(), this.getBaseFactoryImpDT(), "tmp", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToAddCP(), theBasePackage.getControlPoint(), null, "toAddCP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetNoteFromMain(), theBasePackage.getNote(), null, "getNoteFromMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToAddMP(), theBasePackage.getMonitorPoint(), null, "toAddMP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetInfoMain(), theBasePackage.getMainBase(), null, "getInfoMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetCPfromControl(), this.getControlAMB(), null, "getCPfromControl", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetInfoFromMainSheet(), this.getMainAMB(), null, "getInfoFromMainSheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetMPfromMonitor(), this.getMonitorAMB(), null, "getMPfromMonitor", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetDataFromSpread(), theBasePackage.getTable(), null, "getDataFromSpread", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetAPfromArchive(), this.getArchiveAMB(), null, "getAPfromArchive", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToinstallEndGeneration(), theBasePackage.getUtil(), null, "ToinstallEndGeneration", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetFromSpreadsheet(), theBasePackage.getSpreadsheetParser(), null, "getFromSpreadsheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToValidateSpreadsheet(), theBasePackage.getSpreadsheetValidator(), null, "toValidateSpreadsheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetGenericMP(), this.getGenericMonitorPoints(), null, "getGenericMP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "isMonitorDBOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "IsGeneratedAlt", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Cardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "NodeAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "Channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "BaseAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEBoolean(), "GenericMonitorPoints", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CreateModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "TheEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "NodeAddressInDecimal", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(deviceModelEClass, ecorePackage.getEString(), "HexToDec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainAMBEClass, MainAMB.class, "MainAMB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainAMB_Tmp(), this.getBaseFactoryDT(), "tmp", null, 0, 1, MainAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainAMB_GetInfoFromMain(), theBasePackage.getTable(), null, "getInfoFromMain", null, 0, 1, MainAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainAMBEClass, ecorePackage.getEString(), "Parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainAMBEClass, ecorePackage.getEString(), "NodeAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainAMBEClass, ecorePackage.getEString(), "Cardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainAMBEClass, ecorePackage.getEString(), "Channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainAMBEClass, ecorePackage.getEBoolean(), "GenericMonitorPoints", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainAMBEClass, ecorePackage.getEString(), "BaseAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCAMBEClass, MandCAMB.class, "MandCAMB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandCAMB_Row(), theBasePackage.getString1DT(), "row", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCAMB_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCAMB_Mcp(), theBasePackage.getMandCBaseDT(), "mcp", null, 0, 1, MandCAMB.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCAMB_Mask(), theBasePackage.getString1DT(), "mask", "\"0x01\", \"0x02\", \"0x04\", \"0x08\", \"0x10\",\"0x20\", \"0x40\", \"0x80\"", 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCAMB_GetInfoSheet(), theBasePackage.getMandCBase(), null, "getInfoSheet", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCAMB_GetDataFromMain(), theBasePackage.getTable(), null, "getDataFromMain", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCAMB_IsMPDataType(), this.getMonitorAMB(), null, "isMPDataType", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCAMB_IsCPDataType(), this.getControlAMB(), null, "isCPDataType", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCAMB_UtilsToData(), theBasePackage.getUtil(), null, "utilsToData", null, 0, 1, MandCAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RawDataTypeCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataTypeCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "ScaleCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "OffsetCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "GetDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCAMBEClass, ecorePackage.getEInt(), "findRawSubArrayIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "startOrEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCAMBEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorAMBEClass, MonitorAMB.class, "MonitorAMB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitorAMB_Aux(), this.getBaseFactoryImpDT(), "aux", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitorAMB_Mac(), this.getMandCAMBDT(), "mac", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitorAMB_Aux2(), this.getIteratorDT(), "aux2", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitorAMB_Aux3(), this.getResourceDT(), "aux3", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorAMB_ToNormalizeData(), theBasePackage.getUtil(), null, "toNormalizeData", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorAMB_GetColumnsCanBeInv(), theBasePackage.getTable(), null, "getColumnsCanBeInv", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorAMB_GetInfoMPSheet(), this.getMandCAMB(), null, "getInfoMPSheet", null, 0, 1, MonitorAMB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "CanBeInvalid", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isFEStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "minRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "maxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEString(), "Default", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorAMBEClass, ecorePackage.getEBoolean(), "isPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(swModuleEClass, SWModule.class, "SWModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSWModule_AssemblyName(), ecorePackage.getEString(), "AssemblyName", "null", 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_DirPath(), ecorePackage.getEString(), "dirPath", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_MainAssembly(), ecorePackage.getEString(), "mainAssembly", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_OneSwModule(), ecorePackage.getEBoolean(), "oneSwModule", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_Row(), theBasePackage.getString1DT(), "row", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_ParentRow(), theBasePackage.getString1DT(), "parentRow", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_MonitorPoints(), ecorePackage.getEResourceSet(), "monitorPoints", null, 0, 1, SWModule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_ControlPoints(), ecorePackage.getEResourceSet(), "controlPoints", null, 0, 1, SWModule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_ArchiveProperties(), ecorePackage.getEResourceSet(), "archiveProperties", null, 0, 1, SWModule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_SimMonitorPoints(), ecorePackage.getEResourceSet(), "simMonitorPoints", null, 0, 1, SWModule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_SimControlPoints(), ecorePackage.getEResourceSet(), "simControlPoints", null, 0, 1, SWModule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSWModule_Aux(), this.getBaseFactoryImpDT(), "aux", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_AddAllMP(), this.getMonitorAMB(), null, "addAllMP", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_AddAllCP(), this.getControlAMB(), null, "addAllCP", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_SetFormatDescriptions(), theBasePackage.getUtil(), null, "setFormatDescriptions", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_GetSheetColumns(), theBasePackage.getTable(), null, "getSheetColumns", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(swModuleEClass, null, "addMP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "mp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(swModuleEClass, null, "addCP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "cp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(swModuleEClass, null, "addAP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "ap", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "DirPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEResourceSet(), "MonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEResourceSet(), "ControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEResourceSet(), "ArchiveProperty", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEResourceSet(), "SimMonitorPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEResourceSet(), "SimControlPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Description", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "DescriptionL1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "DeviceName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Extends", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Cardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEBoolean(), "GenericMonitorPoints", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "NodeAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(swModuleEClass, ecorePackage.getEString(), "HexToDec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "NodeAddressInDecimal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "Channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "BaseAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(swModuleEClass, ecorePackage.getEString(), "SimSerialNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genericMonitorPointsEClass, GenericMonitorPoints.class, "GenericMonitorPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericMonitorPoints_NewSpreadsheet(), theBasePackage.getString3DT(), "newSpreadsheet", null, 0, 1, GenericMonitorPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericMonitorPoints_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, GenericMonitorPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericMonitorPoints_DirLocation(), ecorePackage.getEString(), "dirLocation", null, 0, 1, GenericMonitorPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericMonitorPoints_GetTheSpreadsheet(), theBasePackage.getSpreadsheetParser(), null, "getTheSpreadsheet", null, 0, 1, GenericMonitorPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericMonitorPoints_ToValidateTheSpreadsheet(), theBasePackage.getSpreadsheetValidator(), null, "toValidateTheSpreadsheet", null, 0, 1, GenericMonitorPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericMonitorPoints_ToInstallDir(), theBasePackage.getUtil(), null, "toInstallDir", null, 0, 1, GenericMonitorPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genericMonitorPointsEClass, theBasePackage.getString3DT(), "getParsedGenericSpreadsheet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(genericMonitorPointsEClass, theBasePackage.getString3DT(), "getDeviceWorksheetWithGenericPointsAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getString3DT(), "spreadsheet", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(mandCAMBDTEDataType, MandCAMB.class, "MandCAMBDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseFactoryImpDTEDataType, BaseFactoryImpl.class, "BaseFactoryImpDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseFactoryDTEDataType, BaseFactory.class, "BaseFactoryDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iteratorDTEDataType, Iterator.class, "IteratorDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceDTEDataType, Resource.class, "ResourceDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AmbPackageImpl
