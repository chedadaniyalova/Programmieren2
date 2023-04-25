package AnimalsVererbung;

//Nur ein Beispiel um zu zeigen wie Konstruktoren unterschiedlich sind
//ACHTUNG immer überlegen ob es wirklich sinn macht für so ein spezielle
//Situation wirklich eine abgeleitete Klasse zu erstellen oder vielleicht
//doch nur eine Instanz von einem zb Schäfer Hund
public class KommisarRex extends Dog {
    public KommisarRex (int age){
        super ( "Rex", age);
    }
}
