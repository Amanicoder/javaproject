package org.humanbooster.myproject.carproject;

public class Car2 {
    private int id;
    private static int count;
    private int speed;
    private int maxSpeed;
    private OwnerInfo ownerInfo;
    private CarInfo carInfo;

    public Car2(CarInfo carInfo) {
        this.id= ++count; //gérer l'id
        this.carInfo = carInfo;
    }
    public Car2(int speed, CarInfo carInfo) {
        this(carInfo);
        this.setSpeed(speed);
    }
    public Car2(String serialNumber, String brand, int speed) {
        this(speed, new CarInfo(serialNumber, brand));
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.min(speed, maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String compare(Car2 c1){
        if (this.speed >c1.speed){
            return this.carInfo.getBrand() +"is going faster than "+ c1.carInfo.getBrand();
        }else if (this.speed <c1.speed){
            return this.carInfo.getBrand() +"is going slower than "+ c1.carInfo.getBrand();
        }else {
            return "equal speed";
        }
    }

    public static String compare(Car2 c1, Car2 c2){
        return c1.compare(c2);
    }

    public void accelerate(int speed){
        this.setSpeed(this.speed+ Math.abs(speed));
    }
    public void decelerate(int speed){
        this.speed =(Math.max(0, this.speed- Math.abs(speed)));
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", carInfo=" + carInfo +
                '}';
    }

}
