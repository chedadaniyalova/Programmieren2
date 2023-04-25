package HaseVererbung;

import java.util.ArrayList;

public class Hasenstall {
    ArrayList<Hase> hasen = new ArrayList<>();

    public void addHase(Hase e) {
        hasen.add(e);
    }

//    public void hoppelnAlleHasen () {
//        for (int i = 0; i < hasen.size(); i++) {
//            hasen.get(i).hoppeln();
//        }

    public void hoppelAlle() {
        for (Hase h : hasen) {
            h.hoppeln();

        }
    }
}

