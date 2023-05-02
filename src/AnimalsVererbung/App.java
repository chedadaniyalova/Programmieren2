package AnimalsVererbung;

public class App {
    public static void main(String[] args) {

        //Statische Attribute können ohne Objekt oder Instanz vewendet werden
        System.out.println(Dog.latinName);
        Dog.printlatinName();

        Beagle snoopy = new Beagle("Snoopy", 30, "Lasagne");
        snoopy.eatsloveFood();
        snoopy.bark("auuuu");

        Dog d = new Dog("Baxter", 7);
        d.bark("wuff wuff");

        Beagle freddie = new Beagle("Freddie", 5, "Gulasch");
        Dog doggo = freddie;


        //bellt wie ein beagle da eine beagle Instanz auf der Dog Referenz ist
        doggo.bark("wuff");

        //downcasting (Achtung Gefährlich :))
        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");

        //wir möchten sein Lieblingsessen wissen
        Beagle b1 = (Beagle) doggo2;
        b1.eatsloveFood();

        Dog d1 = new Beagle("Hundi", 5, "Pizza");
        d1.bark("wuff wuff");


        KommisarRex kr = new KommisarRex(5);
        kr.bark("wuff"); //kr Instanz ruft Implementation in Babisklasse auf

        //upcasten: Ojekt einer Kindklasse wird auf Referenz der Basisklasse gespeichert

        Dog d2 = kr;
        //bellt wie ein Dog
        //bellt gleich unabhänig davon ob ich über d2 oder kr aufrufe
        //dahinter ist ja das gleiche Objekt

        d2.bark("wuuff wuff wufff wuff"); //ruft hier eig die Methode aus Klasse KommisarRex auf. Aber diese wurde in dieser Klasse nicht überschrieben, deswegen nimmt er hier die aus der Dog Klasse

        // downcasten: Referenz einer Basisklasse auf Kindklasse casten
        Beagle beagle1 = (Beagle) d1;
        beagle1.eatsloveFood();

        //Funktioniert nicht da eine Kommissar Rex Instanz nicht zu Beagle gecastet werden kann
        // Beagle beagle2 = (Beagle)d2;
        // beagle2.eatsloveFood(); //Können die Klasse nicht casten. KommisarRex kann nicht zu beagle gecastet werden

        //Instanceof Operator: Überprüfen ob Instanz  der Klasse entspricht
        //analog bei interfaces möglich

        if (d1 instanceof Dog) { //Wird vorher überprüft ob es eh nicht null ist
            System.out.println("yaay ist ein Dog");
        }

        if (d1 instanceof Beagle) { //Wenn d1 Beagle ist dann geht er in dieses if rein. Wenn d1 ein KommissarRexr wärem würde er da nicht reingehen
            System.out.println("yaay ist ein Dog");
        } //Hier können wir uns sicher sein, dass aif d1 eine Beagle Instanz ist
        Beagle b2 = (Beagle) d1; //hier kann es nicht krachen

        //nicht so schön - Überprüfen ob Instanz genau einer konkreten Klasse entspricht
        // Klasse entspricht (nicht durch abgeleitete Instanz ersetzbar)
        if (d1.getClass().equals(Beagle.class)){
            System.out.println("Yaay auf d1 ist wirklich ein Beagle und kein anderer Hund");
        }
        if (d1.getClass().equals(Dog.class)){
            System.out.println("Hier sollten wir nicht reinkommen  - sonst passt was nicht");
        } else {
            System.out.println("Beagle ist kein Hund - sondern ein Beagle");
        }

    }
}