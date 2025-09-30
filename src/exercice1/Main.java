package exercice1;

public class Main {
    public static void main(String[] args) {
            Logger log1 = Logger.getInstance();
            Logger log2 = Logger.getInstance();
            log1.log("Hello World");
            log2.log("Hello World");
        System.out.println(log1==log2);
        }
}
