package AXlab;

public class Student {
    private String name;
    private int age;
    private String major;
    private int studentID;
    private double GPA;

    public Student(){
        name = "Alice";
        age = 18;
        major = "Computer Science";
        studentID = 1212345678;
        GPA = 3.56;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

    private String setStudentID()
    {
        return this.GPA;
    }
}
