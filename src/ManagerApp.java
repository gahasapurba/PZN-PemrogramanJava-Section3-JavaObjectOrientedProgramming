public class ManagerApp {

    public static void main(String[] args) {

        var manager = new Manager("Eko");
        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Joko");
        vicePresident.sayHello("Budi");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicePresident);
        System.out.println(vicePresident.toString());

    }

}