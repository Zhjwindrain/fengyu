package JAVASE.DAY03.P6;

public class Test {

    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        //快捷键ctrl+alt+t

        //假设要捕获多个异常，从小到大
        try { //try监控区域


            System.out.println(a / b);
        }catch (ArithmeticException e){ //catch捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable throwable){
            System.out.println("throwable");
        }
        finally { //处理善后工作
            System.out.println("finally");
        }
    }
}
