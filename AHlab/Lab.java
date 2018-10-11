package AHlab;

import java.util.Scanner;

public class Lab {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int age;
        double num1;
        double num2;
        String firstName;
        String lastName;
        String fullName;

        System.out.print("What is your first name? ");
        firstName = scan.nextLine();

        System.out.print("What is your last name? ");
        lastName = scan.nextLine();

        System.out.print("What is your age? ");
        age = scan.nextInt();

        System.out.print("1st Number? ");
        num1 = scan.nextDouble();

        System.out.print("2nd Number? ");
        num2 = scan.nextDouble();

        fullName = firstName + " " + lastName;

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println("Uppercase full name is: " + fullName.toUpperCase());

        if (num1 > num2) {
            System.out.print("num1 is bigger than num2.");
        } else if (num1 < num2) {
            System.out.print("num2 is bigger than num1.");
        } else {
            System.out.print("The two numbers are equal.");
        }
    }

}
