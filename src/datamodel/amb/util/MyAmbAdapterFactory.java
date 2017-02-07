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
package datamodel.amb.util;

import datamodel.amb.*;

import datamodel.base.ArchiveProperty;
import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MandCBase;
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
public class MyAmbAdapterFactory extends AdapterFactoryImpl {
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
	public MyAmbAdapterFactory() {
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
			public Adapter caseArchiveAMB(ArchiveAMB object) {
				return createArchiveAMBAdapter();
			}
			@Override
			public Adapter caseControlAMB(ControlAMB object) {
				return createControlAMBAdapter();
			}
			@Override
			public Adapter caseDeviceModel(DeviceModel object) {
				return createDeviceModelAdapter();
			}
			@Override
			public Adapter caseMainAMB(MainAMB object) {
				return createMainAMBAdapter();
			}
			@Override
			public Adapter caseMandCAMB(MandCAMB object) {
				return createMandCAMBAdapter();
			}
			@Override
			public Adapter caseMonitorAMB(MonitorAMB object) {
				return createMonitorAMBAdapter();
			}
			@Override
			public Adapter caseSWModule(SWModule object) {
				return createSWModuleAdapter();
			}
			@Override
			public Adapter caseGenericMonitorPoints(GenericMonitorPoints object) {
				return createGenericMonitorPointsAdapter();
			}
			@Override
			public Adapter caseArchiveProperty(ArchiveProperty object) {
				return createArchivePropertyAdapter();
			}
			@Override
			public Adapter caseMandCBase(MandCBase object) {
				return createMandCBaseAdapter();
			}
			@Override
			public Adapter caseControlPoint(ControlPoint object) {
				return createControlPointAdapter();
			}
			@Override
			public Adapter caseBase_DeviceModel(datamodel.base.DeviceModel object) {
				return createBase_DeviceModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link datamodel.amb.ArchiveAMB <em>Archive AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.ArchiveAMB
	 * @generated
	 */
	public Adapter createArchiveAMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.ControlAMB <em>Control AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.ControlAMB
	 * @generated
	 */
	public Adapter createControlAMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.DeviceModel
	 * @generated
	 */
	public Adapter createDeviceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.MainAMB <em>Main AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.MainAMB
	 * @generated
	 */
	public Adapter createMainAMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.MandCAMB <em>Mand CAMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.MandCAMB
	 * @generated
	 */
	public Adapter createMandCAMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.amb.MonitorAMB <em>Monitor AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.MonitorAMB
	 * @generated
	 */
	public Adapter createMonitorAMBAdapter() {
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
	 * Creates a new adapter for an object of class '{@link datamodel.amb.GenericMonitorPoints <em>Generic Monitor Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.amb.GenericMonitorPoints
	 * @generated
	 */
	public Adapter createGenericMonitorPointsAdapter() {
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

} //AmbAdapterFactory
