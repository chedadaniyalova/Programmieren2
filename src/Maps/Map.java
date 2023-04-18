package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    HashMap<String, Produkt> products = new HashMap<>();

    public void add(Produkt p) {
        products.put(p.getTitle(), p);
    }

    public Produkt get(String title) {
        Produkt p = products.get(title);
        if (p == null) {
            System.out.println("Produkt nicht gefunden");
        }

        return p;
    }

    public boolean gibtsGratis() {
        for (Produkt p : products.values()) {
            if (p.getDiscount() == 100) {
                return true;
            }
        }
        for (String key : products.keySet()) {
            Produkt p = products.get(key);
            if (p.getDiscount() == 100) {
                return true;
            }
        }

        for (java.util.Map.Entry<String, Produkt> e : products.entrySet()) {
            Produkt p = e.getValue();
            if (p.getDiscount() == 100) {
                return true;
            }

        }
        return false;
    }

    public ArrayList<Produkt> getByPriceFrom(double from) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (java.util.Map.Entry<String, Produkt> entry : products.entrySet()) {
            if (entry.getValue().getPrice() > from) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    public ArrayList<Produkt> getByPriceTo (double to) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (java.util.Map.Entry<String, Produkt> entry : products.entrySet()) {
            if (entry.getValue().getPrice() < to) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    public void removeProductByIterator (double from) {

    }


}



