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
package alma.Control.datamodel.meta.base;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import org.xml.sax.ErrorHandler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getSeh <em>Seh</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorList <em>Error List</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getSehTmp <em>Seh Tmp</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 *
 * @see alma.Control.datamodel.meta.base.BasePackage#getSpreadsheetValidator()
 * @model
 * @generated
 */
public interface SpreadsheetValidator extends EObject {
	/**
	 * Returns the value of the '<em><b>Seh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seh</em>' attribute.
	 * @see #setSeh(SimpleErrorHandler)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getSpreadsheetValidator_Seh()
	 * @model dataType="alma.Control.datamodel.meta.base.SimpleErrorHandlerDT"
	 * @generated
	 */
	SimpleErrorHandler getSeh();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getSeh <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seh</em>' attribute.
	 * @see #getSeh()
	 * @generated
	 */
	void setSeh(SimpleErrorHandler value);

	/**
	 * Returns the value of the '<em><b>Error List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' attribute.
	 * @see #setErrorList(ArrayList)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getSpreadsheetValidator_ErrorList()
	 * @model dataType="alma.Control.datamodel.meta.base.ArrayList"
	 * @generated
	 */
	ArrayList getErrorList();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorList <em>Error List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error List</em>' attribute.
	 * @see #getErrorList()
	 * @generated
	 */
	void setErrorList(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Seh Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seh Tmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seh Tmp</em>' attribute.
	 * @see #setSehTmp(ErrorHandler)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getSpreadsheetValidator_SehTmp()
	 * @model dataType="alma.Control.datamodel.meta.base.ErrorHandlerDT"
	 * @generated
	 */
	ErrorHandler getSehTmp();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getSehTmp <em>Seh Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seh Tmp</em>' attribute.
	 * @see #getSehTmp()
	 * @generated
	 */
	void setSehTmp(ErrorHandler value);

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Handler</em>' reference.
	 * @see #setErrorHandler(SimpleErrorHandler)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getSpreadsheetValidator_ErrorHandler()
	 * @model
	 * @generated
	 */
	SimpleErrorHandler getErrorHandler();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' reference.
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(SimpleErrorHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tjavax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();\r\n\t\tfactory.setNamespaceAware(true);\r\n\t\tfactory.setValidating(true);\r\n\t\tfactory.setAttribute(\r\n\t\t\t\t\"http://java.sun.com/xml/jaxp/properties/schemaLanguage\",\r\n\t\t\"http://www.w3.org/2001/XMLSchema\");\r\n\t\t// Specify our own schema - this overrides the schemaLocation in the xml\r\n\t\t// file\r\n\t\tfactory.setAttribute(\r\n\t\t\t\t\"http://java.sun.com/xml/jaxp/properties/schemaSource\",\r\n\t\t\t\t\"file://\" + xsdFile);\r\n\t\tseh = BaseFactoryImpl.eINSTANCE.createSimpleErrorHandler();\r\n\r\n\t\ttry {\r\n\t\t\tjavax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();\r\n\t\t\tbuilder.setErrorHandler((ErrorHandler)seh);\r\n\t\t\torg.w3c.dom.Document document = builder.parse(xmlFile);\r\n\t\t}\r\n\t\tcatch(Exception e) {\r\n\t\t\tSystem.out.println(\"Validating error file \" + xmlFile\r\n\t\t\t\t\t+ \" with schema file \" + xsdFile + \" failed!\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\r\n\t\tif(seh.areErrors()) {\r\n\t\t\tSystem.out.println(\"Validating error file \" + xmlFile\r\n\t\t\t\t\t+ \" with schema file \" + xsdFile + \" failed!\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse {\r\n\t\t\treturn true;\r\n\t\t}'"
	 * @generated
	 */
	boolean validate(String xmlFile, String xsdFile);

} // SpreadsheetValidator