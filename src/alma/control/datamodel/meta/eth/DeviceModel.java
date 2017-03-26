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

import alma.control.datamodel.meta.base.Note;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getMainEth <em>Main Eth</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getControl <em>Control</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getArchive <em>Archive</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.control.datamodel.meta.base.DeviceModel {
	/**
	 * Returns the value of the '<em><b>Main Eth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Eth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Eth</em>' containment reference.
	 * @see #setMainEth(Main)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_MainEth()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Main getMainEth();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getMainEth <em>Main Eth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Eth</em>' containment reference.
	 * @see #getMainEth()
	 * @generated
	 */
	void setMainEth(Main value);

	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' containment reference.
	 * @see #setMonitor(Monitor)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_Monitor()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Monitor getMonitor();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getMonitor <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' containment reference.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(Monitor value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(Control)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_Control()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' containment reference.
	 * @see #setArchive(Archive)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_Archive()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Archive getArchive();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getArchive <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' containment reference.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(Archive value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(Note)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_Note()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Note getNote();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.DeviceModel#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Note value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";'"
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
