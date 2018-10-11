package ALasig;

import java.util.Scanner;
import java.lang.String;

public class asig2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Give me a full string. ");
        String first = scan.nextLine();

        System.out.println("Give me a substring that you want to find in that string. ");
        String sec = scan.nextLine();

        System.out.println("Would you like to consider spaces when searching? 1 for yes, 0 for no. ");
        String req1 = scan.nextLine();
        int req01 = Integer.parseInt(req1);

        System.out.println("Would you like to consider capitalization when searching? 1 for yes, 0 for no. ");
        String req2 = scan.nextLine();
        int req02 = Integer.parseInt(req2);

        if (req01 == 0)
        {
            first = first.replaceAll("\\s", "");
            sec = sec.replaceAll("\\s","");
        }

        if (req02 == 0)
        {
            first = first.toLowerCase();
            sec = sec.toLowerCase();
        }

        if (first.startsWith(sec) && first.endsWith(sec)) {
            System.out.print("Your search is equal to the entire input.");
        } else if (first.contains(sec) == false) {
            System.out.print("Your search is not found within the input.");
        } else if (first.startsWith(sec)) {
            System.out.print("Your search is at the beginning of the input.");
        } else if (first.endsWith(sec)) {
            System.out.print("Your search is at the end of the input.");
        } else if (first.contains(sec)) {
            System.out.print("Your search starts at index " + first.indexOf(sec) + " and ends at index " + (first.indexOf(sec)+(sec.length()-1)) + ".");
        }
    }
}
