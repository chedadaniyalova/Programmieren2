package HaseVererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hase hasi = new Hase("Hasi", 2, 100);

        hasi.schlafen();
        hasi.hoppeln();
        hasi.fressen();

        Weihnachtshase gigi = new Weihnachtshase("Gigi", 8,200);
        gigi.verteileGeschenke();

        Osterhase lola = new Osterhase("Lola", 3,55);
        lola.versteckeOstereier();
        lola.hoppeln();

        //Hasenstahl alle Hasen sollen hoppeln
        Hasenstall h1 = new Hasenstall();
        h1.addHase(gigi);
        h1.addHase(lola);

        h1.hoppelAlle();


        //Eine kleine Party
        System.out.println("\nParty beginnt:");
        ArrayList<GoesToParty> partyPeope = new ArrayList<>();
        partyPeope.add(lola);
        partyPeope.add(gigi);
        partyPeope.add(new Igel());
     //   partyPeope.add(new Hase("Bernhard"));

        for (GoesToParty p: partyPeope){
            p.party("Karottenwasser", "Karottenkuchen");
        }

        //Zuerst wird nach alter aufsteigend sortiert

        Hase hase1 = new Hase("hase1", 6,200);
        Hase hase2 = new Hase("hase2", 9,500);
        Hase hase3 = new Hase("hase3", 2,1000);

        System.out.println("\nHier fangen wir neues Beispiel zum Sortieren an:");
        List <Hase> hasenliste = new ArrayList<>();

        hasenliste.add(hase1);
        hasenliste.add(hase2);
        hasenliste.add(hase3);
        System.out.println(hasenliste);

        System.out.println("\nHier fängt die Sortierung an: ------------------");
        //Hier sortieren wir die Hasen aus der Liste
        Collections.sort(hasenliste); //Die Hasen werden zuerst nach dem Alter aufsteigend sortiert und dann aufsteigend nach der Anzahl von Karotten. z.B wenn alter bei beiden 5 und karotten 200 und 800 nimmt er zuerst den Hasen mit 200 Karotten
        System.out.println(hasenliste);
        //Hasen sortieren nach dem Namen
        Collections.sort(hasenliste, new HasenNamenComperator());
        System.out.println(hasenliste);


    }



}
