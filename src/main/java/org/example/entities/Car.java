package org.example.entities;

public class Car {

    private  int id;
    private  String brand;
    private  String model;
    private double unitPrice;

    public Car() {
    }

    public Car(int id, String brand, String model, double unitPrice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
