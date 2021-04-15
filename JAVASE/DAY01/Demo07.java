package JAVASE.DAY01;

public class Demo07 {
    //低------------------------------->高
    //byte,short,char->int->long->float->double
    //浮点数到整数通过舍弃小数得到


    //自动类型转换
    public static void main(String[] args) {
        char c1='a';
        int i1=c1+1;
        System.out.println(i1);//char自动转换成int

        //强制类型转换
        double x=3.14;
        int nx=(int) x;
        System.out.println(nx);

        //0b开头可写二进制整数
        //1_5655_6654下划线分隔符


    }
}
