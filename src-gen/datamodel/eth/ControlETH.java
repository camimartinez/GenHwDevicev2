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

import datamodel.base.ControlPoint;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control ETH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.eth.ControlETH#getMac <em>Mac</em>}</li>
 *   <li>{@link datamodel.eth.ControlETH#getAux2 <em>Aux2</em>}</li>
 *   <li>{@link datamodel.eth.ControlETH#getInfoControlEth <em>Info Control Eth</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.eth.EthPackage#getControlETH()
 * @model
 * @generated
 */
public interface ControlETH extends ControlPoint {
	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(MandCETH)
	 * @see datamodel.eth.EthPackage#getControlETH_Mac()
	 * @model dataType="datamodel.eth.MandCETHDT"
	 * @generated
	 */
	MandCETH getMac();

	/**
	 * Sets the value of the '{@link datamodel.eth.ControlETH#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(MandCETH value);

	/**
	 * Returns the value of the '<em><b>Aux2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux2</em>' attribute.
	 * @see #setAux2(Resource)
	 * @see datamodel.eth.EthPackage#getControlETH_Aux2()
	 * @model transient="true"
	 * @generated
	 */
	Resource getAux2();

	/**
	 * Sets the value of the '{@link datamodel.eth.ControlETH#getAux2 <em>Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux2</em>' attribute.
	 * @see #getAux2()
	 * @generated
	 */
	void setAux2(Resource value);

	/**
	 * Returns the value of the '<em><b>Info Control Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Control Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Control Eth</em>' reference.
	 * @see #setInfoControlEth(MandCETH)
	 * @see datamodel.eth.EthPackage#getControlETH_InfoControlEth()
	 * @model
	 * @generated
	 */
	MandCETH getInfoControlEth();

	/**
	 * Sets the value of the '{@link datamodel.eth.ControlETH#getInfoControlEth <em>Info Control Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Control Eth</em>' reference.
	 * @see #getInfoControlEth()
	 * @generated
	 */
	void setInfoControlEth(MandCETH value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='mac.setAssemblyName(assembly);'"
	 * @generated
	 */
	void setAssembly(String assembly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Assembly();'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Address();'"
	 * @generated
	 */
	String Address();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\ttry\r\n\t\t{\r\n\t\t\tInteger.decode(mac.Address());\r\n\t\t}\r\n\t\tcatch(Exception e)\r\n\t\t{\r\n\t\t\treturn true;\r\n\t\t}\r\n\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isEnumAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataType();'"
	 * @generated
	 */
	String DataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDataArray();'"
	 * @generated
	 */
	boolean isDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isOpenArray();'"
	 * @generated
	 */
	boolean isOpenArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getArrayLength();'"
	 * @generated
	 */
	String getArrayLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToIDLType();'"
	 * @generated
	 */
	String DataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToIDLSeqType();'"
	 * @generated
	 */
	String DataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToCPPType();'"
	 * @generated
	 */
	String DataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToCORBAType();'"
	 * @generated
	 */
	String DataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToCORBADevIOType();'"
	 * @generated
	 */
	String DataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToCORBASeqType();'"
	 * @generated
	 */
	String DataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToBACIType();'"
	 * @generated
	 */
	String DataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.DataToDatabaseType();'"
	 * @generated
	 */
	String DataToDatabaseType();

} // ControlETH
