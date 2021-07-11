package JAVASE.DAY05.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Dog{
    private String name;

    public Dog(String name) {
        this.name=name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class TestArraylist {
    public static void main(String[] args) {
        List dogs = new ArrayList<>();
        dogs.add(new Dog("小狗一号"));
        dogs.add(new Dog("小狗二号"));
        dogs.add(new Dog("小狗三号"));

        dogs.add(new Dog("小狗四号"));
        dogs.remove(0);

        System.out.println("总共有"+dogs.size()+"条狗狗");
        System.out.println("分别是");
        for (int i = 0; i <dogs.size() ; i++) {
            Dog dog = (Dog) dogs.get(i);
            System.out.println(dog.getName());

        }
    }
}
