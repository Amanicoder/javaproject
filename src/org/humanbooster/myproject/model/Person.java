package org.humanbooster.myproject.model;

public class Person {
    public String name;
    public int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }


    public void disp(){
        System.out.println("la personne "+ name+ " a "+ age+ " ans ");
    }
    public void addToAge(){
        this.age =this.age +7;;
        System.out.println("la personne "+ name+ " a "+ age+ " ans ");
    }

    public String getStatus(){
        return age>=18 ? "Majeur" : "Mineur";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
