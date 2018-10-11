package AMasig;

import java.util.Scanner;

public class asig3 {
    public static void main(String[] args)
    {
        double sum = 0;
        int track = 0;
        double inputL = 0;
        double inputS = 0;

        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("Type an input here, or 0 to quit: ");
            double input = scan.nextDouble();
            if (input != 0)
            {
                if (track == 0) {
                    inputL = input;
                    inputS = input;
                }
                else if (track != 0)
                {
                    if (input >= inputL) {
                        inputL = input;
                    } else if (input <= inputS) {
                        inputS = input;
                    }
                }
            sum += input;
            track++;
            }
            else if (input == 0){
                break;
            }
        }

        if (track == 0)
        {
            System.out.print("You did not enter any input.");
        }
        else if (track > 0)
        {
            System.out.println("The sum of your inputs is " + sum);
            System.out.println("The total number of inputs provided is " + track);
            System.out.println("The average of your inputs is " + (double)(sum/track));
            System.out.println("The highest number of your inputs was " + inputL);
            System.out.print("The lowest number of your inputs was " + inputS);
        }
    }
}
