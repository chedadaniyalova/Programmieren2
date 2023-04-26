package OrchesterVererbung;

public class Trompete extends Instrument{
    public Trompete(int lautstärke) {
        super(lautstärke);
    }

    @Override
    public int play() {
        System.out.println("Die Trompete wird gespielt");
        return getLautstärke();
    }
}
