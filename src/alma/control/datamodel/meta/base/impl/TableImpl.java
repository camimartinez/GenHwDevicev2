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
package alma.control.datamodel.meta.base.impl;

import alma.control.datamodel.meta.base.ArchiveProperty;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.DeviceModel;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getDepChar <em>Dep Char</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getCelsiusToKelvin <em>Celsius To Kelvin</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getSheetNames <em>Sheet Names</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getColNames <em>Col Names</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getTagNames <em>Tag Names</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToCPP <em>To CPP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToIDL <em>To IDL</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToIDLSeq <em>To IDL Seq</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToCORBA <em>To CORBA</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToCORBASeq <em>To CORBA Seq</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToCORBADevIO <em>To CORBA Dev IO</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToBACI <em>To BACI</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getToDatabase <em>To Database</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getRawToCPP <em>Raw To CPP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getRawToByteSwapped <em>Raw To Byte Swapped</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getRawBytes <em>Raw Bytes</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToCPP <em>World To CPP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToIDL <em>World To IDL</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToIDLSeq <em>World To IDL Seq</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToCORBA <em>World To CORBA</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToCORBASeq <em>World To CORBA Seq</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToCORBADevIO <em>World To CORBA Dev IO</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToBACI <em>World To BACI</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToJava <em>World To Java</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.TableImpl#getWorldToDatabase <em>World To Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The default value of the '{@link #getDepChar() <em>Dep Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepChar()
	 * @generated
	 * @ordered
	 */
	protected static final String DEP_CHAR_EDEFAULT = "^";

	/**
	 * The cached value of the '{@link #getDepChar() <em>Dep Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepChar()
	 * @generated
	 * @ordered
	 */
	protected String depChar = DEP_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCelsiusToKelvin() <em>Celsius To Kelvin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelsiusToKelvin()
	 * @generated
	 * @ordered
	 */
	protected static final String CELSIUS_TO_KELVIN_EDEFAULT = "CelsiusToKelvin";

	/**
	 * The cached value of the '{@link #getCelsiusToKelvin() <em>Celsius To Kelvin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelsiusToKelvin()
	 * @generated
	 * @ordered
	 */
	protected String celsiusToKelvin = CELSIUS_TO_KELVIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheetNames() <em>Sheet Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetNames()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList SHEET_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSheetNames() <em>Sheet Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetNames()
	 * @generated
	 * @ordered
	 */
	protected ArrayList sheetNames = SHEET_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getColNames() <em>Col Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColNames()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COL_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColNames() <em>Col Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColNames()
	 * @generated
	 * @ordered
	 */
	protected ArrayList colNames = COL_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTagNames() <em>Tag Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagNames()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList TAG_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagNames() <em>Tag Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagNames()
	 * @generated
	 * @ordered
	 */
	protected ArrayList tagNames = TAG_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCPP() <em>To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCPP()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_CPP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToCPP() <em>To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCPP()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toCPP = TO_CPP_EDEFAULT;

	/**
	 * The default value of the '{@link #getToIDL() <em>To IDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToIDL()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_IDL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToIDL() <em>To IDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToIDL()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toIDL = TO_IDL_EDEFAULT;

	/**
	 * The default value of the '{@link #getToIDLSeq() <em>To IDL Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToIDLSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_IDL_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToIDLSeq() <em>To IDL Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToIDLSeq()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toIDLSeq = TO_IDL_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCORBA() <em>To CORBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCORBA()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_CORBA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToCORBA() <em>To CORBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCORBA()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toCORBA = TO_CORBA_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCORBASeq() <em>To CORBA Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCORBASeq()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_CORBA_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToCORBASeq() <em>To CORBA Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCORBASeq()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toCORBASeq = TO_CORBA_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCORBADevIO() <em>To CORBA Dev IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCORBADevIO()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_CORBA_DEV_IO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToCORBADevIO() <em>To CORBA Dev IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCORBADevIO()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toCORBADevIO = TO_CORBA_DEV_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getToBACI() <em>To BACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBACI()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_BACI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBACI() <em>To BACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBACI()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toBACI = TO_BACI_EDEFAULT;

	/**
	 * The default value of the '{@link #getToDatabase() <em>To Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable TO_DATABASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToDatabase() <em>To Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDatabase()
	 * @generated
	 * @ordered
	 */
	protected Hashtable toDatabase = TO_DATABASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRawToCPP() <em>Raw To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawToCPP()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable RAW_TO_CPP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawToCPP() <em>Raw To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawToCPP()
	 * @generated
	 * @ordered
	 */
	protected Hashtable rawToCPP = RAW_TO_CPP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRawToByteSwapped() <em>Raw To Byte Swapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawToByteSwapped()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable RAW_TO_BYTE_SWAPPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawToByteSwapped() <em>Raw To Byte Swapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawToByteSwapped()
	 * @generated
	 * @ordered
	 */
	protected Hashtable rawToByteSwapped = RAW_TO_BYTE_SWAPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRawBytes() <em>Raw Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawBytes()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable RAW_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawBytes() <em>Raw Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawBytes()
	 * @generated
	 * @ordered
	 */
	protected Hashtable rawBytes = RAW_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToCPP() <em>World To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCPP()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_CPP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToCPP() <em>World To CPP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCPP()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToCPP = WORLD_TO_CPP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToIDL() <em>World To IDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToIDL()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_IDL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToIDL() <em>World To IDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToIDL()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToIDL = WORLD_TO_IDL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToIDLSeq() <em>World To IDL Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToIDLSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_IDL_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToIDLSeq() <em>World To IDL Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToIDLSeq()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToIDLSeq = WORLD_TO_IDL_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToCORBA() <em>World To CORBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCORBA()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_CORBA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToCORBA() <em>World To CORBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCORBA()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToCORBA = WORLD_TO_CORBA_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToCORBASeq() <em>World To CORBA Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCORBASeq()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_CORBA_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToCORBASeq() <em>World To CORBA Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCORBASeq()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToCORBASeq = WORLD_TO_CORBA_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToCORBADevIO() <em>World To CORBA Dev IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCORBADevIO()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_CORBA_DEV_IO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToCORBADevIO() <em>World To CORBA Dev IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToCORBADevIO()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToCORBADevIO = WORLD_TO_CORBA_DEV_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToBACI() <em>World To BACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToBACI()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_BACI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToBACI() <em>World To BACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToBACI()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToBACI = WORLD_TO_BACI_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToJava() <em>World To Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToJava()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_JAVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToJava() <em>World To Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToJava()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToJava = WORLD_TO_JAVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorldToDatabase() <em>World To Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final Hashtable WORLD_TO_DATABASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorldToDatabase() <em>World To Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToDatabase()
	 * @generated
	 * @ordered
	 */
	protected Hashtable worldToDatabase = WORLD_TO_DATABASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepChar() {
		return depChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepChar(String newDepChar) {
		String oldDepChar = depChar;
		depChar = newDepChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__DEP_CHAR, oldDepChar, depChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCelsiusToKelvin() {
		return celsiusToKelvin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCelsiusToKelvin(String newCelsiusToKelvin) {
		String oldCelsiusToKelvin = celsiusToKelvin;
		celsiusToKelvin = newCelsiusToKelvin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__CELSIUS_TO_KELVIN, oldCelsiusToKelvin, celsiusToKelvin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getSheetNames() {
		return sheetNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetNames(ArrayList newSheetNames) {
		ArrayList oldSheetNames = sheetNames;
		sheetNames = newSheetNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__SHEET_NAMES, oldSheetNames, sheetNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getColNames() {
		return colNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColNames(ArrayList newColNames) {
		ArrayList oldColNames = colNames;
		colNames = newColNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__COL_NAMES, oldColNames, colNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getTagNames() {
		return tagNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagNames(ArrayList newTagNames) {
		ArrayList oldTagNames = tagNames;
		tagNames = newTagNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TAG_NAMES, oldTagNames, tagNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToCPP() {
		return toCPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCPP(Hashtable newToCPP) {
		Hashtable oldToCPP = toCPP;
		toCPP = newToCPP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_CPP, oldToCPP, toCPP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToIDL() {
		return toIDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToIDL(Hashtable newToIDL) {
		Hashtable oldToIDL = toIDL;
		toIDL = newToIDL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_IDL, oldToIDL, toIDL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToIDLSeq() {
		return toIDLSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToIDLSeq(Hashtable newToIDLSeq) {
		Hashtable oldToIDLSeq = toIDLSeq;
		toIDLSeq = newToIDLSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_IDL_SEQ, oldToIDLSeq, toIDLSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToCORBA() {
		return toCORBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCORBA(Hashtable newToCORBA) {
		Hashtable oldToCORBA = toCORBA;
		toCORBA = newToCORBA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_CORBA, oldToCORBA, toCORBA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToCORBASeq() {
		return toCORBASeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCORBASeq(Hashtable newToCORBASeq) {
		Hashtable oldToCORBASeq = toCORBASeq;
		toCORBASeq = newToCORBASeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_CORBA_SEQ, oldToCORBASeq, toCORBASeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToCORBADevIO() {
		return toCORBADevIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCORBADevIO(Hashtable newToCORBADevIO) {
		Hashtable oldToCORBADevIO = toCORBADevIO;
		toCORBADevIO = newToCORBADevIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_CORBA_DEV_IO, oldToCORBADevIO, toCORBADevIO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToBACI() {
		return toBACI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBACI(Hashtable newToBACI) {
		Hashtable oldToBACI = toBACI;
		toBACI = newToBACI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_BACI, oldToBACI, toBACI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getToDatabase() {
		return toDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDatabase(Hashtable newToDatabase) {
		Hashtable oldToDatabase = toDatabase;
		toDatabase = newToDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__TO_DATABASE, oldToDatabase, toDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getRawToCPP() {
		return rawToCPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawToCPP(Hashtable newRawToCPP) {
		Hashtable oldRawToCPP = rawToCPP;
		rawToCPP = newRawToCPP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__RAW_TO_CPP, oldRawToCPP, rawToCPP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getRawToByteSwapped() {
		return rawToByteSwapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawToByteSwapped(Hashtable newRawToByteSwapped) {
		Hashtable oldRawToByteSwapped = rawToByteSwapped;
		rawToByteSwapped = newRawToByteSwapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__RAW_TO_BYTE_SWAPPED, oldRawToByteSwapped, rawToByteSwapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getRawBytes() {
		return rawBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawBytes(Hashtable newRawBytes) {
		Hashtable oldRawBytes = rawBytes;
		rawBytes = newRawBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__RAW_BYTES, oldRawBytes, rawBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToCPP() {
		return worldToCPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToCPP(Hashtable newWorldToCPP) {
		Hashtable oldWorldToCPP = worldToCPP;
		worldToCPP = newWorldToCPP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_CPP, oldWorldToCPP, worldToCPP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToIDL() {
		return worldToIDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToIDL(Hashtable newWorldToIDL) {
		Hashtable oldWorldToIDL = worldToIDL;
		worldToIDL = newWorldToIDL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_IDL, oldWorldToIDL, worldToIDL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToIDLSeq() {
		return worldToIDLSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToIDLSeq(Hashtable newWorldToIDLSeq) {
		Hashtable oldWorldToIDLSeq = worldToIDLSeq;
		worldToIDLSeq = newWorldToIDLSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_IDL_SEQ, oldWorldToIDLSeq, worldToIDLSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToCORBA() {
		return worldToCORBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToCORBA(Hashtable newWorldToCORBA) {
		Hashtable oldWorldToCORBA = worldToCORBA;
		worldToCORBA = newWorldToCORBA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_CORBA, oldWorldToCORBA, worldToCORBA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToCORBASeq() {
		return worldToCORBASeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToCORBASeq(Hashtable newWorldToCORBASeq) {
		Hashtable oldWorldToCORBASeq = worldToCORBASeq;
		worldToCORBASeq = newWorldToCORBASeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_CORBA_SEQ, oldWorldToCORBASeq, worldToCORBASeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToCORBADevIO() {
		return worldToCORBADevIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToCORBADevIO(Hashtable newWorldToCORBADevIO) {
		Hashtable oldWorldToCORBADevIO = worldToCORBADevIO;
		worldToCORBADevIO = newWorldToCORBADevIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_CORBA_DEV_IO, oldWorldToCORBADevIO, worldToCORBADevIO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToBACI() {
		return worldToBACI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToBACI(Hashtable newWorldToBACI) {
		Hashtable oldWorldToBACI = worldToBACI;
		worldToBACI = newWorldToBACI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_BACI, oldWorldToBACI, worldToBACI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToJava() {
		return worldToJava;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToJava(Hashtable newWorldToJava) {
		Hashtable oldWorldToJava = worldToJava;
		worldToJava = newWorldToJava;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_JAVA, oldWorldToJava, worldToJava));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable getWorldToDatabase() {
		return worldToDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToDatabase(Hashtable newWorldToDatabase) {
		Hashtable oldWorldToDatabase = worldToDatabase;
		worldToDatabase = newWorldToDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TABLE__WORLD_TO_DATABASE, oldWorldToDatabase, worldToDatabase));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSheetNum(final String name) {
		int i;
			for(i = 0; i < sheetNames.size(); i++)
				if(((String)sheetNames.get(i)).compareTo(name) == 0)
					return i;
			return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColNum(final int sheet, final String name) {
		int i;
		for(i = 0; i < ((ArrayList)colNames.get(sheet)).size(); i++)
			if(((String)((ArrayList)colNames.get(sheet)).get(i)).compareTo(name) == 0)
				return i;
			return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSheet(final String name) {
		sheetNames.add(name);
		colNames.add(new ArrayList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCol(final int sheet, final String name) {
		((ArrayList)colNames.get(sheet)).add(name);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize(final String[][][] sh) {
				int i, j;
				sheetNames = new ArrayList();
				colNames = new ArrayList();
				for(i = 0; i < sh.length; i++){
					addSheet(sh[i][0][0]);
					for(j = 0; j < sh[i][1].length; j++){
						addCol(i, sh[i][1][j]);
					}
				}
				toCPP = new Hashtable();
				toCPP.put("char", "char");
				toCPP.put("short", "short");
				toCPP.put("int", "int");
				toCPP.put("long long", "long long");
				toCPP.put("float", "float");
				toCPP.put("double", "double");
				toCPP.put("bool", "bool");
				toCPP.put("string", "char *");
				toCPP.put("void", "void");
		
				toIDL = new Hashtable();
				toIDL.put("char", "long");
				toIDL.put("short", "long");
				toIDL.put("int", "long");
				toIDL.put("long long", "long long");
				toIDL.put("float", "float");
				toIDL.put("double", "double");
				toIDL.put("bool", "boolean");
				toIDL.put("string", "string");
				toIDL.put("void", "void");
		
				toIDLSeq = new Hashtable();
				toIDLSeq.put("char", "Control::LongSeq");
				toIDLSeq.put("short", "Control::LongSeq");
				toIDLSeq.put("int", "Control::LongSeq");
				toIDLSeq.put("long long", "Control::LongLongSeq");
				toIDLSeq.put("float", "Control::FloatSeq");
				toIDLSeq.put("double", "Control::DoubleSeq");
				toIDLSeq.put("bool", "Control::BooleanSeq");
				toIDLSeq.put("string", "Control::StringSeq");
				toIDLSeq.put("void", "NOTHING");
		
				toCORBA = new Hashtable();
				toCORBA.put("char", "CORBA::Long");
				toCORBA.put("short", "CORBA::Long");
				toCORBA.put("int", "CORBA::Long");
				toCORBA.put("long long", "CORBA::LongLong");
				toCORBA.put("float", "CORBA::Float");
				toCORBA.put("double", "CORBA::Double");
				toCORBA.put("bool", "CORBA::Boolean");
				toCORBA.put("string", "char *");
				toCORBA.put("void", "void");
		
				toCORBADevIO = new Hashtable();
				toCORBADevIO.put("char", "CORBA::Long");
				toCORBADevIO.put("short", "CORBA::Long");
				toCORBADevIO.put("int", "CORBA::Long");
				toCORBADevIO.put("long long", "CORBA::LongLong");
				toCORBADevIO.put("float", "CORBA::Float");
				toCORBADevIO.put("double", "CORBA::Double");
				toCORBADevIO.put("bool", "CORBA::Boolean");
				toCORBADevIO.put("string", "CORBA::String");
				toCORBADevIO.put("void", "NOTHING");
		
				toCORBASeq = new Hashtable();
				toCORBASeq.put("char", "Control::LongSeq");
				toCORBASeq.put("short", "Control::LongSeq");
				toCORBASeq.put("int", "Control::LongSeq");
				toCORBASeq.put("long long", "Control::LongLongSeq");
				toCORBASeq.put("float", "Control::FloatSeq");
				toCORBASeq.put("double", "Control::DoubleSeq");
				toCORBASeq.put("bool", "Control::BooleanSeq");
				toCORBASeq.put("string", "Control::StringSeq");
				toCORBASeq.put("void", "NOTHING");
		
				toBACI = new Hashtable();
				toBACI.put("char", "long");
				toBACI.put("short", "long");
				toBACI.put("int", "long");
				toBACI.put("long long", "longLong");
				toBACI.put("float", "float");
				toBACI.put("double", "double");
				toBACI.put("bool", "boolean");
				toBACI.put("string", "string");
				toBACI.put("void", "void");
		
				toDatabase = new Hashtable();
				toDatabase.put("char", "char");
				toDatabase.put("short", "integer");
				toDatabase.put("int", "integer");
				toDatabase.put("long long", "integer");
				toDatabase.put("float", "float");
				toDatabase.put("double", "double");
				toDatabase.put("bool", "boolean");
				toDatabase.put("string", "string");
				toDatabase.put("void", "-none-");
		
				rawToCPP = new Hashtable();
				rawToCPP.put("bit", "char");
				rawToCPP.put("ubyte", "unsigned char");
				rawToCPP.put("int8", "char");
				rawToCPP.put("uint8", "unsigned char");
				rawToCPP.put("int16", "short");
				rawToCPP.put("uint16", "unsigned short");
				rawToCPP.put("int24", "int");
				rawToCPP.put("uint24", "unsigned int");
				rawToCPP.put("int32", "int");
				rawToCPP.put("uint32", "unsigned int");
				rawToCPP.put("int48", "long long");
				rawToCPP.put("uint48", "unsigned long long");
				rawToCPP.put("int64", "long long");
				rawToCPP.put("uint64", "unsigned long long");
				rawToCPP.put("float", "float");
				rawToCPP.put("double", "double");
		
				rawToByteSwapped = new Hashtable();
				rawToByteSwapped.put("bit", "false");
				rawToByteSwapped.put("ubyte", "false");
				rawToByteSwapped.put("int8", "false");
				rawToByteSwapped.put("uint8", "false");
				rawToByteSwapped.put("int16", "true");
				rawToByteSwapped.put("uint16", "true");
				rawToByteSwapped.put("int24", "true");
				rawToByteSwapped.put("uint24", "true");
				rawToByteSwapped.put("int32", "true");
				rawToByteSwapped.put("uint32", "true");
				rawToByteSwapped.put("int48", "true");
				rawToByteSwapped.put("uint48", "true");
				rawToByteSwapped.put("int64", "true");
				rawToByteSwapped.put("uint64", "true");
				rawToByteSwapped.put("float", "true");
				rawToByteSwapped.put("double", "true");
		
				rawBytes = new Hashtable();
				rawBytes.put("bit", "1");
				rawBytes.put("ubyte", "1");
				rawBytes.put("int8", "1");
				rawBytes.put("uint8", "1");
				rawBytes.put("int16", "2");
				rawBytes.put("uint16", "2");
				rawBytes.put("int24", "3");
				rawBytes.put("uint24", "3");
				rawBytes.put("int32", "4");
				rawBytes.put("uint32", "4");
				rawBytes.put("int48", "6");
				rawBytes.put("uint48", "6");
				rawBytes.put("int64", "8");
				rawBytes.put("uint64", "8");
				rawBytes.put("float", "4");
				rawBytes.put("double", "8");
		
				worldToCPP = new Hashtable();
				worldToCPP.put("byte", "char");
				worldToCPP.put("ubyte", "unsigned char");
				worldToCPP.put("short", "short");
				worldToCPP.put("ushort", "unsigned short");
				worldToCPP.put("int", "int");
				worldToCPP.put("uint", "unsigned int");
				worldToCPP.put("long", "long long");
				worldToCPP.put("ulong", "unsigned long long");
				worldToCPP.put("float", "float");
				worldToCPP.put("double", "double");
				worldToCPP.put("boolean", "bool");
				worldToCPP.put("string", "std::string");
				worldToCPP.put("acstime", "ACS::Time");
				worldToCPP.put("void", "void");
		
				worldToJava = new Hashtable();
				worldToJava.put("byte", "int");
				worldToJava.put("ubyte", "int");
				worldToJava.put("short", "int");
				worldToJava.put("ushort", "int");
				worldToJava.put("int", "int");
				worldToJava.put("uint", "long");
				worldToJava.put("long", "long");
				worldToJava.put("ulong", "long");
				worldToJava.put("float", "float");
				worldToJava.put("double", "double");
				worldToJava.put("boolean", "boolean");
				worldToJava.put("string", "String");
				worldToJava.put("acstime", "ACSTime");
				worldToJava.put("void", "void");
		
				worldToBACI = new Hashtable();
				worldToBACI.put("byte", "long");
				worldToBACI.put("ubyte", "long");
				worldToBACI.put("short", "long");
				worldToBACI.put("ushort", "long");
				worldToBACI.put("int", "long");
				worldToBACI.put("uint", "uLong");
				worldToBACI.put("long", "longLong");
				worldToBACI.put("ulong", "uLongLong");
				worldToBACI.put("float", "float");
				worldToBACI.put("double", "double");
				worldToBACI.put("boolean", "boolean");
				worldToBACI.put("string", "string");
				worldToBACI.put("acstime", "uLongLong");
				worldToBACI.put("void", "void");
		
				worldToCORBA = new Hashtable();
				worldToCORBA.put("byte", "CORBA::Long");
				worldToCORBA.put("ubyte", "CORBA::Long");
				worldToCORBA.put("short", "CORBA::Long");
				worldToCORBA.put("ushort", "CORBA::Long");
				worldToCORBA.put("int", "CORBA::Long");
				worldToCORBA.put("uint", "CORBA::ULong");
				worldToCORBA.put("long", "CORBA::LongLong");
				worldToCORBA.put("ulong", "CORBA::ULongLong");
				worldToCORBA.put("float", "CORBA::Float");
				worldToCORBA.put("double", "CORBA::Double");
				worldToCORBA.put("boolean", "CORBA::Boolean");
				worldToCORBA.put("string", "char *");
				worldToCORBA.put("acstime", "ACS::Time");
				worldToCORBA.put("void", "void");
		
				worldToCORBADevIO = new Hashtable();
				worldToCORBADevIO.put("byte", "CORBA::Long");
				worldToCORBADevIO.put("ubyte", "CORBA::Long");
				worldToCORBADevIO.put("short", "CORBA::Long");
				worldToCORBADevIO.put("ushort", "CORBA::Long");
				worldToCORBADevIO.put("int", "CORBA::Long");
				worldToCORBADevIO.put("uint", "CORBA::ULong");
				worldToCORBADevIO.put("long", "CORBA::LongLong");
				worldToCORBADevIO.put("ulong", "CORBA::ULongLong");
				worldToCORBADevIO.put("float", "CORBA::Float");
				worldToCORBADevIO.put("double", "CORBA::Double");
				worldToCORBADevIO.put("boolean", "CORBA::Boolean");
				worldToCORBADevIO.put("string", "CORBA::String");
				worldToCORBADevIO.put("acstime", "ACS::Time");
				worldToCORBADevIO.put("void", "NOTHING");
		
				worldToCORBASeq = new Hashtable();
				worldToCORBASeq.put("byte", "Control::LongSeq");
				worldToCORBASeq.put("ubyte", "Control::LongSeq");
				worldToCORBASeq.put("short", "Control::LongSeq");
				worldToCORBASeq.put("ushort", "Control::LongSeq");
				worldToCORBASeq.put("int", "Control::LongSeq");
				worldToCORBASeq.put("uint", "Control::ULongSeq");
				worldToCORBASeq.put("long", "Control::LongLongSeq");
				worldToCORBASeq.put("ulong", "Control::ULongLongSeq");
				worldToCORBASeq.put("float", "Control::FloatSeq");
				worldToCORBASeq.put("double", "Control::DoubleSeq");
				worldToCORBASeq.put("boolean", "Control::BooleanSeq");
				worldToCORBASeq.put("string", "Control::StringSeq");
				worldToCORBASeq.put("acstime", "Control::ACSTimeSeq");
				worldToCORBASeq.put("void", "NOTHING");
		
				worldToIDLSeq = new Hashtable();
				worldToIDLSeq.put("byte", "Control::LongSeq");
				worldToIDLSeq.put("ubyte", "Control::LongSeq");
				worldToIDLSeq.put("short", "Control::LongSeq");
				worldToIDLSeq.put("ushort", "Control::LongSeq");
				worldToIDLSeq.put("int", "Control::LongSeq");
				worldToIDLSeq.put("uint", "Control::ULongSeq");
				worldToIDLSeq.put("long", "Control::LongLongSeq");
				worldToIDLSeq.put("ulong", "Control::ULongLongSeq");
				worldToIDLSeq.put("float", "Control::FloatSeq");
				worldToIDLSeq.put("double", "Control::DoubleSeq");
				worldToIDLSeq.put("boolean", "Control::BooleanSeq");
				worldToIDLSeq.put("string", "Control::StringSeq");
				worldToIDLSeq.put("acstime", "Control::ACSTimeSeq");
				worldToIDLSeq.put("void", "NOTHING");
		
				worldToIDL = new Hashtable();
				worldToIDL.put("byte", "long");
				worldToIDL.put("ubyte", "long");
				worldToIDL.put("short", "long");
				worldToIDL.put("ushort", "long");
				worldToIDL.put("int", "long");
				worldToIDL.put("uint", "unsigned long");
				worldToIDL.put("long", "long long");
				worldToIDL.put("ulong", "unsigned long long");
				worldToIDL.put("float", "float");
				worldToIDL.put("double", "double");
				worldToIDL.put("boolean", "boolean");
				worldToIDL.put("string", "string");
				worldToIDL.put("acstime", "ACS::Time");
				worldToIDL.put("void", "void");
		
				worldToDatabase = new Hashtable();
				worldToDatabase.put("byte", "integer");
				worldToDatabase.put("ubyte", "integer");
				worldToDatabase.put("short", "integer");
				worldToDatabase.put("ushort", "integer");
				worldToDatabase.put("int", "integer");
				worldToDatabase.put("uint", "integer");
				worldToDatabase.put("long", "integer");
				worldToDatabase.put("ulong", "integer");
				worldToDatabase.put("float", "float");
				worldToDatabase.put("double", "double");
				worldToDatabase.put("boolean", "boolean");
				worldToDatabase.put("string", "string");
				worldToDatabase.put("acstime", "integer");
				worldToDatabase.put("void", "-none-");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.TABLE__DEP_CHAR:
				return getDepChar();
			case BasePackage.TABLE__CELSIUS_TO_KELVIN:
				return getCelsiusToKelvin();
			case BasePackage.TABLE__SHEET_NAMES:
				return getSheetNames();
			case BasePackage.TABLE__COL_NAMES:
				return getColNames();
			case BasePackage.TABLE__TAG_NAMES:
				return getTagNames();
			case BasePackage.TABLE__TO_CPP:
				return getToCPP();
			case BasePackage.TABLE__TO_IDL:
				return getToIDL();
			case BasePackage.TABLE__TO_IDL_SEQ:
				return getToIDLSeq();
			case BasePackage.TABLE__TO_CORBA:
				return getToCORBA();
			case BasePackage.TABLE__TO_CORBA_SEQ:
				return getToCORBASeq();
			case BasePackage.TABLE__TO_CORBA_DEV_IO:
				return getToCORBADevIO();
			case BasePackage.TABLE__TO_BACI:
				return getToBACI();
			case BasePackage.TABLE__TO_DATABASE:
				return getToDatabase();
			case BasePackage.TABLE__RAW_TO_CPP:
				return getRawToCPP();
			case BasePackage.TABLE__RAW_TO_BYTE_SWAPPED:
				return getRawToByteSwapped();
			case BasePackage.TABLE__RAW_BYTES:
				return getRawBytes();
			case BasePackage.TABLE__WORLD_TO_CPP:
				return getWorldToCPP();
			case BasePackage.TABLE__WORLD_TO_IDL:
				return getWorldToIDL();
			case BasePackage.TABLE__WORLD_TO_IDL_SEQ:
				return getWorldToIDLSeq();
			case BasePackage.TABLE__WORLD_TO_CORBA:
				return getWorldToCORBA();
			case BasePackage.TABLE__WORLD_TO_CORBA_SEQ:
				return getWorldToCORBASeq();
			case BasePackage.TABLE__WORLD_TO_CORBA_DEV_IO:
				return getWorldToCORBADevIO();
			case BasePackage.TABLE__WORLD_TO_BACI:
				return getWorldToBACI();
			case BasePackage.TABLE__WORLD_TO_JAVA:
				return getWorldToJava();
			case BasePackage.TABLE__WORLD_TO_DATABASE:
				return getWorldToDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.TABLE__DEP_CHAR:
				setDepChar((String)newValue);
				return;
			case BasePackage.TABLE__CELSIUS_TO_KELVIN:
				setCelsiusToKelvin((String)newValue);
				return;
			case BasePackage.TABLE__SHEET_NAMES:
				setSheetNames((ArrayList)newValue);
				return;
			case BasePackage.TABLE__COL_NAMES:
				setColNames((ArrayList)newValue);
				return;
			case BasePackage.TABLE__TAG_NAMES:
				setTagNames((ArrayList)newValue);
				return;
			case BasePackage.TABLE__TO_CPP:
				setToCPP((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_IDL:
				setToIDL((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_IDL_SEQ:
				setToIDLSeq((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_CORBA:
				setToCORBA((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_CORBA_SEQ:
				setToCORBASeq((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_CORBA_DEV_IO:
				setToCORBADevIO((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_BACI:
				setToBACI((Hashtable)newValue);
				return;
			case BasePackage.TABLE__TO_DATABASE:
				setToDatabase((Hashtable)newValue);
				return;
			case BasePackage.TABLE__RAW_TO_CPP:
				setRawToCPP((Hashtable)newValue);
				return;
			case BasePackage.TABLE__RAW_TO_BYTE_SWAPPED:
				setRawToByteSwapped((Hashtable)newValue);
				return;
			case BasePackage.TABLE__RAW_BYTES:
				setRawBytes((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_CPP:
				setWorldToCPP((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_IDL:
				setWorldToIDL((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_IDL_SEQ:
				setWorldToIDLSeq((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_CORBA:
				setWorldToCORBA((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_CORBA_SEQ:
				setWorldToCORBASeq((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_CORBA_DEV_IO:
				setWorldToCORBADevIO((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_BACI:
				setWorldToBACI((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_JAVA:
				setWorldToJava((Hashtable)newValue);
				return;
			case BasePackage.TABLE__WORLD_TO_DATABASE:
				setWorldToDatabase((Hashtable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.TABLE__DEP_CHAR:
				setDepChar(DEP_CHAR_EDEFAULT);
				return;
			case BasePackage.TABLE__CELSIUS_TO_KELVIN:
				setCelsiusToKelvin(CELSIUS_TO_KELVIN_EDEFAULT);
				return;
			case BasePackage.TABLE__SHEET_NAMES:
				setSheetNames(SHEET_NAMES_EDEFAULT);
				return;
			case BasePackage.TABLE__COL_NAMES:
				setColNames(COL_NAMES_EDEFAULT);
				return;
			case BasePackage.TABLE__TAG_NAMES:
				setTagNames(TAG_NAMES_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_CPP:
				setToCPP(TO_CPP_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_IDL:
				setToIDL(TO_IDL_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_IDL_SEQ:
				setToIDLSeq(TO_IDL_SEQ_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_CORBA:
				setToCORBA(TO_CORBA_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_CORBA_SEQ:
				setToCORBASeq(TO_CORBA_SEQ_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_CORBA_DEV_IO:
				setToCORBADevIO(TO_CORBA_DEV_IO_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_BACI:
				setToBACI(TO_BACI_EDEFAULT);
				return;
			case BasePackage.TABLE__TO_DATABASE:
				setToDatabase(TO_DATABASE_EDEFAULT);
				return;
			case BasePackage.TABLE__RAW_TO_CPP:
				setRawToCPP(RAW_TO_CPP_EDEFAULT);
				return;
			case BasePackage.TABLE__RAW_TO_BYTE_SWAPPED:
				setRawToByteSwapped(RAW_TO_BYTE_SWAPPED_EDEFAULT);
				return;
			case BasePackage.TABLE__RAW_BYTES:
				setRawBytes(RAW_BYTES_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_CPP:
				setWorldToCPP(WORLD_TO_CPP_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_IDL:
				setWorldToIDL(WORLD_TO_IDL_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_IDL_SEQ:
				setWorldToIDLSeq(WORLD_TO_IDL_SEQ_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_CORBA:
				setWorldToCORBA(WORLD_TO_CORBA_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_CORBA_SEQ:
				setWorldToCORBASeq(WORLD_TO_CORBA_SEQ_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_CORBA_DEV_IO:
				setWorldToCORBADevIO(WORLD_TO_CORBA_DEV_IO_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_BACI:
				setWorldToBACI(WORLD_TO_BACI_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_JAVA:
				setWorldToJava(WORLD_TO_JAVA_EDEFAULT);
				return;
			case BasePackage.TABLE__WORLD_TO_DATABASE:
				setWorldToDatabase(WORLD_TO_DATABASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.TABLE__DEP_CHAR:
				return DEP_CHAR_EDEFAULT == null ? depChar != null : !DEP_CHAR_EDEFAULT.equals(depChar);
			case BasePackage.TABLE__CELSIUS_TO_KELVIN:
				return CELSIUS_TO_KELVIN_EDEFAULT == null ? celsiusToKelvin != null : !CELSIUS_TO_KELVIN_EDEFAULT.equals(celsiusToKelvin);
			case BasePackage.TABLE__SHEET_NAMES:
				return SHEET_NAMES_EDEFAULT == null ? sheetNames != null : !SHEET_NAMES_EDEFAULT.equals(sheetNames);
			case BasePackage.TABLE__COL_NAMES:
				return COL_NAMES_EDEFAULT == null ? colNames != null : !COL_NAMES_EDEFAULT.equals(colNames);
			case BasePackage.TABLE__TAG_NAMES:
				return TAG_NAMES_EDEFAULT == null ? tagNames != null : !TAG_NAMES_EDEFAULT.equals(tagNames);
			case BasePackage.TABLE__TO_CPP:
				return TO_CPP_EDEFAULT == null ? toCPP != null : !TO_CPP_EDEFAULT.equals(toCPP);
			case BasePackage.TABLE__TO_IDL:
				return TO_IDL_EDEFAULT == null ? toIDL != null : !TO_IDL_EDEFAULT.equals(toIDL);
			case BasePackage.TABLE__TO_IDL_SEQ:
				return TO_IDL_SEQ_EDEFAULT == null ? toIDLSeq != null : !TO_IDL_SEQ_EDEFAULT.equals(toIDLSeq);
			case BasePackage.TABLE__TO_CORBA:
				return TO_CORBA_EDEFAULT == null ? toCORBA != null : !TO_CORBA_EDEFAULT.equals(toCORBA);
			case BasePackage.TABLE__TO_CORBA_SEQ:
				return TO_CORBA_SEQ_EDEFAULT == null ? toCORBASeq != null : !TO_CORBA_SEQ_EDEFAULT.equals(toCORBASeq);
			case BasePackage.TABLE__TO_CORBA_DEV_IO:
				return TO_CORBA_DEV_IO_EDEFAULT == null ? toCORBADevIO != null : !TO_CORBA_DEV_IO_EDEFAULT.equals(toCORBADevIO);
			case BasePackage.TABLE__TO_BACI:
				return TO_BACI_EDEFAULT == null ? toBACI != null : !TO_BACI_EDEFAULT.equals(toBACI);
			case BasePackage.TABLE__TO_DATABASE:
				return TO_DATABASE_EDEFAULT == null ? toDatabase != null : !TO_DATABASE_EDEFAULT.equals(toDatabase);
			case BasePackage.TABLE__RAW_TO_CPP:
				return RAW_TO_CPP_EDEFAULT == null ? rawToCPP != null : !RAW_TO_CPP_EDEFAULT.equals(rawToCPP);
			case BasePackage.TABLE__RAW_TO_BYTE_SWAPPED:
				return RAW_TO_BYTE_SWAPPED_EDEFAULT == null ? rawToByteSwapped != null : !RAW_TO_BYTE_SWAPPED_EDEFAULT.equals(rawToByteSwapped);
			case BasePackage.TABLE__RAW_BYTES:
				return RAW_BYTES_EDEFAULT == null ? rawBytes != null : !RAW_BYTES_EDEFAULT.equals(rawBytes);
			case BasePackage.TABLE__WORLD_TO_CPP:
				return WORLD_TO_CPP_EDEFAULT == null ? worldToCPP != null : !WORLD_TO_CPP_EDEFAULT.equals(worldToCPP);
			case BasePackage.TABLE__WORLD_TO_IDL:
				return WORLD_TO_IDL_EDEFAULT == null ? worldToIDL != null : !WORLD_TO_IDL_EDEFAULT.equals(worldToIDL);
			case BasePackage.TABLE__WORLD_TO_IDL_SEQ:
				return WORLD_TO_IDL_SEQ_EDEFAULT == null ? worldToIDLSeq != null : !WORLD_TO_IDL_SEQ_EDEFAULT.equals(worldToIDLSeq);
			case BasePackage.TABLE__WORLD_TO_CORBA:
				return WORLD_TO_CORBA_EDEFAULT == null ? worldToCORBA != null : !WORLD_TO_CORBA_EDEFAULT.equals(worldToCORBA);
			case BasePackage.TABLE__WORLD_TO_CORBA_SEQ:
				return WORLD_TO_CORBA_SEQ_EDEFAULT == null ? worldToCORBASeq != null : !WORLD_TO_CORBA_SEQ_EDEFAULT.equals(worldToCORBASeq);
			case BasePackage.TABLE__WORLD_TO_CORBA_DEV_IO:
				return WORLD_TO_CORBA_DEV_IO_EDEFAULT == null ? worldToCORBADevIO != null : !WORLD_TO_CORBA_DEV_IO_EDEFAULT.equals(worldToCORBADevIO);
			case BasePackage.TABLE__WORLD_TO_BACI:
				return WORLD_TO_BACI_EDEFAULT == null ? worldToBACI != null : !WORLD_TO_BACI_EDEFAULT.equals(worldToBACI);
			case BasePackage.TABLE__WORLD_TO_JAVA:
				return WORLD_TO_JAVA_EDEFAULT == null ? worldToJava != null : !WORLD_TO_JAVA_EDEFAULT.equals(worldToJava);
			case BasePackage.TABLE__WORLD_TO_DATABASE:
				return WORLD_TO_DATABASE_EDEFAULT == null ? worldToDatabase != null : !WORLD_TO_DATABASE_EDEFAULT.equals(worldToDatabase);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DepChar: ");
		result.append(depChar);
		result.append(", CelsiusToKelvin: ");
		result.append(celsiusToKelvin);
		result.append(", sheetNames: ");
		result.append(sheetNames);
		result.append(", colNames: ");
		result.append(colNames);
		result.append(", tagNames: ");
		result.append(tagNames);
		result.append(", toCPP: ");
		result.append(toCPP);
		result.append(", toIDL: ");
		result.append(toIDL);
		result.append(", toIDLSeq: ");
		result.append(toIDLSeq);
		result.append(", toCORBA: ");
		result.append(toCORBA);
		result.append(", toCORBASeq: ");
		result.append(toCORBASeq);
		result.append(", toCORBADevIO: ");
		result.append(toCORBADevIO);
		result.append(", toBACI: ");
		result.append(toBACI);
		result.append(", toDatabase: ");
		result.append(toDatabase);
		result.append(", rawToCPP: ");
		result.append(rawToCPP);
		result.append(", rawToByteSwapped: ");
		result.append(rawToByteSwapped);
		result.append(", rawBytes: ");
		result.append(rawBytes);
		result.append(", worldToCPP: ");
		result.append(worldToCPP);
		result.append(", worldToIDL: ");
		result.append(worldToIDL);
		result.append(", worldToIDLSeq: ");
		result.append(worldToIDLSeq);
		result.append(", worldToCORBA: ");
		result.append(worldToCORBA);
		result.append(", worldToCORBASeq: ");
		result.append(worldToCORBASeq);
		result.append(", worldToCORBADevIO: ");
		result.append(worldToCORBADevIO);
		result.append(", worldToBACI: ");
		result.append(worldToBACI);
		result.append(", worldToJava: ");
		result.append(worldToJava);
		result.append(", worldToDatabase: ");
		result.append(worldToDatabase);
		result.append(')');
		return result.toString();
	}

} //TableImpl
