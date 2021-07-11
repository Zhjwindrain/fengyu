package JAVASE.DAY02.Pac04;

import java.util.Arrays;

//元素填充,2-4为[2,4)的意思
public class demo04 {
    public static void main(String[] args) {
       int[] a ={1,2,323,23,543,12,59};
        Arrays.sort(a);
        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));//[1, 2, 100, 100, 59, 323, 543]
    }
}
