package com.example.carmodel;

public class CarDetails {

     private String make,year,color;
     private Double purchase_price,engine_size;

    public CarDetails(String make, String year, String color, Double purchase_price, Double engine_size) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.purchase_price = purchase_price;
        this.engine_size = engine_size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Double getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(Double engine_size) {
        this.engine_size = engine_size;
    }
}

