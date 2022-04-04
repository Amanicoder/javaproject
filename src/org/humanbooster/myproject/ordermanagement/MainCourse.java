package org.humanbooster.myproject.ordermanagement;

public enum MainCourse {
    CHICKEN(5), BEEF(8), SALAD(4);

        private int price;

    MainCourse(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
