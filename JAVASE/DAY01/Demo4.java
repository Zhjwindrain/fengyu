package JAVASE.DAY01;
//银行金融业务使用BigDecimal类
public class Demo4 {
    public static void main(String[] args) {
        float f=0.1f;
        double d=1.0/10;
        System.out.println(f==d);//false

        float d1=232323f;
        float d2=d1+1;
        if(d1==d2){
            System.out.println("d1==d2");
        }else{
            System.out.println("d1!=d2");

        }

    }
}
