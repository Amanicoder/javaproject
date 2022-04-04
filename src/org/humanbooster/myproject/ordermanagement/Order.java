package org.humanbooster.myproject.ordermanagement;

public class Order {
    public String ref;
    private Drink drink;
    private MainCourse mainCourse;
    private Dessert dessert;

    public float totalPrice;

    public Order(String ref) {
        this.ref = ref;
    }

    public Order(String ref, Drink drink, MainCourse mainCourse, Dessert dessert) {
        this.ref = ref;
        this.drink = drink;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public Order(String ref, float totalPrice) {
        this.ref = ref;
        this.totalPrice = getTotalPrice();
    }




    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getTotalPrice() {
        float totalPrice =0;
        totalPrice = drink.getPrice()+mainCourse.getPrice()+dessert.getPrice();
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ref='" + ref + '\'' +
                ", price=" + totalPrice +
                '}';
    }
}
