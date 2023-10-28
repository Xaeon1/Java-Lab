package cars;

import java.util.Scanner;

public class Car {
    private String brand;
    private int speed;
    private float fuel;
    private int mileage;

    public Car(String brand, int speed, float fuel, int mileage) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void accelerate(){

    }

    public void refuel(){
        Scanner scan = new Scanner(System.in);
        float refill = scan.nextFloat();
        if (refill < 0) {
            fuel += refill;
            setFuel(fuel);
        }else {
            System.out.println("Invalid refill input...");
        }

    }

    public void drive(int distance){
        setMileage(mileage + distance);
        setFuel(fuel - (fuel/distance));
    }
}
