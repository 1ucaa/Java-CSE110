package AAnote;

public class DecInitTypes {

    /*
    Block comment...
     */

    public static void main(String[] args)
    {
        int test, test2; // Declaring: must be declared before initialized.
        test = 5; // Initializing

        test2 = 2; // Can declare two+ variables at a time.

        double dub = 2;

        System.out.println("The answer is " + (test + test2 + 10 + dub) + " which is kew.");
        System.out.print(100.0/3); // Integer division. Cuts off the decimal.

    }
}
