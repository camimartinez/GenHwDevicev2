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


import alma.control.datamodel.meta.base.ControlPoint;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;
import alma.control.datamodel.meta.base.impl.BaseFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getTmp <em>Tmp</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToAddCP <em>To Add CP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToNoteFromMain <em>To Note From Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToAddMP <em>To Add MP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToInfoMain <em>To Info Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToCPfromControl <em>To CPfrom Control</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToInfoFromMainSheet <em>To Info From Main Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToMPfromMonitor <em>To MPfrom Monitor</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToDataFromSpread <em>To Data From Spread</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToAPfromArchive <em>To APfrom Archive</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToInstallEndGeneration <em>To Install End Generation</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToSpreadsheetFrom <em>To Spreadsheet From</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.DeviceModel#getToGenericMP <em>To Generic MP</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends alma.control.datamodel.meta.base.DeviceModel {
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_Tmp()
	 * @model dataType="alma.control.datamodel.meta.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getTmp();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getTmp <em>Tmp</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToAddCP()
	 * @model
	 * @generated
	 */
	ControlPoint getToAddCP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToAddCP <em>To Add CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add CP</em>' reference.
	 * @see #getToAddCP()
	 * @generated
	 */
	void setToAddCP(ControlPoint value);

	/**
	 * Returns the value of the '<em><b>To Note From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Note From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Note From Main</em>' reference.
	 * @see #setToNoteFromMain(Note)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToNoteFromMain()
	 * @model
	 * @generated
	 */
	Note getToNoteFromMain();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToNoteFromMain <em>To Note From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Note From Main</em>' reference.
	 * @see #getToNoteFromMain()
	 * @generated
	 */
	void setToNoteFromMain(Note value);

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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToAddMP()
	 * @model
	 * @generated
	 */
	MonitorPoint getToAddMP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToAddMP <em>To Add MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add MP</em>' reference.
	 * @see #getToAddMP()
	 * @generated
	 */
	void setToAddMP(MonitorPoint value);

	/**
	 * Returns the value of the '<em><b>To Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info Main</em>' reference.
	 * @see #setToInfoMain(MainBase)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToInfoMain()
	 * @model
	 * @generated
	 */
	MainBase getToInfoMain();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToInfoMain <em>To Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info Main</em>' reference.
	 * @see #getToInfoMain()
	 * @generated
	 */
	void setToInfoMain(MainBase value);

	/**
	 * Returns the value of the '<em><b>To CPfrom Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To CPfrom Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To CPfrom Control</em>' reference.
	 * @see #setToCPfromControl(Control)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToCPfromControl()
	 * @model
	 * @generated
	 */
	Control getToCPfromControl();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToCPfromControl <em>To CPfrom Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To CPfrom Control</em>' reference.
	 * @see #getToCPfromControl()
	 * @generated
	 */
	void setToCPfromControl(Control value);

	/**
	 * Returns the value of the '<em><b>To Info From Main Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info From Main Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info From Main Sheet</em>' reference.
	 * @see #setToInfoFromMainSheet(Main)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToInfoFromMainSheet()
	 * @model
	 * @generated
	 */
	Main getToInfoFromMainSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToInfoFromMainSheet <em>To Info From Main Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info From Main Sheet</em>' reference.
	 * @see #getToInfoFromMainSheet()
	 * @generated
	 */
	void setToInfoFromMainSheet(Main value);

	/**
	 * Returns the value of the '<em><b>To MPfrom Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To MPfrom Monitor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To MPfrom Monitor</em>' reference.
	 * @see #setToMPfromMonitor(Monitor)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToMPfromMonitor()
	 * @model
	 * @generated
	 */
	Monitor getToMPfromMonitor();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToMPfromMonitor <em>To MPfrom Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To MPfrom Monitor</em>' reference.
	 * @see #getToMPfromMonitor()
	 * @generated
	 */
	void setToMPfromMonitor(Monitor value);

	/**
	 * Returns the value of the '<em><b>To Data From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Data From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Data From Spread</em>' reference.
	 * @see #setToDataFromSpread(Table)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToDataFromSpread()
	 * @model
	 * @generated
	 */
	Table getToDataFromSpread();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToDataFromSpread <em>To Data From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Data From Spread</em>' reference.
	 * @see #getToDataFromSpread()
	 * @generated
	 */
	void setToDataFromSpread(Table value);

	/**
	 * Returns the value of the '<em><b>To APfrom Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To APfrom Archive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To APfrom Archive</em>' reference.
	 * @see #setToAPfromArchive(Archive)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToAPfromArchive()
	 * @model
	 * @generated
	 */
	Archive getToAPfromArchive();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToAPfromArchive <em>To APfrom Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To APfrom Archive</em>' reference.
	 * @see #getToAPfromArchive()
	 * @generated
	 */
	void setToAPfromArchive(Archive value);

	/**
	 * Returns the value of the '<em><b>To Install End Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Install End Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Install End Generation</em>' reference.
	 * @see #setToInstallEndGeneration(Util)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToInstallEndGeneration()
	 * @model
	 * @generated
	 */
	Util getToInstallEndGeneration();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToInstallEndGeneration <em>To Install End Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Install End Generation</em>' reference.
	 * @see #getToInstallEndGeneration()
	 * @generated
	 */
	void setToInstallEndGeneration(Util value);

	/**
	 * Returns the value of the '<em><b>To Spreadsheet From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Spreadsheet From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Spreadsheet From</em>' reference.
	 * @see #setToSpreadsheetFrom(SpreadsheetParser)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToSpreadsheetFrom()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getToSpreadsheetFrom();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToSpreadsheetFrom <em>To Spreadsheet From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Spreadsheet From</em>' reference.
	 * @see #getToSpreadsheetFrom()
	 * @generated
	 */
	void setToSpreadsheetFrom(SpreadsheetParser value);

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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToValidateSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getToValidateSpreadsheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Validate Spreadsheet</em>' reference.
	 * @see #getToValidateSpreadsheet()
	 * @generated
	 */
	void setToValidateSpreadsheet(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>To Generic MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Generic MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Generic MP</em>' reference.
	 * @see #setToGenericMP(GenericMonitorPoints)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getDeviceModel_ToGenericMP()
	 * @model
	 * @generated
	 */
	GenericMonitorPoints getToGenericMP();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.DeviceModel#getToGenericMP <em>To Generic MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Generic MP</em>' reference.
	 * @see #getToGenericMP()
	 * @generated
	 */
	void setToGenericMP(GenericMonitorPoints value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).Parent();'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).Cardinality();'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).NodeAddress();'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).Channel();'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).BaseAddress();'"
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((MainImpl)main).GenericMonitorPoints();'"
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
