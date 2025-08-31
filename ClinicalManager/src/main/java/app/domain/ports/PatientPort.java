//Puerto pacientes
package app.domain.ports;

import app.domain.model.Patient;

public interface PatientPort {

    public Patient findByDocument(Patient patient) throws Exception;

    public void save(Patient patient) throws Exception;
    
    public void saveVitalData(Patient patient) throws Exception;
    
    public Patient searchHistoryPatient(Patient patient) throws Exception;
}
