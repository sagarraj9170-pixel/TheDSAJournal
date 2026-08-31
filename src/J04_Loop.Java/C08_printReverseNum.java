package J04_Loop.Java;
import java.util.*;

public class C08_printReverseNum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=10899;

        while (n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n =n/10;

        }
        System.out.println();
    }
}
