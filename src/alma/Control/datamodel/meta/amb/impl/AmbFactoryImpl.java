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
package alma.control.datamodel.meta.amb.impl;



import alma.control.datamodel.meta.amb.*;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.impl.BaseFactoryImpl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmbFactoryImpl extends EFactoryImpl implements AmbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmbFactory init() {
		try {
			AmbFactory theAmbFactory = (AmbFactory)EPackage.Registry.INSTANCE.getEFactory(AmbPackage.eNS_URI);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public Control createControl(String[] row, Resource parent) {
		ControlImpl controlAMB = new ControlImpl(row,parent);
		return controlAMB;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public Main createMain(String[] row) {
		MainImpl mainAMB = new MainImpl(row);
		return mainAMB;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MandC createMandC(String[] row, int sheet, MandCBase mcp) {
		MandCImpl mandCAMB = new MandCImpl(row,sheet,mcp);
		return mandCAMB;
	}
	
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public Monitor createMonitor(String[] row, Resource parent) {
		MonitorImpl monitorAMB = new MonitorImpl();
		return monitorAMB;
	}
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmbPackage.ARCHIVE: return createArchive();
			case AmbPackage.CONTROL: return createControl();
			case AmbPackage.DEVICE_MODEL: return createDeviceModel();
			case AmbPackage.MAIN: return createMain();
			case AmbPackage.MAND_C: return createMandC();
			case AmbPackage.MONITOR: return createMonitor();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AmbPackage.MAND_CAMBDT:
				return createMandCAMBDTFromString(eDataType, initialValue);
			case AmbPackage.BASE_FACTORY_IMP_DT:
				return createBaseFactoryImpDTFromString(eDataType, initialValue);
			case AmbPackage.BASE_FACTORY_DT:
				return createBaseFactoryDTFromString(eDataType, initialValue);
			case AmbPackage.ITERATOR_DT:
				return createIteratorDTFromString(eDataType, initialValue);
			case AmbPackage.RESOURCE_DT:
				return createResourceDTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AmbPackage.MAND_CAMBDT:
				return convertMandCAMBDTToString(eDataType, instanceValue);
			case AmbPackage.BASE_FACTORY_IMP_DT:
				return convertBaseFactoryImpDTToString(eDataType, instanceValue);
			case AmbPackage.BASE_FACTORY_DT:
				return convertBaseFactoryDTToString(eDataType, instanceValue);
			case AmbPackage.ITERATOR_DT:
				return convertIteratorDTToString(eDataType, instanceValue);
			case AmbPackage.RESOURCE_DT:
				return convertResourceDTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
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
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC createMandC() {
		MandCImpl mandC = new MandCImpl();
		return mandC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
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
	public MandC createMandCAMBDTFromString(EDataType eDataType, String initialValue) {
		return (MandC)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMandCAMBDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl createBaseFactoryImpDTFromString(EDataType eDataType, String initialValue) {
		return (BaseFactoryImpl)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseFactoryImpDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory createBaseFactoryDTFromString(EDataType eDataType, String initialValue) {
		return (BaseFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseFactoryDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator createIteratorDTFromString(EDataType eDataType, String initialValue) {
		return (Iterator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIteratorDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceDTFromString(EDataType eDataType, String initialValue) {
		return (Resource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	@Deprecated
	public static AmbPackage getPackage() {
		return AmbPackage.eINSTANCE;
	}

} //AmbFactoryImpl
