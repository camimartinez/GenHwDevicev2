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
package datamodel.base;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.ControlPoint#getGetArchOnUseControl <em>Get Arch On Use Control</em>}</li>
 *   <li>{@link datamodel.base.ControlPoint#getAux <em>Aux</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getControlPoint()
 * @model abstract="true" superTypes="datamodel.base.MandCBase datamodel.amb.ResourceAuxClass"
 * @generated
 */
public interface ControlPoint extends MandCBase, Resource {
	/**
	 * Returns the value of the '<em><b>Get Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Arch On Use Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Arch On Use Control</em>' reference.
	 * @see #setGetArchOnUseControl(Table)
	 * @see datamodel.base.BasePackage#getControlPoint_GetArchOnUseControl()
	 * @model
	 * @generated
	 */
	Table getGetArchOnUseControl();

	/**
	 * Sets the value of the '{@link datamodel.base.ControlPoint#getGetArchOnUseControl <em>Get Arch On Use Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Arch On Use Control</em>' reference.
	 * @see #getGetArchOnUseControl()
	 * @generated
	 */
	void setGetArchOnUseControl(Table value);

	/**
	 * Returns the value of the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' attribute.
	 * @see #setAux(Resource)
	 * @see datamodel.base.BasePackage#getControlPoint_Aux()
	 * @model transient="true"
	 * @generated
	 */
	Resource getAux();

	/**
	 * Sets the value of the '{@link datamodel.base.ControlPoint#getAux <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' attribute.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();'"
	 * @generated
	 */
	String CPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return AltPName();\r\n'"
	 * @generated
	 */
	String AltCPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Archive On Use\")].equals(\"yes\");\r\n'"
	 * @generated
	 */
	boolean ArchiveOnUse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return false;\r\n'"
	 * @generated
	 */
	boolean isMonitored();

} // ControlPoint
