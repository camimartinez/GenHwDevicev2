/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.amb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see meta.amb.AmbPackage
 * @generated
 */
public interface AmbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmbFactory eINSTANCE = meta.amb.impl.AmbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Archive Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive Impl</em>'.
	 * @generated
	 */
	ArchiveImpl createArchiveImpl();

	/**
	 * Returns a new object of class '<em>Control Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Impl</em>'.
	 * @generated
	 */
	ControlImpl createControlImpl();

	/**
	 * Returns a new object of class '<em>Device Model AMB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Model AMB</em>'.
	 * @generated
	 */
	DeviceModelAMB createDeviceModelAMB();

	/**
	 * Returns a new object of class '<em>Main Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Impl</em>'.
	 * @generated
	 */
	MainImpl createMainImpl();

	/**
	 * Returns a new object of class '<em>Mand CImpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mand CImpl</em>'.
	 * @generated
	 */
	MandCImpl createMandCImpl();

	/**
	 * Returns a new object of class '<em>Monitor Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor Impl</em>'.
	 * @generated
	 */
	MonitorImpl createMonitorImpl();

	/**
	 * Returns a new object of class '<em>SW Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SW Module</em>'.
	 * @generated
	 */
	SWModule createSWModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AmbPackage getAmbPackage();

} //AmbFactory
