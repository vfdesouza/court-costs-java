package model.entities;

public class Vehicle {

    private String automaker, model, color, plate, modelYearOfManufacture;
    private double marketValue;

    public Vehicle() {
    }

    public Vehicle(String automaker, String model, String color, String plate, String modelYearOfManufacture, double marketValue) {
        this.automaker = automaker;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.modelYearOfManufacture = modelYearOfManufacture;
        this.marketValue = marketValue;
    }

    public String getAutomaker() {
        return automaker;
    }

    public void setAutomaker(String automaker) {
        this.automaker = automaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModelYearOfManufacture() {
        return modelYearOfManufacture;
    }

    public void setModelYearOfManufacture(String modelYearOfManufature) {
        this.modelYearOfManufacture = modelYearOfManufature;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
