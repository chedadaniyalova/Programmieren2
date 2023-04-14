package Event;

import java.util.Objects;

public class Event {
   private Eventtype type;
   private String title;
   private String ort;
   private double preis;

 //Konstruktor
    public Event(String title, String ort, double preis, Eventtype type) {
        this.type = type;
        this.title = title;
        this.ort = ort;
        this.preis = preis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return ort.equals(event.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ort);
    }

    //toString Methode
    @Override
    public String toString() {
        return "Event{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", preis=" + preis +
                '}';
    }



    //Getter & Setter

    public Eventtype getType() {
        return type;
    }

    public void setType(Eventtype type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
