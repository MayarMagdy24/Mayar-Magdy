package inheritance;

public class Undergraduate extends Student {
    public String major;
    public int year;

    public Undergraduate(String name, int age, String studentId, char grade, String major, int year) {
        super(name, age, studentId, grade); // Calls Student's constructor
        this.major = major;
        this.year = year;
    }

    @Override
    public void displayInfo() { // Change all implementation for the method without using super
        System.out.println("Undergraduate Student: " + this.major + " in year " + this.year);
    }

    public void declareMajor() {
        System.out.println(this.name + " is in major " + this.major + " in year " + this.year + ".");
    }
}
