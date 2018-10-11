package ATlab;

public class Calc {

    public Calc() {}

    static double getSum(double v1, double v2) {
        return v1 + v2;
    }

    static double getAverage(double v1, double v2) {
        return (v1 + v2)/2;
    }

    public static void totalGrade1(String name, double avgMid){
        System.out.println(name + " " + avgMid);
    }

    public static void totalGrade2(String name, double midterm1, double midterm2){
        System.out.print(name + " ");
        double grade = getAverage(midterm1, midterm2);
        System.out.print(grade);
    }
}
