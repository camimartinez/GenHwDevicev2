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
import alma.Control.datamodel.meta.base.Table;

import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.eth.Main#getAux <em>Aux</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.Main#getToInfoMain <em>To Info Main</em>}</li>
 * </ul>
 *
 * @see alma.Control.datamodel.meta.eth.EthPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends MainBase {
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
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getMain_Aux()
	 * @model dataType="alma.Control.datamodel.meta.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getAux();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.Main#getAux <em>Aux</em>}' attribute.
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
	 * @see alma.Control.datamodel.meta.eth.EthPackage#getMain_ToInfoMain()
	 * @model
	 * @generated
	 */
	Table getToInfoMain();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.eth.Main#getToInfoMain <em>To Info Main</em>}' reference.
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

} // Main
