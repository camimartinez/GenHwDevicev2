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

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.ArchiveProperty#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.ArchiveProperty#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.ArchiveProperty#getMp <em>Mp</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.ArchiveProperty#getCp <em>Cp</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.ArchiveProperty#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.ArchiveProperty#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty()
 * @model
 * @generated
 */
public interface ArchiveProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(String[])
	 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty_Row()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ArchiveProperty#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(String[] value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' attribute.
	 * @see #setSheet(int)
	 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ArchiveProperty#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp</em>' attribute.
	 * @see #setMp(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty_Mp()
	 * @model transient="true"
	 * @generated
	 */
	Resource getMp();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ArchiveProperty#getMp <em>Mp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mp</em>' attribute.
	 * @see #getMp()
	 * @generated
	 */
	void setMp(Resource value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty_Cp()
	 * @model transient="true"
	 * @generated
	 */
	Resource getCp();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ArchiveProperty#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(Resource value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(Table)
	 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty_Table()
	 * @model dataType="alma.control.datamodel.meta.amb.TableDT"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ArchiveProperty#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference.
	 * @see #setTables(Table)
	 * @see alma.control.datamodel.meta.base.BasePackage#getArchiveProperty_Tables()
	 * @model
	 * @generated
	 */
	Table getTables();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.ArchiveProperty#getTables <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mp != null || cp != null;\r\n'"
	 * @generated
	 */
	boolean isRefersTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mp != null;'"
	 * @generated
	 */
	boolean isMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return cp != null;'"
	 * @generated
	 */
	boolean isControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mp;'"
	 * @generated
	 */
	Resource getMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return cp;'"
	 * @generated
	 */
	Resource getControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String name = Name();\n\tif (name.startsWith(table.getDepChar()))\n\tname = name.substring(1);\nreturn name;'"
	 * @generated
	 */
	String APName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Name\")];'"
	 * @generated
	 */
	String Name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Refers To\")];'"
	 * @generated
	 */
	String RefersTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Interval (secs)\")];'"
	 * @generated
	 */
	String IntervalFull();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Interval (secs)\")];'"
	 * @generated
	 */
	String Interval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Only On Change\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean OnlyOnChange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Display Units\")];'"
	 * @generated
	 */
	String DisplayUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Graph Min\")];'"
	 * @generated
	 */
	String GraphMin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Graph Max\")];'"
	 * @generated
	 */
	String GraphMax();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Format\")];'"
	 * @generated
	 */
	String Format();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"On Startup\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean OnStartup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Title\")];'"
	 * @generated
	 */
	String Title();

} // ArchiveProperty
