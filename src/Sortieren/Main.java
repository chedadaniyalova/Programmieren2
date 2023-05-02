package Sortieren;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Frucht f1 = new Frucht("Mango", 350, true);
        Frucht f2 = new Frucht("Banane", 120, false);
        Frucht f3 = new Frucht("Ananas", 700, true);
        Frucht f4 = new Frucht("Apfel", 200, true);

        Frucht [] fruechteArray = {f1,f2,f3,f4};

        //wirklich noch nicht sortiert
        System.out.println(Arrays.toString(fruechteArray));
        System.out.println("----------");

        //jetzt wird jetzt sortiert
        Arrays.sort(fruechteArray);
        System.out.println(Arrays.toString(fruechteArray));;

        List <Frucht> fruchtListe = new ArrayList<>(); //ArrayList abcasten

        fruchtListe.add(f1);
        fruchtListe.add(f2);
        fruchtListe.add(f3);
        fruchtListe.add(f4);

        System.out.println("_________");
        System.out.println("_________");
        System.out.println(fruchtListe);
        //statt Array.sort
        Collections.sort(fruchtListe);
        System.out.println(fruchtListe);

    }
}
