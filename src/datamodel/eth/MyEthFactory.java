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
package datamodel.eth;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see datamodel.eth.EthPackage
 * @generated
 */
public interface MyEthFactory extends EthFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EthFactory eINSTANCE = datamodel.eth.impl.EthFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Archive ETH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive ETH</em>'.
	 * @generated
	 */
	ArchiveETH createArchiveETH();

	/**
	 * Returns a new object of class '<em>Control ETH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control ETH</em>'.
	 * @generated
	 */
	ControlETH createControlETH();

	/**
	 * Returns a new object of class '<em>Device Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Model</em>'.
	 * @generated
	 */
	DeviceModel createDeviceModel();

	/**
	 * Returns a new object of class '<em>Main ETH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main ETH</em>'.
	 * @generated
	 */
	MainETH createMainETH();

	/**
	 * Returns a new object of class '<em>Mand CETH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mand CETH</em>'.
	 * @generated
	 */
	MandCETH createMandCETH();

	/**
	 * Returns a new object of class '<em>Monitor ETH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor ETH</em>'.
	 * @generated
	 */
	MonitorETH createMonitorETH();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EthPackage getEthPackage();

} //EthFactory
