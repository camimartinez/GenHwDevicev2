/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.base.Util#getNewline <em>Newline</em>}</li>
 *   <li>{@link meta.base.Util#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link meta.base.Util#getMONTH <em>MONTH</em>}</li>
 *   <li>{@link meta.base.Util#getMONTHalt <em>MONT Halt</em>}</li>
 *   <li>{@link meta.base.Util#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.base.BasePackage#getUtil()
 * @model
 * @generated
 */
public interface Util extends EObject {
	/**
	 * Returns the value of the '<em><b>Newline</b></em>' attribute.
	 * The default value is <code>"System.getProperty(\"line.separator\")"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newline</em>' attribute.
	 * @see #setNewline(String)
	 * @see meta.base.BasePackage#getUtil_Newline()
	 * @model default="System.getProperty(\"line.separator\")"
	 * @generated
	 */
	String getNewline();

	/**
	 * Sets the value of the '{@link meta.base.Util#getNewline <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newline</em>' attribute.
	 * @see #getNewline()
	 * @generated
	 */
	void setNewline(String value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"54"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see meta.base.BasePackage#getUtil_MaxLength()
	 * @model default="54"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link meta.base.Util#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>MONTH</b></em>' attribute.
	 * The default value is <code>"\"JAN\", \"FEB\", \"MAR\", \"APR\", \"MAY\", \"JUN\", \"JUL\", \"AUG\", \"SEP\", \"OCT\", \"NOV\", \"DEC\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MONTH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MONTH</em>' attribute.
	 * @see #setMONTH(String)
	 * @see meta.base.BasePackage#getUtil_MONTH()
	 * @model default="\"JAN\", \"FEB\", \"MAR\", \"APR\", \"MAY\", \"JUN\", \"JUL\", \"AUG\", \"SEP\", \"OCT\", \"NOV\", \"DEC\""
	 * @generated
	 */
	String getMONTH();

	/**
	 * Sets the value of the '{@link meta.base.Util#getMONTH <em>MONTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MONTH</em>' attribute.
	 * @see #getMONTH()
	 * @generated
	 */
	void setMONTH(String value);

	/**
	 * Returns the value of the '<em><b>MONT Halt</b></em>' attribute.
	 * The default value is <code>"\"01\", \"02\", \"03\", \"04\", \"05\", \"06\", \"07\", \"08\", \"09\", \"10\", \"11\", \"12\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MONT Halt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MONT Halt</em>' attribute.
	 * @see #setMONTHalt(String)
	 * @see meta.base.BasePackage#getUtil_MONTHalt()
	 * @model default="\"01\", \"02\", \"03\", \"04\", \"05\", \"06\", \"07\", \"08\", \"09\", \"10\", \"11\", \"12\""
	 * @generated
	 */
	String getMONTHalt();

	/**
	 * Sets the value of the '{@link meta.base.Util#getMONTHalt <em>MONT Halt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MONT Halt</em>' attribute.
	 * @see #getMONTHalt()
	 * @generated
	 */
	void setMONTHalt(String value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Table)
	 * @see meta.base.BasePackage#getUtil_EReference0()
	 * @model
	 * @generated
	 */
	Table getEReference0();

	/**
	 * Sets the value of the '{@link meta.base.Util#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void error(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RemoveLinesFromFile(String dirName, String fileName, int replace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String AltName(String str);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatDescriptionBase(String s, String prefix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatDescription(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatDescriptionL1(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatDescriptionL2(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatDescriptionL4(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatDescriptionL5(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String descriptionAsString(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String decodeHTMLChars(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isArray(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NumberRawDataTypeBytes(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RawDataTypeTotalBytes(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NumberOfItems(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getRawDataTypeIndex(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toArrayTime(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String parseDateString(String s, boolean alt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String normalizeNumber(String wdt, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String normalizeFloat(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String normalizeBoolean(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getInstallDir();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toDatabaseDate(String s);

} // Util
