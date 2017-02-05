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
 */
package datamodel.base;

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
 *   <li>{@link datamodel.base.Table#getDepChar <em>Dep Char</em>}</li>
 *   <li>{@link datamodel.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}</li>
 *   <li>{@link datamodel.base.Table#getSheetNames <em>Sheet Names</em>}</li>
 *   <li>{@link datamodel.base.Table#getColNames <em>Col Names</em>}</li>
 *   <li>{@link datamodel.base.Table#getTagNames <em>Tag Names</em>}</li>
 *   <li>{@link datamodel.base.Table#getToCPP <em>To CPP</em>}</li>
 *   <li>{@link datamodel.base.Table#getToIDL <em>To IDL</em>}</li>
 *   <li>{@link datamodel.base.Table#getToIDLSeq <em>To IDL Seq</em>}</li>
 *   <li>{@link datamodel.base.Table#getToCORBA <em>To CORBA</em>}</li>
 *   <li>{@link datamodel.base.Table#getToCORBASeq <em>To CORBA Seq</em>}</li>
 *   <li>{@link datamodel.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}</li>
 *   <li>{@link datamodel.base.Table#getToBACI <em>To BACI</em>}</li>
 *   <li>{@link datamodel.base.Table#getToDatabase <em>To Database</em>}</li>
 *   <li>{@link datamodel.base.Table#getRawToCPP <em>Raw To CPP</em>}</li>
 *   <li>{@link datamodel.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}</li>
 *   <li>{@link datamodel.base.Table#getRawBytes <em>Raw Bytes</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToCPP <em>World To CPP</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToIDL <em>World To IDL</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToCORBA <em>World To CORBA</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToBACI <em>World To BACI</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToJava <em>World To Java</em>}</li>
 *   <li>{@link datamodel.base.Table#getWorldToDatabase <em>World To Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getTable()
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
	 * @see datamodel.base.BasePackage#getTable_DepChar()
	 * @model default="^"
	 * @generated
	 */
	String getDepChar();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getDepChar <em>Dep Char</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_CelsiusToKelvin()
	 * @model default="CelsiusToKelvin"
	 * @generated
	 */
	String getCelsiusToKelvin();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getCelsiusToKelvin <em>Celsius To Kelvin</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_SheetNames()
	 * @model default="null" dataType="datamodel.base.ArrayList"
	 * @generated
	 */
	ArrayList getSheetNames();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getSheetNames <em>Sheet Names</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ColNames()
	 * @model default="null" dataType="datamodel.base.ArrayList"
	 * @generated
	 */
	ArrayList getColNames();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getColNames <em>Col Names</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_TagNames()
	 * @model default="null" dataType="datamodel.base.ArrayList"
	 * @generated
	 */
	ArrayList getTagNames();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getTagNames <em>Tag Names</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToCPP()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCPP();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToCPP <em>To CPP</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToIDL()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToIDL();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToIDL <em>To IDL</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToIDLSeq()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToIDLSeq();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToIDLSeq <em>To IDL Seq</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToCORBA()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCORBA();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToCORBA <em>To CORBA</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToCORBASeq()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCORBASeq();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToCORBASeq <em>To CORBA Seq</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToCORBADevIO()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToCORBADevIO();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToCORBADevIO <em>To CORBA Dev IO</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToBACI()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToBACI();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToBACI <em>To BACI</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_ToDatabase()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getToDatabase();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getToDatabase <em>To Database</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_RawToCPP()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getRawToCPP();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getRawToCPP <em>Raw To CPP</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_RawToByteSwapped()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getRawToByteSwapped();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getRawToByteSwapped <em>Raw To Byte Swapped</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_RawBytes()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getRawBytes();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getRawBytes <em>Raw Bytes</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToCPP()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCPP();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToCPP <em>World To CPP</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToIDL()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToIDL();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToIDL <em>World To IDL</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToIDLSeq()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToIDLSeq();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToIDLSeq <em>World To IDL Seq</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToCORBA()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCORBA();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToCORBA <em>World To CORBA</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToCORBASeq()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCORBASeq();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToCORBASeq <em>World To CORBA Seq</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToCORBADevIO()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToCORBADevIO();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToBACI()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToBACI();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToBACI <em>World To BACI</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToJava()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToJava();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToJava <em>World To Java</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getTable_WorldToDatabase()
	 * @model default="null" dataType="datamodel.base.Hashtable"
	 * @generated
	 */
	Hashtable getWorldToDatabase();

	/**
	 * Sets the value of the '{@link datamodel.base.Table#getWorldToDatabase <em>World To Database</em>}' attribute.
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
	 * @model
	 * @generated
	 */
	int getSheetNum(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getColNum(int sheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addSheet(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCol(int sheet, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model shDataType="datamodel.base.String3DT"
	 * @generated
	 */
	void initialize(String[][][] sh);

} // Table
