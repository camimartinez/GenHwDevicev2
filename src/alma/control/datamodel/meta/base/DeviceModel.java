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

import alma.control.datamodel.meta.amb.Main;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getNotes <em>Notes</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getMain <em>Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getContainer <em>Container</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getDeviceDir <em>Device Dir</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getAPropertiesList <em>AProperties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getCPointsList <em>CPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getMPointsList <em>MPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getUtils <em>Utils</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getTables <em>Tables</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getMainAmb <em>Main Amb</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.DeviceModel#getMainEth <em>Main Eth</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel()
 * @model abstract="true"
 * @generated
 */
public interface DeviceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Index</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Index</em>' attribute.
	 * @see #setDescriptionIndex(int)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_DescriptionIndex()
	 * @model default="1"
	 * @generated
	 */
	int getDescriptionIndex();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Index</em>' attribute.
	 * @see #getDescriptionIndex()
	 * @generated
	 */
	void setDescriptionIndex(int value);

	/**
	 * Returns the value of the '<em><b>Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet</em>' attribute.
	 * @see #setSpreadsheet(String[][][])
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_Spreadsheet()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray3"
	 * @generated
	 */
	String[][][] getSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet</em>' attribute.
	 * @see #getSpreadsheet()
	 * @generated
	 */
	void setSpreadsheet(String[][][] value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_Notes()
	 * @model transient="true"
	 * @generated
	 */
	Resource getNotes();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(Resource value);

	/**
	 * Returns the value of the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Points</em>' attribute.
	 * @see #setMonitorPoints(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_MonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	Resource getMonitorPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Points</em>' attribute.
	 * @see #getMonitorPoints()
	 * @generated
	 */
	void setMonitorPoints(Resource value);

	/**
	 * Returns the value of the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points</em>' attribute.
	 * @see #setControlPoints(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_ControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	Resource getControlPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getControlPoints <em>Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Points</em>' attribute.
	 * @see #getControlPoints()
	 * @generated
	 */
	void setControlPoints(Resource value);

	/**
	 * Returns the value of the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive Properties</em>' attribute.
	 * @see #setArchiveProperties(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_ArchiveProperties()
	 * @model transient="true"
	 * @generated
	 */
	Resource getArchiveProperties();

	/**
	 * Returns the value of the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive Properties</em>' attribute.
	 * @see #setArchiveProperties(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_ArchiveProperties()
	 * @model transient="true"
	 * @!generated
	 */
	ArchiveProperty getArchiveProperties(String name);
	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Properties</em>' attribute.
	 * @see #getArchiveProperties()
	 * @generated
	 */
	void setArchiveProperties(Resource value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(Resource)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_Main()
	 * @model transient="true"
	 * @generated
	 */
	Resource getMain();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Resource value);

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
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_Container()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getContainer();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see #setBusType(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_BusType()
	 * @model
	 * @generated
	 */
	String getBusType();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(String value);

	/**
	 * Returns the value of the '<em><b>Device Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Dir</em>' attribute.
	 * @see #setDeviceDir(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_DeviceDir()
	 * @model
	 * @generated
	 */
	String getDeviceDir();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getDeviceDir <em>Device Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Dir</em>' attribute.
	 * @see #getDeviceDir()
	 * @generated
	 */
	void setDeviceDir(String value);

	/**
	 * Returns the value of the '<em><b>Codegen Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codegen Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codegen Dir</em>' attribute.
	 * @see #setCodegenDir(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_CodegenDir()
	 * @model
	 * @generated
	 */
	String getCodegenDir();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codegen Dir</em>' attribute.
	 * @see #getCodegenDir()
	 * @generated
	 */
	void setCodegenDir(String value);

	/**
	 * Returns the value of the '<em><b>Spreadsheet Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet Dir</em>' attribute.
	 * @see #setSpreadsheetDir(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_SpreadsheetDir()
	 * @model
	 * @generated
	 */
	String getSpreadsheetDir();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet Dir</em>' attribute.
	 * @see #getSpreadsheetDir()
	 * @generated
	 */
	void setSpreadsheetDir(String value);

	/**
	 * Returns the value of the '<em><b>Generated Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Dir</em>' attribute.
	 * @see #setGeneratedDir(String)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_GeneratedDir()
	 * @model
	 * @generated
	 */
	String getGeneratedDir();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Dir</em>' attribute.
	 * @see #getGeneratedDir()
	 * @generated
	 */
	void setGeneratedDir(String value);

	/**
	 * Returns the value of the '<em><b>Monitor DB Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor DB Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor DB Only</em>' attribute.
	 * @see #setMonitorDBOnly(boolean)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_MonitorDBOnly()
	 * @model
	 * @generated
	 */
	boolean isMonitorDBOnly();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor DB Only</em>' attribute.
	 * @see #isMonitorDBOnly()
	 * @generated
	 */
	void setMonitorDBOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Alt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Alt</em>' attribute.
	 * @see #setGenerateAlt(boolean)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_GenerateAlt()
	 * @model
	 * @generated
	 */
	boolean isGenerateAlt();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Alt</em>' attribute.
	 * @see #isGenerateAlt()
	 * @generated
	 */
	void setGenerateAlt(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchiveProperty[] getAProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchiveProperty getAProperties(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getAPropertiesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAProperties(ArchiveProperty[] newAProperties);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAProperties(int index, ArchiveProperty element);

	/**
	 * Returns the value of the '<em><b>AProperties</b></em>' reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.base.ArchiveProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AProperties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AProperties</em>' reference list.
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_AProperties()
	 * @model required="true"
	 * @generated
	 */
	EList<ArchiveProperty> getAPropertiesList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlPoint[] getCPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlPoint getCPoints(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCPointsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCPoints(ControlPoint[] newCPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCPoints(int index, ControlPoint element);

	/**
	 * Returns the value of the '<em><b>CPoints</b></em>' reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.base.ControlPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPoints</em>' reference list.
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_CPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<ControlPoint> getCPointsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitorPoint[] getMPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitorPoint getMPoints(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getMPointsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMPoints(MonitorPoint[] newMPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMPoints(int index, MonitorPoint element);

	/**
	 * Returns the value of the '<em><b>MPoints</b></em>' reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.base.MonitorPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPoints</em>' reference list.
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_MPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<MonitorPoint> getMPointsList();

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
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_Utils()
	 * @model
	 * @generated
	 */
	Util getUtils();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getUtils <em>Utils</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utils</em>' reference.
	 * @see #getUtils()
	 * @generated
	 */
	void setUtils(Util value);

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
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_Tables()
	 * @model
	 * @generated
	 */
	Table getTables();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getTables <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(Table value);

	/**
	 * Returns the value of the '<em><b>Main Amb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Amb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Amb</em>' reference.
	 * @see #setMainAmb(Main)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_MainAmb()
	 * @model
	 * @generated
	 */
	Main getMainAmb();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getMainAmb <em>Main Amb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Amb</em>' reference.
	 * @see #getMainAmb()
	 * @generated
	 */
	void setMainAmb(Main value);

	/**
	 * Returns the value of the '<em><b>Main Eth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Eth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Eth</em>' reference.
	 * @see #setMainEth(alma.control.datamodel.meta.eth.Main)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_MainEth()
	 * @model
	 * @generated
	 */
	alma.control.datamodel.meta.eth.Main getMainEth();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.DeviceModel#getMainEth <em>Main Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Eth</em>' reference.
	 * @see #getMainEth()
	 * @generated
	 */
	void setMainEth(alma.control.datamodel.meta.eth.Main value);

	/**
	 * Returns the value of the '<em><b>Control Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Point</em>' containment reference.
	 * @see #setControlPoint(ControlPoint)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_ControlPoint()
	 * @model containment="true" resolveProxies="true"
	 * @!generated
	 */
	ControlPoint getControlPoint(String fullName);
	
	/**
	 * Returns the value of the '<em><b>Monitor Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Point</em>' containment reference.
	 * @see #setMonitorPoint(MonitorPoint)
	 * @see alma.control.datamodel.meta.base.BasePackage#getDeviceModel_MonitorPoint()
	 * @model containment="true" resolveProxies="true"
	 * @!generated
	 */
	MonitorPoint getMonitorPoint(String fullName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String CreateModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\treturn mainAmb.Assembly();\n}else\n\t\treturn mainEth.Assembly();\t'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.Extends();\n\t\t}else\n\t\t\treturn mainEth.Extends();'"
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.DeviceName();\n\t\t}else\n\t\t\treturn mainEth.DeviceName();'"
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.Description();\n\t\t}else\n\t\t\treturn mainEth.Description();'"
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.DescriptionAsString();\n\t\t}else\n\t\t\treturn mainEth.DescriptionAsString();\t'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.ICD();\n\t\t}else\n\t\t\treturn mainEth.ICD();\t'"
	 * @generated
	 */
	String ICD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.ICDDate();\n\t\t}else\n\t\t\treturn mainEth.ICDDate();'"
	 * @generated
	 */
	String ICDDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.ICDDateAsDatabaseDate();\n\t\t}else\n\t\t\treturn mainEth.ICDDateAsDatabaseDate();'"
	 * @generated
	 */
	String ICDDateAsDatabaseDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (this instanceof alma.control.datamodel.meta.amb.impl.DeviceModelImpl){\n\t\t\treturn mainAmb.ICDDateAsArrayTime();\n\t\t}else\n\t\t\treturn mainEth.ICDDateAsArrayTime();'"
	 * @generated
	 */
	String ICDDateAsArrayTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return Assembly();\r\n'"
	 * @generated
	 */
	String DirPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String dir = generatedDir + \"/\" + Assembly();\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"Base.cpp\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"Base.h\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Base.idl\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Add.sql\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \".xml\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \"Component.xml\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/config/CDB/schemas\", Assembly() + \"Base.xsd\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/config\", \"TMCDB\" + Assembly() + \"Add.xml\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/src/CCL\", Assembly() + \"Base.py\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/src/CCL\", \"__init__.py\", 1);\n\t\t\t\tSystem.out.println(\"Code generation for \" + deviceName + \" done.\");\n\t\t\t\treturn \"\";'"
	 * @generated
	 */
	String TheEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.io.File f = new java.io.File(fileName);\r\nif(f.exists() == true){\r\treturn true;\r\n }else{\r\n\treturn false;\r\n          }'"
	 * @generated
	 */
	boolean checkIfFileExists(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(directory.isEmpty() == false){\n\treturn checkIfFileExists(directory + \"/\" + fileName);\r\n} else{\r\n        return checkIfFileExists(fileName);\r\n          }'"
	 * @generated
	 */
	boolean checkIfFileExists(String directory, String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String fileName = getDeviceDir() + \"/\" + directory + \"/\" + Assembly() + localFileName;\nreturn checkIfFileExists(fileName);'"
	 * @generated
	 */
	boolean checkIfDeviceFileExists(String directory, String localFileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String fileName = getDeviceDir() + \"/\" + directory + \"/Test\" + Assembly() + localFileName;\r\nreturn checkIfFileExists(fileName);'"
	 * @generated
	 */
	boolean checkIfTestFileExists(String directory, String localFileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String fileName = getDeviceDir() + \"/\" + directory + \"/.cvsignore\";\r\nreturn checkIfFileExists(fileName);'"
	 * @generated
	 */
	boolean checkIfCvsignoreFileExists(String directory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setDeviceName(System.getProperty(\"deviceName\"));\nthis.setDeviceDir(System.getProperty(\"deviceDir\"));\nthis.setCodegenDir(System.getProperty(\"codegenDir\"));\nthis.setSpreadsheetDir(System.getProperty(\"spreadsheetDir\"));\nthis.setGeneratedDir(System.getProperty(\"generatedDir\"));'"
	 * @generated
	 */
	void setDeviceModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.tables = tables;\nthis.utils = utils;'"
	 * @generated
	 */
	void setDeviceModel(Table tables, Util utils);

} // DeviceModel
