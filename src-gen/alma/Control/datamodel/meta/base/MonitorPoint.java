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

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.MonitorPoint#getAux <em>Aux</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromAPSpread <em>To Info From AP Spread</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromMPSpread <em>To Info From MP Spread</em>}</li>
 * </ul>
 *
 * @see alma.Control.datamodel.meta.base.BasePackage#getMonitorPoint()
 * @model abstract="true" superTypes="alma.Control.datamodel.meta.base.MandCBase alma.Control.datamodel.meta.amb.ResourceAuxClass"
 * @generated
 */
public interface MonitorPoint extends MandCBase, Resource {
	/**
	 * Returns the value of the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' attribute.
	 * @see #setAux(Resource)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMonitorPoint_Aux()
	 * @model transient="true"
	 * @generated
	 */
	Resource getAux();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MonitorPoint#getAux <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' attribute.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(Resource value);

	/**
	 * Returns the value of the '<em><b>To Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info From AP Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info From AP Spread</em>' reference.
	 * @see #setToInfoFromAPSpread(ArchiveProperty)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMonitorPoint_ToInfoFromAPSpread()
	 * @model
	 * @generated
	 */
	ArchiveProperty getToInfoFromAPSpread();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromAPSpread <em>To Info From AP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info From AP Spread</em>' reference.
	 * @see #getToInfoFromAPSpread()
	 * @generated
	 */
	void setToInfoFromAPSpread(ArchiveProperty value);

	/**
	 * Returns the value of the '<em><b>To Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info From MP Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info From MP Spread</em>' reference.
	 * @see #setToInfoFromMPSpread(Table)
	 * @see alma.Control.datamodel.meta.base.BasePackage#getMonitorPoint_ToInfoFromMPSpread()
	 * @model
	 * @generated
	 */
	Table getToInfoFromMPSpread();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.base.MonitorPoint#getToInfoFromMPSpread <em>To Info From MP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info From MP Spread</em>' reference.
	 * @see #getToInfoFromMPSpread()
	 * @generated
	 */
	void setToInfoFromMPSpread(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Default\")];\r\n'"
	 * @generated
	 */
	String Default();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Error Condition\")];\r\n'"
	 * @generated
	 */
	String ErrorCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Error Severity\")];\r\n'"
	 * @generated
	 */
	String ErrorSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, \"Error Action\")];\r\n'"
	 * @generated
	 */
	String ErrorAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();'"
	 * @generated
	 */
	String APName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();'"
	 * @generated
	 */
	String RefersTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int defaultValue = 300;\r\n\tif(archive != null) {\r\n\t\t\tif ( ((ArchiveProperty)archive).Interval().equals(\"none\") )\r\n\t\t\t\treturn Integer.toString(defaultValue);\r\n\t\t\tint value = Integer.valueOf(((ArchiveProperty)archive).Interval());\r\n\t\t\tif (value &lt;= 0)\r\n\t\t\t\tvalue = defaultValue;\r\n\t\t\treturn Integer.toString(value);\r\n\t\t}\r\n\t\telse\r\n\t\t\treturn Integer.toString(defaultValue);'"
	 * @generated
	 */
	String Interval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\r\n\treturn ((ArchiveProperty)archive).OnlyOnChange();\r\nelse\r\n\treturn false;'"
	 * @generated
	 */
	boolean OnlyOnChange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\r\n\treturn ((ArchiveProperty)archive).DisplayUnits();\r\nelse\r\n\treturn DataUnits();'"
	 * @generated
	 */
	String DisplayUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\r\n\treturn ((ArchiveProperty)archive).GraphMin();\r\nelse\r\n\treturn \"none\";'"
	 * @generated
	 */
	String GraphMin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\r\n\treturn ((ArchiveProperty)archive).GraphMax();\r\nelse\r\n\treturn \"none\";'"
	 * @generated
	 */
	String GraphMax();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\r\n\treturn ((ArchiveProperty)archive).Format();\r\nelse\r\n\treturn \"none\";'"
	 * @generated
	 */
	String Format();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(archive != null)\r\n\treturn ((ArchiveProperty)archive).Title();\r\nelse\r\n\treturn Description();'"
	 * @generated
	 */
	String Title();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return PName();\r\n'"
	 * @generated
	 */
	String MPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return AltPName();\r\n'"
	 * @generated
	 */
	String AltMPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPartOfPattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPartOfHomogeneous();

} // MonitorPoint
