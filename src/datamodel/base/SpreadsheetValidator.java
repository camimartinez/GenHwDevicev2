/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tjavax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();\r\n\t\t        factory.setNamespaceAware(true);\r\n\t\t        factory.setValidating(true);\r\n\t\t        factory.setAttribute(\r\n\t\t                \"http://java.sun.com/xml/jaxp/properties/schemaLanguage\",\r\n\t\t                \"http://www.w3.org/2001/XMLSchema\");\r\n\t\t        // Specify our own schema - this overrides the schemaLocation in the xml\r\n\t\t        // file\r\n\t\t        factory.setAttribute(\r\n\t\t                \"http://java.sun.com/xml/jaxp/properties/schemaSource\",\r\n\t\t                \"file://\" + xsdFile);\r\n\t\t       seh = BaseFactoryImpl.eINSTANCE.createSimpleErrorHandler();\r\n\t\t\r\n\t\t        try {\r\n\t\t        \tjavax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();\r\n\t\t            builder.setErrorHandler(seh);\r\n\t\t            org.w3c.dom.Document document = builder.parse(xmlFile);\r\n\t\t        }\r\n\t\t        catch(Exception e) {\r\n\t\t            System.out.println(\"Validating error file \" + xmlFile\r\n\t\t                    + \" with schema file \" + xsdFile + \" failed!\");\r\n\t\t            return false;\r\n\t\t        }\r\n\t\t\r\n\t\t        if(seh.areErrors()) {\r\n\t\t            System.out.println(\"Validating error file \" + xmlFile\r\n\t\t                    + \" with schema file \" + xsdFile + \" failed!\");\r\n\t\t            return false;\r\n\t\t        }\r\n\t\t        else {\r\n\t\t            return true;\r\n\t\t        }'"
	 * @generated
	 */
	boolean validate(String xmlFile, String xsdFile);

} // SpreadsheetValidator
