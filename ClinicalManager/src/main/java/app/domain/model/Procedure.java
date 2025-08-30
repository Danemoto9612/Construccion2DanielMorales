//Procedimientos
package app.domain.model;

import app.domain.model.enums.IdProcedure;
import app.domain.model.enums.IdSpecialist;

public class Procedure {
    
    private String procedureName;
    private int orderNumber;
    private IdProcedure idProcedure;
    private int quantify;
    private int frecuency;
    private boolean assitant;
    private IdSpecialist idSpecialist;
    private int itemProcedure;
    private float cost;
    private Order order;

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public IdProcedure getIdProcedure() {
        return idProcedure;
    }

    public void setIdProcedure(IdProcedure idProcedure) {
        this.idProcedure = idProcedure;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public int getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(int frecuency) {
        this.frecuency = frecuency;
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

    public int getItemProcedure() {
        return itemProcedure;
    }

    public void setItemProcedure(int itemProcedure) {
        this.itemProcedure = itemProcedure;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
}
