package Vererbung;

public class Adresse {
    private String strasse;
    private int hausnummer;
    private String stadt;
    private int postleitzahl;

    public Adresse(String strasse, int hausnummer, String stadt, int postleitzahl) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", stadt='" + stadt + '\'' +
                ", postleitzahl=" + postleitzahl +
                '}';
    }



    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
}
