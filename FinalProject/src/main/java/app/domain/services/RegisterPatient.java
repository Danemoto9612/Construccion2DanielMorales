package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;

public class RegisterPatient {

    private PatientPort patientPort;
    
    public void register(Patient patient) throws Exception {
        if (patientPort.findById(patient).isPresent()) {
            throw new Exception("Paciente ya existe");
        }
        patientPort.save(patient);
    }
}