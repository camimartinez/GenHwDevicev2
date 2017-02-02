/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

import org.eclipse.emf.ecore.EObject;

import org.xml.sax.SAXParseException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Error Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.SimpleErrorHandler#isErrors <em>Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getSimpleErrorHandler()
 * @model
 * @generated
 */
public interface SimpleErrorHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see #setErrors(boolean)
	 * @see datamodel.base.BasePackage#getSimpleErrorHandler_Errors()
	 * @model default="false"
	 * @generated
	 */
	boolean isErrors();

	/**
	 * Sets the value of the '{@link datamodel.base.SimpleErrorHandler#isErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see #isErrors()
	 * @generated
	 */
	void setErrors(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.SAXParseExceptionDT" exceptionDataType="datamodel.base.SAXParseExceptionDT"
	 * @generated
	 */
	SAXParseException error(SAXParseException exception);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.SAXParseExceptionDT" exceptionDataType="datamodel.base.SAXParseExceptionDT"
	 * @generated
	 */
	SAXParseException fatalError(SAXParseException exception);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="datamodel.base.SAXParseExceptionDT" exceptionDataType="datamodel.base.SAXParseExceptionDT"
	 * @generated
	 */
	SAXParseException warning(SAXParseException exception);

} // SimpleErrorHandler
