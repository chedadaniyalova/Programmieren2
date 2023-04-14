package Collections;

public class Friend {
    //Name, age, city, country, knownSince

    private String name;
    private int age;
    private String city;
    private String country;
    private int knownSince;

    @Override //Short cut alt + eifügen, um array ausgeben zu können(Keine ahnung wofür genau)
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", knownSince=" + knownSince +
                '}';
    }

    //KONSTRUKTOR
    public Friend(String name, int age, String city, String country, int knownSince) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.knownSince = knownSince;
    }

















    //GETTER & SETTER
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getKnownSince() {
        return knownSince;
    }

    public void setKnownSince(int knownSince) {
        this.knownSince = knownSince;
    }
}
