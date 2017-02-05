/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.*;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xml.sax.SAXParseException;

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
			BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE.getEFactory("http://alma.Control.datamodel.base/1.0"); 
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
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasePackage.TABLE: return createTable();
			case BasePackage.ARCHIVE_PROPERTY: return createArchiveProperty();
			case BasePackage.NOTE: return createNote();
			case BasePackage.SPREADSHEET_VALIDATOR: return createSpreadsheetValidator();
			case BasePackage.SPREADSHEET_PARSER: return createSpreadsheetParser();
			case BasePackage.UTIL: return createUtil();
			case BasePackage.PAIR: return createPair();
			case BasePackage.SIMPLE_ERROR_HANDLER: return createSimpleErrorHandler();
			case BasePackage.MAIN_BASE: return createMainBase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BasePackage.SIMPLE_ERROR_HANDLER_DT:
				return createSimpleErrorHandlerDTFromString(eDataType, initialValue);
			case BasePackage.ARRAY_LIST:
				return createArrayListFromString(eDataType, initialValue);
			case BasePackage.HASHTABLE:
				return createHashtableFromString(eDataType, initialValue);
			case BasePackage.SAX_PARSE_EXCEPTION_DT:
				return createSAXParseExceptionDTFromString(eDataType, initialValue);
			case BasePackage.STRING3_DT:
				return createString3DTFromString(eDataType, initialValue);
			case BasePackage.STRING2_DT:
				return createString2DTFromString(eDataType, initialValue);
			case BasePackage.STRING1_DT:
				return createString1DTFromString(eDataType, initialValue);
			case BasePackage.SYSTEM_DT:
				return createSystemDTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BasePackage.SIMPLE_ERROR_HANDLER_DT:
				return convertSimpleErrorHandlerDTToString(eDataType, instanceValue);
			case BasePackage.ARRAY_LIST:
				return convertArrayListToString(eDataType, instanceValue);
			case BasePackage.HASHTABLE:
				return convertHashtableToString(eDataType, instanceValue);
			case BasePackage.SAX_PARSE_EXCEPTION_DT:
				return convertSAXParseExceptionDTToString(eDataType, instanceValue);
			case BasePackage.STRING3_DT:
				return convertString3DTToString(eDataType, instanceValue);
			case BasePackage.STRING2_DT:
				return convertString2DTToString(eDataType, instanceValue);
			case BasePackage.STRING1_DT:
				return convertString1DTToString(eDataType, instanceValue);
			case BasePackage.SYSTEM_DT:
				return convertSystemDTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public SpreadsheetValidator createSpreadsheetValidator() {
		SpreadsheetValidatorImpl spreadsheetValidator = new SpreadsheetValidatorImpl();
		return spreadsheetValidator;
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
	public Util createUtil() {
		UtilImpl util = new UtilImpl();
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pair createPair() {
		PairImpl pair = new PairImpl();
		return pair;
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
	public MainBase createMainBase() {
		MainBaseImpl mainBase = new MainBaseImpl();
		return mainBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSimpleErrorHandlerDTFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
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
	public ArrayList createArrayListFromString(EDataType eDataType, String initialValue) {
		return (ArrayList)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable createHashtableFromString(EDataType eDataType, String initialValue) {
		return (Hashtable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashtableToString(EDataType eDataType, Object instanceValue) {
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
	public String[][][] createString3DTFromString(EDataType eDataType, String initialValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString3DTToString(EDataType eDataType, Object instanceValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][] createString2DTFromString(EDataType eDataType, String initialValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString2DTToString(EDataType eDataType, Object instanceValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] createString1DTFromString(EDataType eDataType, String initialValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString1DTToString(EDataType eDataType, Object instanceValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public System createSystemDTFromString(EDataType eDataType, String initialValue) {
		return (System)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemDTToString(EDataType eDataType, Object instanceValue) {
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
	public static BasePackage getPackage() {
		return BasePackage.eINSTANCE;
	}

} //BaseFactoryImpl
