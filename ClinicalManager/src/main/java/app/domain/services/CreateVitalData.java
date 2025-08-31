//Crear información vital
package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.domain.ports.VitalDataPort;
import app.domain.model.VitalData;

public class CreateVitalData {

    private VitalDataPort vitalDataPort;
    private PatientPort patientPort;

    public void create(VitalData vitalData) throws Exception {

        Patient patient = patientPort.findByDocument(vitalData.getPatient());
        if (patient == null) {
            throw new Exception("Los datos vitales deben estar asociado a un paciente");
        }
        vitalDataPort.save(vitalData);
        patientPort.saveVitalData(vitalData);
    }

}
