package app.domain.ports;

import app.domain.model.EmergencyContact;

public interface EmergencyContactPort {

    public void save(EmergencyContact emergencyContact) throws Exception;

    public EmergencyContact findByName(EmergencyContact emergencyContact) throws Exception;
}
