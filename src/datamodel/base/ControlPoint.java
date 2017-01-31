/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.ControlPoint#getEReference4 <em>EReference4</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getControlPoint()
 * @model abstract="true"
 * @generated
 */
public interface ControlPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference4</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference4</em>' reference.
	 * @see #setEReference4(Table)
	 * @see datamodel.base.BasePackage#getControlPoint_EReference4()
	 * @model
	 * @generated
	 */
	Table getEReference4();

	/**
	 * Sets the value of the '{@link datamodel.base.ControlPoint#getEReference4 <em>EReference4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference4</em>' reference.
	 * @see #getEReference4()
	 * @generated
	 */
	void setEReference4(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String CPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String AltCPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ArchiveOnUse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMonitored();

} // ControlPoint
