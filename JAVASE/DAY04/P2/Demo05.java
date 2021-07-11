package JAVASE.DAY04.P2;

import java.sql.SQLOutput;

public class Demo05 {
    public static void main(String[] args) {
        // 创建字符串对象
        String s = "helloworld";
// int length():获取字符串的长度，其实也就是字符个数
        System.out.println(s.length()); //10
        System.out.println("--------");
// char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0)); //h
        System.out.println(s.charAt(1)); //e
        System.out.println("--------");
// int indexOf(String str):获取str在字符串对象中第一次出现的索引
        System.out.println(s.indexOf("l")); //2
        System.out.println(s.indexOf("owo")); //4
        System.out.println(s.indexOf("ak")); //-1
        System.out.println("--------");
// String substring(int start):从start开始截取字符串
        System.out.println(s.substring(0)); //helloworld
        System.out.println(s.substring(5)); //world
        System.out.println("--------");
// String substring(int start,int end):从start开始，到end结束截取字符串
        System.out.println(s.substring(0, s.length())); //helloworld
        System.out.println(s.substring(3, 8)); //lowor
    }

}
