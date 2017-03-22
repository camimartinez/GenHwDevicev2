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
package alma.control.datamodel.meta.base;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.ControlPoint#getResourceSetControl <em>Resource Set Control</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getControlPoint()
 * @model abstract="true"
 * @generated
 */
public interface ControlPoint extends MandCBase {
	/**
	 * Returns the value of the '<em><b>Resource Set Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set Control</em>' attribute.
	 * @see #setResourceSetControl(ResourceSet)
	 * @see alma.control.datamodel.meta.base.BasePackage#getControlPoint_ResourceSetControl()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getResourceSetControl();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ControlPoint#getResourceSetControl <em>Resource Set Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set Control</em>' attribute.
	 * @see #getResourceSetControl()
	 * @generated
	 */
	void setResourceSetControl(ResourceSet value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Archive On Use\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean ArchiveOnUse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return false;\r\n'"
	 * @generated
	 */
	boolean IsMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.tables = tables;\nthis.utils = utils;\nsetMandCBase(row, parent, tables, utils);'"
	 * @generated
	 */
	void setControlPoint(String[] row, EObject parent, Table tables, Util utils);

} // ControlPoint
