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

import alma.control.datamodel.meta.base.Note;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getMainAmbList <em>Main Amb</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getCPointsList <em>CPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getAPointsList <em>APoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getMPointsList <em>MPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.control.datamodel.meta.base.DeviceModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Main[] getMainAmb();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Main getMainAmb(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getMainAmbLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMainAmb(Main[] newMainAmb);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMainAmb(int index, Main element);

	/**
	 * Returns the value of the '<em><b>Main Amb</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.amb.Main}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Amb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Amb</em>' containment reference list.
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_MainAmb()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Main> getMainAmbList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Control[] getCPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Control getCPoints(int index);

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
	void setCPoints(Control[] newCPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCPoints(int index, Control element);

	/**
	 * Returns the value of the '<em><b>CPoints</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.amb.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPoints</em>' containment reference list.
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_CPoints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Control> getCPointsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Archive[] getAPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Archive getAPoints(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getAPointsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAPoints(Archive[] newAPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAPoints(int index, Archive element);

	/**
	 * Returns the value of the '<em><b>APoints</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.amb.Archive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APoints</em>' containment reference list.
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_APoints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Archive> getAPointsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Monitor[] getMPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Monitor getMPoints(int index);

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
	void setMPoints(Monitor[] newMPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMPoints(int index, Monitor element);

	/**
	 * Returns the value of the '<em><b>MPoints</b></em>' containment reference list.
	 * The list contents are of type {@link alma.control.datamodel.meta.amb.Monitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPoints</em>' containment reference list.
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_MPoints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Monitor> getMPointsList();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(Note)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_Note()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Note getNote();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Note value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return monitorDBOnly;'"
	 * @generated
	 */
	boolean IsMonitorDBOnly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return generateAlt;'"
	 * @generated
	 */
	boolean IsGenerateAlt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Main)main).Parent();'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Main)main).Cardinality();'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Main)main).NodeAddress();'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Main)main).Channel();'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Main)main).BaseAddress();'"
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Main)main).GenericMonitorPoints();'"
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"true\";'"
	 * @generated
	 */
	String CreateModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String dir = generatedDir + \"/\" + Assembly();\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \".html\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Add.sql\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"HWSimBase.h\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"HWSimBase.cpp\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"CompSimBase.h\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"CompSimBase.cpp\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"CompSimBase.idl\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"HWSimImpl.cpp\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"AmbDeviceInt.cpp\", 1);\n\t\t\t\t\tif (!IsMonitorDBOnly()) {\n\t\t\t\t\t\tif (IsGenerateAlt()) {\n\t\t\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \".makefile\", 1);\n\t\t\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.idl\", 1);\n\t\t\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.h\", 1);\n\t\t\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.cpp\", 1);\n\t\t\t\t\t\t}\n\t\t\t\t\t\tsuper.TheEnd();\n\t\t\t\t\t} else \n\t\t\t\t\t\tSystem.out.println(\"Code generation for \" + deviceName + \" done.\");\n\t\t\t\t\treturn \"\";'"
	 * @generated
	 */
	String TheEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = NodeAddress();\r\n\t\tif (s.equals(\"parm\"))\r\n\t\t\treturn \"0\";\r\n\t\treturn HexToDec(s);'"
	 * @generated
	 */
	String NodeAddressInDecimal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint n = -1;\r\n\t\ttry {\r\n\t\t\tn = Integer.parseInt(s.substring(2),16);\r\n\t\t} catch (NumberFormatException err) {\r\n\t\t\tthrow new RuntimeException(\"Invalid number (\" + s + \")\");\r\n\t\t}\r\n\t\treturn Integer.toString(n);'"
	 * @generated
	 */
	String HexToDec(String s);

} // DeviceModel
