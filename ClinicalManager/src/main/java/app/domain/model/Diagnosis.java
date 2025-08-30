package app.domain.model;

public class Diagnosis {

    private boolean drugs, procedures, diagnosticTest;
    private HealthInsurance healthInsurance;
    private String drugName, procedureName, diagnosticName;
    private float cost, quantify;

    public boolean isDrugs() {
        return drugs;
    }

    public void setDrugs(boolean drugs) {
        this.drugs = drugs;
    }

    public boolean isProcedures() {
        return procedures;
    }

    public void setProcedures(boolean procedures) {
        this.procedures = procedures;
    }

    public boolean isDiagnosticTest() {
        return diagnosticTest;
    }

    public void setDiagnosticTes(boolean diagnosticTest) {
        this.diagnosticTest = diagnosticTest;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getQuantify() {
        return quantify;
    }

    public void setQuantify(float quantify) {
        this.quantify = quantify;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getDiagnosticName() {
        return diagnosticName;
    }

    public void setDiagnosticName(String diagnosticName) {
        this.diagnosticName = diagnosticName;
    }

    public HealthInsurance getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(HealthInsurance healthInsurance) {
        this.healthInsurance = healthInsurance;
    }
    
}
