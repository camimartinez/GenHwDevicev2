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
package alma.control.datamodel.meta.amb;


import alma.control.datamodel.meta.base.ArchiveProperty;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.impl.BaseFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.Archive#getBaseFacTmp <em>Base Fac Tmp</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.Archive#getToAssemblyColumn <em>To Assembly Column</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getArchive()
 * @model
 * @generated
 */
public interface Archive extends ArchiveProperty {
	/**
	 * Returns the value of the '<em><b>Base Fac Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Fac Tmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Fac Tmp</em>' attribute.
	 * @see #setBaseFacTmp(BaseFactoryImpl)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getArchive_BaseFacTmp()
	 * @model dataType="alma.control.datamodel.meta.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getBaseFacTmp();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.Archive#getBaseFacTmp <em>Base Fac Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Fac Tmp</em>' attribute.
	 * @see #getBaseFacTmp()
	 * @generated
	 */
	void setBaseFacTmp(BaseFactoryImpl value);

	/**
	 * Returns the value of the '<em><b>To Assembly Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Assembly Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Assembly Column</em>' reference.
	 * @see #setToAssemblyColumn(Table)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getArchive_ToAssemblyColumn()
	 * @model
	 * @generated
	 */
	Table getToAssemblyColumn();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.Archive#getToAssemblyColumn <em>To Assembly Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Assembly Column</em>' reference.
	 * @see #getToAssemblyColumn()
	 * @generated
	 */
	void setToAssemblyColumn(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Assembly\")];'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = IntervalFull();\r\n       if (s.startsWith(\"te/\"))\r\n           return true;\r\nreturn false;'"
	 * @generated
	 */
	boolean isIntervalTE();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(isIntervalTE())\r\n\treturn IntervalFull().substring(3);\r\nreturn IntervalFull();'"
	 * @generated
	 */
	String Interval();

} // Archive
