package AnimalsVererbung;

public class Beagle extends Dog {
    public String loveFood;


    //wenn wir einen Default Konstruktor Dog() in Basisklasse haben
    //dann wird dieser automatisch aufgerufen
    //falls es den nicht gibt oder wir einen anderen verwenden
    //möchten rufen wir mit super () auf  explizit den Konstruktor
    //der Basisklasse auf (den wir möchten)
    //Bennenung: name und age können absichtlich anders bennant werden zur Illustration
    public Beagle(String name, int age, String loveFood) {
        super(name, age);  // Mit super rufe ich deb Konstruktor der Basis Klasse auf. Die variablem können auch anders heissen als in der Basisklasse
        this.loveFood = loveFood;
    }
    public void eatsloveFood(){
        System.out.println(getName() + "(" + age + ") isst " + loveFood );
    }

    //Methoden Überschreiben

    @Override
    public void bark(String wuff) {
        System.out.println(getName() +  " bellt und jammert:" + wuff);
    }
}

