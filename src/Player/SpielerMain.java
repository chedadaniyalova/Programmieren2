package Player;

public class SpielerMain {
    public static void main(String[] args) {
        SpielerMap spielerMap = new SpielerMap();
        Spieler p1 = new Spieler("Thomas");
        Spieler p2 = new Spieler("Astrid");

        spielerMap.addOrUpdate(p1, 80);
        spielerMap.addOrUpdate(p2, 100);
        System.out.println(spielerMap.getPlayer());
        spielerMap.addOrUpdate(p1,80);
        System.out.println(spielerMap.getPlayer());

        Spieler p3 = new Spieler("Elena");
        spielerMap.addOrUpdate(p3, 120);
        System.out.println(spielerMap.getPlayer());
        System.out.println(spielerMap.getPlayerWithPoints(100)); //Wer hat mehr als 100 Punkte
    }
}
