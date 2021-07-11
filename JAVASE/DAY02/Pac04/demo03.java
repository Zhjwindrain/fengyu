package JAVASE.DAY02.Pac04;

import java.util.Arrays;

public class demo03 {
    //二分法查找
    public static void main(String[] args) {
        int[] a ={1,2,323,23,543,12,59};
        Arrays.sort(a);//使用二分法查找，必须先对数组进行排序
        System.out.println("该元素的索引:"+Arrays.binarySearch(a,12));
    }
}
