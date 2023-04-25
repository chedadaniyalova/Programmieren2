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

    }
}
