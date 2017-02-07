/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
public interface EthFactory extends EFactory {
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
