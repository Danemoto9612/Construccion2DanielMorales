//Caso de uso médico
package app.application.usescases;

import app.domain.model.Patient;
import app.domain.services.CreateClinicalHistory;
import app.domain.services.SearchClinicalHistory;

public class DoctorUseCase {

    private CreateClinicalHistory createClinicalHistory;
    private SearchClinicalHistory searchClinicalHistory;

    public void createClinicalHistoryPatiente(Patient patient) throws Exception {
        createClinicalHistory.create(patient);
    }
    
    public void searchClinicalHistoryPatient(Patient patient) throws Exception {
        searchClinicalHistory.searh(patient);
    }
}
