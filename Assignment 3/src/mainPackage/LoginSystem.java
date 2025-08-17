package mainPackage;

import java.util.Scanner;

public class LoginSystem {

        //declaration of variables
        public static String Email = null;
        public static String Pass = null;
        public static  String secretCode = null;
        public static String fullName = null;
        public static int age;
        public static int marks;
        public static  char grade;




        //login method
        public static void login() {
            Scanner input = new Scanner(System.in);


            //predefined login credential
            final String correctMail = "mohamed@intrast.com";
            final String correctPass = "mohamed123";
            // allow three login attempts
            for (int attempts = 1; attempts <= 3; attempts++) {
                System.out.println("Enter your Email!");
                Email = input.nextLine();
                System.out.println("Enter your Pass!");
                Pass = input.nextLine();
                //check user credentials
                if (Email.equals(correctMail) && Pass.equals(correctPass)) {
                    System.out.println("Login successful. Welcome!");
                    break;
                } else {
                    System.out.println(" Invalid email or password. Attempt " + attempts + " of 3.");
                }
                // after three wrong entiries
                if (attempts == 3) {
                    System.out.println("Too many failed attempts,Account locked");
                    System.exit(0);
                }
            }
        }



        //collect user data method
        public static void userData(){
            Scanner input = new Scanner(System.in);
            // user data
            System.out.println("enter your secret code ! ");
            secretCode = input.nextLine();

            System.out.println("Enter your full name ");
            fullName = input.nextLine();

            System.out.println("Enter your age please!");
            age = input.nextInt();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter your grade must be an integer  between 0 -> 100");

                if (input.hasNextInt()) {
                    marks = input.nextInt();



                    // Grade Evaluation
                    if (marks >= 0 && marks <= 100) {
                        if (marks >= 90 ) {
                            grade = 'A';
                        } else if (marks >= 80 && marks <= 89) {
                            grade = 'B';
                        } else if (marks >= 70 && marks <= 79) {
                            grade = 'C';
                        } else if (marks >= 60 && marks <= 69) {
                            grade = 'D';
                        } else {
                            grade = 'F';
                        }
                        break;
                    } else {
                        System.out.println("Invalid Marks -> must be (0-->100)  Attempt " + i + " of 3.");
                        marks = -1;
                    }
                } else {
                    System.out.println("Invalid input.Please enter a number!  Attempt " + i + " of 3.");
                    input.next();
                }
                if (i == 3) {
                    System.out.println("too many invalid attempts, Exiting program!!");
                    System.exit(0);
                }
            }
        }



        //print userData method
        public static void printUserData(){
            String invalidGrade = "you Enter invalid marks, there is no Grade!!!";
            System.out.println("==== User Information ====");
            System.out.println("your Email: " + Email);
            System.out.println("your Password: " + Pass);
            System.out.println("your Secret Code: " + secretCode);
            System.out.println("your Full Name: " + fullName);
            System.out.println("your Age: " + age);
            if (marks == -1) {
                System.out.println("invalidGrade");
            } else {
                System.out.println("your Grade: " + grade);
            }
        }
        public static void main(String[] args) {


            login();
            userData();
            printUserData();


        }
}
