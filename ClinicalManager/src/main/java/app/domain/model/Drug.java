package app.domain.model;

import app.domain.model.enums.IdDrug;

public class Drug {
    
    private String drugName;
    private int orderNumber;
    private IdDrug idDrug;
    private float quantify;
    private float time;
    private int itemDrug;
    private float cost;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public float getQuantify() {
        return quantify;
    }

    public void setQuantify(float quantify) {
        this.quantify = quantify;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getItemDrug() {
        return itemDrug;
    }

    public void setItemDrug(int itemDrug) {
        this.itemDrug = itemDrug;
    }
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public IdDrug getIdDrug() {
        return idDrug;
    }

    public void setIdDrug(IdDrug idDrug) {
        this.idDrug = idDrug;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
