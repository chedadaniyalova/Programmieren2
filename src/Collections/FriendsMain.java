package Collections;

import java.util.ArrayList;

public class FriendsMain {

    public static void main(String[] args) {
        Friend lisa = new Friend("Lisa",30,"Graz", "Österrreich",2016);
        Friend adam = new Friend("Adam",34,"Wien", "Österrreich",2014);
        Friend diana = new Friend("Diana",25,"Graz Umgebung", "Österrreich",2010);

        FriendListe friendListe = new FriendListe();
        friendListe.addFriend(adam);
        friendListe.addFriend(lisa);
        friendListe.addFriend(diana);
        friendListe.print();

//        ArrayList <Friend> from = friendListe.friendsFrom("Graz");
//        for (Friend f : from) {
//            System.out.println(f);
//        }

       //Findet nur Freunde aus Graz
        ArrayList <Friend> friendsFromGraz = friendListe.friendsFrom("Graz");
        System.out.println("Das sind deine Freunde aus Graz: " + friendsFromGraz);


        //Findet den Freund den man am längsten kennt
        System.out.println("Oldest friend is: " + friendListe.findOldestFriend());


    }
}
