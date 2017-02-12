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
package alma.Control.datamodel.meta.amb;

import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;
import alma.Control.datamodel.meta.base.Util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Monitor Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getGetTheSpreadsheet <em>Get The Spreadsheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getToValidateTheSpreadsheet <em>To Validate The Spreadsheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getToInstallDir <em>To Install Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints()
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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_NewSpreadsheet()
	 * @model dataType="alma.Control.datamodel.meta.base.String3DT"
	 * @generated
	 */
	String[][][] getNewSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}' attribute.
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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}' attribute.
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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_DirLocation()
	 * @model
	 * @generated
	 */
	String getDirLocation();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Location</em>' attribute.
	 * @see #getDirLocation()
	 * @generated
	 */
	void setDirLocation(String value);

	/**
	 * Returns the value of the '<em><b>Get The Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get The Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get The Spreadsheet</em>' reference.
	 * @see #setGetTheSpreadsheet(SpreadsheetParser)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_GetTheSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getGetTheSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getGetTheSpreadsheet <em>Get The Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get The Spreadsheet</em>' reference.
	 * @see #getGetTheSpreadsheet()
	 * @generated
	 */
	void setGetTheSpreadsheet(SpreadsheetParser value);

	/**
	 * Returns the value of the '<em><b>To Validate The Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Validate The Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Validate The Spreadsheet</em>' reference.
	 * @see #setToValidateTheSpreadsheet(SpreadsheetValidator)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_ToValidateTheSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getToValidateTheSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getToValidateTheSpreadsheet <em>To Validate The Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Validate The Spreadsheet</em>' reference.
	 * @see #getToValidateTheSpreadsheet()
	 * @generated
	 */
	void setToValidateTheSpreadsheet(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>To Install Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Install Dir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Install Dir</em>' reference.
	 * @see #setToInstallDir(Util)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getGenericMonitorPoints_ToInstallDir()
	 * @model
	 * @generated
	 */
	Util getToInstallDir();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.GenericMonitorPoints#getToInstallDir <em>To Install Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Install Dir</em>' reference.
	 * @see #getToInstallDir()
	 * @generated
	 */
	void setToInstallDir(Util value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alma.Control.datamodel.meta.base.String3DT"
	 * @generated
	 */
	String[][][] getParsedGenericSpreadsheet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alma.Control.datamodel.meta.base.String3DT" spreadsheetDataType="alma.Control.datamodel.meta.base.String3DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=' // Create the SP class\r\n        setDeviceName(spreadsheet[0][2][0]);\r\n        String [][][] genericSpreadsheet = getParsedGenericSpreadsheet();\r\n        // Now we iterate through spreadsheet adding monitor, control and archive generic points.\r\n        \r\n        // I coded this way to make the things clear\r\n        int[] Rows = null;\r\n        int[] Columns = null;\r\n        int[] GenericRows = null;\r\n        \r\n        Rows = new int[4];\r\n        Columns = new int[4];\r\n        GenericRows = new int[4];\r\n        \r\n        String deviceName=spreadsheet[0][2][0];\r\n        \r\n        int mainRows = spreadsheet[0].length;\r\n        int monitorRows = spreadsheet[1].length;\r\n        int controlRows = spreadsheet[2].length;\r\n        int archiveRows = spreadsheet[3].length;\r\n        \r\n        int mainColumns = spreadsheet[0][1].length;\r\n        int monitorColumns = spreadsheet[1][1].length;\r\n        int controlColumns = spreadsheet[2][1].length;\r\n        int archiveColumns = spreadsheet[3][1].length;\r\n        \r\n        int genericMonitorRows = genericSpreadsheet[1].length;\r\n        int genericControlRows = genericSpreadsheet[2].length;\r\n        int genericArchiveRows = genericSpreadsheet[3].length;\r\n        \r\n        // Well, first the newSpreadsheet is created. Arrays are static structures....\r\n        newSpreadsheet = new String[4][][];\r\n        newSpreadsheet[0] = new String[mainRows][mainColumns];\r\n        newSpreadsheet[1] = new String[monitorRows+genericMonitorRows-2][monitorColumns];\r\n        newSpreadsheet[2] = new String[controlRows+genericControlRows-2][controlColumns];\r\n        newSpreadsheet[3] = new String[archiveRows+genericArchiveRows-2][archiveColumns];\r\n        \r\n\t// Hardware Device\r\n        newSpreadsheet[0][0] = new String[1];\r\n        newSpreadsheet[0][0][0] = spreadsheet[0][0][0];\r\n\t// Monitor Point\r\n        newSpreadsheet[1][0] = new String[1];\r\n        newSpreadsheet[1][0][0] = spreadsheet[1][0][0];\r\n\t// Control Point\r\n        newSpreadsheet[2][0] = new String[1];\r\n        newSpreadsheet[2][0][0] = spreadsheet[2][0][0];\r\n\t// Archive Property\r\n        newSpreadsheet[3][0] = new String[1];\r\n        newSpreadsheet[3][0][0] = spreadsheet[3][0][0];\r\n        \r\n        Rows[0] = mainRows; // Yes here I ignore Notes on Main spreadsheet\r\n        Rows[1] = monitorRows;\r\n        Rows[2] = controlRows;\r\n        Rows[3] = archiveRows;\r\n        \r\n        Columns[0] = mainColumns;\r\n        Columns[1] = monitorColumns;\r\n        Columns[2] = controlColumns;\r\n        Columns[3] = archiveColumns;\r\n        \r\n        // Then I copy elements from spreadsheet to newSpreadsheet\r\n        for (int i = 0; i < Rows.length; i++ ) {\r\n            for (int j = 1; j < Rows[i]; j++) {\r\n                for (int k = 0; k < Columns[i]; k++) {\r\n                    if (spreadsheet[i][j][k].equals(\"Notes\")){\r\n                        newSpreadsheet[i][j] = new String[2];\r\n                        newSpreadsheet[i][j][k] = spreadsheet[i][j][k];\r\n                        newSpreadsheet[i][j][k+1] = spreadsheet[i][j][k+1];\r\n                        break; \r\n                    }\r\n                    newSpreadsheet[i][j][k] = spreadsheet[i][j][k];\r\n                }\r\n\r\n            }\r\n        }        \r\n        \r\n        // Here we start the copy process from generic spreadsheet\r\n        GenericRows[0] = 0;\r\n        GenericRows[1] = genericMonitorRows;\r\n        GenericRows[2] = genericControlRows;\r\n        GenericRows[3] = genericArchiveRows;\r\n\r\n        for (int i = 1; i < Rows.length ; i++ ) {\r\n            for (int j = Rows[i];j < (Rows[i] + GenericRows[i] - 2); j++) {\r\n                for (int k = 0; k < Columns[i]; k++) {\r\n                    if ( (genericSpreadsheet[i][j-Rows[i]+2][k]).equals(\"GENERIC\")){\r\n                        newSpreadsheet[i][j][k] = deviceName;\r\n                    } else {\r\n                        newSpreadsheet[i][j][k] = genericSpreadsheet[i][j-Rows[i]+2][k];\r\n                    }\r\n                }\r\n            }\r\n        }\r\n        return newSpreadsheet;'"
	 * @generated
	 */
	String[][][] getDeviceWorksheetWithGenericPointsAdded(String[][][] spreadsheet);

} // GenericMonitorPoints
