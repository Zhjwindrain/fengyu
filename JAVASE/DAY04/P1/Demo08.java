package JAVASE.DAY04.P1;
//【 3、将整数转换为字符串】
//Integer 类有一个静态的 toString() 方法，可以将整数转换为字符串。或者直接在整数后面加空字符串即
//可！
public class Demo08 {
    public static void main(String[] args) {
        int m = 500;
        String s = Integer.toString(m);
        System.out.println("s="+s);
    }
}
