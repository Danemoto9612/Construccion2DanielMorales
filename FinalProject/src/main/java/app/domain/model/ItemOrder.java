package app.domain.model;

public class ItemOrder {

    private String type;
    private String name;
    private int quantify;
    private double cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
