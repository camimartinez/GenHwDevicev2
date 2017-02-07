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
import datamodel.base.Table;

import datamodel.base.impl.BaseFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main ETH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.eth.MainETH#getAux <em>Aux</em>}</li>
 *   <li>{@link datamodel.eth.MainETH#getToInfoMain <em>To Info Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.eth.EthPackage#getMainETH()
 * @model
 * @generated
 */
public interface MyMainETH extends MainETH {
	/**
	 * Returns the value of the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' attribute.
	 * @see #setAux(BaseFactoryImpl)
	 * @see datamodel.eth.EthPackage#getMainETH_Aux()
	 * @model dataType="datamodel.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getAux();

	/**
	 * Sets the value of the '{@link datamodel.eth.MainETH#getAux <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' attribute.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(BaseFactoryImpl value);

	/**
	 * Returns the value of the '<em><b>To Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info Main</em>' reference.
	 * @see #setToInfoMain(Table)
	 * @see datamodel.eth.EthPackage#getMainETH_ToInfoMain()
	 * @model
	 * @generated
	 */
	Table getToInfoMain();

	/**
	 * Sets the value of the '{@link datamodel.eth.MainETH#getToInfoMain <em>To Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info Main</em>' reference.
	 * @see #getToInfoMain()
	 * @generated
	 */
	void setToInfoMain(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Vendor Class\")];'"
	 * @generated
	 */
	String VendorClass();

} // MainETH
