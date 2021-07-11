package JAVASE.DAY03.P7;

//自定义的异常类
public class MyException extends Exception{

    private int detail;

    public MyException(int a ) {

        this.detail = a;
    }
    //toString异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
