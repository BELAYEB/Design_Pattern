package exercice2_Aeroport;

import javax.crypto.spec.PSource;

public class Avion extends Thread{
    private Aeroport aeroport;
    private String model;

    public Avion(String model){
        this.model=model;
    }



    public String getModel() {
        return model;
    }

    @Override
    public void run() {
        aeroport = Aeroport.getInstance();
        System.out.println("Avion :" + model + "Aeroport "+aeroport);

    }

    @Override
    public String toString() {
        return "Avion{" +
                "aeroport=" + aeroport +
                ", model='" + model + '\'' +
                '}';
    }


}
