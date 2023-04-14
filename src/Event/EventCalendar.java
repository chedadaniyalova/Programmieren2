package Event;

import Collections.Friend;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventCalendar {
    private List<Event> events = new ArrayList<>(); //Attribut ArrayList sowie ein Array worin unsere Werte aus Event speichern

    public void addEvent(Event e) {
        events.add(e);
    }

    public void print() {
        for (int i = 0; i < events.size(); i++) {
            System.out.println(events.get(i));
        }
    }

    public void print(ArrayList<Event> events) {
        for (int i = 0; i < events.size(); i++) {
            System.out.println(i);
        }
    }

    public ArrayList<Event> getByTitle(String title) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTitle().equals(title)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    public ArrayList<Event> getByType(Eventtype type) {
        ArrayList<Event> result = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getType().equals(type)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getOrt().equals(ort)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    //Iterator Methode
    public void removeExpensive3 (double limit){
        Iterator<Event> it = events.iterator();
        while (it.hasNext()){
            Event event = it.next();
            if (event.getPreis() > limit){
                it.remove();
            }
        }
    }

//    public Event getMostExpensive() {
//        double price = events.get(0).getPreis();
//        Event result = events.get(0);
//        for (int i = 0; i < events.size(); i++) {
//            //  if ()
//        }
//    }


    }

