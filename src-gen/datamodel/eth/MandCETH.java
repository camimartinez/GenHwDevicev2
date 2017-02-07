/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.eth;

import datamodel.base.Table;

import datamodel.base.impl.BaseFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mand CETH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.eth.MandCETH#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.eth.MandCETH#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.eth.MandCETH#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link datamodel.eth.MandCETH#getAux <em>Aux</em>}</li>
 *   <li>{@link datamodel.eth.MandCETH#getGetInfoFromCol <em>Get Info From Col</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.eth.EthPackage#getMandCETH()
 * @model
 * @generated
 */
public interface MandCETH extends EObject {
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
	 * @see datamodel.eth.EthPackage#getMandCETH_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.eth.MandCETH#getRow <em>Row</em>}' attribute.
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
	 * @see datamodel.eth.EthPackage#getMandCETH_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.eth.MandCETH#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' attribute.
	 * @see #setAssembly(String)
	 * @see datamodel.eth.EthPackage#getMandCETH_Assembly()
	 * @model
	 * @generated
	 */
	String getAssembly();

	/**
	 * Sets the value of the '{@link datamodel.eth.MandCETH#getAssembly <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' attribute.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(String value);

	/**
	 * Returns the value of the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' attribute.
	 * @see #setAux(BaseFactoryImpl)
	 * @see datamodel.eth.EthPackage#getMandCETH_Aux()
	 * @model dataType="datamodel.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getAux();

	/**
	 * Sets the value of the '{@link datamodel.eth.MandCETH#getAux <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' attribute.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(BaseFactoryImpl value);

	/**
	 * Returns the value of the '<em><b>Get Info From Col</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From Col</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From Col</em>' reference.
	 * @see #setGetInfoFromCol(Table)
	 * @see datamodel.eth.EthPackage#getMandCETH_GetInfoFromCol()
	 * @model
	 * @generated
	 */
	Table getGetInfoFromCol();

	/**
	 * Sets the value of the '{@link datamodel.eth.MandCETH#getGetInfoFromCol <em>Get Info From Col</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From Col</em>' reference.
	 * @see #getGetInfoFromCol()
	 * @generated
	 */
	void setGetInfoFromCol(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.assembly = assembly;'"
	 * @generated
	 */
	void setAssemblyName(String assembly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return assembly;'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Address\")];'"
	 * @generated
	 */
	String Address();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"DataType\")];\r\nreturn isDataArray() ? s.substring(0,s.indexOf(\"[\")) : s;'"
	 * @generated
	 */
	String DataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Data Type\")].endsWith(\"]\") ? true : false;'"
	 * @generated
	 */
	boolean isDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isDataArray()) return false;\r\nString s =  row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Data Type\")];\r\nreturn (s.indexOf(\"]\") - s.indexOf(\"[\") == 1) ? true : false;'"
	 * @generated
	 */
	boolean isOpenArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isDataArray()) return \"1\";\r\nString s = row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Data Type\")];\r\nreturn s.substring(s.indexOf(\"[\")+1,s.indexOf(\"]\"));\r\n'"
	 * @generated
	 */
	String getArrayLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCPP().get(DataType());'"
	 * @generated
	 */
	String DataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToIDL().get(DataType());'"
	 * @generated
	 */
	String DataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToIDLSeq().get(DataType());'"
	 * @generated
	 */
	String DataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCORBA().get(DataType());'"
	 * @generated
	 */
	String DataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCORBADevIO().get(DataType());'"
	 * @generated
	 */
	String DataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCORBASeq().get(DataType());'"
	 * @generated
	 */
	String DataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToBACI().get(DataType());'"
	 * @generated
	 */
	String DataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactoryImpl.eINSTANCE.createTable().getToDatabase().get(DataType());'"
	 * @generated
	 */
	String DataToDatabaseType();

} // MandCETH
