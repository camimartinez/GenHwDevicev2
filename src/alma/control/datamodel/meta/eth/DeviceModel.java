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
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getCPointsList <em>CPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getAPointsList <em>APoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.DeviceModel#getMPointsList <em>MPoints</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Control[] getCPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Control getCPoints(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCPointsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCPoints(Control[] newCPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCPoints(int index, Control element);

	/**
	 * Returns the value of the '<em><b>CPoints</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.eth.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPoints</em>' containment reference list.
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_CPoints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Control> getCPointsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Archive[] getAPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Archive getAPoints(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getAPointsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAPoints(Archive[] newAPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAPoints(int index, Archive element);

	/**
	 * Returns the value of the '<em><b>APoints</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.eth.Archive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APoints</em>' containment reference list.
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_APoints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Archive> getAPointsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Monitor[] getMPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Monitor getMPoints(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getMPointsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMPoints(Monitor[] newMPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMPoints(int index, Monitor element);

	/**
	 * Returns the value of the '<em><b>MPoints</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.eth.Monitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPoints</em>' containment reference list.
	 * @see alma.control.datamodel.meta.eth.EthPackage#getDeviceModel_MPoints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Monitor> getMPointsList();

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
