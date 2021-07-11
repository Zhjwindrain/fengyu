package JAVASE.DAY04.P2;

public class Demo04 {
    public static void main(String[] args) {
// 创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
// boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println("-----------");
// boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s3)); //true
        System.out.println("-----------");
// boolean startsWith(String str):判断字符串对象是否以指定的str开头
        System.out.println(s1.startsWith("he")); //true
        System.out.println(s1.startsWith("ll")); //false
    }
}
