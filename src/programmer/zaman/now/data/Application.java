package programmer.zaman.now.data;

public class Application {

    public static final int PROCESSSORS;

    static {
        System.out.println("Mengakses Class Application");
        PROCESSSORS = Runtime.getRuntime().availableProcessors();
    }

}