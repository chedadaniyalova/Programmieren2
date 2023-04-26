package Animals2Abstrakte;

//Hier das abstract  nicht vergessen sobald wir abstacte Methoden haben
public abstract class Animal {

    protected String name;
    protected int anzahlBeine;
    protected String augenfarbe;

    //KONSTRUKTOR
    public Animal(String name, int anzahlBeine, String augenfarbe) {
        this.name = name;
        this.anzahlBeine = anzahlBeine;
        this.augenfarbe = augenfarbe;
    }
    public void printAnimalDescription(){
        System.out.println(name + " Beine: " + anzahlBeine + " Augenfarbe: " + augenfarbe);
    }

    //Abstrakte Methoden
    public abstract void move (int meters);

    public abstract void makeNoise (String withComment);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public String getAugenfarbe() {
        return augenfarbe;
    }

    public void setAugenfarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }
}
