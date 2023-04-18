package Maps;

import java.util.ArrayList;

public class ProduktMain {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Handy", 800);
        produkt1.setDiscount(10);
        produkt1.setDescription("Produkt 1 aus SHop A");


        Produkt produkt2 = new Produkt("Laptop", 600);
        produkt1.setDiscount(10);
        produkt2.setDescription("Produkt 2 aus Shop B");

        System.out.println(produkt1.equals(produkt2)); //vergleichen ob bei  beiden die Title gleich sind

        //Klasse Shop aufrufen
        Shop shop = new Shop();
        shop.add(produkt1); //Produkte zum shop hinzufügen
        shop.add(produkt2);
        ArrayList <Produkt> products = shop.getByPriceFrom(500);
        System.out.println(products);

        System.out.println();
        System.out.println();

        System.out.println(shop.removeProductByIterator(500));

    }

}
