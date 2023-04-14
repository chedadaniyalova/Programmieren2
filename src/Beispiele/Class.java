package Beispiele;

public class Class {
    private  String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;
    private Wochentag tag;



    public Class(String name, int hours, int maxCapacity, Wochentag monday) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
        this.tag = tag;
    }
    public void enroll () {
        if (maxCapacityReached()) {
            System.out.println("Schon voll!");
        } else {
            System.out.println(enrolledStudents);
        }
        enrolledStudents++;
    }

    public Wochentag getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public boolean maxCapacityReached() {
        return enrolledStudents >= maxCapacity;


    }
}
