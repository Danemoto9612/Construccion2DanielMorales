//Puerto ordenes
package app.domain.ports;

import app.domain.model.Order;
import app.domain.model.Patient;

public interface OrderPort {
    
    public Order findById(Order order) throws Exception;
    public Patient findByPatient(Patient patient) throws Exception;
    public void save(Order order) throws Exception;
}
