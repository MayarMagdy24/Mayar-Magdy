package inheritance;

public class Teacher extends Person {
    public String teacherid;
    public String subject;
    public Teacher(String name,int age,String teacherid,String subject ){
        super(name,age);
        this.teacherid=teacherid;
        this.subject=subject;

    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + this.teacherid + ", Subject: " + this.subject);
    }
    @Override
    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(this.name +" with ID:  "+ this.teacherid + " is now teaching " + this.subject + ".");

    }
    //specified for teacher only
    public void teach(){
        System.out.println(this.name + " (EmpID: " + this.teacherid + ") is teaching " + this.subject + ".");
    }
}
