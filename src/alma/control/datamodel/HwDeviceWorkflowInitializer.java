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
package alma.control.datamodel;

import java.io.IOException;

import org.eclipse.emf.mwe.core.WorkflowComponentHelper;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.eth.EthFactory;

public class HwDeviceWorkflowInitializer extends AbstractEMFWorkflowComponent{
	private String deviceDir;
	private String spreadsheetDir;
	private String generatedDir;
	private boolean monitorDBOnly;
	private boolean generateAlt;
	private String modelSlot;
	private String deviceTypes = "DEVICE_TYPE";
	private String deviceAMB = "AMB";
	private String deviceETH = "ETH";
	
	public void checkConfiguration(Issues issues) {
		if (!WorkflowComponentHelper.isParamSet(modelSlot)) 
			System.out.println("HwDeviceWorkflowInitializer: model slot not specified");
	}
	
	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues){
		System.out.println("- ----- HwDeviceWorkflowInitializer: invokeInternal started.");
		
		try {
			Runtime.getRuntime().exec("mkdir "+deviceDir+"/xmi");
		} catch (IOException e) {
			System.out.println(e);
		}
		alma.control.datamodel.meta.base.DeviceModel deviceType = null;
		
		if(System.getProperty(deviceTypes).equals(deviceAMB)){
			deviceType= AmbFactory.eINSTANCE.createDeviceModel();
			deviceType.setDeviceModel();
		}else if (System.getProperty(deviceTypes).equals(deviceETH)){
			deviceType = EthFactory.eINSTANCE.createDeviceModel();
			deviceType.setDeviceModel();
		}else{ 
			System.out.println("The device type: "+ System.getProperty(deviceTypes) + "is not supported.");
			return;
		}
	
		deviceType.setCodegenDir(BaseFactory.eINSTANCE.createUtil().getInstallDir());
		deviceType.setDeviceDir(deviceDir);
		deviceType.setDeviceName(System.getProperty("DEVICE_NAME"));
		deviceType.setGeneratedDir(generatedDir);
		deviceType.setSpreadsheetDir(spreadsheetDir);
		deviceType.setMonitorDBOnly(monitorDBOnly);
		deviceType.setGenerateAlt(generateAlt);
		deviceType.setBusType(System.getProperty(deviceTypes));
		deviceType.CreateModel();
		ctx.set(modelSlot, deviceType);
		System.out.println("- ----- HwDeviceWorkflowInitializer: Completed.");
	}

	public void setDeviceDir(String deviceDir) {
		System.out.println("- ----- HwDeviceWorkflowInitializer.setDeviceDir: " + deviceDir);
		this.deviceDir = deviceDir;
	}
	public void setGeneratedDir(String generatedDir) {
		System.out.println("- ----- HwDeviceWorkflowInitializer.setDeviceDir: " + generatedDir);
		this.generatedDir = generatedDir;
	}
	public void setSpreadsheetDir(String spreadsheetDir) {
		System.out.println("- ----- HwDeviceWorkflowInitializer.setDeviceDir: " + spreadsheetDir);
		this.spreadsheetDir = spreadsheetDir;
	}	
	public void setModelSlot(String modelSlot) {
		System.out.println("- ----- HwDeviceWorkflowInitializer.setModelSlot: " + modelSlot);
		this.modelSlot = modelSlot;
	}
	public void setMonitorDBOnly(String monitorDBOnly) {
		System.out.println("- ----- HwDeviceWorkflowInitializer.setMonitorDBOnly: " + monitorDBOnly);
		this.monitorDBOnly = monitorDBOnly.equals("true") ? true : false;
	}
	public void setGenerateAlt(String generateAlt) {
		System.out.println("- ----- HwDeviceWorkflowInitializer.setGenerateAlt = " + generateAlt);
		this.generateAlt = generateAlt.equals("true") ? true : false;;
	}

}
