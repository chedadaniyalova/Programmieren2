package Beispiele;

import java.util.Arrays;

public class Student {
    private static int counter  = 0; //Deswegen immer statisch erstellen damit er automatisch bei jedem erstellen von Objekt mitzählt
    private int nonStaticCounter = 0; //Wird bei jedem Objekt nur um eins beim konstruktor erhöht
    private Class[] classes;
    private String firstName;
    private String lastName;



    public Student(String firstName, String lastName) {
        this.classes = new Class[3];
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
        nonStaticCounter++;
    }

    public void enroll(Class c) {
        if (alreadyEnrolled(c)) return;
        if(classes[classes.length - 1] != null) {
          //  classes = increaseClasses();

            //Kurs noch frei?
            for (int i = 0; i < classes.length; i++) {
                if (classes[i] == null) {
                    c.enroll();
                    classes[i] = c;
                    System.out.println("Kurs angemeldet.");
                    break;
                }
            }
        } else {
            System.out.println("Nicht angemeldet.");
        }
    }

    private boolean alreadyEnrolled(Class c) {
        for (int i = 0; i < classes.length; i++){
            if (classes[i] !=null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + " bereits angemeldet");
                    return true;
                }
            }
                }
        return false;
    }

    public void printClasses () {
            for (int i = 0; i < classes.length; i++) {
                if (classes[i] != null) {
                    System.out.println(classes[i].getName());
                } else {
                    System.out.println(classes[i]);
                }
            }
        }
    @Override
    public String toString() {
        return "Student{" +
                "classes=" + Arrays.toString(classes) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    private  void increaseClasses(){
        Class [] temp = new Class[classes.length + 1];
        for (int i = 0; i< classes.length; i++){
            temp[i] = classes[i];
        }
    }
    public void printStudyDays (){
        System.out.println("Student " + this.lastName + " has classes on: "  );
        for (int i = 0; i < classes.length ; i++) {
            if (classes[i] != null){
                System.out.println(classes[i].getTag() + " (" + classes[i].getName()+ ")");
            }


        }
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }

    public static int getCounter() {
        return counter;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
