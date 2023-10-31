public class VicePresident extends Manager {

    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is Vice President " + this.name);
    }

}