package exercise.pac.application;

import exercise.pac.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld(){
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld(){
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Juan");

        indonesia.sayHello();
        indonesia.sayHello("Dika");
    }
}
