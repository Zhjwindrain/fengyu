package JAVASE.DAY04.P1;
//常用类
//toString()方法
public class Demo01 {
    //toString() 方法用于返回以一个字符串表示的 Number 对象值。
    //
    //如果方法使用了原生的数据类型作为参数，返回原生数据类型的 String 对象值。
    //
    //如果方法有两个参数， 返回用第二个参数指定基数表示的第一个参数的字符串表示形式。
    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
        //toString(): 返回表示 Integer 值的 String 对象。
        //
        //toString(int i): 返回表示指定 int 的 String 对象。
    }
}
