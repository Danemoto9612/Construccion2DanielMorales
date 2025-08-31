//Caso de uso enfermera
package app.application.usescases;

import app.domain.model.Patient;
import app.domain.services.CreateVitalData;

public class NurseUseCase {
    
    private CreateVitalData createVitalData;
    
    public void register(Patient patient) throws Exception {
        createVitalData.create(patient);
    }
    
}
