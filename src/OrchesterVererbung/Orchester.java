package OrchesterVererbung;

import HaseVererbung.Hase;

import java.util.ArrayList;

public class Orchester {
    ArrayList<Instrument> instrumente = new ArrayList<>();

    public void addInstrument (Instrument e){
     instrumente.add(e);
    }

    public int playAll() {
        int summe = 0;
        for (Instrument h : instrumente) {
          h.play();
          summe = summe + h.getLautstärke();
        }
        return summe;
    }

}



