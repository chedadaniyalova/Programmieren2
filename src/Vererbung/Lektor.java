package Vererbung;

public class Lektor extends Arbeitnehmer {
    private String hauptfach;

    public Lektor(String name, int alter, String arbeitgeber, String hauptfach) {
        super(name, alter, arbeitgeber);
        this.hauptfach = hauptfach;
    }
}


