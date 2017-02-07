/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb;

import datamodel.base.BaseFactory;
import datamodel.base.MainBase;
import datamodel.base.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main AMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.MainAMB#getTmp <em>Tmp</em>}</li>
 *   <li>{@link datamodel.amb.MainAMB#getGetInfoFromMain <em>Get Info From Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getMainAMB()
 * @model
 * @generated
 */
public interface MainAMB extends MainBase {
	/**
	 * Returns the value of the '<em><b>Tmp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp</em>' attribute.
	 * @see #setTmp(BaseFactory)
	 * @see datamodel.amb.AmbPackage#getMainAMB_Tmp()
	 * @model dataType="datamodel.amb.BaseFactoryDT"
	 * @generated
	 */
	BaseFactory getTmp();

	/**
	 * Sets the value of the '{@link datamodel.amb.MainAMB#getTmp <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp</em>' attribute.
	 * @see #getTmp()
	 * @generated
	 */
	void setTmp(BaseFactory value);

	/**
	 * Returns the value of the '<em><b>Get Info From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From Main</em>' reference.
	 * @see #setGetInfoFromMain(Table)
	 * @see datamodel.amb.AmbPackage#getMainAMB_GetInfoFromMain()
	 * @model
	 * @generated
	 */
	Table getGetInfoFromMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.MainAMB#getGetInfoFromMain <em>Get Info From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From Main</em>' reference.
	 * @see #getGetInfoFromMain()
	 * @generated
	 */
	void setGetInfoFromMain(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Parent\")];'"
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Node Address\")];'"
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Cardinality\")];'"
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Channel\")];'"
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Generic Monitor Points\")].equals(\"yes\");'"
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Base Address\")];'"
	 * @generated
	 */
	String BaseAddress();

} // MainAMB
