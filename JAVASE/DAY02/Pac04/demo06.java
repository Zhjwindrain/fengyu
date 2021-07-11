package JAVASE.DAY02.Pac04;

//冒泡排序
public class demo06 {
    //冒泡排序的原理
    //1.比较相邻的元素，如果第一个比第二个大，就交换他们两个。
    //2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，
    //在这一点，最后的元素应该会是最大的
    //3.针对所有的元素重复以上的步骤，除了最后一个。
    //4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一个数字需要比较。
    public int[] sort(int[] array){
        int temp = 0;
        //外层循环，它决定一共走几趟，-1为了防止溢出
        for (int i = 0; i <array.length -1; i++) {
            int flag = 0;//通过符号位可以减少无谓的比较，如果已经有序了，就退出循环
            //内层循环，它决定每趟走一次
            for (int j = 0; j <array.length -i-1; j++) {
                if(array[j+1]>array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0){
                break;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        demo06 demo06 = new demo06();
        int[] array = {2,5,1,6,4,9,8,5,3,1,2,0};
        int[] sort = demo06.sort(array);
        for (int num : sort){
            System.out.print(num+"\t");
        }


    }
}
