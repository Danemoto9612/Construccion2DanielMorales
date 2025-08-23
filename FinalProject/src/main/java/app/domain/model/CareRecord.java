package app.domain.model;

import java.util.List;

public class CareRecord {

    private String idDoctor;
    private String reason;
    private String symptomatology;
    private String diagnosis;
    private List<ItemOrder> drugs;
    private List<ItemOrder> procedures;
    private List<ItemOrder> diagnosticTests;

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSymptomatology() {
        return symptomatology;
    }

    public void setSymptomatology(String symptomatology) {
        this.symptomatology = symptomatology;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<ItemOrder> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<ItemOrder> drugs) {
        this.drugs = drugs;
    }

    public List<ItemOrder> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<ItemOrder> procedures) {
        this.procedures = procedures;
    }

    public List<ItemOrder> getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(List<ItemOrder> diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }
    
}
