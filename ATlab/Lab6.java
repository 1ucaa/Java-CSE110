package ATlab;

import java.util.Scanner;
import static ATlab.Calc.getAverage;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calc c = new Calc();

        System.out.println("Enter two numbers for the sum:");
        double var1 = scan.nextDouble();
        double var2 = scan.nextDouble();
        System.out.println(c.getSum(var1,var2));

        System.out.println("Enter two numbers for the average:");
        var1 = scan.nextDouble();
        var2 = scan.nextDouble();
        System.out.println(getAverage(var1,var2));

        scan.nextLine();

        System.out.println("for totalGrade1, Enter the student's name:");
        String nm = scan.nextLine();
        System.out.println("Enter two midterm scores:");
        double midterm1 = scan.nextDouble();
        double midterm2 = scan.nextDouble();

        scan.nextLine();

        c.totalGrade1(nm,getAverage(midterm1,midterm2));

        System.out.println("for totalGrade2, Enter the student's name:");
        nm = scan.nextLine();
        System.out.println("Enter two midterm scores:");
        midterm1 = scan.nextDouble();
        midterm2 = scan.nextDouble();

        c.totalGrade2(nm,midterm1,midterm2);

        scan.close();
    }
}
