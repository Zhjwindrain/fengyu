package JAVASE.DAY04.P2;

public class Demo07 {
    //去除字符串两端空格：String trim()
    //按照指定符号分割字符串：String[] split(String str)
    public static void main(String[] args) {
        String s = "aa,bb,cc";
        String[] strArray = s.split(",");
        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(strArray[i]);
            
        }
    }
}
