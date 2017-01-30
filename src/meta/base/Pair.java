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
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.base.Pair#getContent <em>Content</em>}</li>
 *   <li>{@link meta.base.Pair#getNewString <em>New String</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.base.BasePackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see meta.base.BasePackage#getPair_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link meta.base.Pair#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>New String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New String</em>' attribute.
	 * @see #setNewString(String)
	 * @see meta.base.BasePackage#getPair_NewString()
	 * @model
	 * @generated
	 */
	String getNewString();

	/**
	 * Sets the value of the '{@link meta.base.Pair#getNewString <em>New String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New String</em>' attribute.
	 * @see #getNewString()
	 * @generated
	 */
	void setNewString(String value);

} // Pair
