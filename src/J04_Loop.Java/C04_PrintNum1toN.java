package J04_Loop.Java;
import java.util.*;

public class C04_PrintNum1toN {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int range= sc.nextInt();
        int counter=1;

        while (counter<=range){
            System.out.println(counter);
            counter++;
        }
    }
}
