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
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mand CBase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getResourceSetDependent <em>Resource Set Dependent</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getTables <em>Tables</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getUtils <em>Utils</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase()
 * @model abstract="true"
 * @generated
 */
public interface MandCBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Spreadsheet Name</b></em>' attribute.
	 * The default value is <code>"Not needed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet Name</em>' attribute.
	 * @see #setSpreadsheetName(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_SpreadsheetName()
	 * @model default="Not needed"
	 * @generated
	 */
	String getSpreadsheetName();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet Name</em>' attribute.
	 * @see #getSpreadsheetName()
	 * @generated
	 */
	void setSpreadsheetName(String value);

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute.
	 * @see #setSheetName(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_SheetName()
	 * @model
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getSheetName <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Name</em>' attribute.
	 * @see #getSheetName()
	 * @generated
	 */
	void setSheetName(String value);

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
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Row()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(String[] value);

	/**
	 * Returns the value of the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Row</em>' attribute.
	 * @see #setParentRow(String[])
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_ParentRow()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getParentRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getParentRow <em>Parent Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Row</em>' attribute.
	 * @see #getParentRow()
	 * @generated
	 */
	void setParentRow(String[] value);

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
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Resource Set Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set Dependent</em>' attribute.
	 * @see #setResourceSetDependent(ResourceSet)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_ResourceSetDependent()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getResourceSetDependent();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getResourceSetDependent <em>Resource Set Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set Dependent</em>' attribute.
	 * @see #getResourceSetDependent()
	 * @generated
	 */
	void setResourceSetDependent(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(Object)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Parent()
	 * @model transient="true"
	 * @generated
	 */
	Object getParent();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Object value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' reference.
	 * @see #setArchive(ArchiveProperty)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Archive()
	 * @model
	 * @generated
	 */
	ArchiveProperty getArchive();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' reference.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(ArchiveProperty value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='dependents.getContents().add(son);'"
	 * @generated
	 */
	void addDependent(Object son);

	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependents</em>' attribute.
	 * @see #setDependents(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Dependents()
	 * @model transient="true"
	 * @generated
	 */
	Resource getDependents();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependents</em>' attribute.
	 * @see #getDependents()
	 * @generated
	 */
	void setDependents(Resource value);

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
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Tables()
	 * @model
	 * @generated
	 */
	Table getTables();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getTables <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(Table value);

	/**
	 * Returns the value of the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utils</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utils</em>' reference.
	 * @see #setUtils(Util)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Utils()
	 * @model
	 * @generated
	 */
	Util getUtils();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getUtils <em>Utils</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utils</em>' reference.
	 * @see #getUtils()
	 * @generated
	 */
	void setUtils(Util value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (parent == null)\r\n\treturn false;\r\nreturn true;'"
	 * @generated
	 */
	boolean isDependent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return !dependents.getContents().isEmpty();'"
	 * @generated
	 */
	boolean hasDependents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Name\")];'"
	 * @generated
	 */
	String FullName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(isDependent())\n\t\t\t\t\treturn row[tables.getColNum(sheet, \"Name\")].substring(1);\n\t\t\t\telse\n\t\t\t\t\treturn row[tables.getColNum(sheet, \"Name\")];'"
	 * @generated
	 */
	String Name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return Name();\r\n'"
	 * @generated
	 */
	String getDependentName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.AltName(getDependentName());'"
	 * @generated
	 */
	String getAltDependentName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isDependent())\n\t\t\treturn \"\";\n\t\treturn ((MandCBase)getParent()).Name();'"
	 * @generated
	 */
	String getDependsOnName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.AltName(((MandCBase)getParent()).Name());'"
	 * @generated
	 */
	String getAltDependsOnName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Data Units\")];'"
	 * @generated
	 */
	String DataUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Min Range\")];'"
	 * @generated
	 */
	String MinRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Max Range\")];'"
	 * @generated
	 */
	String MaxRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Mode\")];'"
	 * @generated
	 */
	String Mode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Implement\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean Implement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"External\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean External();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[tables.getColNum(sheet, \"Description\")];'"
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return External();'"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean isArchived();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return Implement();'"
	 * @generated
	 */
	boolean isImplemented();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alma.control.datamodel.meta.base.RuntimeExceptionDT" errDataType="alma.control.datamodel.meta.base.RuntimeExceptionDT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return new RuntimeException(spreadsheetName +\":\"+ sheetName +\":\"+ cell +\":\"+ err.toString());'"
	 * @generated
	 */
	RuntimeException dErr(RuntimeException err, String cell);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alma.control.datamodel.meta.base.RuntimeExceptionDT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return new RuntimeException(spreadsheetName +\":\"+ sheetName +\":\"+ cell +\":\"+ err);'"
	 * @generated
	 */
	RuntimeException dErr(String err, String cell);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (s.startsWith(\"GET_\") || s.startsWith(\"SET_\"))\r\n\treturn s.substring(4);\r\nreturn s;'"
	 * @generated
	 */
	String dropPrefix(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (Name().startsWith(tables.getDepChar()))\n\t\t\treturn dropPrefix(Name().substring(1));\n\t\treturn dropPrefix(Name());'"
	 * @generated
	 */
	String PName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif (Name().startsWith(\"SET_\"))\n\t\t\treturn \"Cntl\" + utils.AltName(PName()); \n\t\treturn utils.AltName(PName());'"
	 * @generated
	 */
	String AltPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.descriptionAsString(Description());'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.formatDescriptionL2(Description());'"
	 * @generated
	 */
	String DescriptionFormatted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.formatDescriptionL4(Description());'"
	 * @generated
	 */
	String DescriptionFormattedL4();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.formatDescriptionL5(Description());'"
	 * @generated
	 */
	String DescriptionFormattedL5();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.tables = tables;\n\t\tthis.utils = utils;\n\t\tthis.row = row;\n\t\tthis.parent = parent;\n\t\tResourceSet resourceSetDependents = new ResourceSetImpl();\n\t\tdependents = resourceSetDependents.createResource(URI.createURI(\"\"));\n\t\tsheet = (this instanceof Monitor) ? tables.getSheetNum(\"Monitor Point\") : tables.getSheetNum(\"Control Point\");'"
	 * @generated
	 */
	void setMandCBase(String[] row, Object parent, Table tables, Util utils);

} // MandCBase
