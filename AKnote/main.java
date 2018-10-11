package AKnote;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        do {
            System.out.println(input++); // If it was ++input it would go to 10, it evaluates THEN stores it.
        } while (input < 10);

        int first = scan.nextInt();
        int second = 0;
        int count = 0;

        while (count < first)
        {
            int innerCount = 0;
            while(innerCount < first){
                second++;
                innerCount++;
            }
            count++;
        }
    }
}
