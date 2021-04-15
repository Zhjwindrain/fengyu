package JAVASE.DAY02.Pac01;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //if语句

            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入成绩：");
            int score = scanner.nextInt();
            if (score==100){
                System.out.println("恭喜满分");
            }else if (score<100 && score >=90){
                System.out.println("A级");
            }else if (score<90 && score >=80){
                System.out.println("B级");
            }else if (score<80 && score >=70){
                System.out.println("C级");
            }else if (score<70 && score >=60){
                System.out.println("D级");
            }else if (score<60 && score >=0){
                System.out.println("不及格！");
            }else {
                System.out.println("成绩输入不合法！");
            }
            scanner.close();
        }

    }

