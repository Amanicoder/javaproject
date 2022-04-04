package org.humanbooster.myproject.model;

public class City {
    private String name;
    private String country;
    private Double population;
    private boolean capital;
    private String category;

    public City(String name, String country, Double population, boolean capital) {
        this.name = name;
        this.country = country;
        this.setPopulation(population);
        this.capital = capital;
    }

    public String makeCompare(City c){
        String msg;
        if (c.population<this.population){
            msg = "The population of " + c.name +" is smaller than "+ this.name;
            return msg;
        }else if (c.population>this.population){

            msg = "The population of " + c.name  +" is bigger than "+ this.name;
            return msg;
        }else {
            msg = "The population of " + c.name +" is the same as "+ this.name;
            return msg;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
        if (capital){
            this.category = this.population>7 ? "big": "small";
        }else {
            this.category = this.population>6 ? "big": "small";
        }
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public String getCategory() {
        return this.category;
    }


    @Override
    public String toString() {
        return "City{" +
                "name= " + name +
                ", country= " + country +
                ", population= " + population +
                ", capital= " + capital +
                ", category= " + category +
                '}';
    }

}
