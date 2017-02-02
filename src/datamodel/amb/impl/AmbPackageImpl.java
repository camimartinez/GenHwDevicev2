/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.impl;

import datamodel.amb.AmbFactory;
import datamodel.amb.AmbPackage;
import datamodel.amb.ArchiveImpl;
import datamodel.amb.ControlImpl;
import datamodel.amb.DeviceModel;
import datamodel.amb.GenericMonitorPoints;
import datamodel.amb.MainImpl;
import datamodel.amb.MandCImpl;
import datamodel.amb.MonitorImpl;
import datamodel.amb.SWModule;

import datamodel.base.BasePackage;

import datamodel.base.impl.BasePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class AmbPackageImpl extends EPackageImpl implements AmbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlImplEClass = null;

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
	private EClass mainImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandCImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorImplEClass = null;

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
	 * @see datamodel.amb.AmbPackage#eNS_URI
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

		// Create package meta-data objects
		theAmbPackage.createPackageContents();
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theAmbPackage.initializePackageContents();
		theBasePackage.initializePackageContents();

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
	public EClass getArchiveImpl() {
		return archiveImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchiveImpl_GetAssemblyColumn() {
		return (EReference)archiveImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlImpl() {
		return controlImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlImpl_WorldToDataColumns() {
		return (EReference)controlImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlImpl_GetInfoControlSheet() {
		return (EReference)controlImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlImpl_ToNormalizeNumber() {
		return (EReference)controlImplEClass.getEStructuralFeatures().get(2);
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
	public EReference getDeviceModel_ToAddCP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetNoteFromMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToAddMP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetInfoMain() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetCPfromControl() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetInfoFromMainSheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetMPfromMonitor() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetDataFromSpread() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetAPfromArchive() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToinstallEndGeneration() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetFromSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_ToValidateSpreadsheet() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceModel_GetGenericMP() {
		return (EReference)deviceModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainImpl() {
		return mainImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainImpl_GetInfoFromMain() {
		return (EReference)mainImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandCImpl() {
		return mandCImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCImpl_Row() {
		return (EAttribute)mandCImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCImpl_Sheet() {
		return (EAttribute)mandCImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCImpl_Mcp() {
		return (EAttribute)mandCImplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandCImpl_Mask() {
		return (EAttribute)mandCImplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCImpl_GetInfoSheet() {
		return (EReference)mandCImplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCImpl_GetDataFromMain() {
		return (EReference)mandCImplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCImpl_IsMPDataType() {
		return (EReference)mandCImplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCImpl_IsCPDataType() {
		return (EReference)mandCImplEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandCImpl_UtilsToData() {
		return (EReference)mandCImplEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitorImpl() {
		return monitorImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorImpl_ToNormalizeData() {
		return (EReference)monitorImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorImpl_GetColumnsCanBeInv() {
		return (EReference)monitorImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorImpl_GetInfoMPSheet() {
		return (EReference)monitorImplEClass.getEStructuralFeatures().get(2);
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
	public EReference getSWModule_AddAllMP() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_AddAllCP() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_SetFormatDescriptions() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModule_GetSheetColumns() {
		return (EReference)swModuleEClass.getEStructuralFeatures().get(15);
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
		archiveImplEClass = createEClass(ARCHIVE_IMPL);
		createEReference(archiveImplEClass, ARCHIVE_IMPL__GET_ASSEMBLY_COLUMN);

		controlImplEClass = createEClass(CONTROL_IMPL);
		createEReference(controlImplEClass, CONTROL_IMPL__WORLD_TO_DATA_COLUMNS);
		createEReference(controlImplEClass, CONTROL_IMPL__GET_INFO_CONTROL_SHEET);
		createEReference(controlImplEClass, CONTROL_IMPL__TO_NORMALIZE_NUMBER);

		deviceModelEClass = createEClass(DEVICE_MODEL);
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

		mainImplEClass = createEClass(MAIN_IMPL);
		createEReference(mainImplEClass, MAIN_IMPL__GET_INFO_FROM_MAIN);

		mandCImplEClass = createEClass(MAND_CIMPL);
		createEAttribute(mandCImplEClass, MAND_CIMPL__ROW);
		createEAttribute(mandCImplEClass, MAND_CIMPL__SHEET);
		createEAttribute(mandCImplEClass, MAND_CIMPL__MCP);
		createEAttribute(mandCImplEClass, MAND_CIMPL__MASK);
		createEReference(mandCImplEClass, MAND_CIMPL__GET_INFO_SHEET);
		createEReference(mandCImplEClass, MAND_CIMPL__GET_DATA_FROM_MAIN);
		createEReference(mandCImplEClass, MAND_CIMPL__IS_MP_DATA_TYPE);
		createEReference(mandCImplEClass, MAND_CIMPL__IS_CP_DATA_TYPE);
		createEReference(mandCImplEClass, MAND_CIMPL__UTILS_TO_DATA);

		monitorImplEClass = createEClass(MONITOR_IMPL);
		createEReference(monitorImplEClass, MONITOR_IMPL__TO_NORMALIZE_DATA);
		createEReference(monitorImplEClass, MONITOR_IMPL__GET_COLUMNS_CAN_BE_INV);
		createEReference(monitorImplEClass, MONITOR_IMPL__GET_INFO_MP_SHEET);

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
		archiveImplEClass.getESuperTypes().add(theBasePackage.getArchiveProperty());
		controlImplEClass.getESuperTypes().add(theBasePackage.getControlPoint());
		deviceModelEClass.getESuperTypes().add(theBasePackage.getDeviceModel());
		mainImplEClass.getESuperTypes().add(theBasePackage.getMainBase());
		monitorImplEClass.getESuperTypes().add(theBasePackage.getMonitorPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(archiveImplEClass, ArchiveImpl.class, "ArchiveImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchiveImpl_GetAssemblyColumn(), theBasePackage.getTable(), null, "getAssemblyColumn", null, 0, 1, ArchiveImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(archiveImplEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archiveImplEClass, ecorePackage.getEBoolean(), "isIntervalTE", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archiveImplEClass, ecorePackage.getEString(), "Interval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlImplEClass, ControlImpl.class, "ControlImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlImpl_WorldToDataColumns(), theBasePackage.getTable(), null, "worldToDataColumns", null, 0, 1, ControlImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlImpl_GetInfoControlSheet(), this.getMandCImpl(), null, "getInfoControlSheet", null, 0, 1, ControlImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlImpl_ToNormalizeNumber(), theBasePackage.getUtil(), null, "toNormalizeNumber", null, 0, 1, ControlImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Data", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Returns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "MinRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "MaxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "idlReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "corbaReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "idlDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "idlSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "idlParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "corbaDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "corbaParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "cppReturns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "cppDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "cppParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "argList", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "argWords", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "GetDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorlDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlImplEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceModel_ToAddCP(), theBasePackage.getControlPoint(), null, "toAddCP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetNoteFromMain(), theBasePackage.getNote(), null, "getNoteFromMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_ToAddMP(), theBasePackage.getMonitorPoint(), null, "toAddMP", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetInfoMain(), theBasePackage.getMainBase(), null, "getInfoMain", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetCPfromControl(), this.getControlImpl(), null, "getCPfromControl", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetInfoFromMainSheet(), this.getMainImpl(), null, "getInfoFromMainSheet", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetMPfromMonitor(), this.getMonitorImpl(), null, "getMPfromMonitor", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetDataFromSpread(), theBasePackage.getTable(), null, "getDataFromSpread", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceModel_GetAPfromArchive(), this.getArchiveImpl(), null, "getAPfromArchive", null, 0, 1, DeviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(mainImplEClass, MainImpl.class, "MainImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainImpl_GetInfoFromMain(), theBasePackage.getTable(), null, "getInfoFromMain", null, 0, 1, MainImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mainImplEClass, ecorePackage.getEString(), "Parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainImplEClass, ecorePackage.getEString(), "NodeAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainImplEClass, ecorePackage.getEString(), "Cardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainImplEClass, ecorePackage.getEString(), "Channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainImplEClass, ecorePackage.getEBoolean(), "GenericMonitorPoints", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mainImplEClass, ecorePackage.getEString(), "BaseAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCImplEClass, MandCImpl.class, "MandCImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandCImpl_Row(), theBasePackage.getString1DT(), "row", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCImpl_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCImpl_Mcp(), theBasePackage.getMandCBaseDT(), "mcp", null, 0, 1, MandCImpl.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandCImpl_Mask(), theBasePackage.getString1DT(), "mask", "\"0x01\", \"0x02\", \"0x04\", \"0x08\", \"0x10\",\"0x20\", \"0x40\", \"0x80\"", 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCImpl_GetInfoSheet(), theBasePackage.getMandCBase(), null, "getInfoSheet", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCImpl_GetDataFromMain(), theBasePackage.getTable(), null, "getDataFromMain", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCImpl_IsMPDataType(), this.getMonitorImpl(), null, "isMPDataType", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCImpl_IsCPDataType(), this.getControlImpl(), null, "isCPDataType", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandCImpl_UtilsToData(), theBasePackage.getUtil(), null, "utilsToData", null, 0, 1, MandCImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RawDataTypeCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataTypeCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "ScaleCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "OffsetCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "GetDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mandCImplEClass, ecorePackage.getEInt(), "findRawSubArrayIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "startOrEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mandCImplEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorImplEClass, MonitorImpl.class, "MonitorImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitorImpl_ToNormalizeData(), theBasePackage.getUtil(), null, "toNormalizeData", null, 0, 1, MonitorImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorImpl_GetColumnsCanBeInv(), theBasePackage.getTable(), null, "getColumnsCanBeInv", null, 0, 1, MonitorImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitorImpl_GetInfoMPSheet(), this.getMandCImpl(), null, "getInfoMPSheet", null, 0, 1, MonitorImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "CanBeInvalid", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isFEStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "Assembly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "RCA", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "RawDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "TeRelated", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "Scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "Offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "RawDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToCPPType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToCORBAType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToIDLSeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToIDLType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToCORBASeqType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToCORBADevIOType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToDatabaseType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToBACIType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isRawDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isWorldDataArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isSpecialConversion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "NumberItemsRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "TotalBytesRawData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "NumberRawDataTypeBytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "RCACell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "NumberItemsWorldData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "TeRelatedCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isDependentGroupBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isDependentBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isDependentElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isByteSwapped", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isDependentBitElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isDependentArrayElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isSingleBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getFirstBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getLastBit", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getGroupMask", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getGroupEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "getGroupStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "RawSubArrayEndIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "RawSubArrayStartIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isRawSubArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataToDatabaseTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "WorldDataTypeUpper1", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "minRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "maxRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEString(), "Default", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isPartOfPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(monitorImplEClass, ecorePackage.getEBoolean(), "isPartOfHomogeneous", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getSWModule_AddAllMP(), this.getMonitorImpl(), null, "addAllMP", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModule_AddAllCP(), this.getControlImpl(), null, "addAllCP", null, 0, 1, SWModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		addEOperation(swModuleEClass, null, "DescriptionAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //AmbPackageImpl
