package JAVASE.DAY02.Pac03;

public class demo09 {
    //数组作返回值
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for (int i=0,j=result.length-1;i<list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
}
