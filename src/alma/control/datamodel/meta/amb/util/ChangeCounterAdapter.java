package alma.control.datamodel.meta.amb.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;

import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.DeviceModel;
import alma.control.datamodel.meta.amb.Monitor;

public class ChangeCounterAdapter extends AdapterImpl{
	
	public static int monitorCount;

	public int getMonitorCount(){
		return monitorCount;
	}
	//public static int itemCount;
	//public static int addressCount;

	public void notifyChanged(Notification notification){
		//if(notification.getNotifier() instanceof Monitor)
		//super.notifyChanged(notification);
		//monitorCount++;
		
		switch (notification.getFeatureID(DeviceModel.class)){
		case AmbPackage.DEVICE_MODEL__MPOINTS:
			if(notification.getNewValue() != notification.getOldValue())
				System.out.println("mpoints cambio");
			else System.out.println("mpoints no cambio");
		case AmbPackage.MONITOR__DEPENDENTS:	
			if(notification.getNewValue() != notification.getOldValue())
				System.out.println("monitor dependents cambio");
			else System.out.println("monittor dependen no cambio");
			Monitor mp = (Monitor)notification.getOldValue();
			mp.addDependent((Monitor)notification.getNewValue());
			System.out.println("añadio el nuevo valor");
		case AmbPackage.MONITOR__PARENT:
			if(notification.getNewValue() != notification.getOldValue())
				System.out.println("parent cambio");
			else System.out.println("parent no cambio");
		
		}
		
			
		
	}
	

	public boolean isAdapterForType(Object type){
		return type == ChangeCounterAdapter.class;
	}
	
}
