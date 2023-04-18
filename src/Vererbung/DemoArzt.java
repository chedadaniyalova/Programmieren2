package Vererbung;

public class DemoArzt {
    public static void main(String[] args) {
        Arzt arzt = new Arzt("Tina", 4000);
        Arzt arzt2 = new Arzt("Lisa", 6000);

        SpezialisierterArzt spezialisierterArzt = new SpezialisierterArzt("Max", 4000, 6000);
        Krankenhaus kh = new Krankenhaus();
        kh.addArzt(arzt);
        kh.addArzt(arzt2);
        kh.addArzt(spezialisierterArzt);

        kh.print();

    }
}
