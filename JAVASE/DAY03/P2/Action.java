package JAVASE.DAY03.P2;
//abstract 抽象类 类 extends 单继承 （接口可以多继承）
public abstract class Action {

    //约束~有人帮我们实现
    //abstract ,只有方法名字，没有方法的实现。
    public abstract void doSomething();

    //1.不能new抽象类，只能靠子类去实现它
    //2.抽象类中可以写普通方法
    //3.抽象方法必须在抽象类中
    //抽象的抽象


}
