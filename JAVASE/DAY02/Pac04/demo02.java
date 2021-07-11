package JAVASE.DAY02.Pac04;

import java.util.Arrays;

public class demo02 {
    //数组排序
    //对指定的int型数组按数字升序进行排序
    public static void main(String[] args) {
        int[] a = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
