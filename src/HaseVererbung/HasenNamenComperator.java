package HaseVererbung;

import java.util.Comparator;

public class HasenNamenComperator implements Comparator <Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {
       return o1.name.compareTo(o2.name);

    }
}
