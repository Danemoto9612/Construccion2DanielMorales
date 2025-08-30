//Crear orden
package app.domain.services;

import app.domain.model.Order;
import app.domain.ports.OrderPort;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.enums.Role;

public class CreateOrder {

    private UserPort userPort;
    private PatientPort patientPort;
    private OrderPort orderPort;

    public void create(Order order) throws Exception {
        User user = userPort.findByDocument(order.getUser());
        if (user == null || !user.getRole().equals(Role.DOCTOR)) {
            throw new Exception("Las ordenes solo las pueden crear Médicos");
        }
        Patient patient = patientPort.findByDocument(order.getPatient());
        if (patient == null) {
            throw new Exception("las ordenes se deben aplicar a pacientes registrados");
        }
        orderPort.save(order);
    }
}
