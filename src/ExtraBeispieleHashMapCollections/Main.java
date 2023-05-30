package ExtraBeispieleHashMapCollections;

public class Main {
    public static void main(String[] args) {
        Event event = new Event("Geburtstag", "Graz",100);
        Event event2 = new Event("Hausfeier", "Wien",500);
        Event event3 = new Event("Hallo", "Graz",300);
        Event event4 = new Event("Babyshower", "Linz", 200);

        EventKalender kalender = new EventKalender();

        kalender.add(event);
        kalender.add((event2));
        kalender.add((event3));
        kalender.add((event4));

        System.out.println(kalender.getByTitle("Geburtstag"));
        System.out.println(kalender.getByTitle("Hausfeier"));

        System.out.println(kalender.getMostExpensiveByOrt("Graz"));

        System.out.println(kalender.getAvgPreisByOrt("Graz"));
        System.out.println(kalender.getCountEventsByOrt()); //Alle gleichen Orte werden gezählt
        System.out.println(kalender.getSumPriceEventsByOrt()); //Zählt alle von einem Ort zusammen

    }



}
