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
package alma.Control.datamodel.meta.eth.impl;

import alma.Control.datamodel.meta.eth.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;


public class MyEthFactoryImpl extends EFactoryImpl implements EthFactory {
	
	public static EthFactory init() {
		try {
			EthFactory theEthFactory = (EthFactory)EPackage.Registry.INSTANCE.getEFactory("http://alma.Control.datamodel.eth/1.0"); 
			if (theEthFactory != null) {
				return theEthFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EthFactoryImpl();
	}

	
	public MyEthFactoryImpl() {
		super();
	}

	
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EthPackage.ARCHIVE: return createArchive();
			case EthPackage.CONTROL: return createControl();
			case EthPackage.DEVICE_MODEL: return createDeviceModel();
			case EthPackage.MAIN: return createMain();
			case EthPackage.MAND_C: return createMandC();
			case EthPackage.MONITOR: return createMonitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EthPackage.MAND_CETHDT:
				return createMandCETHDTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EthPackage.MAND_CETHDT:
				return convertMandCETHDTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	public DeviceModel createDeviceModel() {
		DeviceModelImpl deviceModel = new DeviceModelImpl();
		return deviceModel;
	}

	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	public MandC createMandC() {
		MandCImpl mandC = new MandCImpl();
		return mandC;
	}

	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	@Override
	public Main createMain(String[] row){
		MainImpl main = new MainImpl(row);
		return main;
	}

	public MandC createMandCETHDTFromString(EDataType eDataType, String initialValue) {
		return (MandC)super.createFromString(eDataType, initialValue);
	}


	public String convertMandCETHDTToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	public EthPackage getEthPackage() {
		return (EthPackage)getEPackage();
	}

	@Deprecated
	public static EthPackage getPackage() {
		return EthPackage.eINSTANCE;
	}

} //MyEthFactoryImpl
