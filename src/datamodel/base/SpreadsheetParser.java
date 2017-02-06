/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\tjava.io.File dir = new java.io.File(dirName);\r\n\t\t\t\tif (!dir.isDirectory())\r\n\t\t\t\t\tthrow new DesignError (\"Directory \" + dirName + \" does not exist.\");\r\n\t\t\t\tjava.io.File file = new java.io.File(dir, fileName);\r\n\t\t\t\tif (!file.exists())\r\n\t\t\t\t\tthrow new DesignError (\"File \" + fileName + \" in directory \" + dirName + \" does not exist.\");\r\n\t\t\t\tjava.io.BufferedReader in = null;\r\n\t\t\t\tStringBuffer xmlDoc = null;\r\n\t\t\t\tString line = null;\r\n\t\t\t\ttry {\r\n\t\t\t\t\tin = new java.io.BufferedReader(new java.io.FileReader(file));\r\n\t\t\t\t\t//Read the entire file and store in it xmlDoc.\r\n\t\t\t\t\txmlDoc = new StringBuffer();\r\n\t\t\t\t\tline = in.readLine();\r\n\t\t\t\t\twhile (line != null) {\r\n\t\t\t\t\t\txmlDoc.append(line + newline);\r\n\t\t\t\t\t\t//xmlDoc.append(line);\r\n\t\t\t\t\t\tline = in.readLine();\r\n\t\t\t\t\t}\r\n\t\t\t\t\tin.close();\r\n\t\t\t\t} catch (java.io.IOException e) {\r\n\t\t\t\t\tthrow new DesignError(e.getMessage());\r\n\t\t\t\t}\r\n\t\t\t\tString xml = new String(xmlDoc);\r\n\t\t\t\t// Now, the entire xml file is in the string: xml.\r\n\t\t\t\treturn xml;'"
	 * @generated
	 */
	String getSpreadsheet(String dirName, String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint b1 = s.indexOf(beginPart1);\r\n\t\tif (b1 == -1)\r\n\t\t\treturn null;\r\n\t\tint b2 = s.indexOf(beginPart2,b1);\r\n\t\tif (b2 == -1)\r\n\t\t\treturn null;\r\n\t\tint e = s.indexOf(end,b2);\r\n\t\tif (e == -1)\r\n\t\t\treturn null;\r\n\t\tString content = s.substring(b2 + 1,e).trim();\r\n\t\tint n = e + end.length();\r\n\t\tString newS = null;\r\n\t\tif (n < s.length())\r\n\t\t\tnewS = s.substring(n);\r\n\t\treturn new Pair(content,newS);'"
	 * @generated
	 */
	Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.String1DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\t\tjava.util.ArrayList list = new java.util.ArrayList ();\r\n\t\t\t\t\t\tString data = null;\r\n\t\t\t\t\t\tString content = null;\r\n\t\t\t\t\t\twhile (row != null && row.length() > 0) {\r\n\t\t\t\t\t\t\tPair p = getBoundedContent(row,\"<Cell\",\">\",\"</Cell>\");\r\n\t\t\t\t\t\t\tif (p == null)\r\n\t\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\t\tdata = PairImpl.CONTENT_EDEFAULT;\r\n\t\t\t\t\t\t\trow = PairImpl.NEW_STRING_EDEFAULT;\r\n\t\t\t\t\t\t\tp = getBoundedContent(data,\"<Data\",\">\",\"</Data>\");\r\n\t\t\t\t\t\t\tif (p == null)\r\n\t\t\t\t\t\t\t\tcontinue;\r\n\t\t\t\t\t\t\tcontent = PairImpl.CONTENT_EDEFAULT;\r\n\t\t\t\t\t\t\tlist.add(content);\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\tif(list.size() == 0)\r\n\t\t\t\t\t\t\treturn null;\r\n\t\t\t\t\t\tString[] x = new String [list.size()];\r\n\t\t\t\t\t\treturn (String[])list.toArray(x);'"
	 * @generated
	 */
	String[] getDataCells(String row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="datamodel.base.String3DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\tjava.util.ArrayList rowList = null;\r\n\t\t\tjava.util.ArrayList sheetList = null;\r\n\t\t\t\tString sheet = null;\r\n\t\t\t\tString row = null;\r\n\t\t\t\tString[] data = null;\r\n\t\t\t\tsheetList = new java.util.ArrayList ();\r\n\t\t\t\tString doc = new String (xml);\r\n\t\t\t\tif (doc.startsWith(\"@reference\")) {\r\n\t\t\t\t\trefStatus = true;\r\n\t\t\t\t\treturn filter(doc);\r\n\t\t\t\t}\r\n\t\t\t\tPair p = null;\r\n\t\t\t\twhile (doc != null && doc.length() > 0) {\r\n\t\t\t\t\tp = getBoundedContent(doc,\"<Worksheet\",\">\",\"</Worksheet>\");\r\n\t\t\t\t\tif (p == null)\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\tsheet = PairImpl.CONTENT_EDEFAULT;\r\n\t\t\t\t\tdoc = PairImpl.NEW_STRING_EDEFAULT;\r\n\t\t\t\t\trowList = new java.util.ArrayList ();\r\n\t\t\t\t\twhile (sheet != null && sheet.length() > 0) {\r\n\t\t\t\t\t\tPair p2 = getBoundedContent(sheet,\"<Row\",\">\",\"</Row>\");\r\n\t\t\t\t\t\tif (p2 == null)\r\n\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\trow = PairImpl.CONTENT_EDEFAULT;\r\n\t\t\t\t\t\tsheet = PairImpl.NEW_STRING_EDEFAULT;\r\n\t\t\t\t\t\tdata = getDataCells(row);\r\n\t\t\t\t\t\tif (data != null)\r\n\t\t\t\t\t\t\trowList.add(data);\r\n\t\t\t\t\t}\r\n\t\t\t\t\tsheetList.add(rowList);\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\t\tif(p == null){\r\n\t\t\t\t\tdoc = new String(xml);\r\n\t\t\t\t\twhile (doc != null && doc.length() > 0) {\r\n\t\t\t\t\t\tp = getBoundedContent(doc,\"<ss:Worksheet\",\">\",\"</ss:Worksheet>\");\r\n\t\t\t\t\t\tif(p == null)\r\n\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\tsheet = PairImpl.CONTENT_EDEFAULT;\r\n\t\t\t\t\t\tdoc = PairImpl.NEW_STRING_EDEFAULT;\r\n\t\t\t\t\t\trowList = new java.util.ArrayList ();\r\n\t\t\t\t\t\twhile (sheet != null && sheet.length() > 0) {\r\n\t\t\t\t\t\t\tPair p2 = getBoundedContent(sheet,\"<Row\",\">\",\"</Row>\");\r\n\t\t\t\t\t\t\tif (p2 == null)\r\n\t\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\t\trow = PairImpl.CONTENT_EDEFAULT;\r\n\t\t\t\t\t\t\tsheet = PairImpl.NEW_STRING_EDEFAULT;\r\n\t\t\t\t\t\t\tdata = getDataCells(row);\r\n\t\t\t\t\t\t\tif (data != null)\r\n\t\t\t\t\t\t\t\trowList.add(data);\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\tsheetList.add(rowList);\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\r\n\t\t\t\tString[][][] result = new String [sheetList.size()][][];\r\n\t\t\t\tfor (int i = 0; i < result.length; ++i) {\r\n\t\t\t\t\tjava.util.ArrayList x = (java.util.ArrayList)sheetList.get(i);\r\n\t\t\t\t\tresult[i] = new String [x.size()][];\r\n\t\t\t\t\tfor (int j = 0; j < result[i].length; ++j) {\r\n\t\t\t\t\t\tString[] y = (String[])x.get(j);\r\n\t\t\t\t\t\tresult[i][j] = new String [y.length];\r\n\t\t\t\t\t\tfor (int k = 0; k < y.length; ++k)\r\n\t\t\t\t\t\t\tresult[i][j][k] = y[k];\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\treturn result;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\tjava.io.LineNumberReader text = new java.io.LineNumberReader(new java.io.StringReader(doc));\r\n\t\t\t\tString line = null;\r\n\t\t\t\ttry {\r\n\t\t\t\t\tline = text.readLine();\r\n\t\t\t\t} catch (java.io.IOException err) {\r\n\t\t\t\t\tthrow new DesignError(\"Cannot read file: \" + err.toString());\r\n\t\t\t\t}\r\n\t\t\t\tString[] tmp = line.split(\"[ |\\t]+\");\r\n\t\t\t\tif (!tmp[0].equals(\"@reference\") || !tmp[1].equals(\"=\") || !tmp[4].equals(\"=\")) {\r\n\t\t\t\t\tthrow new DesignError(\"Invalid syntax at line number \" + text.getLineNumber() + \" in file filter.\");\r\n\t\t\t\t}\r\n\t\t\t\tString baseDirectory = tmp[2];\r\n\t\t\t\tString baseAssemblyName = tmp[3];\r\n\t\t\t\tString newAssemblyName = tmp[5];\r\n\t\t\t\tSystem.out.println(\"Applying filter in directory \" + baseDirectory + \r\n\t\t\t\t\t\t\" to assembly \" + baseAssemblyName + \".  New assembly is \" + newAssemblyName + \".\");\r\n\t\t\t\t\r\n\t\t\t\t// B. Get the contents of this base spreadsheet.\r\n\t\t\t\tString referenceXml = getSpreadsheet(baseDirectory, baseAssemblyName + \"_spreadsheet.xml\");\r\n\t\t\t\trefPath = baseDirectory + \"/\" + baseAssemblyName + \"_spreadsheet.xml\";\r\n\t\t\t\tSpreadsheetParser p = BaseFactory.eINSTANCE.createSpreadsheetParser(referenceXml);\r\n\t\t\t\tSpreadsheetValidator v = BaseFactory.eINSTANCE.createSpreadsheetValidator();\r\n\t\t\t\tif (!v.validate(refPath,xsdFile)) {\r\n\t\t\t\t\tString s = \"Spreadsheet \" + baseAssemblyName + \"_spreadsheet.xml is not a valid spreadsheet.\";\r\n\t\t\t\t\tthrow new DesignError(s);\r\n\t\t\t\t}\r\n\t\t\t\tSystem.out.println(\"Base spreadsheet \" + baseAssemblyName + \" has been validated.\");\r\n\t\t\t\tString[][][] base = p.getWorksheets();\r\n\t\t\t\t\r\n\t\t\t\t// C. Change the assembly name in the base spreadsheet.\r\n\t\t\t\tfor (int i = 0; i < base.length; ++i) {\r\n\t\t\t\t\tfor (int j = 0; j < base[i].length; ++j) {\r\n\t\t\t\t\t\tif (base[i][j][0].equals(baseAssemblyName)) {\r\n\t\t\t\t\t\t\tbase[i][j][0] = newAssemblyName;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\t\t\r\n\t\t\t\t// D. Apply the filter to the base.\r\n\t\t\t\t//    Any deleted rows we will simply make null.\r\n\t\t\t\tString[][] worksheet = null;\r\n\t\t\t\twhile (true) {\r\n\t\t\t\t\ttry {\r\n\t\t\t\t \t\tline = text.readLine();\r\n\t\t\t\t\t} catch (java.io.IOException err) {\r\n\t\t\t\t\t\tthrow new DesignError(\"Cannot read file: \" + err.toString());\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif (line == null)\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\tif (line.trim().length() == 0)\r\n\t\t\t\t\t\tcontinue;\r\n\t\t\t\t\tif (line.startsWith(\"Main\"))\r\n\t\t\t\t\t\tworksheet = base[0];\r\n\t\t\t\t\telse if (line.startsWith(\"EndMain\"))\r\n\t\t\t\t\t\tworksheet = null;\r\n\t\t\t\t\telse if (line.startsWith(\"Monitor\"))\r\n\t\t\t\t\t\tworksheet = base[1];\r\n\t\t\t\t\telse if (line.startsWith(\"EndMonitor\"))\r\n\t\t\t\t\t\tworksheet = null;\r\n\t\t\t\t\telse if (line.startsWith(\"Control\"))\r\n\t\t\t\t\t\tworksheet = base[2];\r\n\t\t\t\t\telse if (line.startsWith(\"EndControl\"))\r\n\t\t\t\t\t\tworksheet = null;\r\n\t\t\t\t\telse if (line.startsWith(\"Archive\"))\r\n\t\t\t\t\t\tworksheet = base[3];\r\n\t\t\t\t\telse if (line.startsWith(\"EndArchive\"))\r\n\t\t\t\t\t\tworksheet = null;\r\n\t\t\t\t\telse {\r\n\t\t\t\t\t\tif (worksheet == null)\r\n\t\t\t\t\t\t\tthrow new DesignError(\"Invalid syntax at line number \" + text.getLineNumber() + \" in file filter. (Missing statement)\");\r\n\t\t\t\t\t\ttmp = line.split(\"[ |\\t]+\");\r\n\t\t\t\t\t\tif (line.startsWith(\"~\")) {\r\n\t\t\t\t\t\t\tdeleteRow(worksheet,tmp[0].substring(1));\r\n\t\t\t\t\t\t} else {\r\n\t\t\t\t\t\t\tString s = line.substring(tmp[0].length());\r\n\t\t\t\t\t\t\tmodifyRow(worksheet,text.getLineNumber(),tmp[0],s);\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t// E. Assign the non-null array.\r\n\t\t\t\tString[][][] result = new String [base.length] [] [];\r\n\t\t\t\tfor (int i = 0; i < result.length; ++i) {\r\n\t\t\t\t\tint nrow = 0;\r\n\t\t\t\t\tfor (int j = 0; j < base[i].length; ++j) {\r\n\t\t\t\t\t\tif (base[i][j] != null)\r\n\t\t\t\t\t\t\t++nrow;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tresult[i] = new String [nrow] [];\r\n\t\t\t\t\tint jj = 0;\r\n\t\t\t\t\tfor (int j = 0; j < base[i].length; ++j) {\r\n\t\t\t\t\t\tif (base[i][j] != null) {\r\n\t\t\t\t\t\t\tresult[i][jj] = new String [base[i][j].length];\r\n\t\t\t\t\t\t\tfor (int k = 0; k < base[i][j].length; ++k)\r\n\t\t\t\t\t\t\t\tresult[i][jj][k] = base[i][j][k];\r\n\t\t\t\t\t\t\t++jj;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t// F. Return the new spreadsheet. \r\n\t\t\t\treturn result;'"
	 * @generated
	 */
	String[][][] filter(String doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="datamodel.base.String2DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (worksheet[0][0].equals(\"Hardware Device\")) {\r\n\t\t\tfor (int i = 2; i < worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][0].equals(name)) {\r\n\t\t\t\t\tworksheet[i] = null;\r\n\t\t\t\t\treturn;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tthrow new DesignError(\"The name \" + name + \" is not the name of a row in the Main worksheet.\");\r\n\t\t}\r\n\t\tfor (int i = 2; i < worksheet.length; ++i) {\r\n\t\t\tif (worksheet[i] == null)\r\n\t\t\t\tcontinue;\r\n\t\t\tif (worksheet[i][1].equals(name)) {\r\n\t\t\t\tworksheet[i] = null;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t\tthrow new DesignError(\"The name \" + name + \" is not the name of a row in the \" + worksheet[0][0] + \" worksheet.\");'"
	 * @generated
	 */
	void deleteRow(String[][] worksheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="datamodel.base.String2DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// Find the row.\r\n\t\tint row = 0;\r\n\t\tif (worksheet[0][0].equals(\"Hardware Device\")) {\r\n\t\t\tint i = 2;\r\n\t\t\tfor (; i < worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][0].equals(rowName)) {\r\n\t\t\t\t\trow = i;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (i == worksheet.length)\r\n\t\t\t\tthrow new DesignError(\"The name \" + rowName + \" is not the name of a row in the Main worksheet.\");\r\n\t\t} else {\r\n\t\t\tint i = 2;\r\n\t\t\tfor (; i < worksheet.length; ++i) {\r\n\t\t\t\tif (worksheet[i] == null)\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\tif (worksheet[i][1].equals(rowName)) {\r\n\t\t\t\t\trow = i;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (i == worksheet.length)\r\n\t\t\t\tthrow new DesignError(\"The name \" + rowName + \" is not the name of a row in the \" + worksheet[0][0] + \" worksheet.\");\r\n\t\t}\r\n\t\tString name;\r\n\t\tString value;\r\n\t\tint b;\r\n\t\tint m;\r\n\t\tint e;        \t\t\t\t\r\n\t\twhile(true) {\r\n\t\t\tb = s.indexOf(\'<\');\r\n\t\t\tm = s.indexOf(\'=\');\r\n\t\t\te = s.indexOf(\'>\');\r\n\t\t\tif (b == -1 || m == -1 || e == -1 || m < b || e < m) {\r\n\t\t\t\tthrow new DesignError(\"Invalid syntax at line number \" + lineNumber + \" in file filter.\");\r\n\t\t\t}\r\n\t\t\tname = s.substring(b + 1, m).trim();\r\n\t\t\tvalue = s.substring(m + 1, e).trim();\r\n\t\t\t// Apply the change.\r\n\t\t\tint j = 0;\r\n\t\t\tfor (; j < worksheet[row].length; ++j) {\r\n\t\t\t\tif (worksheet[1][j].equals(name)) {\r\n\t\t\t\t\tworksheet[row][j] = value;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (j == worksheet[row].length)\r\n\t\t\t\tthrow new DesignError(\"The name \" + name + \" is not the name of a column in the \" + worksheet[0][0] + \" worksheet.\");\r\n\t\t\t// Get the next change.\r\n\t\t\t++e;\r\n\t\t\twhile (e < s.length() && (s.charAt(e) == \' \' || s.charAt(e) == \'\\t\'))\r\n\t\t\t\t++e;\r\n\t\t\tif (e == s.length())\r\n\t\t\t\tbreak;\r\n\t\t\ts = s.substring(e);\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t\t'"
	 * @generated
	 */
	void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s);

} // SpreadsheetParser
