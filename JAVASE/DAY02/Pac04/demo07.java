package JAVASE.DAY02.Pac04;
//选择排序
public class demo07 {
    //选择排序是一种简单直观的排序算法。它的工作原理是每一次从待
    //排序的数据元素中选出最小（或最大）的一个元素，存放在序列的
    //起始位置，然后，再从剩余的未排序元素中继续寻找最小（大）元素
    //然后放到排序序列的末尾。

    public int[] sort(int arr[]){
        int temp = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            //认为目前的数就是最小的，记录最小数的下标
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j]){
                    //修改最小值的下标
                    minIndex = i;

                }

            }//当退出for就找到这次的最小值，就需要交换位置了
            if (i !=minIndex){
                temp = arr[i];
                arr[i] =  arr[minIndex];
                arr[minIndex]  =temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        demo07 demo07 = new demo07();
        int[] array={2,5,1,6,4,9,8,5,3,1,2,0};
        int[] sort = demo07.sort(array);
        for (int num : sort){
            System.out.println(num+"\t");
        }
    }
}
