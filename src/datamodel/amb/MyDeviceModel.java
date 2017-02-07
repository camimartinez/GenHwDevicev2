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

import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MonitorPoint;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.base.impl.BaseFactoryImpl;


public interface MyDeviceModel extends datamodel.base.DeviceModel {
	/**
	 * Returns the value of the '<em><b>Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp</em>' attribute.
	 * @see #setTmp(BaseFactoryImpl)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_Tmp()
	 * @model dataType="datamodel.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getTmp();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getTmp <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp</em>' attribute.
	 * @see #getTmp()
	 * @generated
	 */
	void setTmp(BaseFactoryImpl value);

	/**
	 * Returns the value of the '<em><b>To Add CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Add CP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Add CP</em>' reference.
	 * @see #setToAddCP(ControlPoint)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToAddCP()
	 * @model
	 * @generated
	 */
	ControlPoint getToAddCP();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToAddCP <em>To Add CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add CP</em>' reference.
	 * @see #getToAddCP()
	 * @generated
	 */
	void setToAddCP(ControlPoint value);

	/**
	 * Returns the value of the '<em><b>Get Note From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Note From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Note From Main</em>' reference.
	 * @see #setGetNoteFromMain(Note)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetNoteFromMain()
	 * @model
	 * @generated
	 */
	Note getGetNoteFromMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetNoteFromMain <em>Get Note From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Note From Main</em>' reference.
	 * @see #getGetNoteFromMain()
	 * @generated
	 */
	void setGetNoteFromMain(Note value);

	/**
	 * Returns the value of the '<em><b>To Add MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Add MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Add MP</em>' reference.
	 * @see #setToAddMP(MonitorPoint)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToAddMP()
	 * @model
	 * @generated
	 */
	MonitorPoint getToAddMP();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToAddMP <em>To Add MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add MP</em>' reference.
	 * @see #getToAddMP()
	 * @generated
	 */
	void setToAddMP(MonitorPoint value);

	/**
	 * Returns the value of the '<em><b>Get Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info Main</em>' reference.
	 * @see #setGetInfoMain(MainBase)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetInfoMain()
	 * @model
	 * @generated
	 */
	MainBase getGetInfoMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetInfoMain <em>Get Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info Main</em>' reference.
	 * @see #getGetInfoMain()
	 * @generated
	 */
	void setGetInfoMain(MainBase value);

	/**
	 * Returns the value of the '<em><b>Get CPfrom Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get CPfrom Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get CPfrom Control</em>' reference.
	 * @see #setGetCPfromControl(ControlAMB)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetCPfromControl()
	 * @model
	 * @generated
	 */
	ControlAMB getGetCPfromControl();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetCPfromControl <em>Get CPfrom Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get CPfrom Control</em>' reference.
	 * @see #getGetCPfromControl()
	 * @generated
	 */
	void setGetCPfromControl(ControlAMB value);

	/**
	 * Returns the value of the '<em><b>Get Info From Main Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From Main Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From Main Sheet</em>' reference.
	 * @see #setGetInfoFromMainSheet(MainAMB)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetInfoFromMainSheet()
	 * @model
	 * @generated
	 */
	MainAMB getGetInfoFromMainSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetInfoFromMainSheet <em>Get Info From Main Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From Main Sheet</em>' reference.
	 * @see #getGetInfoFromMainSheet()
	 * @generated
	 */
	void setGetInfoFromMainSheet(MainAMB value);

	/**
	 * Returns the value of the '<em><b>Get MPfrom Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get MPfrom Monitor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get MPfrom Monitor</em>' reference.
	 * @see #setGetMPfromMonitor(MonitorAMB)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetMPfromMonitor()
	 * @model
	 * @generated
	 */
	MonitorAMB getGetMPfromMonitor();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetMPfromMonitor <em>Get MPfrom Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get MPfrom Monitor</em>' reference.
	 * @see #getGetMPfromMonitor()
	 * @generated
	 */
	void setGetMPfromMonitor(MonitorAMB value);

