/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.ControlPoint#getGetArchOnUseControl <em>Get Arch On Use Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getControlPoint()
 * @model abstract="true"
 * @generated
 */
public interface ControlPoint extends MandCBase {
	/**
	 * Returns the value of the '<em><b>Get Arch On Use Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Arch On Use Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Arch On Use Control</em>' reference.
	 * @see #setGetArchOnUseControl(Table)
	 * @see datamodel.base.BasePackage#getControlPoint_GetArchOnUseControl()
	 * @model
	 * @generated
	 */
	Table getGetArchOnUseControl();

	/**
	 * Sets the value of the '{@link datamodel.base.ControlPoint#getGetArchOnUseControl <em>Get Arch On Use Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Arch On Use Control</em>' reference.
	 * @see #getGetArchOnUseControl()
	 * @generated
	 */
	void setGetArchOnUseControl(Table value);

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
