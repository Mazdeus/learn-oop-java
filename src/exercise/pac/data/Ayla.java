package exercise.pac.data;

public class Ayla implements Car{

    public void drive() {
        System.out.println("Ayla driver");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Ayla";
    }

    public boolean isMaintenance() {
        return false;
    }
}
