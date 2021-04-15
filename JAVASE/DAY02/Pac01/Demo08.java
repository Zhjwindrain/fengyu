package JAVASE.DAY02.Pac01;

public class Demo08 {
    public static void main(String[] args) {
        for (int j = 1; j <= 1000; j++) {
            if (j % 5 == 0) {
                System.out.print(j+"\t");
            }
            if(j%15==0){
                System.out.println();
            }
        }
    }
}