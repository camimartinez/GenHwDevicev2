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
package alma.Control.datamodel.meta.amb.impl;

import alma.Control.datamodel.meta.amb.AmbFactory;
import alma.Control.datamodel.meta.amb.AmbPackage;
import alma.Control.datamodel.meta.amb.Archive;
import alma.Control.datamodel.meta.amb.Control;
import alma.Control.datamodel.meta.amb.DeviceModel;
import alma.Control.datamodel.meta.amb.GenericMonitorPoints;
import alma.Control.datamodel.meta.amb.Main;
import alma.Control.datamodel.meta.amb.MandC;
import alma.Control.datamodel.meta.amb.Monitor;
import alma.Control.datamodel.meta.amb.SWModule;

import alma.Control.datamodel.meta.base.BaseFactory;
import alma.Control.datamodel.meta.base.BasePackage;

import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;
import alma.Control.datamodel.meta.base.impl.BasePackageImpl;

import alma.Control.datamodel.meta.eth.EthPackage;

import alma.Control.datamodel.meta.eth.impl.EthPackageImpl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmbPackageImpl extends EPackageImpl implements AmbPackage {
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
	private EClass swModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericMonitorPointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAuxClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mandCAMBDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseFactoryImpDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseFactoryDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iteratorDTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceDTEDataType = null;

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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AmbPackageImpl() {
		super(eNS_URI, AmbFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AmbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AmbPackage init() {
		if (isInited) return (AmbPackage)EPackage.Registry.INSTANCE.getEPackage(AmbPackage.eNS_URI);

		// Obtain or create and register package
		AmbPackageImpl theAmbPackage = (AmbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AmbPackageImpl());

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
	public EAttribute getArchive_BaseFacTmp() {
		return (EAttribute)archiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchive_GetAssemblyColumn() {
		return (EReference)archiveEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getControl_Tmp() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Tmp2() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Aux2() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_WorldToDataColumns() {
		return (EReference)controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_GetInfoControlSheet() {
		return (EReference)controlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_ToNormalizeNumber() {
		return (EReference)controlEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getDeviceModel_Tmp() {
		return (EAttribute)deviceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToAddCP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetNoteFromMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToAddMP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetInfoMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetCPfromControl() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetInfoFromMainSheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetMPfromMonitor() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetDataFromSpread() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetAPfromArchive() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToinstallEndGeneration() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetFromSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToValidateSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetGenericMP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(13);
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
	public EAttribute getMain_Tmp() {
		return (EAttribute)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_GetInfoFromMain() {
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
	public EAttribute getMandC_Mcp() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandC_Amask() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandC_Aux() {
		return (EAttribute)mandCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_GetInfoSheet() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_GetDataFromMain() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_IsMPDataType() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_IsCPDataType() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_UtilsToData() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getMonitor_Aux7() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Mac() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Aux2() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Aux3() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_ToNormalizeData() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_GetColumnsCanBeInv() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_GetInfoMPSheet() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSWModule() {
		return swModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSWModule_AssemblyName() {
		return (EAttribute)swModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EAttribute getSWModule_Aux5() {
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
	public EClass getResourceAuxClass() {
		return resourceAuxClassEClass;
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
		archiveEClass = createEClass(ARCHIVE);
		createEAttribute(archiveEClass, ARCHIVE__BASE_FAC_TMP);
		createEReference(archiveEClass, ARCHIVE__GET_ASSEMBLY_COLUMN);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__MAC);
		createEAttribute(controlEClass, CONTROL__TMP);
		createEAttribute(controlEClass, CONTROL__TMP2);
		createEAttribute(controlEClass, CONTROL__AUX2);
		createEReference(controlEClass, CONTROL__WORLD_TO_DATA_COLUMNS);
		createEReference(controlEClass, CONTROL__GET_INFO_CONTROL_SHEET);
		createEReference(controlEClass, CONTROL__TO_NORMALIZE_NUMBER);

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

		mainEClass = createEClass(MAIN);
		createEAttribute(mainEClass, MAIN__TMP);
		createEReference(mainEClass, MAIN__GET_INFO_FROM_MAIN);

		mandCEClass = createEClass(MAND_C);
		createEAttribute(mandCEClass, MAND_C__ROW);
		createEAttribute(mandCEClass, MAND_C__SHEET);
		createEAttribute(mandCEClass, MAND_C__MCP);
		createEAttribute(mandCEClass, MAND_C__AMASK);
		createEAttribute(mandCEClass, MAND_C__AUX);
		createEReference(mandCEClass, MAND_C__GET_INFO_SHEET);
		createEReference(mandCEClass, MAND_C__GET_DATA_FROM_MAIN);
		createEReference(mandCEClass, MAND_C__IS_MP_DATA_TYPE);
		createEReference(mandCEClass, MAND_C__IS_CP_DATA_TYPE);
		createEReference(mandCEClass, MAND_C__UTILS_TO_DATA);

		monitorEClass = createEClass(MONITOR);
		createEAttribute(monitorEClass, MONITOR__AUX7);
		createEAttribute(monitorEClass, MONITOR__MAC);
		createEAttribute(monitorEClass, MONITOR__AUX2);
		createEAttribute(monitorEClass, MONITOR__AUX3);
		createEReference(monitorEClass, MONITOR__TO_NORMALIZE_DATA);
		createEReference(monitorEClass, MONITOR__GET_COLUMNS_CAN_BE_INV);
		createEReference(monitorEClass, MONITOR__GET_INFO_MP_SHEET);

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
		createEAttribute(swModuleEClass, SW_MODULE__AUX5);
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

		resourceAuxClassEClass = createEClass(RESOURCE_AUX_CLASS);

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
		archiveEClass.getESuperTypes().add(theBasePackage.getArchiveProperty());
		controlEClass.getESuperTypes().add(theBasePackage.getControlPoint());
		deviceModelEClass.getESuperTypes().add(theBasePackage.getDeviceModel());
		mainEClass.getESuperTypes().add(theBasePackage.getMainBase());
		monitorEClass.getESuperTypes().add(theBasePackage.getMonitorPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(archiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchive_BaseFacTmp(), this.getBaseFactoryImpDT(), "baseFacTmp", null, 0, 1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchive_GetAssemblyColumn(), theBasePackage.getTable(), null, "getAssemblyColumn", null, 0, 1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(archiveEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archiveEClass, ecorePackage.getEBoolean(), "isIntervalTE", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archiveEClass, ecorePackage.getEString(), "Interval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Mac(), this.getMandCAMBDT(), "mac", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Tmp(), this.getBaseFactoryDT(), "tmp", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Tmp2(), this.getBaseFactoryImpDT(), "tmp2", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Aux2(), ecorePackage.getEResource(), "aux2", null, 0, 1, Control.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_WorldToDataColumns(), theBasePackage.getTable(), null, "worldToDataColumns", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_GetInfoControlSheet(), this.getMandC(), null, "getInfoControlSheet", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_ToNormalizeNumber(), theBasePackage.getUtil(), null, "toNormalizeNumber", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Data", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Returns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "MinRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "MaxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "idlReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "corbaReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "idlDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "idlSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "idlParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "corbaDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "corbaParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "cppReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "cppDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "cppParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "argList", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "argWords", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "GetDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorlDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceModel_Tmp(), this.getBaseFactoryImpDT(), "tmp", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToAddCP(), theBasePackage.getControlPoint(), null, "toAddCP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetNoteFromMain(), theBasePackage.getNote(), null, "getNoteFromMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToAddMP(), theBasePackage.getMonitorPoint(), null, "toAddMP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetInfoMain(), theBasePackage.getMainBase(), null, "getInfoMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetCPfromControl(), this.getControl(), null, "getCPfromControl", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetInfoFromMainSheet(), this.getMain(), null, "getInfoFromMainSheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetMPfromMonitor(), this.getMonitor(), null, "getMPfromMonitor", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetDataFromSpread(), theBasePackage.getTable(), null, "getDataFromSpread", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetAPfromArchive(), this.getArchive(), null, "getAPfromArchive", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMain_Tmp(), this.getBaseFactoryDT(), "tmp", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_GetInfoFromMain(), theBasePackage.getTable(), null, "getInfoFromMain", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEString(), "Parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEString(), "NodeAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEString(), "Cardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEString(), "Channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEBoolean(), "GenericMonitorPoints", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainEClass, ecorePackage.getEString(), "BaseAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCEClass, MandC.class, "MandC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandC_Row(), theBasePackage.getString1DT(), "row", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Mcp(), theBasePackage.getMandCBaseDT(), "mcp", null, 0, 1, MandC.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Amask(), theBasePackage.getString1DT(), "Amask", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Aux(), this.getBaseFactoryDT(), "aux", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_GetInfoSheet(), theBasePackage.getMandCBase(), null, "getInfoSheet", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_GetDataFromMain(), theBasePackage.getTable(), null, "getDataFromMain", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_IsMPDataType(), this.getMonitor(), null, "isMPDataType", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_IsCPDataType(), this.getControl(), null, "isCPDataType", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_UtilsToData(), theBasePackage.getUtil(), null, "utilsToData", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RawDataTypeCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataTypeCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "ScaleCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "OffsetCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "GetDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCEClass, ecorePackage.getEInt(), "findRawSubArrayIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "startOrEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitor_Aux7(), this.getBaseFactoryImpDT(), "aux7", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Mac(), this.getMandCAMBDT(), "mac", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Aux2(), this.getIteratorDT(), "aux2", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Aux3(), this.getResourceDT(), "aux3", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_ToNormalizeData(), theBasePackage.getUtil(), null, "toNormalizeData", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_GetColumnsCanBeInv(), theBasePackage.getTable(), null, "getColumnsCanBeInv", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_GetInfoMPSheet(), this.getMandC(), null, "getInfoMPSheet", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "CanBeInvalid", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isFEStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "minRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "maxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEString(), "Default", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorEClass, ecorePackage.getEBoolean(), "isPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEAttribute(getSWModule_Aux5(), this.getBaseFactoryImpDT(), "aux5", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_AddAllMP(), this.getMonitor(), null, "addAllMP", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_AddAllCP(), this.getControl(), null, "addAllCP", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(resourceAuxClassEClass, Resource.class, "ResourceAuxClass", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(mandCAMBDTEDataType, MandC.class, "MandCAMBDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseFactoryImpDTEDataType, BaseFactoryImpl.class, "BaseFactoryImpDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseFactoryDTEDataType, BaseFactory.class, "BaseFactoryDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iteratorDTEDataType, Iterator.class, "IteratorDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceDTEDataType, Resource.class, "ResourceDT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AmbPackageImpl
