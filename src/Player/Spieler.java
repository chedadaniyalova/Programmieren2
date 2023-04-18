package Player;

public class Spieler {
    String name;

    //Konstruktor
    public Spieler(String name) {
        this.name = name;
    }




    //Getter
    public String getName() {
        return name;
    }

  @Override
public String toString() {
    return "Spieler{" +
            "name='" + name + '\'' +
            '}';

}
}
