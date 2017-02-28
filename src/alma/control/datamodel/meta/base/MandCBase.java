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
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getSetInfFromSpread <em>Set Inf From Spread</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getToCommonInf <em>To Common Inf</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getToMPorCP <em>To MPor CP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MandCBase#getToSheetMP <em>To Sheet MP</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase()
 * @model abstract="true" superTypes="alma.control.datamodel.meta.amb.ResourceAuxClass"
 * @generated
 */
public interface MandCBase extends EObject, Resource {
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
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Parent()
	 * @model transient="true"
	 * @generated
	 */
	Resource getParent();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Resource value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' attribute.
	 * @see #setArchive(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Archive()
	 * @model transient="true"
	 * @generated
	 */
	Resource getArchive();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getArchive <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' attribute.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(Resource value);

	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependents</em>' attribute.
	 * @see #setDependents(ResourceSet)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Dependents()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getDependents();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getDependents <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependents</em>' attribute.
	 * @see #getDependents()
	 * @generated
	 */
	void setDependents(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * The default value is <code>"BaseFactory.eINSTANCE;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(Table)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Table()
	 * @model default="BaseFactory.eINSTANCE;" unique="false" dataType="alma.control.datamodel.meta.amb.TableDT"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Util</b></em>' attribute.
	 * The default value is <code>"BaseFactory.eINSTANCE;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Util</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Util</em>' attribute.
	 * @see #setUtil(Util)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_Util()
	 * @model default="BaseFactory.eINSTANCE;" dataType="alma.control.datamodel.meta.amb.UtilDT"
	 * @generated
	 */
	Util getUtil();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getUtil <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Util</em>' attribute.
	 * @see #getUtil()
	 * @generated
	 */
	void setUtil(Util value);

	/**
	 * Returns the value of the '<em><b>Set Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Inf From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Inf From Spread</em>' reference.
	 * @see #setSetInfFromSpread(Util)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_SetInfFromSpread()
	 * @model
	 * @generated
	 */
	Util getSetInfFromSpread();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getSetInfFromSpread <em>Set Inf From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Inf From Spread</em>' reference.
	 * @see #getSetInfFromSpread()
	 * @generated
	 */
	void setSetInfFromSpread(Util value);

	/**
	 * Returns the value of the '<em><b>To Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Common Inf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Common Inf</em>' reference.
	 * @see #setToCommonInf(Table)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_ToCommonInf()
	 * @model
	 * @generated
	 */
	Table getToCommonInf();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getToCommonInf <em>To Common Inf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Common Inf</em>' reference.
	 * @see #getToCommonInf()
	 * @generated
	 */
	void setToCommonInf(Table value);

	/**
	 * Returns the value of the '<em><b>To MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To MPor CP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To MPor CP</em>' reference.
	 * @see #setToMPorCP(ArchiveProperty)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_ToMPorCP()
	 * @model
	 * @generated
	 */
	ArchiveProperty getToMPorCP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getToMPorCP <em>To MPor CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To MPor CP</em>' reference.
	 * @see #getToMPorCP()
	 * @generated
	 */
	void setToMPorCP(ArchiveProperty value);

	/**
	 * Returns the value of the '<em><b>To Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Sheet MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Sheet MP</em>' reference.
	 * @see #setToSheetMP(MonitorPoint)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMandCBase_ToSheetMP()
	 * @model
	 * @generated
	 */
	MonitorPoint getToSheetMP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MandCBase#getToSheetMP <em>To Sheet MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Sheet MP</em>' reference.
	 * @see #getToSheetMP()
	 * @generated
	 */
	void setToSheetMP(MonitorPoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='dependents.getResources().add(son);\r\n'"
	 * @generated
	 */
	void addDependent(Resource son);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return !dependents.getResources().isEmpty();\r\n'"
	 * @generated
	 */
	boolean hasDependents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Name\")];'"
	 * @generated
	 */
	String FullName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(isDependent())\n\t\t\treturn row[table.getColNum(sheet, \"Name\")].substring(1);\n\t\telse\n\t\t\treturn row[table.getColNum(sheet, \"Name\")];'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.AltName(getDependentName());'"
	 * @generated
	 */
	String getAltDependentName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isDependent())\r\n\treturn \"\";\r\nreturn ((MandCBase)getParent()).Name();'"
	 * @generated
	 */
	String getDependsOnName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.AltName(((MandCBase)getParent()).Name());'"
	 * @generated
	 */
	String getAltDependsOnName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Data Units\")];'"
	 * @generated
	 */
	String DataUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Min Range\")];'"
	 * @generated
	 */
	String MinRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Max Range\")];'"
	 * @generated
	 */
	String MaxRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Mode\")];'"
	 * @generated
	 */
	String Mode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Implement\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean Implement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"External\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean External();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Description\")];'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (s.startsWith(\"GET_\") || s.startsWith(\"SET_\"))\r\n\treturn s.substring(4);\r\nreturn s;'"
	 * @generated
	 */
	String dropPrefix(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (Name().startsWith(TableImpl.DEP_CHAR_EDEFAULT))\r\n\treturn dropPrefix(Name().substring(1));\r\nreturn dropPrefix(Name());'"
	 * @generated
	 */
	String PName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (Name().startsWith(\"SET_\"))\n\treturn \"Cntl\" + util.AltName(PName()); \nreturn util.AltName(PName());'"
	 * @generated
	 */
	String AltPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.descriptionAsString(Description());'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.formatDescriptionL2(Description());'"
	 * @generated
	 */
	String DescriptionFormatted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.formatDescriptionL4(Description());'"
	 * @generated
	 */
	String DescriptionFormattedL4();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.formatDescriptionL5(Description());'"
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

} // MandCBase