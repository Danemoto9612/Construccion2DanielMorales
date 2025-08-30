//Ordenes
package app.domain.model;

import app.domain.model.enums.IdDiagnosticTest;
import app.domain.model.enums.IdDrug;
import app.domain.model.enums.IdProcedure;
import app.domain.model.enums.IdSpecialist;
import java.time.LocalDate;

public class Order {
    private String orderNumber;
    private Patient patient;
    private User user;
    private LocalDate date;
    private IdDiagnosticTest idDiagnosticTest;
    private IdProcedure idProcedure;
    private IdDrug idDrug;
    private IdSpecialist idSpecialist;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public IdDiagnosticTest getIdDiagnosticTest() {
        return idDiagnosticTest;
    }

    public void setIdDiagnosticTest(IdDiagnosticTest idDiagnosticTest) {
        this.idDiagnosticTest = idDiagnosticTest;
    }

    public IdProcedure getIdProcedure() {
        return idProcedure;
    }

    public void setIdProcedure(IdProcedure idProcedure) {
        this.idProcedure = idProcedure;
    }

    public IdDrug getIdDrug() {
        return idDrug;
    }

    public void setIdDrug(IdDrug idDrug) {
        this.idDrug = idDrug;
    }

    public IdSpecialist getIdSpecialist() {
        return idSpecialist;
    }

    public void setIdSpecialist(IdSpecialist idSpecialist) {
        this.idSpecialist = idSpecialist;
    }
    
}
