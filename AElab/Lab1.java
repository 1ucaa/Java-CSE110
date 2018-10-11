package AElab;

import java.util.*;

public class Lab1 {

    public static void main(String[] args){
        System.out.print("Give me an integer: ");
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt(); // Line to set input to int.
        System.out.println("The int you have entered is "+input1); // Verify the number.

        System.out.print("Now a second integer: ");
        int input2 = scan.nextInt();
        System.out.println("The int you have just entered is "+input2);

        System.out.println("Addition = " + (input1+input2));
        System.out.println("Subtraction = " + (input1-input2));
        System.out.println("Multiplication = " + (input1*input2));
        System.out.println("Integer Division = " + (input1/input2));
        System.out.print("Modulus = " + (input1%input2));

    }

}
