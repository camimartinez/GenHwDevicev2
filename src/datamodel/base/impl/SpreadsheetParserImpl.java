/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.BasePackage;
import datamodel.base.Pair;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#getRefPath <em>Ref Path</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#isRefStatus <em>Ref Status</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#getXsdFile <em>Xsd File</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#getNewline <em>Newline</em>}</li>
 *   <li>{@link datamodel.base.impl.SpreadsheetParserImpl#getSetNewContent <em>Set New Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpreadsheetParserImpl extends EObjectImpl implements SpreadsheetParser {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator eReference0;

	/**
	 * The default value of the '{@link #getRefPath() <em>Ref Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefPath() <em>Ref Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPath()
	 * @generated
	 * @ordered
	 */
	protected String refPath = REF_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isRefStatus() <em>Ref Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REF_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefStatus() <em>Ref Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean refStatus = REF_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml() <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected String xml = XML_EDEFAULT;

	/**
	 * The default value of the '{@link #getXsdFile() <em>Xsd File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdFile()
	 * @generated
	 * @ordered
	 */
	protected static final String XSD_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsdFile() <em>Xsd File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdFile()
	 * @generated
	 * @ordered
	 */
	protected String xsdFile = XSD_FILE_EDEFAULT;

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
	 * The cached value of the '{@link #getSetNewContent() <em>Set New Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetNewContent()
	 * @generated
	 * @ordered
	 */
	protected Pair setNewContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.SPREADSHEET_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (SpreadsheetValidator)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.SPREADSHEET_PARSER__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(SpreadsheetValidator newEReference0) {
		SpreadsheetValidator oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefPath() {
		return refPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefPath(String newRefPath) {
		String oldRefPath = refPath;
		refPath = newRefPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__REF_PATH, oldRefPath, refPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefStatus() {
		return refStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefStatus(boolean newRefStatus) {
		boolean oldRefStatus = refStatus;
		refStatus = newRefStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__REF_STATUS, oldRefStatus, refStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml(String newXml) {
		String oldXml = xml;
		xml = newXml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__XML, oldXml, xml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXsdFile() {
		return xsdFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdFile(String newXsdFile) {
		String oldXsdFile = xsdFile;
		xsdFile = newXsdFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__XSD_FILE, oldXsdFile, xsdFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__NEWLINE, oldNewline, newline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pair getSetNewContent() {
		return setNewContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetNewContent(Pair newSetNewContent, NotificationChain msgs) {
		Pair oldSetNewContent = setNewContent;
		setNewContent = newSetNewContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT, oldSetNewContent, newSetNewContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetNewContent(Pair newSetNewContent) {
		if (newSetNewContent != setNewContent) {
			NotificationChain msgs = null;
			if (setNewContent != null)
				msgs = ((InternalEObject)setNewContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT, null, msgs);
			if (newSetNewContent != null)
				msgs = ((InternalEObject)newSetNewContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT, null, msgs);
			msgs = basicSetSetNewContent(newSetNewContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT, newSetNewContent, newSetNewContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadsheet(String dirName, String fileName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getDataCells(String row) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][] getWorksheets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReference() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSD(String xsd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][] filter(String doc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteRow(String[][] worksheet, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT:
				return basicSetSetNewContent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.SPREADSHEET_PARSER__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case BasePackage.SPREADSHEET_PARSER__REF_PATH:
				return getRefPath();
			case BasePackage.SPREADSHEET_PARSER__REF_STATUS:
				return isRefStatus();
			case BasePackage.SPREADSHEET_PARSER__XML:
				return getXml();
			case BasePackage.SPREADSHEET_PARSER__XSD_FILE:
				return getXsdFile();
			case BasePackage.SPREADSHEET_PARSER__NEWLINE:
				return getNewline();
			case BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT:
				return getSetNewContent();
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
			case BasePackage.SPREADSHEET_PARSER__EREFERENCE0:
				setEReference0((SpreadsheetValidator)newValue);
				return;
			case BasePackage.SPREADSHEET_PARSER__REF_PATH:
				setRefPath((String)newValue);
				return;
			case BasePackage.SPREADSHEET_PARSER__REF_STATUS:
				setRefStatus((Boolean)newValue);
				return;
			case BasePackage.SPREADSHEET_PARSER__XML:
				setXml((String)newValue);
				return;
			case BasePackage.SPREADSHEET_PARSER__XSD_FILE:
				setXsdFile((String)newValue);
				return;
			case BasePackage.SPREADSHEET_PARSER__NEWLINE:
				setNewline((String)newValue);
				return;
			case BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT:
				setSetNewContent((Pair)newValue);
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
			case BasePackage.SPREADSHEET_PARSER__EREFERENCE0:
				setEReference0((SpreadsheetValidator)null);
				return;
			case BasePackage.SPREADSHEET_PARSER__REF_PATH:
				setRefPath(REF_PATH_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_PARSER__REF_STATUS:
				setRefStatus(REF_STATUS_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_PARSER__XML:
				setXml(XML_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_PARSER__XSD_FILE:
				setXsdFile(XSD_FILE_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_PARSER__NEWLINE:
				setNewline(NEWLINE_EDEFAULT);
				return;
			case BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT:
				setSetNewContent((Pair)null);
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
			case BasePackage.SPREADSHEET_PARSER__EREFERENCE0:
				return eReference0 != null;
			case BasePackage.SPREADSHEET_PARSER__REF_PATH:
				return REF_PATH_EDEFAULT == null ? refPath != null : !REF_PATH_EDEFAULT.equals(refPath);
			case BasePackage.SPREADSHEET_PARSER__REF_STATUS:
				return refStatus != REF_STATUS_EDEFAULT;
			case BasePackage.SPREADSHEET_PARSER__XML:
				return XML_EDEFAULT == null ? xml != null : !XML_EDEFAULT.equals(xml);
			case BasePackage.SPREADSHEET_PARSER__XSD_FILE:
				return XSD_FILE_EDEFAULT == null ? xsdFile != null : !XSD_FILE_EDEFAULT.equals(xsdFile);
			case BasePackage.SPREADSHEET_PARSER__NEWLINE:
				return NEWLINE_EDEFAULT == null ? newline != null : !NEWLINE_EDEFAULT.equals(newline);
			case BasePackage.SPREADSHEET_PARSER__SET_NEW_CONTENT:
				return setNewContent != null;
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
		result.append(" (refPath: ");
		result.append(refPath);
		result.append(", refStatus: ");
		result.append(refStatus);
		result.append(", xml: ");
		result.append(xml);
		result.append(", xsdFile: ");
		result.append(xsdFile);
		result.append(", newline: ");
		result.append(newline);
		result.append(')');
		return result.toString();
	}

} //SpreadsheetParserImpl
