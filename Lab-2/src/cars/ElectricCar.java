package cars;

import java.util.Scanner;

public class ElectricCar extends Car {
    private float batteryLevel;
    private int efficiency;

    public ElectricCar(String brand, int speed, float fuel, int mileage, float batteryLevel, int efficiency) {
        super(brand, speed, fuel, mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }

    public float getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public void charge(){
        Scanner scan = new Scanner(System.in);
        float chargedPercentages = scan.nextFloat();
        setBatteryLevel(batteryLevel + chargedPercentages);
    }

    public void drive(int distance){
        driveElectric(distance);
    }
    private void driveElectric(int distance) {
        setMileage(getMileage() + distance);
        setBatteryLevel(batteryLevel - ((batteryLevel * efficiency)/distance));
    }
}
