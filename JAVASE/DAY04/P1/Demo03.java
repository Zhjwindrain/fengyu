package JAVASE.DAY04.P1;
//Object equals() 方法用于比较两个对象是否相等。
//
//equals() 方法比较两个对象，是判断两个对象引用指向的是同一个对象，即比较 2 个对象的内存地址是否相等。
public class Demo03 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));//false ,不同对象内存地址不同

        //string类重写equals方法
        //String 类重写了 equals() 方法，用于比较两个字符串是否相等：
        String s1 = new String();
        String s2 = new String();
        System.out.println(s1.equals(s2));//true,都为空

        s1 = "xiaoming";
        s2 = "xiaohong";
        System.out.println(s1.equals(s2));

    }
}
