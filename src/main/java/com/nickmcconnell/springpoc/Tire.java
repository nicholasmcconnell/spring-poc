package com.nickmcconnell.springpoc;

public class Tire {

    private String brand;

    public Tire(String brand){
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tire{");
        sb.append("brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
