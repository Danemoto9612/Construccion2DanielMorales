package app.domain.model;

import java.util.List;

public class Invoice {

    private String idInvoice;
    private String patient;
    private String treatingDocto;
    private double total;
    private double copay;
    private List<ItemOrder> services;

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getTreatingDocto() {
        return treatingDocto;
    }

    public void setTreatingDocto(String treatingDocto) {
        this.treatingDocto = treatingDocto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCopay() {
        return copay;
    }

    public void setCopay(double copay) {
        this.copay = copay;
    }

    public List<ItemOrder> getServices() {
        return services;
    }

    public void setServices(List<ItemOrder> services) {
        this.services = services;
    }
    
}
