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
 *   <li>{@link datamodel.base.SpreadsheetValidator#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetValidator#getErrorList <em>Error List</em>}</li>
 *   <li>{@link datamodel.base.SpreadsheetValidator#getSeh <em>Seh</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getSpreadsheetValidator()
 * @model
 * @generated
 */
public interface SpreadsheetValidator extends EObject {
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
	 * Returns the value of the '<em><b>Seh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seh</em>' attribute.
	 * @see #setSeh(Object)
	 * @see datamodel.base.BasePackage#getSpreadsheetValidator_Seh()
	 * @model dataType="datamodel.base.SimpleErrorHandlerDT"
	 * @generated
	 */
	Object getSeh();

	/**
	 * Sets the value of the '{@link datamodel.base.SpreadsheetValidator#getSeh <em>Seh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seh</em>' attribute.
	 * @see #getSeh()
	 * @generated
	 */
	void setSeh(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(String xmlFile, String xsdFile);

} // SpreadsheetValidator
