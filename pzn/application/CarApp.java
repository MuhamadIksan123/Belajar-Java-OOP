package pzn.application;

import pzn.data.Car;
import pzn.data.Avanza;

public class CarApp {
    public static void main(String[] Args) {
        Car car = new Avanza();
        car.driveCar();
        System.out.println(car.getTier());
        System.out.println(car.isMaintenance());
        car.hasBrand();
    }
}
