package inheritance;

public class Graduate extends Student {
    public int graduationYear;
    public Graduate(String name, int age, String studentId, char grade, int graduationYear) {
        super(name, age, studentId, grade);
        this.graduationYear = graduationYear;
    }
    @Override
    public void study() {
        super.study();
        System.out.println(this.name +" graduated in " + this.graduationYear + ".");
    }
    public void declareGraduationYear() {
        System.out.println(this.name + " has graduated in " + this.graduationYear + " .");
        System.out.printf("The person %s has graduated in %d , in age %d %n.%n.",this.name, this.graduationYear, this.age  );
    }
}
