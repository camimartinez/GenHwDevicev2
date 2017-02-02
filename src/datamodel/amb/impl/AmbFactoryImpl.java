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
			case AmbPackage.ARCHIVE_AMB: return createArchiveAMB();
			case AmbPackage.CONTROL_AMB: return createControlAMB();
			case AmbPackage.DEVICE_MODEL: return createDeviceModel();
			case AmbPackage.MAIN_AMB: return createMainAMB();
			case AmbPackage.MAND_CAMB: return createMandCAMB();
			case AmbPackage.MONITOR_AMB: return createMonitorAMB();
			case AmbPackage.SW_MODULE: return createSWModule();
			case AmbPackage.GENERIC_MONITOR_POINTS: return createGenericMonitorPoints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveAMB createArchiveAMB() {
		ArchiveAMBImpl archiveAMB = new ArchiveAMBImpl();
		return archiveAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB createControlAMB() {
		ControlAMBImpl controlAMB = new ControlAMBImpl();
		return controlAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModel createDeviceModel() {
		DeviceModelImpl deviceModel = new DeviceModelImpl();
		return deviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainAMB createMainAMB() {
		MainAMBImpl mainAMB = new MainAMBImpl();
		return mainAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCAMB createMandCAMB() {
		MandCAMBImpl mandCAMB = new MandCAMBImpl();
		return mandCAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB createMonitorAMB() {
		MonitorAMBImpl monitorAMB = new MonitorAMBImpl();
		return monitorAMB;
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
	public GenericMonitorPoints createGenericMonitorPoints() {
		GenericMonitorPointsImpl genericMonitorPoints = new GenericMonitorPointsImpl();
		return genericMonitorPoints;
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
