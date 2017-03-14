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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.control.datamodel.meta.base.DeviceModel {
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mainAmb.Parent();'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mainAmb.Cardinality();'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mainAmb.NodeAddress();'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mainAmb.Channel();'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mainAmb.BaseAddress();'"
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mainAmb.GenericMonitorPoints();'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString dir = generatedDir + \"/\" + Assembly();\n\t\tutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \".html\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Add.sql\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"HWSimBase.h\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"HWSimBase.cpp\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"CompSimBase.h\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"CompSimBase.cpp\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"CompSimBase.idl\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"HWSimImpl.cpp\", 1);\n\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"AmbDeviceInt.cpp\", 1);\n\t\t\tif (!isMonitorDBOnly()) {\n\t\t\t\tif (isGenerateAlt()) {\n\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \".makefile\", 1);\n\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.idl\", 1);\n\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.h\", 1);\n\t\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.cpp\", 1);\n\t\t\t\t}\n\t\t\t\tsuper.TheEnd();\n\t\t\t} else \n\t\t\t\tSystem.out.println(\"Code generation for \" + deviceName + \" done.\");\n\t\t\treturn \"\";'"
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
