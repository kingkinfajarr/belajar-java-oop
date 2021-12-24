package kingkinfajarr.application;

import kingkinfajarr.data.Avanza;
import kingkinfajarr.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
