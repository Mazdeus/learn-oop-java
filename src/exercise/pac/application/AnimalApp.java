package exercise.pac.application;

import exercise.pac.data.Animal;
import exercise.pac.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
