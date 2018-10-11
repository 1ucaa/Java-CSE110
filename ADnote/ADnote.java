package ADnote;

import java.util.Scanner;

public class ADnote {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number:");
        int input = scan.nextInt();
        scan.nextLine(); // Eat the extra new line
        String str = scan.nextLine();
        System.out.println("The integer you typed was " + input);
        System.out.print("The string you typed was " + str);
    }
}
