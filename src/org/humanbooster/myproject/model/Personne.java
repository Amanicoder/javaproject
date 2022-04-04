package org.humanbooster.myproject.model;

public class Personne {
    private int age;
    private String nom;
    private String prénom;
    private String status;
    private String adresse;

    public Personne(int age, String nom, String prénom, String status, String adresse) {
        this.age = age;
        this.nom = nom;
        this.prénom = prénom;
        this.status = status;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "age=" + age +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", status='" + status + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void computeStatus(String status) {
        this.status = status;
    }
}
