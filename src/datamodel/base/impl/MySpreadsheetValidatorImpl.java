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
package datamodel.base.impl;

import datamodel.base.BasePackage;
import datamodel.base.SimpleErrorHandler;
import datamodel.base.SpreadsheetValidator;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.SpreadsheetValidatorImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetValidatorImpl#getErrorList <em>Error List</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetValidatorImpl#getSeh <em>Seh</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MySpreadsheetValidatorImpl extends EObjectImpl implements SpreadsheetValidator {
	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected SimpleErrorHandler errorHandler;

	/**
	 * The default value of the '{@link #getErrorList() <em>Error List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorList()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList ERROR_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorList() <em>Error List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorList()
	 * @generated
	 * @ordered
	 */
	protected ArrayList errorList = ERROR_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeh() <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeh()
	 * @generated
	 * @ordered
	 */
	protected static final Object SEH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeh() <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeh()
	 * @generated
	 * @ordered
	 */
	protected Object seh = SEH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MySpreadsheetValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BasePackage.Literals.SPREADSHEET_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleErrorHandler getErrorHandler() {
		if (errorHandler != null && errorHandler.eIsProxy()) {
			InternalEObject oldErrorHandler = (InternalEObject)errorHandler;
			errorHandler = (SimpleErrorHandler)eResolveProxy(oldErrorHandler);
			if (errorHandler != oldErrorHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.SPREADSHEET_VALIDATOR__ERROR_HANDLER, oldErrorHandler, errorHandler));
			}
		}
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleErrorHandler basicGetErrorHandler() {
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandler(SimpleErrorHandler newErrorHandler) {
		SimpleErrorHandler oldErrorHandler = errorHandler;
		errorHandler = newErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_VALIDATOR__ERROR_HANDLER, oldErrorHandler, errorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getErrorList() {
		return errorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorList(ArrayList newErrorList) {
		ArrayList oldErrorList = errorList;
		errorList = newErrorList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST, oldErrorList, errorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSeh() {
		return seh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeh(Object newSeh) {
		Object oldSeh = seh;
		seh = newSeh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_VALIDATOR__SEH, oldSeh, seh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(String xmlFile, String xsdFile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_HANDLER:
				if (resolve) return getErrorHandler();
				return basicGetErrorHandler();
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				return getErrorList();
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				return getSeh();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_HANDLER:
				setErrorHandler((SimpleErrorHandler)newValue);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				setErrorList((ArrayList)newValue);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				setSeh(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_HANDLER:
				setErrorHandler((SimpleErrorHandler)null);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				setErrorList(ERROR_LIST_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				setSeh(SEH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_HANDLER:
				return errorHandler != null;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				return ERROR_LIST_EDEFAULT == null ? errorList != null : !ERROR_LIST_EDEFAULT.equals(errorList);
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				return SEH_EDEFAULT == null ? seh != null : !SEH_EDEFAULT.equals(seh);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorList: ");
		result.append(errorList);
		result.append(", seh: ");
		result.append(seh);
		result.append(')');
		return result.toString();
	}

} //SpreadsheetValidatorImpl
