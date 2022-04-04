package org.humanbooster.myproject.model;

public class Computer {
    private String modele;
    private int frequency;

    public Computer(String modele, int frequency) {
        this.modele = modele;
        this.frequency = frequency;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "modele=" + modele +
                ", frequency=" + frequency +
                '}';
    }
}
