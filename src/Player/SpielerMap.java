package Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SpielerMap {
    Map<Spieler, Integer> player = new HashMap<> ();

    public  void addOrUpdate (Spieler s, int points){
        Integer p = player.get(s);
        if (p == null) {
            player.put(s, points);
        } else {
            player.put (s, player.get(s) + points);
        }
    }



    //GETTER
    public Map<Spieler, Integer> getPlayer() {
        return player;
    }

    //Methode
    public ArrayList <Spieler> getPlayerWithPoints (int points){
        ArrayList <Spieler> result =  new ArrayList<>();

        for (Map.Entry<Spieler, Integer> entry : player.entrySet()){
            if (entry.getValue() > points) {
                result.add (entry.getKey());
            }
        }
//        for (Spieler s : player.keySet()) { //Hier über die Keys
//            if (player.get(s) > points) {
//                result.add(s);
//
//            }
//        }
        return result;
    }
}
