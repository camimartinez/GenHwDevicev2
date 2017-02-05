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
package datamodel.amb.impl;

import datamodel.amb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyAmbFactoryImpl extends AmbFactoryImpl implements MyAmbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmbFactory init() {
		try {
			AmbFactory theAmbFactory = (AmbFactory)EPackage.Registry.INSTANCE.getEFactory("http://alma.Control.datamodel.meta.amb/1.0"); 
			if (theAmbFactory != null) {
				return theAmbFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyAmbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmbPackage.ARCHIVE_AMB: return createArchiveAMB();
			case AmbPackage.CONTROL_AMB: return createControlAMB();
			case AmbPackage.DEVICE_MODEL: return createDeviceModel();
			case AmbPackage.MAIN_AMB: return createMainAMB();
			case AmbPackage.MAND_CAMB: return createMandCAMB();
			case AmbPackage.MONITOR_AMB: return createMonitorAMB();
			case AmbPackage.SW_MODULE: return createSWModule();
			case AmbPackage.GENERIC_MONITOR_POINTS: return createGenericMonitorPoints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveAMB createArchiveAMB() {
		ArchiveAMBImpl archiveAMB = new ArchiveAMBImpl();
		return archiveAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB createControlAMB() {
		ControlAMBImpl controlAMB = new ControlAMBImpl();
		return controlAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModel createDeviceModel() {
		DeviceModelImpl deviceModel = new DeviceModelImpl();
		return deviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainAMB createMainAMB() {
		MainAMBImpl mainAMB = new MainAMBImpl();
		return mainAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCAMB createMandCAMB() {
		MandCAMBImpl mandCAMB = new MandCAMBImpl();
		return mandCAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB createMonitorAMB() {
		MonitorAMBImpl monitorAMB = new MonitorAMBImpl();
		return monitorAMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModule createSWModule() {
		SWModuleImpl swModule = new SWModuleImpl();
		return swModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMonitorPoints createGenericMonitorPoints() {
		GenericMonitorPointsImpl genericMonitorPoints = new GenericMonitorPointsImpl();
		return genericMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbPackage getAmbPackage() {
		return (AmbPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AmbPackage getPackage() {
		return AmbPackage.eINSTANCE;
	}

} //AmbFactoryImpl
