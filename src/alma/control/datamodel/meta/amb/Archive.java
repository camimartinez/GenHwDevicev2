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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getArchive()
 * @model
 * @generated
 */
public interface Archive extends ArchiveProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Assembly\")];'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.tables = tables;\nsetArchiveProperty(row, tables);'"
	 * @generated
	 */
	void setArchiveAmb(String[] row, Table tables);

} // Archive
