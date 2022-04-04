package org.humanbooster.myproject.carproject;

public class CarInfo {
    private String serialNumber;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public CarInfo(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
