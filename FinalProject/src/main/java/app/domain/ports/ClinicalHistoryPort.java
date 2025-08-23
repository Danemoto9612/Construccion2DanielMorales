package app.domain.ports;

import app.domain.model.ClinicalHistory;
import java.util.Optional;

public interface ClinicalHistoryPort {

    public void save(ClinicalHistory clinicalHistory) throws Exception;
    public Optional<ClinicalHistory> findByPatient(ClinicalHistory clinicalHistory);
}
