package JAVASE.DAY02.Pac01;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        float f=0.0f;
        System.out.println("输入整数：");
        if(scan.hasNextInt()){
            i=scan.nextInt();
            System.out.println("输出整数："+i);
        }else{
            System.out.println("输入的不是整数");

        }
        System.out.println("输入小数：");
        if(scan.hasNextFloat()){
            f=scan.nextFloat();
            System.out.println("输出的小数："+f);
        }else{
            System.out.println("输入的不是小数");
        }
        scan.close();

    }
}
