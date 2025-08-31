//Crear información vital
package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;

public class CreateVitalData {

    private PatientPort patientPort;

    public void create(Patient patient) throws Exception {

        if (patientPort.findByDocument(patient) == null) {
            throw new Exception("Los datos vitales deben estar asociado a un paciente");
        }
        patientPort.saveVitalData(patient);
    }

}
