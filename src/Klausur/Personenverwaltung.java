package Klausur;

public class Personenverwaltung {
    private Person[] personen;
    private int anzahl = 0;

    public Personenverwaltung(int groesse) {
        personen = new Person[groesse];
    }

    public void fuegePersonHinzu(Person p) {
        if (anzahl < personen.length) {
            personen[anzahl] = p;
            anzahl++;
        }

    }

    public Person liefePersonMitId(int id) {
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                if (personen[i].getId() == id) {
                    return personen[i];
                }
            }
        }
        return null;
    }

    public void entfernePersonMitID(int id) {
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                if (personen[i].getId() == id) {
                    personen[i] = null;
                    break;
                }
            }
        }
    }
}
