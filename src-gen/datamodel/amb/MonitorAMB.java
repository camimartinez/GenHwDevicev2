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
package datamodel.amb;

import datamodel.base.MonitorPoint;
import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.base.impl.BaseFactoryImpl;

import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor AMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.MonitorAMB#getAux7 <em>Aux7</em>}</li>
 *   <li>{@link datamodel.amb.MonitorAMB#getMac <em>Mac</em>}</li>
 *   <li>{@link datamodel.amb.MonitorAMB#getAux2 <em>Aux2</em>}</li>
 *   <li>{@link datamodel.amb.MonitorAMB#getAux3 <em>Aux3</em>}</li>
 *   <li>{@link datamodel.amb.MonitorAMB#getToNormalizeData <em>To Normalize Data</em>}</li>
 *   <li>{@link datamodel.amb.MonitorAMB#getGetColumnsCanBeInv <em>Get Columns Can Be Inv</em>}</li>
 *   <li>{@link datamodel.amb.MonitorAMB#getGetInfoMPSheet <em>Get Info MP Sheet</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getMonitorAMB()
 * @model
 * @generated
 */
public interface MonitorAMB extends MonitorPoint {
	/**
	 * Returns the value of the '<em><b>Aux7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux7</em>' attribute.
	 * @see #setAux7(BaseFactoryImpl)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_Aux7()
	 * @model dataType="datamodel.amb.BaseFactoryImpDT"
	 * @generated
	 */
	BaseFactoryImpl getAux7();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getAux7 <em>Aux7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux7</em>' attribute.
	 * @see #getAux7()
	 * @generated
	 */
	void setAux7(BaseFactoryImpl value);

	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(MandCAMB)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_Mac()
	 * @model dataType="datamodel.amb.MandCAMBDT"
	 * @generated
	 */
	MandCAMB getMac();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(MandCAMB value);

	/**
	 * Returns the value of the '<em><b>Aux2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux2</em>' attribute.
	 * @see #setAux2(Iterator)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_Aux2()
	 * @model dataType="datamodel.amb.IteratorDT"
	 * @generated
	 */
	Iterator getAux2();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getAux2 <em>Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux2</em>' attribute.
	 * @see #getAux2()
	 * @generated
	 */
	void setAux2(Iterator value);

	/**
	 * Returns the value of the '<em><b>Aux3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux3</em>' attribute.
	 * @see #setAux3(Resource)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_Aux3()
	 * @model dataType="datamodel.amb.ResourceDT"
	 * @generated
	 */
	Resource getAux3();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getAux3 <em>Aux3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux3</em>' attribute.
	 * @see #getAux3()
	 * @generated
	 */
	void setAux3(Resource value);

	/**
	 * Returns the value of the '<em><b>To Normalize Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Normalize Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Normalize Data</em>' reference.
	 * @see #setToNormalizeData(Util)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_ToNormalizeData()
	 * @model
	 * @generated
	 */
	Util getToNormalizeData();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getToNormalizeData <em>To Normalize Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Normalize Data</em>' reference.
	 * @see #getToNormalizeData()
	 * @generated
	 */
	void setToNormalizeData(Util value);

	/**
	 * Returns the value of the '<em><b>Get Columns Can Be Inv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Columns Can Be Inv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Columns Can Be Inv</em>' reference.
	 * @see #setGetColumnsCanBeInv(Table)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_GetColumnsCanBeInv()
	 * @model
	 * @generated
	 */
	Table getGetColumnsCanBeInv();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getGetColumnsCanBeInv <em>Get Columns Can Be Inv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Columns Can Be Inv</em>' reference.
	 * @see #getGetColumnsCanBeInv()
	 * @generated
	 */
	void setGetColumnsCanBeInv(Table value);

	/**
	 * Returns the value of the '<em><b>Get Info MP Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info MP Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info MP Sheet</em>' reference.
	 * @see #setGetInfoMPSheet(MandCAMB)
	 * @see datamodel.amb.AmbPackage#getMonitorAMB_GetInfoMPSheet()
	 * @model
	 * @generated
	 */
	MandCAMB getGetInfoMPSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.MonitorAMB#getGetInfoMPSheet <em>Get Info MP Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info MP Sheet</em>' reference.
	 * @see #getGetInfoMPSheet()
	 * @generated
	 */
	void setGetInfoMPSheet(MandCAMB value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Can Be Invalid\")];'"
	 * @generated
	 */
	String CanBeInvalid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return CanBeInvalid().equals(\"yes-feStatus\");'"
	 * @generated
	 */
	boolean isFEStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Assembly();'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RCA();'"
	 * @generated
	 */
	String RCA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawDataType();'"
	 * @generated
	 */
	String RawDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.TeRelated();'"
	 * @generated
	 */
	boolean TeRelated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataType();'"
	 * @generated
	 */
	String WorldDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Scale();'"
	 * @generated
	 */
	String Scale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Offset();'"
	 * @generated
	 */
	String Offset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawDataToCPPType();'"
	 * @generated
	 */
	String RawDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCPPType();'"
	 * @generated
	 */
	String WorldDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCORBAType();'"
	 * @generated
	 */
	String WorldDataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToIDLSeqType();'"
	 * @generated
	 */
	String WorldDataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToIDLType();'"
	 * @generated
	 */
	String WorldDataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCORBASeqType();'"
	 * @generated
	 */
	String WorldDataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCORBADevIOType();'"
	 * @generated
	 */
	String WorldDataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToJavaType();'"
	 * @generated
	 */
	String WorldDataToJavaType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToDatabaseType();'"
	 * @generated
	 */
	String WorldDataToDatabaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToBACIType();'"
	 * @generated
	 */
	String WorldDataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isRawDataArray();'"
	 * @generated
	 */
	boolean isRawDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isWorldDataArray();'"
	 * @generated
	 */
	boolean isWorldDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isConversion();'"
	 * @generated
	 */
	boolean isConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isSpecialConversion();'"
	 * @generated
	 */
	boolean isSpecialConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.NumberItemsRawData();'"
	 * @generated
	 */
	String NumberItemsRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.TotalBytesRawData();'"
	 * @generated
	 */
	String TotalBytesRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.NumberRawDataTypeBytes();'"
	 * @generated
	 */
	String NumberRawDataTypeBytes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RCACell();'"
	 * @generated
	 */
	String RCACell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.NumberItemsWorldData();'"
	 * @generated
	 */
	String NumberItemsWorldData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.TeRelatedCell();'"
	 * @generated
	 */
	String TeRelatedCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentGroupBit();'"
	 * @generated
	 */
	boolean isDependentGroupBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentBit();'"
	 * @generated
	 */
	boolean isDependentBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentElement();'"
	 * @generated
	 */
	boolean isDependentElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isByteSwapped();'"
	 * @generated
	 */
	boolean isByteSwapped();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentBitElement();'"
	 * @generated
	 */
	boolean isDependentBitElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentArrayElement();'"
	 * @generated
	 */
	boolean isDependentArrayElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.GetDimension();'"
	 * @generated
	 */
	String getDimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isSingleBit();'"
	 * @generated
	 */
	boolean isSingleBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getBit();'"
	 * @generated
	 */
	String getBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getMask();'"
	 * @generated
	 */
	String getMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getFirstBit();'"
	 * @generated
	 */
	String getFirstBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getLastBit();'"
	 * @generated
	 */
	String getLastBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getGroupMask();'"
	 * @generated
	 */
	String getGroupMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getGroupEnd();'"
	 * @generated
	 */
	String getGroupEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getGroupStart();'"
	 * @generated
	 */
	String getGroupStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawSubArrayEndIndex();'"
	 * @generated
	 */
	String RawSubArrayEndIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawSubArrayStartIndex();'"
	 * @generated
	 */
	String RawSubArrayStartIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isRawSubArray();'"
	 * @generated
	 */
	boolean isRawSubArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToDatabaseTypeUpper1();'"
	 * @generated
	 */
	String WorldDataToDatabaseTypeUpper1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataTypeUpper1();'"
	 * @generated
	 */
	String WorldDataTypeUpper1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), super.MinRange());\r\n'"
	 * @generated
	 */
	String minRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), super.MaxRange());'"
	 * @generated
	 */
	String maxRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactoryImpl.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), super.Default());'"
	 * @generated
	 */
	String Default();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tboolean ret = true;\r\n\t\tif( this.isDependent()) ret = false;\r\n\t\tif( this.getDependents().getResources().isEmpty()) ret = false;\r\n\t\tfor (Iterator<Resource> iter = this.getDependents().getResources().iterator(); iter.hasNext(); ) {\r\n\t\t\tMonitorAMBImpl var = (MonitorAMBImpl) iter.next();\r\n\t\t\tif( var.WorldDataType().compareTo(\"boolean\") != 0 ) ret = false;\r\n\t\t}\r\n\t\treturn ret;'"
	 * @generated
	 */
	boolean isPattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tboolean ret = false;\r\n\t\tif( isDependent() ){\r\n\t\t\tMonitorAMBImpl parent = ((MonitorAMBImpl)this.getParent());\r\n\t\t\tif( parent.isPattern() )\r\n\t\t\t\tret = true;\r\n\t\t}\r\n\t\treturn ret;'"
	 * @generated
	 */
	boolean isPartOfPattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tboolean ret = true;\r\n\t\tString firsttype = null;\r\n\t\tif( hasDependents() ){\r\n\t\t\tfor (Iterator<Resource> iter = this.getDependents().getResources().iterator(); iter.hasNext(); ) {\r\n\t\t\t\tMonitorAMBImpl var = (MonitorAMBImpl) iter.next();\r\n\t\t\t\tif( firsttype == null){\r\n\t\t\t\t\tfirsttype = new String(var.WorldDataType());\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\t}\r\n\t\t\t\tif( var.WorldDataType().compareTo(firsttype) != 0 ) ret = false;\r\n\t\t\t}\r\n\t\t}else{\r\n\t\t\tret = false;\r\n\t\t}\r\n\t\treturn ret;'"
	 * @generated
	 */
	boolean isHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tboolean ret = false;\r\n\t\tif( isDependent() ){\r\n\t\t\tMonitorAMBImpl parent = ((MonitorAMBImpl)this.getParent());\r\n\t\t\tif( parent.isHomogeneous() )\r\n\t\t\t\tret = true;\r\n\t\t}\r\n\t\treturn ret;'"
	 * @generated
	 */
	boolean isPartOfHomogeneous();

} // MonitorAMB
