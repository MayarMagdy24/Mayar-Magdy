package inheritance;

public class Student  extends Person{
    public String studentId;
    public char grade;

    public Student(String name, int age,String studentId) {
        super(name, age);
        this.studentId=studentId;
        this.grade=grade;

    }

    public Student(String name, int age, String studentId, char grade) {
        super();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + this.studentId + ", Grade: " + this.grade);
    }
    @Override
    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(this.name +" with ID:  "+ this.studentId + " is now in grade " + this.grade + ".");
    }
    //specific for student only
    public void study(){
        System.out.println(this.name + " (ID: " + this.studentId + ") is studying.");
    }
}
