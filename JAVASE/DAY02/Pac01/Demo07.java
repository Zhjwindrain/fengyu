package JAVASE.DAY02.Pac01;
//for循环
//计算0-100奇数和偶数的和
public class Demo07 {
    public static void main(String[] args) {
        int oddsum=0;
        int evensum=0;
        for (int i = 0; i <=100 ; i++) {
            if(i%2!=0){
                oddsum+=i;

            }else {
                evensum += i;
            }

        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
