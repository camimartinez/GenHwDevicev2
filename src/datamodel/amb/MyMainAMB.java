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

import datamodel.base.BaseFactory;
import datamodel.base.MainBase;
import datamodel.base.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main AMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.MainAMB#getTmp <em>Tmp</em>}</li>
 *   <li>{@link datamodel.amb.MainAMB#getGetInfoFromMain <em>Get Info From Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getMainAMB()
 * @model
 * @generated
 */
public interface MyMainAMB extends MainAMB {
	/**
	 * Returns the value of the '<em><b>Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp</em>' attribute.
	 * @see #setTmp(BaseFactory)
	 * @see datamodel.amb.AmbPackage#getMainAMB_Tmp()
	 * @model dataType="datamodel.amb.BaseFactoryDT"
	 * @generated
	 */
	BaseFactory getTmp();

	/**
	 * Sets the value of the '{@link datamodel.amb.MainAMB#getTmp <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp</em>' attribute.
	 * @see #getTmp()
	 * @generated
	 */
	void setTmp(BaseFactory value);

	/**
	 * Returns the value of the '<em><b>Get Info From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From Main</em>' reference.
	 * @see #setGetInfoFromMain(Table)
	 * @see datamodel.amb.AmbPackage#getMainAMB_GetInfoFromMain()
	 * @model
	 * @generated
	 */
	Table getGetInfoFromMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.MainAMB#getGetInfoFromMain <em>Get Info From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From Main</em>' reference.
	 * @see #getGetInfoFromMain()
	 * @generated
	 */
	void setGetInfoFromMain(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Parent\")];'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Node Address\")];'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Cardinality\")];'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Channel\")];'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Generic Monitor Points\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Base Address\")];'"
	 * @generated
	 */
	String BaseAddress();

} // MainAMB
