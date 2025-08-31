//Creaer historia clínica
package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;

public class CreateClinicalHistory {

    private PatientPort patientPort;

    public void create(Patient patient) throws Exception {
        
        if (patientPort.findByDocument(patient) == null) {
            throw new Exception("Las historias clínicas deben estar asociadas a un paciente");
        }
        patientPort.save(patient);
    }
}
