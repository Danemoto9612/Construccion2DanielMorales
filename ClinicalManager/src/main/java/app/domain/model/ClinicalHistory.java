//Historia clínica
package app.domain.model;

import java.time.LocalDate;

public class ClinicalHistory {

    private LocalDate date;
    private User ccDoctor;
    private String reason;
    private String simptomatology;
    private Diagnosis diagnosis;
    private Drug drugs;
    private Procedure procedure;
    private DiagnosticTest diagnosticTest;

    public User getCcDoctor() {
        return ccDoctor;
    }

    public void setCcDoctor(User ccDoctor) {
        this.ccDoctor = ccDoctor;
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

    public Drug getDrugs() {
        return drugs;
    }

    public void setDrugs(Drug drugs) {
        this.drugs = drugs;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public DiagnosticTest getDiagnosticTest() {
        return diagnosticTest;
    }

    public void setDiagnosticTest(DiagnosticTest diagnosticTest) {
        this.diagnosticTest = diagnosticTest;
    }
    
}
