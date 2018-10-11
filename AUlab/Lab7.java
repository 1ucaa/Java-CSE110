package AUlab;

import java.util.Scanner;

public class Lab7 {
        public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);
            Student Student1 = new Student();

            System.out.println("enter the name of the student:");
            String name1 = scan.next();
            Student1.setName(name1);
            System.out.println("enter the major of the student:");
            String maj1 = scan.next();
            Student1.setMajor(maj1);
            System.out.println("enter the id of the student:");
            scan.nextLine();
            int stuId1 = scan.nextInt();
            Student1.setStudentId(stuId1);
            System.out.println("enter the gpa of the student:");
            double gpa1 = scan.nextDouble();
            Student1.setGpa(gpa1);
            System.out.println("enter the age of the student:");
            int age1 = scan.nextInt();
            Student1.setAge(age1);

            System.out.println(Student1.getName() + Student1.getAge());

            scan.close();
        }
}
