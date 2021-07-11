package JAVASE.DAY02.Pac02;
//方法的调用

public class Demo01 {
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
        //方法的重载

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(20.1,30.1));
    }
}
