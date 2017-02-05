/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.eth.util;

import datamodel.base.ArchiveProperty;
import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MandCBase;
import datamodel.base.MonitorPoint;

import datamodel.eth.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datamodel.eth.EthPackage
 * @generated
 */
public class EthAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EthPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EthPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthSwitch modelSwitch =
		new EthSwitch() {
			public Object caseArchiveETH(ArchiveETH object) {
				return createArchiveETHAdapter();
			}
			public Object caseControlETH(ControlETH object) {
				return createControlETHAdapter();
			}
			public Object caseDeviceModel(DeviceModel object) {
				return createDeviceModelAdapter();
			}
			public Object caseMainETH(MainETH object) {
				return createMainETHAdapter();
			}
			public Object caseMandCETH(MandCETH object) {
				return createMandCETHAdapter();
			}
			public Object caseMonitorETH(MonitorETH object) {
				return createMonitorETHAdapter();
			}
			public Object caseArchiveProperty(ArchiveProperty object) {
				return createArchivePropertyAdapter();
			}
			public Object caseMandCBase(MandCBase object) {
				return createMandCBaseAdapter();
			}
			public Object caseControlPoint(ControlPoint object) {
				return createControlPointAdapter();
			}
			public Object caseBase_DeviceModel(datamodel.base.DeviceModel object) {
				return createBase_DeviceModelAdapter();
			}
			public Object caseMainBase(MainBase object) {
				return createMainBaseAdapter();
			}
			public Object caseMonitorPoint(MonitorPoint object) {
				return createMonitorPointAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link datamodel.eth.ArchiveETH <em>Archive ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.eth.ArchiveETH
	 * @generated
	 */
	public Adapter createArchiveETHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.eth.ControlETH <em>Control ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.eth.ControlETH
	 * @generated
	 */
	public Adapter createControlETHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.eth.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.eth.DeviceModel
	 * @generated
	 */
	public Adapter createDeviceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.eth.MainETH <em>Main ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.eth.MainETH
	 * @generated
	 */
	public Adapter createMainETHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.eth.MandCETH <em>Mand CETH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.eth.MandCETH
	 * @generated
	 */
	public Adapter createMandCETHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.eth.MonitorETH <em>Monitor ETH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.eth.MonitorETH
	 * @generated
	 */
	public Adapter createMonitorETHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.ArchiveProperty <em>Archive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.ArchiveProperty
	 * @generated
	 */
	public Adapter createArchivePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.MandCBase <em>Mand CBase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.MandCBase
	 * @generated
	 */
	public Adapter createMandCBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.ControlPoint <em>Control Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.ControlPoint
	 * @generated
	 */
	public Adapter createControlPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.DeviceModel
	 * @generated
	 */
	public Adapter createBase_DeviceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.MainBase <em>Main Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.MainBase
	 * @generated
	 */
	public Adapter createMainBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.MonitorPoint <em>Monitor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.MonitorPoint
	 * @generated
	 */
	public Adapter createMonitorPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EthAdapterFactory
