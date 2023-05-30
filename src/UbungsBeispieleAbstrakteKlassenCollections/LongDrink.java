package UbungsBeispieleAbstrakteKlassenCollections;

public class LongDrink extends Getraenk{
    protected Fluessigkeit spirituose;
    protected Fluessigkeit filler;

    public LongDrink(String name) {
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
