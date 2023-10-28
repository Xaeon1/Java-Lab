import cars.Car;
import cars.ElectricCar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        DISCLAIMER: I have no idea how cars work so
                    calculations might be total bs!
                    (Especially for electric cars)
         */

        List<Car> carList = new ArrayList<>();

        Car c1 = new Car("Ford", 144, 100, 0);
        Car c2 = new ElectricCar("Tesla", 124, 50, 0, 100, 40);

        carList.add(c1);
        carList.add(c2);

        for (Car c: carList) {
            if (c instanceof ElectricCar){
                c.drive(300);
                System.out.println(c.getMileage());
            }else {
                c.drive(250);
                System.out.println(c.getMileage());
            }
        }
    }
}