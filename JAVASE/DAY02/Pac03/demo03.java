package JAVASE.DAY02.Pac03;

public class demo03 {
    public static void main(String[] args) {
        //1.声明一个数组
        int[] myList = null;
        //2.创建一个数组
        myList = new int[10];
        //3.向数组中存值
        myList[0] = 1 ;
        myList[1] = 2 ;
        myList[2] = 3 ;
        myList[3] = 4 ;
        myList[4] = 5 ;
        myList[5] = 6 ;
        myList[6] = 7 ;
        myList[7] = 8 ;
        myList[8] = 9 ;
        myList[9] = 10 ;
        //计算所有元素的和
        double total = 0;
        for (int i = 0; i <myList.length ; i++) {
            total+=myList[i];

        }
        System.out.println("总和为"+total);

    }
}
