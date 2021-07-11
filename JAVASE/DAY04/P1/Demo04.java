package JAVASE.DAY04.P1;

import java.util.ArrayList;

//Object hashCode() 方法用于获取对象的 hash 值。
public class Demo04 {
    public static void main(String[] args) {
        //object使用hashcode
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());//685625104
        System.out.println(obj2.hashCode());//460141958

        //String 和 ArrayList 类使用 hashCode() 方法
        //String 和 ArrayList 类都继承了 Object，所以可以直接使用 hashCode() 方法：
        String s1 = new String();
        System.out.println(s1.hashCode());
        ArrayList<Object> list = new ArrayList<>();
        System.out.println(list.hashCode());
    }
}
