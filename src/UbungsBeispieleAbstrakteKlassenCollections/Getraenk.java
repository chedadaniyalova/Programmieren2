package UbungsBeispieleAbstrakteKlassenCollections;

public abstract class Getraenk implements Brennbar {
    protected String name;

    //KONSTRUKTOR
    public Getraenk(String name) {
        this.name = name;
    }

    //GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Getraenk{" +
                "name='" + name + '\'' +
                "Anzahl: " + getAnzahlZutaten() +
                "Hat Alkohol: " + beinhaltetAlkohol() +
                "Tut brennen: " + brennt() +
                '}';
    }

    abstract int getAnzahlZutaten ();
    abstract boolean beinhaltetAlkohol();
    abstract double mengeInML();
}
