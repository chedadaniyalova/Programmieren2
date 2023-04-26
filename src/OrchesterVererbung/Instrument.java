package OrchesterVererbung;

public class Instrument {
    private int lautstärke;

    public Instrument(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public int play (){
        System.out.println("Instrument macht Geräusch");
    return lautstärke;
    }



    //GETTER & SETTER
    public int getLautstärke() {
        return lautstärke;
    }

    public void setLautstärke(int lautstärke) {
        this.lautstärke = lautstärke;
    }
}
