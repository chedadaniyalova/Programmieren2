package HaseVererbung;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
    }

    public void versteckeOstereier (){
        System.out.println(getName() + " versteckt Ostereier");
    }

    @Override
    public void hoppeln() {
        System.out.println(getName() + " Hoppelt hopp hopp");
    }
}

