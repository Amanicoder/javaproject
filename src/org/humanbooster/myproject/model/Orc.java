package org.humanbooster.myproject.model;

public class Orc {
    private String name ="NameLess";
    private int health;
    private int force;

    public Orc(int health, int force) {
        this.force = force;
        this.setHealth(health);
    }

    public Orc(String name, int health, int force) {
        this(health, force);
        this.name = name;
    }

    public void attack(Orc o){
        System.out.println("attack ");
        if (o.health<=100){
            o.health= o.health-this.force;
            System.out.println(o.health);
        }else o.health= 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health > 100 ? 100 :health;;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orc{");
        sb.append("name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", force=").append(force);
        sb.append('}');
        return sb.toString();
    }
}
