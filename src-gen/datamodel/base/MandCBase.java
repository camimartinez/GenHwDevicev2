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
 * <ul>
 *   <li>{@link datamodel.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getParent <em>Parent</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getArchive <em>Archive</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getDependents <em>Dependents</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getSetInfFromSpread <em>Set Inf From Spread</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getGetCommonInf <em>Get Common Inf</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getSetMPorCP <em>Set MPor CP</em>}</li>
 *   <li>{@link datamodel.base.MandCBase#getGetSheetMP <em>Get Sheet MP</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getMandCBase()
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
	 * @see datamodel.base.BasePackage#getMandCBase_SpreadsheetName()
	 * @model default="Not needed"
	 * @generated
	 */
	String getSpreadsheetName();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getSpreadsheetName <em>Spreadsheet Name</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_SheetName()
	 * @model
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getSheetName <em>Sheet Name</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getRow <em>Row</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_ParentRow()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getParentRow();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getParentRow <em>Parent Row</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getSheet <em>Sheet</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_Parent()
	 * @model transient="true"
	 * @generated
	 */
	Resource getParent();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getParent <em>Parent</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_Archive()
	 * @model transient="true"
	 * @generated
	 */
	Resource getArchive();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getArchive <em>Archive</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getMandCBase_Dependents()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getDependents();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getDependents <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependents</em>' attribute.
	 * @see #getDependents()
	 * @generated
	 */
	void setDependents(ResourceSet value);

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
	 * @see datamodel.base.BasePackage#getMandCBase_SetInfFromSpread()
	 * @model
	 * @generated
	 */
	Util getSetInfFromSpread();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getSetInfFromSpread <em>Set Inf From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Inf From Spread</em>' reference.
	 * @see #getSetInfFromSpread()
	 * @generated
	 */
	void setSetInfFromSpread(Util value);

	/**
	 * Returns the value of the '<em><b>Get Common Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Common Inf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Common Inf</em>' reference.
	 * @see #setGetCommonInf(Table)
	 * @see datamodel.base.BasePackage#getMandCBase_GetCommonInf()
	 * @model
	 * @generated
	 */
	Table getGetCommonInf();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getGetCommonInf <em>Get Common Inf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Common Inf</em>' reference.
	 * @see #getGetCommonInf()
	 * @generated
	 */
	void setGetCommonInf(Table value);

	/**
	 * Returns the value of the '<em><b>Set MPor CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set MPor CP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set MPor CP</em>' reference.
	 * @see #setSetMPorCP(ArchiveProperty)
	 * @see datamodel.base.BasePackage#getMandCBase_SetMPorCP()
	 * @model
	 * @generated
	 */
	ArchiveProperty getSetMPorCP();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getSetMPorCP <em>Set MPor CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set MPor CP</em>' reference.
	 * @see #getSetMPorCP()
	 * @generated
	 */
	void setSetMPorCP(ArchiveProperty value);

	/**
	 * Returns the value of the '<em><b>Get Sheet MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Sheet MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Sheet MP</em>' reference.
	 * @see #setGetSheetMP(MonitorPoint)
	 * @see datamodel.base.BasePackage#getMandCBase_GetSheetMP()
	 * @model
	 * @generated
	 */
	MonitorPoint getGetSheetMP();

	/**
	 * Sets the value of the '{@link datamodel.base.MandCBase#getGetSheetMP <em>Get Sheet MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Sheet MP</em>' reference.
	 * @see #getGetSheetMP()
	 * @generated
	 */
	void setGetSheetMP(MonitorPoint value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Name\")];\r\n\r\n'"
	 * @generated
	 */
	String FullName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(isDependent())\r\n\treturn row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Name\")].substring(1);\r\nelse\r\n\treturn row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Name\")];'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().AltName(getDependentName());\r\n\r\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().AltName(((MandCBase)getParent()).Name());\r\n\r\n'"
	 * @generated
	 */
	String getAltDependsOnName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Data Units\")];\r\n\r\n'"
	 * @generated
	 */
	String DataUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Min Range\")];\r\n\r\n'"
	 * @generated
	 */
	String MinRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Max Range\")];\r\n\r\n'"
	 * @generated
	 */
	String MaxRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Mode\")];\r\n'"
	 * @generated
	 */
	String Mode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Implement\")].equals(\"yes\");\r\n\r\n'"
	 * @generated
	 */
	boolean Implement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"External\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean External();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Description\")];'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (Name().startsWith(\"SET_\"))\r\n\treturn \"Cntl\" + BaseFactoryImpl.eINSTANCE.createUtil().AltName(PName()); \r\nreturn BaseFactoryImpl.eINSTANCE.createUtil().AltName(PName());'"
	 * @generated
	 */
	String AltPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().descriptionAsString(Description());'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL2(Description());'"
	 * @generated
	 */
	String DescriptionFormatted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL4(Description());'"
	 * @generated
	 */
	String DescriptionFormattedL4();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL5(Description());'"
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
