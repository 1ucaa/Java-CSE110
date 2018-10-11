package APnote;

import java.util.Scanner;

public class IntroToClasses
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        House myCrib = new House();
        House otherCrib = new House("Purple",4,"Wood",500); // Must give all values.

        System.out.println(myCrib.getStories());
        System.out.println(otherCrib.getStories());
        System.out.println(myCrib.color);
        System.out.println(otherCrib.mats);

        myCrib.color = "Blue";
        System.out.print(myCrib.color);

        scan.close();
    }
}
