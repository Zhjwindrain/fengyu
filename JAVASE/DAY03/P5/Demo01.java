package JAVASE.DAY03.P5;

public class Demo01 {
    public static void main(String[] args) {

        new Demo01().a();
    }

    public void a(){

        b();
    }

    public void b(){
        a();
    }
}
