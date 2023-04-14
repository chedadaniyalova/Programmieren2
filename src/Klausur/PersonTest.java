package Klausur;

public class PersonTest {
    public static void main(String[] args) {
        Personenverwaltung personenverwaltung = new Personenverwaltung(10);
        personenverwaltung.fuegePersonHinzu(new Person(1, "Max"));
        Person p = personenverwaltung.liefePersonMitId(1);
        System.out.println(p);
        personenverwaltung.fuegePersonHinzu(new Person(2,"Anna"));
        personenverwaltung.fuegePersonHinzu(new Person(3, "Lisa"));
        Person p2 = personenverwaltung.liefePersonMitId(3);
        System.out.println(p2);
        personenverwaltung.entfernePersonMitID(2);
    }
}
