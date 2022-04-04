package org.humanbooster.myproject.singleton;

public class Printer {
    public static int id;
    public String model;

    public Printer(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void print(){
        //return getModel();
    }

    @Override
    public String toString() {
        return "Printer{" +
                "model='" + model + '\'' +
                '}';
    }


}
