package exercise.pac.application;

import exercise.pac.data.Ayla;
import exercise.pac.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Ayla();
        System.out.println(car.getTier());
        car.drive();
    }
}
