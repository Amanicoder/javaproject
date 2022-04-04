package org.humanbooster.myproject.model;

public class Bike {
    public String model;
    public String color;
    public int size;
    public int price;

    public Bike(String model, int size, String color){
        this.model = model;
        this.size = size;
        this.color = color;
    }
    public Bike(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void display(){
        System.out.println("le vélo "+ model+ " est de couleur "+ color + " et de taille "+size);
    }

    public void comparePrice(Bike bike){
        if(this.price>bike.price){
            System.out.println(this.model +" est plus cher que "+ bike.model);
        } else if (this.price< bike.price){
            System.out.println(this.model +" est moins cher que "+ bike.model);
        }else{
            System.out.println(this.model +" a le même prix que "+ bike.model);
        }
    }
}
