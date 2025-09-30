package exercice2_Aeroport;

public class Main {
    public static void main(String[] args) {
        Avion av1 = new Avion("Boeing 300");
        Avion av2 = new Avion("Boeing 400");
        av1.start();
        av2.start();
/*
        System.out.println(av1);
        System.out.println(av2);*/
    }
}
