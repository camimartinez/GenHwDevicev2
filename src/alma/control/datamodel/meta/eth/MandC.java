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
package alma.control.datamodel.meta.eth;

import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mand C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.eth.MandC#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.MandC#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.MandC#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.MandC#getMcp <em>Mcp</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.MandC#getTables <em>Tables</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.MandC#getUtils <em>Utils</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC()
 * @model
 * @generated
 */
public interface MandC extends EObject {
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
	 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC_Row()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.MandC#getRow <em>Row</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.MandC#getSheet <em>Sheet</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC_Assembly()
	 * @model
	 * @generated
	 */
	String getAssembly();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.MandC#getAssembly <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' attribute.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(String value);

	/**
	 * Returns the value of the '<em><b>Mcp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcp</em>' reference.
	 * @see #setMcp(MandCBase)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC_Mcp()
	 * @model
	 * @generated
	 */
	MandCBase getMcp();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.MandC#getMcp <em>Mcp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcp</em>' reference.
	 * @see #getMcp()
	 * @generated
	 */
	void setMcp(MandCBase value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference.
	 * @see #setTables(Table)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC_Tables()
	 * @model
	 * @generated
	 */
	Table getTables();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.MandC#getTables <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(Table value);

	/**
	 * Returns the value of the '<em><b>Utils</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utils</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utils</em>' reference.
	 * @see #setUtils(Util)
	 * @see alma.control.datamodel.meta.eth.EthPackage#getMandC_Utils()
	 * @model
	 * @generated
	 */
	Util getUtils();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.eth.MandC#getUtils <em>Utils</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utils</em>' reference.
	 * @see #getUtils()
	 * @generated
	 */
	void setUtils(Util value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Address\")];'"
	 * @generated
	 */
	String Address();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[table.getColNum(sheet, \"DataType\")];\nreturn isDataArray() ? s.substring(0,s.indexOf(\"[\")) : s;'"
	 * @generated
	 */
	String DataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[table.getColNum(sheet, \"Data Type\")].endsWith(\"]\") ? true : false;'"
	 * @generated
	 */
	boolean isDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isDataArray()) return false;\nString s =  row[table.getColNum(sheet, \"Data Type\")];\nreturn (s.indexOf(\"]\") - s.indexOf(\"[\") == 1) ? true : false;'"
	 * @generated
	 */
	boolean isOpenArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isDataArray()) return \"1\";\nString s = row[table.getColNum(sheet, \"Data Type\")];\nreturn s.substring(s.indexOf(\"[\")+1,s.indexOf(\"]\"));'"
	 * @generated
	 */
	String getArrayLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToCPP().get(DataType());'"
	 * @generated
	 */
	String DataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToIDL().get(DataType());'"
	 * @generated
	 */
	String DataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToIDLSeq().get(DataType());'"
	 * @generated
	 */
	String DataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToCORBA().get(DataType());'"
	 * @generated
	 */
	String DataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToCORBADevIO().get(DataType());'"
	 * @generated
	 */
	String DataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToCORBASeq().get(DataType());'"
	 * @generated
	 */
	String DataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToBACI().get(DataType());'"
	 * @generated
	 */
	String DataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)table.getToDatabase().get(DataType());'"
	 * @generated
	 */
	String DataToDatabaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.tables = tables;\nthis.utils = utils;\nthis.row = row;\nthis.sheet = sheet;'"
	 * @generated
	 */
	void setMandCEth(String[] row, int sheet, Table tables, Util utils);

} // MandC
