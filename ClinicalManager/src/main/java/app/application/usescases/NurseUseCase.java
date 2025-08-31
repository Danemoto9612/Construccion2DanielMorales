//Caso de uso enfermera
package app.application.usescases;

import app.domain.model.VitalData;
import app.domain.services.CreateVitalData;

public class NurseUseCase {
    
    private CreateVitalData createVitalData;
    
    public void register(VitalData vitalData) throws Exception {
        createVitalData.create(vitalData);
    }
    
}
