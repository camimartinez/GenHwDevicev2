/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb;

import datamodel.base.ArchiveProperty;
import datamodel.base.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive AMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.ArchiveAMB#getGetAssemblyColumn <em>Get Assembly Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getArchiveAMB()
 * @model
 * @generated
 */
public interface ArchiveAMB extends ArchiveProperty {
	/**
	 * Returns the value of the '<em><b>Get Assembly Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Assembly Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Assembly Column</em>' reference.
	 * @see #setGetAssemblyColumn(Table)
	 * @see datamodel.amb.AmbPackage#getArchiveAMB_GetAssemblyColumn()
	 * @model
	 * @generated
	 */
	Table getGetAssemblyColumn();

	/**
	 * Sets the value of the '{@link datamodel.amb.ArchiveAMB#getGetAssemblyColumn <em>Get Assembly Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Assembly Column</em>' reference.
	 * @see #getGetAssemblyColumn()
	 * @generated
	 */
	void setGetAssemblyColumn(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isIntervalTE();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Interval();

} // ArchiveAMB
