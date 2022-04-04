package org.humanbooster.myproject.ordermanagement;

public enum Dessert {
    ICECREAM(3), CHOCOSNACK(4);

    private int price;

    Dessert(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "price=" + price +
                '}';
    }
}
