package OrchesterVererbungAbstract;

public class Klarinette extends Instrument {
    public Klarinette(int lautstärke) {
        super(lautstärke);
    }

    @Override
    public int play() {
        System.out.println("Die Klarinette wird gespielt");
        return getLautstärke();
    }
}
