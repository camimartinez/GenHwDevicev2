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
package datamodel.amb;

import datamodel.base.Table;
import datamodel.base.Util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.SWModule#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getDirPath <em>Dir Path</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getMainAssembly <em>Main Assembly</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#isOneSwModule <em>One Sw Module</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getAddAllMP <em>Add All MP</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getAddAllCP <em>Add All CP</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getSetFormatDescriptions <em>Set Format Descriptions</em>}</li>
 *   <li>{@link datamodel.amb.SWModule#getGetSheetColumns <em>Get Sheet Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getSWModule()
 * @model
 * @generated
 */
public interface SWModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Name</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Name</em>' attribute.
	 * @see #setAssemblyName(String)
	 * @see datamodel.amb.AmbPackage#getSWModule_AssemblyName()
	 * @model default="null"
	 * @generated
	 */
	String getAssemblyName();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getAssemblyName <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Name</em>' attribute.
	 * @see #getAssemblyName()
	 * @generated
	 */
	void setAssemblyName(String value);

	/**
	 * Returns the value of the '<em><b>Dir Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Path</em>' attribute.
	 * @see #setDirPath(String)
	 * @see datamodel.amb.AmbPackage#getSWModule_DirPath()
	 * @model
	 * @generated
	 */
	String getDirPath();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getDirPath <em>Dir Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Path</em>' attribute.
	 * @see #getDirPath()
	 * @generated
	 */
	void setDirPath(String value);

	/**
	 * Returns the value of the '<em><b>Main Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Assembly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Assembly</em>' attribute.
	 * @see #setMainAssembly(String)
	 * @see datamodel.amb.AmbPackage#getSWModule_MainAssembly()
	 * @model
	 * @generated
	 */
	String getMainAssembly();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getMainAssembly <em>Main Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Assembly</em>' attribute.
	 * @see #getMainAssembly()
	 * @generated
	 */
	void setMainAssembly(String value);

	/**
	 * Returns the value of the '<em><b>One Sw Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Sw Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Sw Module</em>' attribute.
	 * @see #setOneSwModule(boolean)
	 * @see datamodel.amb.AmbPackage#getSWModule_OneSwModule()
	 * @model
	 * @generated
	 */
	boolean isOneSwModule();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#isOneSwModule <em>One Sw Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Sw Module</em>' attribute.
	 * @see #isOneSwModule()
	 * @generated
	 */
	void setOneSwModule(boolean value);

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
	 * @see datamodel.amb.AmbPackage#getSWModule_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getRow <em>Row</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getSWModule_ParentRow()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getParentRow();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getParentRow <em>Parent Row</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getSWModule_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Points</em>' attribute.
	 * @see #setMonitorPoints(ResourceSet)
	 * @see datamodel.amb.AmbPackage#getSWModule_MonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getMonitorPoints();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Points</em>' attribute.
	 * @see #getMonitorPoints()
	 * @generated
	 */
	void setMonitorPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points</em>' attribute.
	 * @see #setControlPoints(ResourceSet)
	 * @see datamodel.amb.AmbPackage#getSWModule_ControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getControlPoints();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getControlPoints <em>Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Points</em>' attribute.
	 * @see #getControlPoints()
	 * @generated
	 */
	void setControlPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive Properties</em>' attribute.
	 * @see #setArchiveProperties(ResourceSet)
	 * @see datamodel.amb.AmbPackage#getSWModule_ArchiveProperties()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getArchiveProperties();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Properties</em>' attribute.
	 * @see #getArchiveProperties()
	 * @generated
	 */
	void setArchiveProperties(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Sim Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Monitor Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Monitor Points</em>' attribute.
	 * @see #setSimMonitorPoints(ResourceSet)
	 * @see datamodel.amb.AmbPackage#getSWModule_SimMonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getSimMonitorPoints();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Monitor Points</em>' attribute.
	 * @see #getSimMonitorPoints()
	 * @generated
	 */
	void setSimMonitorPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Sim Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Control Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Control Points</em>' attribute.
	 * @see #setSimControlPoints(ResourceSet)
	 * @see datamodel.amb.AmbPackage#getSWModule_SimControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getSimControlPoints();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Control Points</em>' attribute.
	 * @see #getSimControlPoints()
	 * @generated
	 */
	void setSimControlPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Add All MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add All MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add All MP</em>' reference.
	 * @see #setAddAllMP(MonitorAMB)
	 * @see datamodel.amb.AmbPackage#getSWModule_AddAllMP()
	 * @model
	 * @generated
	 */
	MonitorAMB getAddAllMP();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getAddAllMP <em>Add All MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add All MP</em>' reference.
	 * @see #getAddAllMP()
	 * @generated
	 */
	void setAddAllMP(MonitorAMB value);

	/**
	 * Returns the value of the '<em><b>Add All CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add All CP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add All CP</em>' reference.
	 * @see #setAddAllCP(ControlAMB)
	 * @see datamodel.amb.AmbPackage#getSWModule_AddAllCP()
	 * @model
	 * @generated
	 */
	ControlAMB getAddAllCP();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getAddAllCP <em>Add All CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add All CP</em>' reference.
	 * @see #getAddAllCP()
	 * @generated
	 */
	void setAddAllCP(ControlAMB value);

	/**
	 * Returns the value of the '<em><b>Set Format Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Format Descriptions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Format Descriptions</em>' reference.
	 * @see #setSetFormatDescriptions(Util)
	 * @see datamodel.amb.AmbPackage#getSWModule_SetFormatDescriptions()
	 * @model
	 * @generated
	 */
	Util getSetFormatDescriptions();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getSetFormatDescriptions <em>Set Format Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Format Descriptions</em>' reference.
	 * @see #getSetFormatDescriptions()
	 * @generated
	 */
	void setSetFormatDescriptions(Util value);

	/**
	 * Returns the value of the '<em><b>Get Sheet Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Sheet Columns</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Sheet Columns</em>' reference.
	 * @see #setGetSheetColumns(Table)
	 * @see datamodel.amb.AmbPackage#getSWModule_GetSheetColumns()
	 * @model
	 * @generated
	 */
	Table getGetSheetColumns();

	/**
	 * Sets the value of the '{@link datamodel.amb.SWModule#getGetSheetColumns <em>Get Sheet Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Sheet Columns</em>' reference.
	 * @see #getGetSheetColumns()
	 * @generated
	 */
	void setGetSheetColumns(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addMP(Resource mp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCP(Resource cp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAP(Resource ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DirPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet MonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet ControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet ArchiveProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet SimMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet SimControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DescriptionL1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String HexToDec(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NodeAddressInDecimal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String SimSerialNumber();

} // SWModule
