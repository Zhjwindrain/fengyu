package JAVASE.DAY04.P2;

public class Demo06 {
    public static void main(String[] args) {
        String s = "abcde";
        char[]chs = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            System.out.println(chs[i]);
            System.out.println("-----------");
// String toLowerCase():把字符串转换为小写字符串
            System.out.println("HelloWorld".toLowerCase());
// String toUpperCase():把字符串转换为大写字符串
            System.out.println("HelloWorld".toUpperCase());
        }
    }
}
