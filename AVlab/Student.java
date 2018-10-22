package AVlab;

public class Student
{
    private String name;
    private String major;
    private int studentId;
    private double GPA;
    private double age;

    public Student() {
        name = "";
        major = "";
        studentId = 49;
        GPA = 0.0;
        age = 18;
    }

    public Student(String na, String ma, int studId, double gpa, double ag) {
        name = na;
        major = ma;
        studentId = studId;
        GPA = gpa;
        age = ag;
    }

    public void setName(String stName) {
        name=stName;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String stMaj) {
        major=stMaj;
    }

    public void setGPA(double stGPA) {
        GPA=stGPA;
    }
    public double getGPA() {
        return GPA;
    }
    public void setstudentId(int ststudentId) {
        studentId=ststudentId;
    }
    public int getstudentId() {
        return studentId;
    }
    public void setage(double stage) {
        age=stage;
    }
    public double getage() {
        return age;
    }
    public static Student makeStudent(String na, String ma, int stu, double gpa, double age) {
        Student stu2 = new Student(na, ma, stu, gpa, age);
        return stu2;
    }
}