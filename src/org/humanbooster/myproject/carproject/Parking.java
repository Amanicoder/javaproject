package org.humanbooster.myproject.carproject;

import java.util.ArrayList;

public class Parking {
    private String name;
    private String city;
    private String address;
    private ArrayList<Car2> car2s = new ArrayList<>();

    public void add(Car2 c){
        this.car2s.add(c);
    }

    public ArrayList<Car2> getCars() {
        return car2s;
    }

    public void setCars(ArrayList<Car2> car2s) {
        this.car2s = car2s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Parking(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public long countByBrand(String brand){
        return  this.car2s.stream()
                //.filter(c-> c.getBrand().equals(brand))
                .count();
    }


    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", cars=" + car2s +
                '}';
    }
}
