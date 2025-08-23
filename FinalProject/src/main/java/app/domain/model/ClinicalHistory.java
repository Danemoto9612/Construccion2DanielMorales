package app.domain.model;

import java.util.Map;

public class ClinicalHistory {

    private String idPatient;
    private Map<String, CareRecord> cares;

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public Map<String, CareRecord> getCares() {
        return cares;
    }

    public void setCares(Map<String, CareRecord> cares) {
        this.cares = cares;
    }
    
}
