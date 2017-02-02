/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see datamodel.amb.AmbPackage
 * @generated
 */
public interface AmbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmbFactory eINSTANCE = datamodel.amb.impl.AmbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Archive AMB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive AMB</em>'.
	 * @generated
	 */
	ArchiveAMB createArchiveAMB();

	/**
	 * Returns a new object of class '<em>Control AMB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control AMB</em>'.
	 * @generated
	 */
	ControlAMB createControlAMB();

	/**
	 * Returns a new object of class '<em>Device Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Model</em>'.
	 * @generated
	 */
	DeviceModel createDeviceModel();

	/**
	 * Returns a new object of class '<em>Main AMB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main AMB</em>'.
	 * @generated
	 */
	MainAMB createMainAMB();

	/**
	 * Returns a new object of class '<em>Mand CAMB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mand CAMB</em>'.
	 * @generated
	 */
	MandCAMB createMandCAMB();

	/**
	 * Returns a new object of class '<em>Monitor AMB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor AMB</em>'.
	 * @generated
	 */
	MonitorAMB createMonitorAMB();

	/**
	 * Returns a new object of class '<em>SW Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SW Module</em>'.
	 * @generated
	 */
	SWModule createSWModule();

	/**
	 * Returns a new object of class '<em>Generic Monitor Points</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Monitor Points</em>'.
	 * @generated
	 */
	GenericMonitorPoints createGenericMonitorPoints();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AmbPackage getAmbPackage();

} //AmbFactory
