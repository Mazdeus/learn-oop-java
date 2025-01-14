public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Andika", 17);
//        person1.name = "Andika"; Tidak dibutuhkan lagi karena ada constructor
//        person1.age = 17;
//        person1.country = "India"; // Error

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.country);
        person1.sayHello("Fadhil");
        
        Person person2 = new Person("Aji");
        Person person3;
        person3 = new Person();
        person3.name = "budi";
        person3.sayHello("Fadhil");
    }
}
