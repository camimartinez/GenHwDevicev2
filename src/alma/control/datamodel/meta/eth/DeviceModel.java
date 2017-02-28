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
package alma.control.datamodel.meta.eth;

import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getObtainControlPoints <em>Obtain Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getObtainMonitorPoints <em>Obtain Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getObtainArchiveProperties <em>Obtain Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getValidateSpreadsheet <em>Validate Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getParserSpreadsheet <em>Parser Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getNotess <em>Notess</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.control.datamodel.meta.base.DeviceModel {
	/**
	 * Returns the value of the '<em><b>Info Dev Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Dev Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Dev Main</em>' reference.
	 * @see #setInfoDevMain(MainBase)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_InfoDevMain()
	 * @model
	 * @generated
	 */
	MainBase getInfoDevMain();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Dev Main</em>' reference.
	 * @see #getInfoDevMain()
	 * @generated
	 */
	void setInfoDevMain(MainBase value);

	/**
	 * Returns the value of the '<em><b>Obtain Control Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Control Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Control Points</em>' reference.
	 * @see #setObtainControlPoints(Control)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_ObtainControlPoints()
	 * @model
	 * @generated
	 */
	Control getObtainControlPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getObtainControlPoints <em>Obtain Control Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Control Points</em>' reference.
	 * @see #getObtainControlPoints()
	 * @generated
	 */
	void setObtainControlPoints(Control value);

	/**
	 * Returns the value of the '<em><b>Obtain Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Monitor Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Monitor Points</em>' reference.
	 * @see #setObtainMonitorPoints(Monitor)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_ObtainMonitorPoints()
	 * @model
	 * @generated
	 */
	Monitor getObtainMonitorPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getObtainMonitorPoints <em>Obtain Monitor Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Monitor Points</em>' reference.
	 * @see #getObtainMonitorPoints()
	 * @generated
	 */
	void setObtainMonitorPoints(Monitor value);

	/**
	 * Returns the value of the '<em><b>Obtain Archive Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Archive Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Archive Properties</em>' reference.
	 * @see #setObtainArchiveProperties(Archive)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_ObtainArchiveProperties()
	 * @model
	 * @generated
	 */
	Archive getObtainArchiveProperties();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getObtainArchiveProperties <em>Obtain Archive Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Archive Properties</em>' reference.
	 * @see #getObtainArchiveProperties()
	 * @generated
	 */
	void setObtainArchiveProperties(Archive value);

	/**
	 * Returns the value of the '<em><b>Validate Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Spreadsheet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Spreadsheet</em>' reference.
	 * @see #setValidateSpreadsheet(SpreadsheetValidator)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_ValidateSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getValidateSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getValidateSpreadsheet <em>Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Spreadsheet</em>' reference.
	 * @see #getValidateSpreadsheet()
	 * @generated
	 */
	void setValidateSpreadsheet(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>Parser Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser Spreadsheet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser Spreadsheet</em>' reference.
	 * @see #setParserSpreadsheet(SpreadsheetParser)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_ParserSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getParserSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getParserSpreadsheet <em>Parser Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Spreadsheet</em>' reference.
	 * @see #getParserSpreadsheet()
	 * @generated
	 */
	void setParserSpreadsheet(SpreadsheetParser value);

	/**
	 * Returns the value of the '<em><b>Notess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notess</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notess</em>' reference.
	 * @see #setNotess(Note)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_Notess()
	 * @model
	 * @generated
	 */
	Note getNotess();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getNotess <em>Notess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notess</em>' reference.
	 * @see #getNotess()
	 * @generated
	 */
	void setNotess(Note value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"true\";'"
	 * @generated
	 */
	String CreateModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).VendorClass();'"
	 * @generated
	 */
	String VendorClass();

} // DeviceModel
