package Maps;

public class ProduktMain {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Handy", 800);
        produkt1.setDiscount(10);
        produkt1.setDescription("Produkt 1 aus SHop A");


        Produkt produkt2 = new Produkt("Laptop", 800);
        produkt1.setDiscount(10);
        produkt2.setDescription("Produkt 2 aus Shop B");

        System.out.println(produkt1.equals(produkt2)); //vergleichen ob bei  beiden die Title gleich sind

    }
}
