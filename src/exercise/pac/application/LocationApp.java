package exercise.pac.application;

import exercise.pac.data.City;
import exercise.pac.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); error

        var city = new City();
        city.nama = "Bandung";
        System.out.println(city.nama);
    }
}
