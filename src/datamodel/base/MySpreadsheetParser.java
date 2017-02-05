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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.SpreadsheetParser#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getXml <em>Xml</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getNewline <em>Newline</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getSetNewContent <em>Set New Content</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetParser#getNewlinetmp <em>Newlinetmp</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getSpreadsheetParser()
 * @model
 * @generated
 */
public interface MySpreadsheetParser extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(SpreadsheetValidator)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_EReference0()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getEReference0();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>Ref Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Path</em>' attribute.
	 * @see #setRefPath(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_RefPath()
	 * @model
	 * @generated
	 */
	String getRefPath();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getRefPath <em>Ref Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Path</em>' attribute.
	 * @see #getRefPath()
	 * @generated
	 */
	void setRefPath(String value);

	/**
	 * Returns the value of the '<em><b>Ref Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Status</em>' attribute.
	 * @see #setRefStatus(boolean)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_RefStatus()
	 * @model
	 * @generated
	 */
	boolean isRefStatus();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#isRefStatus <em>Ref Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Status</em>' attribute.
	 * @see #isRefStatus()
	 * @generated
	 */
	void setRefStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' attribute.
	 * @see #setXml(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_Xml()
	 * @model
	 * @generated
	 */
	String getXml();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getXml <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' attribute.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(String value);

	/**
	 * Returns the value of the '<em><b>Xsd File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd File</em>' attribute.
	 * @see #setXsdFile(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_XsdFile()
	 * @model
	 * @generated
	 */
	String getXsdFile();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getXsdFile <em>Xsd File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd File</em>' attribute.
	 * @see #getXsdFile()
	 * @generated
	 */
	void setXsdFile(String value);

	/**
	 * Returns the value of the '<em><b>Newline</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newline</em>' attribute.
	 * @see #setNewline(String)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_Newline()
	 * @model default=""
	 * @generated
	 */
	String getNewline();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getNewline <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newline</em>' attribute.
	 * @see #getNewline()
	 * @generated
	 */
	void setNewline(String value);

	/**
	 * Returns the value of the '<em><b>Set New Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set New Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set New Content</em>' containment reference.
	 * @see #setSetNewContent(Pair)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_SetNewContent()
	 * @model containment="true"
	 * @generated
	 */
	Pair getSetNewContent();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getSetNewContent <em>Set New Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set New Content</em>' containment reference.
	 * @see #getSetNewContent()
	 * @generated
	 */
	void setSetNewContent(Pair value);

	/**
	 * Returns the value of the '<em><b>Newlinetmp</b></em>' attribute.
	 * The default value is <code>"line.separator"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newlinetmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newlinetmp</em>' attribute.
	 * @see #setNewlinetmp(System)
	 * @see datamodel.base.BasePackage#getSpreadsheetParser_Newlinetmp()
	 * @model default="line.separator" dataType="datamodel.base.SystemDT"
	 * @generated
	 */
	System getNewlinetmp();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetParser#getNewlinetmp <em>Newlinetmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newlinetmp</em>' attribute.
	 * @see #getNewlinetmp()
	 * @generated
	 */
	void setNewlinetmp(System value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getSpreadsheet(String dirName, String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getDataCells(String row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="datamodel.base.String2DT"
	 * @generated
	 */
	String[][] getWorksheets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setXSD(String xsd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.String2DT"
	 * @generated
	 */
	String[][] filter(String doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="datamodel.base.String2DT"
	 * @generated
	 */
	void deleteRow(String[][] worksheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model worksheetDataType="datamodel.base.String2DT"
	 * @generated
	 */
	void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s);

} // SpreadsheetParser
