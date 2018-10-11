package ACnote;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args){
        System.out.print("I'll repeat you, go: ");
        Scanner scan = new Scanner(System.in); // Variable to simplify.

        //int input = scan.nextInt(); // Listens for an integer.
        String input = scan.nextLine();
        System.out.println(input);

        scan.close();
    }
}
