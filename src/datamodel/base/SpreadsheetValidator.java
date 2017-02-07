/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

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
 * <ul>
 *   <li>{@link datamodel.base.SpreadsheetValidator#getSeh <em>Seh</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetValidator#getErrorList <em>Error List</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetValidator#getSehTmp <em>Seh Tmp</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getSpreadsheetValidator()
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
	 * @see datamodel.base.BasePackage#getSpreadsheetValidator_Seh()
	 * @model dataType="datamodel.base.SimpleErrorHandlerDT"
	 * @generated
	 */
	SimpleErrorHandler getSeh();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetValidator#getSeh <em>Seh</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getSpreadsheetValidator_ErrorList()
	 * @model dataType="datamodel.base.ArrayList"
	 * @generated
	 */
	ArrayList getErrorList();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetValidator#getErrorList <em>Error List</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getSpreadsheetValidator_SehTmp()
	 * @model dataType="datamodel.base.ErrorHandlerDT"
	 * @generated
	 */
	ErrorHandler getSehTmp();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetValidator#getSehTmp <em>Seh Tmp</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getSpreadsheetValidator_ErrorHandler()
	 * @model
	 * @generated
	 */
	SimpleErrorHandler getErrorHandler();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}' reference.
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
