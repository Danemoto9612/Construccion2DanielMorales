package app.domain.ports;

import app.domain.model.Patient;
import java.util.Optional;

public interface PatientPort {

    public void save(Patient patient) throws Exception;

    public Optional<Patient> findById(Patient patient) throws Exception;

    public void delete(Patient patient) throws Exception;
}
