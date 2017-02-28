/**
 * ALMA - Atacama Large Millimiter Array
 * (c) European Southern Observatory, 2017
 * Copyright by ESO (in the framework of the ALMA collaboration),
 * All rights reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, 
 * MA 02111-1307  USA
 * 
 */
package alma.control.datamodel.meta.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getToImplement <em>To Implement</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getToConvertInfo <em>To Convert Info</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.MainBase#getToInfoFromSpread <em>To Info From Spread</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase()
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_Row()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getRow <em>Row</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * The default value is <code>"BaseFactory.eINSTANCE;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(Table)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_Table()
	 * @model default="BaseFactory.eINSTANCE;" unique="false" dataType="alma.control.datamodel.meta.amb.TableDT"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Util</b></em>' attribute.
	 * The default value is <code>"BaseFactory.eINSTANCE;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Util</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Util</em>' attribute.
	 * @see #setUtil(Util)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_Util()
	 * @model default="BaseFactory.eINSTANCE;" dataType="alma.control.datamodel.meta.amb.UtilDT"
	 * @generated
	 */
	Util getUtil();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getUtil <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Util</em>' attribute.
	 * @see #getUtil()
	 * @generated
	 */
	void setUtil(Util value);

	/**
	 * Returns the value of the '<em><b>To Implement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Implement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Implement</em>' reference.
	 * @see #setToImplement(DeviceModel)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_ToImplement()
	 * @model
	 * @generated
	 */
	DeviceModel getToImplement();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getToImplement <em>To Implement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Implement</em>' reference.
	 * @see #getToImplement()
	 * @generated
	 */
	void setToImplement(DeviceModel value);

	/**
	 * Returns the value of the '<em><b>To Convert Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Convert Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Convert Info</em>' reference.
	 * @see #setToConvertInfo(Util)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_ToConvertInfo()
	 * @model
	 * @generated
	 */
	Util getToConvertInfo();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getToConvertInfo <em>To Convert Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Convert Info</em>' reference.
	 * @see #getToConvertInfo()
	 * @generated
	 */
	void setToConvertInfo(Util value);

	/**
	 * Returns the value of the '<em><b>To Info From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info From Spread</em>' reference.
	 * @see #setToInfoFromSpread(Table)
	 * @see alma.control.datamodel.meta.base.BasePackage#getMainBase_ToInfoFromSpread()
	 * @model
	 * @generated
	 */
	Table getToInfoFromSpread();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.base.MainBase#getToInfoFromSpread <em>To Info From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info From Spread</em>' reference.
	 * @see #getToInfoFromSpread()
	 * @generated
	 */
	void setToInfoFromSpread(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Assembly\")];'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Description\")];'"
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.descriptionAsString(Description());'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Device Name\")];'"
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Extends\")];'"
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"ICD\")];'"
	 * @generated
	 */
	String ICD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"ICD Date\")];'"
	 * @generated
	 */
	String ICDDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.toDatabaseDate(ICDDate());'"
	 * @generated
	 */
	String ICDDateAsDatabaseDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return util.toArrayTime(ICDDate());'"
	 * @generated
	 */
	String ICDDateAsArrayTime();

} // MainBase
