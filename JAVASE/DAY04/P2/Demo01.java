package JAVASE.DAY04.P2;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);

    }
}
