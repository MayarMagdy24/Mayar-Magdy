package inheritance;

public class Admin extends Person{
  public String Adminid;
   public String department;
   public Admin(String name,int age,String Adminid , String department){
       super(name,age);

   this.Adminid=Adminid;
   this.department=department;
} @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin ID: " + this.Adminid + ", Department: " + this.department);
    }
    @Override
    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(this.name +" with ID:  "+ this.Adminid + " is now managing the " + this.department + " department.");
}
public void manage(){
    System.out.println(this.name + " (AdminID: " + this.Adminid + ") is managing the " + this.department + " department.");
}


}
