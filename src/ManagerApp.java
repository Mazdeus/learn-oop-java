public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Miku");
//        manager.name = "Miku"; Sudah tidak diperlukan
        manager.sayHello("Kotomi");

        var vicePresident = new VicePresident("Malik");
//        vicePresident.name = "Malik"; Sudah tidak diperlukan
        vicePresident.sayHello("Kotomi");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicePresident);
        System.out.println(vicePresident.toString());
    }
}
