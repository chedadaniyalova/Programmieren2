package OrchesterVererbung;

public class Main {
    public static void main(String[] args) {
Gitarre g = new Gitarre(10);
Geige ge = new Geige(8);
Trompete t = new Trompete(14);

Orchester or = new Orchester();
or.addInstrument(g);
or.addInstrument(ge);
or.addInstrument(t);

System.out.println("Die aktuelle Lautstärke aller Instrumente ist: " + or.playAll());
//Test mit der super methode
System.out.println(ge.playasInstrument());
    }
}
