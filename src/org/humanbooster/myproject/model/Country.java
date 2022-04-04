package org.humanbooster.myproject.model;

public class Country {
    private String nom;
    private String nomCourt;
    private Integer indicatifTelephonique;

    public Country(String nom, String nomCourt, Integer indicatifTelephonique) {
        this.nom = nom;
        this.nomCourt = nomCourt;
        this.indicatifTelephonique = indicatifTelephonique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    public Integer getIndicatifTelephonique() {
        return indicatifTelephonique;
    }

    public void setIndicatifTelephonique(Integer indicatifTelephonique) {
        this.indicatifTelephonique = indicatifTelephonique;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nom='" + nom + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                ", indicatifTelephonique=" + indicatifTelephonique +
                '}';
    }
}
