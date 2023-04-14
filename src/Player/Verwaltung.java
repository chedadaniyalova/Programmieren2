package Player;

import Collections.Friend;

import java.util.ArrayList;
import java.util.List;

public class Verwaltung {
    ArrayList<Team> teams = new ArrayList<>();

    public void print() {
        for (Team t : teams) {
            System.out.println(t);
            t.print();
        }
        System.out.println();
    }

    public void removePlayer(Player f) {
        ArrayList<Player> result = new ArrayList<>();

        for (int i = 0; i < teams.size(); i++) {
        }
        teams.remove(f);
    }


    public Player getPlayerbyId (int id) {
        for (Team t : teams){
            for (Player p : t.getPlayers()){
                if (p.getId() == id) {
                    return p;
                }
            }
        }
        return null;
    }

//    public int getPointsPerTeam (Team team){
//        int teampoints = 0;
//
//        for (int i = 0; i < player.size(); i++){
//            if (player.get(i).getTeam().equals(team)){
//                teampoints = teampoints + player.get(i).getPoints();
//            }
//        }
//        return teampoints;
//    }

    public Player getWinnerTeam() {
        Team winner = null;
        int points = 0;

        for (Team t : teams) {
            if (t.getPointsPerTeam() > points) {
                winner = t;
                points = t.getPointsPerTeam();
            }
        }
        return null;
    }

    public Player getBestPlayer() {
        Player best = null;
        int points = 0;

        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getPoints() > points) {
                    best = p;
                    points = p.getPoints();
                }
            }
        }
        return best;
    }

    public Player getPlayerById(int id) {
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getId() == id) {
                    return p;
                }
            }
        }
        return null;
    }
}



