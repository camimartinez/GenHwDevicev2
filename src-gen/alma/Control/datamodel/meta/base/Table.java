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

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getDepChar <em>Dep Char</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getSheetNames <em>Sheet Names</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getColNames <em>Col Names</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getTagNames <em>Tag Names</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToCPP <em>To CPP</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToIDL <em>To IDL</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToIDLSeq <em>To IDL Seq</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToCORBA <em>To CORBA</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToCORBASeq <em>To CORBA Seq</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToBACI <em>To BACI</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getToDatabase <em>To Database</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getRawToCPP <em>Raw To CPP</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getRawBytes <em>Raw Bytes</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToCPP <em>World To CPP</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToIDL <em>World To IDL</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBA <em>World To CORBA</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToBACI <em>World To BACI</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToJava <em>World To Java</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.Table#getWorldToDatabase <em>World To Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see alma.Control.datamodel.meta.base.BasePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Dep Char</b></em>' attribute.
	 * The default value is <code>"^"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dep Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Char</em>' attribute.
	 * @see #setDepChar(String)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_DepChar()
	 * @model default="^"
	 * @generated
	 */
	String getDepChar();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getDepChar <em>Dep Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Char</em>' attribute.
	 * @see #getDepChar()
	 * @generated
	 */
	void setDepChar(String value);

	/**
	 * Returns the value of the '<em><b>Celsius To Kelvin</b></em>' attribute.
	 * The default value is <code>"CelsiusToKelvin"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Celsius To Kelvin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Celsius To Kelvin</em>' attribute.
	 * @see #setCelsiusToKelvin(String)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_CelsiusToKelvin()
	 * @model default="CelsiusToKelvin"
	 * @generated
	 */
	String getCelsiusToKelvin();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celsius To Kelvin</em>' attribute.
	 * @see #getCelsiusToKelvin()
	 * @generated
	 */
	void setCelsiusToKelvin(String value);

	/**
	 * Returns the value of the '<em><b>Sheet Names</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Names</em>' attribute.
	 * @see #setSheetNames(ArrayList)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_SheetNames()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.ArrayList"
	 * @generated
	 */
	ArrayList getSheetNames();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getSheetNames <em>Sheet Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Names</em>' attribute.
	 * @see #getSheetNames()
	 * @generated
	 */
	void setSheetNames(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Col Names</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Names</em>' attribute.
	 * @see #setColNames(ArrayList)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ColNames()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.ArrayList"
	 * @generated
	 */
	ArrayList getColNames();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getColNames <em>Col Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Names</em>' attribute.
	 * @see #getColNames()
	 * @generated
	 */
	void setColNames(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Tag Names</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Names</em>' attribute.
	 * @see #setTagNames(ArrayList)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_TagNames()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.ArrayList"
	 * @generated
	 */
	ArrayList getTagNames();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getTagNames <em>Tag Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Names</em>' attribute.
	 * @see #getTagNames()
	 * @generated
	 */
	void setTagNames(ArrayList value);

	/**
	 * Returns the value of the '<em><b>To CPP</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To CPP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To CPP</em>' attribute.
	 * @see #setToCPP(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToCPP()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCPP();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToCPP <em>To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To CPP</em>' attribute.
	 * @see #getToCPP()
	 * @generated
	 */
	void setToCPP(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To IDL</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To IDL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To IDL</em>' attribute.
	 * @see #setToIDL(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToIDL()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToIDL();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToIDL <em>To IDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To IDL</em>' attribute.
	 * @see #getToIDL()
	 * @generated
	 */
	void setToIDL(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To IDL Seq</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To IDL Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To IDL Seq</em>' attribute.
	 * @see #setToIDLSeq(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToIDLSeq()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToIDLSeq();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToIDLSeq <em>To IDL Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To IDL Seq</em>' attribute.
	 * @see #getToIDLSeq()
	 * @generated
	 */
	void setToIDLSeq(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To CORBA</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To CORBA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To CORBA</em>' attribute.
	 * @see #setToCORBA(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToCORBA()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCORBA();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToCORBA <em>To CORBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To CORBA</em>' attribute.
	 * @see #getToCORBA()
	 * @generated
	 */
	void setToCORBA(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To CORBA Seq</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To CORBA Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To CORBA Seq</em>' attribute.
	 * @see #setToCORBASeq(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToCORBASeq()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCORBASeq();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToCORBASeq <em>To CORBA Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To CORBA Seq</em>' attribute.
	 * @see #getToCORBASeq()
	 * @generated
	 */
	void setToCORBASeq(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To CORBA Dev IO</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To CORBA Dev IO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To CORBA Dev IO</em>' attribute.
	 * @see #setToCORBADevIO(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToCORBADevIO()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCORBADevIO();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To CORBA Dev IO</em>' attribute.
	 * @see #getToCORBADevIO()
	 * @generated
	 */
	void setToCORBADevIO(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To BACI</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To BACI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To BACI</em>' attribute.
	 * @see #setToBACI(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToBACI()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToBACI();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToBACI <em>To BACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To BACI</em>' attribute.
	 * @see #getToBACI()
	 * @generated
	 */
	void setToBACI(Hashtable value);

	/**
	 * Returns the value of the '<em><b>To Database</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Database</em>' attribute.
	 * @see #setToDatabase(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_ToDatabase()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getToDatabase();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getToDatabase <em>To Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Database</em>' attribute.
	 * @see #getToDatabase()
	 * @generated
	 */
	void setToDatabase(Hashtable value);

	/**
	 * Returns the value of the '<em><b>Raw To CPP</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw To CPP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw To CPP</em>' attribute.
	 * @see #setRawToCPP(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_RawToCPP()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getRawToCPP();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getRawToCPP <em>Raw To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw To CPP</em>' attribute.
	 * @see #getRawToCPP()
	 * @generated
	 */
	void setRawToCPP(Hashtable value);

	/**
	 * Returns the value of the '<em><b>Raw To Byte Swapped</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw To Byte Swapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw To Byte Swapped</em>' attribute.
	 * @see #setRawToByteSwapped(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_RawToByteSwapped()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getRawToByteSwapped();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw To Byte Swapped</em>' attribute.
	 * @see #getRawToByteSwapped()
	 * @generated
	 */
	void setRawToByteSwapped(Hashtable value);

	/**
	 * Returns the value of the '<em><b>Raw Bytes</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Bytes</em>' attribute.
	 * @see #setRawBytes(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_RawBytes()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getRawBytes();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getRawBytes <em>Raw Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Bytes</em>' attribute.
	 * @see #getRawBytes()
	 * @generated
	 */
	void setRawBytes(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To CPP</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To CPP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To CPP</em>' attribute.
	 * @see #setWorldToCPP(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToCPP()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCPP();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToCPP <em>World To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To CPP</em>' attribute.
	 * @see #getWorldToCPP()
	 * @generated
	 */
	void setWorldToCPP(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To IDL</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To IDL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To IDL</em>' attribute.
	 * @see #setWorldToIDL(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToIDL()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToIDL();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToIDL <em>World To IDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To IDL</em>' attribute.
	 * @see #getWorldToIDL()
	 * @generated
	 */
	void setWorldToIDL(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To IDL Seq</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To IDL Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To IDL Seq</em>' attribute.
	 * @see #setWorldToIDLSeq(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToIDLSeq()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToIDLSeq();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To IDL Seq</em>' attribute.
	 * @see #getWorldToIDLSeq()
	 * @generated
	 */
	void setWorldToIDLSeq(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To CORBA</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To CORBA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To CORBA</em>' attribute.
	 * @see #setWorldToCORBA(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToCORBA()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCORBA();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBA <em>World To CORBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To CORBA</em>' attribute.
	 * @see #getWorldToCORBA()
	 * @generated
	 */
	void setWorldToCORBA(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To CORBA Seq</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To CORBA Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To CORBA Seq</em>' attribute.
	 * @see #setWorldToCORBASeq(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToCORBASeq()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCORBASeq();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To CORBA Seq</em>' attribute.
	 * @see #getWorldToCORBASeq()
	 * @generated
	 */
	void setWorldToCORBASeq(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To CORBA Dev IO</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To CORBA Dev IO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To CORBA Dev IO</em>' attribute.
	 * @see #setWorldToCORBADevIO(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToCORBADevIO()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCORBADevIO();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To CORBA Dev IO</em>' attribute.
	 * @see #getWorldToCORBADevIO()
	 * @generated
	 */
	void setWorldToCORBADevIO(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To BACI</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To BACI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To BACI</em>' attribute.
	 * @see #setWorldToBACI(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToBACI()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToBACI();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToBACI <em>World To BACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To BACI</em>' attribute.
	 * @see #getWorldToBACI()
	 * @generated
	 */
	void setWorldToBACI(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To Java</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To Java</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To Java</em>' attribute.
	 * @see #setWorldToJava(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToJava()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToJava();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToJava <em>World To Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To Java</em>' attribute.
	 * @see #getWorldToJava()
	 * @generated
	 */
	void setWorldToJava(Hashtable value);

	/**
	 * Returns the value of the '<em><b>World To Database</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To Database</em>' attribute.
	 * @see #setWorldToDatabase(Hashtable)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getTable_WorldToDatabase()
	 * @model default="null" dataType="alma.Control.datamodel.meta.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToDatabase();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.Table#getWorldToDatabase <em>World To Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To Database</em>' attribute.
	 * @see #getWorldToDatabase()
	 * @generated
	 */
	void setWorldToDatabase(Hashtable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int i;\r\n\tfor(i = 0; i < sheetNames.size(); i++)\r\n\t\tif(((String)sheetNames.get(i)).compareTo(name) == 0)\r\n\t\t\treturn i;\r\n\treturn -1;'"
	 * @generated
	 */
	int getSheetNum(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int i;\r\nfor(i = 0; i < ((ArrayList)colNames.get(sheet)).size(); i++)\r\n\tif(((String)((ArrayList)colNames.get(sheet)).get(i)).compareTo(name) == 0)\r\n\t\treturn i;\r\n\treturn -1;'"
	 * @generated
	 */
	int getColNum(int sheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='sheetNames.add(name);\r\ncolNames.add(new ArrayList());'"
	 * @generated
	 */
	void addSheet(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='((ArrayList)colNames.get(sheet)).add(name);\r\n'"
	 * @generated
	 */
	void addCol(int sheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model shDataType="alma.Control.datamodel.meta.base.String3DT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint i, j;\r\n\t\tsheetNames = new ArrayList();\r\n\t\tcolNames = new ArrayList();\r\n\t\tfor(i = 0; i < sh.length; i++){\r\n\t\t\taddSheet(sh[i][0][0]);\r\n\t\t\tfor(j = 0; j < sh[i][1].length; j++){\r\n\t\t\t\taddCol(i, sh[i][1][j]);\r\n\t\t\t}\r\n\t\t}\r\n\t\ttoCPP = new Hashtable();\r\n\t\ttoCPP.put(\"char\", \"char\");\r\n\t\ttoCPP.put(\"short\", \"short\");\r\n\t\ttoCPP.put(\"int\", \"int\");\r\n\t\ttoCPP.put(\"long long\", \"long long\");\r\n\t\ttoCPP.put(\"float\", \"float\");\r\n\t\ttoCPP.put(\"double\", \"double\");\r\n\t\ttoCPP.put(\"bool\", \"bool\");\r\n\t\ttoCPP.put(\"string\", \"char *\");\r\n\t\ttoCPP.put(\"void\", \"void\");\r\n\r\n\t\ttoIDL = new Hashtable();\r\n\t\ttoIDL.put(\"char\", \"long\");\r\n\t\ttoIDL.put(\"short\", \"long\");\r\n\t\ttoIDL.put(\"int\", \"long\");\r\n\t\ttoIDL.put(\"long long\", \"long long\");\r\n\t\ttoIDL.put(\"float\", \"float\");\r\n\t\ttoIDL.put(\"double\", \"double\");\r\n\t\ttoIDL.put(\"bool\", \"boolean\");\r\n\t\ttoIDL.put(\"string\", \"string\");\r\n\t\ttoIDL.put(\"void\", \"void\");\r\n\r\n\t\ttoIDLSeq = new Hashtable();\r\n\t\ttoIDLSeq.put(\"char\", \"Control::LongSeq\");\r\n\t\ttoIDLSeq.put(\"short\", \"Control::LongSeq\");\r\n\t\ttoIDLSeq.put(\"int\", \"Control::LongSeq\");\r\n\t\ttoIDLSeq.put(\"long long\", \"Control::LongLongSeq\");\r\n\t\ttoIDLSeq.put(\"float\", \"Control::FloatSeq\");\r\n\t\ttoIDLSeq.put(\"double\", \"Control::DoubleSeq\");\r\n\t\ttoIDLSeq.put(\"bool\", \"Control::BooleanSeq\");\r\n\t\ttoIDLSeq.put(\"string\", \"Control::StringSeq\");\r\n\t\ttoIDLSeq.put(\"void\", \"NOTHING\");\r\n\r\n\t\ttoCORBA = new Hashtable();\r\n\t\ttoCORBA.put(\"char\", \"CORBA::Long\");\r\n\t\ttoCORBA.put(\"short\", \"CORBA::Long\");\r\n\t\ttoCORBA.put(\"int\", \"CORBA::Long\");\r\n\t\ttoCORBA.put(\"long long\", \"CORBA::LongLong\");\r\n\t\ttoCORBA.put(\"float\", \"CORBA::Float\");\r\n\t\ttoCORBA.put(\"double\", \"CORBA::Double\");\r\n\t\ttoCORBA.put(\"bool\", \"CORBA::Boolean\");\r\n\t\ttoCORBA.put(\"string\", \"char *\");\r\n\t\ttoCORBA.put(\"void\", \"void\");\r\n\r\n\t\ttoCORBADevIO = new Hashtable();\r\n\t\ttoCORBADevIO.put(\"char\", \"CORBA::Long\");\r\n\t\ttoCORBADevIO.put(\"short\", \"CORBA::Long\");\r\n\t\ttoCORBADevIO.put(\"int\", \"CORBA::Long\");\r\n\t\ttoCORBADevIO.put(\"long long\", \"CORBA::LongLong\");\r\n\t\ttoCORBADevIO.put(\"float\", \"CORBA::Float\");\r\n\t\ttoCORBADevIO.put(\"double\", \"CORBA::Double\");\r\n\t\ttoCORBADevIO.put(\"bool\", \"CORBA::Boolean\");\r\n\t\ttoCORBADevIO.put(\"string\", \"CORBA::String\");\r\n\t\ttoCORBADevIO.put(\"void\", \"NOTHING\");\r\n\r\n\t\ttoCORBASeq = new Hashtable();\r\n\t\ttoCORBASeq.put(\"char\", \"Control::LongSeq\");\r\n\t\ttoCORBASeq.put(\"short\", \"Control::LongSeq\");\r\n\t\ttoCORBASeq.put(\"int\", \"Control::LongSeq\");\r\n\t\ttoCORBASeq.put(\"long long\", \"Control::LongLongSeq\");\r\n\t\ttoCORBASeq.put(\"float\", \"Control::FloatSeq\");\r\n\t\ttoCORBASeq.put(\"double\", \"Control::DoubleSeq\");\r\n\t\ttoCORBASeq.put(\"bool\", \"Control::BooleanSeq\");\r\n\t\ttoCORBASeq.put(\"string\", \"Control::StringSeq\");\r\n\t\ttoCORBASeq.put(\"void\", \"NOTHING\");\r\n\r\n\t\ttoBACI = new Hashtable();\r\n\t\ttoBACI.put(\"char\", \"long\");\r\n\t\ttoBACI.put(\"short\", \"long\");\r\n\t\ttoBACI.put(\"int\", \"long\");\r\n\t\ttoBACI.put(\"long long\", \"longLong\");\r\n\t\ttoBACI.put(\"float\", \"float\");\r\n\t\ttoBACI.put(\"double\", \"double\");\r\n\t\ttoBACI.put(\"bool\", \"boolean\");\r\n\t\ttoBACI.put(\"string\", \"string\");\r\n\t\ttoBACI.put(\"void\", \"void\");\r\n\r\n\t\ttoDatabase = new Hashtable();\r\n\t\ttoDatabase.put(\"char\", \"char\");\r\n\t\ttoDatabase.put(\"short\", \"integer\");\r\n\t\ttoDatabase.put(\"int\", \"integer\");\r\n\t\ttoDatabase.put(\"long long\", \"integer\");\r\n\t\ttoDatabase.put(\"float\", \"float\");\r\n\t\ttoDatabase.put(\"double\", \"double\");\r\n\t\ttoDatabase.put(\"bool\", \"boolean\");\r\n\t\ttoDatabase.put(\"string\", \"string\");\r\n\t\ttoDatabase.put(\"void\", \"-none-\");\r\n\r\n\t\trawToCPP = new Hashtable();\r\n\t\trawToCPP.put(\"bit\", \"char\");\r\n\t\trawToCPP.put(\"ubyte\", \"unsigned char\");\r\n\t\trawToCPP.put(\"int8\", \"char\");\r\n\t\trawToCPP.put(\"uint8\", \"unsigned char\");\r\n\t\trawToCPP.put(\"int16\", \"short\");\r\n\t\trawToCPP.put(\"uint16\", \"unsigned short\");\r\n\t\trawToCPP.put(\"int24\", \"int\");\r\n\t\trawToCPP.put(\"uint24\", \"unsigned int\");\r\n\t\trawToCPP.put(\"int32\", \"int\");\r\n\t\trawToCPP.put(\"uint32\", \"unsigned int\");\r\n\t\trawToCPP.put(\"int48\", \"long long\");\r\n\t\trawToCPP.put(\"uint48\", \"unsigned long long\");\r\n\t\trawToCPP.put(\"int64\", \"long long\");\r\n\t\trawToCPP.put(\"uint64\", \"unsigned long long\");\r\n\t\trawToCPP.put(\"float\", \"float\");\r\n\t\trawToCPP.put(\"double\", \"double\");\r\n\r\n\t\trawToByteSwapped = new Hashtable();\r\n\t\trawToByteSwapped.put(\"bit\", \"false\");\r\n\t\trawToByteSwapped.put(\"ubyte\", \"false\");\r\n\t\trawToByteSwapped.put(\"int8\", \"false\");\r\n\t\trawToByteSwapped.put(\"uint8\", \"false\");\r\n\t\trawToByteSwapped.put(\"int16\", \"true\");\r\n\t\trawToByteSwapped.put(\"uint16\", \"true\");\r\n\t\trawToByteSwapped.put(\"int24\", \"true\");\r\n\t\trawToByteSwapped.put(\"uint24\", \"true\");\r\n\t\trawToByteSwapped.put(\"int32\", \"true\");\r\n\t\trawToByteSwapped.put(\"uint32\", \"true\");\r\n\t\trawToByteSwapped.put(\"int48\", \"true\");\r\n\t\trawToByteSwapped.put(\"uint48\", \"true\");\r\n\t\trawToByteSwapped.put(\"int64\", \"true\");\r\n\t\trawToByteSwapped.put(\"uint64\", \"true\");\r\n\t\trawToByteSwapped.put(\"float\", \"true\");\r\n\t\trawToByteSwapped.put(\"double\", \"true\");\r\n\r\n\t\trawBytes = new Hashtable();\r\n\t\trawBytes.put(\"bit\", \"1\");\r\n\t\trawBytes.put(\"ubyte\", \"1\");\r\n\t\trawBytes.put(\"int8\", \"1\");\r\n\t\trawBytes.put(\"uint8\", \"1\");\r\n\t\trawBytes.put(\"int16\", \"2\");\r\n\t\trawBytes.put(\"uint16\", \"2\");\r\n\t\trawBytes.put(\"int24\", \"3\");\r\n\t\trawBytes.put(\"uint24\", \"3\");\r\n\t\trawBytes.put(\"int32\", \"4\");\r\n\t\trawBytes.put(\"uint32\", \"4\");\r\n\t\trawBytes.put(\"int48\", \"6\");\r\n\t\trawBytes.put(\"uint48\", \"6\");\r\n\t\trawBytes.put(\"int64\", \"8\");\r\n\t\trawBytes.put(\"uint64\", \"8\");\r\n\t\trawBytes.put(\"float\", \"4\");\r\n\t\trawBytes.put(\"double\", \"8\");\r\n\r\n\t\tworldToCPP = new Hashtable();\r\n\t\tworldToCPP.put(\"byte\", \"char\");\r\n\t\tworldToCPP.put(\"ubyte\", \"unsigned char\");\r\n\t\tworldToCPP.put(\"short\", \"short\");\r\n\t\tworldToCPP.put(\"ushort\", \"unsigned short\");\r\n\t\tworldToCPP.put(\"int\", \"int\");\r\n\t\tworldToCPP.put(\"uint\", \"unsigned int\");\r\n\t\tworldToCPP.put(\"long\", \"long long\");\r\n\t\tworldToCPP.put(\"ulong\", \"unsigned long long\");\r\n\t\tworldToCPP.put(\"float\", \"float\");\r\n\t\tworldToCPP.put(\"double\", \"double\");\r\n\t\tworldToCPP.put(\"boolean\", \"bool\");\r\n\t\tworldToCPP.put(\"string\", \"std::string\");\r\n\t\tworldToCPP.put(\"acstime\", \"ACS::Time\");\r\n\t\tworldToCPP.put(\"void\", \"void\");\r\n\r\n\t\tworldToJava = new Hashtable();\r\n\t\tworldToJava.put(\"byte\", \"int\");\r\n\t\tworldToJava.put(\"ubyte\", \"int\");\r\n\t\tworldToJava.put(\"short\", \"int\");\r\n\t\tworldToJava.put(\"ushort\", \"int\");\r\n\t\tworldToJava.put(\"int\", \"int\");\r\n\t\tworldToJava.put(\"uint\", \"long\");\r\n\t\tworldToJava.put(\"long\", \"long\");\r\n\t\tworldToJava.put(\"ulong\", \"long\");\r\n\t\tworldToJava.put(\"float\", \"float\");\r\n\t\tworldToJava.put(\"double\", \"double\");\r\n\t\tworldToJava.put(\"boolean\", \"boolean\");\r\n\t\tworldToJava.put(\"string\", \"String\");\r\n\t\tworldToJava.put(\"acstime\", \"ACSTime\");\r\n\t\tworldToJava.put(\"void\", \"void\");\r\n\r\n\t\tworldToBACI = new Hashtable();\r\n\t\tworldToBACI.put(\"byte\", \"long\");\r\n\t\tworldToBACI.put(\"ubyte\", \"long\");\r\n\t\tworldToBACI.put(\"short\", \"long\");\r\n\t\tworldToBACI.put(\"ushort\", \"long\");\r\n\t\tworldToBACI.put(\"int\", \"long\");\r\n\t\tworldToBACI.put(\"uint\", \"uLong\");\r\n\t\tworldToBACI.put(\"long\", \"longLong\");\r\n\t\tworldToBACI.put(\"ulong\", \"uLongLong\");\r\n\t\tworldToBACI.put(\"float\", \"float\");\r\n\t\tworldToBACI.put(\"double\", \"double\");\r\n\t\tworldToBACI.put(\"boolean\", \"boolean\");\r\n\t\tworldToBACI.put(\"string\", \"string\");\r\n\t\tworldToBACI.put(\"acstime\", \"uLongLong\");\r\n\t\tworldToBACI.put(\"void\", \"void\");\r\n\r\n\t\tworldToCORBA = new Hashtable();\r\n\t\tworldToCORBA.put(\"byte\", \"CORBA::Long\");\r\n\t\tworldToCORBA.put(\"ubyte\", \"CORBA::Long\");\r\n\t\tworldToCORBA.put(\"short\", \"CORBA::Long\");\r\n\t\tworldToCORBA.put(\"ushort\", \"CORBA::Long\");\r\n\t\tworldToCORBA.put(\"int\", \"CORBA::Long\");\r\n\t\tworldToCORBA.put(\"uint\", \"CORBA::ULong\");\r\n\t\tworldToCORBA.put(\"long\", \"CORBA::LongLong\");\r\n\t\tworldToCORBA.put(\"ulong\", \"CORBA::ULongLong\");\r\n\t\tworldToCORBA.put(\"float\", \"CORBA::Float\");\r\n\t\tworldToCORBA.put(\"double\", \"CORBA::Double\");\r\n\t\tworldToCORBA.put(\"boolean\", \"CORBA::Boolean\");\r\n\t\tworldToCORBA.put(\"string\", \"char *\");\r\n\t\tworldToCORBA.put(\"acstime\", \"ACS::Time\");\r\n\t\tworldToCORBA.put(\"void\", \"void\");\r\n\r\n\t\tworldToCORBADevIO = new Hashtable();\r\n\t\tworldToCORBADevIO.put(\"byte\", \"CORBA::Long\");\r\n\t\tworldToCORBADevIO.put(\"ubyte\", \"CORBA::Long\");\r\n\t\tworldToCORBADevIO.put(\"short\", \"CORBA::Long\");\r\n\t\tworldToCORBADevIO.put(\"ushort\", \"CORBA::Long\");\r\n\t\tworldToCORBADevIO.put(\"int\", \"CORBA::Long\");\r\n\t\tworldToCORBADevIO.put(\"uint\", \"CORBA::ULong\");\r\n\t\tworldToCORBADevIO.put(\"long\", \"CORBA::LongLong\");\r\n\t\tworldToCORBADevIO.put(\"ulong\", \"CORBA::ULongLong\");\r\n\t\tworldToCORBADevIO.put(\"float\", \"CORBA::Float\");\r\n\t\tworldToCORBADevIO.put(\"double\", \"CORBA::Double\");\r\n\t\tworldToCORBADevIO.put(\"boolean\", \"CORBA::Boolean\");\r\n\t\tworldToCORBADevIO.put(\"string\", \"CORBA::String\");\r\n\t\tworldToCORBADevIO.put(\"acstime\", \"ACS::Time\");\r\n\t\tworldToCORBADevIO.put(\"void\", \"NOTHING\");\r\n\r\n\t\tworldToCORBASeq = new Hashtable();\r\n\t\tworldToCORBASeq.put(\"byte\", \"Control::LongSeq\");\r\n\t\tworldToCORBASeq.put(\"ubyte\", \"Control::LongSeq\");\r\n\t\tworldToCORBASeq.put(\"short\", \"Control::LongSeq\");\r\n\t\tworldToCORBASeq.put(\"ushort\", \"Control::LongSeq\");\r\n\t\tworldToCORBASeq.put(\"int\", \"Control::LongSeq\");\r\n\t\tworldToCORBASeq.put(\"uint\", \"Control::ULongSeq\");\r\n\t\tworldToCORBASeq.put(\"long\", \"Control::LongLongSeq\");\r\n\t\tworldToCORBASeq.put(\"ulong\", \"Control::ULongLongSeq\");\r\n\t\tworldToCORBASeq.put(\"float\", \"Control::FloatSeq\");\r\n\t\tworldToCORBASeq.put(\"double\", \"Control::DoubleSeq\");\r\n\t\tworldToCORBASeq.put(\"boolean\", \"Control::BooleanSeq\");\r\n\t\tworldToCORBASeq.put(\"string\", \"Control::StringSeq\");\r\n\t\tworldToCORBASeq.put(\"acstime\", \"Control::ACSTimeSeq\");\r\n\t\tworldToCORBASeq.put(\"void\", \"NOTHING\");\r\n\r\n\t\tworldToIDLSeq = new Hashtable();\r\n\t\tworldToIDLSeq.put(\"byte\", \"Control::LongSeq\");\r\n\t\tworldToIDLSeq.put(\"ubyte\", \"Control::LongSeq\");\r\n\t\tworldToIDLSeq.put(\"short\", \"Control::LongSeq\");\r\n\t\tworldToIDLSeq.put(\"ushort\", \"Control::LongSeq\");\r\n\t\tworldToIDLSeq.put(\"int\", \"Control::LongSeq\");\r\n\t\tworldToIDLSeq.put(\"uint\", \"Control::ULongSeq\");\r\n\t\tworldToIDLSeq.put(\"long\", \"Control::LongLongSeq\");\r\n\t\tworldToIDLSeq.put(\"ulong\", \"Control::ULongLongSeq\");\r\n\t\tworldToIDLSeq.put(\"float\", \"Control::FloatSeq\");\r\n\t\tworldToIDLSeq.put(\"double\", \"Control::DoubleSeq\");\r\n\t\tworldToIDLSeq.put(\"boolean\", \"Control::BooleanSeq\");\r\n\t\tworldToIDLSeq.put(\"string\", \"Control::StringSeq\");\r\n\t\tworldToIDLSeq.put(\"acstime\", \"Control::ACSTimeSeq\");\r\n\t\tworldToIDLSeq.put(\"void\", \"NOTHING\");\r\n\r\n\t\tworldToIDL = new Hashtable();\r\n\t\tworldToIDL.put(\"byte\", \"long\");\r\n\t\tworldToIDL.put(\"ubyte\", \"long\");\r\n\t\tworldToIDL.put(\"short\", \"long\");\r\n\t\tworldToIDL.put(\"ushort\", \"long\");\r\n\t\tworldToIDL.put(\"int\", \"long\");\r\n\t\tworldToIDL.put(\"uint\", \"unsigned long\");\r\n\t\tworldToIDL.put(\"long\", \"long long\");\r\n\t\tworldToIDL.put(\"ulong\", \"unsigned long long\");\r\n\t\tworldToIDL.put(\"float\", \"float\");\r\n\t\tworldToIDL.put(\"double\", \"double\");\r\n\t\tworldToIDL.put(\"boolean\", \"boolean\");\r\n\t\tworldToIDL.put(\"string\", \"string\");\r\n\t\tworldToIDL.put(\"acstime\", \"ACS::Time\");\r\n\t\tworldToIDL.put(\"void\", \"void\");\r\n\r\n\t\tworldToDatabase = new Hashtable();\r\n\t\tworldToDatabase.put(\"byte\", \"integer\");\r\n\t\tworldToDatabase.put(\"ubyte\", \"integer\");\r\n\t\tworldToDatabase.put(\"short\", \"integer\");\r\n\t\tworldToDatabase.put(\"ushort\", \"integer\");\r\n\t\tworldToDatabase.put(\"int\", \"integer\");\r\n\t\tworldToDatabase.put(\"uint\", \"integer\");\r\n\t\tworldToDatabase.put(\"long\", \"integer\");\r\n\t\tworldToDatabase.put(\"ulong\", \"integer\");\r\n\t\tworldToDatabase.put(\"float\", \"float\");\r\n\t\tworldToDatabase.put(\"double\", \"double\");\r\n\t\tworldToDatabase.put(\"boolean\", \"boolean\");\r\n\t\tworldToDatabase.put(\"string\", \"string\");\r\n\t\tworldToDatabase.put(\"acstime\", \"integer\");\r\n\t\tworldToDatabase.put(\"void\", \"-none-\");'"
	 * @generated
	 */
	void initialize(String[][][] sh);

} // Table
