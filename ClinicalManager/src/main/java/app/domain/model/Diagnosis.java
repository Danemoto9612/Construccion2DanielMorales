//Diagnóstico
package app.domain.model;

public class Diagnosis {

    private boolean drugBool, procedureBool, diagnosticTestBool;
    private HealthInsurance healthInsurance;
    private Drug drug;
    private Procedure procedure;
    private DiagnosticTest diagnosticTest;

    public boolean isDrugBool() {
        return drugBool;
    }

    public void setDrugBool(boolean drugBool) {
        this.drugBool = drugBool;
    }

    public boolean isProcedureBool() {
        return procedureBool;
    }

    public void setProcedureBool(boolean procedureBool) {
        this.procedureBool = procedureBool;
    }

    public boolean isDiagnosticTestBool() {
        return diagnosticTestBool;
    }

    public void setDiagnosticTestBool(boolean diagnosticTestBool) {
        this.diagnosticTestBool = diagnosticTestBool;
    }

    public HealthInsurance getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(HealthInsurance healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
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
