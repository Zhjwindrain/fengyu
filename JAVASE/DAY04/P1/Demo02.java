package JAVASE.DAY04.P1;
//Object getClass() 方法用于获取对象的运行时对象的类。
public class Demo02 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1.getClass());
        Demo02 obj2 = new Demo02();
        System.out.println(obj2.getClass());
    }
}
