/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.eth.impl;

import datamodel.eth.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EthFactoryImpl extends EFactoryImpl implements EthFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EthFactory init() {
		try {
			EthFactory theEthFactory = (EthFactory)EPackage.Registry.INSTANCE.getEFactory("http://alma.Control.datamodel.eth/1.0"); 
			if (theEthFactory != null) {
				return theEthFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EthFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthFactoryImpl() {
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
			case EthPackage.ARCHIVE_ETH: return createArchiveETH();
			case EthPackage.CONTROL_ETH: return createControlETH();
			case EthPackage.DEVICE_MODEL: return createDeviceModel();
			case EthPackage.MAIN_ETH: return createMainETH();
			case EthPackage.MAND_CETH: return createMandCETH();
			case EthPackage.MONITOR_ETH: return createMonitorETH();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EthPackage.MAND_CETHDT:
				return createMandCETHDTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EthPackage.MAND_CETHDT:
				return convertMandCETHDTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveETH createArchiveETH() {
		ArchiveETHImpl archiveETH = new ArchiveETHImpl();
		return archiveETH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlETH createControlETH() {
		ControlETHImpl controlETH = new ControlETHImpl();
		return controlETH;
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
	public MainETH createMainETH() {
		MainETHImpl mainETH = new MainETHImpl();
		return mainETH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCETH createMandCETH() {
		MandCETHImpl mandCETH = new MandCETHImpl();
		return mandCETH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorETH createMonitorETH() {
		MonitorETHImpl monitorETH = new MonitorETHImpl();
		return monitorETH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCETH createMandCETHDTFromString(EDataType eDataType, String initialValue) {
		return (MandCETH)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMandCETHDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthPackage getEthPackage() {
		return (EthPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EthPackage getPackage() {
		return EthPackage.eINSTANCE;
	}

} //EthFactoryImpl
