//Crear paciente
package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;

public class CreatePatient {

    private PatientPort patientPort;

    public void create(Patient patient) throws Exception {
        if (patientPort.findByDocument(patient) != null) {
            throw new Exception("El paciente ya existe");
        }
        patientPort.save(patient);
    }

}
