package Collections;

import com.sun.source.tree.BreakTree;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class FriendListe {


    private List<Friend> friends = new ArrayList<>(); //Muss man oben auch importieren

    public List<Friend> getFriends() {
        return friends;
    }

    public void print() {
        for (Friend f : friends) {
            System.out.println(f);
        }

        //size () anstatt length() (aaray)
        //dasselbe wie oben in der for euch schleife
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
        System.out.println();
    }

    public void addFriend(Friend f) {
        friends.add(f);
    }

    public ArrayList<Friend> friendsFrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }

        }
        return result;
    }

    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }
    }

    public Friend findOldestFriend() {
        int year = Year.now().getValue(); //zeigt aktuelles Jahr
        Friend oldestFriend = friends.get(0);
        int howLong = year - friends.get(0).getKnownSince();

        for (int i = 1; i < friends.size(); i++) {
            if ((year - friends.get(i).getKnownSince()) > howLong) {
                howLong = year - friends.get(i).getKnownSince();
                oldestFriend = friends.get(i);
            }
        }
        return oldestFriend;
    }

    public void removeFriend(Friend f) {
        ArrayList<Friend> result = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
        }friends.remove(f);
    }


    public ArrayList<Friend> friendsAbroad(String homeCountry) {
        ArrayList<Friend> result = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCountry() != homeCountry) {
                result.add(friends.get(i));
            }
        }
        return result;
    }
}

