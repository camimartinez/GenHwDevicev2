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
package datamodel.amb;

import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Monitor Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link datamodel.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link datamodel.amb.GenericMonitorPoints#getGetTheSpreadsheet <em>Get The Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.GenericMonitorPoints#getToValidateTheSpreadsheet <em>To Validate The Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.GenericMonitorPoints#getToInstallDir <em>To Install Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints()
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
	 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints_NewSpreadsheet()
	 * @model dataType="datamodel.base.String3DT"
	 * @generated
	 */
	String[][][] getNewSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.GenericMonitorPoints#getNewSpreadsheet <em>New Spreadsheet</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link datamodel.amb.GenericMonitorPoints#getDeviceName <em>Device Name</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints_DirLocation()
	 * @model
	 * @generated
	 */
	String getDirLocation();

	/**
	 * Sets the value of the '{@link datamodel.amb.GenericMonitorPoints#getDirLocation <em>Dir Location</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints_GetTheSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getGetTheSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.GenericMonitorPoints#getGetTheSpreadsheet <em>Get The Spreadsheet</em>}' reference.
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
	 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints_ToValidateTheSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getToValidateTheSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.GenericMonitorPoints#getToValidateTheSpreadsheet <em>To Validate The Spreadsheet</em>}' reference.
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
	 * @see datamodel.amb.AmbPackage#getGenericMonitorPoints_ToInstallDir()
	 * @model
	 * @generated
	 */
	Util getToInstallDir();

	/**
	 * Sets the value of the '{@link datamodel.amb.GenericMonitorPoints#getToInstallDir <em>To Install Dir</em>}' reference.
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
	 * @model kind="operation" dataType="datamodel.base.String3DT"
	 * @generated
	 */
	String[][][] getParsedGenericSpreadsheet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.String3DT" spreadsheetDataType="datamodel.base.String3DT"
	 * @generated
	 */
	String[][][] getDeviceWorksheetWithGenericPointsAdded(String[][][] spreadsheet);

} // GenericMonitorPoints
