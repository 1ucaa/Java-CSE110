package AVlab;

import java.util.Scanner;

public class Lab8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Input name:");
            String name = scan.nextLine();

            System.out.println("Input major:");
            String maj = scan.nextLine();

            System.out.println("Input ID #:");
            int stuI = scan.nextInt();

            System.out.println("Input GPA:");
            double gpa = scan.nextDouble();

            System.out.println("Input age:");
            double age = scan.nextDouble();

            Student foo = makeStudent(name, maj, stuI, gpa, age);

            displayStudent(foo);

        }
    public static Student makeStudent(String na, String ma, int stu, double gpa, double age) {
        Student stu2 = new Student(na, ma, stu, gpa, age);
        return stu2;
    }

    public static void displayStudent(Student stu) {
            System.out.println("Name:" + stu.getName());
            System.out.println("Major:" + stu.getMajor());
            System.out.println("Student ID:" + stu.getstudentId());
            System.out.println("GPA:" + stu.getGPA());
            System.out.println("Age:" + stu.getage());

    }
}


