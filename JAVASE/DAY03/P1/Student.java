package JAVASE.DAY03.P1;

public class Student {
    private static int age; //静态的变量  多线程
    private double score; //非静态的变量
    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args) {
        go();
        System.out.println(Student.age);
        Student student = new Student();

        System.out.println(student.score);
    }


}
