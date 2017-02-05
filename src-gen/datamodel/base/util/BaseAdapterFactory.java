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
package datamodel.base.util;

import datamodel.base.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datamodel.base.BasePackage
 * @generated
 */
public class BaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
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
	protected BaseSwitch modelSwitch =
		new BaseSwitch() {
			public Object caseDeviceModel(DeviceModel object) {
				return createDeviceModelAdapter();
			}
			public Object caseMonitorPoint(MonitorPoint object) {
				return createMonitorPointAdapter();
			}
			public Object caseControlPoint(ControlPoint object) {
				return createControlPointAdapter();
			}
			public Object caseTable(Table object) {
				return createTableAdapter();
			}
			public Object caseMandCBase(MandCBase object) {
				return createMandCBaseAdapter();
			}
			public Object caseArchiveProperty(ArchiveProperty object) {
				return createArchivePropertyAdapter();
			}
			public Object caseNote(Note object) {
				return createNoteAdapter();
			}
			public Object caseSpreadsheetValidator(SpreadsheetValidator object) {
				return createSpreadsheetValidatorAdapter();
			}
			public Object caseSpreadsheetParser(SpreadsheetParser object) {
				return createSpreadsheetParserAdapter();
			}
			public Object caseUtil(Util object) {
				return createUtilAdapter();
			}
			public Object casePair(Pair object) {
				return createPairAdapter();
			}
			public Object caseSimpleErrorHandler(SimpleErrorHandler object) {
				return createSimpleErrorHandlerAdapter();
			}
			public Object caseMainBase(MainBase object) {
				return createMainBaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link datamodel.base.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link datamodel.base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.SpreadsheetValidator <em>Spreadsheet Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.SpreadsheetValidator
	 * @generated
	 */
	public Adapter createSpreadsheetValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.SpreadsheetParser <em>Spreadsheet Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.SpreadsheetParser
	 * @generated
	 */
	public Adapter createSpreadsheetParserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.Util <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.Util
	 * @generated
	 */
	public Adapter createUtilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datamodel.base.SimpleErrorHandler <em>Simple Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datamodel.base.SimpleErrorHandler
	 * @generated
	 */
	public Adapter createSimpleErrorHandlerAdapter() {
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

} //BaseAdapterFactory
