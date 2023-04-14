package Beispiele;

import java.util.SortedMap;

public class ClassTest {
    public static void main(String[] args) {
        Class c1 = new Class("PR2", 4, 30, Wochentag.MONDAY);
        Class c2 = new Class("Modelle", 3, 20,Wochentag.FRIDAY);
        Student s1 = new Student("Max", "Musterman");

        System.out.println(s1);
        s1.enroll(c1);
        s1.printClasses();
        System.out.println();

    }

}
