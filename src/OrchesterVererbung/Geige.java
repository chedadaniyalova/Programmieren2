package OrchesterVererbung;

public class Geige extends Instrument{

    public Geige(int lautstärke) {
        super(lautstärke);
    }

    @Override
    public int play() {
        System.out.println("Geige wird gestrichen");
        return getLautstärke();
    }

    //Hier nur eine Test Methode so rufen wir das Play aus der Basisklasse auf mit super
    public int playasInstrument (){
        return super.play();
    }
}
