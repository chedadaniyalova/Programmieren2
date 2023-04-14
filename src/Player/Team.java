package Player;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players = new ArrayList<>();
    private String name;

    //KONSTRUKTOR
    public Team(String name) {
        this.players = players;
        this.name = name;
    }
    public void add (Player p){
        players.add(p);
    }
    public void print (){
        for (int i = 0; i < players.size(); i ++){
            System.out.println(players.get(i));
        }
    }
    public int getPointsPerTeam (){
       int sum = 0;
       for (Player p : players){
           sum = sum + p.getPoints();
       }
        return sum;
    }

    //GETTER & SETTER

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' +
                "teampoints = "+ getPointsPerTeam() +
                '}';
    }
}
