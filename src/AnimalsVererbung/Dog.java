package AnimalsVererbung;

public class Dog {
    //Anfang Hat nichts mit Vererbung zu tun - Exkurs static*
    //Statisches Attribut nur einmal - egal wie viele Hundeobjekte erstellt werden
    //In einer statischen Methode kann ich nur statische Attribute verwenden
    public static String latinName = "Canis lupus familiaris";

//Statische Methoden darf nur auf lokale Variable nund statischen Attribute zugreifen
    public static void printlatinName(){
        String hansi = "Hansi liebt Hunde";
        System.out.println(hansi);
        System.out.println(latinName);
    }
    //Ende hat nicht mit Vererbung zu tun
    //Auf private Attribute können abgeleitete Klassen nicht zugreifen
    //Auf protected schon
    private String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark (String wuff){
        System.out.println(name + "bellt:" + wuff);
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
