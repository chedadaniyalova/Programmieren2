package UbungsBeispieleAbstrakteKlassenCollections;

public class SimplesGetraenk extends Getraenk{
    protected Fluessigkeit bestandteil;

    //Konstruktor
    public SimplesGetraenk(String name) {
        super(name);
    }

    @Override
    public boolean brennt() {
        return false;
    }

    @Override
    int getAnzahlZutaten() {
        return 0;
    }

    @Override
    boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    double mengeInML() {
        return 0;
    }
}
