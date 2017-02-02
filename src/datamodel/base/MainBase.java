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
 * A representation of the model object '<em><b>Main Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.MainBase#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.base.MainBase#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.base.MainBase#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link datamodel.base.MainBase#getConvertInfoTo <em>Convert Info To</em>}</li>
 *   <li>{@link datamodel.base.MainBase#getGetInfoFromSpread <em>Get Info From Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getMainBase()
 * @model
 * @generated
 */
public interface MainBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(String[])
	 * @see datamodel.base.BasePackage#getMainBase_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.base.MainBase#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(String[] value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' attribute.
	 * @see #setSheet(int)
	 * @see datamodel.base.BasePackage#getMainBase_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.base.MainBase#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(DeviceModel)
	 * @see datamodel.base.BasePackage#getMainBase_EReference0()
	 * @model
	 * @generated
	 */
	DeviceModel getEReference0();

	/**
	 * Sets the value of the '{@link datamodel.base.MainBase#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(DeviceModel value);

	/**
	 * Returns the value of the '<em><b>Convert Info To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Info To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Info To</em>' reference.
	 * @see #setConvertInfoTo(Util)
	 * @see datamodel.base.BasePackage#getMainBase_ConvertInfoTo()
	 * @model
	 * @generated
	 */
	Util getConvertInfoTo();

	/**
	 * Sets the value of the '{@link datamodel.base.MainBase#getConvertInfoTo <em>Convert Info To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Info To</em>' reference.
	 * @see #getConvertInfoTo()
	 * @generated
	 */
	void setConvertInfoTo(Util value);

	/**
	 * Returns the value of the '<em><b>Get Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From Spread</em>' reference.
	 * @see #setGetInfoFromSpread(Table)
	 * @see datamodel.base.BasePackage#getMainBase_GetInfoFromSpread()
	 * @model
	 * @generated
	 */
	Table getGetInfoFromSpread();

	/**
	 * Sets the value of the '{@link datamodel.base.MainBase#getGetInfoFromSpread <em>Get Info From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From Spread</em>' reference.
	 * @see #getGetInfoFromSpread()
	 * @generated
	 */
	void setGetInfoFromSpread(Table value);

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
	 * @model
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICDDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICDDateAsDatabaseDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICDDateAsArrayTime();

} // MainBase
