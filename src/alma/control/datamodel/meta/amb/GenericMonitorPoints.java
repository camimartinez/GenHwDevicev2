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
package alma.control.datamodel.meta.amb;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Monitor Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getBase <em>Base</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getParserSpreadsheet <em>Parser Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getValidateSpreadsheet <em>Validate Spreadsheet</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints()
 * @model
 * @generated
 */
public interface GenericMonitorPoints extends EObject {
	/**
	 * Returns the value of the '<em><b>New Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Spreadsheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Spreadsheet</em>' attribute.
	 * @see #setNewSpreadsheet(String[][][])
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_NewSpreadsheet()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray3"
	 * @generated
	 */
	String[][][] getNewSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Spreadsheet</em>' attribute.
	 * @see #getNewSpreadsheet()
	 * @generated
	 */
	void setNewSpreadsheet(String[][][] value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Location</em>' attribute.
	 * @see #setDirLocation(String)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_DirLocation()
	 * @model
	 * @generated
	 */
	String getDirLocation();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Location</em>' attribute.
	 * @see #getDirLocation()
	 * @generated
	 */
	void setDirLocation(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(BaseFactory)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_Base()
	 * @model default="" dataType="alma.control.datamodel.meta.amb.BaseFactoryDT"
	 * @generated
	 */
	BaseFactory getBase();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(BaseFactory value);

	/**
	 * Returns the value of the '<em><b>Parser Spreadsheet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser Spreadsheet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser Spreadsheet</em>' containment reference.
	 * @see #setParserSpreadsheet(SpreadsheetParser)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_ParserSpreadsheet()
	 * @model containment="true"
	 * @generated
	 */
	SpreadsheetParser getParserSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getParserSpreadsheet <em>Parser Spreadsheet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Spreadsheet</em>' containment reference.
	 * @see #getParserSpreadsheet()
	 * @generated
	 */
	void setParserSpreadsheet(SpreadsheetParser value);

	/**
	 * Returns the value of the '<em><b>Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Util</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Util</em>' reference.
	 * @see #setUtil(Util)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_Util()
	 * @model
	 * @generated
	 */
	Util getUtil();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getUtil <em>Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Util</em>' reference.
	 * @see #getUtil()
	 * @generated
	 */
	void setUtil(Util value);

	/**
	 * Returns the value of the '<em><b>Validate Spreadsheet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Spreadsheet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Spreadsheet</em>' containment reference.
	 * @see #setValidateSpreadsheet(SpreadsheetValidator)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_ValidateSpreadsheet()
	 * @model containment="true"
	 * @generated
	 */
	SpreadsheetValidator getValidateSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.GenericMonitorPoints#getValidateSpreadsheet <em>Validate Spreadsheet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Spreadsheet</em>' containment reference.
	 * @see #getValidateSpreadsheet()
	 * @generated
	 */
	void setValidateSpreadsheet(SpreadsheetValidator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alma.control.datamodel.meta.base.EStringArray3"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tdirLocation = util.getInstallDir();\n\t\tif (!(new java.io.File(dirLocation + \"/idl/GENERIC_spreadsheet.xml\").exists())){\n\t\t\tSystem.out.println(\"Spreadsheet GENERIC_spreadsheet not found. Exiting....\");\n\t\t\tSystem.exit(1);\n\t\t}\n\n\t\tString xml = parserSpreadsheet.getSpreadsheet(dirLocation + \"/idl\", \"GENERIC_spreadsheet.xml\");\n\t\tString xmlFile = dirLocation + \"/idl/GENERIC_spreadsheet.xml\";\n\t\tString xsdFile = dirLocation + \"/config/schemas/amb/Workbook.xsd\";\n\t\tBaseFactory baseFac = BaseFactory.eINSTANCE;\n\t\tSpreadsheetParser p = baseFac.createSpreadsheetParser(xml);\n\t\tString [][][] spreadsheet = p.getWorksheets();\n\t\tSpreadsheetValidator v = baseFac.createSpreadsheetValidator();\n\t\tif (!v.validate(xmlFile,xsdFile)) {\n\t\t\tString s = \"Spreadsheet GENERIC_spreadsheet.xml is not a valid spreadsheet.\";\n\t\t\tthrow new RuntimeException(s);\n\t\t}\n\n\t\tSystem.out.println(\"Spreadsheet GENERIC has been validated.\");\n\n\t\treturn spreadsheet;'"
	 * @generated
	 */
	String[][][] getParsedGenericSpreadsheet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray3" spreadsheetDataType="alma.control.datamodel.meta.base.EStringArray3"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=' // Create the SP class\r\n        setDeviceName(spreadsheet[0][2][0]);\r\n        String [][][] genericSpreadsheet = getParsedGenericSpreadsheet();\r\n        // Now we iterate through spreadsheet adding monitor, control and archive generic points.\r\n        \r\n        // I coded this way to make the things clear\r\n        int[] Rows = null;\r\n        int[] Columns = null;\r\n        int[] GenericRows = null;\r\n        \r\n        Rows = new int[4];\r\n        Columns = new int[4];\r\n        GenericRows = new int[4];\r\n        \r\n        String deviceName=spreadsheet[0][2][0];\r\n        \r\n        int mainRows = spreadsheet[0].length;\r\n        int monitorRows = spreadsheet[1].length;\r\n        int controlRows = spreadsheet[2].length;\r\n        int archiveRows = spreadsheet[3].length;\r\n        \r\n        int mainColumns = spreadsheet[0][1].length;\r\n        int monitorColumns = spreadsheet[1][1].length;\r\n        int controlColumns = spreadsheet[2][1].length;\r\n        int archiveColumns = spreadsheet[3][1].length;\r\n        \r\n        int genericMonitorRows = genericSpreadsheet[1].length;\r\n        int genericControlRows = genericSpreadsheet[2].length;\r\n        int genericArchiveRows = genericSpreadsheet[3].length;\r\n        \r\n        // Well, first the newSpreadsheet is created. Arrays are static structures....\r\n        newSpreadsheet = new String[4][][];\r\n        newSpreadsheet[0] = new String[mainRows][mainColumns];\r\n        newSpreadsheet[1] = new String[monitorRows+genericMonitorRows-2][monitorColumns];\r\n        newSpreadsheet[2] = new String[controlRows+genericControlRows-2][controlColumns];\r\n        newSpreadsheet[3] = new String[archiveRows+genericArchiveRows-2][archiveColumns];\r\n        \r\n\t// Hardware Device\r\n        newSpreadsheet[0][0] = new String[1];\r\n        newSpreadsheet[0][0][0] = spreadsheet[0][0][0];\r\n\t// Monitor Point\r\n        newSpreadsheet[1][0] = new String[1];\r\n        newSpreadsheet[1][0][0] = spreadsheet[1][0][0];\r\n\t// Control Point\r\n        newSpreadsheet[2][0] = new String[1];\r\n        newSpreadsheet[2][0][0] = spreadsheet[2][0][0];\r\n\t// Archive Property\r\n        newSpreadsheet[3][0] = new String[1];\r\n        newSpreadsheet[3][0][0] = spreadsheet[3][0][0];\r\n        \r\n        Rows[0] = mainRows; // Yes here I ignore Notes on Main spreadsheet\r\n        Rows[1] = monitorRows;\r\n        Rows[2] = controlRows;\r\n        Rows[3] = archiveRows;\r\n        \r\n        Columns[0] = mainColumns;\r\n        Columns[1] = monitorColumns;\r\n        Columns[2] = controlColumns;\r\n        Columns[3] = archiveColumns;\r\n        \r\n        // Then I copy elements from spreadsheet to newSpreadsheet\r\n        for (int i = 0; i &lt; Rows.length; i++ ) {\r\n            for (int j = 1; j &lt; Rows[i]; j++) {\r\n                for (int k = 0; k &lt; Columns[i]; k++) {\r\n                    if (spreadsheet[i][j][k].equals(\"Notes\")){\r\n                        newSpreadsheet[i][j] = new String[2];\r\n                        newSpreadsheet[i][j][k] = spreadsheet[i][j][k];\r\n                        newSpreadsheet[i][j][k+1] = spreadsheet[i][j][k+1];\r\n                        break; \r\n                    }\r\n                    newSpreadsheet[i][j][k] = spreadsheet[i][j][k];\r\n                }\r\n\r\n            }\r\n        }        \r\n        \r\n        // Here we start the copy process from generic spreadsheet\r\n        GenericRows[0] = 0;\r\n        GenericRows[1] = genericMonitorRows;\r\n        GenericRows[2] = genericControlRows;\r\n        GenericRows[3] = genericArchiveRows;\r\n\r\n        for (int i = 1; i &lt; Rows.length ; i++ ) {\r\n            for (int j = Rows[i];j &lt; (Rows[i] + GenericRows[i] - 2); j++) {\r\n                for (int k = 0; k &lt; Columns[i]; k++) {\r\n                    if ( (genericSpreadsheet[i][j-Rows[i]+2][k]).equals(\"GENERIC\")){\r\n                        newSpreadsheet[i][j][k] = deviceName;\r\n                    } else {\r\n                        newSpreadsheet[i][j][k] = genericSpreadsheet[i][j-Rows[i]+2][k];\r\n                    }\r\n                }\r\n            }\r\n        }\r\n        return newSpreadsheet;'"
	 * @generated
	 */
	String[][][] getDeviceWorksheetWithGenericPointsAdded(String[][][] spreadsheet);

} // GenericMonitorPoints
