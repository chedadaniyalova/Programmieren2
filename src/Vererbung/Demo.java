package Vererbung;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Max", 30, "KF", 11111);
        student.hallo();

        Arbeitnehmer arbeitnehmer = new Arbeitnehmer("Lisa", 28, "Maxi");
        arbeitnehmer.hallo();

        Lektor lektor = new Lektor("Diana", 33, "Maxi", "Programmieren");
        lektor.hallo();

        Wohngemeinschaft wohngemeinschaft = new Wohngemeinschaft (new Adresse("Strasse", 20, "Graz", 8020));
        wohngemeinschaft.addPerson(student);
        wohngemeinschaft.addPerson(arbeitnehmer);
        wohngemeinschaft.addPerson(lektor);
        System.out.println(wohngemeinschaft.getPersonen()); //für getPersonen Getter in WohngemeinschaftKlasse implementieren


    }
}
