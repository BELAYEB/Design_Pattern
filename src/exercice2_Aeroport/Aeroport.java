package exercice2_Aeroport;

public class Aeroport {
    private static Aeroport instance;

    private Aeroport() {
        System.out.println("Creating Aeroport instance");
    }

    public static synchronized Aeroport getInstance() {
        if (instance == null) {
            try{
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            instance = new Aeroport();
        }
        return instance;
    }
}