	/**
	 * Returns the value of the '<em><b>Get Data From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Data From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data From Spread</em>' reference.
	 * @see #setGetDataFromSpread(Table)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetDataFromSpread()
	 * @model
	 * @generated
	 */
	Table getGetDataFromSpread();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetDataFromSpread <em>Get Data From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data From Spread</em>' reference.
	 * @see #getGetDataFromSpread()
	 * @generated
	 */
	void setGetDataFromSpread(Table value);

	/**
	 * Returns the value of the '<em><b>Get APfrom Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get APfrom Archive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get APfrom Archive</em>' reference.
	 * @see #setGetAPfromArchive(ArchiveAMB)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetAPfromArchive()
	 * @model
	 * @generated
	 */
	ArchiveAMB getGetAPfromArchive();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetAPfromArchive <em>Get APfrom Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get APfrom Archive</em>' reference.
	 * @see #getGetAPfromArchive()
	 * @generated
	 */
	void setGetAPfromArchive(ArchiveAMB value);

	/**
	 * Returns the value of the '<em><b>Toinstall End Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toinstall End Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toinstall End Generation</em>' reference.
	 * @see #setToinstallEndGeneration(Util)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToinstallEndGeneration()
	 * @model
	 * @generated
	 */
	Util getToinstallEndGeneration();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToinstallEndGeneration <em>Toinstall End Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toinstall End Generation</em>' reference.
	 * @see #getToinstallEndGeneration()
	 * @generated
	 */
	void setToinstallEndGeneration(Util value);

	/**
	 * Returns the value of the '<em><b>Get From Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get From Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get From Spreadsheet</em>' reference.
	 * @see #setGetFromSpreadsheet(SpreadsheetParser)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetFromSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getGetFromSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetFromSpreadsheet <em>Get From Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get From Spreadsheet</em>' reference.
	 * @see #getGetFromSpreadsheet()
	 * @generated
	 */
	void setGetFromSpreadsheet(SpreadsheetParser value);

	/**
	 * Returns the value of the '<em><b>To Validate Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Validate Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Validate Spreadsheet</em>' reference.
	 * @see #setToValidateSpreadsheet(SpreadsheetValidator)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToValidateSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getToValidateSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Validate Spreadsheet</em>' reference.
	 * @see #getToValidateSpreadsheet()
	 * @generated
	 */
	void setToValidateSpreadsheet(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>Get Generic MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Generic MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Generic MP</em>' reference.
	 * @see #setGetGenericMP(GenericMonitorPoints)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetGenericMP()
	 * @model
	 * @generated
	 */
	GenericMonitorPoints getGetGenericMP();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetGenericMP <em>Get Generic MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Generic MP</em>' reference.
	 * @see #getGetGenericMP()
	 * @generated
	 */
	void setGetGenericMP(GenericMonitorPoints value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainAMBImpl)main).Parent();'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainAMBImpl)main).Cardinality();'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainAMBImpl)main).NodeAddress();'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainAMBImpl)main).Channel();'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainAMBImpl)main).BaseAddress();'"
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainAMBImpl)main).GenericMonitorPoints();'"
	 * @generated
	 */
	boolean GenericMonitorPoints();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString dir = generatedDir + \"/\" + Assembly();\r\n\t\tUtil utils = BaseFactoryImpl.eINSTANCE.createUtil();\r\n\t\tutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \".html\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Add.sql\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"HWSimBase.h\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"HWSimBase.cpp\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"CompSimBase.h\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"CompSimBase.cpp\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"CompSimBase.idl\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"HWSimImpl.cpp\", 1);\r\n\t\tutils.RemoveLinesFromFile(dir + \"/test\", \"Test\" + Assembly() + \"AmbDeviceInt.cpp\", 1);\r\n\t\tif (!isMonitorDBOnly()) {\r\n\t\t\tif (isGenerateAlt()) {\r\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \".makefile\", 1);\r\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.idl\", 1);\r\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.h\", 1);\r\n\t\t\t\tutils.RemoveLinesFromFile(dir + \"/../ALT/\", Assembly() + \"Impl.cpp\", 1);\r\n\t\t\t}\r\n\t\t\tsuper.TheEnd();\r\n\t\t} else \r\n\t\t\tSystem.out.println(\"Code generation for \" + deviceName + \" done.\");\r\n\t\treturn \"\";'"
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
