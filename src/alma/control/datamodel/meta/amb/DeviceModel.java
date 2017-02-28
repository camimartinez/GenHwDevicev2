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
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;

import alma.control.datamodel.meta.eth.Control;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainMain <em>Obtain Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainMonitorPoints <em>Obtain Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainArchiveProperties <em>Obtain Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainControlPoints <em>Obtain Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getParserSpreadsheet <em>Parser Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getValidateSpreadsheet <em>Validate Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getGenericMonitorPoints <em>Generic Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getNotess <em>Notess</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.control.datamodel.meta.base.DeviceModel {
	/**
	 * Returns the value of the '<em><b>Obtain Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Main</em>' reference.
	 * @see #setObtainMain(Main)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ObtainMain()
	 * @model
	 * @generated
	 */
	Main getObtainMain();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainMain <em>Obtain Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Main</em>' reference.
	 * @see #getObtainMain()
	 * @generated
	 */
	void setObtainMain(Main value);

	/**
	 * Returns the value of the '<em><b>Obtain Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Monitor Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Monitor Points</em>' reference.
	 * @see #setObtainMonitorPoints(Monitor)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ObtainMonitorPoints()
	 * @model
	 * @generated
	 */
	Monitor getObtainMonitorPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainMonitorPoints <em>Obtain Monitor Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Monitor Points</em>' reference.
	 * @see #getObtainMonitorPoints()
	 * @generated
	 */
	void setObtainMonitorPoints(Monitor value);

	/**
	 * Returns the value of the '<em><b>Obtain Archive Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Archive Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Archive Properties</em>' reference.
	 * @see #setObtainArchiveProperties(Archive)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ObtainArchiveProperties()
	 * @model
	 * @generated
	 */
	Archive getObtainArchiveProperties();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainArchiveProperties <em>Obtain Archive Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Archive Properties</em>' reference.
	 * @see #getObtainArchiveProperties()
	 * @generated
	 */
	void setObtainArchiveProperties(Archive value);

	/**
	 * Returns the value of the '<em><b>Obtain Control Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtain Control Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtain Control Points</em>' reference.
	 * @see #setObtainControlPoints(alma.control.datamodel.meta.amb.Control)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ObtainControlPoints()
	 * @model
	 * @generated
	 */
	alma.control.datamodel.meta.amb.Control getObtainControlPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getObtainControlPoints <em>Obtain Control Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtain Control Points</em>' reference.
	 * @see #getObtainControlPoints()
	 * @generated
	 */
	void setObtainControlPoints(alma.control.datamodel.meta.amb.Control value);

	/**
	 * Returns the value of the '<em><b>Parser Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser Spreadsheet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser Spreadsheet</em>' reference.
	 * @see #setParserSpreadsheet(SpreadsheetParser)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ParserSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getParserSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getParserSpreadsheet <em>Parser Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Spreadsheet</em>' reference.
	 * @see #getParserSpreadsheet()
	 * @generated
	 */
	void setParserSpreadsheet(SpreadsheetParser value);

	/**
	 * Returns the value of the '<em><b>Validate Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Spreadsheet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Spreadsheet</em>' reference.
	 * @see #setValidateSpreadsheet(SpreadsheetValidator)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ValidateSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getValidateSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getValidateSpreadsheet <em>Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Spreadsheet</em>' reference.
	 * @see #getValidateSpreadsheet()
	 * @generated
	 */
	void setValidateSpreadsheet(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>Generic Monitor Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Monitor Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Monitor Points</em>' reference.
	 * @see #setGenericMonitorPoints(GenericMonitorPoints)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_GenericMonitorPoints()
	 * @model
	 * @generated
	 */
	GenericMonitorPoints getGenericMonitorPoints();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getGenericMonitorPoints <em>Generic Monitor Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Monitor Points</em>' reference.
	 * @see #getGenericMonitorPoints()
	 * @generated
	 */
	void setGenericMonitorPoints(GenericMonitorPoints value);

	/**
	 * Returns the value of the '<em><b>Notess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notess</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notess</em>' reference.
	 * @see #setNotess(Note)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_Notess()
	 * @model
	 * @generated
	 */
	Note getNotess();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getNotess <em>Notess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notess</em>' reference.
	 * @see #getNotess()
	 * @generated
	 */
	void setNotess(Note value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return monitorDBOnly;'"
	 * @generated
	 */
	boolean isMonitorDBOnly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return generateAlt;'"
	 * @generated
	 */
	boolean IsGeneratedAlt();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString dir = generatedDir + \"/\" + Assembly();\n\t\tutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \".html\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Add.sql\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"HWSimBase.h\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"HWSimBase.cpp\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"CompSimBase.h\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"CompSimBase.cpp\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"CompSimBase.idl\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"HWSimImpl.cpp\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"AmbDeviceInt.cpp\", 1);\n\t\tif (!isMonitorDBOnly()) {\n\t\t\tif (isGenerateAlt()) {\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \".makefile\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.idl\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.h\", 1);\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.cpp\", 1);\n\t\t\t}\n\t\t\tsuper.TheEnd();\n\t\t} else \n\t\t\tSystem.out.println(\"Code generation for \" + deviceName + \" done.\");\n\t\treturn \"\";'"
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
