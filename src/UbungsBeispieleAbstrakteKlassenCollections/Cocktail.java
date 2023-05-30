package UbungsBeispieleAbstrakteKlassenCollections;

import java.util.ArrayList;

public class Cocktail extends Getraenk{
protected ArrayList <Fluessigkeit> bestandteile;

//Konstruktor
    public Cocktail(String name) {
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
