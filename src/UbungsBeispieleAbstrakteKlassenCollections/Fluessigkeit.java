package UbungsBeispieleAbstrakteKlassenCollections;

public class Fluessigkeit {

    protected String name;
    protected double menge;
    protected double alkoholProzent;


    //Konstruktor
    public Fluessigkeit(String name, double menge, double alkoholProzent) {
        this.name = name;
        this.menge = menge;
        this.alkoholProzent = alkoholProzent;
    }

    //GETTER
    public String getName() {
        return name;
    }

    public double getMenge() {
        return menge;
    }

    public double getAlkoholProzent() {
        return alkoholProzent;
    }


}
