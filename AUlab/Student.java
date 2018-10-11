package AUlab;

public class Student {
    String name;
    String major;
    int studentId;
    double gpa;
    int age;

    public Student() {
        name = "";
        major = "";
        studentId = 0;
        gpa = 0.0;
        age = 0;
    }

    public void setName(String stName) {
        name=stName;
    }

    public void setAge(int inAge) {
        age = inAge;
    }

    public String getAge() {
        if (age >= 6 && age <= 11) {
            return " is in elementary school.";
        } else if (age >= 12 && age <= 14) {
            return " is in middle school.";
        } else if (age >= 15 && age <= 18) {
            return " is in high school.";
        } else {
            return "'s age not in range.";
        }
    }

    public void setMajor(String maj) {
        major = maj;
    }

    public void setStudentId(int stuId1) {
        studentId = stuId1;
    }

    public void setGpa(double gpa1) {
        gpa = gpa1;
    }

    public String getName() {
        return name;
    }
}
