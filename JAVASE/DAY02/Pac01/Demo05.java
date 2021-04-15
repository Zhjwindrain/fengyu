package JAVASE.DAY02.Pac01;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char grade ='A';




        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("结束");


        }

        System.out.println("你的等级是"+grade);
    }
}
