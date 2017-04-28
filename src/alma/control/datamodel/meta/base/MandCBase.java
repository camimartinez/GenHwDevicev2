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

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getContainer <em>Container</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getMancList <em>Manc</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getTables <em>Tables</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getUtils <em>Utils</em>}</li>
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
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(ResourceSet)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Container()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getContainer();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ResourceSet value);

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
	 * @model id="true" transient="true"
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
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(EObject)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Parent()
	 * @model dataType="alma.control.datamodel.meta.base.EObjectDT" transient="true"
	 * @generated
	 */
	EObject getParent();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EObject value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' reference isn't clear,
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MandCBase[] getManc();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MandCBase getManc(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getMancLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setManc(MandCBase[] newManc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setManc(int index, MandCBase element);

	/**
	 * Returns the value of the '<em><b>Manc</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.base.MandCBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manc</em>' containment reference list.
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Manc()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MandCBase> getMancList();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='dependents.getContents().add(son);\ncontainer.getResources().add(dependents);'"
	 * @generated
	 */
	void addDependent(EObject son);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\tif (getParent() == null){\n\t\t\t\t//\tSystem.out.println(\"no tiene padre\");\n\t\t\t\t\treturn false;\n\t\t\t\t}\n\t\t\t\t//System.out.println(\"si tiene padre\");\n\t\t\t\treturn true;'"
	 * @generated
	 */
	boolean IsDependent();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(IsDependent())\n\t\t\t\t\treturn row[tables.getColNum(sheet, \"Name\")].substring(1);\n\t\t\t\telse\n\t\t\t\t\treturn row[tables.getColNum(sheet, \"Name\")];'"
	 * @generated
	 */
	String Name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return Name();\r\n'"
	 * @generated
	 */
	String GetDependentName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return utils.AltName(GetDependentName());'"
	 * @generated
	 */
	String GetAltDependentName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!IsDependent())\n\t\t\treturn \"\";\n\t\treturn ((MandCBase)getParent()).Name();'"
	 * @generated
	 */
	String GetDependsOnName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\treturn utils.AltName(((MandCBase)getParent()).Name());'"
	 * @generated
	 */
	String GetAltDependsOnName();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return External();'"
	 * @generated
	 */
	boolean IsExternal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean IsArchived();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return Implement();'"
	 * @generated
	 */
	boolean IsImplemented();

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
	 * @model
	 * @generated
	 */
	boolean IsMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.tables = tables;\nthis.utils = utils;'"
	 * @generated
	 */
	void setMandCBase(Table tables, Util utils);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.row = row;\nthis.parent = parent;\ndependents = container.createResource(URI.createURI(\"\"));\nsheet = (this instanceof MonitorPoint) ? tables.getSheetNum(\"Monitor Point\") : tables.getSheetNum(\"Control Point\");'"
	 * @generated
	 */
	void setMandCBase(String[] row, EObject parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	void setArchiveProp(ArchiveProperty archive);

} // MandCBase
