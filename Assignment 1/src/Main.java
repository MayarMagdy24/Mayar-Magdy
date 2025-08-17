import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Student Name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name");
        String name= input.nextLine();
        //3 Subjects Marks
        System.out.println("Enter marks for subject1 (out of 100):");
        int subject1 = input.nextInt();
        System.out.println("Enter marks for subject2 (out of 100):");
        int subject2 = input.nextInt();
        System.out.println("Enter marks for subject3 (out of 100):");
        int subject3 = input.nextInt();
        // Total Marks
        int total = subject1 + subject2 + subject3 ;
        // Average Marks
        float average = total /3f;
        // Grades
        char grade;
        if (average<60) {
            grade = 'F';
        }else if(average>=60 && average<70){
            grade='D';
        } else if (average>=70 && average<80) {
            grade='C';
        } else if (average>=80 && average<90) {
            grade='B';
        } else if (average>=90 && average<=100) {
            grade='A';
        } else {
         grade='0';
        }


        //Switch
        String Message;
        switch (grade){
            case 'A':
                Message = "Excellent work!";
            break;
            case 'B':
                Message = "Great job!";
            break;
            case 'C':
                 Message = "Good effort!";
                break;
            case 'D':
                Message = "You passed, but aim higher.";
                break;
            case 'F':
                Message = "You need to improve.";
                break;
            default:
                Message = "Invalid grade.";
        }
        System.out.println("Student:"+name);
        System.out.println("Total Marks:"+total);
        System.out.println("Average Marks:"+average);
        System.out.println("Grade"+grade);
        System.out.println("Message"+Message);










    }

    // student name
       /* Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter student name");

        String name = scanner.nextLine();

        //3 subject mark
// Accept marks for 3 subjects
        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int subject3 = scanner.nextInt();

        // Calculate total and average
        int total = subject1 + subject2 + subject3;

        // average mark
        float average = total/ 3f;




        // grades
        char grade;
        if (average >= 90) {
        grade = 'A';
    } else if (average >= 80) {
        grade = 'B';
    } else if (average >= 70) {
        grade = 'C';
    } else if (average >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }

    // text  grade



        switch (grade) {
            case'A':
                System.out.println("Excellent work!");
                break;
            case'B':
                System.out.println("Great job!");
                break;
            case'C':
                System.out.println("Good effort!" );
                break;
            case'D':
                System.out.println("You passed, but aim higher." );
                break;
            case'F':
                System.out.println("You need to improve." );
                break;
            default:
                System.out.println("Invalid grade.");
    }

    // sample output

        System.out.println("Student:"+name);
        System.out.println("TotalMarks:"+total);
        System.out.println("AverageMarks:"+average);
        System.out.println("Grade:"+grade);

    }*/


}