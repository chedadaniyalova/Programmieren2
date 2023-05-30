package Pruefungsvorbereitung;

public class StaticMethod {
    private int hansi1;
    private int hansi2;
    private static int hansi3 = 3; //Darauf kann die statische methode schon zugreifen
    //Kann man ohne eine Instanz oder Objekt aufrufen
    //Deswegen kann ich auch nicht auf attribute zugreifen (nur auf statische)

    public static int meineMethode (int zahl){
        return hansi3 + zahl;
    }
}
