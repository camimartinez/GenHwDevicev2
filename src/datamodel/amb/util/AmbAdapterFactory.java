/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.util;

import datamodel.amb.*;

import datamodel.base.ArchiveProperty;
import datamodel.base.ControlPoint;
import datamodel.base.DeviceModel;
import datamodel.base.MainBase;
import datamodel.base.MonitorPoint;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datamodel.amb.AmbPackage
 * @generated
 */
public class AmbAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmbPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AmbPackage.eINSTANCE;
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
	@Override
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
	protected AmbSwitch<Adapter> modelSwitch =
		new AmbSwitch<Adapter>() {
			@Override
			public Adapter caseArchiveImpl(ArchiveImpl object) {
				return createArchiveImplAdapter();
			}
			@Override
			public Adapter caseControlImpl(ControlImpl object) {
				return createControlImplAdapter();
			}
			@Override
			public Adapter caseDeviceModelAMB(DeviceModelAMB object) {
				return createDeviceModelAMBAdapter();
			}
			@Override
			public Adapter caseMainImpl(MainImpl object) {
				return createMainImplAdapter();
			}
			@Override
			public Adapter caseMandCImpl(MandCImpl object) {
				return createMandCImplAdapter();
			}
			@Override
			public Adapter caseMonitorImpl(MonitorImpl object) {
				return createMonitorImplAdapter();
			}
			@Override
			public Adapter caseSWModule(SWModule object) {
				return createSWModuleAdapter();
			}
			@Override
			public Adapter caseArchiveProperty(ArchiveProperty object) {
				return createArchivePropertyAdapter();
			}
			@Override
			public Adapter caseControlPoint(ControlPoint object) {
				return createControlPointAdapter();
			}
			@Override
			public Adapter caseDeviceModel(DeviceModel object) {
				return createDeviceModelAdapter();
			}
			@Override
			public Adapter caseMainBase(MainBase object) {
				return createMainBaseAdapter();
			}
			@Override
			public Adapter caseMonitorPoint(MonitorPoint object) {
				return createMonitorPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.ArchiveImpl <em>Archive Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.ArchiveImpl
	 * @generated
	 */
	public Adapter createArchiveImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.ControlImpl <em>Control Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.ControlImpl
	 * @generated
	 */
	public Adapter createControlImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.DeviceModelAMB <em>Device Model AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.DeviceModelAMB
	 * @generated
	 */
	public Adapter createDeviceModelAMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.MainImpl <em>Main Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.MainImpl
	 * @generated
	 */
	public Adapter createMainImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.MandCImpl <em>Mand CImpl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.MandCImpl
	 * @generated
	 */
	public Adapter createMandCImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.MonitorImpl <em>Monitor Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.MonitorImpl
	 * @generated
	 */
	public Adapter createMonitorImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.SWModule <em>SW Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.SWModule
	 * @generated
	 */
	public Adapter createSWModuleAdapter() {
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
	public Adapter createDeviceModelAdapter() {
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

} //AmbAdapterFactory
