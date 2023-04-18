package Vererbung;

public class Student  extends Person { //extends bedeutet ein Student ist eine Person.Konstruktor kommt dann mit name und alter aus Klasse Person, weil jeder student einen namen und alter haben muss. = Vererbung
    private String studium;
    private int martikelnummer;


    public Student(String name, int alter, String studium, int martikelnummer) {
        super(name, alter);
        this.studium = studium;
        this.martikelnummer = martikelnummer;
    }

    public void hallo() {
        System.out.println("Hallo, ich bin ein Student"); //Die selbe methode wie in Klasse Person. Wird aber bei student von hier aufgerufen
    }
}

