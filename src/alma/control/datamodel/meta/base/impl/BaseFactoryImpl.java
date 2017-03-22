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

import alma.control.datamodel.meta.base.*;
import alma.control.datamodel.meta.eth.MandC;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

import alma.control.datamodel.meta.base.ArchiveProperty;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.ControlPoint;
import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SimpleErrorHandler;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseFactory init() {
		try {
			BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE.getEFactory(BasePackage.eNS_URI);
			if (theBaseFactory != null) {
				return theBaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasePackage.ARCHIVE_PROPERTY: return createArchiveProperty();
			case BasePackage.NOTE: return createNote();
			case BasePackage.SIMPLE_ERROR_HANDLER: return createSimpleErrorHandler();
			case BasePackage.SPREADSHEET_PARSER: return createSpreadsheetParser();
			case BasePackage.SPREADSHEET_VALIDATOR: return createSpreadsheetValidator();
			case BasePackage.TABLE: return createTable();
			case BasePackage.UTIL: return createUtil();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BasePackage.CONTROL_POINT_DT:
				return createControlPointDTFromString(eDataType, initialValue);
			case BasePackage.ARRAY_LIST:
				return createArrayListFromString(eDataType, initialValue);
			case BasePackage.HASHTABLE:
				return createHashtableFromString(eDataType, initialValue);
			case BasePackage.MONITOR_POINT_DT:
				return createMonitorPointDTFromString(eDataType, initialValue);
			case BasePackage.ARCHIVE_PROPERTY_DT:
				return createArchivePropertyDTFromString(eDataType, initialValue);
			case BasePackage.SIMPLE_ERROR_HANDLER_DT:
				return createSimpleErrorHandlerDTFromString(eDataType, initialValue);
			case BasePackage.MAND_CBASE_DT:
				return createMandCBaseDTFromString(eDataType, initialValue);
			case BasePackage.RUNTIME_EXCEPTION_DT:
				return createRuntimeExceptionDTFromString(eDataType, initialValue);
			case BasePackage.ERROR_HANDLER_DT:
				return createErrorHandlerDTFromString(eDataType, initialValue);
			case BasePackage.SAX_PARSE_EXCEPTION_DT:
				return createSAXParseExceptionDTFromString(eDataType, initialValue);
			case BasePackage.ESTRING_ARRAY:
				return createEStringArrayFromString(eDataType, initialValue);
			case BasePackage.ESTRING_ARRAY3:
				return createEStringArray3FromString(eDataType, initialValue);
			case BasePackage.ESTRING_ARRAY2:
				return createEStringArray2FromString(eDataType, initialValue);
			case BasePackage.MAND_CETHDT:
				return createMandCETHDTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BasePackage.CONTROL_POINT_DT:
				return convertControlPointDTToString(eDataType, instanceValue);
			case BasePackage.ARRAY_LIST:
				return convertArrayListToString(eDataType, instanceValue);
			case BasePackage.HASHTABLE:
				return convertHashtableToString(eDataType, instanceValue);
			case BasePackage.MONITOR_POINT_DT:
				return convertMonitorPointDTToString(eDataType, instanceValue);
			case BasePackage.ARCHIVE_PROPERTY_DT:
				return convertArchivePropertyDTToString(eDataType, instanceValue);
			case BasePackage.SIMPLE_ERROR_HANDLER_DT:
				return convertSimpleErrorHandlerDTToString(eDataType, instanceValue);
			case BasePackage.MAND_CBASE_DT:
				return convertMandCBaseDTToString(eDataType, instanceValue);
			case BasePackage.RUNTIME_EXCEPTION_DT:
				return convertRuntimeExceptionDTToString(eDataType, instanceValue);
			case BasePackage.ERROR_HANDLER_DT:
				return convertErrorHandlerDTToString(eDataType, instanceValue);
			case BasePackage.SAX_PARSE_EXCEPTION_DT:
				return convertSAXParseExceptionDTToString(eDataType, instanceValue);
			case BasePackage.ESTRING_ARRAY:
				return convertEStringArrayToString(eDataType, instanceValue);
			case BasePackage.ESTRING_ARRAY3:
				return convertEStringArray3ToString(eDataType, instanceValue);
			case BasePackage.ESTRING_ARRAY2:
				return convertEStringArray2ToString(eDataType, instanceValue);
			case BasePackage.MAND_CETHDT:
				return convertMandCETHDTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty createArchiveProperty() {
		ArchivePropertyImpl archiveProperty = new ArchivePropertyImpl();
		return archiveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleErrorHandler createSimpleErrorHandler() {
		SimpleErrorHandlerImpl simpleErrorHandler = new SimpleErrorHandlerImpl();
		return simpleErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser createSpreadsheetParser() {
		SpreadsheetParserImpl spreadsheetParser = new SpreadsheetParserImpl();
		return spreadsheetParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator createSpreadsheetValidator() {
		SpreadsheetValidatorImpl spreadsheetValidator = new SpreadsheetValidatorImpl();
		return spreadsheetValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util createUtil() {
		UtilImpl util = new UtilImpl();
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint createControlPointDTFromString(EDataType eDataType, String initialValue) {
		return (ControlPoint)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlPointDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public ArrayList createArrayListFromString(EDataType eDataType, String initialValue) {
		ArrayList list = new ArrayList();
		for (int i =0 ; i< initialValue.length() ; i++){
			list.add(initialValue.split("@"));
		}
		return list;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String convertArrayListToString(EDataType eDataType, Object instanceValue) {
		ArrayList arrayList = (ArrayList)instanceValue;
		StringBuilder sb = new StringBuilder();
		for(int i =0 ; i< arrayList.size() ; i++){
			sb.append(arrayList);
			if(i < arrayList.size()-1){
				sb.append("@");
			}
		}
	
		return sb.toString();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public Hashtable createHashtableFromString(EDataType eDataType, String initialValue) {
		Hashtable ht = new Hashtable();
		for(int i=0 ; i<initialValue.length() ; i++){
			String[] s = initialValue.split("@");
			ht.put(s[i], s[i+1]);
			
		}
		return ht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String convertHashtableToString(EDataType eDataType, Object instanceValue) {
		String sep = "@";
		StringBuilder sb = new StringBuilder();
		Hashtable has = (Hashtable)instanceValue;
		Set<String> keys = has.keySet();
		for(String key : keys){
			sb.append(key+has.get(key)+sep);
		}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint createMonitorPointDTFromString(EDataType eDataType, String initialValue) {
		return (MonitorPoint)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitorPointDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty createArchivePropertyDTFromString(EDataType eDataType, String initialValue) {
		return (ArchiveProperty)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchivePropertyDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleErrorHandler createSimpleErrorHandlerDTFromString(EDataType eDataType, String initialValue) {
		return (SimpleErrorHandler)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleErrorHandlerDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase createMandCBaseDTFromString(EDataType eDataType, String initialValue) {
		return (MandCBase)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMandCBaseDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeException createRuntimeExceptionDTFromString(EDataType eDataType, String initialValue) {
		return (RuntimeException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuntimeExceptionDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandler createErrorHandlerDTFromString(EDataType eDataType, String initialValue) {
		return (ErrorHandler)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorHandlerDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAXParseException createSAXParseExceptionDTFromString(EDataType eDataType, String initialValue) {
		return (SAXParseException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAXParseExceptionDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] createEStringArray3FromString(EDataType eDataType, String initialValue) {
		return (String[][][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringArray3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][] createEStringArray2FromString(EDataType eDataType, String initialValue) {
		return (String[][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringArray2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String[] createEStringArrayFromString(EDataType eDataType, String initialValue) {
		return initialValue.split("@");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String convertEStringArrayToString(EDataType eDataType, Object instanceValue) {
		String[] array = (String[])instanceValue;
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i< array.length ; i++){
			sb.append(array[i]);
			if(i < array.length-1){
				sb.append("@");
			}
		}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC createMandCETHDTFromString(EDataType eDataType, String initialValue) {
		return (MandC)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMandCETHDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePackage getBasePackage() {
		return (BasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackage getPackage() {
		return BasePackage.eINSTANCE;
	}

} //BaseFactoryImpl
