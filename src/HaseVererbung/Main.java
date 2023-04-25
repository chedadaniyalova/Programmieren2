package HaseVererbung;

public class Main {
    public static void main(String[] args) {
        Hase hasi = new Hase("Hasi");

        hasi.schlafen();
        hasi.hoppeln();
        hasi.fressen();

        Weihnachtshase gigi = new Weihnachtshase("Gigi");
        gigi.verteileGeschenke();

        Osterhase lola = new Osterhase("Lola");
        lola.versteckeOstereier();
        lola.hoppeln();

        //Hasenstahl alle Hasen sollen hoppeln
        Hasenstall h1 = new Hasenstall();
        h1.addHase(gigi);
        h1.addHase(lola);

        h1.hoppelAlle();

    }



}
