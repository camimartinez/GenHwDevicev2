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

import java.util.ArrayList;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.Pair;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl#getRefPath <em>Ref Path</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl#isRefStatus <em>Ref Status</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl#getXsdFile <em>Xsd File</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.SpreadsheetParserImpl#getNewline <em>Newline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpreadsheetParserImpl extends EObjectImpl implements SpreadsheetParser {
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
	public String getSpreadsheet(final String dirName, final String fileName) {
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
	public Pair getBoundedContent(final String s, final String beginPart1, final String beginPart2, final String end) {
				int b1 = s.indexOf(beginPart1);
				if (b1 == -1)
					return null;
				int b2 = s.indexOf(beginPart2,b1);
				if (b2 == -1)
					return null;
				int e = s.indexOf(end,b2);
				if (e == -1)
					return null;
				String content = s.substring(b2 + 1,e).trim();
				int n = e + end.length();
				String newS = null;
				if (n < s.length())
					newS = s.substring(n);
				PairImpl pp = new PairImpl() {};
				pp.setInitializePair(content,newS);
				return pp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String[] getDataCells(String row) {
				ArrayList list = new ArrayList ();
				String data = null;
				String content = null;
				while (row != null && row.length() > 0) {
					Pair p = getBoundedContent(row,"<Cell",">","</Cell>");
					if (p == null)
						break;
					data = p.getContent();
					row = p.getNewString();
					p = getBoundedContent(data,"<Data",">","</Data>");
					if (p == null)
						continue;
					content = p.getContent();
					list.add(content);
				}
				if(list.size() == 0)
					return null;
				String[] x = new String [list.size()];
				return (String[])list.toArray(x);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] getWorksheets() {
		ArrayList rowList = null;
				ArrayList sheetList = null;
				String sheet = null;
				String row = null;
				String[] data = null;
				sheetList = new ArrayList ();
				String doc = new String (xml);
				if (doc.startsWith("@reference")) {
					refStatus = true;
					return filter(doc);
				}
				Pair p = null;
				while (doc != null && doc.length() > 0) {
					p = getBoundedContent(doc,"<Worksheet",">","</Worksheet>");
					if (p == null)
						break;
					sheet = p.getContent();
					doc = p.getNewString();
					rowList = new ArrayList ();
					while (sheet != null && sheet.length() > 0) {
						Pair p2 = getBoundedContent(sheet,"<Row",">","</Row>");
						if (p2 == null)
							break;
						row = p2.getContent();
						sheet = p2.getNewString();
						data = getDataCells(row);
						if (data != null)
							rowList.add(data);
					}
					sheetList.add(rowList);
				}
		
				if(p == null){
					doc = new String(xml);
					while (doc != null && doc.length() > 0) {
						p = getBoundedContent(doc,"<ss:Worksheet",">","</ss:Worksheet>");
						if(p == null)
							break;
						sheet = p.getContent();
						doc = p.getNewString();
						rowList = new ArrayList ();
						while (sheet != null && sheet.length() > 0) {
							Pair p2 = getBoundedContent(sheet,"<Row",">","</Row>");
							if (p2 == null)
								break;
							row = p2.getContent();
							sheet = p2.getNewString();
							data = getDataCells(row);
							if (data != null)
								rowList.add(data);
						}
						sheetList.add(rowList);
					}
				}
		
		
				String[][][] result = new String [sheetList.size()][][];
				for (int i = 0; i < result.length; ++i) {
					ArrayList x = (ArrayList)sheetList.get(i);
					result[i] = new String [x.size()][];
					for (int j = 0; j < result[i].length; ++j) {
						String[] y = (String[])x.get(j);
						result[i][j] = new String [y.length];
						for (int k = 0; k < y.length; ++k)
							result[i][j][k] = y[k];
					}
				}
				return result;
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
	public void setXSD(final String xsd) {
		xsdFile = xsd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] filter(final String doc) {
			// A. Get the directory that is referenced, and the old and new assembly names.
				// Syntax: @reference = <base-directory-path-name> <base-assembly-name> = <new-assembly-name>
				java.io.LineNumberReader text = new java.io.LineNumberReader(new java.io.StringReader(doc));
				String line = null;
				try {
					line = text.readLine();
				} catch (java.io.IOException err) {
					throw new RuntimeException("Cannot read file: " + err.toString());
				}
				String[] tmp = line.split("[ |\t]+");
				if (!tmp[0].equals("@reference") || !tmp[1].equals("=") || !tmp[4].equals("=")) {
					throw new RuntimeException("Invalid syntax at line number " + text.getLineNumber() + " in file filter.");
				}
				String baseDirectory = tmp[2];
				String baseAssemblyName = tmp[3];
				String newAssemblyName = tmp[5];
				System.out.println("Applying filter in directory " + baseDirectory + 
						" to assembly " + baseAssemblyName + ".  New assembly is " + newAssemblyName + ".");
		
				// B. Get the contents of this base spreadsheet.
				BaseFactory baseFac = BaseFactory.eINSTANCE;
				String referenceXml = baseFac.createSpreadsheetParser().getSpreadsheet(baseDirectory, baseAssemblyName + "_spreadsheet.xml");
				refPath = baseDirectory + "/" + baseAssemblyName + "_spreadsheet.xml";
				SpreadsheetParser p = baseFac.createSpreadsheetParser();
				p.setInitializeSP(referenceXml);
				SpreadsheetValidator v = baseFac.createSpreadsheetValidator();
				if (!v.validate(refPath,xsdFile)) {
					String s = "Spreadsheet " + baseAssemblyName + "_spreadsheet.xml is not a valid spreadsheet.";
					throw new RuntimeException(s);
				}
				System.out.println("Base spreadsheet " + baseAssemblyName + " has been validated.");
				String[][][] base = p.getWorksheets();
		
				// C. Change the assembly name in the base spreadsheet.
				for (int i = 0; i < base.length; ++i) {
					for (int j = 0; j < base[i].length; ++j) {
						if (base[i][j][0].equals(baseAssemblyName)) {
							base[i][j][0] = newAssemblyName;
						}
					}
				}
		
				// D. Apply the filter to the base.
				//    Any deleted rows we will simply make null.
				String[][] worksheet = null;
				while (true) {
					try {
						line = text.readLine();
					} catch (java.io.IOException err) {
						throw new RuntimeException("Cannot read file: " + err.toString());
					}
					if (line == null)
						break;
					if (line.trim().length() == 0)
						continue;
					if (line.startsWith("Main"))
						worksheet = base[0];
					else if (line.startsWith("EndMain"))
						worksheet = null;
					else if (line.startsWith("Monitor"))
						worksheet = base[1];
					else if (line.startsWith("EndMonitor"))
						worksheet = null;
					else if (line.startsWith("Control"))
						worksheet = base[2];
					else if (line.startsWith("EndControl"))
						worksheet = null;
					else if (line.startsWith("Archive"))
						worksheet = base[3];
					else if (line.startsWith("EndArchive"))
						worksheet = null;
					else {
						if (worksheet == null)
							throw new RuntimeException("Invalid syntax at line number " + text.getLineNumber() + " in file filter. (Missing statement)");
						tmp = line.split("[ |\t]+");
						if (line.startsWith("~")) {
							deleteRow(worksheet,tmp[0].substring(1));
						} else {
							String s = line.substring(tmp[0].length());
							modifyRow(worksheet,text.getLineNumber(),tmp[0],s);
						}
					}
				}
		
				// E. Assign the non-null array.
				String[][][] result = new String [base.length] [] [];
				for (int i = 0; i < result.length; ++i) {
					int nrow = 0;
					for (int j = 0; j < base[i].length; ++j) {
						if (base[i][j] != null)
							++nrow;
					}
					result[i] = new String [nrow] [];
					int jj = 0;
					for (int j = 0; j < base[i].length; ++j) {
						if (base[i][j] != null) {
							result[i][jj] = new String [base[i][j].length];
							for (int k = 0; k < base[i][j].length; ++k)
								result[i][jj][k] = base[i][j][k];
							++jj;
						}
					}
				}
		
				// F. Return the new spreadsheet. 
				return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteRow(final String[][] worksheet, final String name) {
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
	 * @!generated
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
	public void setInitializeSP(final String xml) {
		this.xml = xml;
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
