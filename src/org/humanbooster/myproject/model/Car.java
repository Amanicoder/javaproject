package org.humanbooster.myproject.model;

import java.util.Objects;

public class Car {
    private String colour;
    private String model;
    private String marque;

    public Car(String colour, String model, String marque) {
        this.colour = colour;
        this.model = model;
        this.marque = marque;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(colour, car.colour) && Objects.equals(model, car.model) && Objects.equals(marque, car.marque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, marque);
    }

    @Override
    public String toString() {
        return "Car{" +
                "couleur='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }
}

