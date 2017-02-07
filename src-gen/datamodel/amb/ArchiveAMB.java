/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb;

import datamodel.base.ArchiveProperty;
import datamodel.base.Table;

import datamodel.base.impl.BaseFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive AMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.ArchiveAMB#getBaseFacTmp <em>Base Fac Tmp</em>}</li>
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
	 * Returns the value of the '<em><b>Base Fac Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Fac Tmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Fac Tmp</em>' attribute.
	 * @see #setBaseFacTmp(BaseFactoryImpl)
	 * @see datamodel.amb.AmbPackage#getArchiveAMB_BaseFacTmp()
	 * @model dataType="datamodel.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getBaseFacTmp();

	/**
	 * Sets the value of the '{@link datamodel.amb.ArchiveAMB#getBaseFacTmp <em>Base Fac Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Fac Tmp</em>' attribute.
	 * @see #getBaseFacTmp()
	 * @generated
	 */
	void setBaseFacTmp(BaseFactoryImpl value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Assembly\")];'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = IntervalFull();\r\n       if (s.startsWith(\"te/\"))\r\n           return true;\r\nreturn false;'"
	 * @generated
	 */
	boolean isIntervalTE();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(isIntervalTE())\r\n\treturn IntervalFull().substring(3);\r\nreturn IntervalFull();'"
	 * @generated
	 */
	String Interval();

} // ArchiveAMB
