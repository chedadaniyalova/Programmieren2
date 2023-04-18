package Vererbung;

public class SpezialisierterArzt extends Arzt{


    private double zuschlag;

    public SpezialisierterArzt(String name, int gehalt, double zuschlag) {
        super(name, gehalt);
        this.zuschlag = zuschlag;
    }

    public double getGehalt() {
double neuesGehalt = super.getGehalt() + zuschlag; //super damit ich nicht auf die neue Methode getGehalt zugreife
        return neuesGehalt;
    }
}
