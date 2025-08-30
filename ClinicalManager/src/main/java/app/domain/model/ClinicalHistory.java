package app.domain.model;

import java.time.LocalDate;

public class ClinicalHistory {
    
    private LocalDate date;
    private final String ccDoctor;
    private String reason;
    private String simptomatology;
    private Diagnosis diagnosis;
    
    public ClinicalHistory(String _ccDoctor) {
        
        this.ccDoctor = _ccDoctor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSimptomatology() {
        return simptomatology;
    }

    public void setSimptomatology(String simptomatology) {
        this.simptomatology = simptomatology;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }
    
}
