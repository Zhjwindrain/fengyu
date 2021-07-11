package JAVASE.DAY04.P1;
//【2、 将字符串转换为整数】
//Integer 类有一个静态的 paseInt() 方法，可以将字符串转换为整数，语法为：
public class Demo07 {
    public static void main(String[] args) {
        //parseInt(String s, int radix);
        //s 为要转换的字符串，radix 为进制，可选，默认为十进制。
        String[] str = {"123","123abc","abc123","adcsd"};
        for(String str1 : str){
            try {
                int m  = Integer.parseInt(str1,10);
                System.out.println(str1+"可以转化为整数"+m);
            } catch (NumberFormatException e) {
                System.out.println(str1+"不能转化为整数");
            }
        }
        }

    }

