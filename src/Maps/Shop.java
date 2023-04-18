package Maps;

import java.util.*;

public class Shop {
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

    //For each schleife über das Key Set
    public ArrayList<Produkt> getByPriceFrom(double from) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (String key : products.keySet()) {
            Produkt p = products.get(key);
            if (p.getPrice() > from) {
                result.add(p);
            }
        }

        return result;
    }
    //Die Methode würde auch so gehen
//        for (java.util.Map.Entry<String, Produkt> entry : products.entrySet()) {
//            if (entry.getValue().getPrice() > from) {
//                result.add(entry.getValue());
//            }
//        }
//        return result;



    public ArrayList<Produkt> getByPriceTo (double to) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (java.util.Map.Entry<String, Produkt> entry : products.entrySet()) {
            if (entry.getValue().getPrice() < to) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    public double removeProductByIterator (double from) {
        Iterator <Produkt> iterator = products.values().iterator();
        while (iterator.hasNext()) {
           Produkt produkt = iterator.next();
           if (produkt.getPrice() > from){
               iterator.remove();
           }
            }
        return from;
    }

    public void removeProductsFromByKeySet (double from) {
        Set <String> keys = new HashSet<>();
        for (Produkt p : products.values()) {
            if (p.getPrice() > from) {
                keys.add(p.getTitle());
            }
        }
        products.keySet().removeAll(keys);
    }



}



