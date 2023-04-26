package Animals2Abstrakte;

public class Giraffe extends Animal{

    protected int anzahlFlecken;

    public Giraffe(String name, int anzahlBeine, String augenfarbe) {
        super(name, anzahlBeine, augenfarbe);
        anzahlFlecken = 40;
    }
//Können auch mehrere Konstuktor haben, mit verschiedenen Werten
    public Giraffe(String name, int anzahlBeine, String augenfarbe, int anzahlFlecken) {
        super(name, anzahlBeine, augenfarbe);
        this.anzahlFlecken = anzahlFlecken;
    }

    public void praesentiertFlecken(){
        System.out.println("Giraffe " + name + " hat " + anzahlFlecken + " Flecken");
    }
    @Override
    public void move(int meters) {
        System.out.println("Giraffe " + name + " stolziert " + meters + " weit");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(" Schmatz schmatz " + withComment);
    }
}
