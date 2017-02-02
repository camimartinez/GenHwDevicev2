/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.BasePackage;
import datamodel.base.Table;
import datamodel.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.UtilImpl#getNewline <em>Newline</em>}</li>
 *   <li>{@link datamodel.base.impl.UtilImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link datamodel.base.impl.UtilImpl#getMONTH <em>MONTH</em>}</li>
 *   <li>{@link datamodel.base.impl.UtilImpl#getMONTHalt <em>MONT Halt</em>}</li>
 *   <li>{@link datamodel.base.impl.UtilImpl#getGetRawBytes <em>Get Raw Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UtilImpl extends EObjectImpl implements Util {
	/**
	 * The default value of the '{@link #getNewline() <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewline()
	 * @generated
	 * @ordered
	 */
	protected static final String NEWLINE_EDEFAULT = "System.getProperty(\"line.separator\")";

	/**
	 * The cached value of the '{@link #getNewline() <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewline()
	 * @generated
	 * @ordered
	 */
	protected String newline = NEWLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 54;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMONTH() <em>MONTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTH()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTH_EDEFAULT = "\"JAN\", \"FEB\", \"MAR\", \"APR\", \"MAY\", \"JUN\", \"JUL\", \"AUG\", \"SEP\", \"OCT\", \"NOV\", \"DEC\"";

	/**
	 * The cached value of the '{@link #getMONTH() <em>MONTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTH()
	 * @generated
	 * @ordered
	 */
	protected String month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMONTHalt() <em>MONT Halt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTHalt()
	 * @generated
	 * @ordered
	 */
	protected static final String MONT_HALT_EDEFAULT = "\"01\", \"02\", \"03\", \"04\", \"05\", \"06\", \"07\", \"08\", \"09\", \"10\", \"11\", \"12\"";

	/**
	 * The cached value of the '{@link #getMONTHalt() <em>MONT Halt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTHalt()
	 * @generated
	 * @ordered
	 */
	protected String montHalt = MONT_HALT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetRawBytes() <em>Get Raw Bytes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetRawBytes()
	 * @generated
	 * @ordered
	 */
	protected Table getRawBytes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.UTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewline() {
		return newline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewline(String newNewline) {
		String oldNewline = newline;
		newline = newNewline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__NEWLINE, oldNewline, newline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMONTH() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMONTH(String newMONTH) {
		String oldMONTH = month;
		month = newMONTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__MONTH, oldMONTH, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMONTHalt() {
		return montHalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMONTHalt(String newMONTHalt) {
		String oldMONTHalt = montHalt;
		montHalt = newMONTHalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__MONT_HALT, oldMONTHalt, montHalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetRawBytes() {
		if (getRawBytes != null && getRawBytes.eIsProxy()) {
			InternalEObject oldGetRawBytes = (InternalEObject)getRawBytes;
			getRawBytes = (Table)eResolveProxy(oldGetRawBytes);
			if (getRawBytes != oldGetRawBytes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.UTIL__GET_RAW_BYTES, oldGetRawBytes, getRawBytes));
			}
		}
		return getRawBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetRawBytes() {
		return getRawBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetRawBytes(Table newGetRawBytes) {
		Table oldGetRawBytes = getRawBytes;
		getRawBytes = newGetRawBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__GET_RAW_BYTES, oldGetRawBytes, getRawBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void error(String msg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RemoveLinesFromFile(String dirName, String fileName, int replace) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltName(String str) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionBase(String s, String prefix) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescription(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL1(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL2(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL4(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL5(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String descriptionAsString(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String decodeHTMLChars(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataTypeTotalBytes(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberOfItems(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRawDataTypeIndex(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toArrayTime(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String parseDateString(String s, boolean alt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeNumber(String wdt, String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeFloat(String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeBoolean(String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallDir() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toDatabaseDate(String s) {
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
			case BasePackage.UTIL__NEWLINE:
				return getNewline();
			case BasePackage.UTIL__MAX_LENGTH:
				return getMaxLength();
			case BasePackage.UTIL__MONTH:
				return getMONTH();
			case BasePackage.UTIL__MONT_HALT:
				return getMONTHalt();
			case BasePackage.UTIL__GET_RAW_BYTES:
				if (resolve) return getGetRawBytes();
				return basicGetGetRawBytes();
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
			case BasePackage.UTIL__NEWLINE:
				setNewline((String)newValue);
				return;
			case BasePackage.UTIL__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case BasePackage.UTIL__MONTH:
				setMONTH((String)newValue);
				return;
			case BasePackage.UTIL__MONT_HALT:
				setMONTHalt((String)newValue);
				return;
			case BasePackage.UTIL__GET_RAW_BYTES:
				setGetRawBytes((Table)newValue);
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
			case BasePackage.UTIL__NEWLINE:
				setNewline(NEWLINE_EDEFAULT);
				return;
			case BasePackage.UTIL__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case BasePackage.UTIL__MONTH:
				setMONTH(MONTH_EDEFAULT);
				return;
			case BasePackage.UTIL__MONT_HALT:
				setMONTHalt(MONT_HALT_EDEFAULT);
				return;
			case BasePackage.UTIL__GET_RAW_BYTES:
				setGetRawBytes((Table)null);
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
			case BasePackage.UTIL__NEWLINE:
				return NEWLINE_EDEFAULT == null ? newline != null : !NEWLINE_EDEFAULT.equals(newline);
			case BasePackage.UTIL__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case BasePackage.UTIL__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case BasePackage.UTIL__MONT_HALT:
				return MONT_HALT_EDEFAULT == null ? montHalt != null : !MONT_HALT_EDEFAULT.equals(montHalt);
			case BasePackage.UTIL__GET_RAW_BYTES:
				return getRawBytes != null;
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
		result.append(" (newline: ");
		result.append(newline);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", MONTH: ");
		result.append(month);
		result.append(", MONTHalt: ");
		result.append(montHalt);
		result.append(')');
		return result.toString();
	}

} //UtilImpl
