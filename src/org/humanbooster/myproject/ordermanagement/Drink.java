package org.humanbooster.myproject.ordermanagement;

public enum Drink {
        BEER(3), WATER(2), COKE(2);

        private int price;

        Drink(int price) {
        this.price = price;
}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                '}';
    }
}
