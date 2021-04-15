package JAVASE.DAY02.Pac01;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//从键盘接受数据

        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输入内容:"+str);
        }
    }
}
