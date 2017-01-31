/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
 *   <li>{@link datamodel.base.impl.SpreadsheetValidatorImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetValidatorImpl#getErrorList <em>Error List</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetValidatorImpl#getSeh <em>Seh</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpreadsheetValidatorImpl extends EObjectImpl implements SpreadsheetValidator {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected SimpleErrorHandler eReference0;

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
	 * The cached value of the '{@link #getSeh() <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeh()
	 * @generated
	 * @ordered
	 */
	protected Object seh;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.SPREADSHEET_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleErrorHandler getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (SimpleErrorHandler)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.SPREADSHEET_VALIDATOR__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleErrorHandler basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(SimpleErrorHandler newEReference0) {
		SimpleErrorHandler oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_VALIDATOR__EREFERENCE0, oldEReference0, eReference0));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__EREFERENCE0:
				setEReference0((SimpleErrorHandler)newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__EREFERENCE0:
				setEReference0((SimpleErrorHandler)null);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				setErrorList(ERROR_LIST_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				setSeh((Object)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__EREFERENCE0:
				return eReference0 != null;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				return ERROR_LIST_EDEFAULT == null ? errorList != null : !ERROR_LIST_EDEFAULT.equals(errorList);
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				return seh != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
