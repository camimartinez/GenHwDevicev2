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


import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

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
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getDirPath <em>Dir Path</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getMainAssembly <em>Main Assembly</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#isOneSwModule <em>One Sw Module</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getToAddAllMP <em>To Add All MP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getToAddAllCP <em>To Add All CP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getToFormatDescriptions <em>To Format Descriptions</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.SWModule#getToSheetColumns <em>To Sheet Columns</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule()
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_AssemblyName()
	 * @model default="null"
	 * @generated
	 */
	String getAssemblyName();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getAssemblyName <em>Assembly Name</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_DirPath()
	 * @model
	 * @generated
	 */
	String getDirPath();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getDirPath <em>Dir Path</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_MainAssembly()
	 * @model
	 * @generated
	 */
	String getMainAssembly();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getMainAssembly <em>Main Assembly</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_OneSwModule()
	 * @model
	 * @generated
	 */
	boolean isOneSwModule();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#isOneSwModule <em>One Sw Module</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_Row()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getRow <em>Row</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ParentRow()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getParentRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getParentRow <em>Parent Row</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getSheet <em>Sheet</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_MonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getMonitorPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getControlPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getControlPoints <em>Control Points</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ArchiveProperties()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getArchiveProperties();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_SimMonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getSimMonitorPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_SimControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getSimControlPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Control Points</em>' attribute.
	 * @see #getSimControlPoints()
	 * @generated
	 */
	void setSimControlPoints(ResourceSet value);

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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_Table()
	 * @model default="BaseFactory.eINSTANCE;" dataType="alma.control.datamodel.meta.amb.TableDT"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getTable <em>Table</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_Util()
	 * @model default="BaseFactory.eINSTANCE;" dataType="alma.control.datamodel.meta.amb.UtilDT"
	 * @generated
	 */
	Util getUtil();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getUtil <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Util</em>' attribute.
	 * @see #getUtil()
	 * @generated
	 */
	void setUtil(Util value);

	/**
	 * Returns the value of the '<em><b>To Add All MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Add All MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Add All MP</em>' reference.
	 * @see #setToAddAllMP(Monitor)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ToAddAllMP()
	 * @model
	 * @generated
	 */
	Monitor getToAddAllMP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getToAddAllMP <em>To Add All MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add All MP</em>' reference.
	 * @see #getToAddAllMP()
	 * @generated
	 */
	void setToAddAllMP(Monitor value);

	/**
	 * Returns the value of the '<em><b>To Add All CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Add All CP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Add All CP</em>' reference.
	 * @see #setToAddAllCP(Control)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ToAddAllCP()
	 * @model
	 * @generated
	 */
	Control getToAddAllCP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getToAddAllCP <em>To Add All CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add All CP</em>' reference.
	 * @see #getToAddAllCP()
	 * @generated
	 */
	void setToAddAllCP(Control value);

	/**
	 * Returns the value of the '<em><b>To Format Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Format Descriptions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Format Descriptions</em>' reference.
	 * @see #setToFormatDescriptions(Util)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ToFormatDescriptions()
	 * @model
	 * @generated
	 */
	Util getToFormatDescriptions();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getToFormatDescriptions <em>To Format Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Format Descriptions</em>' reference.
	 * @see #getToFormatDescriptions()
	 * @generated
	 */
	void setToFormatDescriptions(Util value);

	/**
	 * Returns the value of the '<em><b>To Sheet Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Sheet Columns</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Sheet Columns</em>' reference.
	 * @see #setToSheetColumns(Table)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getSWModule_ToSheetColumns()
	 * @model
	 * @generated
	 */
	Table getToSheetColumns();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.SWModule#getToSheetColumns <em>To Sheet Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Sheet Columns</em>' reference.
	 * @see #getToSheetColumns()
	 * @generated
	 */
	void setToSheetColumns(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tmonitorPoints.getResources().add(mp);\r\n\t\tif (!(((MonitorImpl)mp).RCA().equals(\"none\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x00000\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x30000\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x30001\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x30002\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x30003\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x30004\") ||\r\n\t\t\t\t((MonitorImpl)mp).RCA().equals(\"0x30005\")\r\n\t\t\t\t)){\r\n\t\t\tfor(int i=0;i&lt; simMonitorPoints.getResources().size();i++)\r\n\t\t\t\tif(((MonitorImpl)mp).RCA().equals(((MonitorImpl)simMonitorPoints.getResources().get(i)).RCA()))\r\n\t\t\t\t\treturn;\r\n\t\t\tsimMonitorPoints.getResources().add(mp);\r\n\t\t}'"
	 * @generated
	 */
	void addMP(Resource mp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tcontrolPoints.getResources().add(cp);\r\n\t\tif (!(((ControlImpl)cp).RCA().equals(\"none\") ||\r\n\t\t\t\t((ControlImpl)cp).RCA().equals(\"0x31000\") ||\r\n\t\t\t\t((ControlImpl)cp).RCA().equals(\"0x31001\")\r\n\t\t\t\t)){\r\n\t\t\tfor(int i=0;i&lt; simControlPoints.getResources().size();i++)\r\n\t\t\t\tif(((ControlImpl)cp).RCA().equals(((ControlImpl)simControlPoints.getResources().get(i)).RCA()))\r\n\t\t\t\t\treturn;\r\n\t\t\tsimControlPoints.getResources().add(cp);\r\n\t\t}'"
	 * @generated
	 */
	void addCP(Resource cp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='archiveProperties.getResources().add(ap);\r\n'"
	 * @generated
	 */
	void addAP(Resource ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";'"
	 * @generated
	 */
	String Initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return dirPath;'"
	 * @generated
	 */
	String DirPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return monitorPoints;'"
	 * @generated
	 */
	ResourceSet MonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return controlPoints;'"
	 * @generated
	 */
	ResourceSet ControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return archiveProperties;'"
	 * @generated
	 */
	ResourceSet ArchiveProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return simMonitorPoints;'"
	 * @generated
	 */
	ResourceSet SimMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return simControlPoints;'"
	 * @generated
	 */
	ResourceSet SimControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Assembly\")];'"
	 * @generated
	 */
	String Assembly();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.formatDescriptionL1(Description());'"
	 * @generated
	 */
	String DescriptionL1();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Device Name\")];'"
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Extends\")];'"
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Parent\")];'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Cardinality\")];'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Generic Monitor Points\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Node Address\")];'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='        int n = -1;\r\n        try {\r\n            n = Integer.parseInt(s.substring(2),16);\r\n        } catch (NumberFormatException err) {\r\n            throw new RuntimeException(\"Invalid number (\" + s + \")\");\r\n        }\r\n        return Integer.toString(n);'"
	 * @generated
	 */
	String HexToDec(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = NodeAddress();\r\n\t\tif (s.equals(\"parm\"))\r\n\t\t    return \"0\";\r\n\t\treturn HexToDec(s);'"
	 * @generated
	 */
	String NodeAddressInDecimal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Channel\")];'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Base Address\")];'"
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString hex = Integer.toHexString(Assembly().hashCode()).toLowerCase();\r\n\t\thex = \"0000000000000000\" + hex;\r\n\t\tint len = hex.length();\r\n\t\thex = \"0x\" + hex.substring(len - 16, len);\r\n\t\treturn hex;'"
	 * @generated
	 */
	String SimSerialNumber();

} // SWModule