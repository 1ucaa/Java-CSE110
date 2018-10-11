package AJlab;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Give me the percentage you received: ");
        double read = scan.nextDouble();
        int swRead = (int)(read/10);

        if (swRead == 9 || swRead == 10)
        {
            System.out.print("You got a");
            System.out.print("n A!");
        }
        else if (swRead == 8)
        {
            System.out.print("You got a");
            System.out.print(" B!");
        }
        else if (swRead == 7)
        {
            System.out.print("You got a");
            System.out.print(" C!");
        }
        else if (swRead == 6)
        {
            System.out.print("You got a");
            System.out.print(" D!");
        }
        else if (swRead <= 5 && swRead >= 0)
        {
            System.out.print("You got a");
            System.out.print(" F!");
        }
        else
        {
            System.out.print("Cannot accept input.");
        }

        while (true) {
            System.out.print("\nGive me the percentage you received: ");
            read = scan.nextDouble();
            swRead = (int)(read/10);
            switch (swRead) {
                case 10: case 9: {
                    System.out.print("You've received an A!");
                    break;
                }
                case 8: {
                    System.out.print("You've received a B!");
                    break;
                }
                case 7: {
                    System.out.print("You've received a C!");
                    break;
                }
                case 6: {
                    System.out.print("You've received a D!");
                    break;
                }
                case 5: // Intentional.
                case 4:
                case 3:
                case 2:
                case 1: {
                    System.out.print("You've received an F!");
                    break;
                }
                default: break;
            }
            if (read >= 0 && read < 10)
            {
                System.out.print("You've received an F!");
            }
            else if (read < 0 || read >= 110) {
                System.out.print("Invalid Input. Ending program.");
                break;
            }
        }

    }
}
