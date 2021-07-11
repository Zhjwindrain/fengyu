package JAVASE.DAY04.P2;
/**
 * StringBuilder 的replace()示例
 */
public class Demo10 {
    public static void main(String[] args) {
        StringBuilder sbuilder;
        sbuilder = new StringBuilder("0123456789");
        sbuilder.replace(0, 3, "ABCDE");
        System.out.printf("sbuilder=%s\n", sbuilder);
        sbuilder = new StringBuilder("0123456789");
        sbuilder.reverse();
        System.out.printf("sbuilder=%s\n", sbuilder);
        sbuilder = new StringBuilder("0123456789");
        sbuilder.setCharAt(0, 'M');
        System.out.printf("sbuilder=%s\n", sbuilder);
        System.out.println();
    }
    }

