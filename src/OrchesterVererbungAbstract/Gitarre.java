package OrchesterVererbungAbstract;

public class Gitarre extends Instrument {

    public Gitarre(int lautstärke) {
        super(lautstärke);
    }

    @Override
    public int play() {
        System.out.println("Die Gitarre wird gespielt");
        return getLautstärke();
    }

    public void stimmen (){

    }
}
