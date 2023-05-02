package Hashmap;

import HaseVererbung.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        //wir möchten alle hasen mit einer steuernummer speichern
        //um sie schnell zu finden und korrekt versteuern zu können
        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase("Hansi", 4,88);
        Hase h2 = new Hase("Susi", 2,100);

        //mit put etwas hinein geben
        steuerHasen.put("123H", h1);
        steuerHasen.put("234H", h2);

        //Wert auslesen durch Angabe des Schlüssels
        steuerHasen.get("123H");
        //wenn Schlüssel nicht vorhanden ist kommt null retour
        System.out.println(steuerHasen.get("bloedsinn"));

        //Fragen ob ein Schlüssel in HashMap ist
        System.out.println(steuerHasen.containsKey("123H"));

      //Achtung: nur notfalls machen (ist langsam)
        System.out.println(steuerHasen.containsKey(h1));

        //was passiert jetzt? Hase h2 statt h1 über "123H" abrufbar
        //steuerHasen.put ("123H", h2)

        //über HashMap iterieren
        for (Map.Entry<String, Hase> hase : steuerHasen.entrySet()){
            System.out.println(hase.getKey());
         Hase h = hase.getValue();
         h.hoppeln();
        }
    }
}
