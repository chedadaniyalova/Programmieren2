package HaseVererbung;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }
    public void verteileGeschenke (){
        System.out.println(getName() + " verteilt Geschenke.");
    }
}
