// part one task 2
public class UniversityApp {
    public static void main( String[] args) {
        // Create a two student objects
     Student student1 = new Student("Mayar", 1, "Archeology");
     Student student2 = new Student("Mohamed", 2, "Engineering");

        // Display their information
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        // Update GPA for ONE student
        student1.updateGpa(3.5);


        // Display their information again to see the updated GPA
        student1.displayStudentInfo();



    }
}
