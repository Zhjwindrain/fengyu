package JAVASE.DAY02.Pac02;
//递归
//递归的基本思想就是自己调用自己
public class Demo03 {
    //递归结构包括两个部分：
    //1.递归头：什么时候不调用自身方法。如果没有头，将陷入死循环。
    //2.递归体：什么时候需要调用自身方法。

    //演示使用代码计算5的阶乘
    public static void main(String[] args) {

        System.out.println(f(5));
    }
    public static int f(int n){
        if(1==n)
            return 1;
        else
            return n*f(n-1);
    }

}
