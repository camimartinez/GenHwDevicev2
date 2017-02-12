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
package alma.Control.datamodel.meta.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.MainBase#getRow <em>Row</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.MainBase#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.MainBase#getImplementTo <em>Implement To</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.MainBase#getConvertInfoTo <em>Convert Info To</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.MainBase#getGetInfoFromSpread <em>Get Info From Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @see alma.Control.datamodel.meta.base.BasePackage#getMainBase()
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
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMainBase_Row()
	 * @model dataType="alma.Control.datamodel.meta.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MainBase#getRow <em>Row</em>}' attribute.
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
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMainBase_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MainBase#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Implement To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implement To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implement To</em>' reference.
	 * @see #setImplementTo(DeviceModel)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMainBase_ImplementTo()
	 * @model
	 * @generated
	 */
	DeviceModel getImplementTo();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MainBase#getImplementTo <em>Implement To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implement To</em>' reference.
	 * @see #getImplementTo()
	 * @generated
	 */
	void setImplementTo(DeviceModel value);

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
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMainBase_ConvertInfoTo()
	 * @model
	 * @generated
	 */
	Util getConvertInfoTo();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MainBase#getConvertInfoTo <em>Convert Info To</em>}' reference.
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
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMainBase_GetInfoFromSpread()
	 * @model
	 * @generated
	 */
	Table getGetInfoFromSpread();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MainBase#getGetInfoFromSpread <em>Get Info From Spread</em>}' reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Assembly\")];\r\n'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Description\")];\r\n'"
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().descriptionAsString(Description());\r\n'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Device Name\")];\r\n'"
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Extends\")];\r\n'"
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"ICD\")];\r\n'"
	 * @generated
	 */
	String ICD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"ICD Date\")];\r\n'"
	 * @generated
	 */
	String ICDDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().toDatabaseDate(ICDDate());\r\n'"
	 * @generated
	 */
	String ICDDateAsDatabaseDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().toArrayTime(ICDDate());'"
	 * @generated
	 */
	String ICDDateAsArrayTime();

} // MainBase
