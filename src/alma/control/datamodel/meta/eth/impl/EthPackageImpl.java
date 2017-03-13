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
package alma.control.datamodel.meta.eth.impl;

import alma.control.datamodel.meta.amb.AmbPackage;

import alma.control.datamodel.meta.amb.impl.AmbPackageImpl;

import alma.control.datamodel.meta.base.BasePackage;

import alma.control.datamodel.meta.base.impl.BasePackageImpl;

import alma.control.datamodel.meta.eth.Archive;
import alma.control.datamodel.meta.eth.Control;
import alma.control.datamodel.meta.eth.DeviceModel;
import alma.control.datamodel.meta.eth.EthFactory;
import alma.control.datamodel.meta.eth.EthPackage;
import alma.control.datamodel.meta.eth.Main;
import alma.control.datamodel.meta.eth.MandC;
import alma.control.datamodel.meta.eth.Monitor;

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
	 * @see alma.control.datamodel.meta.eth.EthPackage#eNS_URI
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
	public EReference getControl_Mac() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
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
	public EClass getMain() {
		return mainEClass;
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
	public EReference getMandC_Mcp() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_Tables() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandC_Utils() {
		return (EReference)mandCEClass.getEStructuralFeatures().get(5);
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
	public EReference getMonitor_Mac() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(0);
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
		createEReference(controlEClass, CONTROL__MAC);

		deviceModelEClass = createEClass(DEVICE_MODEL);

		mainEClass = createEClass(MAIN);

		mandCEClass = createEClass(MAND_C);
		createEAttribute(mandCEClass, MAND_C__ROW);
		createEAttribute(mandCEClass, MAND_C__SHEET);
		createEAttribute(mandCEClass, MAND_C__ASSEMBLY);
		createEReference(mandCEClass, MAND_C__MCP);
		createEReference(mandCEClass, MAND_C__TABLES);
		createEReference(mandCEClass, MAND_C__UTILS);

		monitorEClass = createEClass(MONITOR);
		createEReference(monitorEClass, MONITOR__MAC);
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

		EOperation op = addEOperation(archiveEClass, null, "setArchiveEth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Mac(), this.getMandC(), null, "mac", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(controlEClass, null, "setAssemblyName", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = addEOperation(controlEClass, null, "setControlEth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dirDevice", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceModelEClass, DeviceModel.class, "DeviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "CreateModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deviceModelEClass, ecorePackage.getEString(), "VendorClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(mainEClass, ecorePackage.getEString(), "VendorClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, null, "setMainEth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mandCEClass, MandC.class, "MandC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandC_Row(), theBasePackage.getEStringArray(), "row", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Sheet(), ecorePackage.getEInt(), "sheet", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandC_Assembly(), ecorePackage.getEString(), "assembly", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_Mcp(), theBasePackage.getMandCBase(), null, "mcp", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_Tables(), theBasePackage.getTable(), null, "tables", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandC_Utils(), theBasePackage.getUtil(), null, "utils", null, 0, 1, MandC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		op = addEOperation(mandCEClass, null, "setMandCEth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitor_Mac(), this.getMandC(), null, "mac", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		op = addEOperation(monitorEClass, null, "setMonitorEth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getEStringArray(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getTable(), "tables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getUtil(), "utils", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dirDevice", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EthPackageImpl
