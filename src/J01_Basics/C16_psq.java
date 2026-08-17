package J01_Basics;
import java.util.*;
public class C16_psq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen =sc.nextFloat();
        float pencil =sc.nextFloat();
        float eraser = sc.nextFloat();

        float total= pencil+pen+eraser;
        System.out.println("Bill is :"+total);

        float newtotal = total+(0.18f*total);
        System.out.println("Bill with 185:"+newtotal);
    }
}
