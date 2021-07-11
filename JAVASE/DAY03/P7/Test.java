package JAVASE.DAY03.P7;

public class Test {

    //可能存在异常的方法

    static void test(int a) throws MyException {

        System.out.println("传递的参数为："+a);
        if(a>10){
            throw new MyException(a); //抛出
        }

        System.out.println("OK");

    }

    public static void main(String[] args) {
        try {
            test(1);
        } catch (MyException e) {
            //增加一些处理异常的代码~
            System.out.println("MyException=>"+e);
        }
    }
}
