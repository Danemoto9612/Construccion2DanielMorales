//Caso de uso Admin
package app.application.usescases;

import app.domain.model.Patient;
import app.domain.services.CreatePatient;

public class AdminUseCase {

    private CreatePatient createpatient;

    public void registesPatient(Patient patient) throws Exception {
        createpatient.create(patient);
    }
}
