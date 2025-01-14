public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Robot");
        employee.sayHello("Manusia");

        employee = new Manager("Robot");
        employee.sayHello("Manusia");

        employee = new VicePresident("Robot");
        employee.sayHello("Manusia");

        sayHello(new Employee("Robot"));
        sayHello(new Manager("Manusia"));
        sayHello(new VicePresident("Hewan"));
    }
    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
