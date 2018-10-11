package AQlab;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers for the sum: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println(getSum(num1, num2));

        System.out.println("Enter two numbers for the average: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        System.out.println(getAverage(num1, num2));

        scan.nextLine();

        System.out.println("Give me your name: ");
        String name = scan.nextLine();

        System.out.println("Give me the scores of your two midterms: ");
        double midterm1 = scan.nextDouble();
        double midterm2 = scan.nextDouble();
        double m1a = getAverage(midterm1, midterm2);

        totalGrade1(name, m1a);

        scan.nextLine();


        System.out.println("Give me your name: ");
        name = scan.nextLine();

        System.out.println("Give me the scores of your two midterms: ");
        midterm1 = scan.nextDouble();
        midterm2 = scan.nextDouble();

        totalGrade2(name, midterm1, midterm2);


        scan.close();
    }
    static double getSum(double num1, double num2)
    {
        return num1 + num2;
    }
    static double getAverage(double num1, double num2)
    {
        return (num1+num2)/2.0;
    }
    public static void totalGrade1(String nm, double avg)
    {
        System.out.println(nm + " " + avg);
    }
    public static void totalGrade2(String nm, double mid1, double mid2)
    {
        double grade = getAverage(mid1,mid2);
        System.out.println(nm + " " + grade);
    }
}