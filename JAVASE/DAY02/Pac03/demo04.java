package JAVASE.DAY02.Pac03;

public class demo04 {
    public static void main(String[] args) {
        //三种初始化

        //1.静态初始化
        //直接在定义数组的同时为数组元素分配空间和值
        int[] a = {1,2,3};

        //2.动态初始化
        int[] a1 = new int[2];
        a[0] = 1 ;
        a[1] = 2 ;

        //3.数组的默认初始化
        //数组是引用类型，它的元素相当于类的实例变量。因此数组
        //一经分配空间，其中的每个元素也被按照实例变量同样的方式
        //被隐式初始化。
    }
}
