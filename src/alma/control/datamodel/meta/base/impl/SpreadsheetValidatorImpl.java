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
package alma.control.datamodel.meta.base.impl;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.SimpleErrorHandler;
import alma.control.datamodel.meta.base.SpreadsheetValidator;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.xml.sax.ErrorHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl#getSeh <em>Seh</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl#getErrorList <em>Error List</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetValidatorImpl#getSehTmp <em>Seh Tmp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpreadsheetValidatorImpl extends EObjectImpl implements SpreadsheetValidator {
	/**
	 * The default value of the '{@link #getSeh() <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeh()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleErrorHandler SEH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeh() <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeh()
	 * @generated
	 * @ordered
	 */
	protected SimpleErrorHandler seh = SEH_EDEFAULT;

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
	 * The default value of the '{@link #getSehTmp() <em>Seh Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSehTmp()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorHandler SEH_TMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSehTmp() <em>Seh Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSehTmp()
	 * @generated
	 * @ordered
	 */
	protected ErrorHandler sehTmp = SEH_TMP_EDEFAULT;

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
	public SimpleErrorHandler getSeh() {
		return seh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeh(SimpleErrorHandler newSeh) {
		SimpleErrorHandler oldSeh = seh;
		seh = newSeh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_VALIDATOR__SEH, oldSeh, seh));
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
	public ErrorHandler getSehTmp() {
		return sehTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSehTmp(ErrorHandler newSehTmp) {
		ErrorHandler oldSehTmp = sehTmp;
		sehTmp = newSehTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_VALIDATOR__SEH_TMP, oldSehTmp, sehTmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final String xmlFile, final String xsdFile) {
						javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
						factory.setNamespaceAware(true);
						factory.setValidating(true);
						factory.setAttribute(
								"http://java.sun.com/xml/jaxp/properties/schemaLanguage",
								"http://www.w3.org/2001/XMLSchema");
						// Specify our own schema - this overrides the schemaLocation in the xml
						// file
						factory.setAttribute(
								"http://java.sun.com/xml/jaxp/properties/schemaSource",
								"file://" + xsdFile);
						seh = BaseFactory.eINSTANCE.createSimpleErrorHandler();
				
						try {
							javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
							builder.setErrorHandler(seh);
							org.w3c.dom.Document document = builder.parse(xmlFile);
						}
						catch(Exception e) {
							System.out.println("Validating error file " + xmlFile
									+ " with schema file " + xsdFile + " failed!");
							return false;
						}
				
						if(seh.areErrors()) {
							System.out.println("Validating error file " + xmlFile
									+ " with schema file " + xsdFile + " failed!");
							return false;
						}
						else {
							return true;
						}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeSV() {
		this.errorList = new ArrayList< String >();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				return getSeh();
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				return getErrorList();
			case BasePackage.SPREADSHEET_VALIDATOR__SEH_TMP:
				return getSehTmp();
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
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				setSeh((SimpleErrorHandler)newValue);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				setErrorList((ArrayList)newValue);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__SEH_TMP:
				setSehTmp((ErrorHandler)newValue);
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
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				setSeh(SEH_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				setErrorList(ERROR_LIST_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_VALIDATOR__SEH_TMP:
				setSehTmp(SEH_TMP_EDEFAULT);
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
			case BasePackage.SPREADSHEET_VALIDATOR__SEH:
				return SEH_EDEFAULT == null ? seh != null : !SEH_EDEFAULT.equals(seh);
			case BasePackage.SPREADSHEET_VALIDATOR__ERROR_LIST:
				return ERROR_LIST_EDEFAULT == null ? errorList != null : !ERROR_LIST_EDEFAULT.equals(errorList);
			case BasePackage.SPREADSHEET_VALIDATOR__SEH_TMP:
				return SEH_TMP_EDEFAULT == null ? sehTmp != null : !SEH_TMP_EDEFAULT.equals(sehTmp);
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
		result.append(" (seh: ");
		result.append(seh);
		result.append(", errorList: ");
		result.append(errorList);
		result.append(", sehTmp: ");
		result.append(sehTmp);
		result.append(')');
		return result.toString();
	}

} //SpreadsheetValidatorImpl
