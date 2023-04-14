package Event;

public class EventMain {
    public static void main(String[] args) {

        EventCalendar jahr2023 = new EventCalendar();

        Event Geburtstag = new Event("Geburtstag", "Graz", 800, Eventtype.KONZERN);
        Event Arbeitsfeier = new Event("Programmieren", "Graz", 700, Eventtype.VORTRAG);

        jahr2023.addEvent(Geburtstag);
        jahr2023.addEvent(Arbeitsfeier);
        jahr2023.print();

        System.out.println(); //Nur für nächste Zeile

        System.out.println("Event mit dem Title Geburtstag: " + jahr2023.getByTitle("Geburtstag"));
        System.out.println("Event mit dem Type Vortrag: " + jahr2023.getByType(Eventtype.VORTRAG));

        System.out.println("Remove the most expensive: ");
        jahr2023.removeExpensive3(750);
        jahr2023.print();
        System.out.println(Geburtstag.equals(Arbeitsfeier));


    }
}
