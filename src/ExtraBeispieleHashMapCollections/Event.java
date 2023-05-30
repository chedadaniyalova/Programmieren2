package ExtraBeispieleHashMapCollections;

public class Event {
   protected String titel;
   protected String ort;
   protected double eintrittspreis;


   //Konstruktor

    public Event(String titel, String ort, double eintrittspreis) {
        this.titel = titel;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;
    }

    //Getter & Setter
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }


    //toString
    @Override
    public String toString() {
        return "Event{" +
                "titel='" + titel + '\'' +
                ", ort='" + ort + '\'' +
                ", eintrittspreis=" + eintrittspreis +
                '}';
    }
}
