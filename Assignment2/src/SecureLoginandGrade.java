import java.util.Scanner;

public class SecureLoginandGrade {

    public static void main(String[] args) {
        // Define valid email/password and secret code
        String validEmail = "mohamed@intrast.com";
        String validPassword = "mohamed123";
        final String constantCode = "abcd1234";

        Scanner scanner = new Scanner(System.in);



        // Try logging in 3 times (without loops)
        // 1st attempt
        System.out.println("Enter Valid Email");
        String email1 = scanner.nextLine();
        System.out.println("Enter Password");
        String password1 = scanner.nextLine();

        if (email1.equals(validEmail) && password1.equals(validPassword)) {
            gradeFunction(scanner, constantCode);
            return;
        } else {
            System.out.println("Incorrect credentials 1st attempt out of 3");
        }

        // 2nd attempt
        System.out.println("Enter Email:");
        String email2 = scanner.nextLine();
        System.out.println("Enter Password");
        String password2 = scanner.nextLine();

        if (email2.equals(validEmail) && password2.equals(validPassword)) {
            gradeFunction(scanner, constantCode);
            return;
        } else {
            System.out.println("Incorrect credentials 2nd attempt out of 3");
        }

        // 3rd attempt
        System.out.println("Enter Valid Email");
        String email3 = scanner.nextLine();
        System.out.println("Enter Password");
        String password3 = scanner.nextLine();

        if (email3.equals(validEmail) && password3.equals(validPassword)) {
            gradeFunction(scanner, constantCode);
            return;
        } else {
            System.out.println("Incorrect credentials 3rd attempt out of 3");
            System.out.println("Account Locked");
        }

        scanner.close();
    }
// with using Loops
  /* for (int attempt =1 ;attempt <=3 ; attempt ++ ;){
        System.out.println("enter your email");
        String email = scanner.nextLine();
          System.out.println("Enter Password:");
            String password = scanner.nextLine();

            if (email.equals(validEmail) && password.equals(validPassword)) {
                gradeFunction(scanner, constantCode);
                scanner.close();
                 return;
                 } else {
                System.out.println("Incorrect credentials " + attempt + " attempt out of 3");
            }
    }*/
    public static void gradeFunction(Scanner scanner, String constantCode) {
        System.out.println("Enter the secret access code:");
        String inputCode = scanner.nextLine();
        if (inputCode.equals(constantCode)) {
            System.out.println("Access granted.");
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();
            System.out.println("Enter your grade (0-100):");
            int grade = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Grade must be between 0 and 100.");
                return;
            }
char Grades;

            if (grade >= 90) {
                Grades = 'A';
            } else if (grade >= 80) {
                Grades = 'B';
            } else if (grade >= 70) {
                Grades = 'C';
            } else if (grade >= 60) {
                Grades = 'D';
            } else {
                Grades = 'F';
            }

            System.out.println("Full name:"+fullName);
            System.out.println("Age:"+age);
            System.out.println("Grade:"+grade);
            System.out.println("Constant code:"+constantCode);
            System.out.println("Letter Grade:"+Grades);
        } else {
            System.out.println("Invalid code. Access denied.");
        }
    }
}
