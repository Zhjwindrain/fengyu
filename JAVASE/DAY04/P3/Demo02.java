package JAVASE.DAY04.P3;
//index
public class Demo02 {
    public static void main(String[] args) {
        StringBuilder sbuilder = new StringBuilder("abcAbcABCabCaBcAbCaBCabc");
        System.out.printf("sbuilder=%s\n", sbuilder);
// 1. 从前往后，找出"bc"第一次出现的位置
        System.out.printf("%-30s = %d\n", "sbuilder.indexOf(\"bc\")",
                sbuilder.indexOf("bc"));
// 2. 从位置5开始，从前往后，找出"bc"第一次出现的位置
        System.out.printf("%-30s = %d\n", "sbuilder.indexOf(\"bc\", 5)",
                sbuilder.indexOf("bc", 5));
// 3. 从后往前，找出"bc"第一次出现的位置
        System.out.printf("%-30s = %d\n", "sbuilder.lastIndexOf(\"bc\")",
                sbuilder.lastIndexOf("bc"));
// 4. 从位置4开始，从后往前，找出"bc"第一次出现的位置
        System.out.printf("%-30s = %d\n", "sbuilder.lastIndexOf(\"bc\", 4)",
                sbuilder.lastIndexOf("bc", 4));
        System.out.println();
    }
}
