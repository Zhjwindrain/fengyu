package JAVASE.DAY04.P3;

public class Demo03 {
    public static void main(String[] args) {
        StringBuilder sbuilder = new StringBuilder("0123456789");
        int cap = sbuilder.capacity();
        System.out.printf("cap=%d\n", cap);
/*
capacity()返回的是字符串缓冲区的容量
StringBuffer( ); 分配16个字符的缓冲区
StringBuffer( int len ); 分配len个字符的缓冲区
StringBuffer( String s ); 除了按照s的大小分配空间外,再分配16个 字符的缓冲区
你的StringBuffer是用字符构造的，"0123456789"的长度是10另外再分配16个字符，所
以一共是26。
*/
        char c = sbuilder.charAt(6);
        System.out.printf("c=%c\n", c);
        char[] carr = new char[4];
        sbuilder.getChars(3, 7, carr, 0);
        for (int i=0; i<carr.length; i++){
            System.out.printf("carr[%d]=%c ", i, carr[i]);
        }
        System.out.println();
    }
}
