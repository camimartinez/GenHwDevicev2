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

import datamodel.base.BaseFactory;

import datamodel.base.impl.BaseFactoryImpl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * This is the new Factory class to be used, to create base instances. It inherits from 
 * the generated factory and this factory is bound in the factory_override extension.
 * All overriden code should be defined in this package and instanciated by this factory.
*/

public class MyAmbFactoryImpl extends EFactoryImpl implements AmbFactory {

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

	public MyAmbFactoryImpl() {
		super();
	}

	@Override
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

	public ArchiveAMB createArchiveAMB() {
		ArchiveAMBImpl archiveAMB = new ArchiveAMBImpl();
		return archiveAMB;
	}

	public ControlAMB createControlAMB() {
		ControlAMBImpl controlAMB = new ControlAMBImpl();
		return controlAMB;
	}

	public DeviceModel createDeviceModel() {
		DeviceModelImpl deviceModel = new DeviceModelImpl();
		return deviceModel;
	}

	public MainAMB createMainAMB() {
		MainAMBImpl mainAMB = new MainAMBImpl();
		return mainAMB;
	}

	public MandCAMB createMandCAMB() {
		MandCAMBImpl mandCAMB = new MandCAMBImpl();
		return mandCAMB;
	}

	public MonitorAMB createMonitorAMB() {
		MonitorAMBImpl monitorAMB = new MonitorAMBImpl();
		return monitorAMB;
	}

	public SWModule createSWModule() {
		SWModuleImpl swModule = new SWModuleImpl();
		return swModule;
	}

	public GenericMonitorPoints createGenericMonitorPoints() {
		GenericMonitorPointsImpl genericMonitorPoints = new GenericMonitorPointsImpl();
		return genericMonitorPoints;
	}

	public MandCAMB createMandCAMBDTFromString(EDataType eDataType, String initialValue) {
		return (MandCAMB)super.createFromString(eDataType, initialValue);
	}

	public String convertMandCAMBDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	public BaseFactoryImpl createBaseFactoryImpDTFromString(EDataType eDataType, String initialValue) {
		return (BaseFactoryImpl)super.createFromString(eDataType, initialValue);
	}

	public String convertBaseFactoryImpDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	public BaseFactory createBaseFactoryDTFromString(EDataType eDataType, String initialValue) {
		return (BaseFactory)super.createFromString(eDataType, initialValue);
	}

	public String convertBaseFactoryDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	public Iterator createIteratorDTFromString(EDataType eDataType, String initialValue) {
		return (Iterator)super.createFromString(eDataType, initialValue);
	}

	public String convertIteratorDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	public Resource createResourceDTFromString(EDataType eDataType, String initialValue) {
		return (Resource)super.createFromString(eDataType, initialValue);
	}

	public String convertResourceDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	public AmbPackage getAmbPackage() {
		return (AmbPackage)getEPackage();
	}

	@Deprecated
	public static AmbPackage getPackage() {
		return AmbPackage.eINSTANCE;
	}

} //MyAmbFactoryImpl
