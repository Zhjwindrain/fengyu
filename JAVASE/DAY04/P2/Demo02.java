package JAVASE.DAY04.P2;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random random = new Random(25);
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(100)+" ");
        }
    }
}
