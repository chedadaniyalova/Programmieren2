package HaseVererbung;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke() {
        System.out.println(getName() + " verteilt Geschenke.");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println("Weihnachtshase " + name + " bringt ganz viele Geschenke zur Party");
    }

}
