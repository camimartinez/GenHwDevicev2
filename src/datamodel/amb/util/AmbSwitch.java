/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.util;

import datamodel.amb.*;

import datamodel.base.ArchiveProperty;
import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MandCBase;
import datamodel.base.MonitorPoint;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see datamodel.amb.AmbPackage
 * @generated
 */
public class AmbSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmbPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbSwitch() {
		if (modelPackage == null) {
			modelPackage = AmbPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AmbPackage.ARCHIVE_AMB: {
				ArchiveAMB archiveAMB = (ArchiveAMB)theEObject;
				T result = caseArchiveAMB(archiveAMB);
				if (result == null) result = caseArchiveProperty(archiveAMB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.CONTROL_AMB: {
				ControlAMB controlAMB = (ControlAMB)theEObject;
				T result = caseControlAMB(controlAMB);
				if (result == null) result = caseControlPoint(controlAMB);
				if (result == null) result = caseMandCBase(controlAMB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.DEVICE_MODEL: {
				DeviceModel deviceModel = (DeviceModel)theEObject;
				T result = caseDeviceModel(deviceModel);
				if (result == null) result = caseBase_DeviceModel(deviceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.MAIN_AMB: {
				MainAMB mainAMB = (MainAMB)theEObject;
				T result = caseMainAMB(mainAMB);
				if (result == null) result = caseMainBase(mainAMB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.MAND_CAMB: {
				MandCAMB mandCAMB = (MandCAMB)theEObject;
				T result = caseMandCAMB(mandCAMB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.MONITOR_AMB: {
				MonitorAMB monitorAMB = (MonitorAMB)theEObject;
				T result = caseMonitorAMB(monitorAMB);
				if (result == null) result = caseMonitorPoint(monitorAMB);
				if (result == null) result = caseMandCBase(monitorAMB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.SW_MODULE: {
				SWModule swModule = (SWModule)theEObject;
				T result = caseSWModule(swModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmbPackage.GENERIC_MONITOR_POINTS: {
				GenericMonitorPoints genericMonitorPoints = (GenericMonitorPoints)theEObject;
				T result = caseGenericMonitorPoints(genericMonitorPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive AMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive AMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchiveAMB(ArchiveAMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control AMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control AMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAMB(ControlAMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceModel(DeviceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main AMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main AMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainAMB(MainAMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mand CAMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mand CAMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandCAMB(MandCAMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor AMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor AMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorAMB(MonitorAMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SW Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SW Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSWModule(SWModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Monitor Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Monitor Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMonitorPoints(GenericMonitorPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchiveProperty(ArchiveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mand CBase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mand CBase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandCBase(MandCBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlPoint(ControlPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase_DeviceModel(datamodel.base.DeviceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainBase(MainBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorPoint(MonitorPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //AmbSwitch
