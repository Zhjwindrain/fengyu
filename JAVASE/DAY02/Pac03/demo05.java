package JAVASE.DAY02.Pac03;

//数组边界
//下标的合法区间：[0,length-1],如果越界就会报错
public class demo05 {
    public static void main(String[] args) {
        int[] a = new int[2];
        System.out.println(a[2]);//错误，数组越界
        //ArrayIndexOutOfBoundsException
    }
}
