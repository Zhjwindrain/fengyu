package JAVASE.DAY03.P1.OOP.superTest;

public class Student extends Person{
    private String name = "fengyu";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
