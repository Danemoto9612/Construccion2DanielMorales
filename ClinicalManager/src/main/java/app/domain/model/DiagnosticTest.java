package app.domain.model;

import app.domain.model.enums.IdDiagnosticTest;
import app.domain.model.enums.IdSpecialist;

public class DiagnosticTest {
    
    private String diagnosticTestName;
    private int orderNumber;
    private IdDiagnosticTest idDiagnosticTest;
    private int quantify;
    private boolean assitant;
    private IdSpecialist idSpecialist;
    private int itemDiagnosticTest;
    private float cost;

    public String getDiagnosticTestName() {
        return diagnosticTestName;
    }

    public void setDiagnosticTestName(String diagnosticTestName) {
        this.diagnosticTestName = diagnosticTestName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public IdDiagnosticTest getIdDiagnosticTest() {
        return idDiagnosticTest;
    }

    public void setIdDiagnosticTest(IdDiagnosticTest idDiagnosticTest) {
        this.idDiagnosticTest = idDiagnosticTest;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public boolean isAssitant() {
        return assitant;
    }

    public void setAssitant(boolean assitant) {
        this.assitant = assitant;
    }

    public IdSpecialist getIdSpecialist() {
        return idSpecialist;
    }

    public void setIdSpecialist(IdSpecialist idSpecialist) {
        this.idSpecialist = idSpecialist;
    }

    public int getItemDiagnosticTest() {
        return itemDiagnosticTest;
    }

    public void setItemDiagnosticTest(int itemDiagnosticTest) {
        this.itemDiagnosticTest = itemDiagnosticTest;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
