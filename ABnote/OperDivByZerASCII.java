package ABnote;

public class OperDivByZerASCII {


    public static void main(String[] args)
    {

        int test = 5;
        int test2 = 2;

        int dub = (int)0.0;

        String str = "";

        int test3 = 1;
        test3 = test3 + 1;
        test3 += 1;
        test3 ++;
        test3 -= 1;
        test3 --;
        test3 *= 2;
        test3 /= 2;
        test3 %= 2;


        char myCha = 'a';

        System.out.println("The answer is: " + (test + test2));

        System.out.println(str + test + test2);
        System.out.println(5.0 / dub); // Converts answer to double and "allows" division by zero

        System.out.println("a is ASCII number: " + (int)(myCha)); // ASCII number of 'a'

        System.out.println('a' > 'b'); // boolean to see if int 'a' is larger than 'b'

        System.out.println(8 % 2); // Modulus

        System.out.println((test3 >= test2));

        System.out.print((char)(myCha + 1)); // add one to the ASCII value to 'b'
    }
}
