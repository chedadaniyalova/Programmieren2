package Genetics;

import java.time.LocalDateTime;

public class DemoMain {
    public static void main(String[] args) {
        Info<String> name = new Info<>("Max", 1);
        Info<Integer> age = new Info<>(30, 2);
        Info<String> adresse = new Info<>("Graz", 2);
     //   Info<LocalDateTime> registation = new Info<>(LocalDateTime, 1);

        Profil profil = new Profil(name, age, adresse);
        profil.print();

    }
}
