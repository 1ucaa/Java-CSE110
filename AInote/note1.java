package AInote;

import java.util.Scanner;

public class note1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase(); // To make it easier to search for occurances.

        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // System.out.println(str.endsWith("llo"));                 // Boolean
        // System.out.println(str.startsWith("h"));                  // Boolean
        // System.out.println(str.contains("llo"));                   // Does it contain "llo?"
        // System.out.println(str.indexOf("l",str.indexOf("l") + 1)); // Index of "l" starting one after the first "l."
        // System.out.println(str.length());                         // Counts how many indexes there are.
        // System.out.println(str.substring(2));                    // This index until end.
        // System.out.println(str.substring(2,8));                 // Goes from index 2 until 8, not including 8.
        // System.out.println(str.concat(" pie"));                // Adds "pie" to the end of string.
        System.out.println(str + " pie");                        // ^^ Same thing

        scan.close();
    }
}
