package JAVASE.DAY02.Pac03;
//for-each 循环
//能够在不使用下标的情况下遍历数组
public class demo07 {
    public static void main(String[] args) {
       double[] myList = {1.9,2.9,3.4,3.5};

       //打印所有数组元素
        for (double element : myList){
            System.out.println(element);
        }
    }

}
