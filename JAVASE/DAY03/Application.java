package JAVASE.DAY03;

import JAVASE.DAY03.P4.Outer;

public class Application {
    public static void main(String[] args) {

        Outer outer = new Outer();

        //通过外部类实现内部类

        Outer.Inner inner = outer.new Inner();
        inner.getID();
    }
}
