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

import datamodel.base.ArchiveProperty;
import datamodel.base.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive AMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.ArchiveAMB#getGetAssemblyColumn <em>Get Assembly Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getArchiveAMB()
 * @model
 * @generated
 */
public interface MyArchiveAMB extends ArchiveProperty {
	/**
	 * Returns the value of the '<em><b>Get Assembly Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Assembly Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Assembly Column</em>' reference.
	 * @see #setGetAssemblyColumn(Table)
	 * @see datamodel.amb.AmbPackage#getArchiveAMB_GetAssemblyColumn()
	 * @model
	 * @generated
	 */
	Table getGetAssemblyColumn();

	/**
	 * Sets the value of the '{@link datamodel.amb.ArchiveAMB#getGetAssemblyColumn <em>Get Assembly Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Assembly Column</em>' reference.
	 * @see #getGetAssemblyColumn()
	 * @generated
	 */
	void setGetAssemblyColumn(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isIntervalTE();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Interval();

} // ArchiveAMB
