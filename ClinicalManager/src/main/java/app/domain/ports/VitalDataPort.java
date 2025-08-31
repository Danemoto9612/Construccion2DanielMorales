//Puerto información vital
package app.domain.ports;

import app.domain.model.VitalData;

public interface VitalDataPort {
    
    public void save(VitalData vitalData) throws Exception;
    
}
