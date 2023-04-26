package Animals2Abstrakte;

import OrchesterVererbung.Gitarre;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //Animal a = new Animal ();   // Keine Instanz erzeugen möglich da abstrakt
        Giraffe georg = new Giraffe("Georg", 4, "braun", 40);
        Papagei pauli = new Papagei("Pauli", 2, "blau");

        georg.praesentiertFlecken();

        Animal g1 = georg;

        ArrayList <Animal> zoo = new ArrayList<>();
        zoo.add(georg);
        zoo.add(pauli);

        for (Animal a: zoo) {
            a.move(100);

        }
    }
}
