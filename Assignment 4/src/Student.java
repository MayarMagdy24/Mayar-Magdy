//part one task 1
public class Student {
   private String name;
     private int studentId;
    private String major;
    private double gpa;
public void displayStudentInfo(){
    System.out.println("Name:"+name);
    System.out.println("StudentId:"+studentId);
    System.out.println("Major:"+major);
    System.out.println("Gpa:"+gpa);
}
public Student(String name,int studentId,String major){
    this.name = name;
    this.studentId = studentId;
    this.major = major;
    this.gpa = 0.0;





}
    public void updateGpa(double newGpa) {
        System.out.println("Current GPA: " + gpa);
        this.gpa = newGpa;
        System.out.println("Updated GPA: " + gpa);

    }
    public static void main(String[] args) {
        Student student = new Student("Mayar", 123456789, "Archeology");
        student.displayStudentInfo(); // Show initial info
        student.updateGpa(3.0);       // Update GPA
        student.displayStudentInfo(); // Show updated info
    }
}



