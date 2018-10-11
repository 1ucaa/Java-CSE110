package ANasig;

import java.util.Scanner;

public class asig4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int hei;
        boolean pyr = true;

        while (true)
        {
            System.out.println("Enter the height of the pyramid between 1 and 25: ");
            hei = scan.nextInt();
            scan.nextLine();
            if (hei >= 1 && hei <= 25)
            {
                break;
            }
            else
            {
                System.out.print("Invalid input. ");
            }
        }

        System.out.println("Would you like a diamond instead of a pyramid?");
        System.out.println("Yes or No? ");
        String ans = scan.nextLine().toUpperCase();

        while (ans.equals("YES") == false && ans.equals("NO") == false) {
            System.out.println("Invalid input. A diamond instead, Yes or No? ");
            ans = scan.nextLine().toUpperCase();
        }

        if (ans.equals("YES")) {
            pyr = false;
        }


        int stars = 1;
        System.out.print("Printing a ");


        if (pyr == true)
        {
            System.out.println("pyramid.");
        }
        else
        {
            System.out.println("diamond.");
        }
        for (int line = 1; line <= hei; line++)
        {
            for (int sp = 0; sp < (hei-line); sp++) {
                System.out.print(" ");
            }
            if (line == 1)
            {
                System.out.print("*");
            }
            else
            {
                for (int i = 0; i < stars; i++)
                    System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
        stars -= 2;
        if (pyr == false) {
            for (int line = hei+1; line <= ((hei*2)-1); line++)
            {
                for (int sp = 0; sp < (line-hei); sp++)
                {
                    System.out.print(" ");
                }
                for (int i = 0; i < (stars-2); i++ )
                {
                    System.out.print("*");
                }
                System.out.println();
                stars -= 2;
            }
        }
    }
}
