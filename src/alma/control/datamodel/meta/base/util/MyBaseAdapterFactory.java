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
package alma.control.datamodel.meta.base.util;

import alma.control.datamodel.meta.base.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EObject;

import org.xml.sax.ErrorHandler;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see alma.control.datamodel.meta.base.BasePackage
 * @generated
 */
public class MyBaseAdapterFactory extends AdapterFactoryImpl {
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
	public MyBaseAdapterFactory() {
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
	protected BaseSwitch<Adapter> modelSwitch =
		new BaseSwitch<Adapter>() {
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
			public Adapter caseMandCBase(MandCBase object) {
				return createMandCBaseAdapter();
			}
			@Override
			public Adapter caseMonitorPoint(MonitorPoint object) {
				return createMonitorPointAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter casePair(Pair object) {
				return createPairAdapter();
			}
			@Override
			public Adapter caseSimpleErrorHandler(SimpleErrorHandler object) {
				return createSimpleErrorHandlerAdapter();
			}
			@Override
			public Adapter caseSpreadsheetParser(SpreadsheetParser object) {
				return createSpreadsheetParserAdapter();
			}
			@Override
			public Adapter caseSpreadsheetValidator(SpreadsheetValidator object) {
				return createSpreadsheetValidatorAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseUtil(Util object) {
				return createUtilAdapter();
			}
			@Override
			public Adapter caseErrorHandlerAuxClass(ErrorHandler object) {
				return createErrorHandlerAuxClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.ArchiveProperty <em>Archive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.ArchiveProperty
	 * @generated
	 */
	public Adapter createArchivePropertyAdapter() {
		Adapter archivePropertyAdapter = new AdapterImpl();
		return archivePropertyAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.ControlPoint <em>Control Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.ControlPoint
	 * @generated
	 */
	public Adapter createControlPointAdapter() {
		Adapter controlPointAdapter = new AdapterImpl();
		return controlPointAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.DeviceModel <em>Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.DeviceModel
	 * @generated
	 */
	public Adapter createDeviceModelAdapter() {
		Adapter deviceModelAdapter = new AdapterImpl();
		return deviceModelAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.MainBase <em>Main Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.MainBase
	 * @generated
	 */
	public Adapter createMainBaseAdapter() {
		Adapter mainBaseAdapter = new AdapterImpl();
		return mainBaseAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.MandCBase <em>Mand CBase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.MandCBase
	 * @generated
	 */
	public Adapter createMandCBaseAdapter() {
		Adapter mandCBaseAdapter = new AdapterImpl();
		return mandCBaseAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.MonitorPoint <em>Monitor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.MonitorPoint
	 * @generated
	 */
	public Adapter createMonitorPointAdapter() {
		Adapter monitorPointAdapter = new AdapterImpl();
		return monitorPointAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		Adapter noteAdapter = new AdapterImpl();
		return noteAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		Adapter pairAdapter = new AdapterImpl();
		return pairAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.SimpleErrorHandler <em>Simple Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.SimpleErrorHandler
	 * @generated
	 */
	public Adapter createSimpleErrorHandlerAdapter() {
		Adapter simpleErrorHandlerAdapter = new AdapterImpl();
		return simpleErrorHandlerAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.SpreadsheetParser <em>Spreadsheet Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.SpreadsheetParser
	 * @generated
	 */
	public Adapter createSpreadsheetParserAdapter() {
		Adapter spreadsheetParserAdapter = new AdapterImpl();
		return spreadsheetParserAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.SpreadsheetValidator <em>Spreadsheet Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.SpreadsheetValidator
	 * @generated
	 */
	public Adapter createSpreadsheetValidatorAdapter() {
		Adapter spreadsheetValidatorAdapter = new AdapterImpl();
		return spreadsheetValidatorAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		Adapter tableAdapter = new AdapterImpl();
		return tableAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alma.control.datamodel.meta.base.Util <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alma.control.datamodel.meta.base.Util
	 * @generated
	 */
	public Adapter createUtilAdapter() {
		Adapter utilAdapter = new AdapterImpl();
		return utilAdapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml.sax.ErrorHandler <em>Error Handler Aux Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml.sax.ErrorHandler
	 * @generated
	 */
	public Adapter createErrorHandlerAuxClassAdapter() {
		Adapter errorHandlerAuxClass = new AdapterImpl();
		return errorHandlerAuxClass;
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
		Adapter eObjectAdapter = new AdapterImpl();
		return eObjectAdapter;
	}

} //MyBaseAdapterFactory
