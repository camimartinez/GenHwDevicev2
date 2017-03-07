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
package alma.control.datamodel.meta.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.SpreadsheetParser#getXml <em>Xml</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.SpreadsheetParser#getNewline <em>Newline</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getSpreadsheetParser()
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getSpreadsheetParser_RefPath()
	 * @model
	 * @generated
	 */
	String getRefPath();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getSpreadsheetParser_RefStatus()
	 * @model default="false"
	 * @generated
	 */
	boolean isRefStatus();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getSpreadsheetParser_Xml()
	 * @model
	 * @generated
	 */
	String getXml();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getXml <em>Xml</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getSpreadsheetParser_XsdFile()
	 * @model
	 * @generated
	 */
	String getXsdFile();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getSpreadsheetParser_Newline()
	 * @model default=""
	 * @generated
	 */
	String getNewline();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.SpreadsheetParser#getNewline <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newline</em>' attribute.
	 * @see #getNewline()
	 * @generated
	 */
	void setNewline(String value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint b1 = s.indexOf(beginPart1);\n\t\tif (b1 == -1)\n\t\t\treturn null;\n\t\tint b2 = s.indexOf(beginPart2,b1);\n\t\tif (b2 == -1)\n\t\t\treturn null;\n\t\tint e = s.indexOf(end,b2);\n\t\tif (e == -1)\n\t\t\treturn null;\n\t\tString content = s.substring(b2 + 1,e).trim();\n\t\tint n = e + end.length();\n\t\tString newS = null;\n\t\tif (n &lt; s.length())\n\t\t\tnewS = s.substring(n);\n\t\tPairImpl pp = new PairImpl() {};\n\t\tpp.setInitializePair(content,newS);\n\t\treturn pp;'"
	 * @generated
	 */
	Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tArrayList list = new ArrayList ();\n\t\tString data = null;\n\t\tString content = null;\n\t\twhile (row != null &amp;&amp; row.length() &gt; 0) {\n\t\t\tPair p = getBoundedContent(row,\"&lt;Cell\",\"&gt;\",\"&lt;/Cell&gt;\");\n\t\t\tif (p == null)\n\t\t\t\tbreak;\n\t\t\tdata = p.getContent();\n\t\t\trow = p.getNewString();\n\t\t\tp = getBoundedContent(data,\"&lt;Data\",\"&gt;\",\"&lt;/Data&gt;\");\n\t\t\tif (p == null)\n\t\t\t\tcontinue;\n\t\t\tcontent = p.getContent();\n\t\t\tlist.add(content);\n\t\t}\n\t\tif(list.size() == 0)\n\t\t\treturn null;\n\t\tString[] x = new String [list.size()];\n\t\treturn (String[])list.toArray(x);'"
	 * @generated
	 */
	String[] getDataCells(String row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alma.control.datamodel.meta.base.EStringArray3"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ArrayList rowList = null;\n\t\tArrayList sheetList = null;\n\t\tString sheet = null;\n\t\tString row = null;\n\t\tString[] data = null;\n\t\tsheetList = new ArrayList ();\n\t\tString doc = new String (xml);\n\t\tif (doc.startsWith(\"@reference\")) {\n\t\t\trefStatus = true;\n\t\t\treturn filter(doc);\n\t\t}\n\t\tPair p = null;\n\t\twhile (doc != null &amp;&amp; doc.length() &gt; 0) {\n\t\t\tp = getBoundedContent(doc,\"&lt;Worksheet\",\"&gt;\",\"&lt;/Worksheet&gt;\");\n\t\t\tif (p == null)\n\t\t\t\tbreak;\n\t\t\tsheet = p.getContent();\n\t\t\tdoc = p.getNewString();\n\t\t\trowList = new ArrayList ();\n\t\t\twhile (sheet != null &amp;&amp; sheet.length() &gt; 0) {\n\t\t\t\tPair p2 = getBoundedContent(sheet,\"&lt;Row\",\"&gt;\",\"&lt;/Row&gt;\");\n\t\t\t\tif (p2 == null)\n\t\t\t\t\tbreak;\n\t\t\t\trow = p2.getContent();\n\t\t\t\tsheet = p2.getNewString();\n\t\t\t\tdata = getDataCells(row);\n\t\t\t\tif (data != null)\n\t\t\t\t\trowList.add(data);\n\t\t\t}\n\t\t\tsheetList.add(rowList);\n\t\t}\n\n\t\tif(p == null){\n\t\t\tdoc = new String(xml);\n\t\t\twhile (doc != null &amp;&amp; doc.length() &gt; 0) {\n\t\t\t\tp = getBoundedContent(doc,\"&lt;ss:Worksheet\",\"&gt;\",\"&lt;/ss:Worksheet&gt;\");\n\t\t\t\tif(p == null)\n\t\t\t\t\tbreak;\n\t\t\t\tsheet = p.getContent();\n\t\t\t\tdoc = p.getNewString();\n\t\t\t\trowList = new ArrayList ();\n\t\t\t\twhile (sheet != null &amp;&amp; sheet.length() &gt; 0) {\n\t\t\t\t\tPair p2 = getBoundedContent(sheet,\"&lt;Row\",\"&gt;\",\"&lt;/Row&gt;\");\n\t\t\t\t\tif (p2 == null)\n\t\t\t\t\t\tbreak;\n\t\t\t\t\trow = p2.getContent();\n\t\t\t\t\tsheet = p2.getNewString();\n\t\t\t\t\tdata = getDataCells(row);\n\t\t\t\t\tif (data != null)\n\t\t\t\t\t\trowList.add(data);\n\t\t\t\t}\n\t\t\t\tsheetList.add(rowList);\n\t\t\t}\n\t\t}\n\n\n\t\tString[][][] result = new String [sheetList.size()][][];\n\t\tfor (int i = 0; i &lt; result.length; ++i) {\n\t\t\tArrayList x = (ArrayList)sheetList.get(i);\n\t\t\tresult[i] = new String [x.size()][];\n\t\t\tfor (int j = 0; j &lt; result[i].length; ++j) {\n\t\t\t\tString[] y = (String[])x.get(j);\n\t\t\t\tresult[i][j] = new String [y.length];\n\t\t\t\tfor (int k = 0; k &lt; y.length; ++k)\n\t\t\t\t\tresult[i][j][k] = y[k];\n\t\t\t}\n\t\t}\n\t\treturn result;'"
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
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray3"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t// A. Get the directory that is referenced, and the old and new assembly names.\n\t\t// Syntax: @reference = &lt;base-directory-path-name&gt; &lt;base-assembly-name&gt; = &lt;new-assembly-name&gt;\n\t\tjava.io.LineNumberReader text = new java.io.LineNumberReader(new java.io.StringReader(doc));\n\t\tString line = null;\n\t\ttry {\n\t\t\tline = text.readLine();\n\t\t} catch (java.io.IOException err) {\n\t\t\tthrow new RuntimeException(\"Cannot read file: \" + err.toString());\n\t\t}\n\t\tString[] tmp = line.split(\"[ |\\t]+\");\n\t\tif (!tmp[0].equals(\"@reference\") || !tmp[1].equals(\"=\") || !tmp[4].equals(\"=\")) {\n\t\t\tthrow new RuntimeException(\"Invalid syntax at line number \" + text.getLineNumber() + \" in file filter.\");\n\t\t}\n\t\tString baseDirectory = tmp[2];\n\t\tString baseAssemblyName = tmp[3];\n\t\tString newAssemblyName = tmp[5];\n\t\tSystem.out.println(\"Applying filter in directory \" + baseDirectory + \n\t\t\t\t\" to assembly \" + baseAssemblyName + \".  New assembly is \" + newAssemblyName + \".\");\n\n\t\t// B. Get the contents of this base spreadsheet.\n\t\tBaseFactory baseFac = BaseFactory.eINSTANCE;\n\t\tString referenceXml = baseFac.createSpreadsheetParser().getSpreadsheet(baseDirectory, baseAssemblyName + \"_spreadsheet.xml\");\n\t\trefPath = baseDirectory + \"/\" + baseAssemblyName + \"_spreadsheet.xml\";\n\t\tSpreadsheetParser p = baseFac.createSpreadsheetParser(referenceXml);\n\t\tSpreadsheetValidator v = baseFac.createSpreadsheetValidator();\n\t\tif (!v.validate(refPath,xsdFile)) {\n\t\t\tString s = \"Spreadsheet \" + baseAssemblyName + \"_spreadsheet.xml is not a valid spreadsheet.\";\n\t\t\tthrow new RuntimeException(s);\n\t\t}\n\t\tSystem.out.println(\"Base spreadsheet \" + baseAssemblyName + \" has been validated.\");\n\t\tString[][][] base = p.getWorksheets();\n\n\t\t// C. Change the assembly name in the base spreadsheet.\n\t\tfor (int i = 0; i &lt; base.length; ++i) {\n\t\t\tfor (int j = 0; j &lt; base[i].length; ++j) {\n\t\t\t\tif (base[i][j][0].equals(baseAssemblyName)) {\n\t\t\t\t\tbase[i][j][0] = newAssemblyName;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\n\t\t// D. Apply the filter to the base.\n\t\t//    Any deleted rows we will simply make null.\n\t\tString[][] worksheet = null;\n\t\twhile (true) {\n\t\t\ttry {\n\t\t\t\tline = text.readLine();\n\t\t\t} catch (java.io.IOException err) {\n\t\t\t\tthrow new RuntimeException(\"Cannot read file: \" + err.toString());\n\t\t\t}\n\t\t\tif (line == null)\n\t\t\t\tbreak;\n\t\t\tif (line.trim().length() == 0)\n\t\t\t\tcontinue;\n\t\t\tif (line.startsWith(\"Main\"))\n\t\t\t\tworksheet = base[0];\n\t\t\telse if (line.startsWith(\"EndMain\"))\n\t\t\t\tworksheet = null;\n\t\t\telse if (line.startsWith(\"Monitor\"))\n\t\t\t\tworksheet = base[1];\n\t\t\telse if (line.startsWith(\"EndMonitor\"))\n\t\t\t\tworksheet = null;\n\t\t\telse if (line.startsWith(\"Control\"))\n\t\t\t\tworksheet = base[2];\n\t\t\telse if (line.startsWith(\"EndControl\"))\n\t\t\t\tworksheet = null;\n\t\t\telse if (line.startsWith(\"Archive\"))\n\t\t\t\tworksheet = base[3];\n\t\t\telse if (line.startsWith(\"EndArchive\"))\n\t\t\t\tworksheet = null;\n\t\t\telse {\n\t\t\t\tif (worksheet == null)\n\t\t\t\t\tthrow new RuntimeException(\"Invalid syntax at line number \" + text.getLineNumber() + \" in file filter. (Missing statement)\");\n\t\t\t\ttmp = line.split(\"[ |\\t]+\");\n\t\t\t\tif (line.startsWith(\"~\")) {\n\t\t\t\t\tdeleteRow(worksheet,tmp[0].substring(1));\n\t\t\t\t} else {\n\t\t\t\t\tString s = line.substring(tmp[0].length());\n\t\t\t\t\tmodifyRow(worksheet,text.getLineNumber(),tmp[0],s);\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\n\t\t// E. Assign the non-null array.\n\t\tString[][][] result = new String [base.length] [] [];\n\t\tfor (int i = 0; i &lt; result.length; ++i) {\n\t\t\tint nrow = 0;\n\t\t\tfor (int j = 0; j &lt; base[i].length; ++j) {\n\t\t\t\tif (base[i][j] != null)\n\t\t\t\t\t++nrow;\n\t\t\t}\n\t\t\tresult[i] = new String [nrow] [];\n\t\t\tint jj = 0;\n\t\t\tfor (int j = 0; j &lt; base[i].length; ++j) {\n\t\t\t\tif (base[i][j] != null) {\n\t\t\t\t\tresult[i][jj] = new String [base[i][j].length];\n\t\t\t\t\tfor (int k = 0; k &lt; base[i][j].length; ++k)\n\t\t\t\t\t\tresult[i][jj][k] = base[i][j][k];\n\t\t\t\t\t++jj;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\n\t\t// F. Return the new spreadsheet. \n\t\treturn result;'"
	 * @generated
	 */
	String[][][] filter(String doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="alma.control.datamodel.meta.base.EStringArray2"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (worksheet[0][0].equals(\"Hardware Device\")) {\r\n\t\t\tfor (int i = 2; i &lt; worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][0].equals(name)) {\r\n\t\t\t\t\tworksheet[i] = null;\r\n\t\t\t\t\treturn;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tthrow new RuntimeException(\"The name \" + name + \" is not the name of a row in the Main worksheet.\");\r\n\t\t}\r\n\t\tfor (int i = 2; i &lt; worksheet.length; ++i) {\r\n\t\t\tif (worksheet[i] == null)\r\n\t\t\t\tcontinue;\r\n\t\t\tif (worksheet[i][1].equals(name)) {\r\n\t\t\t\tworksheet[i] = null;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t\tthrow new RuntimeException(\"The name \" + name + \" is not the name of a row in the \" + worksheet[0][0] + \" worksheet.\");'"
	 * @generated
	 */
	void deleteRow(String[][] worksheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="alma.control.datamodel.meta.base.EStringArray2"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t// Find the row.\r\n\t\tint row = 0;\r\n\t\tif (worksheet[0][0].equals(\"Hardware Device\")) {\r\n\t\t\tint i = 2;\r\n\t\t\tfor (; i &lt; worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][0].equals(rowName)) {\r\n\t\t\t\t\trow = i;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (i == worksheet.length)\r\n\t\t\t\tthrow new RuntimeException(\"The name \" + rowName + \" is not the name of a row in the Main worksheet.\");\r\n\t\t} else {\r\n\t\t\tint i = 2;\r\n\t\t\tfor (; i &lt; worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][1].equals(rowName)) {\r\n\t\t\t\t\trow = i;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (i == worksheet.length)\r\n\t\t\t\tthrow new RuntimeException(\"The name \" + rowName + \" is not the name of a row in the \" + worksheet[0][0] + \" worksheet.\");\r\n\t\t}\r\n\t\tString name;\r\n\t\tString value;\r\n\t\tint b;\r\n\t\tint m;\r\n\t\tint e;        \t\t\t\t\r\n\t\twhile(true) {\r\n\t\t\tb = s.indexOf(\'&lt;\');\r\n\t\t\tm = s.indexOf(\'=\');\r\n\t\t\te = s.indexOf(\'&gt;\');\r\n\t\t\tif (b == -1 || m == -1 || e == -1 || m &lt; b || e &lt; m) {\r\n\t\t\t\tthrow new RuntimeException(\"Invalid syntax at line number \" + lineNumber + \" in file filter.\");\r\n\t\t\t}\r\n\t\t\tname = s.substring(b + 1, m).trim();\r\n\t\t\tvalue = s.substring(m + 1, e).trim();\r\n\t\t\t// Apply the change.\r\n\t\t\tint j = 0;\r\n\t\t\tfor (; j &lt; worksheet[row].length; ++j) {\r\n\t\t\t\tif (worksheet[1][j].equals(name)) {\r\n\t\t\t\t\tworksheet[row][j] = value;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (j == worksheet[row].length)\r\n\t\t\t\tthrow new RuntimeException(\"The name \" + name + \" is not the name of a column in the \" + worksheet[0][0] + \" worksheet.\");\r\n\t\t\t// Get the next change.\r\n\t\t\t++e;\r\n\t\t\twhile (e &lt; s.length() &amp;&amp; (s.charAt(e) == \' \' || s.charAt(e) == \'\\t\'))\r\n\t\t\t\t++e;\r\n\t\t\tif (e == s.length())\r\n\t\t\t\tbreak;\r\n\t\t\ts = s.substring(e);\r\n\t\t}'"
	 * @generated
	 */
	void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.xml = xml;'"
	 * @generated
	 */
	void setInitializeSP(String xml);

} // SpreadsheetParser
