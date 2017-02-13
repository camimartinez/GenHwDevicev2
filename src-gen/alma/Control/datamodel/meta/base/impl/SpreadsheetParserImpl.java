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
package alma.Control.datamodel.meta.base.impl;

import alma.Control.datamodel.meta.base.BasePackage;
import alma.Control.datamodel.meta.base.Pair;
import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;

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
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#getRefPath <em>Ref Path</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#isRefStatus <em>Ref Status</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#getXsdFile <em>Xsd File</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#getNewline <em>Newline</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#getSetNewContent <em>Set New Content</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.SpreadsheetParserImpl#getTovalidateSpreads <em>Tovalidate Spreads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpreadsheetParserImpl extends EObjectImpl implements SpreadsheetParser {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public SpreadsheetParserImpl(String xml){
		this.xml = xml;
	}	
	
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
	protected static final String NEWLINE_EDEFAULT = "";

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
	 * The cached value of the '{@link #getTovalidateSpreads() <em>Tovalidate Spreads</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTovalidateSpreads()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator tovalidateSpreads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParserImpl() {
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
	public SpreadsheetValidator getTovalidateSpreads() {
		if (tovalidateSpreads != null && tovalidateSpreads.eIsProxy()) {
			InternalEObject oldTovalidateSpreads = (InternalEObject)tovalidateSpreads;
			tovalidateSpreads = (SpreadsheetValidator)eResolveProxy(oldTovalidateSpreads);
			if (tovalidateSpreads != oldTovalidateSpreads) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.SPREADSHEET_PARSER__TOVALIDATE_SPREADS, oldTovalidateSpreads, tovalidateSpreads));
			}
		}
		return tovalidateSpreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetTovalidateSpreads() {
		return tovalidateSpreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTovalidateSpreads(SpreadsheetValidator newTovalidateSpreads) {
		SpreadsheetValidator oldTovalidateSpreads = tovalidateSpreads;
		tovalidateSpreads = newTovalidateSpreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SPREADSHEET_PARSER__TOVALIDATE_SPREADS, oldTovalidateSpreads, tovalidateSpreads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadsheet(String dirName, String fileName) {
				java.io.File dir = new java.io.File(dirName);
				if (!dir.isDirectory())
					throw new RuntimeException ("Directory " + dirName + " does not exist.");
				java.io.File file = new java.io.File(dir, fileName);
				if (!file.exists())
					throw new RuntimeException ("File " + fileName + " in directory " + dirName + " does not exist.");
				java.io.BufferedReader in = null;
				StringBuffer xmlDoc = null;
				String line = null;
				try {
					in = new java.io.BufferedReader(new java.io.FileReader(file));
					//Read the entire file and store in it xmlDoc.
					xmlDoc = new StringBuffer();
					line = in.readLine();
					while (line != null) {
						xmlDoc.append(line + newline);
						//xmlDoc.append(line);
						line = in.readLine();
					}
					in.close();
				} catch (java.io.IOException e) {
					throw new RuntimeException(e.getMessage());
				}
				String xml = new String(xmlDoc);
				// Now, the entire xml file is in the string: xml.
				return xml;
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
	public String[][][] getWorksheets() {
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
		return refStatus;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return refPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSD(String xsd) {
		xsdFile = xsd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] filter(String doc) {
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
		if (worksheet[0][0].equals("Hardware Device")) {
					for (int i = 2; i < worksheet.length; ++i) {
						if (worksheet[i] == null)
							continue;
						if (worksheet[i][0].equals(name)) {
							worksheet[i] = null;
							return;
						}
					}
					throw new RuntimeException("The name " + name + " is not the name of a row in the Main worksheet.");
				}
				for (int i = 2; i < worksheet.length; ++i) {
					if (worksheet[i] == null)
						continue;
					if (worksheet[i][1].equals(name)) {
						worksheet[i] = null;
						return;
					}
				}		
				throw new RuntimeException("The name " + name + " is not the name of a row in the " + worksheet[0][0] + " worksheet.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s) {
				// Find the row.
				int row = 0;
				if (worksheet[0][0].equals("Hardware Device")) {
					int i = 2;
					for (; i < worksheet.length; ++i) {
						if (worksheet[i] == null)
							continue;
						if (worksheet[i][0].equals(rowName)) {
							row = i;
							break;
						}
					}
					if (i == worksheet.length)
						throw new RuntimeException("The name " + rowName + " is not the name of a row in the Main worksheet.");
				} else {
					int i = 2;
					for (; i < worksheet.length; ++i) {
						if (worksheet[i] == null)
							continue;
						if (worksheet[i][1].equals(rowName)) {
							row = i;
							break;
						}
					}
					if (i == worksheet.length)
						throw new RuntimeException("The name " + rowName + " is not the name of a row in the " + worksheet[0][0] + " worksheet.");
				}
				String name;
				String value;
				int b;
				int m;
				int e;        				
				while(true) {
					b = s.indexOf('<');
					m = s.indexOf('=');
					e = s.indexOf('>');
					if (b == -1 || m == -1 || e == -1 || m < b || e < m) {
						throw new RuntimeException("Invalid syntax at line number " + lineNumber + " in file filter.");
					}
					name = s.substring(b + 1, m).trim();
					value = s.substring(m + 1, e).trim();
					// Apply the change.
					int j = 0;
					for (; j < worksheet[row].length; ++j) {
						if (worksheet[1][j].equals(name)) {
							worksheet[row][j] = value;
							break;
						}
					}
					if (j == worksheet[row].length)
						throw new RuntimeException("The name " + name + " is not the name of a column in the " + worksheet[0][0] + " worksheet.");
					// Get the next change.
					++e;
					while (e < s.length() && (s.charAt(e) == ' ' || s.charAt(e) == '\t'))
						++e;
					if (e == s.length())
						break;
					s = s.substring(e);
				}
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
			case BasePackage.SPREADSHEET_PARSER__TOVALIDATE_SPREADS:
				if (resolve) return getTovalidateSpreads();
				return basicGetTovalidateSpreads();
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
			case BasePackage.SPREADSHEET_PARSER__TOVALIDATE_SPREADS:
				setTovalidateSpreads((SpreadsheetValidator)newValue);
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
			case BasePackage.SPREADSHEET_PARSER__TOVALIDATE_SPREADS:
				setTovalidateSpreads((SpreadsheetValidator)null);
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
			case BasePackage.SPREADSHEET_PARSER__TOVALIDATE_SPREADS:
				return tovalidateSpreads != null;
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
