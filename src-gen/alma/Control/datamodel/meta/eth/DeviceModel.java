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
package alma.Control.datamodel.meta.eth;

import alma.Control.datamodel.meta.base.MainBase;
import alma.Control.datamodel.meta.base.Note;
import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoControl <em>Info Control</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoMonitor <em>Info Monitor</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getToEndEth <em>To End Eth</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoArch <em>Info Arch</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getDataSpreadsheet <em>Data Spreadsheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getToNotes <em>To Notes</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getToValidateSpreadEth <em>To Validate Spread Eth</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.DeviceModel#getToSpreadEth <em>To Spread Eth</em>}</li>
 * </ul>
 *
 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.Control.datamodel.meta.base.DeviceModel {
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
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_InfoDevMain()
	 * @model
	 * @generated
	 */
	MainBase getInfoDevMain();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoDevMain <em>Info Dev Main</em>}' reference.
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
	 * @see #setInfoControl(Control)
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_InfoControl()
	 * @model
	 * @generated
	 */
	Control getInfoControl();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoControl <em>Info Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Control</em>' reference.
	 * @see #getInfoControl()
	 * @generated
	 */
	void setInfoControl(Control value);

	/**
	 * Returns the value of the '<em><b>Info Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Monitor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Monitor</em>' reference.
	 * @see #setInfoMonitor(Monitor)
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_InfoMonitor()
	 * @model
	 * @generated
	 */
	Monitor getInfoMonitor();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoMonitor <em>Info Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Monitor</em>' reference.
	 * @see #getInfoMonitor()
	 * @generated
	 */
	void setInfoMonitor(Monitor value);

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
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_ToEndEth()
	 * @model
	 * @generated
	 */
	Util getToEndEth();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getToEndEth <em>To End Eth</em>}' reference.
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
	 * @see #setInfoArch(Archive)
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_InfoArch()
	 * @model
	 * @generated
	 */
	Archive getInfoArch();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getInfoArch <em>Info Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Arch</em>' reference.
	 * @see #getInfoArch()
	 * @generated
	 */
	void setInfoArch(Archive value);

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
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_DataSpreadsheet()
	 * @model
	 * @generated
	 */
	Table getDataSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getDataSpreadsheet <em>Data Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Spreadsheet</em>' reference.
	 * @see #getDataSpreadsheet()
	 * @generated
	 */
	void setDataSpreadsheet(Table value);

	/**
	 * Returns the value of the '<em><b>To Notes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Notes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Notes</em>' reference.
	 * @see #setToNotes(Note)
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_ToNotes()
	 * @model
	 * @generated
	 */
	Note getToNotes();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getToNotes <em>To Notes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Notes</em>' reference.
	 * @see #getToNotes()
	 * @generated
	 */
	void setToNotes(Note value);

	/**
	 * Returns the value of the '<em><b>To Validate Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Validate Spread Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Validate Spread Eth</em>' reference.
	 * @see #setToValidateSpreadEth(SpreadsheetValidator)
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_ToValidateSpreadEth()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getToValidateSpreadEth();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getToValidateSpreadEth <em>To Validate Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Validate Spread Eth</em>' reference.
	 * @see #getToValidateSpreadEth()
	 * @generated
	 */
	void setToValidateSpreadEth(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>To Spread Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Spread Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Spread Eth</em>' reference.
	 * @see #setToSpreadEth(SpreadsheetParser)
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getDeviceModel_ToSpreadEth()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getToSpreadEth();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.DeviceModel#getToSpreadEth <em>To Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Spread Eth</em>' reference.
	 * @see #getToSpreadEth()
	 * @generated
	 */
	void setToSpreadEth(SpreadsheetParser value);

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
