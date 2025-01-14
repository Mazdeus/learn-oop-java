package exercise.pac.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Muhammad";
        first = first + " " + "amadeus";

        System.out.println(first);

        String second = "Muhammad amadeus";
        System.out.println(second);

//        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Muhammad amadeus";
//        System.out.println(second == third);
        System.out.println(second.equals(third));
    }


}
