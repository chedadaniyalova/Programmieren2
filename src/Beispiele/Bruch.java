package Beispiele;

public class Bruch {
    int numerator;
    int denominator;


    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public double toDecimal(){
        return (double) numerator/denominator;
    }
    public void print (){
        System.out.println(numerator + "/" + denominator);
    }
   public Bruch multiplicate  (Bruch b2){
 return new Bruch(b2.getNumerator() * this.numerator, b2.getDenominator()* this.denominator);
  }

  public Bruch multiplicate (Bruch b2, Bruch b3){
        return multiplicate(b2).multiplicate(b3);

//        Bruch tempResult = this.multiplicate(b2);
//        Bruch result = tempResult.multiplicate(b3);
//
//        Bruch res = new Bruch(b2.getNumerator() * b3.getDenominator());
//        return result;
  }

















    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
