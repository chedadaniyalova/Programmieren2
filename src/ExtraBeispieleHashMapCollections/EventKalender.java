package ExtraBeispieleHashMapCollections;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
    ArrayList <Event> events = new ArrayList<>(); //Hier speichern wir alle Events

//KEINEN KONSTRUKTOR

    //ADD
    public void add (Event e){
        events.add(e);
    }

    //GetByTitle
    public Event getByTitle (String titel){
        Event ergebnis = null;
       for (Event e : events) {
           if (e.getTitel().equals(titel)) {
               ergebnis = e;
           }
       }
        return ergebnis;
    }

    //GetByOrt
    public Event getByOrt (String ort){ //So wenn ich nur 1 Event zurück kriegen soll
        Event ergebnis = null;
        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                ergebnis = e;
            }
        }
        return ergebnis;
    }

    public ArrayList <Event> getByEintrittsPreis (double min, double max){ //So wenn man mehrere Events zurück kriegen soll
        ArrayList <Event> ergebnis = new ArrayList<>();
        for (Event e : events){
            if (e.getEintrittspreis() >= min && e.getEintrittspreis() <= max ) {
                ergebnis.add(e);  //Hier add weil Liste
            }
        }
        return ergebnis;
    }

    public Event getMostExpensiveByOrt (String ort){
        Event ergebnis = null;
        double highestPrice = 0;
        for (Event e : events){
            if (e.getOrt().equals(ort)){
                if (e.getEintrittspreis() > highestPrice){
                    ergebnis = e;
                    highestPrice = e.getEintrittspreis();
                }
            }
        }
        return ergebnis;
    }

    public double getAvgPreisByOrt (String ort){
        double gesamtpreis = 0;
        double counter = 0;
        for (Event e : events){
            if (e.getOrt().equals(ort)){
                counter++;
              gesamtpreis =  gesamtpreis + e.getEintrittspreis();
            }
        }
        return gesamtpreis / counter ;
    }

    @Override
    public String toString() {
        return "EventKalender{" +
                "events=" + events +
                '}';
    }

    //HashMap
    public HashMap<String, Integer> getCountEventsByOrt (){
        HashMap <String, Integer> ergebnis= new HashMap<>();
        for (Event e : events){
            String getOrt = e.getOrt();
            if (ergebnis.containsKey(getOrt)){
                ergebnis.put(getOrt, ergebnis.get(getOrt) + 1);
            } else {
                ergebnis.put(getOrt, 1);
            }

        }

        return ergebnis;
    }

    public HashMap <String, Double> getSumPriceEventsByOrt(){
        HashMap <String, Double> ergebnis = new HashMap<>();
        for (Event e : events) {
            String getOrt = e.getOrt();
            double getPrice = e.getEintrittspreis();
            if (ergebnis.containsKey(getOrt)){
                ergebnis.put(getOrt, ergebnis.get(getOrt) + getPrice);
            } else {
                ergebnis.put(getOrt, getPrice);
            }
        }
        return ergebnis;
    }


}


