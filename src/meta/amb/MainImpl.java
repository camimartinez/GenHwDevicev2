/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.amb;

import meta.base.MainBase;
import meta.base.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.amb.MainImpl#getEReference3 <em>EReference3</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.amb.AmbPackage#getMainImpl()
 * @model
 * @generated
 */
public interface MainImpl extends MainBase {
	/**
	 * Returns the value of the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference3</em>' reference.
	 * @see #setEReference3(Table)
	 * @see meta.amb.AmbPackage#getMainImpl_EReference3()
	 * @model
	 * @generated
	 */
	Table getEReference3();

	/**
	 * Sets the value of the '{@link meta.amb.MainImpl#getEReference3 <em>EReference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference3</em>' reference.
	 * @see #getEReference3()
	 * @generated
	 */
	void setEReference3(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String BaseAddress();

} // MainImpl
