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
package datamodel.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getXml <em>Xml</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getNewline <em>Newline</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getSetNewContent <em>Set New Content</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getTovalidateSpreads <em>Tovalidate Spreads</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getSpreadsheetParser()
 * @model
 * @generated
 */
public interface SpreadsheetParser extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Path</em>' attribute.
	 * @see #setRefPath(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_RefPath()
	 * @model
	 * @generated
	 */
	String getRefPath();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Path</em>' attribute.
	 * @see #getRefPath()
	 * @generated
	 */
	void setRefPath(String value);

	/**
	 * Returns the value of the '<em><b>Ref Status</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Status</em>' attribute.
	 * @see #setRefStatus(boolean)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_RefStatus()
	 * @model default="false"
	 * @generated
	 */
	boolean isRefStatus();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Status</em>' attribute.
	 * @see #isRefStatus()
	 * @generated
	 */
	void setRefStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' attribute.
	 * @see #setXml(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_Xml()
	 * @model
	 * @generated
	 */
	String getXml();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getXml <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' attribute.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(String value);

	/**
	 * Returns the value of the '<em><b>Xsd File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd File</em>' attribute.
	 * @see #setXsdFile(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_XsdFile()
	 * @model
	 * @generated
	 */
	String getXsdFile();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd File</em>' attribute.
	 * @see #getXsdFile()
	 * @generated
	 */
	void setXsdFile(String value);

	/**
	 * Returns the value of the '<em><b>Newline</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newline</em>' attribute.
	 * @see #setNewline(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_Newline()
	 * @model default=""
	 * @generated
	 */
	String getNewline();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getNewline <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newline</em>' attribute.
	 * @see #getNewline()
	 * @generated
	 */
	void setNewline(String value);

	/**
	 * Returns the value of the '<em><b>Set New Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set New Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set New Content</em>' containment reference.
	 * @see #setSetNewContent(Pair)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_SetNewContent()
	 * @model containment="true"
	 * @generated
	 */
	Pair getSetNewContent();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getSetNewContent <em>Set New Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set New Content</em>' containment reference.
	 * @see #getSetNewContent()
	 * @generated
	 */
	void setSetNewContent(Pair value);

	/**
	 * Returns the value of the '<em><b>Tovalidate Spreads</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tovalidate Spreads</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tovalidate Spreads</em>' reference.
	 * @see #setTovalidateSpreads(SpreadsheetValidator)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_TovalidateSpreads()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getTovalidateSpreads();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getTovalidateSpreads <em>Tovalidate Spreads</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tovalidate Spreads</em>' reference.
	 * @see #getTovalidateSpreads()
	 * @generated
	 */
	void setTovalidateSpreads(SpreadsheetValidator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tjava.io.File dir = new java.io.File(dirName);\r\n\t\tif (!dir.isDirectory())\r\n\t\t\tthrow new RuntimeException (\"Directory \" + dirName + \" does not exist.\");\r\n\t\tjava.io.File file = new java.io.File(dir, fileName);\r\n\t\tif (!file.exists())\r\n\t\t\tthrow new RuntimeException (\"File \" + fileName + \" in directory \" + dirName + \" does not exist.\");\r\n\t\tjava.io.BufferedReader in = null;\r\n\t\tStringBuffer xmlDoc = null;\r\n\t\tString line = null;\r\n\t\ttry {\r\n\t\t\tin = new java.io.BufferedReader(new java.io.FileReader(file));\r\n\t\t\t//Read the entire file and store in it xmlDoc.\r\n\t\t\txmlDoc = new StringBuffer();\r\n\t\t\tline = in.readLine();\r\n\t\t\twhile (line != null) {\r\n\t\t\t\txmlDoc.append(line + newline);\r\n\t\t\t\t//xmlDoc.append(line);\r\n\t\t\t\tline = in.readLine();\r\n\t\t\t}\r\n\t\t\tin.close();\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\tthrow new RuntimeException(e.getMessage());\r\n\t\t}\r\n\t\tString xml = new String(xmlDoc);\r\n\t\t// Now, the entire xml file is in the string: xml.\r\n\t\treturn xml;'"
	 * @generated
	 */
	String getSpreadsheet(String dirName, String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getDataCells(String row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="datamodel.base.String3DT"
	 * @generated
	 */
	String[][][] getWorksheets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return refStatus;\r\n'"
	 * @generated
	 */
	boolean isReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return refPath;'"
	 * @generated
	 */
	String getReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='xsdFile = xsd;'"
	 * @generated
	 */
	void setXSD(String xsd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.String3DT"
	 * @generated
	 */
	String[][][] filter(String doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="datamodel.base.String2DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (worksheet[0][0].equals(\"Hardware Device\")) {\r\n\t\t\tfor (int i = 2; i < worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][0].equals(name)) {\r\n\t\t\t\t\tworksheet[i] = null;\r\n\t\t\t\t\treturn;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tthrow new RuntimeException(\"The name \" + name + \" is not the name of a row in the Main worksheet.\");\r\n\t\t}\r\n\t\tfor (int i = 2; i < worksheet.length; ++i) {\r\n\t\t\tif (worksheet[i] == null)\r\n\t\t\t\tcontinue;\r\n\t\t\tif (worksheet[i][1].equals(name)) {\r\n\t\t\t\tworksheet[i] = null;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t\tthrow new RuntimeException(\"The name \" + name + \" is not the name of a row in the \" + worksheet[0][0] + \" worksheet.\");'"
	 * @generated
	 */
	void deleteRow(String[][] worksheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="datamodel.base.String2DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t// Find the row.\r\n\t\tint row = 0;\r\n\t\tif (worksheet[0][0].equals(\"Hardware Device\")) {\r\n\t\t\tint i = 2;\r\n\t\t\tfor (; i < worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][0].equals(rowName)) {\r\n\t\t\t\t\trow = i;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (i == worksheet.length)\r\n\t\t\t\tthrow new RuntimeException(\"The name \" + rowName + \" is not the name of a row in the Main worksheet.\");\r\n\t\t} else {\r\n\t\t\tint i = 2;\r\n\t\t\tfor (; i < worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][1].equals(rowName)) {\r\n\t\t\t\t\trow = i;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (i == worksheet.length)\r\n\t\t\t\tthrow new RuntimeException(\"The name \" + rowName + \" is not the name of a row in the \" + worksheet[0][0] + \" worksheet.\");\r\n\t\t}\r\n\t\tString name;\r\n\t\tString value;\r\n\t\tint b;\r\n\t\tint m;\r\n\t\tint e;        \t\t\t\t\r\n\t\twhile(true) {\r\n\t\t\tb = s.indexOf(\'<\');\r\n\t\t\tm = s.indexOf(\'=\');\r\n\t\t\te = s.indexOf(\'>\');\r\n\t\t\tif (b == -1 || m == -1 || e == -1 || m < b || e < m) {\r\n\t\t\t\tthrow new RuntimeException(\"Invalid syntax at line number \" + lineNumber + \" in file filter.\");\r\n\t\t\t}\r\n\t\t\tname = s.substring(b + 1, m).trim();\r\n\t\t\tvalue = s.substring(m + 1, e).trim();\r\n\t\t\t// Apply the change.\r\n\t\t\tint j = 0;\r\n\t\t\tfor (; j < worksheet[row].length; ++j) {\r\n\t\t\t\tif (worksheet[1][j].equals(name)) {\r\n\t\t\t\t\tworksheet[row][j] = value;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (j == worksheet[row].length)\r\n\t\t\t\tthrow new RuntimeException(\"The name \" + name + \" is not the name of a column in the \" + worksheet[0][0] + \" worksheet.\");\r\n\t\t\t// Get the next change.\r\n\t\t\t++e;\r\n\t\t\twhile (e < s.length() && (s.charAt(e) == \' \' || s.charAt(e) == \'\\t\'))\r\n\t\t\t\t++e;\r\n\t\t\tif (e == s.length())\r\n\t\t\t\tbreak;\r\n\t\t\ts = s.substring(e);\r\n\t\t}'"
	 * @generated
	 */
	void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s);

} // SpreadsheetParser
