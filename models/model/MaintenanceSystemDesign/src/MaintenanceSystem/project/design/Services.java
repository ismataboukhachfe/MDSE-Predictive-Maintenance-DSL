package MaintenanceSystem.project.design;

import org.eclipse.emf.ecore.EObject;
import maintenanceSystem.Sensor;  

public class Services {

    public String sensorLabel(EObject self) {
        if (self instanceof Sensor s) {
        	return s.getName();          }
        return "";
    }
}









