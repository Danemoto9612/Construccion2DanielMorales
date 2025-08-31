//Puerto pacientes
package app.domain.ports;

import app.domain.model.Patient;
import app.domain.model.VitalData;

public interface PatientPort {

    public Patient findByDocument(Patient patient) throws Exception;

    public void save(Patient patient) throws Exception;
    
    public void saveVitalData(VitalData vitalData) throws Exception;
}
