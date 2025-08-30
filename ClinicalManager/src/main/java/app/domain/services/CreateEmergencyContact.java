//Crear contacto de emergencia
package app.domain.services;

import app.domain.model.EmergencyContact;
import app.domain.ports.EmergencyContactPort;

public class CreateEmergencyContact {

    private EmergencyContactPort emergencyContactPort;

    public void create(EmergencyContact emergencyContact) throws Exception {
        if (emergencyContact.getFullName().equals("") || emergencyContact.getEmergencyPhone().equals("") || 
                emergencyContact.getRelationship().equals("")) {
            throw new Exception("Recuerde ingresar datos del contacto");
        }
            emergencyContactPort.save(emergencyContact);
    }
}
