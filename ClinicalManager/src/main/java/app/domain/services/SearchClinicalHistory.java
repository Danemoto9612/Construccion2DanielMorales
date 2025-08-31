//Buscar información del paciente
package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;

public class SearchClinicalHistory {

    private PatientPort patientPort;

    public void searh(Patient patient) throws Exception {

        if (patientPort.findByDocument(patient) == null) {
            throw new Exception("No se encuentra el paciente, rectifique.");
        }
        patientPort.searchHistoryPatient(patient);
    }

}
