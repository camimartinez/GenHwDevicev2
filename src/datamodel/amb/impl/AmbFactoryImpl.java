/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.impl;

import datamodel.amb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmbFactoryImpl extends EFactoryImpl implements AmbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmbFactory init() {
		try {
			AmbFactory theAmbFactory = (AmbFactory)EPackage.Registry.INSTANCE.getEFactory("http://alma.Control.datamodel.meta.amb/1.0"); 
			if (theAmbFactory != null) {
				return theAmbFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmbPackage.ARCHIVE_IMPL: return createArchiveImpl();
			case AmbPackage.CONTROL_IMPL: return createControlImpl();
			case AmbPackage.DEVICE_MODEL_AMB: return createDeviceModelAMB();
			case AmbPackage.MAIN_IMPL: return createMainImpl();
			case AmbPackage.MAND_CIMPL: return createMandCImpl();
			case AmbPackage.MONITOR_IMPL: return createMonitorImpl();
			case AmbPackage.SW_MODULE: return createSWModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveImpl createArchiveImpl() {
		ArchiveImplImpl archiveImpl = new ArchiveImplImpl();
		return archiveImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlImpl createControlImpl() {
		ControlImplImpl controlImpl = new ControlImplImpl();
		return controlImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModelAMB createDeviceModelAMB() {
		DeviceModelAMBImpl deviceModelAMB = new DeviceModelAMBImpl();
		return deviceModelAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainImpl createMainImpl() {
		MainImplImpl mainImpl = new MainImplImpl();
		return mainImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCImpl createMandCImpl() {
		MandCImplImpl mandCImpl = new MandCImplImpl();
		return mandCImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorImpl createMonitorImpl() {
		MonitorImplImpl monitorImpl = new MonitorImplImpl();
		return monitorImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModule createSWModule() {
		SWModuleImpl swModule = new SWModuleImpl();
		return swModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbPackage getAmbPackage() {
		return (AmbPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmbPackage getPackage() {
		return AmbPackage.eINSTANCE;
	}

} //AmbFactoryImpl
