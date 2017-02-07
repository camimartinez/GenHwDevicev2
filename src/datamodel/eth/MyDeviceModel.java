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
package datamodel.eth;

import datamodel.base.MainBase;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getInfoControl <em>Info Control</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getInfoMonitor <em>Info Monitor</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getToEndEth <em>To End Eth</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getInfoArch <em>Info Arch</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getDataSpreadsheet <em>Data Spreadsheet</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getNotesTo <em>Notes To</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getValidateSpreadEth <em>Validate Spread Eth</em>}</li>
 *   <li>{@link datamodel.eth.DeviceModel#getFromSpreadEth <em>From Spread Eth</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.eth.EthPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface MyDeviceModel extends datamodel.eth.DeviceModel {
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
	 * @see datamodel.eth.EthPackage#getDeviceModel_InfoDevMain()
	 * @model
	 * @generated
	 */
	MainBase getInfoDevMain();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Dev Main</em>' reference.
	 * @see #getInfoDevMain()
	 * @generated
	 */
	void setInfoDevMain(MainBase value);

	/**
	 * Returns the value of the '<em><b>Info Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Control</em>' reference.
	 * @see #setInfoControl(ControlETH)
	 * @see datamodel.eth.EthPackage#getDeviceModel_InfoControl()
	 * @model
	 * @generated
	 */
	ControlETH getInfoControl();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getInfoControl <em>Info Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Control</em>' reference.
	 * @see #getInfoControl()
	 * @generated
	 */
	void setInfoControl(ControlETH value);

	/**
	 * Returns the value of the '<em><b>Info Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Monitor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Monitor</em>' reference.
	 * @see #setInfoMonitor(MonitorETH)
	 * @see datamodel.eth.EthPackage#getDeviceModel_InfoMonitor()
	 * @model
	 * @generated
	 */
	MonitorETH getInfoMonitor();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getInfoMonitor <em>Info Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Monitor</em>' reference.
	 * @see #getInfoMonitor()
	 * @generated
	 */
	void setInfoMonitor(MonitorETH value);

	/**
	 * Returns the value of the '<em><b>To End Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To End Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To End Eth</em>' reference.
	 * @see #setToEndEth(Util)
	 * @see datamodel.eth.EthPackage#getDeviceModel_ToEndEth()
	 * @model
	 * @generated
	 */
	Util getToEndEth();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getToEndEth <em>To End Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To End Eth</em>' reference.
	 * @see #getToEndEth()
	 * @generated
	 */
	void setToEndEth(Util value);

	/**
	 * Returns the value of the '<em><b>Info Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Arch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Arch</em>' reference.
	 * @see #setInfoArch(ArchiveETH)
	 * @see datamodel.eth.EthPackage#getDeviceModel_InfoArch()
	 * @model
	 * @generated
	 */
	ArchiveETH getInfoArch();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getInfoArch <em>Info Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Arch</em>' reference.
	 * @see #getInfoArch()
	 * @generated
	 */
	void setInfoArch(ArchiveETH value);

	/**
	 * Returns the value of the '<em><b>Data Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Spreadsheet</em>' reference.
	 * @see #setDataSpreadsheet(Table)
	 * @see datamodel.eth.EthPackage#getDeviceModel_DataSpreadsheet()
	 * @model
	 * @generated
	 */
	Table getDataSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getDataSpreadsheet <em>Data Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Spreadsheet</em>' reference.
	 * @see #getDataSpreadsheet()
	 * @generated
	 */
	void setDataSpreadsheet(Table value);

	/**
	 * Returns the value of the '<em><b>Notes To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes To</em>' reference.
	 * @see #setNotesTo(Note)
	 * @see datamodel.eth.EthPackage#getDeviceModel_NotesTo()
	 * @model
	 * @generated
	 */
	Note getNotesTo();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getNotesTo <em>Notes To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes To</em>' reference.
	 * @see #getNotesTo()
	 * @generated
	 */
	void setNotesTo(Note value);

	/**
	 * Returns the value of the '<em><b>Validate Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Spread Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Spread Eth</em>' reference.
	 * @see #setValidateSpreadEth(SpreadsheetValidator)
	 * @see datamodel.eth.EthPackage#getDeviceModel_ValidateSpreadEth()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getValidateSpreadEth();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getValidateSpreadEth <em>Validate Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Spread Eth</em>' reference.
	 * @see #getValidateSpreadEth()
	 * @generated
	 */
	void setValidateSpreadEth(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>From Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Spread Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Spread Eth</em>' reference.
	 * @see #setFromSpreadEth(SpreadsheetParser)
	 * @see datamodel.eth.EthPackage#getDeviceModel_FromSpreadEth()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getFromSpreadEth();

	/**
	 * Sets the value of the '{@link datamodel.eth.DeviceModel#getFromSpreadEth <em>From Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Spread Eth</em>' reference.
	 * @see #getFromSpreadEth()
	 * @generated
	 */
	void setFromSpreadEth(SpreadsheetParser value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String CreateModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainETHImpl)main).VendorClass();'"
	 * @generated
	 */
	String VendorClass();

} // DeviceModel
