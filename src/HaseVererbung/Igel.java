package HaseVererbung;

public class Igel implements GoesToParty{

    @Override
    public void party(String drink, String cake) {
        System.out.println("Igel geht zur Party und ist ganz vorsichtig um niemanden zu stechen und isst " + cake);
    }
}
