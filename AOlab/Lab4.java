package AOlab;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("A right triangle of stars with a base and height of 10");

           for (int i = 0; i < 10; i++)
           {
               for (int i2 = 0; i2 <= i; i2++)
               {
                   System.out.print("*");
                   if (i2 == i)
                   {
                       System.out.print("\n");
                   }
               }
           }

           System.out.print("Enter a number: ");
           int input = scan.nextInt();

           System.out.print("All the even numbers from 2 to " + input + " are: ");
           for (int i = 2; i < input; i += 2)
           {
               System.out.print(i + " ");
           }

           System.out.print("\nAll the odd numbers from 2 to " + input + " are: ");
           for (int i = 3; i < input; i += 2)
           {
               System.out.print(i + " ");
           }
    }
}
