package JAVASE.DAY02.Pac01;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        double sum=0;//求和
        double m=0;//计算数字个数

        while(scan.hasNextDouble()){
            double x= scan.nextDouble();
            sum=sum+x;
            m=m+1;


        }
        System.out.println(m+"个数的和为："+sum);
        System.out.println(m+"个数的平均值为："+(sum/m));
        scan.close();
    }
}
