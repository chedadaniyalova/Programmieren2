package OrchesterVererbungAbstract;

public abstract class Instrument {
    private int lautstärke;

    public Instrument(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public abstract int play ();

    //GETTER & SETTER
    public int getLautstärke() {
        return lautstärke;
    }

    public void setLautstärke(int lautstärke) {
        this.lautstärke = lautstärke;
    }
}
