package alma.Control.datamodel;

import org.eclipse.emf.mwe.core.WorkflowComponentHelper;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;

import alma.control.datamodel.meta.base.*;


public class HwDeviceWorkflowInitializer extends WorkflowComponentWithModelSlot{
	private String deviceDir;
	private String spreadsheetDir;
	private String generatedDir;
	private boolean monitorDBOnly;
	private boolean generateAlt;
	private String modelSlot;
	private String deviceType = "DEVICE_TYPE";
	private String deviceAMB = "AMB";
	private String deviceETH = "ETH";
	
	public void checkConfiguration(Issues issues){
		super.checkConfiguration(issues);
		if(!WorkflowComponentHelper.isParamSet(modelSlot))
			issues.addError(this, "model slot not specified");
	}

	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		System.out.println("HwDeviceWorkflowInitializer.invoke started.");
		
		alma.control.datamodel.meta.base.impl.DeviceModelImpl devType = null;
		
		if(System.getProperty(deviceType).equals(deviceAMB)){
			devType = new alma.Control.datamodel.meta.amb.impl.MyDeviceModelImpl();
		}else if (System.getProperty(deviceType).equals(deviceETH)){
			devType = new alma.Control.datamodel.meta.eth.impl.MyDeviceModelImpl();
		}else{ 
			System.out.println("The device type: "+System.getProperty(deviceType)+ "is not supported.");
			return;
		}

		devType.setCodegenDir(BaseFactory.eINSTANCE.createUtil().getInstallDir());
		devType.setDeviceDir(deviceDir);
		devType.setDeviceName(System.getProperty("DEVICE_NAME"));
		devType.setGeneratedDir(generatedDir);
		devType.setSpreadsheetDir(spreadsheetDir);
		devType.setMonitorDBOnly(monitorDBOnly);
		devType.setGenerateAlt(generateAlt);
		devType.setBusType(System.getProperty(deviceType));
		devType.CreateModel();
		ctx.set(modelSlot, devType);
		System.out.println("HwDeviceWorkflowInitializer completed.");
	}

	public void setDeviceDir(String deviceDir) {
		System.out.println("HwDeviceWorkflowInitializer.setDeviceDir setDeviceDir = " + deviceDir);
		this.deviceDir = deviceDir;
	}
	public void setGeneratedDir(String generatedDir) {
		System.out.println("HwDeviceWorkflowInitializer.setDeviceDir setGeneratedDir = " + generatedDir);
		this.generatedDir = generatedDir;
	}
	public void setSpreadsheetDir(String spreadsheetDir) {
		System.out.println("HwDeviceWorkflowInitializer.setDeviceDir setSpreadsheetDir = " + spreadsheetDir);
		this.spreadsheetDir = spreadsheetDir;
	}	
	public void setModelSlot(String s) {
		System.out.println("HwDeviceWorkflowInitializer.setModelSlot = " + s);
		this.modelSlot = s;
	}
	public void setMonitorDBOnly(String s) {
		System.out.println("HwDeviceWorkflowInitializer.setMonitorDBOnly = " + s);
		this.monitorDBOnly = s.equals("true") ? true : false;
	}
	public void setGenerateAlt(String s) {
		System.out.println("HwDeviceWorkflowInitializer.setGenerateAlt = " + s);
		this.generateAlt = s.equals("true") ? true : false;;
	}
}
