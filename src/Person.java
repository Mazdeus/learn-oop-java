class Person {
    String name;
    Integer age;
    final String country = "Indonesia";

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    // Constructor tanpa parameter
    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}
