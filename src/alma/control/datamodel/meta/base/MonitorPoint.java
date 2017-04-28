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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Point</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getMonitorPoint()
 * @model abstract="true"
 * @generated
 */
public interface MonitorPoint extends MandCBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Default\")];'"
	 * @generated
	 */
	String Default();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Error Condition\")];'"
	 * @generated
	 */
	String ErrorCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Error Severity\")];'"
	 * @generated
	 */
	String ErrorSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Error Action\")];'"
	 * @generated
	 */
	String ErrorAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();'"
	 * @generated
	 */
	String APName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();'"
	 * @generated
	 */
	String RefersTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tint defaultValue = 300;\n\t\t\t\tif(archive != null) {\n\t\t\t\t\tif ( ((ArchiveProperty)archive).Interval().equals(\"none\") )\n\t\t\t\t\t\treturn Integer.toString(defaultValue);\n\t\t\t\t\tint value = Integer.valueOf(((ArchiveProperty)archive).Interval());\n\t\t\t\t\tif (value &lt;= 0)\n\t\t\t\t\t\tvalue = defaultValue;\n\t\t\t\t\treturn Integer.toString(value);\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t\treturn Integer.toString(defaultValue);'"
	 * @generated
	 */
	String Interval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif(archive != null)\n\t\t\t\t\treturn ((ArchiveProperty)archive).OnlyOnChange();\n\t\t\t\telse\n\t\t\t\t\treturn false;'"
	 * @generated
	 */
	boolean OnlyOnChange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\n\t\t\t\t\treturn ((ArchiveProperty)archive).DisplayUnits();\n\t\t\t\telse\n\t\t\t\t\treturn DataUnits();'"
	 * @generated
	 */
	String DisplayUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(archive != null)\n\t\t\t\t\treturn ((ArchiveProperty)archive).GraphMin();\n\t\t\t\telse\n\t\t\t\t\treturn \"none\";'"
	 * @generated
	 */
	String GraphMin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif(archive != null)\n\t\t\t\t\treturn ((ArchiveProperty)archive).GraphMax();\n\t\t\t\telse\n\t\t\t\t\treturn \"none\";'"
	 * @generated
	 */
	String GraphMax();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\tif(archive != null)\n\t\t\t\t\treturn ((ArchiveProperty)archive).Format();\n\t\t\t\telse\n\t\t\t\t\treturn \"none\";'"
	 * @generated
	 */
	String Format();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\tif(archive != null)\n\t\t\t\t\treturn ((ArchiveProperty)archive).Title();\n\t\t\t\telse\n\t\t\t\t\treturn Description();'"
	 * @generated
	 */
	String Title();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();\r\n'"
	 * @generated
	 */
	String MPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return AltPName();\r\n'"
	 * @generated
	 */
	String AltMPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean IsMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IsPartOfPattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IsHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IsPartOfHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.tables = tables;\nthis.utils = utils;'"
	 * @generated
	 */
	void setMonitorPoint(Table tables, Util utils);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this. row = row;\nthis.parent = parent;\nsuper.setMandCBase(row, parent);'"
	 * @generated
	 */
	void setMonitorPoint(String[] row, EObject parent);

} // MonitorPoint
