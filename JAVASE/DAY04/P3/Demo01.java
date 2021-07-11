package JAVASE.DAY04.P3;

public class Demo01 {
    public static void main(String[] args) {
        StringBuilder sbuilder = new StringBuilder("0123456789");
        // 删除位置0的字符，剩余字符是“123456789”。
        sbuilder.deleteCharAt(0);
// 删除位置3(包括)到位置6(不包括)之间的字符，剩余字符是“123789”。
        sbuilder.delete(3,6);
// 获取sb中从位置1开始的字符串
        String str1 = sbuilder.substring(1);
// 获取sb中从位置3(包括)到位置5(不包括)之间的字符串
        String str2 = sbuilder.substring(3, 5);
// 获取sb中从位置3(包括)到位置5(不包括)之间的字符串，获取的对象是CharSequence对
        //象，此处转型为String
        String str3 = (String)sbuilder.subSequence(3, 5);
        System.out.printf("sbuilder=%s\nstr1=%s\nstr2=%s\nstr3=%s\n",
                sbuilder, str1, str2, str3);
    }
    }

