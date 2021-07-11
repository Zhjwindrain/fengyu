package JAVASE.DAY04.P1;
//【1、 实现 int 和 Integer 的相互转换】
//可以通过 Integer 类的构造方法将 int 装箱，通过 Integer 类的 intValue 方法将 Integer 拆箱。
public class Demo06 {
    public static void main(String[] args) {
        int m = 500;
        Integer obj1 = new Integer(m);
        int n = obj1.intValue();
        System.out.println("n="+n);
        Integer obj2 = new Integer(500);
        System.out.println("obj1等价于obj2?"+obj1.equals(obj2));

    }
}
